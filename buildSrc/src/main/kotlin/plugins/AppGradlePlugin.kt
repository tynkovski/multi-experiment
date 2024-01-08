package plugins

import com.android.build.api.dsl.ApplicationExtension
import project.config
import org.gradle.api.Project

class AppGradlePlugin : GradlePlugin() {
    override fun applyPlugins(project: Project) {
        // Nothing to apply
    }

    override fun setConfig(project: Project) = project.android().apply {
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

    private fun Project.android(): ApplicationExtension {
        return extensions.getByType(ApplicationExtension::class.java)
    }
}