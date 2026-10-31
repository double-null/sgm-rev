package io.bidmachine.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f20046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f20047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20048c;

    public interface b {
    }

    private final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f20049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f20050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f20051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f20052d;

        private c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f20049a = f10;
            this.f20050b = f11;
            this.f20051c = z10;
            if (this.f20052d) {
                return;
            }
            this.f20052d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20052d = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20048c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, fa.x.f14865a, 0, 0);
            try {
                this.f20048c = typedArrayObtainStyledAttributes.getInt(fa.x.f14867b, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f20046a = new c();
    }

    static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f20048c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f20047b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f20047b / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.f20046a.a(this.f20047b, f14, false);
            return;
        }
        int i12 = this.f20048c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f20047b;
                } else if (i12 == 4) {
                    if (f15 > 0.0f) {
                        f10 = this.f20047b;
                    } else {
                        f11 = this.f20047b;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f20047b;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f20047b;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f20047b;
            measuredWidth = (int) (f13 * f10);
        }
        this.f20046a.a(this.f20047b, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f20047b != f10) {
            this.f20047b = f10;
            requestLayout();
        }
    }

    public void setResizeMode(int i10) {
        if (this.f20048c != i10) {
            this.f20048c = i10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
    }
}
