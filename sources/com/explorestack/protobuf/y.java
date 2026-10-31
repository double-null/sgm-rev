package com.explorestack.protobuf;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionRegistryLite.java */
/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f10872b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f10873c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile y f10874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final y f10875e = new y(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<a, i0.d<?, ?>> f10876a;

    /* JADX INFO: compiled from: ExtensionRegistryLite.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f10877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f10878b;

        a(Object obj, int i10) {
            this.f10877a = obj;
            this.f10878b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10877a == aVar.f10877a && this.f10878b == aVar.f10878b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f10877a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f10878b;
        }
    }

    y() {
        this.f10876a = new HashMap();
    }

    public static y b() {
        y yVarA = f10874d;
        if (yVarA == null) {
            synchronized (y.class) {
                yVarA = f10874d;
                if (yVarA == null) {
                    yVarA = f10873c ? x.a() : f10875e;
                    f10874d = yVarA;
                }
            }
        }
        return yVarA;
    }

    public static boolean c() {
        return f10872b;
    }

    public <ContainingType extends MessageLite> i0.d<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (i0.d) this.f10876a.get(new a(containingtype, i10));
    }

    y(y yVar) {
        if (yVar == f10875e) {
            this.f10876a = Collections.emptyMap();
        } else {
            this.f10876a = Collections.unmodifiableMap(yVar.f10876a);
        }
    }

    y(boolean z10) {
        this.f10876a = Collections.emptyMap();
    }
}
