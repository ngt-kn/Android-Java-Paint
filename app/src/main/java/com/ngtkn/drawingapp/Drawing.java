package com.ngtkn.drawingapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Drawing extends View {
    private Paint brush;

    public Drawing(Context context) {
        super(context);
        init();
    }

//    public Drawing(Context context, @Nullable AttributeSet attrs) {
//        super(context, attrs);
//    }
//
//    public Drawing(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//    }
//
//    public Drawing(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }

    // initialize objects for this class
    public void init() {
        brush = new Paint(Paint.ANTI_ALIAS_FLAG);
        brush.setColor(Color.parseColor("green"));
    }

    // override onDraw to draw on canvas
    @Override
    protected void onDraw(Canvas canvas) {

        canvas.drawCircle(getMeasuredWidth()/2, getMeasuredHeight()/2, 24f, brush);
        // save on screen
        canvas.save();

        super.onDraw(canvas);
    }
}
