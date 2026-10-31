package io.bidmachine.analytics.internal.p;

import id.p;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.l;
import rd.f0;
import ud.b2;
import ud.k;
import ud.o0;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f17180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f17181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f17182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b2 f17183d;

    public interface a {
        b a();
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p.b$b, reason: collision with other inner class name */
    static final class C0298b extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f17185b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f17187d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0298b(String str, zc.f fVar) {
            super(2, fVar);
            this.f17187d = str;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((C0298b) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            C0298b c0298b = b.this.new C0298b(this.f17187d, fVar);
            c0298b.f17185b = obj;
            return c0298b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            BufferedReader bufferedReader;
            ad.d.f();
            if (this.f17184a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            f fVar = b.this.f17181b;
            b bVar = b.this;
            String str = this.f17187d;
            synchronized (fVar) {
                try {
                    r.a aVar = r.f27774b;
                    InputStream inputStreamA = bVar.f17181b.a(f0.K0(io.bidmachine.analytics.internal.E.e.b(str), new String[]{" "}, false, 0, 6, null));
                    g0 g0Var = null;
                    if (inputStreamA != null) {
                        Reader inputStreamReader = new InputStreamReader(inputStreamA, rd.d.f24999b);
                        bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                    } else {
                        bufferedReader = null;
                    }
                    if (bufferedReader != null) {
                        try {
                            bVar.a(str, fd.l.c(bufferedReader));
                            g0 g0Var2 = g0.f27756a;
                            fd.b.a(bufferedReader, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                fd.b.a(bufferedReader, th);
                                throw th2;
                            }
                        }
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                        g0Var = g0.f27756a;
                    }
                    r.c(g0Var);
                } catch (Throwable th3) {
                    r.a aVar2 = r.f27774b;
                    r.c(s.a(th3));
                }
            }
            return g0.f27756a;
        }
    }

    public b(e eVar, f fVar, o0 o0Var) {
        this.f17180a = eVar;
        this.f17181b = fVar;
        this.f17182c = o0Var;
    }

    private final boolean b() {
        b2 b2Var = this.f17183d;
        return b2Var != null && b2Var.c();
    }

    public final void a(String str) {
        b2 b2Var = this.f17183d;
        if (b2Var != null) {
            b2.a.a(b2Var, null, 1, null);
        }
        this.f17183d = k.d(this.f17182c, null, null, new C0298b(str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, qd.g gVar) {
        Iterator it = gVar.iterator();
        while (b() && it.hasNext()) {
            this.f17180a.a(str, (String) it.next());
        }
    }

    public final void a() {
        b2 b2Var = this.f17183d;
        if (b2Var != null) {
            b2.a.a(b2Var, null, 1, null);
        }
        this.f17183d = null;
        synchronized (this.f17181b) {
            try {
                r.a aVar = r.f27774b;
                this.f17181b.a();
                r.c(g0.f27756a);
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                r.c(s.a(th));
            }
        }
    }
}
