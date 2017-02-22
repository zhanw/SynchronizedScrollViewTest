package com.zhanw.synchronzidscrollviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private SynchronizedScrollView mScrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScrollView = (SynchronizedScrollView)findViewById(R.id.scroll);

        mScrollView.setAnchorView(findViewById(R.id.anchor));
        mScrollView.setSynchronizedView(findViewById(R.id.header));
    }
}
