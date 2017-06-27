package com.lawyee.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView tv;
    @BindView(R.id.btn)
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.tv, R.id.btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv:
                break;
            case R.id.btn:
                Intent intent = new Intent();
                intent.setClass(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
                overridePendingTransition(R.animator.in_from_right,R.animator.out_to_left);
                break;
        }
    }
}
