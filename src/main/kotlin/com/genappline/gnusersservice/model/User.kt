package com.genappline.gnusersservice.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("app_user")
data class User(

    @Id
    val id: Long,

    val login: String,

    val passwordHash: String,

    val avatarId: String
)