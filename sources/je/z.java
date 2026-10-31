package je;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class z extends j2<double[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double[] f21043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21044b;

    public z(double[] bufferWithData) {
        kotlin.jvm.internal.t.f(bufferWithData, "bufferWithData");
        this.f21043a = bufferWithData;
        this.f21044b = bufferWithData.length;
        b(10);
    }

    @Override // je.j2
    public void b(int i10) {
        double[] dArr = this.f21043a;
        if (dArr.length < i10) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, od.k.d(i10, dArr.length * 2));
            kotlin.jvm.internal.t.e(dArrCopyOf, "copyOf(...)");
            this.f21043a = dArrCopyOf;
        }
    }

    @Override // je.j2
    public int d() {
        return this.f21044b;
    }

    public final void e(double d10) {
        j2.c(this, 0, 1, null);
        double[] dArr = this.f21043a;
        int iD = d();
        this.f21044b = iD + 1;
        dArr[iD] = d10;
    }

    @Override // je.j2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f21043a, d());
        kotlin.jvm.internal.t.e(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }
}
