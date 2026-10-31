package b4;

import com.google.firebase.inject.Provider;

/* JADX INFO: compiled from: EventGDTLogger_Factory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements d4.b<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4.e<Provider<b2.i>> f3950a;

    private i(d4.e<Provider<b2.i>> eVar) {
        this.f3950a = eVar;
    }

    public static i a(d4.e<Provider<b2.i>> eVar) {
        return new i(eVar);
    }

    public static g c(Provider<b2.i> provider) {
        return new g(provider);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f3950a.get());
    }
}
