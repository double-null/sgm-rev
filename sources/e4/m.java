package e4;

import android.util.Log;
import b4.y0;
import com.applovin.impl.sdk.i0;
import id.p;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.t;
import ud.o0;
import ud.p0;
import wc.g0;
import wc.s;

/* JADX INFO: compiled from: SettingsCache.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zc.j f14440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y0 f14441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0.k<h> f14442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference<h> f14443d;

    /* JADX INFO: compiled from: SettingsCache.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$1", f = "SettingsCache.kt", l = {73}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f14444h;

        /* JADX INFO: renamed from: e4.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SettingsCache.kt */
        /* synthetic */ class C0215a implements xd.d, kotlin.jvm.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AtomicReference<h> f14446a;

            C0215a(AtomicReference<h> atomicReference) {
                this.f14446a = atomicReference;
            }

            @Override // kotlin.jvm.internal.n
            public final wc.g<?> a() {
                return new kotlin.jvm.internal.a(2, this.f14446a, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            }

            @Override // xd.d
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object b(h hVar, zc.f<? super g0> fVar) {
                Object objO = a.o(this.f14446a, hVar, fVar);
                return objO == ad.d.f() ? objO : g0.f27756a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof xd.d) && (obj instanceof kotlin.jvm.internal.n)) {
                    return t.a(a(), ((kotlin.jvm.internal.n) obj).a());
                }
                return false;
            }

            public final int hashCode() {
                return a().hashCode();
            }
        }

        a(zc.f<? super a> fVar) {
            super(2, fVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object o(AtomicReference atomicReference, h hVar, zc.f fVar) {
            atomicReference.set(hVar);
            return g0.f27756a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return m.this.new a(fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f14444h;
            if (i10 == 0) {
                s.b(obj);
                xd.c data = m.this.f14442c.getData();
                C0215a c0215a = new C0215a(m.this.f14443d);
                this.f14444h = 1;
                if (data.a(c0215a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: SettingsCache.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$sessionConfigs$1", f = "SettingsCache.kt", l = {64}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<o0, zc.f<? super h>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f14447h;

        b(zc.f<? super b> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return m.this.new b(fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super h> fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f14447h;
            if (i10 == 0) {
                s.b(obj);
                xd.c data = m.this.f14442c.getData();
                this.f14447h = 1;
                obj = xd.e.k(data, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: SettingsCache.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCacheImpl", f = "SettingsCache.kt", l = {98}, m = "updateConfigs")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f14449h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f14451j;

        c(zc.f<? super c> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14449h = obj;
            this.f14451j |= Integer.MIN_VALUE;
            return m.this.a(null, this);
        }
    }

    /* JADX INFO: compiled from: SettingsCache.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<h, zc.f<? super h>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f14452h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ h f14453i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h hVar, zc.f<? super d> fVar) {
            super(2, fVar);
            this.f14453i = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return new d(this.f14453i, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h hVar, zc.f<? super h> fVar) {
            return ((d) create(hVar, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f14452h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return this.f14453i;
        }
    }

    public m(@w2.a zc.j backgroundDispatcher, y0 timeProvider, e0.k<h> sessionConfigsDataStore) {
        t.f(backgroundDispatcher, "backgroundDispatcher");
        t.f(timeProvider, "timeProvider");
        t.f(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.f14440a = backgroundDispatcher;
        this.f14441b = timeProvider;
        this.f14442c = sessionConfigsDataStore;
        this.f14443d = new AtomicReference<>();
        ud.k.d(p0.a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    private final h h() {
        if (this.f14443d.get() == null) {
            i0.a(this.f14443d, null, ud.j.b(null, new b(null), 1, null));
        }
        h hVar = this.f14443d.get();
        t.e(hVar, "get(...)");
        return hVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // e4.l
    public Object a(h hVar, zc.f<? super g0> fVar) throws Throwable {
        c cVar;
        if (fVar instanceof c) {
            cVar = (c) fVar;
            int i10 = cVar.f14451j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f14451j = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(fVar);
            }
        } else {
            cVar = new c(fVar);
        }
        Object obj = cVar.f14449h;
        Object objF = ad.d.f();
        int i11 = cVar.f14451j;
        try {
            if (i11 == 0) {
                s.b(obj);
                e0.k<h> kVar = this.f14442c;
                d dVar = new d(hVar, null);
                cVar.f14451j = 1;
                if (kVar.a(dVar, cVar) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
        } catch (IOException e10) {
            Log.w("FirebaseSessions", "Failed to update config values: " + e10);
        }
        return g0.f27756a;
    }

    @Override // e4.l
    public Double b() {
        return h().c();
    }

    @Override // e4.l
    public boolean c() {
        Long lB = h().b();
        Integer numA = h().a();
        return lB == null || numA == null || this.f14441b.a().a() - lB.longValue() >= ((long) numA.intValue());
    }

    @Override // e4.l
    public Boolean d() {
        return h().e();
    }

    @Override // e4.l
    public Integer e() {
        return h().d();
    }
}
