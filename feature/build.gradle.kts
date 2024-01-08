import plugins.LibGradlePlugin
import project.config

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

    implementation(project(":core:repository"))

}