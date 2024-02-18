package android.part2_chapter12

import android.content.Context
import android.util.AttributeSet
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import androidx.constraintlayout.motion.widget.MotionLayout

class ExoPlayerMotionLayout
@JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : MotionLayout(context, attributeSet, defStyleAttr) {

    var targetView: View? = null

    //터치가 일어날때 만들어지도록
    //1. 스크롤인지 판단 -> 스크롤이 맞다면
    private val gestureDetector by lazy {
        GestureDetector(context, object : GestureDetector.SimpleOnGestureListener() {
            override fun onScroll(
                e1: MotionEvent,
                e2: MotionEvent,
                distanceX: Float,
                distanceY: Float
            ): Boolean {
                return targetView?.containTouchArea(e1.x.toInt(), e1.y.toInt()) ?: false
            }

        })
    }

    //2. 스크롤 할때만 return true
    //3. 모션레이아웃이 터치 이벤트를 가져가도록
    override fun onInterceptTouchEvent(event: MotionEvent?): Boolean {
        event?.let {
            return gestureDetector.onTouchEvent(event)
        } ?: return false

    }

    private fun View.containTouchArea(x: Int, y: Int): Boolean {
        return (x in this.left..this.right && y in this.top..this.bottom)
    }
}