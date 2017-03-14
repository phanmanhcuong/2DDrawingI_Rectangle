package com.example.cuongphan.a2ddrawingi;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

public class DrawingLine extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_line);
        DrawView view = (DrawView) findViewById(R.id.drawing_view);
        view.setBackgroundColor(Color.YELLOW);

    }
}
