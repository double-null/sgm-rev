package l3;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import com.vungle.ads.internal.protos.Sdk;
import e0.k;
import h0.i;
import i0.f;
import i0.g;
import i0.j;
import id.p;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.t;
import pd.h;
import ud.o0;
import wc.g0;
import wc.s;
import xd.e;

/* JADX INFO: compiled from: JavaDataStorage.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ h<Object>[] f21736f = {i0.g(new c0(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadLocal<Boolean> f21739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ld.a f21740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k<f> f21741e;

    /* JADX INFO: compiled from: JavaDataStorage.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", f = "JavaDataStorage.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE}, m = "invokeSuspend")
    static final class a extends l implements p<o0, zc.f<? super f>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f21742h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ id.l<i0.c, g0> f21744j;

        /* JADX INFO: renamed from: l3.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: JavaDataStorage.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
        static final class C0351a extends l implements p<i0.c, zc.f<? super g0>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f21745h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            /* synthetic */ Object f21746i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ id.l<i0.c, g0> f21747j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0351a(id.l<? super i0.c, g0> lVar, zc.f<? super C0351a> fVar) {
                super(2, fVar);
                this.f21747j = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
                C0351a c0351a = new C0351a(this.f21747j, fVar);
                c0351a.f21746i = obj;
                return c0351a;
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i0.c cVar, zc.f<? super g0> fVar) {
                return ((C0351a) create(cVar, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f21745h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                this.f21747j.invoke((i0.c) this.f21746i);
                return g0.f27756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(id.l<? super i0.c, g0> lVar, zc.f<? super a> fVar) {
            super(2, fVar);
            this.f21744j = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return c.this.new a(this.f21744j, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super f> fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f21742h;
            try {
                if (i10 == 0) {
                    s.b(obj);
                    if (t.a(c.this.f21739c.get(), kotlin.coroutines.jvm.internal.b.a(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    c.this.f21739c.set(kotlin.coroutines.jvm.internal.b.a(true));
                    k kVar = c.this.f21741e;
                    C0351a c0351a = new C0351a(this.f21744j, null);
                    this.f21742h = 1;
                    obj = j.a(kVar, c0351a, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                f fVar = (f) obj;
                c.this.f21739c.set(kotlin.coroutines.jvm.internal.b.a(false));
                return fVar;
            } catch (Throwable th) {
                c.this.f21739c.set(kotlin.coroutines.jvm.internal.b.a(false));
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: JavaDataStorage.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", f = "JavaDataStorage.kt", l = {170}, m = "invokeSuspend")
    static final class b extends l implements p<o0, zc.f<? super Map<f.a<?>, ? extends Object>>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f21748h;

        b(zc.f<? super b> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return c.this.new b(fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super Map<f.a<?>, ? extends Object>> fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Map<f.a<?>, Object> mapA;
            Object objF = ad.d.f();
            int i10 = this.f21748h;
            if (i10 == 0) {
                s.b(obj);
                xd.c data = c.this.f21741e.getData();
                this.f21748h = 1;
                obj = e.l(data, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (mapA = fVar.a()) == null) ? kotlin.collections.o0.h() : mapA;
        }
    }

    public c(Context context, String name) {
        t.f(context, "context");
        t.f(name, "name");
        this.f21737a = context;
        this.f21738b = name;
        this.f21739c = new ThreadLocal<>();
        this.f21740d = h0.a.b(name, new f0.b(new id.l() { // from class: l3.a
            @Override // id.l
            public final Object invoke(Object obj) {
                return c.e(this.f21734a, (CorruptionException) obj);
            }
        }), new id.l() { // from class: l3.b
            @Override // id.l
            public final Object invoke(Object obj) {
                return c.f(this.f21735a, (Context) obj);
            }
        }, null, 8, null);
        this.f21741e = i(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f e(c cVar, CorruptionException ex) {
        t.f(ex, "ex");
        Log.w(i0.b(c.class).g(), "CorruptionException in " + cVar.f21738b + " DataStore running in process " + Process.myPid(), ex);
        return g.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(c cVar, Context it) {
        t.f(it, "it");
        return kotlin.collections.s.e(i.b(it, cVar.f21738b, null, 4, null));
    }

    private final k<f> i(Context context) {
        return (k) this.f21740d.a(context, f21736f[0]);
    }

    public final f g(id.l<? super i0.c, g0> transform) {
        t.f(transform, "transform");
        return (f) ud.j.b(null, new a(transform, null), 1, null);
    }

    public final Map<f.a<?>, Object> h() {
        return (Map) ud.j.b(null, new b(null), 1, null);
    }
}
