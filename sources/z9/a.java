package z9;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.collect.u;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import s9.e;
import s9.r;
import x7.a0;
import x7.l;
import x7.l0;

/* JADX INFO: compiled from: Tx3gParser.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f29079a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f29080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f29081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f29083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f29084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f29085g;

    public a(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f29081c = 0;
            this.f29082d = -1;
            this.f29083e = "sans-serif";
            this.f29080b = false;
            this.f29084f = 0.85f;
            this.f29085g = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f29081c = bArr[24];
        this.f29082d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f29083e = "Serif".equals(l0.I(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f29085g = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f29080b = z10;
        if (z10) {
            this.f29084f = l0.o(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f29084f = 0.85f;
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    private static void g(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String h(a0 a0Var) {
        x7.a.a(a0Var.a() >= 2);
        int iP = a0Var.P();
        if (iP == 0) {
            return "";
        }
        int iF = a0Var.f();
        Charset charsetR = a0Var.R();
        int iF2 = iP - (a0Var.f() - iF);
        if (charsetR == null) {
            charsetR = StandardCharsets.UTF_8;
        }
        return a0Var.F(iF2, charsetR);
    }

    @Override // s9.r
    public void b(byte[] bArr, int i10, int i11, r.b bVar, l<e> lVar) {
        this.f29079a.U(bArr, i10 + i11);
        this.f29079a.W(i10);
        String strH = h(this.f29079a);
        if (strH.isEmpty()) {
            lVar.accept(new e(u.H(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strH);
        f(spannableStringBuilder, this.f29081c, 0, 0, spannableStringBuilder.length(), 16711680);
        e(spannableStringBuilder, this.f29082d, -1, 0, spannableStringBuilder.length(), 16711680);
        g(spannableStringBuilder, this.f29083e, 0, spannableStringBuilder.length());
        float fO = this.f29084f;
        while (this.f29079a.a() >= 8) {
            int iF = this.f29079a.f();
            int iQ = this.f29079a.q();
            int iQ2 = this.f29079a.q();
            if (iQ2 == 1937013100) {
                x7.a.a(this.f29079a.a() >= 2);
                int iP = this.f29079a.P();
                for (int i12 = 0; i12 < iP; i12++) {
                    d(this.f29079a, spannableStringBuilder);
                }
            } else if (iQ2 == 1952608120 && this.f29080b) {
                x7.a.a(this.f29079a.a() >= 2);
                fO = l0.o(this.f29079a.P() / this.f29085g, 0.0f, 0.95f);
            }
            this.f29079a.W(iF + iQ);
        }
        lVar.accept(new e(u.I(new w7.a.b().o(spannableStringBuilder).h(fO, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // s9.r
    public int c() {
        return 2;
    }

    private void d(a0 a0Var, SpannableStringBuilder spannableStringBuilder) {
        boolean z10;
        if (a0Var.a() >= 12) {
            z10 = true;
        } else {
            z10 = false;
        }
        x7.a.a(z10);
        int iP = a0Var.P();
        int iP2 = a0Var.P();
        a0Var.X(2);
        int iH = a0Var.H();
        a0Var.X(1);
        int iQ = a0Var.q();
        int length = spannableStringBuilder.length();
        String str = UyXgnuLGEkgnZE.fcYIJThTS;
        if (iP2 > length) {
            x7.r.h("Tx3gParser", "Truncating styl end (" + iP2 + ") to cueText.length() (" + spannableStringBuilder.length() + str);
            iP2 = spannableStringBuilder.length();
        }
        if (iP >= iP2) {
            x7.r.h("Tx3gParser", "Ignoring styl with start (" + iP + ") >= end (" + iP2 + str);
            return;
        }
        int i10 = iP2;
        f(spannableStringBuilder, iH, this.f29081c, iP, i10, 0);
        e(spannableStringBuilder, iQ, this.f29082d, iP, i10, 0);
    }
}
