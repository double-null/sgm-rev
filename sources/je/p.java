package je;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p extends j2<char[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f20977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20978b;

    public p(char[] bufferWithData) {
        kotlin.jvm.internal.t.f(bufferWithData, "bufferWithData");
        this.f20977a = bufferWithData;
        this.f20978b = bufferWithData.length;
        b(10);
    }

    @Override // je.j2
    public void b(int i10) {
        char[] cArr = this.f20977a;
        if (cArr.length < i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, od.k.d(i10, cArr.length * 2));
            kotlin.jvm.internal.t.e(cArrCopyOf, "copyOf(...)");
            this.f20977a = cArrCopyOf;
        }
    }

    @Override // je.j2
    public int d() {
        return this.f20978b;
    }

    public final void e(char c10) {
        j2.c(this, 0, 1, null);
        char[] cArr = this.f20977a;
        int iD = d();
        this.f20978b = iD + 1;
        cArr[iD] = c10;
    }

    @Override // je.j2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f20977a, d());
        kotlin.jvm.internal.t.e(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }
}
