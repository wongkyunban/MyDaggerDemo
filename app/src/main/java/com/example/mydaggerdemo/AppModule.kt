package com.example.mydaggerdemo

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

// without @BindsInstance
//@Module
//class AppModule(val app: Application) {
//
//    @Provides
//    @Singleton
//    fun provideApplication(): Application = app
//
//    @Provides
//    @Singleton
//    fun provideSharedPreferences(app: Application): SharedPreferences = app.getSharedPreferences("Share", Context.MODE_PRIVATE)
//
//
//}

// with @BindsInstance
@Module
class AppModule {

    @Provides
    @Singleton
    fun provideSharedPreferences(app: Application): SharedPreferences = app.getSharedPreferences("Share", Context.MODE_PRIVATE)

}