package j6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f20645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f20646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f20647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Bitmap f20648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Bitmap f20649e;

    public f(Context context, int i10) {
        super(context);
        this.f20647c = -16777216;
        this.f20645a = i10;
        int identifier = getResources().getIdentifier("unity_static_splash", "drawable", getContext().getPackageName());
        this.f20646b = identifier;
        if (identifier != 0) {
            forceLayout();
        }
        int identifier2 = getResources().getIdentifier("staticSplashScreenBackgroundColor", "color", getContext().getPackageName());
        if (identifier2 != 0) {
            this.f20647c = getResources().getColor(identifier2);
        }
        setBackgroundColor(this.f20647c);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f20648d;
        if (bitmap != null) {
            bitmap.recycle();
            this.f20648d = null;
        }
        Bitmap bitmap2 = this.f20649e;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.f20649e = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f20646b == 0) {
            return;
        }
        if (this.f20648d == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            this.f20648d = BitmapFactory.decodeResource(getResources(), this.f20646b, options);
        }
        int width = this.f20648d.getWidth();
        int height = this.f20648d.getHeight();
        int width2 = getWidth();
        int height2 = getHeight();
        if (width2 == 0 || height2 == 0) {
            return;
        }
        float f10 = width / height;
        float f11 = width2;
        float f12 = height2;
        boolean z11 = f11 / f12 <= f10;
        int iA = a.a(this.f20645a);
        if (iA == 0) {
            if (width2 < width) {
                height = (int) (f11 / f10);
                width = width2;
            }
            if (height2 < height) {
                width = (int) (f12 * f10);
                height = height2;
            }
        } else if (iA == 1 || iA == 2) {
            if ((this.f20645a == 3) ^ z11) {
                height = (int) (f11 / f10);
                width = width2;
            } else {
                width = (int) (f12 * f10);
                height = height2;
            }
        }
        Bitmap bitmap = this.f20649e;
        if (bitmap != null) {
            if (bitmap.getWidth() == width && this.f20649e.getHeight() == height) {
                return;
            }
            Bitmap bitmap2 = this.f20649e;
            if (bitmap2 != this.f20648d) {
                bitmap2.recycle();
                this.f20649e = null;
            }
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(this.f20648d, width, height, true);
        this.f20649e = bitmapCreateScaledBitmap;
        bitmapCreateScaledBitmap.setDensity(getResources().getDisplayMetrics().densityDpi);
        ColorDrawable colorDrawable = new ColorDrawable(this.f20647c);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), this.f20649e);
        bitmapDrawable.setGravity(17);
        setBackground(new LayerDrawable(new Drawable[]{colorDrawable, bitmapDrawable}));
    }
}
