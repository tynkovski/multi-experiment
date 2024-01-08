import plugins.LibGradlePlugin

plugins {
    `android-library`
    `kotlin-android`
}

android {
    namespace = "com.tynkovski.repository"
    apply<LibGradlePlugin>()
}

dependencies {
    implementation(libs.ktx)
    implementation(libs.coroutines)
    testImplementation(libs.junit)
}