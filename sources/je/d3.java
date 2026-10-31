package je;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d3 extends j2<wc.y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f20889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20890b;

    public /* synthetic */ d3(byte[] bArr, kotlin.jvm.internal.k kVar) {
        this(bArr);
    }

    @Override // je.j2
    public /* bridge */ /* synthetic */ wc.y a() {
        return wc.y.a(f());
    }

    @Override // je.j2
    public void b(int i10) {
        if (wc.y.m(this.f20889a) < i10) {
            byte[] bArr = this.f20889a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, od.k.d(i10, wc.y.m(bArr) * 2));
            kotlin.jvm.internal.t.e(bArrCopyOf, "copyOf(...)");
            this.f20889a = wc.y.d(bArrCopyOf);
        }
    }

    @Override // je.j2
    public int d() {
        return this.f20890b;
    }

    public final void e(byte b10) {
        j2.c(this, 0, 1, null);
        byte[] bArr = this.f20889a;
        int iD = d();
        this.f20890b = iD + 1;
        wc.y.r(bArr, iD, b10);
    }

    public byte[] f() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f20889a, d());
        kotlin.jvm.internal.t.e(bArrCopyOf, "copyOf(...)");
        return wc.y.d(bArrCopyOf);
    }

    private d3(byte[] bufferWithData) {
        kotlin.jvm.internal.t.f(bufferWithData, "bufferWithData");
        this.f20889a = bufferWithData;
        this.f20890b = wc.y.m(bufferWithData);
        b(10);
    }
}
