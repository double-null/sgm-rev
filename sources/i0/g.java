package i0;

import java.util.Arrays;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: PreferencesFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final f a() {
        return new c(null, true, 1, null);
    }

    public static final c b(f.b<?>... pairs) {
        t.f(pairs, "pairs");
        c cVar = new c(null, false, 1, null);
        cVar.g((f.b[]) Arrays.copyOf(pairs, pairs.length));
        return cVar;
    }
}
