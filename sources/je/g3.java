package je;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g3 extends j2<wc.a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f20923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20924b;

    public /* synthetic */ g3(int[] iArr, kotlin.jvm.internal.k kVar) {
        this(iArr);
    }

    @Override // je.j2
    public /* bridge */ /* synthetic */ wc.a0 a() {
        return wc.a0.a(f());
    }

    @Override // je.j2
    public void b(int i10) {
        if (wc.a0.m(this.f20923a) < i10) {
            int[] iArr = this.f20923a;
            int[] iArrCopyOf = Arrays.copyOf(iArr, od.k.d(i10, wc.a0.m(iArr) * 2));
            kotlin.jvm.internal.t.e(iArrCopyOf, "copyOf(...)");
            this.f20923a = wc.a0.d(iArrCopyOf);
        }
    }

    @Override // je.j2
    public int d() {
        return this.f20924b;
    }

    public final void e(int i10) {
        j2.c(this, 0, 1, null);
        int[] iArr = this.f20923a;
        int iD = d();
        this.f20924b = iD + 1;
        wc.a0.r(iArr, iD, i10);
    }

    public int[] f() {
        int[] iArrCopyOf = Arrays.copyOf(this.f20923a, d());
        kotlin.jvm.internal.t.e(iArrCopyOf, "copyOf(...)");
        return wc.a0.d(iArrCopyOf);
    }

    private g3(int[] bufferWithData) {
        kotlin.jvm.internal.t.f(bufferWithData, "bufferWithData");
        this.f20923a = bufferWithData;
        this.f20924b = wc.a0.m(bufferWithData);
        b(10);
    }
}
