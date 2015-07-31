package com.wontondon.app.buckets.presentation.internal.di

/**
 * Interface representing a contract for clients that contains a component for dependency injection.
 *
 * @author Donnie McNeal, Jr. (donnie.mcneal@gmail.com)
 */
public interface HasComponent<C> {
    fun getComponent(): C
}
