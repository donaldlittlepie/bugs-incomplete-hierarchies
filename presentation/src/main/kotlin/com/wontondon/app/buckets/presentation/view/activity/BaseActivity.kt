package com.wontondon.app.buckets.presentation.view.activity

import android.os.Bundle
import android.support.v7.app.ActionBarActivity
import com.wontondon.app.buckets.presentation.TestApplication
import com.wontondon.app.buckets.presentation.internal.di.components.ApplicationComponent
import com.wontondon.app.buckets.presentation.internal.di.modules.ActivityModule

/**
 * @author Donnie McNeal, Jr. (donnie.mcneal@gmail.com)
 */
public abstract class BaseActivity : ActionBarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getApplicationComponent().inject(this)
    }

    /**
     * Get the main application component for dependency injection
     *
     * @return [ApplicationComponent]
     */
    fun getApplicationComponent(): ApplicationComponent {
        return (getApplication() as TestApplication).getApplicationComponent()
    }

    /**
     * Get activity module for dependency injection
     *
     * @return [ActivityModule]
     */
    fun getActivityModule(): ActivityModule = ActivityModule(this)
}