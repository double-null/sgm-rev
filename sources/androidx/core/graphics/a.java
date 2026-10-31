package androidx.core.graphics;

import android.graphics.Color;

/* JADX INFO: compiled from: ColorUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<double[]> f1836a = new ThreadLocal<>();

    private static int a(int i10, int i11) {
        return 255 - (((255 - i11) * (255 - i10)) / 255);
    }

    public static int b(int i10, int i11) {
        int iAlpha = Color.alpha(i11);
        int iAlpha2 = Color.alpha(i10);
        int iA = a(iAlpha2, iAlpha);
        return Color.argb(iA, c(Color.red(i10), iAlpha2, Color.red(i11), iAlpha, iA), c(Color.green(i10), iAlpha2, Color.green(i11), iAlpha, iA), c(Color.blue(i10), iAlpha2, Color.blue(i11), iAlpha, iA));
    }

    private static int c(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((i10 * 255) * i11) + ((i12 * i13) * (255 - i11))) / (i14 * 255);
    }

    public static int d(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i10 & 16777215) | (i11 << 24);
    }
}
