import plugins.LibGradlePlugin

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply<LibGradlePlugin>()

android {
    namespace = "com.tynkovski.repository"
}

dependencies {
    implementation(libs.ktx)
    implementation(libs.coroutines)
    testImplementation(libs.junit)
}