package q9;

import io.bidmachine.media3.common.ParserException;
import java.io.IOException;
import v8.q;
import v8.s;
import x7.a0;

/* JADX INFO: compiled from: OggPageHeader.java */
/* JADX INFO: loaded from: classes4.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f24646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f24647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f24648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f24649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24652i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f24653j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a0 f24654k = new a0(255);

    f() {
    }

    public boolean a(q qVar, boolean z10) throws IOException {
        b();
        this.f24654k.S(27);
        if (!s.b(qVar, this.f24654k.e(), 0, 27, z10) || this.f24654k.J() != 1332176723) {
            return false;
        }
        int iH = this.f24654k.H();
        this.f24644a = iH;
        if (iH != 0) {
            if (z10) {
                return false;
            }
            throw ParserException.f("unsupported bit stream revision");
        }
        this.f24645b = this.f24654k.H();
        this.f24646c = this.f24654k.v();
        this.f24647d = this.f24654k.x();
        this.f24648e = this.f24654k.x();
        this.f24649f = this.f24654k.x();
        int iH2 = this.f24654k.H();
        this.f24650g = iH2;
        this.f24651h = iH2 + 27;
        this.f24654k.S(iH2);
        if (!s.b(qVar, this.f24654k.e(), 0, this.f24650g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f24650g; i10++) {
            this.f24653j[i10] = this.f24654k.H();
            this.f24652i += this.f24653j[i10];
        }
        return true;
    }

    public void b() {
        this.f24644a = 0;
        this.f24645b = 0;
        this.f24646c = 0L;
        this.f24647d = 0L;
        this.f24648e = 0L;
        this.f24649f = 0L;
        this.f24650g = 0;
        this.f24651h = 0;
        this.f24652i = 0;
    }

    public boolean c(q qVar) throws IOException {
        return d(qVar, -1L);
    }

    public boolean d(q qVar, long j10) throws IOException {
        x7.a.a(qVar.getPosition() == qVar.f());
        this.f24654k.S(4);
        while (true) {
            if ((j10 != -1 && qVar.getPosition() + 4 >= j10) || !s.b(qVar, this.f24654k.e(), 0, 4, true)) {
                break;
            }
            this.f24654k.W(0);
            if (this.f24654k.J() == 1332176723) {
                qVar.d();
                return true;
            }
            qVar.k(1);
        }
        do {
            if (j10 != -1 && qVar.getPosition() >= j10) {
                break;
            }
        } while (qVar.h(1) != -1);
        return false;
    }
}
