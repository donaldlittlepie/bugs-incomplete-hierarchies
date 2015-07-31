package com.wontondon.app.buckets.presentation.internal.di.components

import android.app.Activity
import com.wontondon.app.buckets.presentation.internal.di.PerActivity
import com.wontondon.app.buckets.presentation.internal.di.modules.ActivityModule
import dagger.Component

/**
 * A base component upon which fragment's components may depend.
 * Activity-level components should extend this component. Subtypes of [ActivityComponent] should be decorated with
 * annotation: [PerActivity]
 *
 * @author Donnie McNeal, Jr. (donnie.mcneal@gmail.com)
 */
PerActivity
Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ActivityModule::class))
public interface ActivityComponent {

    // Exposed to subgraphs????
    fun activity(): Activity
}
