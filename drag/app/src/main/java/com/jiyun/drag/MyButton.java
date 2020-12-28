package com.jiyun.drag;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

@SuppressLint("AppCompatCustomView")
public class MyButton extends Button {
    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private  float mDowX;
    private  float mDowY;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                mDowX = event.getX();
                mDowY = event.getY();
                Log.e("TAG",mDowX+"+++++++mDowX ++++++");
                break;
            case MotionEvent.ACTION_MOVE:
                float movex = event.getX();
                float movey = event.getY();
                float vx = movex - mDowX;
                float vy = movey - mDowY;

                float x = getX();
                float y = getY();

                setTranslationX(x+vx);
                setTranslationY(y+vy);
                break;
        }
        return true;
    }
}
