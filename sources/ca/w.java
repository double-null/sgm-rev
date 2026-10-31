package ca;

import java.util.Arrays;

/* JADX INFO: compiled from: NalUnitTargetBuffer.java */
/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f5433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5434e;

    public w(int i10, int i11) {
        this.f5430a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f5433d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f5431b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f5433d;
            int length = bArr2.length;
            int i13 = this.f5434e;
            if (length < i13 + i12) {
                this.f5433d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f5433d, this.f5434e, i12);
            this.f5434e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f5431b) {
            return false;
        }
        this.f5434e -= i10;
        this.f5431b = false;
        this.f5432c = true;
        return true;
    }

    public boolean c() {
        return this.f5432c;
    }

    public void d() {
        this.f5431b = false;
        this.f5432c = false;
    }

    public void e(int i10) {
        x7.a.g(!this.f5431b);
        boolean z10 = i10 == this.f5430a;
        this.f5431b = z10;
        if (z10) {
            this.f5434e = 3;
            this.f5432c = false;
        }
    }
}
