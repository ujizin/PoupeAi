package com.ujizin.poupeai.common

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

fun <T, R> Flow<List<T>>.mapItem(
    block: suspend (T) -> R,
) = map { list -> list.map { item -> block(item) } }
