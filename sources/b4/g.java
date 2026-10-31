package b4;

import android.util.Log;
import com.google.firebase.inject.Provider;

/* JADX INFO: compiled from: EventGDTLogger.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3942b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<b2.i> f3943a;

    /* JADX INFO: compiled from: EventGDTLogger.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public g(Provider<b2.i> transportFactoryProvider) {
        kotlin.jvm.internal.t.f(transportFactoryProvider, "transportFactoryProvider");
        this.f3943a = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(k0 k0Var) {
        String strB = l0.f3972a.c().b(k0Var);
        kotlin.jvm.internal.t.e(strB, "encode(...)");
        Log.d("FirebaseSessions", "Session Event Type: " + k0Var.b().name());
        byte[] bytes = strB.getBytes(rd.d.f24999b);
        kotlin.jvm.internal.t.e(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // b4.h
    public void a(k0 sessionEvent) {
        kotlin.jvm.internal.t.f(sessionEvent, "sessionEvent");
        this.f3943a.get().a("FIREBASE_APPQUALITY_SESSION", k0.class, b2.b.b("json"), new b2.g() { // from class: b4.f
            @Override // b2.g
            public final Object apply(Object obj) {
                return this.f3941a.c((k0) obj);
            }
        }).b(b2.c.f(sessionEvent));
    }
}
