package sd;

import java.text.DecimalFormat;

/* JADX INFO: compiled from: DurationJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f25412a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<DecimalFormat>[] f25413b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal<>();
        }
        f25413b = threadLocalArr;
    }

    public static final boolean a() {
        return f25412a;
    }
}
