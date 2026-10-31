package je;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m3 extends j2<wc.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short[] f20965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20966b;

    public /* synthetic */ m3(short[] sArr, kotlin.jvm.internal.k kVar) {
        this(sArr);
    }

    @Override // je.j2
    public /* bridge */ /* synthetic */ wc.f0 a() {
        return wc.f0.a(f());
    }

    @Override // je.j2
    public void b(int i10) {
        if (wc.f0.m(this.f20965a) < i10) {
            short[] sArr = this.f20965a;
            short[] sArrCopyOf = Arrays.copyOf(sArr, od.k.d(i10, wc.f0.m(sArr) * 2));
            kotlin.jvm.internal.t.e(sArrCopyOf, "copyOf(...)");
            this.f20965a = wc.f0.d(sArrCopyOf);
        }
    }

    @Override // je.j2
    public int d() {
        return this.f20966b;
    }

    public final void e(short s10) {
        j2.c(this, 0, 1, null);
        short[] sArr = this.f20965a;
        int iD = d();
        this.f20966b = iD + 1;
        wc.f0.r(sArr, iD, s10);
    }

    public short[] f() {
        short[] sArrCopyOf = Arrays.copyOf(this.f20965a, d());
        kotlin.jvm.internal.t.e(sArrCopyOf, "copyOf(...)");
        return wc.f0.d(sArrCopyOf);
    }

    private m3(short[] bufferWithData) {
        kotlin.jvm.internal.t.f(bufferWithData, "bufferWithData");
        this.f20965a = bufferWithData;
        this.f20966b = wc.f0.m(bufferWithData);
        b(10);
    }
}
