package t9;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.applovin.shadow.okio.Utf8;
import io.bidmachine.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import s9.k;
import s9.o;
import s9.p;
import x7.a0;
import x7.i;
import x7.r;
import x7.z;

/* JADX INFO: compiled from: Cea708Decoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a0 f25730h = new a0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z f25731i = new z();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25732j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f25733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f25734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b[] f25735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b f25736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<w7.a> f25737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<w7.a> f25738p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C0430c f25739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f25740r;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: Cea708Decoder.java */
    static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f25741c = new Comparator() { // from class: t9.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.a.c((c.a) obj, (c.a) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w7.a f25742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25743b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            w7.a.b bVarN = new w7.a.b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                bVarN.s(i13);
            }
            this.f25742a = bVarN.a();
            this.f25743b = i14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int c(a aVar, a aVar2) {
            return Integer.compare(aVar2.f25743b, aVar.f25743b);
        }
    }

    /* JADX INFO: compiled from: Cea708Decoder.java */
    private static final class b {
        private static final int[] A;
        private static final boolean[] B;
        private static final int[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f25744v = h(2, 2, 2, 0);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f25745w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f25746x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final int[] f25747y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int[] f25748z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<SpannableString> f25749a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f25750b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f25751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f25752d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f25753e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f25754f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f25755g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f25756h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f25757i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f25758j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f25759k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f25760l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f25761m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f25762n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f25763o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f25764p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f25765q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f25766r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f25767s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f25768t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f25769u;

        static {
            int iH = h(0, 0, 0, 0);
            f25745w = iH;
            int iH2 = h(0, 0, 0, 3);
            f25746x = iH2;
            f25747y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f25748z = new int[]{0, 0, 0, 0, 0, 0, 2};
            A = new int[]{3, 3, 3, 3, 3, 3, 1};
            B = new boolean[]{false, false, false, true, true, true, false};
            C = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            D = new int[]{0, 1, 2, 3, 4, 3, 4};
            E = new int[]{0, 0, 0, 0, 0, 3, 3};
            F = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0021  */
        public static int h(int i10, int i11, int i12, int i13) {
            int i14;
            x7.a.c(i10, 0, 4);
            x7.a.c(i11, 0, 4);
            x7.a.c(i12, 0, 4);
            x7.a.c(i13, 0, 4);
            if (i13 == 0 || i13 == 1) {
                i14 = 255;
            } else if (i13 == 2) {
                i14 = 127;
            } else if (i13 != 3) {
                i14 = 255;
            } else {
                i14 = 0;
            }
            return Color.argb(i14, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f25750b.append(c10);
                return;
            }
            this.f25749a.add(d());
            this.f25750b.clear();
            if (this.f25763o != -1) {
                this.f25763o = 0;
            }
            if (this.f25764p != -1) {
                this.f25764p = 0;
            }
            if (this.f25765q != -1) {
                this.f25765q = 0;
            }
            if (this.f25767s != -1) {
                this.f25767s = 0;
            }
            while (true) {
                if (this.f25749a.size() < this.f25758j && this.f25749a.size() < 15) {
                    this.f25769u = this.f25749a.size();
                    return;
                }
                this.f25749a.remove(0);
            }
        }

        public void b() {
            int length = this.f25750b.length();
            if (length > 0) {
                this.f25750b.delete(length - 1, length);
            }
        }

        public a c() {
            Layout.Alignment alignment;
            float f10;
            float f11;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < this.f25749a.size(); i10++) {
                spannableStringBuilder.append((CharSequence) this.f25749a.get(i10));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i11 = this.f25759k;
            if (i11 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i11 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f25759k);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.f25754f) {
                f10 = this.f25756h / 99.0f;
                f11 = this.f25755g / 99.0f;
            } else {
                f10 = this.f25756h / 209.0f;
                f11 = this.f25755g / 74.0f;
            }
            float f12 = (f10 * 0.9f) + 0.05f;
            float f13 = (f11 * 0.9f) + 0.05f;
            int i12 = this.f25757i;
            return new a(spannableStringBuilder, alignment2, f13, 0, i12 / 3 == 0 ? 0 : i12 / 3 == 1 ? 1 : 2, f12, i12 % 3 == 0 ? 0 : i12 % 3 == 1 ? 1 : 2, -3.4028235E38f, this.f25762n != f25745w, this.f25762n, this.f25753e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f25750b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f25763o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f25763o, length, 33);
                }
                if (this.f25764p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f25764p, length, 33);
                }
                if (this.f25765q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f25766r), this.f25765q, length, 33);
                }
                if (this.f25767s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f25768t), this.f25767s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f25749a.clear();
            this.f25750b.clear();
            this.f25763o = -1;
            this.f25764p = -1;
            this.f25765q = -1;
            this.f25767s = -1;
            this.f25769u = 0;
        }

        public void f(boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f25751c = true;
            this.f25752d = z10;
            this.f25753e = i10;
            this.f25754f = z11;
            this.f25755g = i11;
            this.f25756h = i12;
            this.f25757i = i14;
            int i17 = i13 + 1;
            if (this.f25758j != i17) {
                this.f25758j = i17;
                while (true) {
                    if (this.f25749a.size() < this.f25758j && this.f25749a.size() < 15) {
                        break;
                    } else {
                        this.f25749a.remove(0);
                    }
                }
            }
            if (i15 != 0 && this.f25760l != i15) {
                this.f25760l = i15;
                int i18 = i15 - 1;
                q(C[i18], f25746x, B[i18], 0, f25748z[i18], A[i18], f25747y[i18]);
            }
            if (i16 == 0 || this.f25761m == i16) {
                return;
            }
            this.f25761m = i16;
            int i19 = i16 - 1;
            m(0, 1, 1, false, false, E[i19], D[i19]);
            n(f25744v, F[i19], f25745w);
        }

        public boolean i() {
            return this.f25751c;
        }

        public boolean j() {
            return !i() || (this.f25749a.isEmpty() && this.f25750b.length() == 0);
        }

        public boolean k() {
            return this.f25752d;
        }

        public void l() {
            e();
            this.f25751c = false;
            this.f25752d = false;
            this.f25753e = 4;
            this.f25754f = false;
            this.f25755g = 0;
            this.f25756h = 0;
            this.f25757i = 0;
            this.f25758j = 15;
            this.f25759k = 0;
            this.f25760l = 0;
            this.f25761m = 0;
            int i10 = f25745w;
            this.f25762n = i10;
            this.f25766r = f25744v;
            this.f25768t = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f25763o != -1) {
                if (!z10) {
                    this.f25750b.setSpan(new StyleSpan(2), this.f25763o, this.f25750b.length(), 33);
                    this.f25763o = -1;
                }
            } else if (z10) {
                this.f25763o = this.f25750b.length();
            }
            if (this.f25764p == -1) {
                if (z11) {
                    this.f25764p = this.f25750b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f25750b.setSpan(new UnderlineSpan(), this.f25764p, this.f25750b.length(), 33);
                this.f25764p = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f25765q != -1 && this.f25766r != i10) {
                this.f25750b.setSpan(new ForegroundColorSpan(this.f25766r), this.f25765q, this.f25750b.length(), 33);
            }
            if (i10 != f25744v) {
                this.f25765q = this.f25750b.length();
                this.f25766r = i10;
            }
            if (this.f25767s != -1 && this.f25768t != i11) {
                this.f25750b.setSpan(new BackgroundColorSpan(this.f25768t), this.f25767s, this.f25750b.length(), 33);
            }
            if (i11 != f25745w) {
                this.f25767s = this.f25750b.length();
                this.f25768t = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f25769u != i10) {
                a('\n');
            }
            this.f25769u = i10;
        }

        public void p(boolean z10) {
            this.f25752d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f25762n = i10;
            this.f25759k = i15;
        }
    }

    /* JADX INFO: renamed from: t9.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cea708Decoder.java */
    private static final class C0430c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f25770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f25772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f25773d = 0;

        public C0430c(int i10, int i11) {
            this.f25770a = i10;
            this.f25771b = i11;
            this.f25772c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, List<byte[]> list) {
        this.f25734l = i10 == -1 ? 1 : i10;
        this.f25733k = list != null && i.v(list);
        this.f25735m = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f25735m[i11] = new b();
        }
        this.f25736n = this.f25735m[0];
    }

    private void A(int i10) {
        if (i10 == 160) {
            this.f25736n.a((char) 13252);
            return;
        }
        r.h("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f25736n.a('_');
    }

    private void B() {
        this.f25736n.m(this.f25731i.h(4), this.f25731i.h(2), this.f25731i.h(2), this.f25731i.g(), this.f25731i.g(), this.f25731i.h(3), this.f25731i.h(3));
    }

    private void C() {
        int iH = b.h(this.f25731i.h(2), this.f25731i.h(2), this.f25731i.h(2), this.f25731i.h(2));
        int iH2 = b.h(this.f25731i.h(2), this.f25731i.h(2), this.f25731i.h(2), this.f25731i.h(2));
        this.f25731i.r(2);
        this.f25736n.n(iH, iH2, b.g(this.f25731i.h(2), this.f25731i.h(2), this.f25731i.h(2)));
    }

    private void D() {
        this.f25731i.r(4);
        int iH = this.f25731i.h(4);
        this.f25731i.r(2);
        this.f25736n.o(iH, this.f25731i.h(6));
    }

    private void E() {
        int iH = b.h(this.f25731i.h(2), this.f25731i.h(2), this.f25731i.h(2), this.f25731i.h(2));
        int iH2 = this.f25731i.h(2);
        int iG = b.g(this.f25731i.h(2), this.f25731i.h(2), this.f25731i.h(2));
        if (this.f25731i.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f25731i.g();
        int iH3 = this.f25731i.h(2);
        int iH4 = this.f25731i.h(2);
        int iH5 = this.f25731i.h(2);
        this.f25731i.r(8);
        this.f25736n.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    private void F() {
        C0430c c0430c = this.f25739q;
        if (c0430c.f25773d != (c0430c.f25771b * 2) - 1) {
            r.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f25739q.f25771b * 2) - 1) + ", but current index is " + this.f25739q.f25773d + " (sequence number " + this.f25739q.f25770a + ");");
        }
        z zVar = this.f25731i;
        C0430c c0430c2 = this.f25739q;
        zVar.o(c0430c2.f25772c, c0430c2.f25773d);
        boolean z10 = false;
        while (this.f25731i.b() > 0) {
            int iH = this.f25731i.h(3);
            int iH2 = this.f25731i.h(5);
            if (iH == 7) {
                this.f25731i.r(2);
                iH = this.f25731i.h(6);
                if (iH < 7) {
                    r.h("Cea708Decoder", "Invalid extended service number: " + iH);
                }
            }
            if (iH2 == 0) {
                if (iH == 0) {
                    break;
                }
                r.h("Cea708Decoder", "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                break;
            }
            if (iH != this.f25734l) {
                this.f25731i.s(iH2);
            } else {
                int iE = this.f25731i.e() + (iH2 * 8);
                while (this.f25731i.e() < iE) {
                    int iH3 = this.f25731i.h(8);
                    if (iH3 == 16) {
                        int iH4 = this.f25731i.h(8);
                        if (iH4 <= 31) {
                            u(iH4);
                        } else {
                            if (iH4 <= 127) {
                                z(iH4);
                            } else if (iH4 <= 159) {
                                v(iH4);
                            } else if (iH4 <= 255) {
                                A(iH4);
                            } else {
                                r.h("Cea708Decoder", "Invalid extended command: " + iH4);
                            }
                            z10 = true;
                        }
                    } else if (iH3 <= 31) {
                        s(iH3);
                    } else {
                        if (iH3 <= 127) {
                            x(iH3);
                        } else if (iH3 <= 159) {
                            t(iH3);
                        } else if (iH3 <= 255) {
                            y(iH3);
                        } else {
                            r.h("Cea708Decoder", "Invalid base command: " + iH3);
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            this.f25737o = r();
        }
    }

    private void G() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f25735m[i10].l();
        }
    }

    private void q() {
        if (this.f25739q == null) {
            return;
        }
        F();
        this.f25739q = null;
    }

    private List<w7.a> r() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f25735m[i10].j() && this.f25735m[i10].k() && (aVarC = this.f25735m[i10].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.f25741c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f25742a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void s(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f25737o = r();
            }
            if (i10 == 8) {
                this.f25736n.b();
                return;
            }
            switch (i10) {
                case 12:
                    G();
                    break;
                case 13:
                    this.f25736n.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        r.h("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f25731i.r(8);
                    } else if (i10 >= 24 && i10 <= 31) {
                        r.h("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f25731i.r(16);
                    } else {
                        r.h("Cea708Decoder", "Invalid C0 command: " + i10);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void t(int i10) {
        int i11 = 1;
        switch (i10) {
            case 128:
            case EMPTY_TPAT_ERROR_VALUE:
            case MRAID_DOWNLOAD_JS_ERROR_VALUE:
            case MRAID_JS_WRITE_FAILED_VALUE:
            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
            case OMSDK_JS_WRITE_FAILED_VALUE:
            case STORE_REGION_CODE_ERROR_VALUE:
            case INVALID_CONFIG_RESPONSE_VALUE:
                int i12 = i10 - 128;
                if (this.f25740r != i12) {
                    this.f25740r = i12;
                    this.f25736n = this.f25735m[i12];
                }
                break;
            case PRIVACY_URL_ERROR_VALUE:
                while (i11 <= 8) {
                    if (this.f25731i.g()) {
                        this.f25735m[8 - i11].e();
                    }
                    i11++;
                }
                break;
            case TPAT_RETRY_FAILED_VALUE:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f25731i.g()) {
                        this.f25735m[8 - i13].p(true);
                    }
                }
                break;
            case CONFIG_REFRESH_FAILED_VALUE:
                while (i11 <= 8) {
                    if (this.f25731i.g()) {
                        this.f25735m[8 - i11].p(false);
                    }
                    i11++;
                }
                break;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f25731i.g()) {
                        b bVar = this.f25735m[8 - i14];
                        bVar.p(!bVar.k());
                    }
                }
                break;
            case 140:
                while (i11 <= 8) {
                    if (this.f25731i.g()) {
                        this.f25735m[8 - i11].l();
                    }
                    i11++;
                }
                break;
            case 141:
                this.f25731i.r(8);
                break;
            case 142:
                break;
            case 143:
                G();
                break;
            case 144:
                if (this.f25736n.i()) {
                    B();
                } else {
                    this.f25731i.r(16);
                }
                break;
            case 145:
                if (this.f25736n.i()) {
                    C();
                } else {
                    this.f25731i.r(24);
                }
                break;
            case 146:
                if (this.f25736n.i()) {
                    D();
                } else {
                    this.f25731i.r(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                r.h("Cea708Decoder", "Invalid C1 command: " + i10);
                break;
            case 151:
                if (this.f25736n.i()) {
                    E();
                } else {
                    this.f25731i.r(32);
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i15 = i10 - 152;
                w(i15);
                if (this.f25740r != i15) {
                    this.f25740r = i15;
                    this.f25736n = this.f25735m[i15];
                }
                break;
        }
    }

    private void u(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f25731i.r(8);
        } else if (i10 <= 23) {
            this.f25731i.r(16);
        } else if (i10 <= 31) {
            this.f25731i.r(24);
        }
    }

    private void v(int i10) {
        if (i10 <= 135) {
            this.f25731i.r(32);
            return;
        }
        if (i10 <= 143) {
            this.f25731i.r(40);
        } else if (i10 <= 159) {
            this.f25731i.r(2);
            this.f25731i.r(this.f25731i.h(6) * 8);
        }
    }

    private void w(int i10) {
        b bVar = this.f25735m[i10];
        this.f25731i.r(2);
        boolean zG = this.f25731i.g();
        this.f25731i.r(2);
        int iH = this.f25731i.h(3);
        boolean zG2 = this.f25731i.g();
        int iH2 = this.f25731i.h(7);
        int iH3 = this.f25731i.h(8);
        int iH4 = this.f25731i.h(4);
        int iH5 = this.f25731i.h(4);
        this.f25731i.r(2);
        this.f25731i.r(6);
        this.f25731i.r(2);
        bVar.f(zG, iH, zG2, iH2, iH3, iH5, iH4, this.f25731i.h(3), this.f25731i.h(3));
    }

    private void x(int i10) {
        if (i10 == 127) {
            this.f25736n.a((char) 9835);
        } else {
            this.f25736n.a((char) (i10 & 255));
        }
    }

    private void y(int i10) {
        this.f25736n.a((char) (i10 & 255));
    }

    private void z(int i10) {
        if (i10 == 32) {
            this.f25736n.a(' ');
        }
        if (i10 == 33) {
            this.f25736n.a((char) 160);
            return;
        }
        if (i10 == 37) {
            this.f25736n.a((char) 8230);
            return;
        }
        if (i10 == 42) {
            this.f25736n.a((char) 352);
            return;
        }
        if (i10 == 44) {
            this.f25736n.a((char) 338);
            return;
        }
        if (i10 == 63) {
            this.f25736n.a((char) 376);
            return;
        }
        if (i10 == 57) {
            this.f25736n.a((char) 8482);
            return;
        }
        if (i10 == 58) {
            this.f25736n.a((char) 353);
            return;
        }
        if (i10 == 60) {
            this.f25736n.a((char) 339);
            return;
        }
        if (i10 == 61) {
            this.f25736n.a((char) 8480);
            return;
        }
        switch (i10) {
            case 48:
                this.f25736n.a((char) 9608);
                break;
            case 49:
                this.f25736n.a((char) 8216);
                break;
            case 50:
                this.f25736n.a((char) 8217);
                break;
            case 51:
                this.f25736n.a((char) 8220);
                break;
            case 52:
                this.f25736n.a((char) 8221);
                break;
            case 53:
                this.f25736n.a((char) 8226);
                break;
            default:
                switch (i10) {
                    case 118:
                        this.f25736n.a((char) 8539);
                        break;
                    case 119:
                        this.f25736n.a((char) 8540);
                        break;
                    case 120:
                        this.f25736n.a((char) 8541);
                        break;
                    case 121:
                        this.f25736n.a((char) 8542);
                        break;
                    case 122:
                        this.f25736n.a((char) 9474);
                        break;
                    case 123:
                        this.f25736n.a((char) 9488);
                        break;
                    case 124:
                        this.f25736n.a((char) 9492);
                        break;
                    case INVALID_METRICS_ENDPOINT_VALUE:
                        this.f25736n.a((char) 9472);
                        break;
                    case 126:
                        this.f25736n.a((char) 9496);
                        break;
                    case 127:
                        this.f25736n.a((char) 9484);
                        break;
                    default:
                        r.h("Cea708Decoder", "Invalid G2 character: " + i10);
                        break;
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
        this.f25737o = null;
        this.f25738p = null;
        this.f25740r = 0;
        this.f25736n = this.f25735m[0];
        G();
        this.f25739q = null;
    }

    @Override // t9.e
    protected k g() {
        List<w7.a> list = this.f25737o;
        this.f25738p = list;
        return new f((List) x7.a.e(list));
    }

    @Override // t9.e
    protected void h(o oVar) {
        ByteBuffer byteBuffer = (ByteBuffer) x7.a.e(oVar.f18057d);
        this.f25730h.U(byteBuffer.array(), byteBuffer.limit());
        while (this.f25730h.a() >= 3) {
            int iH = this.f25730h.H() & 7;
            int i10 = iH & 3;
            boolean z10 = (iH & 4) == 4;
            byte bH = (byte) this.f25730h.H();
            byte bH2 = (byte) this.f25730h.H();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        q();
                        int i11 = (bH & 192) >> 6;
                        int i12 = this.f25732j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            G();
                            r.h("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f25732j + " current=" + i11);
                        }
                        this.f25732j = i11;
                        int i13 = bH & Utf8.REPLACEMENT_BYTE;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C0430c c0430c = new C0430c(i11, i13);
                        this.f25739q = c0430c;
                        byte[] bArr = c0430c.f25772c;
                        int i14 = c0430c.f25773d;
                        c0430c.f25773d = i14 + 1;
                        bArr[i14] = bH2;
                    } else {
                        x7.a.a(i10 == 2);
                        C0430c c0430c2 = this.f25739q;
                        if (c0430c2 == null) {
                            r.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0430c2.f25772c;
                            int i15 = c0430c2.f25773d;
                            int i16 = i15 + 1;
                            bArr2[i15] = bH;
                            c0430c2.f25773d = i16 + 1;
                            bArr2[i16] = bH2;
                        }
                    }
                    C0430c c0430c3 = this.f25739q;
                    if (c0430c3.f25773d == (c0430c3.f25771b * 2) - 1) {
                        q();
                    }
                }
            }
        }
    }

    @Override // t9.e
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ o e() throws SubtitleDecoderException {
        return super.e();
    }

    @Override // t9.e
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ p a() throws SubtitleDecoderException {
        return super.a();
    }

    @Override // t9.e
    protected boolean m() {
        return this.f25737o != this.f25738p;
    }

    @Override // t9.e
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void c(o oVar) throws SubtitleDecoderException {
        super.c(oVar);
    }

    @Override // t9.e, a8.d
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
