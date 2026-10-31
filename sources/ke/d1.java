package ke;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: CommentLexers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d1 extends b1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f0 reader, char[] buffer) {
        super(reader, buffer);
        kotlin.jvm.internal.t.f(reader, "reader");
        kotlin.jvm.internal.t.f(buffer, "buffer");
    }

    private final wc.q<Integer, Boolean> W(int i10) {
        int i11 = i10 + 2;
        char cCharAt = D().charAt(i10 + 1);
        if (cCharAt != '*') {
            if (cCharAt != '/') {
                return wc.w.a(Integer.valueOf(i10), Boolean.FALSE);
            }
            int I = i11;
            while (i10 != -1) {
                int iH0 = rd.f0.h0(D(), '\n', I, false, 4, null);
                if (iH0 != -1) {
                    return wc.w.a(Integer.valueOf(iH0 + 1), Boolean.TRUE);
                }
                I = I(D().length());
                i10 = I;
            }
            return wc.w.a(-1, Boolean.TRUE);
        }
        boolean z10 = false;
        int iX = i11;
        while (i10 != -1) {
            int iI0 = rd.f0.i0(D(), "*/", iX, false, 4, null);
            if (iI0 != -1) {
                return wc.w.a(Integer.valueOf(iI0 + 2), Boolean.TRUE);
            }
            if (D().charAt(D().length() - 1) == '*') {
                iX = X(D().length() - 1);
                if (z10) {
                    break;
                }
                z10 = true;
            } else {
                iX = I(D().length());
            }
            i10 = iX;
        }
        this.f21315a = D().length();
        a.x(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int X(int i10) {
        if (D().length() - i10 > this.f21326g) {
            return i10;
        }
        this.f21315a = i10;
        u();
        if (this.f21315a == 0) {
            return D().length() == 0 ? -1 : 0;
        }
        return -1;
    }

    @Override // ke.a
    public byte G() {
        u();
        j jVarD = D();
        int iK = K();
        if (iK >= jVarD.length() || iK == -1) {
            return (byte) 10;
        }
        this.f21315a = iK;
        return b.a(jVarD.charAt(iK));
    }

    @Override // ke.b1, ke.a
    public int K() {
        int I;
        int i10 = this.f21315a;
        while (true) {
            I = I(i10);
            if (I == -1) {
                break;
            }
            char cCharAt = D().charAt(I);
            if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t') {
                i10 = I + 1;
            } else {
                if (cCharAt != '/' || I + 1 >= D().length()) {
                    break;
                }
                wc.q<Integer, Boolean> qVarW = W(I);
                int iIntValue = qVarW.b().intValue();
                if (!qVarW.c().booleanValue()) {
                    I = iIntValue;
                    break;
                }
                i10 = iIntValue;
            }
        }
        this.f21315a = I;
        return I;
    }

    @Override // ke.b1, ke.a
    public boolean e() {
        u();
        int iK = K();
        if (iK >= D().length() || iK == -1) {
            return false;
        }
        return E(D().charAt(iK));
    }

    @Override // ke.b1, ke.a
    public byte j() {
        u();
        j jVarD = D();
        int iK = K();
        if (iK >= jVarD.length() || iK == -1) {
            return (byte) 10;
        }
        this.f21315a = iK + 1;
        return b.a(jVarD.charAt(iK));
    }

    @Override // ke.b1, ke.a
    public void l(char c10) {
        u();
        j jVarD = D();
        int iK = K();
        if (iK >= jVarD.length() || iK == -1) {
            this.f21315a = -1;
            Q(c10);
        }
        char cCharAt = jVarD.charAt(iK);
        this.f21315a = iK + 1;
        if (cCharAt == c10) {
            return;
        }
        Q(c10);
    }
}
