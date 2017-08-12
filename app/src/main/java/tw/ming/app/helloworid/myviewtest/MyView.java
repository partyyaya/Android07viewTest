package tw.ming.app.helloworid.myviewtest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Mac on 2017/8/12.
 */

public class MyView extends View{

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.GREEN);
//        setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.i("ming","onClick");
//            }
//        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("ming","onTouch:"+event.getX()+"x"+event.getY()+"y");
        return true;//true部會觸發onclick會持續觸發ontouch,false只會觸發一次ontouch而已
        // super.onTouchEvent(event)會觸發onclick並會持續觸發ontouch;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setColor(Color.BLUE);
        p.setStrokeWidth(4);
        canvas.drawLine(0,0,200,200,p);

    }
}
