package com.vidya.digiretail.ui.main;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import com.vidya.digiretail.ui.detail.DetailsFragment;
import com.vidya.digiretail.ui.list.ListFragment;

@Module
public abstract class MainFragmentBindingModule {

    @ContributesAndroidInjector
    abstract ListFragment provideListFragment();

    @ContributesAndroidInjector
    abstract DetailsFragment provideDetailsFragment();
}
