package je;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g extends j2<boolean[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean[] f20905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20906b;

    public g(boolean[] bufferWithData) {
        kotlin.jvm.internal.t.f(bufferWithData, "bufferWithData");
        this.f20905a = bufferWithData;
        this.f20906b = bufferWithData.length;
        b(10);
    }

    @Override // je.j2
    public void b(int i10) {
        boolean[] zArr = this.f20905a;
        if (zArr.length < i10) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, od.k.d(i10, zArr.length * 2));
            kotlin.jvm.internal.t.e(zArrCopyOf, "copyOf(...)");
            this.f20905a = zArrCopyOf;
        }
    }

    @Override // je.j2
    public int d() {
        return this.f20906b;
    }

    public final void e(boolean z10) {
        j2.c(this, 0, 1, null);
        boolean[] zArr = this.f20905a;
        int iD = d();
        this.f20906b = iD + 1;
        zArr[iD] = z10;
    }

    @Override // je.j2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f20905a, d());
        kotlin.jvm.internal.t.e(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }
}
