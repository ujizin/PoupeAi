package com.ujizin.poupeai.data.local.converter

import androidx.room.TypeConverter
import kotlinx.datetime.LocalDate

class LocalDateTypeConverter {

    @TypeConverter
    fun fromStringToLocalDate(value: String): LocalDate {
        return LocalDate.parse(value, LocalDate.Formats.ISO)
    }

    @TypeConverter
    fun fromLocalDateToString(localDate: LocalDate): String {
        return localDate.toString()
    }
}