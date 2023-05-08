package com.example.datastore

import kotlinx.serialization.Serializable

@Serializable
data class UserSettings(
    val username: String? = null,
    val password: String? = null
)