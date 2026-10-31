package androidx.datastore.preferences.protobuf;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionRegistryLite.java */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile n f2224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final n f2225c = new n(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<a, w.e<?, ?>> f2226a;

    /* JADX INFO: compiled from: ExtensionRegistryLite.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f2227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f2228b;

        a(Object obj, int i10) {
            this.f2227a = obj;
            this.f2228b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2227a == aVar.f2227a && this.f2228b == aVar.f2228b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f2227a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f2228b;
        }
    }

    n() {
        this.f2226a = new HashMap();
    }

    public static n b() {
        if (a1.f2102d) {
            return f2225c;
        }
        n nVarA = f2224b;
        if (nVarA == null) {
            synchronized (n.class) {
                nVarA = f2224b;
                if (nVarA == null) {
                    nVarA = m.a();
                    f2224b = nVarA;
                }
            }
        }
        return nVarA;
    }

    public <ContainingType extends p0> w.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (w.e) this.f2226a.get(new a(containingtype, i10));
    }

    n(boolean z10) {
        this.f2226a = Collections.emptyMap();
    }
}
