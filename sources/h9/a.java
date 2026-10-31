package h9;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import u7.u;
import u7.v;
import u7.w;
import x7.a0;

/* JADX INFO: compiled from: PictureFrame.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f15754h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f15747a = i10;
        this.f15748b = str;
        this.f15749c = str2;
        this.f15750d = i11;
        this.f15751e = i12;
        this.f15752f = i13;
        this.f15753g = i14;
        this.f15754h = bArr;
    }

    public static a d(a0 a0Var) {
        int iQ = a0Var.q();
        String strU = w.u(a0Var.F(a0Var.q(), StandardCharsets.US_ASCII));
        String strE = a0Var.E(a0Var.q());
        int iQ2 = a0Var.q();
        int iQ3 = a0Var.q();
        int iQ4 = a0Var.q();
        int iQ5 = a0Var.q();
        int iQ6 = a0Var.q();
        byte[] bArr = new byte[iQ6];
        a0Var.l(bArr, 0, iQ6);
        return new a(iQ, strU, strE, iQ2, iQ3, iQ4, iQ5, bArr);
    }

    @Override // u7.v.a
    public void b(u.b bVar) {
        bVar.K(this.f15754h, this.f15747a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15747a == aVar.f15747a && this.f15748b.equals(aVar.f15748b) && this.f15749c.equals(aVar.f15749c) && this.f15750d == aVar.f15750d && this.f15751e == aVar.f15751e && this.f15752f == aVar.f15752f && this.f15753g == aVar.f15753g && Arrays.equals(this.f15754h, aVar.f15754h);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f15747a) * 31) + this.f15748b.hashCode()) * 31) + this.f15749c.hashCode()) * 31) + this.f15750d) * 31) + this.f15751e) * 31) + this.f15752f) * 31) + this.f15753g) * 31) + Arrays.hashCode(this.f15754h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f15748b + ", description=" + this.f15749c;
    }
}
