package x2;

import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import io.bidmachine.analytics.internal.s.bOI.CwEo;

/* JADX INFO: compiled from: Dependency.java */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o<?> f27970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27972c;

    private m(Class<?> cls, int i10, int i11) {
        this((o<?>) o.b(cls), i10, i11);
    }

    public static m a(Class<?> cls) {
        return new m(cls, 0, 2);
    }

    private static String b(int i10) {
        if (i10 == 0) {
            return DevicePublicKeyStringDef.DIRECT;
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    public static m h(Class<?> cls) {
        return new m(cls, 0, 1);
    }

    public static m i(Class<?> cls) {
        return new m(cls, 1, 0);
    }

    public static m j(o<?> oVar) {
        return new m(oVar, 1, 0);
    }

    public static m k(Class<?> cls) {
        return new m(cls, 1, 1);
    }

    public static m l(o<?> oVar) {
        return new m(oVar, 1, 1);
    }

    public static m m(Class<?> cls) {
        return new m(cls, 2, 0);
    }

    public o<?> c() {
        return this.f27970a;
    }

    public boolean d() {
        return this.f27972c == 2;
    }

    public boolean e() {
        return this.f27972c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f27970a.equals(mVar.f27970a) && this.f27971b == mVar.f27971b && this.f27972c == mVar.f27972c;
    }

    public boolean f() {
        return this.f27971b == 1;
    }

    public boolean g() {
        return this.f27971b == 2;
    }

    public int hashCode() {
        return ((((this.f27970a.hashCode() ^ 1000003) * 1000003) ^ this.f27971b) * 1000003) ^ this.f27972c;
    }

    private m(o<?> oVar, int i10, int i11) {
        this.f27970a = (o) n.c(oVar, "Null dependency anInterface.");
        this.f27971b = i10;
        this.f27972c = i11;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder(CwEo.mxjthG);
        sb2.append(this.f27970a);
        sb2.append(", type=");
        int i10 = this.f27971b;
        if (i10 == 1) {
            str = "required";
        } else {
            str = i10 == 0 ? wHzciBnJlYkdX.bjDQtAsfCf : "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        sb2.append(b(this.f27972c));
        sb2.append("}");
        return sb2.toString();
    }
}
