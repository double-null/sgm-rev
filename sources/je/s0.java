package je;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s0 extends j2<int[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f21003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21004b;

    public s0(int[] bufferWithData) {
        kotlin.jvm.internal.t.f(bufferWithData, "bufferWithData");
        this.f21003a = bufferWithData;
        this.f21004b = bufferWithData.length;
        b(10);
    }

    @Override // je.j2
    public void b(int i10) {
        int[] iArr = this.f21003a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, od.k.d(i10, iArr.length * 2));
            kotlin.jvm.internal.t.e(iArrCopyOf, "copyOf(...)");
            this.f21003a = iArrCopyOf;
        }
    }

    @Override // je.j2
    public int d() {
        return this.f21004b;
    }

    public final void e(int i10) {
        j2.c(this, 0, 1, null);
        int[] iArr = this.f21003a;
        int iD = d();
        this.f21004b = iD + 1;
        iArr[iD] = i10;
    }

    @Override // je.j2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f21003a, d());
        kotlin.jvm.internal.t.e(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }
}
