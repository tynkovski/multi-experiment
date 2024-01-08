import project.config

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.tynkovski.multi_experiment"
    compileSdk = config.compileSdk

    defaultConfig {
        applicationId = config.applicationId
        minSdk        = config.minSdk
        versionCode   = config.versionCode
        versionName   = config.versionName
        targetSdk     = config.targetSdk
        testInstrumentationRunner = config.testInstrumentationRunner

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    compileOptions {
        sourceCompatibility = config.javaVersion
        targetCompatibility = config.javaVersion
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = config.composeCompiler
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    kotlinOptions {
        jvmTarget = "18"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
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

    implementation(project(":feature"))
}