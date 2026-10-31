package j7;

import l7.u;

/* JADX INFO: loaded from: classes4.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f20673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f20674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f20675c;

    f() {
        this(true, true, true);
    }

    boolean a() {
        return this.f20674b;
    }

    boolean b() {
        return this.f20675c;
    }

    boolean c() {
        return this.f20673a;
    }

    f(u uVar) {
        this(uVar.j0("followAdditionalWrappers", true), uVar.j0("allowMultipleAds", true), uVar.j0("fallbackOnNoAd", true));
    }

    private f(boolean z10, boolean z11, boolean z12) {
        this.f20673a = z10;
        this.f20674b = z11;
        this.f20675c = z12;
    }
}
