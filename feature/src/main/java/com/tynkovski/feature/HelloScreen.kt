package com.tynkovski.feature

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.tynkovski.repository.MessagesRepository
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

val repository = MessagesRepository()

@Composable
fun HelloScreen() {
    val snackState = remember { SnackbarHostState() }
    val coroutine = rememberCoroutineScope()
    val flow = repository.getMessages()
    var message by remember { mutableStateOf("Initial") }
    LaunchedEffect(flow) {
        flow.onEach { message = it }.collect()
    }

    Scaffold(
        snackbarHost = {
            SnackbarHost(hostState = snackState) {
                Snackbar(it)
            }
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = message)
            Button(
                modifier = Modifier.padding(padding),
                onClick = {
                    coroutine.launch {
                        snackState.showSnackbar("Hello")
                    }
                }
            ) {
                Text(
                    modifier = Modifier,
                    text = "Show Hello"
                )
            }
        }
    }
}