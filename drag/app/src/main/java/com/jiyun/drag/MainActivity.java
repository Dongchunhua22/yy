package com.jiyun.drag;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MyButton mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        mBtn = (MyButton) findViewById(R.id.btn);
        mBtn.setOnClickListener(this);
        mBtn.setTranslationX(getSharedPreferences("name",MODE_PRIVATE).getInt("x",0));
        mBtn.setTranslationY(getSharedPreferences("name",MODE_PRIVATE).getInt("y",0));

    }

    @SuppressLint("CommitPrefEdits")
    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences name = getSharedPreferences("name", MODE_PRIVATE);
        SharedPreferences.Editor edit = name.edit();
        float lastx = mBtn.getX();
        float lasty = mBtn.getY();
        edit.putInt("x", (int) lastx);
        edit.putInt("y", (int) lasty);
        edit.commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                // TODO 20/06/23
                break;
            default:
                break;
        }
    }
}
