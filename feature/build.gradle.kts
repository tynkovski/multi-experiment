import plugins.LibGradlePlugin
import project.config

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply<LibGradlePlugin>()

android {
    namespace = "com.tynkovski.feature"
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = config.composeCompiler
    }
}

dependencies {

    implementation(libs.ktx)
    implementation(libs.lifecycle)
    implementation(platform(libs.compose.bom))

    implementation(libs.bundles.compose)

    testImplementation(libs.junit)

    androidTestImplementation(libs.junit.ext)
    androidTestImplementation(libs.espresso)

    // implementation(project(":core:repository"))
    implementation(projects.core.repository)
}