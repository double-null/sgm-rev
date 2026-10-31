package t9;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.explorestack.protobuf.openrtb.LossReason;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s9.k;
import s9.o;
import s9.p;
import x7.a0;
import x7.r;

/* JADX INFO: compiled from: Cea608Decoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f25702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f25703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f25704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f25705l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<w7.a> f25708o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<w7.a> f25709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f25710q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f25711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f25712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f25713t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private byte f25714u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte f25715v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f25717x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f25718y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f25700z = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    private static final int[] E = {193, 201, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    private static final int[] F = {195, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 205, 204, 236, 210, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, 123, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 92, 94, 95, 124, 126, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a0 f25701h = new a0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList<C0428a> f25706m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C0428a f25707n = new C0428a(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f25716w = 0;

    /* JADX INFO: renamed from: t9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cea608Decoder.java */
    private static final class C0428a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<C0429a> f25719a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<SpannableString> f25720b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final StringBuilder f25721c = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f25722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f25723e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f25724f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f25725g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f25726h;

        /* JADX INFO: renamed from: t9.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Cea608Decoder.java */
        private static class C0429a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f25727a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f25728b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f25729c;

            public C0429a(int i10, boolean z10, int i11) {
                this.f25727a = i10;
                this.f25728b = z10;
                this.f25729c = i11;
            }
        }

        public C0428a(int i10, int i11) {
            j(i10);
            this.f25726h = i11;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f25721c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f25719a.size()) {
                C0429a c0429a = this.f25719a.get(i14);
                boolean z11 = c0429a.f25728b;
                int i16 = c0429a.f25727a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = a.B[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0429a.f25729c;
                i14++;
                if (i17 != (i14 < this.f25719a.size() ? this.f25719a.get(i14).f25729c : length)) {
                    if (i10 != -1 && !z11) {
                        q(spannableStringBuilder, i10, i17);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        o(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        n(spannableStringBuilder, i15, i17, i12);
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                q(spannableStringBuilder, i10, length);
            }
            if (i11 != -1 && i11 != length) {
                o(spannableStringBuilder, i11, length);
            }
            if (i15 != length) {
                n(spannableStringBuilder, i15, length, i12);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f25721c.length() < 32) {
                this.f25721c.append(c10);
            }
        }

        public void f() {
            int length = this.f25721c.length();
            if (length > 0) {
                this.f25721c.delete(length - 1, length);
                for (int size = this.f25719a.size() - 1; size >= 0; size--) {
                    C0429a c0429a = this.f25719a.get(size);
                    int i10 = c0429a.f25729c;
                    if (i10 != length) {
                        return;
                    }
                    c0429a.f25729c = i10 - 1;
                }
            }
        }

        public w7.a g(int i10) {
            float f10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < this.f25720b.size(); i11++) {
                spannableStringBuilder.append((CharSequence) this.f25720b.get(i11));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i12 = this.f25723e + this.f25724f;
            int length = (32 - i12) - spannableStringBuilder.length();
            int i13 = i12 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f25725g != 2 || (Math.abs(i13) >= 3 && length >= 0)) ? (this.f25725g != 2 || i13 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i12 = 32 - length;
                }
                f10 = ((i12 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i14 = this.f25722d;
            if (i14 > 7) {
                i14 = (i14 - 15) - 2;
            } else if (this.f25725g == 1) {
                i14 -= this.f25726h - 1;
            }
            return new w7.a.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i14, 1).k(f10).l(i10).a();
        }

        public boolean i() {
            return this.f25719a.isEmpty() && this.f25720b.isEmpty() && this.f25721c.length() == 0;
        }

        public void j(int i10) {
            this.f25725g = i10;
            this.f25719a.clear();
            this.f25720b.clear();
            this.f25721c.setLength(0);
            this.f25722d = 15;
            this.f25723e = 0;
            this.f25724f = 0;
        }

        public void k() {
            this.f25720b.add(h());
            this.f25721c.setLength(0);
            this.f25719a.clear();
            int iMin = Math.min(this.f25726h, this.f25722d);
            while (this.f25720b.size() >= iMin) {
                this.f25720b.remove(0);
            }
        }

        public void l(int i10) {
            this.f25725g = i10;
        }

        public void m(int i10) {
            this.f25726h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f25719a.add(new C0429a(i10, z10, this.f25721c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            x7.a.a(j10 >= 16000);
            this.f25705l = j10 * 1000;
        } else {
            this.f25705l = -9223372036854775807L;
        }
        this.f25702i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f25704k = 0;
            this.f25703j = 0;
        } else if (i10 == 2) {
            this.f25704k = 1;
            this.f25703j = 0;
        } else if (i10 == 3) {
            this.f25704k = 0;
            this.f25703j = 1;
        } else if (i10 != 4) {
            r.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f25704k = 0;
            this.f25703j = 0;
        } else {
            this.f25704k = 1;
            this.f25703j = 1;
        }
        O(0);
        N();
        this.f25717x = true;
        this.f25718y = -9223372036854775807L;
    }

    private void A(byte b10, byte b11) {
        int i10 = f25700z[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f25707n.f25722d) {
            if (this.f25710q != 1 && !this.f25707n.i()) {
                C0428a c0428a = new C0428a(this.f25710q, this.f25711r);
                this.f25707n = c0428a;
                this.f25706m.add(c0428a);
            }
            this.f25707n.f25722d = i10;
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f25707n.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f25707n.f25723e = A[i11];
        }
    }

    private static boolean B(byte b10) {
        return (b10 & 224) == 0;
    }

    private static boolean C(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    private static boolean D(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean E(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private static boolean F(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean G(byte b10) {
        return (b10 & 240) == 16;
    }

    private boolean H(boolean z10, byte b10, byte b11) {
        if (!z10 || !G(b10)) {
            this.f25713t = false;
        } else {
            if (this.f25713t && this.f25714u == b10 && this.f25715v == b11) {
                this.f25713t = false;
                return true;
            }
            this.f25713t = true;
            this.f25714u = b10;
            this.f25715v = b11;
        }
        return false;
    }

    private static boolean I(byte b10) {
        return (b10 & 246) == 20;
    }

    private static boolean J(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean K(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private static boolean L(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    private void M(byte b10, byte b11) {
        if (L(b10)) {
            this.f25717x = false;
            return;
        }
        if (I(b10)) {
            if (b11 != 32 && b11 != 47) {
                switch (b11) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b11) {
                            case 42:
                            case 43:
                                this.f25717x = false;
                                break;
                        }
                }
            }
            this.f25717x = true;
        }
    }

    private void N() {
        this.f25707n.j(this.f25710q);
        this.f25706m.clear();
        this.f25706m.add(this.f25707n);
    }

    private void O(int i10) {
        int i11 = this.f25710q;
        if (i11 == i10) {
            return;
        }
        this.f25710q = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f25706m.size(); i12++) {
                this.f25706m.get(i12).l(i10);
            }
            return;
        }
        N();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f25708o = Collections.emptyList();
        }
    }

    private void P(int i10) {
        this.f25711r = i10;
        this.f25707n.m(i10);
    }

    private boolean Q() {
        return (this.f25705l == -9223372036854775807L || this.f25718y == -9223372036854775807L || l() - this.f25718y < this.f25705l) ? false : true;
    }

    private boolean R(byte b10) {
        if (B(b10)) {
            this.f25716w = s(b10);
        }
        return this.f25716w == this.f25704k;
    }

    private static char r(byte b10) {
        return (char) C[(b10 & 127) - 32];
    }

    private static int s(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List<w7.a> t() {
        int size = this.f25706m.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            w7.a aVarG = this.f25706m.get(i10).g(Integer.MIN_VALUE);
            arrayList.add(aVarG);
            if (aVarG != null) {
                iMin = Math.min(iMin, aVarG.f27551i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            w7.a aVar = (w7.a) arrayList.get(i11);
            if (aVar != null) {
                if (aVar.f27551i != iMin) {
                    aVar = (w7.a) x7.a.e(this.f25706m.get(i11).g(iMin));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    private static char u(byte b10) {
        return (char) E[b10 & 31];
    }

    private static char v(byte b10) {
        return (char) F[b10 & 31];
    }

    private static char w(byte b10, byte b11) {
        return (b10 & 1) == 0 ? u(b11) : v(b11);
    }

    private static char x(byte b10) {
        return (char) D[b10 & 15];
    }

    private void y(byte b10) {
        this.f25707n.e(' ');
        this.f25707n.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private void z(byte b10) {
        if (b10 == 32) {
            O(2);
            return;
        }
        if (b10 == 41) {
            O(3);
            return;
        }
        switch (b10) {
            case 37:
                O(1);
                P(2);
                break;
            case 38:
                O(1);
                P(3);
                break;
            case 39:
                O(1);
                P(4);
                break;
            default:
                int i10 = this.f25710q;
                if (i10 != 0) {
                    if (b10 != 33) {
                        switch (b10) {
                            case 44:
                                this.f25708o = Collections.emptyList();
                                int i11 = this.f25710q;
                                if (i11 == 1 || i11 == 3) {
                                    N();
                                }
                                break;
                            case 45:
                                if (i10 == 1 && !this.f25707n.i()) {
                                    this.f25707n.k();
                                    break;
                                }
                                break;
                            case 46:
                                N();
                                break;
                            case 47:
                                this.f25708o = t();
                                N();
                                break;
                        }
                    } else {
                        this.f25707n.f();
                        break;
                    }
                }
                break;
        }
    }

    @Override // t9.e, s9.l
    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    @Override // t9.e, a8.d
    public void flush() {
        super.flush();
        this.f25708o = null;
        this.f25709p = null;
        O(0);
        P(4);
        N();
        this.f25712s = false;
        this.f25713t = false;
        this.f25714u = (byte) 0;
        this.f25715v = (byte) 0;
        this.f25716w = 0;
        this.f25717x = true;
        this.f25718y = -9223372036854775807L;
    }

    @Override // t9.e
    protected k g() {
        List<w7.a> list = this.f25708o;
        this.f25709p = list;
        return new f((List) x7.a.e(list));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // t9.e
    protected void h(o oVar) {
        boolean z10;
        ByteBuffer byteBuffer = (ByteBuffer) x7.a.e(oVar.f18057d);
        this.f25701h.U(byteBuffer.array(), byteBuffer.limit());
        boolean z11 = false;
        while (true) {
            int iA = this.f25701h.a();
            int i10 = this.f25702i;
            if (iA < i10) {
                break;
            }
            int iH = i10 == 2 ? -4 : this.f25701h.H();
            int iH2 = this.f25701h.H();
            int iH3 = this.f25701h.H();
            if ((iH & 2) == 0 && (iH & 1) == this.f25703j) {
                byte b10 = (byte) (iH2 & 127);
                byte b11 = (byte) (iH3 & 127);
                if (b10 != 0 || b11 != 0) {
                    boolean z12 = this.f25712s;
                    if ((iH & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[iH2] && zArr[iH3]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    this.f25712s = z10;
                    if (!H(z10, b10, b11)) {
                        if (this.f25712s) {
                            M(b10, b11);
                            if (this.f25717x && R(b10)) {
                                if (!B(b10)) {
                                    this.f25707n.e(r(b10));
                                    if ((b11 & 224) != 0) {
                                        this.f25707n.e(r(b11));
                                    }
                                } else if (J(b10, b11)) {
                                    this.f25707n.e(x(b11));
                                } else if (C(b10, b11)) {
                                    this.f25707n.f();
                                    this.f25707n.e(w(b10, b11));
                                } else if (D(b10, b11)) {
                                    y(b11);
                                } else if (F(b10, b11)) {
                                    A(b10, b11);
                                } else if (K(b10, b11)) {
                                    this.f25707n.f25724f = b11 - 32;
                                } else if (E(b10, b11)) {
                                    z(b11);
                                }
                                z11 = true;
                            }
                        } else if (z12) {
                            N();
                            z11 = true;
                        }
                    }
                }
            }
        }
        if (z11) {
            int i11 = this.f25710q;
            if (i11 == 1 || i11 == 3) {
                this.f25708o = t();
                this.f25718y = l();
            }
        }
    }

    @Override // t9.e
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ o e() throws SubtitleDecoderException {
        return super.e();
    }

    @Override // t9.e, a8.d
    /* JADX INFO: renamed from: j */
    public p a() throws SubtitleDecoderException {
        p pVarK;
        p pVarA = super.a();
        if (pVarA != null) {
            return pVarA;
        }
        if (!Q() || (pVarK = k()) == null) {
            return null;
        }
        this.f25708o = Collections.emptyList();
        this.f25718y = -9223372036854775807L;
        pVarK.q(l(), g(), Long.MAX_VALUE);
        return pVarK;
    }

    @Override // t9.e
    protected boolean m() {
        return this.f25708o != this.f25709p;
    }

    @Override // t9.e
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void c(o oVar) throws SubtitleDecoderException {
        super.c(oVar);
    }

    @Override // t9.e, a8.d
    public void release() {
    }
}
