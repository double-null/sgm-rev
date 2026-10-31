package md;

import java.util.Random;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends md.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f22261c = new a();

    /* JADX INFO: compiled from: PlatformRandom.kt */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // md.a
    public Random h() {
        Random random = this.f22261c.get();
        t.e(random, "get(...)");
        return random;
    }
}
