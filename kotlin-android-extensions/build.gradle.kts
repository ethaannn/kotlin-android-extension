
plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("maven-publish")
}
android {
    compileSdk =libs.versions.compileSdk.get().toInt()
    namespace = "io.github.uhsk.kit"
    defaultConfig {
        minSdk =libs.versions.minSdk.get().toInt()
        testInstrumentationRunner= "androidx.test.runner.AndroidJUnitRunner"

    }

    buildTypes {
        release {
            isMinifyEnabled= false
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
    compileOnly ( libs.androidx.core)
    compileOnly (libs.androidx.appcompat)
    compileOnly(libs.androidx.datastore.preferences)
    compileOnly(libs.androidx.datastore.preferences.core)
    compileOnly(libs.androidx.datastore.preferences.rxjava3)
    implementation (libs.common.io)
    implementation (libs.common.lang)
    testImplementation (libs.test.junit)
    androidTestImplementation (libs.test.android.ext)
    androidTestImplementation ( libs.test.android.espresso)
}

afterEvaluate {
    publishing{
        publications {
            create<MavenPublication>("release") {
                groupId = "com.github.ethann-tech"
                artifactId = "kotlin-android-extension"
                version = "1.0.0"
                from(components["release"])
            }

        }
    }
}
