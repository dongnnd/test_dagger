package com.example.android.dagger.di

import com.example.android.dagger.login.LoginActivity
import dagger.Component
import dagger.Subcomponent

@Subcomponent
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory{
        fun create() : LoginComponent
    }

    fun inject(activity: LoginActivity)
}