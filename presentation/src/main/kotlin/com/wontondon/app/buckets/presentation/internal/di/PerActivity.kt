package com.wontondon.app.buckets.presentation.internal.di

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy.RUNTIME
import javax.inject.Scope

/**
 * Activity scope annotation. Components scoped with this annotation should conform to the lifecycle of the activity.
 *
 * @author Donnie McNeal, Jr. (donnie.mcneal@gmail.com)
 */
Scope
Retention(RUNTIME)
public annotation class PerActivity
