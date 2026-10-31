package n9;

import android.util.Pair;
import android.util.SparseArray;
import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import com.google.firebase.FirebaseError;
import com.google.firebase.crashlytics.internal.RPrM.UICvx;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import io.bidmachine.media3.common.ParserException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import s.sBoZ.TwDPD;
import sc.NfwM.XDucgbzInpQa;
import u7.l;
import u7.w;
import v8.c0;
import v8.i0;
import v8.j0;
import v8.n;
import v8.o0;
import v8.p;
import v8.p0;
import v8.q;
import v8.r;
import v8.u;
import x7.a0;
import x7.l0;
import x7.s;
import ze.tmM.zKUlck;

/* JADX INFO: compiled from: MatroskaExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public class e implements p {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @Deprecated
    public static final u f22849f0 = new u() { // from class: n9.d
        @Override // v8.u
        public final p[] g() {
            return e.C();
        }
    };

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final byte[] f22850g0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final byte[] f22851h0 = l0.u0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final byte[] f22852i0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final byte[] f22853j0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final UUID f22854k0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Map<String, Integer> f22855l0;
    private long A;
    private boolean B;
    private long C;
    private long D;
    private long E;
    private s F;
    private s G;
    private boolean H;
    private boolean I;
    private int J;
    private long K;
    private long L;
    private int M;
    private int N;
    private int[] O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private boolean T;
    private long U;
    private int V;
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n9.c f22856a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f22857a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f22858b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f22859b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<c> f22860c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private byte f22861c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f22862d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f22863d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f22864e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private r f22865e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s9.r.a f22866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a0 f22867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a0 f22868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a0 f22869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a0 f22870j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a0 f22871k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a0 f22872l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a0 f22873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final a0 f22874n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final a0 f22875o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final a0 f22876p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ByteBuffer f22877q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f22878r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f22879s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f22880t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f22881u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f22882v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f22883w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c f22884x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f22885y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f22886z;

    /* JADX INFO: compiled from: MatroskaExtractor.java */
    private final class b implements n9.b {
        private b() {
        }

        @Override // n9.b
        public void a(int i10) throws ParserException {
            e.this.q(i10);
        }

        @Override // n9.b
        public void b(int i10, double d10) throws ParserException {
            e.this.t(i10, d10);
        }

        @Override // n9.b
        public void c(int i10, int i11, q qVar) throws IOException {
            e.this.n(i10, i11, qVar);
        }

        @Override // n9.b
        public void d(int i10, long j10) throws ParserException {
            e.this.z(i10, j10);
        }

        @Override // n9.b
        public int e(int i10) {
            return e.this.w(i10);
        }

        @Override // n9.b
        public boolean f(int i10) {
            return e.this.B(i10);
        }

        @Override // n9.b
        public void g(int i10, String str) throws ParserException {
            e.this.J(i10, str);
        }

        @Override // n9.b
        public void h(int i10, long j10, long j11) throws ParserException {
            e.this.I(i10, j10, j11);
        }
    }

    /* JADX INFO: compiled from: MatroskaExtractor.java */
    protected static final class c {
        public byte[] P;
        public p0 V;
        public boolean W;
        public o0 Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f22888a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f22889a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f22890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f22891c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22892d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22893e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22894f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f22895g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f22896h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f22897i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f22898j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public o0.a f22899k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public byte[] f22900l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public l f22901m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f22902n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f22903o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f22904p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f22905q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f22906r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f22907s = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22908t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f22909u = 0.0f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f22910v = 0.0f;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public float f22911w = 0.0f;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public byte[] f22912x = null;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f22913y = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f22914z = false;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = 1000;
        public int E = 200;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public float N = -1.0f;
        public float O = -1.0f;
        public int Q = 1;
        public int R = -1;
        public int S = 8000;
        public long T = 0;
        public long U = 0;
        public boolean X = true;
        private String Y = "eng";

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            x7.a.e(this.Z);
        }

        private byte[] g(String str) throws ParserException {
            byte[] bArr = this.f22900l;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.b("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] h() {
            if (this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f || this.N == -1.0f || this.O == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.L * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.M * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.N + 0.5f));
            byteBufferOrder.putShort((short) (this.O + 0.5f));
            byteBufferOrder.putShort((short) this.D);
            byteBufferOrder.putShort((short) this.E);
            return bArr;
        }

        private static boolean l(a0 a0Var) throws ParserException {
            try {
                int iZ = a0Var.z();
                if (iZ == 1) {
                    return true;
                }
                if (iZ != 65534) {
                    return false;
                }
                a0Var.W(24);
                return a0Var.A() == e.f22854k0.getMostSignificantBits() && a0Var.A() == e.f22854k0.getLeastSignificantBits();
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.b("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> m(byte[] bArr) throws ParserException {
            int i10;
            int i11;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.b("Error parsing vorbis codec private", null);
                }
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = bArr[i13];
                    if ((i10 & 255) != 255) {
                        break;
                    }
                    i12 += 255;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + (i10 & 255);
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if ((i11 & 255) != 255) {
                        break;
                    }
                    i16 += 255;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + (i11 & 255);
                if (bArr[i17] != 1) {
                    throw ParserException.b("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i15];
                System.arraycopy(bArr, i17, bArr2, 0, i15);
                int i19 = i17 + i15;
                if (bArr[i19] != 3) {
                    throw ParserException.b("Error parsing vorbis codec private", null);
                }
                int i20 = i19 + i18;
                if (bArr[i20] != 5) {
                    throw ParserException.b("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i20];
                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.b("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o(boolean z10) {
            if ("A_OPUS".equals(this.f22891c)) {
                return z10;
            }
            return this.f22895g > 0;
        }

        public void j() {
            p0 p0Var = this.V;
            if (p0Var != null) {
                p0Var.a(this.Z, this.f22899k);
            }
        }

        public void n() {
            p0 p0Var = this.V;
            if (p0Var != null) {
                p0Var.b();
            }
        }

        private static Pair<String, List<byte[]>> k(a0 a0Var) throws ParserException {
            try {
                a0Var.X(16);
                long jX = a0Var.x();
                if (jX == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (jX == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (jX != 826496599) {
                    x7.r.h(TwDPD.dudCTQN, "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] bArrE = a0Var.e();
                for (int iF = a0Var.f() + 20; iF < bArrE.length - 4; iF++) {
                    if (bArrE[iF] == 0 && bArrE[iF + 1] == 0 && bArrE[iF + 2] == 1 && bArrE[iF + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrE, iF, bArrE.length)));
                    }
                }
                throw ParserException.b("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.b("Error parsing FourCC private data", null);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:152:0x029f A[PHI: r1
          0x029f: PHI (r1v119 int) = (r1v77 int), (r1v115 int), (r1v116 int), (r1v117 int), (r1v123 int) binds: [B:203:0x03ef, B:161:0x02b9, B:159:0x02b4, B:157:0x02af, B:150:0x027f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:214:0x043a  */
        /* JADX WARN: Code duplicated, block: B:219:0x0455  */
        /* JADX WARN: Code duplicated, block: B:220:0x0457  */
        /* JADX WARN: Code duplicated, block: B:223:0x0464  */
        /* JADX WARN: Code duplicated, block: B:224:0x0476  */
        /* JADX WARN: Code duplicated, block: B:226:0x047c  */
        /* JADX WARN: Code duplicated, block: B:228:0x0480  */
        /* JADX WARN: Code duplicated, block: B:230:0x0485  */
        /* JADX WARN: Code duplicated, block: B:233:0x048d  */
        /* JADX WARN: Code duplicated, block: B:235:0x0492  */
        /* JADX WARN: Code duplicated, block: B:238:0x0497  */
        /* JADX WARN: Code duplicated, block: B:241:0x04a5  */
        /* JADX WARN: Code duplicated, block: B:244:0x04ab  */
        /* JADX WARN: Code duplicated, block: B:247:0x04de  */
        /* JADX WARN: Code duplicated, block: B:252:0x04fe  */
        /* JADX WARN: Code duplicated, block: B:271:0x054a  */
        /* JADX WARN: Code duplicated, block: B:273:0x0570  */
        /* JADX WARN: Code duplicated, block: B:275:0x0576  */
        /* JADX WARN: Code duplicated, block: B:291:0x05a3  */
        /* JADX WARN: Code duplicated, block: B:296:0x05be  */
        /* JADX WARN: Code duplicated, block: B:297:0x05c1  */
        /* JADX WARN: Code duplicated, block: B:4:0x0017  */
        public void i(r rVar, int i10) throws ParserException {
            byte b10;
            List<byte[]> listSingletonList;
            int iI0;
            String str;
            List<byte[]> list;
            String str2;
            int i11;
            int i12;
            String str3;
            int i13;
            int i14;
            u7.q.b bVar;
            int i15;
            int iIntValue;
            int i16;
            float f10;
            int i17;
            int i18;
            int i19;
            String str4;
            n nVarA;
            String str5 = this.f22891c;
            str5.hashCode();
            switch (str5.hashCode()) {
                case -2095576542:
                    if (!str5.equals("V_MPEG4/ISO/AP")) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                case -2095575984:
                    if (!str5.equals("V_MPEG4/ISO/SP")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case -1985379776:
                    if (!str5.equals("A_MS/ACM")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case -1784763192:
                    if (!str5.equals("A_TRUEHD")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case -1730367663:
                    if (!str5.equals("A_VORBIS")) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case -1482641358:
                    if (!str5.equals("A_MPEG/L2")) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case -1482641357:
                    if (!str5.equals("A_MPEG/L3")) {
                        b10 = -1;
                    } else {
                        b10 = 6;
                    }
                    break;
                case -1373388978:
                    if (!str5.equals(XDucgbzInpQa.hTGM)) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case -933872740:
                    if (!str5.equals("S_DVBSUB")) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case -538363189:
                    if (!str5.equals("V_MPEG4/ISO/ASP")) {
                        b10 = -1;
                    } else {
                        b10 = 9;
                    }
                    break;
                case -538363109:
                    if (!str5.equals("V_MPEG4/ISO/AVC")) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case -425012669:
                    if (!str5.equals("S_VOBSUB")) {
                        b10 = -1;
                    } else {
                        b10 = 11;
                    }
                    break;
                case -356037306:
                    if (!str5.equals(ljglrLUdGZhMhQ.vwmAKsPKBMIKJ)) {
                        b10 = -1;
                    } else {
                        b10 = 12;
                    }
                    break;
                case 62923557:
                    if (!str5.equals("A_AAC")) {
                        b10 = -1;
                    } else {
                        b10 = 13;
                    }
                    break;
                case 62923603:
                    if (!str5.equals("A_AC3")) {
                        b10 = -1;
                    } else {
                        b10 = 14;
                    }
                    break;
                case 62927045:
                    if (!str5.equals("A_DTS")) {
                        b10 = -1;
                    } else {
                        b10 = 15;
                    }
                    break;
                case 82318131:
                    if (!str5.equals("V_AV1")) {
                        b10 = -1;
                    } else {
                        b10 = 16;
                    }
                    break;
                case 82338133:
                    if (!str5.equals("V_VP8")) {
                        b10 = -1;
                    } else {
                        b10 = 17;
                    }
                    break;
                case 82338134:
                    if (!str5.equals("V_VP9")) {
                        b10 = -1;
                    } else {
                        b10 = 18;
                    }
                    break;
                case 99146302:
                    if (!str5.equals("S_HDMV/PGS")) {
                        b10 = -1;
                    } else {
                        b10 = 19;
                    }
                    break;
                case 444813526:
                    if (!str5.equals("V_THEORA")) {
                        b10 = -1;
                    } else {
                        b10 = 20;
                    }
                    break;
                case 542569478:
                    if (!str5.equals("A_DTS/EXPRESS")) {
                        b10 = -1;
                    } else {
                        b10 = 21;
                    }
                    break;
                case 635596514:
                    if (!str5.equals("A_PCM/FLOAT/IEEE")) {
                        b10 = -1;
                    } else {
                        b10 = 22;
                    }
                    break;
                case 725948237:
                    if (!str5.equals("A_PCM/INT/BIG")) {
                        b10 = -1;
                    } else {
                        b10 = 23;
                    }
                    break;
                case 725957860:
                    if (!str5.equals("A_PCM/INT/LIT")) {
                        b10 = -1;
                    } else {
                        b10 = 24;
                    }
                    break;
                case 738597099:
                    if (!str5.equals("S_TEXT/ASS")) {
                        b10 = -1;
                    } else {
                        b10 = 25;
                    }
                    break;
                case 855502857:
                    if (!str5.equals("V_MPEGH/ISO/HEVC")) {
                        b10 = -1;
                    } else {
                        b10 = 26;
                    }
                    break;
                case 1045209816:
                    if (!str5.equals("S_TEXT/WEBVTT")) {
                        b10 = -1;
                    } else {
                        b10 = 27;
                    }
                    break;
                case 1422270023:
                    if (!str5.equals("S_TEXT/UTF8")) {
                        b10 = -1;
                    } else {
                        b10 = 28;
                    }
                    break;
                case 1809237540:
                    if (!str5.equals("V_MPEG2")) {
                        b10 = -1;
                    } else {
                        b10 = 29;
                    }
                    break;
                case 1950749482:
                    if (!str5.equals("A_EAC3")) {
                        b10 = -1;
                    } else {
                        b10 = 30;
                    }
                    break;
                case 1950789798:
                    if (!str5.equals("A_FLAC")) {
                        b10 = -1;
                    } else {
                        b10 = 31;
                    }
                    break;
                case 1951062397:
                    if (!str5.equals("A_OPUS")) {
                        b10 = -1;
                    } else {
                        b10 = 32;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            String str6 = UICvx.YyhJrEDTMhKLbTT;
            int i20 = 4096;
            String str7 = "audio/raw";
            switch (b10) {
                case 0:
                case 1:
                case 9:
                    byte[] bArr = this.f22900l;
                    listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str7 = "video/mp4v-es";
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null && (nVarA = n.a(new a0(this.P))) != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i21 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i22 = i21 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    } else if (w.t(str3)) {
                        if (this.f22907s == 0) {
                            i18 = this.f22905q;
                            iIntValue = -1;
                            if (i18 == -1) {
                                i18 = this.f22902n;
                            }
                            this.f22905q = i18;
                            i19 = this.f22906r;
                            if (i19 == -1) {
                                i19 = this.f22903o;
                            }
                            this.f22906r = i19;
                        } else {
                            iIntValue = -1;
                        }
                        i16 = this.f22905q;
                        if (i16 != iIntValue || (i17 = this.f22906r) == iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = (this.f22903o * i16) / (this.f22902n * i17);
                        }
                        u7.g gVarA = this.f22914z ? new u7.g.b().d(this.A).c(this.C).e(this.B).f(h()).g(this.f22904p).b(this.f22904p).a() : null;
                        if (this.f22890b != null && e.f22855l0.containsKey(this.f22890b)) {
                            iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                        }
                        if (this.f22908t == 0 || Float.compare(this.f22909u, 0.0f) != 0 || Float.compare(this.f22910v, 0.0f) != 0) {
                            i13 = iIntValue;
                        } else if (Float.compare(this.f22911w, 0.0f) != 0) {
                            if (Float.compare(this.f22911w, 90.0f) == 0) {
                                i13 = 90;
                            } else if (Float.compare(this.f22911w, -180.0f) == 0 || Float.compare(this.f22911w, 180.0f) == 0) {
                                i13 = 180;
                            } else if (Float.compare(this.f22911w, -90.0f) == 0) {
                                i13 = 270;
                            } else {
                                i13 = iIntValue;
                            }
                        }
                        bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                        i15 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !str6.equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                            throw ParserException.b("Unexpected MIME type.", null);
                        }
                        i15 = 3;
                    }
                    if (this.f22890b != null && !e.f22855l0.containsKey(this.f22890b)) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE0 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN = bVarE0.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i22).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE;
                    o0VarE.a(qVarN);
                    return;
                case 2:
                    if (l(new a0(g(this.f22891c)))) {
                        iI0 = l0.i0(this.R);
                        if (iI0 == 0) {
                            x7.r.h("MatroskaExtractor", "Unsupported PCM bit depth: " + this.R + ". Setting mimeType to audio/x-unknown");
                        } else {
                            i11 = iI0;
                            listSingletonList = null;
                            str = null;
                        }
                        i12 = -1;
                        if (this.P != null) {
                            str = nVarA.f27387c;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        i13 = 0;
                        int i23 = (this.X ? 1 : 0) | 0;
                        if (this.W) {
                            i14 = 2;
                        } else {
                            i14 = 0;
                        }
                        int i24 = i23 | i14;
                        bVar = new u7.q.b();
                        if (w.o(str3)) {
                            if (w.t(str3)) {
                                if (this.f22907s == 0) {
                                    i18 = this.f22905q;
                                    iIntValue = -1;
                                    if (i18 == -1) {
                                        i18 = this.f22902n;
                                    }
                                    this.f22905q = i18;
                                    i19 = this.f22906r;
                                    if (i19 == -1) {
                                        i19 = this.f22903o;
                                    }
                                    this.f22906r = i19;
                                } else {
                                    iIntValue = -1;
                                }
                                i16 = this.f22905q;
                                if (i16 != iIntValue) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (this.f22914z) {
                                }
                                if (this.f22890b != null) {
                                    iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                                }
                                if (this.f22908t == 0) {
                                    i13 = iIntValue;
                                } else {
                                    i13 = iIntValue;
                                }
                                bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                                i15 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i15 = 3;
                            }
                            break;
                        } else {
                            bVar.R(this.Q).v0(this.S).o0(i11);
                            i15 = 1;
                        }
                        if (this.f22890b != null) {
                            bVar.h0(this.f22890b);
                        }
                        u7.q.b bVarE1 = bVar.e0(i10);
                        if (this.f22888a) {
                            str4 = "video/webm";
                        } else {
                            str4 = "video/x-matroska";
                        }
                        u7.q qVarN2 = bVarE1.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i24).g0(listSingletonList).S(str).Y(this.f22901m).N();
                        o0 o0VarE2 = rVar.e(this.f22892d, i15);
                        this.Z = o0VarE2;
                        o0VarE2.a(qVarN2);
                        return;
                    }
                    x7.r.h("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    str = null;
                    str7 = "audio/x-unknown";
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i25 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i26 = i25 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE2 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN3 = bVarE2.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i26).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE3 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE3;
                    o0VarE3.a(qVarN3);
                    return;
                case 3:
                    this.V = new p0();
                    str7 = "audio/true-hd";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i27 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i28 = i27 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE3 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN4 = bVarE3.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i28).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE4 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE4;
                    o0VarE4.a(qVarN4);
                    return;
                case 4:
                    listSingletonList = m(g(this.f22891c));
                    str7 = "audio/vorbis";
                    i20 = 8192;
                    str = null;
                    i12 = i20;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i29 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i210 = i29 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE4 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN5 = bVarE4.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i210).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE5 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE5;
                    o0VarE5.a(qVarN5);
                    return;
                case 5:
                    str7 = "audio/mpeg-L2";
                    listSingletonList = null;
                    str = null;
                    i12 = i20;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i211 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i212 = i211 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE5 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN6 = bVarE5.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i212).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE6 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE6;
                    o0VarE6.a(qVarN6);
                    return;
                case 6:
                    str7 = "audio/mpeg";
                    listSingletonList = null;
                    str = null;
                    i12 = i20;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i213 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i214 = i213 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE6 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN7 = bVarE6.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i214).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE7 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE7;
                    o0VarE7.a(qVarN7);
                    return;
                case 7:
                    Pair<String, List<byte[]>> pairK = k(new a0(g(this.f22891c)));
                    str7 = (String) pairK.first;
                    listSingletonList = (List) pairK.second;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i215 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i216 = i215 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE7 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN8 = bVarE7.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i216).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE8 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE8;
                    o0VarE8.a(qVarN8);
                    return;
                case 8:
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(g(this.f22891c), 0, bArr2, 0, 4);
                    listSingletonList = com.google.common.collect.u.I(bArr2);
                    str7 = "application/dvbsubs";
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i217 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i218 = i217 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE8 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN9 = bVarE8.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i218).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE9 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE9;
                    o0VarE9.a(qVarN9);
                    return;
                case 10:
                    v8.d dVarB = v8.d.b(new a0(g(this.f22891c)));
                    list = dVarB.f27271a;
                    this.f22889a0 = dVarB.f27272b;
                    str2 = dVarB.f27282l;
                    str7 = "video/avc";
                    i11 = -1;
                    i12 = -1;
                    List<byte[]> list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i219 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2110 = i219 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE9 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN10 = bVarE9.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i2110).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE10 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE10;
                    o0VarE10.a(qVarN10);
                    return;
                case 11:
                    listSingletonList = com.google.common.collect.u.I(g(this.f22891c));
                    str = null;
                    str7 = "application/vobsub";
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i2111 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2112 = i2111 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE10 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN11 = bVarE10.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i2112).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE11 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE11;
                    o0VarE11.a(qVarN11);
                    return;
                case 12:
                    str7 = "audio/vnd.dts.hd";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i2113 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2114 = i2113 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE11 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN12 = bVarE11.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i2114).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE12 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE12;
                    o0VarE12.a(qVarN12);
                    return;
                case 13:
                    listSingletonList = Collections.singletonList(g(this.f22891c));
                    v8.a.b bVarE = v8.a.e(this.f22900l);
                    this.S = bVarE.f27224a;
                    this.Q = bVarE.f27225b;
                    str = bVarE.f27226c;
                    str7 = zKUlck.uaWDy;
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i2115 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2116 = i2115 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE12 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN13 = bVarE12.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i2116).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE13 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE13;
                    o0VarE13.a(qVarN13);
                    return;
                case 14:
                    str7 = "audio/ac3";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i2117 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2118 = i2117 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE13 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN14 = bVarE13.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i2118).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE14 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE14;
                    o0VarE14.a(qVarN14);
                    return;
                case 15:
                case 21:
                    str7 = "audio/vnd.dts";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i2119 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21110 = i2119 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE14 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN15 = bVarE14.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i21110).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE15 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE15;
                    o0VarE15.a(qVarN15);
                    return;
                case 16:
                    byte[] bArr3 = this.f22900l;
                    listSingletonList = bArr3 == null ? null : com.google.common.collect.u.I(bArr3);
                    str7 = "video/av01";
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i21111 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21112 = i21111 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE15 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN16 = bVarE15.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i21112).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE16 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE16;
                    o0VarE16.a(qVarN16);
                    return;
                case 17:
                    str7 = "video/x-vnd.on2.vp8";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i21113 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21114 = i21113 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE16 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN17 = bVarE16.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i21114).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE17 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE17;
                    o0VarE17.a(qVarN17);
                    return;
                case 18:
                    byte[] bArr4 = this.f22900l;
                    listSingletonList = bArr4 == null ? null : com.google.common.collect.u.I(bArr4);
                    str7 = "video/x-vnd.on2.vp9";
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i21115 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21116 = i21115 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE17 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN18 = bVarE17.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i21116).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE18 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE18;
                    o0VarE18.a(qVarN18);
                    return;
                case 19:
                    str7 = "application/pgs";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i21117 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21118 = i21117 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE18 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN19 = bVarE18.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i21118).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE19 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE19;
                    o0VarE19.a(qVarN19);
                    return;
                case 20:
                    str7 = "video/x-unknown";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i21119 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i211110 = i21119 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE19 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN110 = bVarE19.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i211110).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE110 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE110;
                    o0VarE110.a(qVarN110);
                    return;
                case 22:
                    if (this.R == 32) {
                        listSingletonList = null;
                        str = null;
                        i11 = 4;
                    } else {
                        x7.r.h("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + this.R + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str7 = "audio/x-unknown";
                        i11 = -1;
                    }
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i211111 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i211112 = i211111 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE110 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN111 = bVarE110.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i211112).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE111 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE111;
                    o0VarE111.a(qVarN111);
                    return;
                case 23:
                    int i30 = this.R;
                    if (i30 == 8) {
                        listSingletonList = null;
                        str = null;
                        i11 = 3;
                    } else {
                        if (i30 == 16) {
                            iI0 = 268435456;
                        } else if (i30 == 24) {
                            iI0 = 1342177280;
                        } else if (i30 == 32) {
                            iI0 = 1610612736;
                        } else {
                            x7.r.h("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + this.R + ". Setting mimeType to audio/x-unknown");
                            listSingletonList = null;
                            str = null;
                            str7 = "audio/x-unknown";
                            i11 = -1;
                        }
                        i11 = iI0;
                        listSingletonList = null;
                        str = null;
                    }
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i211113 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i211114 = i211113 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE111 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN112 = bVarE111.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i211114).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE112 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE112;
                    o0VarE112.a(qVarN112);
                    return;
                case 24:
                    iI0 = l0.i0(this.R);
                    if (iI0 == 0) {
                        x7.r.h("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.R + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str7 = "audio/x-unknown";
                        i11 = -1;
                    } else {
                        i11 = iI0;
                        listSingletonList = null;
                        str = null;
                    }
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i211115 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i211116 = i211115 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE112 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN113 = bVarE112.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i211116).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE113 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE113;
                    o0VarE113.a(qVarN113);
                    return;
                case 25:
                    listSingletonList = com.google.common.collect.u.K(e.f22851h0, g(this.f22891c));
                    str = null;
                    str7 = "text/x-ssa";
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i211117 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i211118 = i211117 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE113 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN114 = bVarE113.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i211118).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE114 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE114;
                    o0VarE114.a(qVarN114);
                    return;
                case 26:
                    c0 c0VarA = c0.a(new a0(g(this.f22891c)));
                    list = c0VarA.f27256a;
                    this.f22889a0 = c0VarA.f27257b;
                    str2 = c0VarA.f27269n;
                    str7 = "video/hevc";
                    i11 = -1;
                    i12 = -1;
                    List<byte[]> list3 = list;
                    str = str2;
                    listSingletonList = list3;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i211119 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2111110 = i211119 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE114 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN115 = bVarE114.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i2111110).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE115 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE115;
                    o0VarE115.a(qVarN115);
                    return;
                case 27:
                    listSingletonList = null;
                    str = null;
                    str7 = str6;
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i2111111 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2111112 = i2111111 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE115 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN116 = bVarE115.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i2111112).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE116 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE116;
                    o0VarE116.a(qVarN116);
                    return;
                case 28:
                    str7 = "application/x-subrip";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i2111113 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2111114 = i2111113 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE116 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN117 = bVarE116.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i2111114).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE117 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE117;
                    o0VarE117.a(qVarN117);
                    return;
                case 29:
                    str7 = "video/mpeg2";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i2111115 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2111116 = i2111115 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE117 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN118 = bVarE117.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i2111116).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE118 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE118;
                    o0VarE118.a(qVarN118);
                    return;
                case 30:
                    str7 = "audio/eac3";
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i2111117 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2111118 = i2111117 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE118 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN119 = bVarE118.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i2111118).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE119 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE119;
                    o0VarE119.a(qVarN119);
                    return;
                case 31:
                    listSingletonList = Collections.singletonList(g(this.f22891c));
                    str7 = "audio/flac";
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i2111119 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21111110 = i2111119 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE119 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN1110 = bVarE119.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i21111110).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE1110 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE1110;
                    o0VarE1110.a(qVarN1110);
                    return;
                case 32:
                    listSingletonList = new ArrayList<>(3);
                    listSingletonList.add(g(this.f22891c));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.T).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.U).array());
                    str7 = "audio/opus";
                    i20 = 5760;
                    str = null;
                    i12 = i20;
                    i11 = -1;
                    if (this.P != null) {
                        str = nVarA.f27387c;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    i13 = 0;
                    int i21111111 = (this.X ? 1 : 0) | 0;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21111112 = i21111111 | i14;
                    bVar = new u7.q.b();
                    if (w.o(str3)) {
                        if (w.t(str3)) {
                            if (this.f22907s == 0) {
                                i18 = this.f22905q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f22902n;
                                }
                                this.f22905q = i18;
                                i19 = this.f22906r;
                                if (i19 == -1) {
                                    i19 = this.f22903o;
                                }
                                this.f22906r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f22905q;
                            if (i16 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f22914z) {
                            }
                            if (this.f22890b != null) {
                                iIntValue = ((Integer) e.f22855l0.get(this.f22890b)).intValue();
                            }
                            if (this.f22908t == 0) {
                                i13 = iIntValue;
                            } else {
                                i13 = iIntValue;
                            }
                            bVar.B0(this.f22902n).d0(this.f22903o).q0(f10).t0(i13).r0(this.f22912x).x0(this.f22913y).T(gVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.R(this.Q).v0(this.S).o0(i11);
                        i15 = 1;
                    }
                    if (this.f22890b != null) {
                        bVar.h0(this.f22890b);
                    }
                    u7.q.b bVarE1110 = bVar.e0(i10);
                    if (this.f22888a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    u7.q qVarN1111 = bVarE1110.U(str4).u0(str3).k0(i12).j0(this.Y).w0(i21111112).g0(listSingletonList).S(str).Y(this.f22901m).N();
                    o0 o0VarE1111 = rVar.e(this.f22892d, i15);
                    this.Z = o0VarE1111;
                    o0VarE1111.a(qVarN1111);
                    return;
                default:
                    throw ParserException.b("Unrecognized codec identifier.", null);
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f22855l0 = Collections.unmodifiableMap(map);
    }

    public e(s9.r.a aVar, int i10) {
        this(new n9.a(), i10, aVar);
    }

    private static boolean A(String str) {
        str.hashCode();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p[] C() {
        return new p[]{new e(s9.r.a.f25343a, 2)};
    }

    private boolean D(i0 i0Var, long j10) {
        if (this.B) {
            this.D = j10;
            i0Var.f27344a = this.C;
            this.B = false;
            return true;
        }
        if (this.f22885y) {
            long j11 = this.D;
            if (j11 != -1) {
                i0Var.f27344a = j11;
                this.D = -1L;
                return true;
            }
        }
        return false;
    }

    private void E(q qVar, int i10) throws IOException {
        if (this.f22869i.g() >= i10) {
            return;
        }
        if (this.f22869i.b() < i10) {
            a0 a0Var = this.f22869i;
            a0Var.c(Math.max(a0Var.b() * 2, i10));
        }
        qVar.readFully(this.f22869i.e(), this.f22869i.g(), i10 - this.f22869i.g());
        this.f22869i.V(i10);
    }

    private void F() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.f22857a0 = false;
        this.f22859b0 = 0;
        this.f22861c0 = (byte) 0;
        this.f22863d0 = false;
        this.f22872l.S(0);
    }

    private long G(long j10) throws ParserException {
        long j11 = this.f22880t;
        if (j11 != -9223372036854775807L) {
            return l0.f1(j10, j11, 1000L);
        }
        throw ParserException.b("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private int K(q qVar, c cVar, int i10, boolean z10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f22891c)) {
            L(qVar, f22850g0, i10);
            return s();
        }
        if ("S_TEXT/ASS".equals(cVar.f22891c)) {
            L(qVar, f22852i0, i10);
            return s();
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f22891c)) {
            L(qVar, f22853j0, i10);
            return s();
        }
        o0 o0Var = cVar.Z;
        if (!this.Y) {
            if (cVar.f22897i) {
                this.R &= -1073741825;
                if (!this.Z) {
                    qVar.readFully(this.f22869i.e(), 0, 1);
                    this.V++;
                    if ((this.f22869i.e()[0] & 128) == 128) {
                        throw ParserException.b("Extension bit is set in signal byte", null);
                    }
                    this.f22861c0 = this.f22869i.e()[0];
                    this.Z = true;
                }
                byte b10 = this.f22861c0;
                if ((b10 & 1) == 1) {
                    boolean z11 = (b10 & 2) == 2;
                    this.R |= 1073741824;
                    if (!this.f22863d0) {
                        qVar.readFully(this.f22874n.e(), 0, 8);
                        this.V += 8;
                        this.f22863d0 = true;
                        this.f22869i.e()[0] = (byte) ((z11 ? 128 : 0) | 8);
                        this.f22869i.W(0);
                        o0Var.d(this.f22869i, 1, 1);
                        this.W++;
                        this.f22874n.W(0);
                        o0Var.d(this.f22874n, 8, 1);
                        this.W += 8;
                    }
                    if (z11) {
                        if (!this.f22857a0) {
                            qVar.readFully(this.f22869i.e(), 0, 1);
                            this.V++;
                            this.f22869i.W(0);
                            this.f22859b0 = this.f22869i.H();
                            this.f22857a0 = true;
                        }
                        int i12 = this.f22859b0 * 4;
                        this.f22869i.S(i12);
                        qVar.readFully(this.f22869i.e(), 0, i12);
                        this.V += i12;
                        short s10 = (short) ((this.f22859b0 / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f22877q;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f22877q = ByteBuffer.allocate(i13);
                        }
                        this.f22877q.position(0);
                        this.f22877q.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.f22859b0;
                            if (i14 >= i11) {
                                break;
                            }
                            int iL = this.f22869i.L();
                            if (i14 % 2 == 0) {
                                this.f22877q.putShort((short) (iL - i15));
                            } else {
                                this.f22877q.putInt(iL - i15);
                            }
                            i14++;
                            i15 = iL;
                        }
                        int i16 = (i10 - this.V) - i15;
                        if (i11 % 2 == 1) {
                            this.f22877q.putInt(i16);
                        } else {
                            this.f22877q.putShort((short) i16);
                            this.f22877q.putInt(0);
                        }
                        this.f22875o.U(this.f22877q.array(), i13);
                        o0Var.d(this.f22875o, i13, 1);
                        this.W += i13;
                    }
                }
            } else {
                byte[] bArr = cVar.f22898j;
                if (bArr != null) {
                    this.f22872l.U(bArr, bArr.length);
                }
            }
            if (cVar.o(z10)) {
                this.R |= 268435456;
                this.f22876p.S(0);
                int iG = (this.f22872l.g() + i10) - this.V;
                this.f22869i.S(4);
                this.f22869i.e()[0] = (byte) ((iG >> 24) & 255);
                this.f22869i.e()[1] = (byte) ((iG >> 16) & 255);
                this.f22869i.e()[2] = (byte) ((iG >> 8) & 255);
                this.f22869i.e()[3] = (byte) (iG & 255);
                o0Var.d(this.f22869i, 4, 2);
                this.W += 4;
            }
            this.Y = true;
        }
        int iG2 = i10 + this.f22872l.g();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f22891c) && !"V_MPEGH/ISO/HEVC".equals(cVar.f22891c)) {
            if (cVar.V != null) {
                x7.a.g(this.f22872l.g() == 0);
                cVar.V.d(qVar);
            }
            while (true) {
                int i17 = this.V;
                if (i17 >= iG2) {
                    break;
                }
                int iM = M(qVar, o0Var, iG2 - i17);
                this.V += iM;
                this.W += iM;
            }
        } else {
            byte[] bArrE = this.f22868h.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i18 = cVar.f22889a0;
            int i19 = 4 - i18;
            while (this.V < iG2) {
                int i20 = this.X;
                if (i20 == 0) {
                    N(qVar, bArrE, i19, i18);
                    this.V += i18;
                    this.f22868h.W(0);
                    this.X = this.f22868h.L();
                    this.f22867g.W(0);
                    o0Var.b(this.f22867g, 4);
                    this.W += 4;
                } else {
                    int iM2 = M(qVar, o0Var, i20);
                    this.V += iM2;
                    this.W += iM2;
                    this.X -= iM2;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f22891c)) {
            this.f22870j.W(0);
            o0Var.b(this.f22870j, 4);
            this.W += 4;
        }
        return s();
    }

    private void L(q qVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        if (this.f22873m.b() < length) {
            this.f22873m.T(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f22873m.e(), 0, bArr.length);
        }
        qVar.readFully(this.f22873m.e(), bArr.length, i10);
        this.f22873m.W(0);
        this.f22873m.V(length);
    }

    private int M(q qVar, o0 o0Var, int i10) throws IOException {
        int iA = this.f22872l.a();
        if (iA <= 0) {
            return o0Var.c(qVar, i10, false);
        }
        int iMin = Math.min(i10, iA);
        o0Var.b(this.f22872l, iMin);
        return iMin;
    }

    private void N(q qVar, byte[] bArr, int i10, int i11) throws IOException {
        int iMin = Math.min(i11, this.f22872l.a());
        qVar.readFully(bArr, i10 + iMin, i11 - iMin);
        if (iMin > 0) {
            this.f22872l.l(bArr, i10, iMin);
        }
    }

    private void j(int i10) throws ParserException {
        if (this.F == null || this.G == null) {
            throw ParserException.b("Element " + i10 + " must be in a Cues", null);
        }
    }

    private void k(int i10) throws ParserException {
        if (this.f22884x != null) {
            return;
        }
        throw ParserException.b("Element " + i10 + " must be in a TrackEntry", null);
    }

    private void m() {
        x7.a.i(this.f22865e0);
    }

    private j0 o(s sVar, s sVar2) {
        int i10;
        if (this.f22879s == -1 || this.f22882v == -9223372036854775807L || sVar == null || sVar.d() == 0 || sVar2 == null || sVar2.d() != sVar.d()) {
            return new j0.b(this.f22882v);
        }
        int iD = sVar.d();
        int[] iArrCopyOf = new int[iD];
        long[] jArrCopyOf = new long[iD];
        long[] jArrCopyOf2 = new long[iD];
        long[] jArrCopyOf3 = new long[iD];
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            jArrCopyOf3[i12] = sVar.c(i12);
            jArrCopyOf[i12] = this.f22879s + sVar2.c(i12);
        }
        while (true) {
            i10 = iD - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
            jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
            i11 = i13;
        }
        int i14 = i10;
        while (i14 > 0 && jArrCopyOf3[i14] > this.f22882v) {
            i14--;
        }
        iArrCopyOf[i14] = (int) ((this.f22879s + this.f22878r) - jArrCopyOf[i14]);
        jArrCopyOf2[i14] = this.f22882v - jArrCopyOf3[i14];
        if (i14 < i10) {
            x7.r.h("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
            int i15 = i14 + 1;
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i15);
        }
        return new v8.g(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    private void p(c cVar, long j10, int i10, int i11, int i12) {
        p0 p0Var = cVar.V;
        if (p0Var != null) {
            p0Var.c(cVar.Z, j10, i10, i11, i12, cVar.f22899k);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f22891c) || "S_TEXT/ASS".equals(cVar.f22891c) || "S_TEXT/WEBVTT".equals(cVar.f22891c)) {
                if (this.N > 1) {
                    x7.r.h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.L;
                    if (j11 == -9223372036854775807L) {
                        x7.r.h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        H(cVar.f22891c, j11, this.f22873m.e());
                        for (int iF = this.f22873m.f(); iF < this.f22873m.g(); iF++) {
                            if (this.f22873m.e()[iF] == 0) {
                                this.f22873m.V(iF);
                                break;
                            }
                        }
                        o0 o0Var = cVar.Z;
                        a0 a0Var = this.f22873m;
                        o0Var.b(a0Var, a0Var.g());
                        i11 += this.f22873m.g();
                    }
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.N > 1) {
                    this.f22876p.S(0);
                } else {
                    int iG = this.f22876p.g();
                    cVar.Z.d(this.f22876p, iG, 2);
                    i11 += iG;
                }
            }
            cVar.Z.f(j10, i10, i11, i12, cVar.f22899k);
        }
        this.I = true;
    }

    private static int[] r(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        return iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    private int s() {
        int i10 = this.W;
        F();
        return i10;
    }

    private static byte[] u(long j10, String str, long j11) {
        x7.a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((((long) i10) * 3600) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((((long) i11) * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return l0.u0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
    }

    protected boolean B(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    protected void I(int i10, long j10, long j11) throws ParserException {
        m();
        if (i10 == 160) {
            this.T = false;
            this.U = 0L;
            return;
        }
        if (i10 == 174) {
            c cVar = new c();
            this.f22884x = cVar;
            cVar.f22888a = this.f22883w;
            return;
        }
        if (i10 == 187) {
            this.H = false;
            return;
        }
        if (i10 == 19899) {
            this.f22886z = -1;
            this.A = -1L;
            return;
        }
        if (i10 == 20533) {
            v(i10).f22897i = true;
            return;
        }
        if (i10 == 21968) {
            v(i10).f22914z = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f22879s;
            if (j12 != -1 && j12 != j10) {
                throw ParserException.b("Multiple Segment elements not supported", null);
            }
            this.f22879s = j10;
            this.f22878r = j11;
            return;
        }
        if (i10 == 475249515) {
            this.F = new s();
            this.G = new s();
        } else if (i10 == 524531317 && !this.f22885y) {
            if (this.f22862d && this.C != -1) {
                this.B = true;
            } else {
                this.f22865e0.h(new j0.b(this.f22882v));
                this.f22885y = true;
            }
        }
    }

    protected void J(int i10, String str) throws ParserException {
        if (i10 == 134) {
            v(i10).f22891c = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                v(i10).f22890b = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                v(i10).Y = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.f22883w = Objects.equals(str, "webm");
            return;
        }
        throw ParserException.b("DocType " + str + " not supported", null);
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        this.E = -9223372036854775807L;
        this.J = 0;
        this.f22856a.reset();
        this.f22858b.e();
        F();
        for (int i10 = 0; i10 < this.f22860c.size(); i10++) {
            this.f22860c.valueAt(i10).n();
        }
    }

    @Override // v8.p
    public final void c(r rVar) {
        if (this.f22864e) {
            rVar = new s9.s(rVar, this.f22866f);
        }
        this.f22865e0 = rVar;
    }

    @Override // v8.p
    public final boolean e(q qVar) throws IOException {
        return new f().b(qVar);
    }

    @Override // v8.p
    public final int l(q qVar, i0 i0Var) throws IOException {
        this.I = false;
        boolean zA = true;
        while (zA && !this.I) {
            zA = this.f22856a.a(qVar);
            if (zA && D(i0Var, qVar.getPosition())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f22860c.size(); i10++) {
            c cVarValueAt = this.f22860c.valueAt(i10);
            cVarValueAt.f();
            cVarValueAt.j();
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0288  */
    protected void n(int i10, int i11, q qVar) throws IOException {
        c cVar;
        int i12;
        c cVar2;
        long j10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        int i18 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.J != 2) {
                    return;
                }
                y(this.f22860c.get(this.P), this.S, qVar, i11);
                return;
            }
            if (i10 == 16877) {
                x(v(i10), qVar, i11);
                return;
            }
            if (i10 == 16981) {
                k(i10);
                byte[] bArr = new byte[i11];
                this.f22884x.f22898j = bArr;
                qVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr2 = new byte[i11];
                qVar.readFully(bArr2, 0, i11);
                v(i10).f22899k = new o0.a(1, bArr2, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(this.f22871k.e(), (byte) 0);
                qVar.readFully(this.f22871k.e(), 4 - i11, i11);
                this.f22871k.W(0);
                this.f22886z = (int) this.f22871k.J();
                return;
            }
            if (i10 == 25506) {
                k(i10);
                byte[] bArr3 = new byte[i11];
                this.f22884x.f22900l = bArr3;
                qVar.readFully(bArr3, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw ParserException.b("Unexpected id: " + i10, null);
            }
            k(i10);
            byte[] bArr4 = new byte[i11];
            this.f22884x.f22912x = bArr4;
            qVar.readFully(bArr4, 0, i11);
            return;
        }
        if (this.J == 0) {
            this.P = (int) this.f22858b.d(qVar, false, true, 8);
            this.Q = this.f22858b.b();
            this.L = -9223372036854775807L;
            this.J = 1;
            this.f22869i.S(0);
        }
        c cVar3 = this.f22860c.get(this.P);
        if (cVar3 == null) {
            qVar.k(i11 - this.Q);
            this.J = 0;
            return;
        }
        cVar3.f();
        if (this.J == 1) {
            E(qVar, 3);
            int i19 = (this.f22869i.e()[2] & 6) >> 1;
            byte b10 = 255;
            if (i19 == 0) {
                this.N = 1;
                int[] iArrR = r(this.O, 1);
                this.O = iArrR;
                iArrR[0] = (i11 - this.Q) - 3;
            } else {
                int i20 = 4;
                E(qVar, 4);
                int i21 = (this.f22869i.e()[3] & 255) + 1;
                this.N = i21;
                int[] iArrR2 = r(this.O, i21);
                this.O = iArrR2;
                if (i19 == 2) {
                    int i22 = (i11 - this.Q) - 4;
                    int i23 = this.N;
                    Arrays.fill(iArrR2, 0, i23, i22 / i23);
                } else {
                    if (i19 == 1) {
                        int i24 = 0;
                        int i25 = 0;
                        while (true) {
                            i13 = this.N;
                            if (i24 >= i13 - 1) {
                                break;
                            }
                            this.O[i24] = 0;
                            do {
                                i20++;
                                E(qVar, i20);
                                i14 = this.f22869i.e()[i20 - 1] & 255;
                                int[] iArr = this.O;
                                i15 = iArr[i24] + i14;
                                iArr[i24] = i15;
                            } while (i14 == 255);
                            i25 += i15;
                            i24++;
                        }
                        this.O[i13 - 1] = ((i11 - this.Q) - i20) - i25;
                    } else {
                        if (i19 != 3) {
                            throw ParserException.b("Unexpected lacing value: " + i19, null);
                        }
                        int i26 = 0;
                        int i27 = 0;
                        while (true) {
                            int i28 = this.N;
                            if (i26 >= i28 - 1) {
                                cVar2 = cVar3;
                                this.O[i28 - 1] = ((i11 - this.Q) - i20) - i27;
                                break;
                            }
                            this.O[i26] = i17;
                            i20++;
                            E(qVar, i20);
                            int i29 = i20 - 1;
                            if (this.f22869i.e()[i29] == 0) {
                                throw ParserException.b("No valid varint length mask found", null);
                            }
                            int i30 = i17;
                            while (true) {
                                if (i30 >= 8) {
                                    j10 = 0;
                                    break;
                                }
                                int i31 = i18 << (7 - i30);
                                if ((this.f22869i.e()[i29] & i31) != 0) {
                                    int i32 = i20 + i30;
                                    E(qVar, i32);
                                    j10 = (~i31) & this.f22869i.e()[i29] & b10;
                                    int i33 = i29 + 1;
                                    while (i33 < i32) {
                                        j10 = (j10 << 8) | ((long) (this.f22869i.e()[i33] & b10));
                                        i33++;
                                        i32 = i32;
                                        b10 = 255;
                                    }
                                    int i34 = i32;
                                    if (i26 > 0) {
                                        j10 -= (1 << ((i30 * 7) + 6)) - 1;
                                    }
                                    i20 = i34;
                                    break;
                                }
                                i30++;
                                i18 = 1;
                                b10 = 255;
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                throw ParserException.b("EBML lacing sample size out of range.", null);
                            }
                            int i35 = (int) j10;
                            int[] iArr2 = this.O;
                            if (i26 != 0) {
                                i35 += iArr2[i26 - 1];
                            }
                            iArr2[i26] = i35;
                            i27 += i35;
                            i26++;
                            cVar3 = cVar3;
                            i17 = 0;
                            i18 = 1;
                            b10 = 255;
                        }
                    }
                    this.K = this.E + G((this.f22869i.e()[0] << 8) | (this.f22869i.e()[1] & 255));
                    cVar = cVar2;
                    if (cVar.f22893e != 2 || (i10 == 163 && (this.f22869i.e()[2] & 128) == 128)) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    this.R = i16;
                    this.J = 2;
                    this.M = 0;
                    i12 = 163;
                }
            }
            cVar2 = cVar3;
            this.K = this.E + G((this.f22869i.e()[0] << 8) | (this.f22869i.e()[1] & 255));
            cVar = cVar2;
            if (cVar.f22893e != 2) {
                i16 = 1;
            } else {
                i16 = 1;
            }
            this.R = i16;
            this.J = 2;
            this.M = 0;
            i12 = 163;
        } else {
            cVar = cVar3;
            i12 = 163;
        }
        if (i10 == i12) {
            while (true) {
                int i36 = this.M;
                if (i36 >= this.N) {
                    this.J = 0;
                    return;
                }
                p(cVar, ((long) ((this.M * cVar.f22894f) / 1000)) + this.K, this.R, K(qVar, cVar, this.O[i36], false), 0);
                this.M++;
            }
        } else {
            while (true) {
                int i37 = this.M;
                if (i37 >= this.N) {
                    return;
                }
                int[] iArr3 = this.O;
                iArr3[i37] = K(qVar, cVar, iArr3[i37], true);
                this.M++;
            }
        }
    }

    protected void q(int i10) throws ParserException {
        m();
        if (i10 == 160) {
            if (this.J != 2) {
                return;
            }
            c cVar = this.f22860c.get(this.P);
            cVar.f();
            if (this.U > 0 && "A_OPUS".equals(cVar.f22891c)) {
                this.f22876p.T(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.U).array());
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.N; i12++) {
                i11 += this.O[i12];
            }
            int i13 = 0;
            while (i13 < this.N) {
                long j10 = this.K + ((long) ((cVar.f22894f * i13) / 1000));
                int i14 = this.R;
                if (i13 == 0 && !this.T) {
                    i14 |= 1;
                }
                int i15 = this.O[i13];
                int i16 = i11 - i15;
                p(cVar, j10, i14, i15, i16);
                i13++;
                i11 = i16;
            }
            this.J = 0;
            return;
        }
        if (i10 == 174) {
            c cVar2 = (c) x7.a.i(this.f22884x);
            String str = cVar2.f22891c;
            if (str == null) {
                throw ParserException.b("CodecId is missing in TrackEntry element", null);
            }
            if (A(str)) {
                cVar2.i(this.f22865e0, cVar2.f22892d);
                this.f22860c.put(cVar2.f22892d, cVar2);
            }
            this.f22884x = null;
            return;
        }
        if (i10 == 19899) {
            int i17 = this.f22886z;
            if (i17 != -1) {
                long j11 = this.A;
                if (j11 != -1) {
                    if (i17 == 475249515) {
                        this.C = j11;
                        return;
                    }
                    return;
                }
            }
            throw ParserException.b("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            k(i10);
            c cVar3 = this.f22884x;
            if (cVar3.f22897i) {
                if (cVar3.f22899k == null) {
                    throw ParserException.b("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f22901m = new l(new l.b(u7.f.f26059a, "video/webm", this.f22884x.f22899k.f27404b));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            k(i10);
            c cVar4 = this.f22884x;
            if (cVar4.f22897i && cVar4.f22898j != null) {
                throw ParserException.b("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f22880t == -9223372036854775807L) {
                this.f22880t = 1000000L;
            }
            long j12 = this.f22881u;
            if (j12 != -9223372036854775807L) {
                this.f22882v = G(j12);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f22860c.size() == 0) {
                throw ParserException.b("No valid tracks were found", null);
            }
            this.f22865e0.r();
        } else {
            if (i10 != 475249515) {
                return;
            }
            if (!this.f22885y) {
                this.f22865e0.h(o(this.F, this.G));
                this.f22885y = true;
            }
            this.F = null;
            this.G = null;
        }
    }

    @Override // v8.p
    public final void release() {
    }

    protected void t(int i10, double d10) throws ParserException {
        if (i10 == 181) {
            v(i10).S = (int) d10;
        }
        if (i10 == 17545) {
            this.f22881u = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                v(i10).F = (float) d10;
                break;
            case 21970:
                v(i10).G = (float) d10;
                break;
            case 21971:
                v(i10).H = (float) d10;
                break;
            case 21972:
                v(i10).I = (float) d10;
                break;
            case 21973:
                v(i10).J = (float) d10;
                break;
            case 21974:
                v(i10).K = (float) d10;
                break;
            case 21975:
                v(i10).L = (float) d10;
                break;
            case 21976:
                v(i10).M = (float) d10;
                break;
            case 21977:
                v(i10).N = (float) d10;
                break;
            case 21978:
                v(i10).O = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        v(i10).f22909u = (float) d10;
                        break;
                    case 30324:
                        v(i10).f22910v = (float) d10;
                        break;
                    case 30325:
                        v(i10).f22911w = (float) d10;
                        break;
                }
                break;
        }
    }

    protected c v(int i10) throws ParserException {
        k(i10);
        return this.f22884x;
    }

    protected int w(int i10) {
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
            case PRIVACY_URL_ERROR_VALUE:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case AD_RESPONSE_EMPTY_VALUE:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case STORE_REGION_CODE_ERROR_VALUE:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE:
            case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected void x(c cVar, q qVar, int i10) throws IOException {
        if (cVar.f22896h != 1685485123 && cVar.f22896h != 1685480259) {
            qVar.k(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.P = bArr;
        qVar.readFully(bArr, 0, i10);
    }

    protected void y(c cVar, int i10, q qVar, int i11) throws IOException {
        if (i10 != 4 || !"V_VP9".equals(cVar.f22891c)) {
            qVar.k(i11);
        } else {
            this.f22876p.S(i11);
            qVar.readFully(this.f22876p.e(), 0, i11);
        }
    }

    protected void z(int i10, long j10) throws ParserException {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw ParserException.b("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw ParserException.b("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                v(i10).f22893e = (int) j10;
                return;
            case PRIVACY_URL_ERROR_VALUE:
                v(i10).X = j10 == 1;
                return;
            case 155:
                this.L = G(j10);
                return;
            case 159:
                v(i10).Q = (int) j10;
                return;
            case 176:
                v(i10).f22902n = (int) j10;
                return;
            case 179:
                j(i10);
                this.F.a(G(j10));
                return;
            case 186:
                v(i10).f22903o = (int) j10;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                v(i10).f22892d = (int) j10;
                return;
            case 231:
                this.E = G(j10);
                return;
            case 238:
                this.S = (int) j10;
                return;
            case 241:
                if (this.H) {
                    return;
                }
                j(i10);
                this.G.a(j10);
                this.H = true;
                return;
            case 251:
                this.T = true;
                return;
            case 16871:
                v(i10).f22896h = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw ParserException.b("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw ParserException.b("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw ParserException.b("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw ParserException.b("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw ParserException.b("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.A = j10 + this.f22879s;
                return;
            case 21432:
                int i11 = (int) j10;
                k(i10);
                if (i11 == 0) {
                    this.f22884x.f22913y = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f22884x.f22913y = 2;
                    return;
                } else if (i11 == 3) {
                    this.f22884x.f22913y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f22884x.f22913y = 3;
                    return;
                }
            case 21680:
                v(i10).f22905q = (int) j10;
                return;
            case 21682:
                v(i10).f22907s = (int) j10;
                return;
            case 21690:
                v(i10).f22906r = (int) j10;
                return;
            case 21930:
                v(i10).W = j10 == 1;
                return;
            case 21938:
                k(i10);
                c cVar = this.f22884x;
                cVar.f22914z = true;
                cVar.f22904p = (int) j10;
                return;
            case 21998:
                v(i10).f22895g = (int) j10;
                return;
            case 22186:
                v(i10).T = j10;
                return;
            case 22203:
                v(i10).U = j10;
                return;
            case 25188:
                v(i10).R = (int) j10;
                return;
            case 30114:
                this.U = j10;
                return;
            case 30321:
                k(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f22884x.f22908t = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f22884x.f22908t = 1;
                    return;
                } else if (i12 == 2) {
                    this.f22884x.f22908t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f22884x.f22908t = 3;
                    return;
                }
            case 2352003:
                v(i10).f22894f = (int) j10;
                return;
            case 2807729:
                this.f22880t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        k(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f22884x.C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f22884x.C = 1;
                            return;
                        }
                    case 21946:
                        k(i10);
                        int iK = u7.g.k((int) j10);
                        if (iK != -1) {
                            this.f22884x.B = iK;
                            return;
                        }
                        return;
                    case 21947:
                        k(i10);
                        this.f22884x.f22914z = true;
                        int iJ = u7.g.j((int) j10);
                        if (iJ != -1) {
                            this.f22884x.A = iJ;
                            return;
                        }
                        return;
                    case 21948:
                        v(i10).D = (int) j10;
                        return;
                    case 21949:
                        v(i10).E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    e(n9.c cVar, int i10, s9.r.a aVar) {
        this.f22879s = -1L;
        this.f22880t = -9223372036854775807L;
        this.f22881u = -9223372036854775807L;
        this.f22882v = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.f22856a = cVar;
        cVar.b(new b());
        this.f22866f = aVar;
        this.f22862d = (i10 & 1) == 0;
        this.f22864e = (i10 & 2) == 0;
        this.f22858b = new g();
        this.f22860c = new SparseArray<>();
        this.f22869i = new a0(4);
        this.f22870j = new a0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f22871k = new a0(4);
        this.f22867g = new a0(y7.f.f28694a);
        this.f22868h = new a0(4);
        this.f22872l = new a0();
        this.f22873m = new a0();
        this.f22874n = new a0(8);
        this.f22875o = new a0();
        this.f22876p = new a0();
        this.O = new int[1];
    }

    private static void H(String str, long j10, byte[] bArr) {
        byte[] bArrU;
        int i10;
        str.hashCode();
        byte b10 = -1;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals(WKirgUEJJ.DyFNaZsPJCZx)) {
                    b10 = 0;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    b10 = 1;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    b10 = 2;
                }
                break;
        }
        switch (b10) {
            case 0:
                bArrU = u(j10, "%01d:%02d:%02d:%02d", 10000L);
                i10 = 21;
                break;
            case 1:
                bArrU = u(j10, "%02d:%02d:%02d.%03d", 1000L);
                i10 = 25;
                break;
            case 2:
                bArrU = u(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArrU, 0, bArr, i10, bArrU.length);
    }
}
