import ext.implementation
import plugins.LibGradlePlugin
import project.bundles
import project.versions

plugins {
    `android-library`
    `kotlin-android`
}

android {
    namespace = "com.tynkovski.feature"
    apply<LibGradlePlugin>()
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = versions.compose_compiler
    }
}

dependencies {
    bundles.ktx
    bundles.lifecycle
    bundles.test
    bundles.compose
    bundles.espresso

    implementation(project(":core:repository"))

}