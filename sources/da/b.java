package da;

import android.util.Pair;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.media3.common.ParserException;
import java.io.IOException;
import u7.q;
import v8.i0;
import v8.o0;
import v8.p;
import v8.r;
import v8.s0;
import v8.u;
import x7.a0;
import x7.l0;

/* JADX INFO: compiled from: WavExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u f13441h = new u() { // from class: da.a
        @Override // v8.u
        public final p[] g() {
            return b.g();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f13442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o0 f13443b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC0176b f13446e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13444c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f13445d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f13447f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f13448g = -1;

    /* JADX INFO: compiled from: WavExtractor.java */
    private static final class a implements InterfaceC0176b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int[] f13449m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int[] f13450n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE, 143, 157, 173, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f13451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0 f13452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final da.c f13453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f13454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f13455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final a0 f13456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f13457g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final q f13458h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f13459i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f13460j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f13461k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f13462l;

        public a(r rVar, o0 o0Var, da.c cVar) throws ParserException {
            this.f13451a = rVar;
            this.f13452b = o0Var;
            this.f13453c = cVar;
            int iMax = Math.max(1, cVar.f13473c / 10);
            this.f13457g = iMax;
            a0 a0Var = new a0(cVar.f13477g);
            a0Var.z();
            int iZ = a0Var.z();
            this.f13454d = iZ;
            int i10 = cVar.f13472b;
            int i11 = (((cVar.f13475e - (i10 * 4)) * 8) / (cVar.f13476f * i10)) + 1;
            if (iZ == i11) {
                int iK = l0.k(iMax, iZ);
                this.f13455e = new byte[cVar.f13475e * iK];
                this.f13456f = new a0(iK * h(iZ, i10));
                int i12 = ((cVar.f13473c * cVar.f13475e) * 8) / iZ;
                this.f13458h = new q.b().u0("audio/raw").Q(i12).p0(i12).k0(h(iMax, i10)).R(cVar.f13472b).v0(cVar.f13473c).o0(2).N();
                return;
            }
            throw ParserException.b("Expected frames per block: " + i11 + "; got: " + iZ, null);
        }

        private void d(byte[] bArr, int i10, a0 a0Var) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f13453c.f13472b; i12++) {
                    e(bArr, i11, i12, a0Var.e());
                }
            }
            int iG = g(this.f13454d * i10);
            a0Var.W(0);
            a0Var.V(iG);
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            da.c cVar = this.f13453c;
            int i12 = cVar.f13475e;
            int i13 = cVar.f13472b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int iP = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int iMin = Math.min(bArr[i14 + 2] & 255, 88);
            int i17 = f13450n[iMin];
            int i18 = ((i10 * this.f13454d * i13) + i11) * 2;
            bArr2[i18] = (byte) (iP & 255);
            bArr2[i18 + 1] = (byte) (iP >> 8);
            for (int i19 = 0; i19 < i16 * 2; i19++) {
                int i20 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)] & 255;
                int i21 = i19 % 2 == 0 ? i20 & 15 : i20 >> 4;
                int i22 = ((((i21 & 7) * 2) + 1) * i17) >> 3;
                if ((i21 & 8) != 0) {
                    i22 = -i22;
                }
                iP = l0.p(iP + i22, -32768, 32767);
                i18 += i13 * 2;
                bArr2[i18] = (byte) (iP & 255);
                bArr2[i18 + 1] = (byte) (iP >> 8);
                int i23 = iMin + f13449m[i21];
                int[] iArr = f13450n;
                iMin = l0.p(i23, 0, iArr.length - 1);
                i17 = iArr[iMin];
            }
        }

        private int f(int i10) {
            return i10 / (this.f13453c.f13472b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f13453c.f13472b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long jF1 = this.f13460j + l0.f1(this.f13462l, 1000000L, this.f13453c.f13473c);
            int iG = g(i10);
            this.f13452b.f(jF1, 1, iG, this.f13461k - iG, null);
            this.f13462l += (long) i10;
            this.f13461k -= iG;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0038 A[LOOP:0: B:6:0x001e->B:12:0x0038, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x003e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x001b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0020  */
        /* JADX WARN: Code duplicated, block: B:9:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // da.b.InterfaceC0176b
        public boolean a(v8.q r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f13457g
                int r1 = r6.f13461k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f13454d
                int r0 = x7.l0.k(r0, r1)
                da.c r1 = r6.f13453c
                int r1 = r1.f13475e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f13459i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f13455e
                int r5 = r6.f13459i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f13459i
                int r4 = r4 + r3
                r6.f13459i = r4
                goto L1e
            L3e:
                int r7 = r6.f13459i
                da.c r8 = r6.f13453c
                int r8 = r8.f13475e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f13455e
                x7.a0 r9 = r6.f13456f
                r6.d(r8, r7, r9)
                int r8 = r6.f13459i
                da.c r9 = r6.f13453c
                int r9 = r9.f13475e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f13459i = r8
                x7.a0 r7 = r6.f13456f
                int r7 = r7.g()
                v8.o0 r8 = r6.f13452b
                x7.a0 r9 = r6.f13456f
                r8.b(r9, r7)
                int r8 = r6.f13461k
                int r8 = r8 + r7
                r6.f13461k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f13457g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f13461k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: da.b.a.a(v8.q, long):boolean");
        }

        @Override // da.b.InterfaceC0176b
        public void b(int i10, long j10) {
            e eVar = new e(this.f13453c, this.f13454d, i10, j10);
            this.f13451a.h(eVar);
            this.f13452b.a(this.f13458h);
            this.f13452b.g(eVar.k());
        }

        @Override // da.b.InterfaceC0176b
        public void c(long j10) {
            this.f13459i = 0;
            this.f13460j = j10;
            this.f13461k = 0;
            this.f13462l = 0L;
        }
    }

    /* JADX INFO: renamed from: da.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WavExtractor.java */
    private interface InterfaceC0176b {
        boolean a(v8.q qVar, long j10) throws IOException;

        void b(int i10, long j10) throws ParserException;

        void c(long j10);
    }

    /* JADX INFO: compiled from: WavExtractor.java */
    private static final class c implements InterfaceC0176b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f13463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0 f13464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final da.c f13465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final q f13466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f13467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f13468f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f13469g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f13470h;

        public c(r rVar, o0 o0Var, da.c cVar, String str, int i10) throws ParserException {
            this.f13463a = rVar;
            this.f13464b = o0Var;
            this.f13465c = cVar;
            int i11 = (cVar.f13472b * cVar.f13476f) / 8;
            if (cVar.f13475e == i11) {
                int i12 = cVar.f13473c;
                int i13 = i12 * i11 * 8;
                int iMax = Math.max(i11, (i12 * i11) / 10);
                this.f13467e = iMax;
                this.f13466d = new q.b().U("audio/wav").u0(str).Q(i13).p0(i13).k0(iMax).R(cVar.f13472b).v0(cVar.f13473c).o0(i10).N();
                return;
            }
            throw ParserException.b("Expected block size: " + i11 + "; got: " + cVar.f13475e, null);
        }

        @Override // da.b.InterfaceC0176b
        public boolean a(v8.q qVar, long j10) throws IOException {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f13469g) < (i11 = this.f13467e)) {
                int iC = this.f13464b.c(qVar, (int) Math.min(i11 - i10, j11), true);
                if (iC == -1) {
                    j11 = 0;
                } else {
                    this.f13469g += iC;
                    j11 -= (long) iC;
                }
            }
            da.c cVar = this.f13465c;
            int i12 = cVar.f13475e;
            int i13 = this.f13469g / i12;
            if (i13 > 0) {
                long jF1 = this.f13468f + l0.f1(this.f13470h, 1000000L, cVar.f13473c);
                int i14 = i13 * i12;
                int i15 = this.f13469g - i14;
                this.f13464b.f(jF1, 1, i14, i15, null);
                this.f13470h += (long) i13;
                this.f13469g = i15;
            }
            return j11 <= 0;
        }

        @Override // da.b.InterfaceC0176b
        public void b(int i10, long j10) {
            e eVar = new e(this.f13465c, 1, i10, j10);
            this.f13463a.h(eVar);
            this.f13464b.a(this.f13466d);
            this.f13464b.g(eVar.k());
        }

        @Override // da.b.InterfaceC0176b
        public void c(long j10) {
            this.f13468f = j10;
            this.f13469g = 0;
            this.f13470h = 0L;
        }
    }

    private void d() {
        x7.a.i(this.f13443b);
        l0.i(this.f13442a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p[] g() {
        return new p[]{new b()};
    }

    private void h(v8.q qVar) throws IOException {
        x7.a.g(qVar.getPosition() == 0);
        int i10 = this.f13447f;
        if (i10 != -1) {
            qVar.k(i10);
            this.f13444c = 4;
        } else {
            if (!d.a(qVar)) {
                throw ParserException.b("Unsupported or unrecognized wav file type.", null);
            }
            qVar.k((int) (qVar.f() - qVar.getPosition()));
            this.f13444c = 1;
        }
    }

    private void j(v8.q qVar) throws IOException {
        da.c cVarB = d.b(qVar);
        int i10 = cVarB.f13471a;
        if (i10 == 17) {
            this.f13446e = new a(this.f13442a, this.f13443b, cVarB);
        } else if (i10 == 6) {
            this.f13446e = new c(this.f13442a, this.f13443b, cVarB, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            this.f13446e = new c(this.f13442a, this.f13443b, cVarB, "audio/g711-mlaw", -1);
        } else {
            int iA = s0.a(i10, cVarB.f13476f);
            if (iA == 0) {
                throw ParserException.f("Unsupported WAV format type: " + cVarB.f13471a);
            }
            this.f13446e = new c(this.f13442a, this.f13443b, cVarB, "audio/raw", iA);
        }
        this.f13444c = 3;
    }

    private void k(v8.q qVar) throws IOException {
        this.f13445d = d.c(qVar);
        this.f13444c = 2;
    }

    private int m(v8.q qVar) throws IOException {
        x7.a.g(this.f13448g != -1);
        return ((InterfaceC0176b) x7.a.e(this.f13446e)).a(qVar, this.f13448g - qVar.getPosition()) ? -1 : 0;
    }

    private void n(v8.q qVar) throws IOException {
        Pair<Long, Long> pairE = d.e(qVar);
        this.f13447f = ((Long) pairE.first).intValue();
        long jLongValue = ((Long) pairE.second).longValue();
        long j10 = this.f13445d;
        if (j10 != -1 && jLongValue == 4294967295L) {
            jLongValue = j10;
        }
        this.f13448g = ((long) this.f13447f) + jLongValue;
        long length = qVar.getLength();
        if (length != -1 && this.f13448g > length) {
            x7.r.h("WavExtractor", "Data exceeds input length: " + this.f13448g + ", " + length);
            this.f13448g = length;
        }
        ((InterfaceC0176b) x7.a.e(this.f13446e)).b(this.f13447f, this.f13448g);
        this.f13444c = 4;
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        this.f13444c = j10 == 0 ? 0 : 4;
        InterfaceC0176b interfaceC0176b = this.f13446e;
        if (interfaceC0176b != null) {
            interfaceC0176b.c(j11);
        }
    }

    @Override // v8.p
    public void c(r rVar) {
        this.f13442a = rVar;
        this.f13443b = rVar.e(0, 1);
        rVar.r();
    }

    @Override // v8.p
    public boolean e(v8.q qVar) throws IOException {
        return d.a(qVar);
    }

    @Override // v8.p
    public int l(v8.q qVar, i0 i0Var) throws IOException {
        d();
        int i10 = this.f13444c;
        if (i10 == 0) {
            h(qVar);
            return 0;
        }
        if (i10 == 1) {
            k(qVar);
            return 0;
        }
        if (i10 == 2) {
            j(qVar);
            return 0;
        }
        if (i10 == 3) {
            n(qVar);
            return 0;
        }
        if (i10 == 4) {
            return m(qVar);
        }
        throw new IllegalStateException();
    }

    @Override // v8.p
    public void release() {
    }
}
