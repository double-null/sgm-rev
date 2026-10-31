package v4;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: BarcodeMatrix.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f27111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27114d;

    a(int i10, int i11) {
        b[] bVarArr = new b[i10];
        this.f27111a = bVarArr;
        int length = bVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f27111a[i12] = new b(((i11 + 4) * 17) + 1);
        }
        this.f27114d = i11 * 17;
        this.f27113c = i10;
        this.f27112b = -1;
    }

    b a() {
        return this.f27111a[this.f27112b];
    }

    public byte[][] b(int i10, int i11) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f27113c * i11, this.f27114d * i10);
        int i12 = this.f27113c * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[(i12 - i13) - 1] = this.f27111a[i13 / i11].b(i10);
        }
        return bArr;
    }

    void c() {
        this.f27112b++;
    }
}
