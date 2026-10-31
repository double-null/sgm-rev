package je;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j extends j2<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f20944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20945b;

    public j(byte[] bufferWithData) {
        kotlin.jvm.internal.t.f(bufferWithData, "bufferWithData");
        this.f20944a = bufferWithData;
        this.f20945b = bufferWithData.length;
        b(10);
    }

    @Override // je.j2
    public void b(int i10) {
        byte[] bArr = this.f20944a;
        if (bArr.length < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, od.k.d(i10, bArr.length * 2));
            kotlin.jvm.internal.t.e(bArrCopyOf, "copyOf(...)");
            this.f20944a = bArrCopyOf;
        }
    }

    @Override // je.j2
    public int d() {
        return this.f20945b;
    }

    public final void e(byte b10) {
        j2.c(this, 0, 1, null);
        byte[] bArr = this.f20944a;
        int iD = d();
        this.f20945b = iD + 1;
        bArr[iD] = b10;
    }

    @Override // je.j2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f20944a, d());
        kotlin.jvm.internal.t.e(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }
}
