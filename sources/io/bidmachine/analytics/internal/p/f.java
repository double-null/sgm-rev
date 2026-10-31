package io.bidmachine.analytics.internal.p;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.b0;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f17203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f17206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f17207e;

    public f() {
        r.a aVar = r.f27774b;
        this.f17203a = r.c(s.a(new NullPointerException()));
        this.f17204b = "amF2YS5sYW5nLlByb2Nlc3NCdWlsZGVy";
        this.f17205c = "c3RhcnQ=";
        this.f17206d = "Z2V0SW5wdXRTdHJlYW0=";
        this.f17207e = "ZGVzdHJveQ==";
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0064  */
    public final InputStream a(List list) {
        Object objC;
        Object objC2;
        Object objInvoke;
        try {
            r.a aVar = r.f27774b;
            Class<?> cls = Class.forName(io.bidmachine.analytics.internal.E.e.a(this.f17204b));
            objC = r.c(cls.getMethod(io.bidmachine.analytics.internal.E.e.a(this.f17205c), null).invoke(cls.getConstructor(List.class).newInstance(b0.p0(list)), null));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        this.f17203a = objC;
        if (!r.n(objC)) {
            objC2 = r.c(objC);
        } else if (objC != null) {
            try {
                Method method = objC.getClass().getMethod(io.bidmachine.analytics.internal.E.e.a(this.f17206d), null);
                if (method != null) {
                    objInvoke = method.invoke(objC, null);
                } else {
                    objInvoke = null;
                }
                objC2 = r.c((InputStream) objInvoke);
            } catch (Throwable th2) {
                r.a aVar3 = r.f27774b;
                objC = s.a(th2);
                objC2 = r.c(objC);
            }
        } else {
            objInvoke = null;
            objC2 = r.c((InputStream) objInvoke);
        }
        return (InputStream) (r.k(objC2) ? null : objC2);
    }

    public final void a() {
        Object objA = this.f17203a;
        if (r.n(objA)) {
            Object objInvoke = null;
            if (objA != null) {
                try {
                    Method method = objA.getClass().getMethod(io.bidmachine.analytics.internal.E.e.a(this.f17207e), null);
                    if (method != null) {
                        objInvoke = method.invoke(objA, null);
                    }
                } catch (Throwable th) {
                    r.a aVar = r.f27774b;
                    objA = s.a(th);
                }
            }
            r.c(objInvoke);
            return;
        }
        r.c(objA);
    }
}
