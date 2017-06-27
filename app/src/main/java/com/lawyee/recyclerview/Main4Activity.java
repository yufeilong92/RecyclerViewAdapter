package com.lawyee.recyclerview;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main4Activity extends AppCompatActivity {


    @BindView(R.id.collapsingtoolbar)
    CollapsingToolbarLayout collapsingtoolbar;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.appbar)
    AppBarLayout appbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ButterKnife.bind(this);
         setSupportActionBar(toolbar);
        collapsingtoolbar.setTitle("ceee");
    }

}
