package project

object libs {
    const val ktx       = "androidx.core:core-ktx:${versions.ktx}"
    const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${versions.lifecycle_runtime}"

    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${versions.coroutines}"

    const val compose_activity           = "androidx.activity:activity-compose:${versions.compose_activity}"
    const val compose_bom                = "androidx.compose:compose-bom:${versions.compose_bom}"
    const val compose_ui                 = "androidx.compose.ui:ui"
    const val compose_ui_tooling         = "androidx.compose.ui:ui-tooling"
    const val compose_ui_graphics        = "androidx.compose.ui:ui-graphics"
    const val compose_ui_tooling_preview = "androidx.compose.ui:ui-tooling-preview"
    const val compose_ui_test_junit4     = "androidx.compose.ui:ui-test-junit4"
    const val compose_ui_test_manifest   = "androidx.compose.ui:ui-test-manifest"
    const val compose_ui_material3       = "androidx.compose.material3:material3"

    const val junit     = "junit:junit:${versions.junit}"
    const val junit_ext = "androidx.test.ext:junit:${versions.junit_ext}"

    const val espresso_core = "androidx.test.espresso:espresso-core:${versions.espresso}"

    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${versions.kotlin}"
    const val gradle               = "com.android.tools.build:gradle:${versions.gradle}"
}
