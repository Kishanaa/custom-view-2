package com.aurorasphere.customview2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.Random;

public class CircleView extends View {
    private Paint paint;
    private Random random;

//    constructor
    public CircleView(Context context){
        super(context);
        init();
    }
    public CircleView(Context context, AttributeSet attrs){
        super(context,attrs);
        init();
    }

    private void init(){
        paint=new Paint();
        paint.setColor(Color.BLUE);
        paint.setAntiAlias(true);
        random=new Random();
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        int width=getWidth();
        int height=getHeight();
        int radius=Math.min(width,height)/2;
        canvas.drawCircle(width/2,height/2,radius,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        if (event.getAction() == MotionEvent.ACTION_DOWN){
//            change color when touched
            paint.setColor(Color.rgb(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
            invalidate();   //redraw the view
            return true;
        }
        return super.onTouchEvent(event);
    }
}
