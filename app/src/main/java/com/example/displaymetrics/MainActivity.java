package com.example.displaymetrics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";
    private static final float TABLET_SIZE = 600;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d(TAG, "onCreateWidthIn: " + getWidthIn());
        Log.d(TAG, "onCreateHeihgtIn: " + getHeightIn());


    }

    private float getWidthIn() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Log.d(TAG, "getWidthPixels: " + displayMetrics.widthPixels);
        Log.d(TAG, "getDensityDpi: " + displayMetrics.densityDpi);
        return displayMetrics.widthPixels / displayMetrics.densityDpi;
    }
    private float getHeightIn() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Log.d(TAG, "getWidthPixels: " + displayMetrics.heightPixels);
        Log.d(TAG, "getDensityDpi: " + displayMetrics.densityDpi);
        return displayMetrics.heightPixels / displayMetrics.densityDpi;
    }
}
