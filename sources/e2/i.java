package e2;

import android.content.Context;

/* JADX INFO: compiled from: CreationContextFactory.java */
/* JADX INFO: loaded from: classes3.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n2.a f13941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n2.a f13942c;

    i(Context context, n2.a aVar, n2.a aVar2) {
        this.f13940a = context;
        this.f13941b = aVar;
        this.f13942c = aVar2;
    }

    h a(String str) {
        return h.a(this.f13940a, this.f13941b, this.f13942c, str);
    }
}
