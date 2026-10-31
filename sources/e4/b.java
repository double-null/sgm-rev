package e4;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: LocalOverrideSettings.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f14388b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f14389a;

    /* JADX INFO: compiled from: LocalOverrideSettings.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public b(Context appContext) {
        t.f(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f14389a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // e4.o
    public Boolean a() {
        if (this.f14389a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f14389a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // e4.o
    public sd.a b() {
        if (this.f14389a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return sd.a.e(sd.c.s(this.f14389a.getInt("firebase_sessions_sessions_restart_timeout"), sd.d.SECONDS));
        }
        return null;
    }

    @Override // e4.o
    public Object c(zc.f<? super g0> fVar) {
        return o.a.a(this, fVar);
    }

    @Override // e4.o
    public Double d() {
        if (this.f14389a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f14389a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
