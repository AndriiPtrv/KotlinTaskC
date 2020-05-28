package com.company

import com.company.data.getListOfProperty
import com.company.model.showInfo
import java.util.*

fun main(args: Array<String>) {
    val propertyList = getListOfProperty()
    val scanner = Scanner(System.`in`)

    println("Введите количество комнат: ")
    val inputRoomNumber = scanner.nextLine().toInt()

    val propertyWithInputRoom = propertyList.filter { it.rooms == inputRoomNumber }
    for (property in propertyWithInputRoom) {
        property.showInfo()
    }
    if (propertyWithInputRoom.isEmpty()) println("Нет недвижимостей с такими данными")

    println("Введите площадь участка в диапазоне")
    println("от: ")
    val inputMinArea = scanner.nextLine().toInt()
    println("до: ")
    val inputMaxArea = scanner.nextLine().toInt()

    val propertyMaxMinArea = propertyList.filter { it.area in inputMinArea..inputMaxArea }
    for (property in propertyMaxMinArea) {
        property.showInfo()
    }
    if (propertyMaxMinArea.isEmpty()) println("Нет недвижимостей с такими данными")

    println("Введите адрес: ")
    val inputAddress = scanner.nextLine()
    val propertyByAddress = propertyList.filter { it.address?.contains(inputAddress) ?: false}
    for (property in propertyByAddress) {
        property.showInfo()
    }
    if (propertyByAddress.isEmpty()) println("Нет недвижимостей с такими данными")
}