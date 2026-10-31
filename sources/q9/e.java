package q9;

import java.io.IOException;
import java.util.Arrays;
import v8.q;
import v8.s;
import x7.a0;

/* JADX INFO: compiled from: OggPacket.java */
/* JADX INFO: loaded from: classes4.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f24639a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f24640b = new a0(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24641c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24643e;

    e() {
    }

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f24642d = 0;
        do {
            int i13 = this.f24642d;
            int i14 = i10 + i13;
            f fVar = this.f24639a;
            if (i14 >= fVar.f24650g) {
                break;
            }
            int[] iArr = fVar.f24653j;
            this.f24642d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f24639a;
    }

    public a0 c() {
        return this.f24640b;
    }

    public boolean d(q qVar) throws IOException {
        int i10;
        x7.a.g(qVar != null);
        if (this.f24643e) {
            this.f24643e = false;
            this.f24640b.S(0);
        }
        while (!this.f24643e) {
            if (this.f24641c < 0) {
                if (!this.f24639a.c(qVar) || !this.f24639a.a(qVar, true)) {
                    return false;
                }
                f fVar = this.f24639a;
                int iA = fVar.f24651h;
                if ((fVar.f24645b & 1) == 1 && this.f24640b.g() == 0) {
                    iA += a(0);
                    i10 = this.f24642d + 0;
                } else {
                    i10 = 0;
                }
                if (!s.e(qVar, iA)) {
                    return false;
                }
                this.f24641c = i10;
            }
            int iA2 = a(this.f24641c);
            int i11 = this.f24641c + this.f24642d;
            if (iA2 > 0) {
                a0 a0Var = this.f24640b;
                a0Var.c(a0Var.g() + iA2);
                if (!s.d(qVar, this.f24640b.e(), this.f24640b.g(), iA2)) {
                    return false;
                }
                a0 a0Var2 = this.f24640b;
                a0Var2.V(a0Var2.g() + iA2);
                this.f24643e = this.f24639a.f24653j[i11 + (-1)] != 255;
            }
            if (i11 == this.f24639a.f24650g) {
                i11 = -1;
            }
            this.f24641c = i11;
        }
        return true;
    }

    public void e() {
        this.f24639a.b();
        this.f24640b.S(0);
        this.f24641c = -1;
        this.f24643e = false;
    }

    public void f() {
        if (this.f24640b.e().length == 65025) {
            return;
        }
        a0 a0Var = this.f24640b;
        a0Var.U(Arrays.copyOf(a0Var.e(), Math.max(65025, this.f24640b.g())), this.f24640b.g());
    }
}
