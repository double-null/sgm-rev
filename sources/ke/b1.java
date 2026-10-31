package ke;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: ReaderJsonLexer.kt */
/* JADX INFO: loaded from: classes5.dex */
public class b1 extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f0 f21324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final char[] f21325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f21326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f21327h;

    public b1(f0 reader, char[] buffer) {
        kotlin.jvm.internal.t.f(reader, "reader");
        kotlin.jvm.internal.t.f(buffer, "buffer");
        this.f21324e = reader;
        this.f21325f = buffer;
        this.f21326g = 128;
        this.f21327h = new j(buffer);
        U(0);
    }

    private final void U(int i10) {
        char[] cArrB = D().b();
        if (i10 != 0) {
            int i11 = this.f21315a;
            kotlin.collections.m.e(cArrB, cArrB, 0, i11, i11 + i10);
        }
        int length = D().length();
        while (i10 != length) {
            int iA = this.f21324e.a(cArrB, i10, length - i10);
            if (iA == -1) {
                D().f(i10);
                this.f21326g = -1;
                break;
            }
            i10 += iA;
        }
        this.f21315a = 0;
    }

    @Override // ke.a
    public String F(String keyToMatch, boolean z10) {
        kotlin.jvm.internal.t.f(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // ke.a
    public int I(int i10) {
        if (i10 < D().length()) {
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
    public int K() {
        int I;
        int i10 = this.f21315a;
        while (true) {
            I = I(i10);
            if (I != -1) {
                char cCharAt = D().charAt(I);
                if (!(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                    break;
                }
                i10 = I + 1;
            } else {
                break;
            }
        }
        this.f21315a = I;
        return I;
    }

    @Override // ke.a
    public String L(int i10, int i11) {
        return D().e(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ke.a
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public j D() {
        return this.f21327h;
    }

    public int T(char c10, int i10) {
        j jVarD = D();
        int length = jVarD.length();
        while (i10 < length) {
            if (jVarD.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final void V() {
        p.f21399c.c(this.f21325f);
    }

    @Override // ke.a
    protected void d(int i10, int i11) {
        StringBuilder sbC = C();
        sbC.append(D().b(), i10, i11 - i10);
        kotlin.jvm.internal.t.e(sbC, "append(...)");
    }

    @Override // ke.a
    public boolean e() {
        u();
        int i10 = this.f21315a;
        while (true) {
            int I = I(i10);
            if (I == -1) {
                this.f21315a = I;
                return false;
            }
            char cCharAt = D().charAt(I);
            if (!(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                this.f21315a = I;
                return E(cCharAt);
            }
            i10 = I + 1;
        }
    }

    @Override // ke.a
    public String i() {
        l('\"');
        int i10 = this.f21315a;
        int iT = T('\"', i10);
        if (iT == -1) {
            int I = I(i10);
            if (I != -1) {
                return p(D(), this.f21315a, I);
            }
            a.z(this, (byte) 1, false, 2, null);
            throw new KotlinNothingValueException();
        }
        for (int i11 = i10; i11 < iT; i11++) {
            if (D().charAt(i11) == '\\') {
                return p(D(), this.f21315a, i11);
            }
        }
        this.f21315a = iT + 1;
        return L(i10, iT);
    }

    @Override // ke.a
    public byte j() {
        u();
        j jVarD = D();
        int i10 = this.f21315a;
        while (true) {
            int I = I(i10);
            if (I == -1) {
                this.f21315a = I;
                return (byte) 10;
            }
            int i11 = I + 1;
            byte bA = b.a(jVarD.charAt(I));
            if (bA != 3) {
                this.f21315a = i11;
                return bA;
            }
            i10 = i11;
        }
    }

    @Override // ke.a
    public void l(char c10) {
        u();
        j jVarD = D();
        int i10 = this.f21315a;
        while (true) {
            int I = I(i10);
            if (I == -1) {
                this.f21315a = I;
                Q(c10);
                return;
            }
            int i11 = I + 1;
            char cCharAt = jVarD.charAt(I);
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
    }

    @Override // ke.a
    public void u() {
        int length = D().length() - this.f21315a;
        if (length > this.f21326g) {
            return;
        }
        U(length);
    }
}
