package com.vidya.digiretail.ui.main;

import android.os.Bundle;

import com.vidya.digiretail.R;
import com.vidya.digiretail.base.BaseActivity;
import com.vidya.digiretail.ui.list.ListFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected int layoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState == null)
            getSupportFragmentManager().beginTransaction().add(R.id.screenContainer, new ListFragment()).commit();
    }
}
