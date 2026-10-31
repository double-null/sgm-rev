package n9;

import io.bidmachine.media3.common.ParserException;
import java.io.IOException;
import java.util.ArrayDeque;
import v8.q;

/* JADX INFO: compiled from: DefaultEbmlReader.java */
/* JADX INFO: loaded from: classes4.dex */
final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f22840a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<b> f22841b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f22842c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private n9.b f22843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f22846g;

    /* JADX INFO: compiled from: DefaultEbmlReader.java */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f22847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f22848b;

        private b(int i10, long j10) {
            this.f22847a = i10;
            this.f22848b = j10;
        }
    }

    private long c(q qVar) throws IOException {
        qVar.d();
        while (true) {
            qVar.n(this.f22840a, 0, 4);
            int iC = g.c(this.f22840a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f22840a, iC, false);
                if (this.f22843d.f(iA)) {
                    qVar.k(iC);
                    return iA;
                }
            }
            qVar.k(1);
        }
    }

    private double d(q qVar, int i10) throws IOException {
        long jE = e(qVar, i10);
        return i10 == 4 ? Float.intBitsToFloat((int) jE) : Double.longBitsToDouble(jE);
    }

    private long e(q qVar, int i10) throws IOException {
        qVar.readFully(this.f22840a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f22840a[i11] & 255));
        }
        return j10;
    }

    private static String f(q qVar, int i10) throws IOException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        qVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // n9.c
    public boolean a(q qVar) throws IOException {
        x7.a.i(this.f22843d);
        while (true) {
            b bVarPeek = this.f22841b.peek();
            if (bVarPeek != null && qVar.getPosition() >= bVarPeek.f22848b) {
                this.f22843d.a(this.f22841b.pop().f22847a);
                return true;
            }
            if (this.f22844e == 0) {
                long jD = this.f22842c.d(qVar, true, false, 4);
                if (jD == -2) {
                    jD = c(qVar);
                }
                if (jD == -1) {
                    return false;
                }
                this.f22845f = (int) jD;
                this.f22844e = 1;
            }
            if (this.f22844e == 1) {
                this.f22846g = this.f22842c.d(qVar, false, true, 8);
                this.f22844e = 2;
            }
            int iE = this.f22843d.e(this.f22845f);
            if (iE != 0) {
                if (iE == 1) {
                    long position = qVar.getPosition();
                    this.f22841b.push(new b(this.f22845f, this.f22846g + position));
                    this.f22843d.h(this.f22845f, position, this.f22846g);
                    this.f22844e = 0;
                    return true;
                }
                if (iE == 2) {
                    long j10 = this.f22846g;
                    if (j10 <= 8) {
                        this.f22843d.d(this.f22845f, e(qVar, (int) j10));
                        this.f22844e = 0;
                        return true;
                    }
                    throw ParserException.b("Invalid integer size: " + this.f22846g, null);
                }
                if (iE == 3) {
                    long j11 = this.f22846g;
                    if (j11 <= 2147483647L) {
                        this.f22843d.g(this.f22845f, f(qVar, (int) j11));
                        this.f22844e = 0;
                        return true;
                    }
                    throw ParserException.b("String element size: " + this.f22846g, null);
                }
                if (iE == 4) {
                    this.f22843d.c(this.f22845f, (int) this.f22846g, qVar);
                    this.f22844e = 0;
                    return true;
                }
                if (iE != 5) {
                    throw ParserException.b("Invalid element type " + iE, null);
                }
                long j12 = this.f22846g;
                if (j12 == 4 || j12 == 8) {
                    this.f22843d.b(this.f22845f, d(qVar, (int) j12));
                    this.f22844e = 0;
                    return true;
                }
                throw ParserException.b("Invalid float size: " + this.f22846g, null);
            }
            qVar.k((int) this.f22846g);
            this.f22844e = 0;
        }
    }

    @Override // n9.c
    public void b(n9.b bVar) {
        this.f22843d = bVar;
    }

    @Override // n9.c
    public void reset() {
        this.f22844e = 0;
        this.f22841b.clear();
        this.f22842c.e();
    }
}
