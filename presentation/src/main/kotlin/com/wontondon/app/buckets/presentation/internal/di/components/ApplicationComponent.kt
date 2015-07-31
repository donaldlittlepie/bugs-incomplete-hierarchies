package com.wontondon.app.buckets.presentation.internal.di.components

import com.wontondon.app.buckets.presentation.internal.di.modules.ApplicationModule
import com.wontondon.app.buckets.presentation.view.activity.BaseActivity
import dagger.Component
import javax.inject.Singleton

/**
 * A component whose lifetime is the life of the application.
 */
Singleton
Component(modules = arrayOf(ApplicationModule::class))
public interface ApplicationComponent {
    fun inject(activity: BaseActivity)
}
