package plugins

import com.android.build.gradle.LibraryExtension
import project.config
import org.gradle.api.Project

class LibGradlePlugin : GradlePlugin() {
    override fun applyPlugins(project: Project) = project.apply {
        // setup your plugins here
        // for example plugin("something")
    }

    override fun setConfig(project: Project) = project.android().apply {
        compileSdk = config.compileSdk

        defaultConfig {
            minSdk = config.minSdk
            testInstrumentationRunner = config.testInstrumentationRunner
        }

        compileOptions {
            sourceCompatibility = config.javaVersion
            targetCompatibility = config.javaVersion
        }
    }

    private fun Project.android(): LibraryExtension {
        return extensions.getByType(LibraryExtension::class.java)
    }
}