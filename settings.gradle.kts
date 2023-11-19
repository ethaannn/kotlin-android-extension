pluginManagement {
    repositories {
        maven { url = uri(path = "https://www.jitpack.io") }
        google()
        mavenCentral()
        gradlePluginPortal()

    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    this.repositories {
        maven { url = uri(path = "https://www.jitpack.io") }
        google()
        mavenCentral()
    }
}

rootProject.name = "kotlin-android-extension"
include(":app")
include(":kotlin-android-extensions")
