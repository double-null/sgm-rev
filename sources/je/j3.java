package je;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j3 extends j2<wc.c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f20949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20950b;

    public /* synthetic */ j3(long[] jArr, kotlin.jvm.internal.k kVar) {
        this(jArr);
    }

    @Override // je.j2
    public /* bridge */ /* synthetic */ wc.c0 a() {
        return wc.c0.a(f());
    }

    @Override // je.j2
    public void b(int i10) {
        if (wc.c0.m(this.f20949a) < i10) {
            long[] jArr = this.f20949a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, od.k.d(i10, wc.c0.m(jArr) * 2));
            kotlin.jvm.internal.t.e(jArrCopyOf, "copyOf(...)");
            this.f20949a = wc.c0.d(jArrCopyOf);
        }
    }

    @Override // je.j2
    public int d() {
        return this.f20950b;
    }

    public final void e(long j10) {
        j2.c(this, 0, 1, null);
        long[] jArr = this.f20949a;
        int iD = d();
        this.f20950b = iD + 1;
        wc.c0.r(jArr, iD, j10);
    }

    public long[] f() {
        long[] jArrCopyOf = Arrays.copyOf(this.f20949a, d());
        kotlin.jvm.internal.t.e(jArrCopyOf, "copyOf(...)");
        return wc.c0.d(jArrCopyOf);
    }

    private j3(long[] bufferWithData) {
        kotlin.jvm.internal.t.f(bufferWithData, "bufferWithData");
        this.f20949a = bufferWithData;
        this.f20950b = wc.c0.m(bufferWithData);
        b(10);
    }
}
