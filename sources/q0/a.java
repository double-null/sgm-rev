package q0;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.measurement.h;
import androidx.privacysandbox.ads.adservices.measurement.i;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.common.util.concurrent.ListenableFuture;
import com.vungle.ads.internal.protos.Sdk;
import id.p;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.t;
import ud.e1;
import ud.k;
import ud.o0;
import ud.p0;
import wc.g0;
import wc.s;

/* JADX INFO: compiled from: MeasurementManagerFutures.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f24364a = new b(null);

    /* JADX INFO: renamed from: q0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MeasurementManagerFutures.kt */
    private static final class C0396a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.privacysandbox.ads.adservices.measurement.b f24365b;

        /* JADX INFO: renamed from: q0.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend")
        static final class C0397a extends l implements p<o0, zc.f<? super g0>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f24366h;

            C0397a(androidx.privacysandbox.ads.adservices.measurement.a aVar, zc.f<? super C0397a> fVar) {
                super(2, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
                return C0396a.this.new C0397a(null, fVar);
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
                return ((C0397a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = ad.d.f();
                int i10 = this.f24366h;
                if (i10 == 0) {
                    s.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0396a.this.f24365b;
                    this.f24366h = 1;
                    if (bVar.a(null, this) == objF) {
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

        /* JADX INFO: renamed from: q0.a$a$b */
        /* JADX INFO: compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "invokeSuspend")
        static final class b extends l implements p<o0, zc.f<? super Integer>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f24368h;

            b(zc.f<? super b> fVar) {
                super(2, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
                return C0396a.this.new b(fVar);
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f<? super Integer> fVar) {
                return ((b) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = ad.d.f();
                int i10 = this.f24368h;
                if (i10 == 0) {
                    s.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0396a.this.f24365b;
                    this.f24368h = 1;
                    obj = bVar.b(this);
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

        /* JADX INFO: renamed from: q0.a$a$c */
        /* JADX INFO: compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {143}, m = "invokeSuspend")
        static final class c extends l implements p<o0, zc.f<? super g0>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f24370h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ Uri f24372j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ InputEvent f24373k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, zc.f<? super c> fVar) {
                super(2, fVar);
                this.f24372j = uri;
                this.f24373k = inputEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
                return C0396a.this.new c(this.f24372j, this.f24373k, fVar);
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
                return ((c) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = ad.d.f();
                int i10 = this.f24370h;
                if (i10 == 0) {
                    s.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0396a.this.f24365b;
                    Uri uri = this.f24372j;
                    InputEvent inputEvent = this.f24373k;
                    this.f24370h = 1;
                    if (bVar.c(uri, inputEvent, this) == objF) {
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

        /* JADX INFO: renamed from: q0.a$a$d */
        /* JADX INFO: compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$2", f = "MeasurementManagerFutures.kt", l = {154}, m = "invokeSuspend")
        static final class d extends l implements p<o0, zc.f<? super g0>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f24374h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ androidx.privacysandbox.ads.adservices.measurement.g f24376j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(androidx.privacysandbox.ads.adservices.measurement.g gVar, zc.f<? super d> fVar) {
                super(2, fVar);
                this.f24376j = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
                return C0396a.this.new d(this.f24376j, fVar);
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
                return ((d) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = ad.d.f();
                int i10 = this.f24374h;
                if (i10 == 0) {
                    s.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0396a.this.f24365b;
                    androidx.privacysandbox.ads.adservices.measurement.g gVar = this.f24376j;
                    this.f24374h = 1;
                    if (bVar.d(gVar, this) == objF) {
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

        /* JADX INFO: renamed from: q0.a$a$e */
        /* JADX INFO: compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {162}, m = "invokeSuspend")
        static final class e extends l implements p<o0, zc.f<? super g0>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f24377h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ Uri f24379j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(Uri uri, zc.f<? super e> fVar) {
                super(2, fVar);
                this.f24379j = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
                return C0396a.this.new e(this.f24379j, fVar);
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
                return ((e) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = ad.d.f();
                int i10 = this.f24377h;
                if (i10 == 0) {
                    s.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0396a.this.f24365b;
                    Uri uri = this.f24379j;
                    this.f24377h = 1;
                    if (bVar.e(uri, this) == objF) {
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

        /* JADX INFO: renamed from: q0.a$a$f */
        /* JADX INFO: compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {172}, m = "invokeSuspend")
        static final class f extends l implements p<o0, zc.f<? super g0>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f24380h;

            f(h hVar, zc.f<? super f> fVar) {
                super(2, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
                return C0396a.this.new f(null, fVar);
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
                return ((f) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = ad.d.f();
                int i10 = this.f24380h;
                if (i10 == 0) {
                    s.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0396a.this.f24365b;
                    this.f24380h = 1;
                    if (bVar.f(null, this) == objF) {
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

        /* JADX INFO: renamed from: q0.a$a$g */
        /* JADX INFO: compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {182}, m = "invokeSuspend")
        static final class g extends l implements p<o0, zc.f<? super g0>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f24382h;

            g(i iVar, zc.f<? super g> fVar) {
                super(2, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
                return C0396a.this.new g(null, fVar);
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
                return ((g) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = ad.d.f();
                int i10 = this.f24382h;
                if (i10 == 0) {
                    s.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0396a.this.f24365b;
                    this.f24382h = 1;
                    if (bVar.g(null, this) == objF) {
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

        public C0396a(androidx.privacysandbox.ads.adservices.measurement.b mMeasurementManager) {
            t.f(mMeasurementManager, "mMeasurementManager");
            this.f24365b = mMeasurementManager;
        }

        @Override // q0.a
        public ListenableFuture<Integer> b() {
            return p0.b.c(k.b(p0.a(e1.a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // q0.a
        public ListenableFuture<g0> c(Uri attributionSource, InputEvent inputEvent) {
            t.f(attributionSource, "attributionSource");
            return p0.b.c(k.b(p0.a(e1.a()), null, null, new c(attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        @Override // q0.a
        public ListenableFuture<g0> d(Uri trigger) {
            t.f(trigger, "trigger");
            return p0.b.c(k.b(p0.a(e1.a()), null, null, new e(trigger, null), 3, null), null, 1, null);
        }

        public ListenableFuture<g0> f(androidx.privacysandbox.ads.adservices.measurement.a deletionRequest) {
            t.f(deletionRequest, "deletionRequest");
            return p0.b.c(k.b(p0.a(e1.a()), null, null, new C0397a(deletionRequest, null), 3, null), null, 1, null);
        }

        public ListenableFuture<g0> g(androidx.privacysandbox.ads.adservices.measurement.g request) {
            t.f(request, "request");
            return p0.b.c(k.b(p0.a(e1.a()), null, null, new d(request, null), 3, null), null, 1, null);
        }

        public ListenableFuture<g0> h(h request) {
            t.f(request, "request");
            return p0.b.c(k.b(p0.a(e1.a()), null, null, new f(request, null), 3, null), null, 1, null);
        }

        public ListenableFuture<g0> i(i request) {
            t.f(request, "request");
            return p0.b.c(k.b(p0.a(e1.a()), null, null, new g(request, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: MeasurementManagerFutures.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final a a(Context context) {
            t.f(context, "context");
            androidx.privacysandbox.ads.adservices.measurement.b bVarA = androidx.privacysandbox.ads.adservices.measurement.b.f3003a.a(context);
            if (bVarA != null) {
                return new C0396a(bVarA);
            }
            return null;
        }
    }

    public static final a a(Context context) {
        return f24364a.a(context);
    }

    public abstract ListenableFuture<Integer> b();

    public abstract ListenableFuture<g0> c(Uri uri, InputEvent inputEvent);

    public abstract ListenableFuture<g0> d(Uri uri);
}
