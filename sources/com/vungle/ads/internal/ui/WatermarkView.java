package com.vungle.ads.internal.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.widget.ImageView;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: WatermarkView.kt */
/* JADX INFO: loaded from: classes4.dex */
public class WatermarkView extends ImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatermarkView(Context context, String watermark) {
        super(context);
        t.f(context, "context");
        t.f(watermark, "watermark");
        byte[] overlayBytes = Base64.decode(watermark, 0);
        t.e(overlayBytes, "overlayBytes");
        Bitmap overlayBm = BitmapFactory.decodeByteArray(overlayBytes, 0, overlayBytes.length);
        t.e(overlayBm, "overlayBm");
        Resources resources = context.getResources();
        t.e(resources, "context.resources");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, overlayBm);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
        setBackground(bitmapDrawable);
        setClickable(false);
        setFocusable(false);
    }
}
