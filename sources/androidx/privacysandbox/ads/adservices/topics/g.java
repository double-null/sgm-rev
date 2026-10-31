package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TopicsManager.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3033a = new a(null);

    /* JADX INFO: compiled from: TopicsManager.kt */
    public static final class a {

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TopicsManager.kt */
        static final class C0060a extends u implements id.l<Context, h> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f3034d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0060a(Context context) {
                super(1);
                this.f3034d = context;
            }

            @Override // id.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h invoke(Context it) {
                t.f(it, "it");
                return new h(this.f3034d);
            }
        }

        /* JADX INFO: compiled from: TopicsManager.kt */
        static final class b extends u implements id.l<Context, i> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f3035d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context) {
                super(1);
                this.f3035d = context;
            }

            @Override // id.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final i invoke(Context it) {
                t.f(it, "it");
                return new i(this.f3035d);
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final g a(Context context) {
            t.f(context, "context");
            o0.a aVar = o0.a.f23000a;
            if (aVar.a() >= 11) {
                return new j(context);
            }
            if (aVar.a() >= 5) {
                return new l(context);
            }
            if (aVar.a() == 4) {
                return new k(context);
            }
            if (aVar.b() >= 11) {
                return (g) o0.b.f23003a.a(context, "TopicsManager", new C0060a(context));
            }
            if (aVar.b() >= 9) {
                return (g) o0.b.f23003a.a(context, "TopicsManager", new b(context));
            }
            return null;
        }
    }

    public abstract Object a(b bVar, zc.f<? super d> fVar);
}
