package com.genappline.gnusersservice.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("role")
data class Role(

    @Id
    val id: Long,
    val name: String
)