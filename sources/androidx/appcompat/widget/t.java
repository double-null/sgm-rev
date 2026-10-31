package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: compiled from: AppCompatSeekBar.java */
/* JADX INFO: loaded from: classes.dex */
public class t extends SeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f1419a;

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.H);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1419a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1419a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1419a.g(canvas);
    }

    public t(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        u uVar = new u(this);
        this.f1419a = uVar;
        uVar.c(attributeSet, i10);
    }
}
