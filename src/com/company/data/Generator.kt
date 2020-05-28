package com.company.data

import com.company.model.Property

fun getListOfProperty() = ArrayList<Property>().apply {
    add(Property("Квартира", 80, 4, address = "ул. Пушкина, 33", price = 30000))
    add(Property("Квартира", 156, 7, address = "ул. Президенсткая, 7а", price = 140000))
    add(Property("Квартира", 55, 2, address = "ул. Науки, 314", price = 21000))

    add(Property("Участок", address = "ул. Ягодная, 15", area = 900, price = 20000))
    add(Property("Участок", address = "ул. Молодежная, 87", area = 800, price = 7000))

    add(Property("Дом", address = "ул. Гагарина, 56", houseArea = 299, rooms = 9, area = 1300, price = 160000))
    add(Property("Дом", address = "ул. Вишневая, 56", houseArea = 84, rooms = 2, area = 1500, price = 115000))

    add(Property("Земля", area = 800, price = 6500))
    add(Property("Земля", area = 1500, price = 1000))

    add(Property("Гараж", address = "улю Пушкина, 64б"))
    add(Property("Гараж", address = "улю Науки, 11"))
}