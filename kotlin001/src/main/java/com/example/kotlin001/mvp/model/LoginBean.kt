package com.example.kotlin001.mvp.model

/**
 *Create by HanN on 2019/5/6
 *注释:
 */
data class LoginBean(
    val code: Int,
    val msg: String,
    val rows: Rows
)

data class Rows(
    val token: Token,
    val userId: String
)

data class Token(
    val accessToken: String,
    val expiresIn: Int,
    val tokenType: String
)