package com.wontondon.app.buckets.presentation.internal.di.modules

import android.content.Context
import com.wontondon.app.buckets.presentation.TestApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Dagger module that provides objects which will live during the application lifecycle
 *
 * @author Donnie McNeal, Jr. (donnie.mcneal@gmail.com)
 */
Module
public class ApplicationModule(private val application: TestApplication) {

    Provides Singleton fun provideApplicationContext(): Context = application

}
