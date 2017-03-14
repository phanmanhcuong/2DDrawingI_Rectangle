package com.example.cuongphan.a2ddrawingi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by CuongPhan on 3/14/2017.
 */

public class DrawView extends View {

    public DrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int viewWidth = getWidth();
        int viewHeight = getHeight();
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        canvas.drawLine(0,0,viewWidth,0,paint);
        canvas.drawLine(viewWidth,0,viewHeight, viewWidth, paint);
        canvas.drawLine(viewWidth,viewHeight, 0, viewHeight, paint);
        canvas.drawLine(0, viewHeight, 0, 0, paint);
        canvas.drawLine(viewWidth/2, 0, viewWidth/2, viewHeight, paint);
        canvas.drawLine(0, viewHeight/2, viewWidth, viewHeight/2, paint);
        canvas.drawLine(0, 0, viewWidth, viewHeight, paint);
        canvas.drawLine(viewWidth, 0, 0, viewHeight, paint);

    }
}
