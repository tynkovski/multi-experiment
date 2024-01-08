package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

abstract class GradlePlugin : Plugin<Project> {
    final override fun apply(project: Project) {
        applyPlugins(project)
        setConfig(project)
    }

    abstract fun applyPlugins(project: Project)
    abstract fun setConfig(project: Project): Any
}