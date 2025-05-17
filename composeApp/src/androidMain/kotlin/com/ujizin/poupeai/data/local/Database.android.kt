package com.ujizin.poupeai.data.local

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

fun getDatabaseBuilder(context: Context): RoomDatabase.Builder<PoupeAiDatabase> {
    val appContext = context.applicationContext
    val dbFile = appContext.getDatabasePath("poupe_ai.db")
    return Room.databaseBuilder<PoupeAiDatabase>(
        context = appContext,
        name = dbFile.absolutePath
    )
}
