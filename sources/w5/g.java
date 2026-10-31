package w5;

import android.text.TextUtils;
import o5.k;
import o5.o;

/* JADX INFO: loaded from: classes4.dex */
public class g {
    public static void a() {
        if (!n5.a.b()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(String str, int i10, String str2) {
        if (str.length() > i10) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void e(k kVar, o5.f fVar, o5.i iVar) {
        if (kVar == k.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (fVar == o5.f.DEFINED_BY_JAVASCRIPT && kVar == k.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (iVar == o5.i.DEFINED_BY_JAVASCRIPT && kVar == k.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public static void f(o oVar) {
        i(oVar);
        g(oVar);
    }

    public static void g(o oVar) {
        if (oVar.q()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void h(o oVar) {
        if (oVar.t()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    private static void i(o oVar) {
        if (!oVar.t()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    public static void j(o oVar) {
        if (!oVar.r()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static void k(o oVar) {
        if (!oVar.s()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    public static void l(o oVar) {
        if (oVar.l().w() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    public static void m(o oVar) {
        if (oVar.l().x() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }
}
