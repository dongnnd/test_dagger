package com.example.android.dagger.di

import dagger.Component
import dagger.Module
import dagger.Subcomponent

@Module(subcomponents = [UserComponent::class, LoginComponent::class, RegistrationComponent::class])
interface SubComponent {
}