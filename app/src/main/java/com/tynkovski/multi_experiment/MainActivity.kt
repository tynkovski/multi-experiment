package com.tynkovski.multi_experiment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.tynkovski.feature.HelloScreen
import com.tynkovski.multi_experiment.ui.theme.MultiexperimentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultiexperimentTheme {
                HelloScreen()
            }
        }
    }
}