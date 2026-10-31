package e2;

import android.content.Context;

/* JADX INFO: compiled from: MetadataBackendRegistry_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements f2.b<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vc.a<Context> f13951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vc.a<i> f13952b;

    public l(vc.a<Context> aVar, vc.a<i> aVar2) {
        this.f13951a = aVar;
        this.f13952b = aVar2;
    }

    public static l a(vc.a<Context> aVar, vc.a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f13951a.get(), this.f13952b.get());
    }
}
