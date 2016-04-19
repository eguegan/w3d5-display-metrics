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

        Log.d(TAG, "onCreate: " + isTablet());
        Log.d(TAG, "onCreate: " + getWidthInDp());
    }

    private boolean isTablet() {
        return getWidthInDp() > TABLET_SIZE;
    }

    private float getWidthInDp() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        return displayMetrics.widthPixels / displayMetrics.density;
    }
}
