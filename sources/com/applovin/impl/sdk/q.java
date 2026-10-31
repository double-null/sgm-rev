package com.applovin.impl.sdk;

import com.applovin.impl.a3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f8669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f8670b = new HashMap(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8671c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f8672d = Collections.synchronizedMap(new HashMap(5));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f8673e = Collections.synchronizedMap(new HashMap(5));

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f8676c;

        public a(String str, String str2, String str3) {
            this.f8674a = str;
            this.f8675b = str2;
            this.f8676c = str3;
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public String b() {
            return this.f8674a;
        }

        public String c() {
            return this.f8676c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String strB = b();
            String strB2 = aVar.b();
            if (strB != null ? !strB.equals(strB2) : strB2 != null) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            String strC = c();
            String strC2 = aVar.c();
            return strC != null ? strC.equals(strC2) : strC2 == null;
        }

        public int hashCode() {
            String strB = b();
            int iHashCode = strB == null ? 43 : strB.hashCode();
            String strA = a();
            int iHashCode2 = ((iHashCode + 59) * 59) + (strA == null ? 43 : strA.hashCode());
            String strC = c();
            return (iHashCode2 * 59) + (strC != null ? strC.hashCode() : 43);
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + b() + ", adapterName=" + a() + ", networkName=" + c() + ")";
        }

        public String a() {
            return this.f8675b;
        }
    }

    q(l lVar) {
        this.f8669a = lVar.Q();
    }

    public String a(String str) {
        return (String) this.f8673e.get(str);
    }

    public void b(a3 a3Var) {
        this.f8672d.put(a3Var.getAdUnitId(), a3Var.T());
    }

    public void c(a3 a3Var) {
        synchronized (this.f8671c) {
            if (p.a()) {
                this.f8669a.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + a3Var);
            }
            this.f8670b.put(a3Var.getAdUnitId(), new a(a3Var.C(), a3Var.c(), a3Var.getNetworkName()));
        }
        this.f8673e.put(a3Var.getAdUnitId(), a3Var.T());
    }

    public void a(a3 a3Var) {
        synchronized (this.f8671c) {
            String adUnitId = a3Var.getAdUnitId();
            a aVar = (a) this.f8670b.get(adUnitId);
            if (aVar == null) {
                if (p.a()) {
                    this.f8669a.a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                }
                return;
            }
            if (a3Var.C().equals(aVar.b())) {
                if (p.a()) {
                    this.f8669a.a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                }
                this.f8670b.remove(adUnitId);
            } else if (p.a()) {
                this.f8669a.a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + a3Var + " , since it could have already been updated with a new ad: " + aVar);
            }
        }
    }

    public String b(String str) {
        return (String) this.f8672d.get(str);
    }

    public a c(String str) {
        a aVar;
        synchronized (this.f8671c) {
            aVar = (a) this.f8670b.get(str);
        }
        return aVar;
    }
}
