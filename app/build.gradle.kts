import ext.implementation
import plugins.AppGradlePlugin
import project.bundles

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.tynkovski.multi_experiment"
    apply<AppGradlePlugin>()
}

dependencies {
    bundles.ktx
    bundles.lifecycle
    bundles.test
    bundles.compose
    bundles.espresso

    implementation(project(":feature"))
}