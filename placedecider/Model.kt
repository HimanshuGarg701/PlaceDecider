package com.example.placedecider

data class Hobby(var title: String)
    object Supplier {
        val activities = listOf(Hobby("China"),
                                Hobby("Russia"),
                                Hobby("Japan"),
                                Hobby("Singapore"),
                                Hobby("India"),
                                Hobby("Australia"),
                                Hobby("Bangladesh"),
                                Hobby("Sri Lanka")
        )
    }
