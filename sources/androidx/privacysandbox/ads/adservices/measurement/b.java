package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import id.l;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wc.g0;

/* JADX INFO: compiled from: MeasurementManager.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3003a = new a(null);

    /* JADX INFO: compiled from: MeasurementManager.kt */
    public static final class a {

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MeasurementManager.kt */
        static final class C0058a extends u implements l<Context, c> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f3004d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0058a(Context context) {
                super(1);
                this.f3004d = context;
            }

            @Override // id.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke(Context it) {
                t.f(it, "it");
                return new c(this.f3004d);
            }
        }

        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        public final b a(Context context) {
            t.f(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            o0.a aVar = o0.a.f23000a;
            sb2.append(aVar.a());
            Log.d("MeasurementManager", sb2.toString());
            if (aVar.a() >= 5) {
                return new d(context);
            }
            if (aVar.b() >= 9) {
                return (b) o0.b.f23003a.a(context, "MeasurementManager", new C0058a(context));
            }
            return null;
        }
    }

    public abstract Object a(androidx.privacysandbox.ads.adservices.measurement.a aVar, zc.f<? super g0> fVar);

    public abstract Object b(zc.f<? super Integer> fVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, zc.f<? super g0> fVar);

    public abstract Object d(g gVar, zc.f<? super g0> fVar);

    public abstract Object e(Uri uri, zc.f<? super g0> fVar);

    public abstract Object f(h hVar, zc.f<? super g0> fVar);

    public abstract Object g(i iVar, zc.f<? super g0> fVar);
}
