plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "in.campusreality.autobrowser"
    compileSdk = 35

    defaultConfig {
        applicationId = "in.campusreality.autobrowser"
        minSdk = 29
        targetSdk = 35
        versionCode = 2
        versionName = "1.1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.car.app:app:1.7.0")
    implementation("androidx.car.app:app-projected:1.7.0")
}
