package e4;

import android.content.Context;

/* JADX INFO: compiled from: LocalOverrideSettings_Factory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements d4.b<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4.e<Context> f14390a;

    private c(d4.e<Context> eVar) {
        this.f14390a = eVar;
    }

    public static c a(d4.e<Context> eVar) {
        return new c(eVar);
    }

    public static b c(Context context) {
        return new b(context);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f14390a.get());
    }
}
