package qe;

import wc.g0;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f24775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f24776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ id.a<g0> f24777g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, boolean z10, id.a<g0> aVar) {
        super(str, z10);
        this.f24775e = str;
        this.f24776f = z10;
        this.f24777g = aVar;
    }

    @Override // qe.a
    public long f() {
        this.f24777g.invoke();
        return -1L;
    }
}
