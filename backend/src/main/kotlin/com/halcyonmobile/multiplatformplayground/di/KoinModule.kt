package com.halcyonmobile.multiplatformplayground.di

import com.halcyonmobile.multiplatformplayground.storage.LocalSource
import com.halcyonmobile.multiplatformplayground.storage.LocalSourceImpl
import com.halcyonmobile.multiplatformplayground.storage.file.AmazonFileStorage
import com.halcyonmobile.multiplatformplayground.storage.file.FileStorage
import io.ktor.application.Application
import org.koin.dsl.module

internal fun Application.getKoinModule() = module {
    single<FileStorage> { AmazonFileStorage() }
    single<LocalSource> { LocalSourceImpl(get(), this@getKoinModule) }
}