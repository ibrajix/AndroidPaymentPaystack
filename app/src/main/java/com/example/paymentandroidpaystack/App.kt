package com.example.paymentandroidpaystack

import android.app.Application
import co.paystack.android.PaystackSdk

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        //Initialize Paystack
        PaystackSdk.initialize(applicationContext);

    }
}