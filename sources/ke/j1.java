package ke;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: CommentLexers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j1 extends h1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(String source) {
        super(source);
        kotlin.jvm.internal.t.f(source, "source");
    }

    @Override // ke.a
    public byte G() {
        String strD = D();
        int iK = K();
        if (iK >= strD.length() || iK == -1) {
            return (byte) 10;
        }
        this.f21315a = iK;
        return b.a(strD.charAt(iK));
    }

    @Override // ke.h1, ke.a
    public int K() {
        int i10;
        int iH0 = this.f21315a;
        if (iH0 == -1) {
            return iH0;
        }
        String strD = D();
        while (iH0 < strD.length()) {
            char cCharAt = strD.charAt(iH0);
            if (!(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                if (cCharAt != '/' || (i10 = iH0 + 1) >= strD.length()) {
                    break;
                }
                char cCharAt2 = strD.charAt(i10);
                if (cCharAt2 == '*') {
                    int iI0 = rd.f0.i0(strD, "*/", iH0 + 2, false, 4, null);
                    if (iI0 == -1) {
                        this.f21315a = strD.length();
                        a.x(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    iH0 = iI0 + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iH0 = rd.f0.h0(strD, '\n', iH0 + 2, false, 4, null);
                    if (iH0 == -1) {
                        iH0 = strD.length();
                    }
                }
            }
            iH0++;
        }
        this.f21315a = iH0;
        return iH0;
    }

    @Override // ke.h1, ke.a
    public boolean e() {
        int iK = K();
        if (iK >= D().length() || iK == -1) {
            return false;
        }
        return E(D().charAt(iK));
    }

    @Override // ke.h1, ke.a
    public byte j() {
        String strD = D();
        int iK = K();
        if (iK >= strD.length() || iK == -1) {
            return (byte) 10;
        }
        this.f21315a = iK + 1;
        return b.a(strD.charAt(iK));
    }

    @Override // ke.h1, ke.a
    public void l(char c10) {
        String strD = D();
        int iK = K();
        if (iK >= strD.length() || iK == -1) {
            this.f21315a = -1;
            Q(c10);
        }
        char cCharAt = strD.charAt(iK);
        this.f21315a = iK + 1;
        if (cCharAt == c10) {
            return;
        }
        Q(c10);
    }
}
