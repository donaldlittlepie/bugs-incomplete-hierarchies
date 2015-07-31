package com.wontondon.app.buckets.presentation.internal.di.modules

import android.app.Activity
import com.wontondon.app.buckets.presentation.internal.di.PerActivity
import dagger.Module
import dagger.Provides

/**
 * A module to wrap the Activity state and expose it to the graph.
 *
 * @author Donnie McNeal, Jr. (donnie.mcneal@gmail.com)
 */
Module
public class ActivityModule(private val activity: Activity) {

    Provides PerActivity fun activity(): Activity = activity
}
