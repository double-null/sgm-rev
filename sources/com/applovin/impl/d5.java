package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f6349b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f6350c = new Object();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6351a;

        static {
            int[] iArr = new int[b.values().length];
            f6351a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6351a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6351a[b.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e5 f6356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f6357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f6358c;

        /* synthetic */ c(e5 e5Var, long j10, a aVar) {
            this(e5Var, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return SystemClock.elapsedRealtime() - this.f6358c > this.f6357b;
        }

        protected boolean a(Object obj) {
            return obj instanceof c;
        }

        public e5 c() {
            return this.f6356a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a((Object) this) || b() != cVar.b() || a() != cVar.a()) {
                return false;
            }
            e5 e5VarC = c();
            e5 e5VarC2 = cVar.c();
            return e5VarC != null ? e5VarC.equals(e5VarC2) : e5VarC2 == null;
        }

        public int hashCode() {
            long jB = b();
            long jA = a();
            e5 e5VarC = c();
            return ((((((int) (jB ^ (jB >>> 32))) + 59) * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (e5VarC == null ? 43 : e5VarC.hashCode());
        }

        public String toString() {
            return "SignalCacheManager.SignalWrapper(signal=" + c() + ", expirationTimeMillis=" + b() + ", cacheTimestampMillis=" + a() + ")";
        }

        private c(e5 e5Var, long j10) {
            this.f6356a = e5Var;
            this.f6357b = j10;
            this.f6358c = SystemClock.elapsedRealtime();
        }

        public long b() {
            return this.f6357b;
        }

        public long a() {
            return this.f6358c;
        }
    }

    public d5(com.applovin.impl.sdk.l lVar) {
        this.f6348a = lVar;
    }

    public void a(e5 e5Var, f5 f5Var, String str, MaxAdFormat maxAdFormat) {
        if (e5Var == null) {
            return;
        }
        long jV = f5Var.v();
        if (jV <= 0) {
            return;
        }
        this.f6348a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6348a.Q().a("SignalCacheManager", "Caching signal for: " + f5Var);
        }
        String strA = a(f5Var, str, maxAdFormat);
        c cVar = new c(e5Var, jV, null);
        synchronized (this.f6350c) {
            this.f6349b.put(strA, cVar);
        }
    }

    public e5 b(f5 f5Var, String str, MaxAdFormat maxAdFormat) {
        String strA = a(f5Var, str, maxAdFormat);
        synchronized (this.f6350c) {
            c cVar = (c) this.f6349b.get(strA);
            if (cVar == null) {
                return null;
            }
            if (cVar.d()) {
                this.f6349b.remove(strA);
                return null;
            }
            this.f6348a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6348a.Q().a("SignalCacheManager", "Returning cached signal for: " + f5Var);
            }
            return cVar.f6356a;
        }
    }

    private String a(f5 f5Var, String str, MaxAdFormat maxAdFormat) {
        String strC = f5Var.c();
        int i10 = a.f6351a[f5Var.t().ordinal()];
        if (i10 == 1) {
            return strC + "_" + maxAdFormat.getLabel();
        }
        if (i10 != 2) {
            return strC;
        }
        return strC + "_" + str;
    }
}
