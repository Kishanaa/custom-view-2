We'll modify the CircleView so that the user can change its color by tapping on it.
How This Works
onTouchEvent(): Listens for touch gestures.
MotionEvent.ACTION_DOWN: Detects when the user touches the view.
paint.setColor(): Changes the circle's color randomly.
invalidate(): Tells Android to redraw the view.
