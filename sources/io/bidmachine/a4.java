package io.bidmachine;

import android.content.Context;
import io.bidmachine.protobuf.InitResponse;
import java.util.Objects;

/* JADX INFO: compiled from: InitialRequestLoader.java */
/* JADX INFO: loaded from: classes4.dex */
final class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f16498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final SessionManager.a f16499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    y3 f16500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f16501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    y3.c f16502g;

    /* JADX INFO: compiled from: InitialRequestLoader.java */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InitResponse f16503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f16504b;

        public b(InitResponse initResponse, String str) {
            this.f16503a = initResponse;
            this.f16504b = str;
        }

        public InitResponse a() {
            return this.f16503a;
        }

        public String b() {
            return this.f16504b;
        }
    }

    /* JADX INFO: compiled from: InitialRequestLoader.java */
    private class c implements y3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f16505a;

        public c(String str) {
            this.f16505a = str;
        }

        @Override // io.bidmachine.core.b.InterfaceC0315b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(oc.a aVar) {
            a4 a4Var = a4.this;
            final d dVar = a4Var.f16498c;
            Objects.requireNonNull(dVar);
            a4Var.g(new Executable() { // from class: io.bidmachine.b4
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    dVar.a((a4.b) obj);
                }
            });
        }

        @Override // io.bidmachine.core.b.InterfaceC0315b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InitResponse initResponse) {
            a4.this.d();
            if (initResponse == null) {
                return;
            }
            f2.R(a4.this.f16496a, initResponse, this.f16505a);
            a4.this.f16498c.b(new b(initResponse, this.f16505a));
        }
    }

    /* JADX INFO: compiled from: InitialRequestLoader.java */
    interface d {
        void a(b bVar);

        void b(b bVar);

        void c(b bVar);
    }

    /* JADX INFO: compiled from: InitialRequestLoader.java */
    private class e implements SessionManager.a {
        private e() {
        }

        @Override // io.bidmachine.SessionManager.a
        public void a(SessionManager.b bVar) {
            if (bVar != SessionManager.b.START) {
                return;
            }
            a4.this.e();
        }
    }

    a4(Context context, String str, d dVar) {
        e eVar = new e();
        this.f16499d = eVar;
        this.f16500e = null;
        this.f16501f = new Object();
        SessionManager sessionManager = SessionManager.get();
        this.f16496a = context;
        this.f16497b = str;
        this.f16498c = dVar;
        this.f16502g = new c(sessionManager.getSessionId());
        sessionManager.addObserver(eVar);
    }

    y3 c() {
        return new y3(this.f16496a, this.f16497b, UrlProvider.getInitUrlQueue());
    }

    void d() {
        synchronized (this.f16501f) {
            y3 y3Var = this.f16500e;
            if (y3Var == null) {
                return;
            }
            y3Var.q();
            this.f16500e = null;
        }
    }

    void e() {
        synchronized (this.f16501f) {
            d();
            y3 y3VarC = c();
            this.f16500e = y3VarC;
            y3VarC.t(this.f16502g);
            this.f16500e.s();
        }
    }

    void f() {
        final d dVar = this.f16498c;
        Objects.requireNonNull(dVar);
        g(new Executable() { // from class: io.bidmachine.z3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                dVar.c((a4.b) obj);
            }
        });
    }

    void g(Executable<b> executable) {
        InitResponse initResponseJ = f2.j(this.f16496a);
        String strK = f2.k(this.f16496a);
        if (initResponseJ != null) {
            executable.execute(new b(initResponseJ, strK));
        }
    }
}
