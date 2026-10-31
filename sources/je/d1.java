package je;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d1 extends j2<long[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f20886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20887b;

    public d1(long[] bufferWithData) {
        kotlin.jvm.internal.t.f(bufferWithData, "bufferWithData");
        this.f20886a = bufferWithData;
        this.f20887b = bufferWithData.length;
        b(10);
    }

    @Override // je.j2
    public void b(int i10) {
        long[] jArr = this.f20886a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, od.k.d(i10, jArr.length * 2));
            kotlin.jvm.internal.t.e(jArrCopyOf, "copyOf(...)");
            this.f20886a = jArrCopyOf;
        }
    }

    @Override // je.j2
    public int d() {
        return this.f20887b;
    }

    public final void e(long j10) {
        j2.c(this, 0, 1, null);
        long[] jArr = this.f20886a;
        int iD = d();
        this.f20887b = iD + 1;
        jArr[iD] = j10;
    }

    @Override // je.j2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f20886a, d());
        kotlin.jvm.internal.t.e(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }
}
