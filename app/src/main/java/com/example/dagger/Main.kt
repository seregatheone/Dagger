package com.example.dagger

fun main(){
    val appComponent:AppComponent = DaggerAppComponent.create()
    print(appComponent.computer)
}