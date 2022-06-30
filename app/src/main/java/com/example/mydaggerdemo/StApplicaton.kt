package com.example.mydaggerdemo

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject


class StApplication:Application(),HasAndroidInjector {
    lateinit var appComponent: AppComponent

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any?> {
        return dispatchingAndroidInjector
    }

    override fun onCreate() {
        super.onCreate()
        // without @BindsInstance
//        appComponent = DaggerAppComponent
//            .builder()
//            .appModule(AppModule(this))
//            .build()

//        with @BindsInstance
        appComponent = DaggerAppComponent
            .builder()
            .provideContext(this)
            .build()

        appComponent.inject(this)
    }

}