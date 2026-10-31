package b4;

import com.google.firebase.FirebaseApp;

/* JADX INFO: compiled from: FirebaseSessions_Factory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class t implements d4.b<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4.e<FirebaseApp> f4014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d4.e<e4.j> f4015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d4.e<zc.j> f4016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d4.e<s0> f4017d;

    private t(d4.e<FirebaseApp> eVar, d4.e<e4.j> eVar2, d4.e<zc.j> eVar3, d4.e<s0> eVar4) {
        this.f4014a = eVar;
        this.f4015b = eVar2;
        this.f4016c = eVar3;
        this.f4017d = eVar4;
    }

    public static t a(d4.e<FirebaseApp> eVar, d4.e<e4.j> eVar2, d4.e<zc.j> eVar3, d4.e<s0> eVar4) {
        return new t(eVar, eVar2, eVar3, eVar4);
    }

    public static l c(FirebaseApp firebaseApp, e4.j jVar, zc.j jVar2, s0 s0Var) {
        return new l(firebaseApp, jVar, jVar2, s0Var);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f4014a.get(), this.f4015b.get(), this.f4016c.get(), this.f4017d.get());
    }
}
