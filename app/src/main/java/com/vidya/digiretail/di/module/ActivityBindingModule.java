package com.vidya.digiretail.di.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import com.vidya.digiretail.ui.main.MainActivity;
import com.vidya.digiretail.ui.main.MainFragmentBindingModule;

@Module
public abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = {MainFragmentBindingModule.class})
    abstract MainActivity bindMainActivity();
}
