plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "ir.kjone.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "ir.kjone.app"
        minSdk = 21
        targetSdk = 28
        versionCode = 1
        versionName = "1.0.0"
    }
}
