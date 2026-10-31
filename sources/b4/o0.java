package b4;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;

/* JADX INFO: compiled from: SessionFirelogPublisherImpl_Factory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements d4.b<n0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4.e<FirebaseApp> f3995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d4.e<FirebaseInstallationsApi> f3996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d4.e<e4.j> f3997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d4.e<h> f3998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d4.e<zc.j> f3999e;

    private o0(d4.e<FirebaseApp> eVar, d4.e<FirebaseInstallationsApi> eVar2, d4.e<e4.j> eVar3, d4.e<h> eVar4, d4.e<zc.j> eVar5) {
        this.f3995a = eVar;
        this.f3996b = eVar2;
        this.f3997c = eVar3;
        this.f3998d = eVar4;
        this.f3999e = eVar5;
    }

    public static o0 a(d4.e<FirebaseApp> eVar, d4.e<FirebaseInstallationsApi> eVar2, d4.e<e4.j> eVar3, d4.e<h> eVar4, d4.e<zc.j> eVar5) {
        return new o0(eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static n0 c(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, e4.j jVar, h hVar, zc.j jVar2) {
        return new n0(firebaseApp, firebaseInstallationsApi, jVar, hVar, jVar2);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n0 get() {
        return c(this.f3995a.get(), this.f3996b.get(), this.f3997c.get(), this.f3998d.get(), this.f3999e.get());
    }
}
