enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

    // todo note how could use this
    // plugins {
    //     id("com.android.application")
    //     id("org.jetbrains.kotlin.android")
    // }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "multi-experiment"

// app modules
include(":app")

// feature modules
include(":feature")

// core modules
include(":core:repository")
