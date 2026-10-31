package j9;

import java.util.Arrays;

/* JADX INFO: compiled from: MlltFrame.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f20732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f20733f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f20729b = i10;
        this.f20730c = i11;
        this.f20731d = i12;
        this.f20732e = iArr;
        this.f20733f = iArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f20729b == lVar.f20729b && this.f20730c == lVar.f20730c && this.f20731d == lVar.f20731d && Arrays.equals(this.f20732e, lVar.f20732e) && Arrays.equals(this.f20733f, lVar.f20733f);
    }

    public int hashCode() {
        return ((((((((527 + this.f20729b) * 31) + this.f20730c) * 31) + this.f20731d) * 31) + Arrays.hashCode(this.f20732e)) * 31) + Arrays.hashCode(this.f20733f);
    }
}
