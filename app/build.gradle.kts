plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}


android {
    compileSdk = libs.versions.compileSdk.get().toInt()
    namespace = "io.github.uhsk.android.extension.app"
    defaultConfig {
        applicationId = "io.github.uhsk.android.extension.app"
        minSdk =libs.versions.minSdk.get().toInt()
        targetSdk =libs.versions.compileSdk.get().toInt()
        versionCode= 14
        versionName ="1.0.4"
    }

    buildFeatures {
        viewBinding=true
        dataBinding=true
    }

    buildTypes {
        release {
            isMinifyEnabled =false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro" )
        }
    }

    compileOptions {
        sourceCompatibility=JavaVersion.VERSION_17
        targetCompatibility=JavaVersion.VERSION_17
    }


    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation (libs.androidx.core)
    implementation (libs.androidx.appcompat)
    implementation (libs.androidx.material)
    implementation (project(mapOf("path" to ":kotlin-android-extensions")))
    implementation (libs.androidx.constraintlayout)
    implementation(libs.androidx.datastore.preferences)
    implementation(libs.androidx.datastore.preferences.core)
    implementation(libs.androidx.datastore.preferences.rxjava3)
}
