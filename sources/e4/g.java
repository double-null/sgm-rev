package e4;

import b4.y0;
import com.google.firebase.installations.FirebaseInstallationsApi;

/* JADX INFO: compiled from: RemoteSettings_Factory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements d4.b<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4.e<y0> f14419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d4.e<FirebaseInstallationsApi> f14420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d4.e<b4.b> f14421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d4.e<a> f14422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d4.e<l> f14423e;

    private g(d4.e<y0> eVar, d4.e<FirebaseInstallationsApi> eVar2, d4.e<b4.b> eVar3, d4.e<a> eVar4, d4.e<l> eVar5) {
        this.f14419a = eVar;
        this.f14420b = eVar2;
        this.f14421c = eVar3;
        this.f14422d = eVar4;
        this.f14423e = eVar5;
    }

    public static g a(d4.e<y0> eVar, d4.e<FirebaseInstallationsApi> eVar2, d4.e<b4.b> eVar3, d4.e<a> eVar4, d4.e<l> eVar5) {
        return new g(eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static d c(y0 y0Var, FirebaseInstallationsApi firebaseInstallationsApi, b4.b bVar, a aVar, l lVar) {
        return new d(y0Var, firebaseInstallationsApi, bVar, aVar, lVar);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f14419a.get(), this.f14420b.get(), this.f14421c.get(), this.f14422d.get(), this.f14423e.get());
    }
}
