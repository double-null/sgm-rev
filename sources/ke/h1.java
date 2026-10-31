package ke;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: StringJsonLexer.kt */
/* JADX INFO: loaded from: classes5.dex */
public class h1 extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f21365e;

    public h1(String source) {
        kotlin.jvm.internal.t.f(source, "source");
        this.f21365e = source;
    }

    @Override // ke.a
    public String F(String keyToMatch, boolean z10) {
        kotlin.jvm.internal.t.f(keyToMatch, "keyToMatch");
        int i10 = this.f21315a;
        try {
            if (j() == 6 && kotlin.jvm.internal.t.a(H(z10), keyToMatch)) {
                t();
                if (j() == 5) {
                    return H(z10);
                }
            }
            return null;
        } finally {
            this.f21315a = i10;
            t();
        }
    }

    @Override // ke.a
    public int I(int i10) {
        if (i10 < D().length()) {
            return i10;
        }
        return -1;
    }

    @Override // ke.a
    public int K() {
        int i10 = this.f21315a;
        if (i10 == -1) {
            return i10;
        }
        String strD = D();
        while (i10 < strD.length()) {
            char cCharAt = strD.charAt(i10);
            if (!(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i10++;
        }
        this.f21315a = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ke.a
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public String D() {
        return this.f21365e;
    }

    @Override // ke.a
    public boolean e() {
        int i10 = this.f21315a;
        if (i10 == -1) {
            return false;
        }
        String strD = D();
        while (i10 < strD.length()) {
            char cCharAt = strD.charAt(i10);
            if (!(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                this.f21315a = i10;
                return E(cCharAt);
            }
            i10++;
        }
        this.f21315a = i10;
        return false;
    }

    @Override // ke.a
    public String i() {
        l('\"');
        int i10 = this.f21315a;
        int iH0 = rd.f0.h0(D(), '\"', i10, false, 4, null);
        if (iH0 == -1) {
            q();
            y((byte) 1, false);
            throw new KotlinNothingValueException();
        }
        for (int i11 = i10; i11 < iH0; i11++) {
            if (D().charAt(i11) == '\\') {
                return p(D(), this.f21315a, i11);
            }
        }
        this.f21315a = iH0 + 1;
        String strSubstring = D().substring(i10, iH0);
        kotlin.jvm.internal.t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // ke.a
    public byte j() {
        String strD = D();
        int i10 = this.f21315a;
        while (i10 != -1 && i10 < strD.length()) {
            int i11 = i10 + 1;
            char cCharAt = strD.charAt(i10);
            if (!(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                this.f21315a = i11;
                return b.a(cCharAt);
            }
            i10 = i11;
        }
        this.f21315a = strD.length();
        return (byte) 10;
    }

    @Override // ke.a
    public void l(char c10) {
        if (this.f21315a == -1) {
            Q(c10);
        }
        String strD = D();
        int i10 = this.f21315a;
        while (i10 < strD.length()) {
            int i11 = i10 + 1;
            char cCharAt = strD.charAt(i10);
            if (!(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                this.f21315a = i11;
                if (cCharAt == c10) {
                    return;
                } else {
                    Q(c10);
                }
            }
            i10 = i11;
        }
        this.f21315a = -1;
        Q(c10);
    }
}
