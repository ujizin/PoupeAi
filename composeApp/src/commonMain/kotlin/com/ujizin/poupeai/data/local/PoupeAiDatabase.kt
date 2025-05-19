package com.ujizin.poupeai.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.RoomDatabaseConstructor
import androidx.room.TypeConverters
import com.ujizin.poupeai.BuildKonfig.DATABASE_VERSION
import com.ujizin.poupeai.data.local.converter.LocalDateTypeConverter
import com.ujizin.poupeai.data.local.dao.ExpenseDao
import com.ujizin.poupeai.data.local.entities.ExpenseEntity

@Database(
    entities = [ExpenseEntity::class],
    version = DATABASE_VERSION,
)
@TypeConverters(
    LocalDateTypeConverter::class
)
abstract class PoupeAiDatabase : RoomDatabase() {
    abstract fun getExpenseDao(): ExpenseDao
}

@Suppress("NO_ACTUAL_FOR_EXPECT")
expect object PoupeAiDatabaseConstructor : RoomDatabaseConstructor<PoupeAiDatabase> {
    override fun initialize(): PoupeAiDatabase
}
