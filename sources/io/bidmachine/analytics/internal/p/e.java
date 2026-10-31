package io.bidmachine.analytics.internal.p;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f17199d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f17201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f17202c;

    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public e(int i10) {
        this.f17200a = i10;
        this.f17201b = new LinkedHashMap();
        this.f17202c = new Object();
    }

    public final InputStream a(String str) {
        Object objC;
        synchronized (this.f17202c) {
            try {
                r.a aVar = r.f27774b;
                g gVar = (g) this.f17201b.remove(str);
                objC = r.c(new ByteArrayInputStream(gVar != null ? h.a(gVar) : null));
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                objC = r.c(s.a(th));
            }
        }
        return (InputStream) (r.k(objC) ? null : objC);
    }

    public final String b(String str) {
        Object objC;
        Long lA;
        synchronized (this.f17202c) {
            try {
                r.a aVar = r.f27774b;
                g gVar = (g) this.f17201b.get(str);
                objC = r.c((gVar == null || (lA = gVar.a()) == null) ? null : lA.toString());
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                objC = r.c(s.a(th));
            }
        }
        return (String) (r.k(objC) ? null : objC);
    }

    public /* synthetic */ e(int i10, int i11, k kVar) {
        this((i11 & 1) != 0 ? 2097152 : i10);
    }

    public final void a(String str, String str2) {
        synchronized (this.f17202c) {
            try {
                r.a aVar = r.f27774b;
                Map map = this.f17201b;
                Object objA = map.get(str);
                if (objA == null) {
                    objA = a();
                    map.put(str, objA);
                }
                ((g) objA).a(str2);
                r.c(g0.f27756a);
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                r.c(s.a(th));
            }
        }
    }

    private final g a() {
        int i10 = this.f17200a;
        return new g(i10 / 2, i10);
    }
}
