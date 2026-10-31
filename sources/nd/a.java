package nd;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: PlatformThreadLocalRandom.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends md.a {
    @Override // md.a
    public Random h() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        t.e(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
