package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.login.LoginActivity
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, SubComponent::class])
interface AppComponent {

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context: Context) : AppComponent
    }

    fun userManager() : UserManager

    fun loginComponent() : LoginComponent.Factory
    fun userComponent() : UserComponent.Factory
    fun registrationComponent() : RegistrationComponent.Factory
}