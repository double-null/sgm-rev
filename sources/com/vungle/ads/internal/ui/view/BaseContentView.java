package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.nativead.NativeVideoListener;
import kotlin.jvm.internal.t;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: BaseContentView.kt */
/* JADX INFO: loaded from: classes4.dex */
public class BaseContentView extends RelativeLayout {
    private ImageView imageView;
    private final NativeAdInternal internal;
    private NativeVideoListener nativeVideoListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentView(Context context, NativeAdInternal internal) {
        super(context);
        t.f(context, "context");
        t.f(internal, "internal");
        this.internal = internal;
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        addView(imageView);
    }

    public void destroy$vungle_ads_release() {
        removeAllViews();
        try {
            r.a aVar = r.f27774b;
            ImageView imageView = this.imageView;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            r.c(s.a(th));
        }
        ImageView imageView2 = this.imageView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
    }

    public final ImageView getImageView$vungle_ads_release() {
        return this.imageView;
    }

    public final NativeAdInternal getInternal() {
        return this.internal;
    }

    public final NativeVideoListener getNativeVideoListener() {
        return this.nativeVideoListener;
    }

    public void render(Context context) {
        t.f(context, "context");
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.internal.displayMainImage(this.imageView);
        requestLayout();
    }

    public final void setImageView$vungle_ads_release(ImageView imageView) {
        this.imageView = imageView;
    }

    public final void setNativeVideoListener(NativeVideoListener nativeVideoListener) {
        this.nativeVideoListener = nativeVideoListener;
    }
}
