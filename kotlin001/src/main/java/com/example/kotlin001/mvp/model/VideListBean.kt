package com.example.kotlin001.mvp.model

/**
 *Create by HanN on 2019/5/6
 *注释:
 */
data class VideListBean(
        val code: Int,
    val msg: String,
    val rows: RowX
)

data class RowX(
    val first: Int,
    val limit: Int,
    val offset: Int,
    val pageNumber: Int,
    val pageSize: Int,
    val rows: List<Row>,
    val total: Int,
    val totalPages: Int
)

data class Row(
    val coordX: Double,
    val coordY: Double,
    val createTime: String,
    val hasPtz: Int,
    val id: String,
    val lockId: Int,
    val name: String,
    val parentId: String,
    val status: Int,
    val type: Int
)