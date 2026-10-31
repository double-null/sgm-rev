package l2;

import android.content.Context;

/* JADX INFO: compiled from: SchemaManager_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements f2.b<v0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vc.a<Context> f21727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vc.a<String> f21728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vc.a<Integer> f21729c;

    public w0(vc.a<Context> aVar, vc.a<String> aVar2, vc.a<Integer> aVar3) {
        this.f21727a = aVar;
        this.f21728b = aVar2;
        this.f21729c = aVar3;
    }

    public static w0 a(vc.a<Context> aVar, vc.a<String> aVar2, vc.a<Integer> aVar3) {
        return new w0(aVar, aVar2, aVar3);
    }

    public static v0 c(Context context, String str, int i10) {
        return new v0(context, str, i10);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v0 get() {
        return c(this.f21727a.get(), this.f21728b.get(), this.f21729c.get().intValue());
    }
}
