package com.lawyee.recyclerview;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main5Activity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tv)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        setTitle("测试赛");

    }

    private void settime() {
        AlarmManager manager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        long trigg = SystemClock.elapsedRealtime() + 1 * 1000;

        Intent intent = new Intent(this, Main4Activity.class);
        PendingIntent pendIntent = null;
        pendIntent = PendingIntent.getActivity(this, 1, intent, PendingIntent.FLAG_CANCEL_CURRENT);
        manager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, trigg, pendIntent);
    }

    @OnClick(R.id.toolbar)
    public void onToolbarClicked() {
    }

    @OnClick(R.id.tv)
    public void onTvClicked() {
        settime();
        finish();
    }
}
