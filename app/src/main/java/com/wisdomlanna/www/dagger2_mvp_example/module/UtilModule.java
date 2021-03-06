package com.wisdomlanna.www.dagger2_mvp_example.module;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.wisdomlanna.www.dagger2_mvp_example.Utils;
import com.wisdomlanna.www.dagger2_mvp_example.manager.Calculator;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UtilModule {

    @Provides
    @Singleton
    SharedPreferences providesSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Provides
    @Singleton
    Utils provideUtils(Context context) {
        return new Utils(context);
    }

    @Provides
    @Singleton
    Calculator provideCalculator() {
        return new Calculator();
    }
}