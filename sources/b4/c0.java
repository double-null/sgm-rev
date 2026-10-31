package b4;

import android.content.Context;

/* JADX INFO: compiled from: ProcessDataManagerImpl_Factory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements d4.b<b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4.e<Context> f3922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d4.e<a1> f3923b;

    private c0(d4.e<Context> eVar, d4.e<a1> eVar2) {
        this.f3922a = eVar;
        this.f3923b = eVar2;
    }

    public static c0 a(d4.e<Context> eVar, d4.e<a1> eVar2) {
        return new c0(eVar, eVar2);
    }

    public static b0 c(Context context, a1 a1Var) {
        return new b0(context, a1Var);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b0 get() {
        return c(this.f3922a.get(), this.f3923b.get());
    }
}
