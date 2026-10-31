package l2;

import android.content.Context;

/* JADX INFO: compiled from: EventStoreModule_PackageNameFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements f2.b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vc.a<Context> f21674a;

    public h(vc.a<Context> aVar) {
        this.f21674a = aVar;
    }

    public static h a(vc.a<Context> aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) f2.d.d(f.b(context));
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f21674a.get());
    }
}
