package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: RoundRectDrawableWithShadow.java */
/* JADX INFO: loaded from: classes.dex */
class e extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f1598a = Math.cos(Math.toRadians(45.0d));

    static float a(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) f10) + ((1.0d - f1598a) * ((double) f11))) : f10;
    }

    static float b(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) (f10 * 1.5f)) + ((1.0d - f1598a) * ((double) f11))) : f10 * 1.5f;
    }
}
