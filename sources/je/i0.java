package je;

import b2.Bo.yeILL;
import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i0 extends j2<float[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f20935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20936b;

    @Override // je.j2
    public void b(int i10) {
        float[] fArr = this.f20935a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, od.k.d(i10, fArr.length * 2));
            kotlin.jvm.internal.t.e(fArrCopyOf, "copyOf(...)");
            this.f20935a = fArrCopyOf;
        }
    }

    @Override // je.j2
    public int d() {
        return this.f20936b;
    }

    public final void e(float f10) {
        j2.c(this, 0, 1, null);
        float[] fArr = this.f20935a;
        int iD = d();
        this.f20936b = iD + 1;
        fArr[iD] = f10;
    }

    @Override // je.j2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f20935a, d());
        kotlin.jvm.internal.t.e(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    public i0(float[] fArr) {
        kotlin.jvm.internal.t.f(fArr, yeILL.RVi);
        this.f20935a = fArr;
        this.f20936b = fArr.length;
        b(10);
    }
}
