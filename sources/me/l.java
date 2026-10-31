package me;

import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: ConnectionSpec.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f22482e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final i[] f22483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final i[] f22484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f22485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f22486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f22487j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l f22488k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f22489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f22491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f22492d;

    /* JADX INFO: compiled from: ConnectionSpec.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f22493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f22494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f22495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f22496d;

        public a(boolean z10) {
            this.f22493a = z10;
        }

        public final l a() {
            return new l(this.f22493a, this.f22496d, this.f22494b, this.f22495c);
        }

        public final a b(String... cipherSuites) {
            kotlin.jvm.internal.t.f(cipherSuites, "cipherSuites");
            if (!d()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(cipherSuites.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            e((String[]) cipherSuites.clone());
            return this;
        }

        public final a c(i... cipherSuites) {
            kotlin.jvm.internal.t.f(cipherSuites, "cipherSuites");
            if (!d()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (i iVar : cipherSuites) {
                arrayList.add(iVar.c());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            return b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final boolean d() {
            return this.f22493a;
        }

        public final void e(String[] strArr) {
            this.f22494b = strArr;
        }

        public final void f(boolean z10) {
            this.f22496d = z10;
        }

        public final void g(String[] strArr) {
            this.f22495c = strArr;
        }

        public final a h(boolean z10) {
            if (!d()) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            f(z10);
            return this;
        }

        public final a j(e0... tlsVersions) {
            kotlin.jvm.internal.t.f(tlsVersions, "tlsVersions");
            if (!d()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (e0 e0Var : tlsVersions) {
                arrayList.add(e0Var.c());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            return i((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a i(String... strArr) {
            kotlin.jvm.internal.t.f(strArr, UyXgnuLGEkgnZE.jZgyhwEpE);
            if (!d()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            g((String[]) strArr.clone());
            return this;
        }

        public a(l connectionSpec) {
            kotlin.jvm.internal.t.f(connectionSpec, "connectionSpec");
            this.f22493a = connectionSpec.f();
            this.f22494b = connectionSpec.f22491c;
            this.f22495c = connectionSpec.f22492d;
            this.f22496d = connectionSpec.h();
        }
    }

    /* JADX INFO: compiled from: ConnectionSpec.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    static {
        i iVar = i.f22453o1;
        i iVar2 = i.f22456p1;
        i iVar3 = i.f22459q1;
        i iVar4 = i.f22411a1;
        i iVar5 = i.f22423e1;
        i iVar6 = i.f22414b1;
        i iVar7 = i.f22426f1;
        i iVar8 = i.f22444l1;
        i iVar9 = i.f22441k1;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f22483f = iVarArr;
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.L0, i.M0, i.f22437j0, i.f22440k0, i.H, i.L, i.f22442l};
        f22484g = iVarArr2;
        a aVarC = new a(true).c((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        e0 e0Var = e0.TLS_1_3;
        e0 e0Var2 = e0.TLS_1_2;
        f22485h = aVarC.j(e0Var, e0Var2).h(true).a();
        f22486i = new a(true).c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).j(e0Var, e0Var2).h(true).a();
        f22487j = new a(true).c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).j(e0Var, e0Var2, e0.TLS_1_1, e0.TLS_1_0).h(true).a();
        f22488k = new a(false).a();
    }

    public l(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f22489a = z10;
        this.f22490b = z11;
        this.f22491c = strArr;
        this.f22492d = strArr2;
    }

    private final l g(SSLSocket sSLSocket, boolean z10) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f22491c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            kotlin.jvm.internal.t.e(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = ne.d.E(enabledCipherSuites, this.f22491c, i.f22412b.c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f22492d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.t.e(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = ne.d.E(enabledProtocols, this.f22492d, yc.b.d());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.t.e(supportedCipherSuites, "supportedCipherSuites");
        int iX = ne.d.x(supportedCipherSuites, "TLS_FALLBACK_SCSV", i.f22412b.c());
        if (z10 && iX != -1) {
            kotlin.jvm.internal.t.e(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iX];
            kotlin.jvm.internal.t.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = ne.d.o(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        kotlin.jvm.internal.t.e(cipherSuitesIntersection, "cipherSuitesIntersection");
        a aVarB = aVar.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        kotlin.jvm.internal.t.e(tlsVersionsIntersection, "tlsVersionsIntersection");
        return aVarB.i((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).a();
    }

    public final void c(SSLSocket sslSocket, boolean z10) {
        kotlin.jvm.internal.t.f(sslSocket, "sslSocket");
        l lVarG = g(sslSocket, z10);
        if (lVarG.i() != null) {
            sslSocket.setEnabledProtocols(lVarG.f22492d);
        }
        if (lVarG.d() != null) {
            sslSocket.setEnabledCipherSuites(lVarG.f22491c);
        }
    }

    public final List<i> d() {
        String[] strArr = this.f22491c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i.f22412b.b(str));
        }
        return kotlin.collections.b0.p0(arrayList);
    }

    public final boolean e(SSLSocket socket) {
        kotlin.jvm.internal.t.f(socket, "socket");
        if (!this.f22489a) {
            return false;
        }
        String[] strArr = this.f22492d;
        if (strArr != null && !ne.d.u(strArr, socket.getEnabledProtocols(), yc.b.d())) {
            return false;
        }
        String[] strArr2 = this.f22491c;
        return strArr2 == null || ne.d.u(strArr2, socket.getEnabledCipherSuites(), i.f22412b.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f22489a;
        l lVar = (l) obj;
        if (z10 != lVar.f22489a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f22491c, lVar.f22491c) && Arrays.equals(this.f22492d, lVar.f22492d) && this.f22490b == lVar.f22490b);
    }

    public final boolean f() {
        return this.f22489a;
    }

    public final boolean h() {
        return this.f22490b;
    }

    public int hashCode() {
        if (!this.f22489a) {
            return 17;
        }
        String[] strArr = this.f22491c;
        int iHashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.f22492d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f22490b ? 1 : 0);
    }

    public final List<e0> i() {
        String[] strArr = this.f22492d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(e0.f22389b.a(str));
        }
        return kotlin.collections.b0.p0(arrayList);
    }

    public String toString() {
        if (!this.f22489a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(d(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(i(), "[all enabled]")) + ", supportsTlsExtensions=" + this.f22490b + ')';
    }
}
