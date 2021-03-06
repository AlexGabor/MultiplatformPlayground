object Versions {
    const val KOTLIN_VERSION = "1.4.21"
    const val COROUTINES_VERSION = "1.4.2-native-mt"
    private const val KTOR_VERSION = "1.5.0"
    private const val SERIALIZATION_VERSION = "1.0.1"
    private const val KOIN_VERSION = "3.0.0-alpha-4"
    private const val SQL_DELIGHT_VERSION = "1.4.4"
    private const val BEAGLE_VERSION = "2.0.5"

    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"

    object Common {
        private const val MOKO_RESOURCES_VERSION = "0.13.1"

        const val KOIN_GRADLE_PLUGIN = "org.koin:koin-gradle-plugin:$KOIN_VERSION"
        const val MOKO_RESOURCES_GRADLE_PLUGIN =
            "dev.icerock.moko:resources-generator:$MOKO_RESOURCES_VERSION"
        const val SQL_DELIGHT_GRADLE_PLUGIN =
            "com.squareup.sqldelight:gradle-plugin:$SQL_DELIGHT_VERSION"
        const val BUILD_KONFIG_GRADLE_PLUGIN =
            "com.codingfeline.buildkonfig:buildkonfig-gradle-plugin:0.7.0"

        const val KTOR_CLIENT_CORE = "io.ktor:ktor-client-core:$KTOR_VERSION"
        const val KTOR_CLIENT_JSON = "io.ktor:ktor-client-json:$KTOR_VERSION"
        const val KTOR_LOGGING = "io.ktor:ktor-client-logging:$KTOR_VERSION"
        const val KTOR_CLIENT_SERIALIZATION = "io.ktor:ktor-client-serialization:$KTOR_VERSION"
        const val COROUTINES_CORE =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:$COROUTINES_VERSION"

        const val SERIALIZATION =
            "org.jetbrains.kotlinx:kotlinx-serialization-json:$SERIALIZATION_VERSION"
        const val BEAGLE_LOG = "com.github.pandulapeter.beagle:log:$BEAGLE_VERSION"
        const val BEAGLE_LOG_KTOR = "com.github.pandulapeter.beagle:log-ktor:$BEAGLE_VERSION"
        const val MOKO_RESOURCES = "dev.icerock.moko:resources:$MOKO_RESOURCES_VERSION"

        const val KOIN_CORE = "org.koin:koin-core:$KOIN_VERSION"
        const val KOIN_TEST = "org.koin:koin-test:$KOIN_VERSION"
    }

    object Jvm {
        private const val EXPOSED_VERSION = "0.28.1"
        const val KOTLIN_REFLECT = "org.jetbrains.kotlin:kotlin-reflect:$KOTLIN_VERSION"
        const val STANDARD_LIBRARY = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$KOTLIN_VERSION"
        const val SHADOW_JAR_VERSION = "6.1.0"

        const val SHADOW_GRADLE_PLUGIN =
            "com.github.jengelman.gradle.plugins:shadow:$SHADOW_JAR_VERSION"

        const val KTOR_AUTH = "io.ktor:ktor-auth:$KTOR_VERSION"
        const val KTOR_WEB_SOCKETS = "io.ktor:ktor-websockets:$KTOR_VERSION"
        const val KTOR_CLIENT_APACHE = "io.ktor:ktor-client-apache:$KTOR_VERSION"
        const val KTOR_SERVER_NETTY = "io.ktor:ktor-server-netty:$KTOR_VERSION"
        const val KTOR_SERIALIZATION = "io.ktor:ktor-serialization:$KTOR_VERSION"

        const val KOIN_KTOR = "org.koin:koin-ktor:$KOIN_VERSION"

        const val JETBRAINS_EXPOSED_CORE = "org.jetbrains.exposed:exposed-core:$EXPOSED_VERSION"
        const val JETBRAINS_EXPOSED_DAO = "org.jetbrains.exposed:exposed-dao:$EXPOSED_VERSION"
        const val JETBRAINS_EXPOSED_JDBC = "org.jetbrains.exposed:exposed-jdbc:$EXPOSED_VERSION"

        const val HIKARI_CONNECTION_POOL = "com.zaxxer:HikariCP:3.4.5"
        const val POSTGRESQL = "org.postgresql:postgresql:42.2.18"
        const val LOGBACK = "ch.qos.logback:logback-classic:1.2.3"

        const val AWS_JAVA_SDK = "com.amazonaws:aws-java-sdk:1.11.933"
    }

    object Android {
        const val SDK_VERSION = 29
        const val MINIMUM_SDK_VERSION = 23
        const val BUILD_TOOLS_VERSION = "29.0.2"
        const val COMPOSE_VERSION = "1.0.0-alpha10"
        private const val NAVIGATION_COMPOSE_VERSION = "1.0.0-alpha05"
        private const val ACCOMPANIST_COMPOSE_VERSION = "0.4.0"

        // region Compose
        const val COMPOSE_UI = "androidx.compose.ui:ui:$COMPOSE_VERSION"
        const val COMPOSE_TOOLING = "androidx.compose.ui:ui-tooling:$COMPOSE_VERSION"
        const val COMPOSE_FOUNDATION = "androidx.compose.foundation:foundation:$COMPOSE_VERSION"
        const val COMPOSE_MATERIAL_DESIGN = "androidx.compose.material:material:$COMPOSE_VERSION"
        const val COMPOSE_MD_ICONS_CORE =
            "androidx.compose.material:material-icons-core:$COMPOSE_VERSION"
        const val COMPOSE_MD_ICONS_EXTENDED =
            "androidx.compose.material:material-icons-extended:$COMPOSE_VERSION"
        const val COMPOSE_RUNTIME = "androidx.compose.runtime:runtime:$COMPOSE_VERSION"
        const val COMPOSE_THEME_ADAPTER =
            "com.google.android.materi" +
                    "al:compose-theme-adapter:$COMPOSE_VERSION"
        const val NAVIGATION_COMPOSE =
            "androidx.navigation:navigation-compose:$NAVIGATION_COMPOSE_VERSION"
        const val COIL_COMPOSE =
            "dev.chrisbanes.accompanist:accompanist-coil:$ACCOMPANIST_COMPOSE_VERSION"
        const val INSETS_COMPOSE =
            "dev.chrisbanes.accompanist:accompanist-insets:$ACCOMPANIST_COMPOSE_VERSION"

        // endregion
        const val STANDARD_LIBRARY = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$KOTLIN_VERSION"
        const val ACTIVITY = "androidx.activity:activity:1.2.0-beta02"
        const val KOTLIN_EXTENSIONS = "androidx.core:core-ktx:1.5.0-alpha03"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:1.1.3"
        const val MATERIAL_COMPONENTS = "com.google.android.material:material:1.2.0-alpha04"

        private const val LIFECYCLE_VERSION = "2.2.0"
        const val LIFECYCLE_EXTENSIONS =
            "androidx.lifecycle:lifecycle-extensions:$LIFECYCLE_VERSION"
        const val LIVE_DATA = "androidx.lifecycle:lifecycle-livedata-ktx:$LIFECYCLE_VERSION"
        const val VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:$LIFECYCLE_VERSION"

        const val KOIN_ANDROID_VIEWMODEL = "org.koin:koin-android-viewmodel:$KOIN_VERSION"

        const val KTOR_CLIENT = "io.ktor:ktor-client-android:$KTOR_VERSION"

        const val BEAGLE_DRAWER = "com.github.pandulapeter.beagle:ui-drawer:$BEAGLE_VERSION"
        const val BEAGLE_NOOP = "com.github.pandulapeter.beagle:noop:$BEAGLE_VERSION"

        const val SQL_DELIGHT_DRIVER = "com.squareup.sqldelight:android-driver:$SQL_DELIGHT_VERSION"

        // Tests
        const val COROUTINES_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.4.2"
        const val MOCKK = "io.mockk:mockk:1.10.3"
        const val TURBINE = "app.cash.turbine:turbine:0.3.0"
    }

    object iOS {
        const val KTOR_CLIENT = "io.ktor:ktor-client-ios:$KTOR_VERSION"
        const val SQL_DELIGHT_DRIVER = "com.squareup.sqldelight:native-driver:$SQL_DELIGHT_VERSION"
    }
}