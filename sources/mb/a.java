package mb;

import android.content.Context;
import android.view.TextureView;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public class a extends TextureView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f22206a;

    public a(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f22206a <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        float f12 = this.f22206a;
        if ((f12 / (f10 / f11)) - 1.0f > 0.0f) {
            measuredHeight = (int) (f10 / f12);
        } else {
            measuredWidth = (int) (f11 * f12);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setVideoAspectRatio(float f10) {
        if (f10 == 0.0f || this.f22206a == f10) {
            return;
        }
        this.f22206a = f10;
        requestLayout();
    }
}
