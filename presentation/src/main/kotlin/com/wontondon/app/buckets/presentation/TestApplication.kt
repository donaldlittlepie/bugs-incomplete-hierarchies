package com.wontondon.app.buckets.presentation

import android.app.Application
import com.wontondon.app.buckets.presentation.internal.di.components.ApplicationComponent
import com.wontondon.app.buckets.presentation.internal.di.components.DaggerApplicationComponent
import com.wontondon.app.buckets.presentation.internal.di.modules.ApplicationModule

/**
 * Application main
 */
public class TestApplication : Application() {

    private var applicationComponent: ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()
        initializeInjector()
    }

    private fun initializeInjector() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build();
    }

    public fun getApplicationComponent(): ApplicationComponent = applicationComponent!!
}