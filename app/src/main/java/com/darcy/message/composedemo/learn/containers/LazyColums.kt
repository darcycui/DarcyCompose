package com.darcy.message.composedemo.learn.containers

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun HomeList() {
    // 创建可观察列表 当列表项改变时 触发UI重组
    val list = remember { mutableStateListOf<String>() }
    list.add("Darcy")
    list.add("Tom")
    list.add("Jerry")
    list.add("White Princess")
    list.add("Winne Bear")
    LazyColumn {
        items(list.size) { index ->
            Text(text = "Item ${list[index]}")
        }
    }
}