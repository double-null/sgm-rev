package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected float f6055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f6056b;

    public enum a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6062a;

        a(int i10) {
            this.f6062a = i10;
        }

        public int b() {
            return this.f6062a;
        }
    }

    protected e(Context context) {
        super(context);
        this.f6055a = 1.0f;
        this.f6056b = context;
    }

    public void a(int i10) {
        setViewScale(i10 / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.f6055a * 30.0f;
    }

    public abstract a getStyle();

    public void setViewScale(float f10) {
        this.f6055a = f10;
    }

    public static e a(a aVar, Context context) {
        if (aVar.equals(a.INVISIBLE)) {
            return new h(context);
        }
        if (aVar.equals(a.WHITE_ON_TRANSPARENT)) {
            return new i(context);
        }
        if (aVar.equals(a.TRANSPARENT_SKIP)) {
            return new j(context);
        }
        return new m(context);
    }
}
