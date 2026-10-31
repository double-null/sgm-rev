package o4;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: State.java */
/* JADX INFO: loaded from: classes4.dex */
final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final f f23030e = new f(g.f23035b, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f23032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23034d;

    private f(g gVar, int i10, int i11, int i12) {
        this.f23032b = gVar;
        this.f23031a = i10;
        this.f23033c = i11;
        this.f23034d = i12;
    }

    f a(int i10) {
        int i11;
        g gVarA = this.f23032b;
        int i12 = this.f23031a;
        int i13 = this.f23034d;
        if (i12 == 4 || i12 == 2) {
            int i14 = d.f23023c[i12][0];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVarA = gVarA.a(i15, i16);
            i13 += i16;
            i12 = 0;
        }
        int i17 = this.f23033c;
        if (i17 == 0 || i17 == 31) {
            i11 = 18;
        } else {
            i11 = i17 == 62 ? 9 : 8;
        }
        f fVar = new f(gVarA, i12, i17 + 1, i13 + i11);
        return fVar.f23033c == 2078 ? fVar.b(i10 + 1) : fVar;
    }

    f b(int i10) {
        int i11 = this.f23033c;
        return i11 == 0 ? this : new f(this.f23032b.b(i10 - i11, i11), this.f23031a, 0, this.f23034d);
    }

    int c() {
        return this.f23033c;
    }

    int d() {
        return this.f23034d;
    }

    int e() {
        return this.f23031a;
    }

    boolean f(f fVar) {
        int i10;
        int i11 = this.f23034d + (d.f23023c[this.f23031a][fVar.f23031a] >> 16);
        int i12 = fVar.f23033c;
        if (i12 > 0 && ((i10 = this.f23033c) == 0 || i10 > i12)) {
            i11 += 10;
        }
        return i11 <= fVar.f23034d;
    }

    f g(int i10, int i11) {
        int i12 = this.f23034d;
        g gVarA = this.f23032b;
        int i13 = this.f23031a;
        if (i10 != i13) {
            int i14 = d.f23023c[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVarA = gVarA.a(i15, i16);
            i12 += i16;
        }
        int i17 = i10 == 2 ? 4 : 5;
        return new f(gVarA.a(i11, i17), i10, 0, i12 + i17);
    }

    f h(int i10, int i11) {
        g gVar = this.f23032b;
        int i12 = this.f23031a;
        int i13 = i12 == 2 ? 4 : 5;
        return new f(gVar.a(d.f23025e[i12][i10], i13).a(i11, 5), this.f23031a, 0, this.f23034d + i13 + 5);
    }

    p4.a i(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (g gVarD = b(bArr.length).f23032b; gVarD != null; gVarD = gVarD.d()) {
            linkedList.addFirst(gVarD);
        }
        p4.a aVar = new p4.a();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", d.f23022b[this.f23031a], Integer.valueOf(this.f23034d), Integer.valueOf(this.f23033c));
    }
}
