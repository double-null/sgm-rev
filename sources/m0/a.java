package m0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: CreationExtras.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<b<?>, Object> f22038a = new LinkedHashMap();

    /* JADX INFO: renamed from: m0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CreationExtras.kt */
    public static final class C0361a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0361a f22039b = new C0361a();

        private C0361a() {
        }

        @Override // m0.a
        public <T> T a(b<T> key) {
            t.f(key, "key");
            return null;
        }
    }

    /* JADX INFO: compiled from: CreationExtras.kt */
    public interface b<T> {
    }

    public abstract <T> T a(b<T> bVar);

    public final Map<b<?>, Object> b() {
        return this.f22038a;
    }
}
