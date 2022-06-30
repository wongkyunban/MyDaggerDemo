package com.example.mydaggerdemo

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class,AppModule::class,ToastMakerModule::class,MainActivityModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        // without @BindsInstance
//        fun appModule(appModule: AppModule):Builder

//         with @BindsInstance
        @BindsInstance
        fun provideContext(app: Application):Builder

        fun build():AppComponent

    }

//    fun inject(mainActivity: MainActivity)
    fun inject(app:StApplication)
}