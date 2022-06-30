package com.example.mydaggerdemo

import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

//@Module(subcomponents = [MainActivitySubcomponent::class])
@Module
abstract class MainActivityModule {
//    @Binds
//    @IntoMap
//    @ClassKey(MainActivity::class)
//    abstract fun bindAndroidInjectorFactory(factory: MainActivitySubcomponent.Factory): MainActivitySubcomponent.Factory

    @ContributesAndroidInjector
    abstract fun contributeMainActivityAndroidInjector(): MainActivity

    @ContributesAndroidInjector
    abstract fun contributeMainFragmentAndroidInjector(): MainFragment
}