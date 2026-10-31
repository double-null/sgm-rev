package e2;

import android.content.Context;

/* JADX INFO: compiled from: CreationContextFactory_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements f2.b<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vc.a<Context> f13943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vc.a<n2.a> f13944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vc.a<n2.a> f13945c;

    public j(vc.a<Context> aVar, vc.a<n2.a> aVar2, vc.a<n2.a> aVar3) {
        this.f13943a = aVar;
        this.f13944b = aVar2;
        this.f13945c = aVar3;
    }

    public static j a(vc.a<Context> aVar, vc.a<n2.a> aVar2, vc.a<n2.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, n2.a aVar, n2.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f13943a.get(), this.f13944b.get(), this.f13945c.get());
    }
}
