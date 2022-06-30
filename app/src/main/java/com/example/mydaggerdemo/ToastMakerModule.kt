package com.example.mydaggerdemo

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ToastMakerModule {

    @Singleton
    @Provides
    fun provideToastMaker(app:Application):ToastMaker = ToastMaker(app)
}