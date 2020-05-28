package com.company.model

fun Property.showInfo() {
    when (type) {
        "Квартира" -> println("Тип недвижимости: $type, адрес: $address площадь: $area, кол-во комнат: $rooms, цена: $price")
        "Участок" -> println("Тип недвижимости: $type, адрес: $address, площадь: $area, цена: $price")
        "Дом" -> println("Тип недвижимости: $type, адрес: $address, площадь дома: $houseArea, кол-во комнат: $rooms, площадь участка: $area, цена: $price")
        "Земля" -> println("Тип недвижимости: $type, площадь: $area, цена: $price")
        "Гараж" -> println("Тип недвижимости: $type, адрес: $address")
    }
}