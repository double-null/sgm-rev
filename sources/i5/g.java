package i5;

import a5.j;
import a5.l;
import a5.p;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class g {
    public static void a() {
        if (!z4.a.b()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void b(l lVar, a5.f fVar, j jVar) {
        if (lVar == l.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (fVar == a5.f.DEFINED_BY_JAVASCRIPT && lVar == l.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (jVar == j.DEFINED_BY_JAVASCRIPT && lVar == l.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public static void c(p pVar) {
        i(pVar);
        g(pVar);
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void e(String str, int i10, String str2) {
        if (str.length() > i10) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void g(p pVar) {
        if (pVar.r()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void h(p pVar) {
        if (pVar.u()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    private static void i(p pVar) {
        if (!pVar.u()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    public static void j(p pVar) {
        if (!pVar.s()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static void k(p pVar) {
        if (!pVar.t()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    public static void l(p pVar) {
        if (pVar.m().x() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    public static void m(p pVar) {
        if (pVar.m().y() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }
}
