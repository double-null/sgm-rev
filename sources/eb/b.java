package eb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.t;
import pb.p;
import pb.r;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f14517a = new b();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14518a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.ColorHistogram.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.BrightnessVariance.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.EdgeDetection.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14518a = iArr;
        }
    }

    private b() {
    }

    public final eb.a a(p algorithmParams) {
        t.f(algorithmParams, "algorithmParams");
        int i10 = a.f14518a[algorithmParams.b().ordinal()];
        if (i10 == 1) {
            return new d(algorithmParams);
        }
        if (i10 == 2) {
            return new c(algorithmParams);
        }
        if (i10 == 3) {
            return new e(algorithmParams);
        }
        throw new NoWhenBranchMatchedException();
    }
}
