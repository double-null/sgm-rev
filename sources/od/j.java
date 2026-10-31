package od;

import kotlin.jvm.internal.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes5.dex */
public class j {
    public static final void a(boolean z10, Number step) {
        t.f(step, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    public static e<Float> b(float f10, float f11) {
        return new d(f10, f11);
    }
}
