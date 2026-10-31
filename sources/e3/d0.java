package e3;

import c0.IbU.elEbP;

/* JADX INFO: compiled from: AutoValue_StaticSessionData.java */
/* JADX INFO: loaded from: classes4.dex */
final class d0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0.a f14168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0.c f14169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i0.b f14170c;

    d0(i0.a aVar, i0.c cVar, i0.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f14168a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f14169b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f14170c = bVar;
    }

    @Override // e3.i0
    public i0.a a() {
        return this.f14168a;
    }

    @Override // e3.i0
    public i0.b c() {
        return this.f14170c;
    }

    @Override // e3.i0
    public i0.c d() {
        return this.f14169b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f14168a.equals(i0Var.a()) && this.f14169b.equals(i0Var.d()) && this.f14170c.equals(i0Var.c());
    }

    public int hashCode() {
        return ((((this.f14168a.hashCode() ^ 1000003) * 1000003) ^ this.f14169b.hashCode()) * 1000003) ^ this.f14170c.hashCode();
    }

    public String toString() {
        return elEbP.dCnMm + this.f14168a + ", osData=" + this.f14169b + ", deviceData=" + this.f14170c + "}";
    }
}
