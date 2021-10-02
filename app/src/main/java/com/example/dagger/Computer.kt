package com.example.dagger

import android.util.Log

class RAM {

    override fun toString(): String {
        return "2*kingstonX4"
    }
}

class Processor {

    override fun toString(): String {
        return "Intel Pentium"
    }
}
class Motherboard {
    override fun toString(): String {
        return "Simple notebook motherboard"
    }
}

data class Computer constructor(
    val ram:RAM,
    val motherBoard:Motherboard,
    val processor:Processor
)



