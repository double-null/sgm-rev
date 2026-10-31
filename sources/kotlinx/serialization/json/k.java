package kotlinx.serialization.json;

import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import je.r0;
import ke.h1;
import ke.k1;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.l0;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final he.f f21605a = r0.a(WKirgUEJJ.RkwQuDypYIA, ge.a.C(l0.f21527a));

    public static final g0 a(Boolean bool) {
        return bool == null ? a0.INSTANCE : new w(bool, false, null, 4, null);
    }

    public static final g0 b(Number number) {
        return number == null ? a0.INSTANCE : new w(number, false, null, 4, null);
    }

    public static final g0 c(String str) {
        return str == null ? a0.INSTANCE : new w(str, true, null, 4, null);
    }

    private static final Void d(i iVar, String str) {
        throw new IllegalArgumentException("Element " + kotlin.jvm.internal.i0.b(iVar.getClass()) + " is not a " + str);
    }

    public static final Boolean e(g0 g0Var) {
        kotlin.jvm.internal.t.f(g0Var, "<this>");
        return k1.d(g0Var.a());
    }

    public static final String f(g0 g0Var) {
        kotlin.jvm.internal.t.f(g0Var, "<this>");
        if (g0Var instanceof a0) {
            return null;
        }
        return g0Var.a();
    }

    public static final double g(g0 g0Var) {
        kotlin.jvm.internal.t.f(g0Var, "<this>");
        return Double.parseDouble(g0Var.a());
    }

    public static final float h(g0 g0Var) {
        kotlin.jvm.internal.t.f(g0Var, "<this>");
        return Float.parseFloat(g0Var.a());
    }

    public static final int i(g0 g0Var) {
        kotlin.jvm.internal.t.f(g0Var, "<this>");
        try {
            long jM = new h1(g0Var.a()).m();
            boolean z10 = false;
            if (-2147483648L <= jM && jM <= 2147483647L) {
                z10 = true;
            }
            if (z10) {
                return (int) jM;
            }
            throw new NumberFormatException(g0Var.a() + " is not an Int");
        } catch (JsonDecodingException e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    public static final d0 j(i iVar) {
        kotlin.jvm.internal.t.f(iVar, "<this>");
        d0 d0Var = iVar instanceof d0 ? (d0) iVar : null;
        if (d0Var != null) {
            return d0Var;
        }
        d(iVar, "JsonObject");
        throw new KotlinNothingValueException();
    }

    public static final g0 k(i iVar) {
        kotlin.jvm.internal.t.f(iVar, "<this>");
        g0 g0Var = iVar instanceof g0 ? (g0) iVar : null;
        if (g0Var != null) {
            return g0Var;
        }
        d(iVar, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final he.f l() {
        return f21605a;
    }

    public static final long m(g0 g0Var) {
        kotlin.jvm.internal.t.f(g0Var, "<this>");
        try {
            return new h1(g0Var.a()).m();
        } catch (JsonDecodingException e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }
}
