package project

import ext.androidTestImplementation
import ext.debugImplementation
import ext.implementation
import ext.testImplementation
import org.gradle.api.artifacts.dsl.DependencyHandler

interface ProjectDependencies {
    val ktx       : Unit
    val coroutines : Unit
    val lifecycle : Unit
    val compose   : Unit
    val espresso  : Unit
    val gradle    : Unit
    val test      : Unit
}

val DependencyHandler.bundles get(): ProjectDependencies = object : ProjectDependencies {
    override val ktx get() = run {
        implementation(libs.ktx)
    }

    override val coroutines get() = run {
        implementation(libs.coroutines)
    }

    override val lifecycle get() = run {
        implementation(libs.lifecycle)
    }

    override val compose get() = run {
        implementation(libs.compose_activity)
        implementation(libs.compose_ui)
        implementation(libs.compose_ui_graphics)
        implementation(libs.compose_ui_tooling)
        implementation(libs.compose_ui_tooling_preview)
        implementation(libs.compose_ui_material3)
        implementation(platform(libs.compose_bom))
        debugImplementation(libs.compose_ui_test_manifest)
        androidTestImplementation(libs.compose_ui_test_junit4)
        androidTestImplementation(platform(libs.compose_bom))
    }

    override val espresso get() = run {
        androidTestImplementation(libs.espresso_core)
    }

    override val test get() = run {
         testImplementation(libs.junit)
         androidTestImplementation(libs.junit_ext)
    }

    override val gradle get() = run {
        implementation(libs.kotlin)
        implementation(libs.gradle)
    }
}
