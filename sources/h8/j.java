package h8;

import android.text.TextUtils;
import com.facebook.appevents.eventdeactivation.ksG.UomBEukHFwrS;
import io.bidmachine.media3.common.ParserException;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s9.r;
import s9.s;
import u7.q;
import v8.i0;
import v8.j0;
import v8.o0;
import v8.p;
import x7.a0;
import x7.g0;

/* JADX INFO: compiled from: WebvttExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f15737i = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f15738j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f15740b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r.a f15742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f15743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v8.r f15744f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f15746h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f15741c = new a0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f15745g = new byte[1024];

    public j(String str, g0 g0Var, r.a aVar, boolean z10) {
        this.f15739a = str;
        this.f15740b = g0Var;
        this.f15742d = aVar;
        this.f15743e = z10;
    }

    private o0 b(long j10) {
        o0 o0VarE = this.f15744f.e(0, 3);
        o0VarE.a(new q.b().u0("text/vtt").j0(this.f15739a).y0(j10).N());
        this.f15744f.r();
        return o0VarE;
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // v8.p
    public void c(v8.r rVar) {
        if (this.f15743e) {
            rVar = new s(rVar, this.f15742d);
        }
        this.f15744f = rVar;
        rVar.h(new j0.b(-9223372036854775807L));
    }

    @Override // v8.p
    public boolean e(v8.q qVar) throws IOException {
        qVar.b(this.f15745g, 0, 6, false);
        this.f15741c.U(this.f15745g, 6);
        if (ba.h.b(this.f15741c)) {
            return true;
        }
        qVar.b(this.f15745g, 6, 3, false);
        this.f15741c.U(this.f15745g, 9);
        return ba.h.b(this.f15741c);
    }

    @Override // v8.p
    public int l(v8.q qVar, i0 i0Var) throws IOException {
        x7.a.e(this.f15744f);
        int length = (int) qVar.getLength();
        int i10 = this.f15746h;
        byte[] bArr = this.f15745g;
        if (i10 == bArr.length) {
            this.f15745g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f15745g;
        int i11 = this.f15746h;
        int i12 = qVar.read(bArr2, i11, bArr2.length - i11);
        if (i12 != -1) {
            int i13 = this.f15746h + i12;
            this.f15746h = i13;
            if (length == -1 || i13 != length) {
                return 0;
            }
        }
        d();
        return -1;
    }

    @Override // v8.p
    public void release() {
    }

    private void d() throws ParserException {
        a0 a0Var = new a0(this.f15745g);
        ba.h.e(a0Var);
        long jH = 0;
        long jD = 0;
        for (String strS = a0Var.s(); !TextUtils.isEmpty(strS); strS = a0Var.s()) {
            if (strS.startsWith(UomBEukHFwrS.zdgqnYKr)) {
                Matcher matcher = f15737i.matcher(strS);
                if (!matcher.find()) {
                    throw ParserException.b("X-TIMESTAMP-MAP doesn't contain local timestamp: " + strS, null);
                }
                Matcher matcher2 = f15738j.matcher(strS);
                if (!matcher2.find()) {
                    throw ParserException.b("X-TIMESTAMP-MAP doesn't contain media timestamp: " + strS, null);
                }
                jD = ba.h.d((String) x7.a.e(matcher.group(1)));
                jH = g0.h(Long.parseLong((String) x7.a.e(matcher2.group(1))));
            }
        }
        Matcher matcherA = ba.h.a(a0Var);
        if (matcherA == null) {
            b(0L);
            return;
        }
        long jD2 = ba.h.d((String) x7.a.e(matcherA.group(1)));
        long jB = this.f15740b.b(g0.l((jH + jD2) - jD));
        o0 o0VarB = b(jB - jD2);
        this.f15741c.U(this.f15745g, this.f15746h);
        o0VarB.b(this.f15741c, this.f15746h);
        o0VarB.f(jB, 1, this.f15746h, 0, null);
    }
}
