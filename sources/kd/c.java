package kd;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: MathJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class c extends b {
    public static int a(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static long b(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d10);
    }

    public static long c(float f10) {
        return b(f10);
    }
}
