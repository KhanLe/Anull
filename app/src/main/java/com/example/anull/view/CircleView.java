package com.example.anull.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class CircleView extends View {
    public float X = 50;
    public float Y = 50;
    private int mColor=Color.BLUE;

    //创建画笔
    Paint paint = new Paint();

    public CircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void SetPaintColor(int color){
        mColor = color;
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(mColor);
        canvas.drawCircle(X,Y,30,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.X = event.getX();
        this.Y = event.getY();
        //通知组件进行重绘
        this.invalidate();
        return true;
    }
}
