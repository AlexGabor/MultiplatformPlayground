package com.halcyonmobile.multiplatformplayground.viewmodel

import com.halcyonmobile.multiplatformplayground.MR
import com.halcyonmobile.multiplatformplayground.model.Category
import com.halcyonmobile.multiplatformplayground.model.ui.CategoryTabUiModel
import com.halcyonmobile.multiplatformplayground.shared.CoroutineViewModel
import com.halcyonmobile.multiplatformplayground.shared.Result
import com.halcyonmobile.multiplatformplayground.usecase.FetchCategoriesUseCase
import com.halcyonmobile.multiplatformplayground.usecase.GetCategoriesUseCase
import kotlinx.coroutines.launch
import dev.icerock.moko.resources.desc.Resource
import dev.icerock.moko.resources.desc.StringDesc
import com.halcyonmobile.multiplatformplayground.model.ui.toCategoryTabUiModel
import kotlinx.coroutines.flow.*
import org.koin.core.KoinComponent
import org.koin.core.inject

class HomeViewModel : CoroutineViewModel(), KoinComponent {

    private val getCategories: GetCategoriesUseCase by inject()
    private val fetchCategories: FetchCategoriesUseCase by inject()

    private val _categories = MutableStateFlow(emptyList<Category>())
    private val selectedTabIndex = MutableStateFlow(0)
    val categoryTabs = _categories.combine(selectedTabIndex) { categories, selectedTabIndex ->
        categories.mapIndexed { index, category ->
            category.toCategoryTabUiModel(index == selectedTabIndex)
        }
    }
    val selectedCategory =
        categoryTabs.map { categoryTabs -> categoryTabs.firstOrNull { it.isSelected } }

    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?> = _error

    private val _isLoading = MutableStateFlow(true)
    val isLoading: StateFlow<Boolean> = _isLoading

    val title = StringDesc.Resource(MR.strings.home)

    init {
        coroutineScope.launch {
            _isLoading.value = true
            when (val result = getCategories()) {
                is Result.Success -> {
                    _categories.value = result.value
                }
                is Result.Error -> {
                    _error.value = result.exception.message
                }
            }
            _isLoading.value = false
        }
    }

    /**
     * Convenience method for iOS observing the [categoryTabs]
     */
    @Suppress("unused")
    fun observeCategories(onChange: (List<CategoryTabUiModel>) -> Unit) {
        categoryTabs.onEach {
            onChange(it)
        }.launchIn(coroutineScope)
    }

    fun fetch() = coroutineScope.launch {
        _isLoading.value = true
        when (val result = fetchCategories()) {
            is Result.Error -> _error.value = result.exception.message
        }
        _isLoading.value = false
    }

    fun onTabClicked(index: Int) {
        selectedTabIndex.value = index
    }
}