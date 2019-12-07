//package com.example.hackathon.myapplication.utils
//
//import android.content.Context
//import com.example.hackathon.myapplication.models.CityWeather
//import com.google.gson.Gson
//import com.google.gson.reflect.TypeToken
//import com.securepreferences.SecurePreferences
//
//
//object AppStorage {
//
//    private var prefs: SecurePreferences? = null
//
//    fun initialize(context: Context) {
//        prefs = SecurePreferences(context, "", "prefs.xml")
//        SecurePreferences.setLoggingEnabled(true)
//    }
//
//
//    var cities: List<CityWeather>?
//        get() {
//            val json = prefs?.getString("CITIES", null)
//            return if (json != null)
//                Gson().fromJson<List<CityWeather>>(json, object : TypeToken<List<CityWeather>>() {}.type)
//            else
//                null
//        }
//        set(value) {
//            val newValue = Gson().toJson(value, object : TypeToken<List<CityWeather>>() {}.type)
//            prefs?.edit()?.putString("CITIES", newValue.toString() )!!.apply()
//        }
//}