package o8;

import io.bidmachine.media3.exoplayer.source.f0;
import v8.o0;
import x7.r;

/* JADX INFO: compiled from: BaseMediaChunkOutput.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f23145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0[] f23146b;

    public c(int[] iArr, f0[] f0VarArr) {
        this.f23145a = iArr;
        this.f23146b = f0VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f23146b.length];
        int i10 = 0;
        while (true) {
            f0[] f0VarArr = this.f23146b;
            if (i10 >= f0VarArr.length) {
                return iArr;
            }
            iArr[i10] = f0VarArr[i10].J();
            i10++;
        }
    }

    public void b(long j10) {
        for (f0 f0Var : this.f23146b) {
            f0Var.d0(j10);
        }
    }

    @Override // o8.f.b
    public o0 e(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f23145a;
            if (i12 >= iArr.length) {
                r.c("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new v8.m();
            }
            if (i11 == iArr[i12]) {
                return this.f23146b[i12];
            }
            i12++;
        }
    }
}
