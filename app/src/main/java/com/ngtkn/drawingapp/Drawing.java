package com.ngtkn.drawingapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.lang.reflect.Array;

public class Drawing extends View {
    private Paint brush;
    private LinearGradient linearGradient;
    private RadialGradient radialGradient;
    private SweepGradient sweepGradient;
    private Bitmap bitmap;

    // params for sweepGradient
    float[] positions = {0.0f, 0.33f, 0.66f, 1.0f};
    int[] colors = {
            0xFFFFFF88, // yellow
            0xFF0088FF, // blue
            0xFF000000, // black
            0xFFFFFF88  // yellow
    };


    public Drawing(Context context) {
        super(context);
        init();
    }

    // initialize objects for this class
    public void init() {

        //instantiate gradients
        linearGradient = new LinearGradient(0, 0, 200, 200, Color.RED, Color.BLACK, Shader.TileMode.MIRROR);
        radialGradient = new RadialGradient(0, 0, 20, Color.GREEN, Color.BLUE, Shader.TileMode.REPEAT);

        sweepGradient = new SweepGradient(0, 0, colors, positions);
        // instantiate the brush
        brush = new Paint(Paint.ANTI_ALIAS_FLAG);
        brush.setColor(Color.parseColor("green"));
        brush.setShader(sweepGradient);

        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.profile);
    }

    // override onDraw to draw on canvas
    @Override
    protected void onDraw(Canvas canvas) {

//        canvas.drawCircle(getMeasuredWidth()/2, getMeasuredHeight()/2, 300f, brush);
//        canvas.drawLine(0,0,getMeasuredWidth()/2, getMeasuredHeight()/2, brush);
//        // save on screen
//        canvas.save();

        // Draw a bitmap
        canvas.drawBitmap(bitmap, (getMeasuredWidth()/2)-(bitmap.getWidth()/2),
                (getMeasuredHeight()/2)-(bitmap.getHeight()/2), null);

        canvas.save();
        super.onDraw(canvas);
    }
}
