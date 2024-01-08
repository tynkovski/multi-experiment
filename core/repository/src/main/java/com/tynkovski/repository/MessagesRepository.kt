package com.tynkovski.repository

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MessagesRepository {
    fun getMessages(): Flow<String> = flow {
        val messages = listOf("Hello", "World")
        for (i in 0..1000) {
            delay(1000L)
            emit(messages[i % 2])
        }
    }
}