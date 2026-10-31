package b8;

/* JADX INFO: compiled from: DecoderReuseEvaluation.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u7.q f4146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u7.q f4147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4149e;

    public c(String str, u7.q qVar, u7.q qVar2, int i10, int i11) {
        x7.a.a(i10 == 0 || i11 == 0);
        this.f4145a = x7.a.d(str);
        this.f4146b = (u7.q) x7.a.e(qVar);
        this.f4147c = (u7.q) x7.a.e(qVar2);
        this.f4148d = i10;
        this.f4149e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4148d == cVar.f4148d && this.f4149e == cVar.f4149e && this.f4145a.equals(cVar.f4145a) && this.f4146b.equals(cVar.f4146b) && this.f4147c.equals(cVar.f4147c);
    }

    public int hashCode() {
        return ((((((((527 + this.f4148d) * 31) + this.f4149e) * 31) + this.f4145a.hashCode()) * 31) + this.f4146b.hashCode()) * 31) + this.f4147c.hashCode();
    }
}
