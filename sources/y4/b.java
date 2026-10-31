package y4;

import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: compiled from: ByteMatrix.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[][] f28648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f28650c;

    public b(int i10, int i11) {
        this.f28648a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.f28649b = i10;
        this.f28650c = i11;
    }

    public void a(byte b10) {
        for (byte[] bArr : this.f28648a) {
            Arrays.fill(bArr, b10);
        }
    }

    public byte b(int i10, int i11) {
        return this.f28648a[i11][i10];
    }

    public byte[][] c() {
        return this.f28648a;
    }

    public int d() {
        return this.f28650c;
    }

    public int e() {
        return this.f28649b;
    }

    public void f(int i10, int i11, int i12) {
        this.f28648a[i11][i10] = (byte) i12;
    }

    public void g(int i10, int i11, boolean z10) {
        this.f28648a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f28649b * 2 * this.f28650c) + 2);
        for (int i10 = 0; i10 < this.f28650c; i10++) {
            byte[] bArr = this.f28648a[i10];
            for (int i11 = 0; i11 < this.f28649b; i11++) {
                byte b10 = bArr[i11];
                if (b10 == 0) {
                    sb2.append(KBBdKxoAiHo.FiutrHzYkihI);
                } else if (b10 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
