package project

import org.gradle.api.JavaVersion

object config {
    const val composeCompiler = "1.5.7"
    const val compileSdk = 34
    const val minSdk = 33
    const val targetSdk = 34
    const val versionCode = 1
    const val versionName = "1.0"
    const val applicationId = "com.tynkovski.multi_experiment"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    val javaVersion = JavaVersion.VERSION_18
}