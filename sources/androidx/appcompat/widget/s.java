package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* JADX INFO: compiled from: AppCompatRatingBar.java */
/* JADX INFO: loaded from: classes.dex */
public class s extends RatingBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f1418a;

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.F);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmapB = this.f1418a.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }

    public s(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q qVar = new q(this);
        this.f1418a = qVar;
        qVar.c(attributeSet, i10);
    }
}
