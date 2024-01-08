import plugins.LibGradlePlugin
import project.bundles

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.tynkovski.repository"
    apply<LibGradlePlugin>()
}

dependencies {
    bundles.ktx
    bundles.test
    bundles.coroutines
}