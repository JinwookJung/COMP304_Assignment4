/* Android Programming Assignment_4
Student Name: Jinwook Jung
Student ID: 300801360

* */

package jinwook.jung;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;


public class CanvasView extends View{

    int color = Color.RED;
    Paint paint = new Paint();
    Rect myRect = new Rect();

    public CanvasView(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        myRect.set(0, 130, getWidth(), getHeight()/2);
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(myRect, paint);
    }

    public void changeColorGreen(){
        color  = Color.GREEN;
        invalidate();
    }
    public void changeColorRed(){
        color  = Color.RED;
        invalidate();
    }

}
