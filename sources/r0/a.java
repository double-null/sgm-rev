package r0;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.d;
import androidx.privacysandbox.ads.adservices.topics.g;
import com.google.common.util.concurrent.ListenableFuture;
import id.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.t;
import ud.e1;
import ud.k;
import ud.o0;
import ud.p0;
import wc.g0;
import wc.s;

/* JADX INFO: compiled from: TopicsManagerFutures.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f24860a = new b(null);

    /* JADX INFO: renamed from: r0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TopicsManagerFutures.kt */
    private static final class C0402a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f24861b;

        /* JADX INFO: renamed from: r0.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TopicsManagerFutures.kt */
        @f(c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1", f = "TopicsManagerFutures.kt", l = {55}, m = "invokeSuspend")
        static final class C0403a extends l implements p<o0, zc.f<? super d>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f24862h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.b f24864j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0403a(androidx.privacysandbox.ads.adservices.topics.b bVar, zc.f<? super C0403a> fVar) {
                super(2, fVar);
                this.f24864j = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
                return C0402a.this.new C0403a(this.f24864j, fVar);
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f<? super d> fVar) {
                return ((C0403a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = ad.d.f();
                int i10 = this.f24862h;
                if (i10 == 0) {
                    s.b(obj);
                    g gVar = C0402a.this.f24861b;
                    androidx.privacysandbox.ads.adservices.topics.b bVar = this.f24864j;
                    this.f24862h = 1;
                    obj = gVar.a(bVar, this);
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

        public C0402a(g mTopicsManager) {
            t.f(mTopicsManager, "mTopicsManager");
            this.f24861b = mTopicsManager;
        }

        @Override // r0.a
        public ListenableFuture<d> b(androidx.privacysandbox.ads.adservices.topics.b request) {
            t.f(request, "request");
            return p0.b.c(k.b(p0.a(e1.c()), null, null, new C0403a(request, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: TopicsManagerFutures.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final a a(Context context) {
            t.f(context, "context");
            g gVarA = g.f3033a.a(context);
            if (gVarA != null) {
                return new C0402a(gVarA);
            }
            return null;
        }
    }

    public static final a a(Context context) {
        return f24860a.a(context);
    }

    public abstract ListenableFuture<d> b(androidx.privacysandbox.ads.adservices.topics.b bVar);
}
