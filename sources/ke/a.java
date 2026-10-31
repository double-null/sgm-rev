package ke;

import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: AbstractJsonLexer.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21315a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f21317c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f21316b = new n0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private StringBuilder f21318d = new StringBuilder();

    private final int B(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        char c10 = 'a';
        if (!('a' <= cCharAt && cCharAt < 'g')) {
            c10 = 'A';
            if (!('A' <= cCharAt && cCharAt < 'G')) {
                x(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        return (cCharAt - c10) + 10;
    }

    private final String M() {
        String str = this.f21317c;
        kotlin.jvm.internal.t.c(str);
        this.f21317c = null;
        return str;
    }

    public static /* synthetic */ boolean P(a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return aVar.O(z10);
    }

    private final boolean R() {
        return D().charAt(this.f21315a - 1) != '\"';
    }

    private final int a(int i10) {
        int I = I(i10);
        if (I == -1) {
            x(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = I + 1;
        char cCharAt = D().charAt(I);
        if (cCharAt == 'u') {
            return c(D(), i11);
        }
        char cB = b.b(cCharAt);
        if (cB != 0) {
            this.f21318d.append(cB);
            return i11;
        }
        x(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int b(int i10, int i11) {
        d(i10, i11);
        return a(i11 + 1);
    }

    private final int c(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            this.f21318d.append((char) ((B(charSequence, i10) << 12) + (B(charSequence, i10 + 1) << 8) + (B(charSequence, i10 + 2) << 4) + B(charSequence, i10 + 3)));
            return i11;
        }
        this.f21315a = i10;
        u();
        if (this.f21315a + 4 < charSequence.length()) {
            return c(charSequence, this.f21315a);
        }
        x(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean f(int i10) {
        int I = I(i10);
        if (I >= D().length() || I == -1) {
            x(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = I + 1;
        int iCharAt = D().charAt(I) | ' ';
        if (iCharAt == 102) {
            h("alse", i11);
            return false;
        }
        if (iCharAt == 116) {
            h("rue", i11);
            return true;
        }
        x(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final void h(String str, int i10) {
        if (D().length() - i10 < str.length()) {
            x(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (D().charAt(i10 + i11) | ' ')) {
                x(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        this.f21315a = i10 + str.length();
    }

    private static final double n(long j10, boolean z10) {
        if (!z10) {
            return Math.pow(10.0d, -j10);
        }
        if (z10) {
            return Math.pow(10.0d, j10);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String s(int i10, int i11) {
        d(i10, i11);
        String string = this.f21318d.toString();
        kotlin.jvm.internal.t.e(string, "toString(...)");
        this.f21318d.setLength(0);
        return string;
    }

    public static /* synthetic */ Void x(a aVar, String str, int i10, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i11 & 2) != 0) {
            i10 = aVar.f21315a;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return aVar.w(str, i10, str2);
    }

    public static /* synthetic */ Void z(a aVar, byte b10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return aVar.y(b10, z10);
    }

    public final void A(String key) {
        kotlin.jvm.internal.t.f(key, "key");
        w("Encountered an unknown key '" + key + '\'', rd.f0.o0(L(0, this.f21315a), key, 0, false, 6, null), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new KotlinNothingValueException();
    }

    protected final StringBuilder C() {
        return this.f21318d;
    }

    protected abstract CharSequence D();

    protected final boolean E(char c10) {
        return (c10 == ',' || c10 == ':' || c10 == ']' || c10 == '}') ? false : true;
    }

    public abstract String F(String str, boolean z10);

    public byte G() {
        CharSequence charSequenceD = D();
        int i10 = this.f21315a;
        while (true) {
            int I = I(i10);
            if (I == -1) {
                this.f21315a = I;
                return (byte) 10;
            }
            char cCharAt = charSequenceD.charAt(I);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f21315a = I;
                return b.a(cCharAt);
            }
            i10 = I + 1;
        }
    }

    public final String H(boolean z10) {
        String strO;
        byte bG = G();
        if (z10) {
            if (bG != 1 && bG != 0) {
                return null;
            }
            strO = q();
        } else {
            if (bG != 1) {
                return null;
            }
            strO = o();
        }
        this.f21317c = strO;
        return strO;
    }

    public abstract int I(int i10);

    public final void J(boolean z10) {
        ArrayList arrayList = new ArrayList();
        byte bG = G();
        if (bG != 8 && bG != 6) {
            q();
            return;
        }
        while (true) {
            byte bG2 = G();
            if (bG2 != 1) {
                if (bG2 == 8 || bG2 == 6) {
                    arrayList.add(Byte.valueOf(bG2));
                } else if (bG2 == 9) {
                    if (((Number) kotlin.collections.b0.X(arrayList)).byteValue() != 8) {
                        throw k0.f(this.f21315a, "found ] instead of } at path: " + this.f21316b, D());
                    }
                    kotlin.collections.y.C(arrayList);
                } else if (bG2 == 7) {
                    if (((Number) kotlin.collections.b0.X(arrayList)).byteValue() != 6) {
                        throw k0.f(this.f21315a, "found } instead of ] at path: " + this.f21316b, D());
                    }
                    kotlin.collections.y.C(arrayList);
                } else if (bG2 == 10) {
                    x(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                j();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z10) {
                q();
            } else {
                i();
            }
        }
    }

    public abstract int K();

    public String L(int i10, int i11) {
        return D().subSequence(i10, i11).toString();
    }

    public final boolean N() {
        int iK = K();
        CharSequence charSequenceD = D();
        if (iK >= charSequenceD.length() || iK == -1 || charSequenceD.charAt(iK) != ',') {
            return false;
        }
        this.f21315a++;
        return true;
    }

    public final boolean O(boolean z10) {
        int I = I(K());
        int length = D().length() - I;
        if (length < 4 || I == -1) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if ("null".charAt(i10) != D().charAt(I + i10)) {
                return false;
            }
        }
        if (length > 4 && b.a(D().charAt(I + 4)) == 0) {
            return false;
        }
        if (!z10) {
            return true;
        }
        this.f21315a = I + 4;
        return true;
    }

    protected final void Q(char c10) {
        int i10 = this.f21315a;
        if (i10 > 0 && c10 == '\"') {
            try {
                this.f21315a = i10 - 1;
                String strQ = q();
                this.f21315a = i10;
                if (kotlin.jvm.internal.t.a(strQ, "null")) {
                    w("Expected string literal but 'null' literal was found", this.f21315a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th) {
                this.f21315a = i10;
                throw th;
            }
        }
        z(this, b.a(c10), false, 2, null);
        throw new KotlinNothingValueException();
    }

    protected void d(int i10, int i11) {
        this.f21318d.append(D(), i10, i11);
    }

    public abstract boolean e();

    public final boolean g() {
        boolean z10;
        int iK = K();
        if (iK == D().length()) {
            x(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (D().charAt(iK) == '\"') {
            iK++;
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zF = f(iK);
        if (z10) {
            if (this.f21315a == D().length()) {
                x(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (D().charAt(this.f21315a) != '\"') {
                x(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            this.f21315a++;
        }
        return zF;
    }

    public abstract String i();

    public abstract byte j();

    public final byte k(byte b10) {
        byte bJ = j();
        if (bJ == b10) {
            return bJ;
        }
        z(this, b10, false, 2, null);
        throw new KotlinNothingValueException();
    }

    public abstract void l(char c10);

    public final long m() {
        boolean z10;
        boolean z11;
        int I = I(K());
        if (I >= D().length() || I == -1) {
            x(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (D().charAt(I) == '\"') {
            I++;
            if (I == D().length()) {
                x(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = I;
        long j10 = 0;
        long j11 = 0;
        boolean z12 = false;
        boolean z13 = false;
        loop0: while (true) {
            z11 = false;
            while (true) {
                if (i10 == D().length()) {
                    break loop0;
                }
                char cCharAt = D().charAt(i10);
                if ((cCharAt == 'e' || cCharAt == 'E') && !z12) {
                    if (i10 == I) {
                        x(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    i10++;
                    z12 = true;
                } else if (cCharAt != '-' || !z12) {
                    if (cCharAt != '+' || !z12) {
                        if (cCharAt != '-') {
                            if (b.a(cCharAt) != 0) {
                                break loop0;
                            }
                            i10++;
                            int i11 = cCharAt - '0';
                            if (!(i11 >= 0 && i11 < 10)) {
                                x(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6, null);
                                throw new KotlinNothingValueException();
                            }
                            if (z12) {
                                j11 = (j11 * ((long) 10)) + ((long) i11);
                            } else {
                                j10 = (j10 * ((long) 10)) - ((long) i11);
                                if (j10 > 0) {
                                    x(this, "Numeric value overflow", 0, null, 6, null);
                                    throw new KotlinNothingValueException();
                                }
                            }
                        } else {
                            if (i10 != I) {
                                x(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                                throw new KotlinNothingValueException();
                            }
                            i10++;
                            z13 = true;
                        }
                    } else {
                        if (i10 == I) {
                            x(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        i10++;
                    }
                }
                z11 = true;
            }
            if (i10 == I) {
                x(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            i10++;
        }
        boolean z14 = i10 != I;
        if (I == i10 || (z13 && I == i10 - 1)) {
            x(this, "Expected numeric literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (z10) {
            if (!z14) {
                x(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (D().charAt(i10) != '\"') {
                x(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            i10++;
        }
        this.f21315a = i10;
        if (z12) {
            double dN = j10 * n(j11, z11);
            if (dN > 9.223372036854776E18d || dN < -9.223372036854776E18d) {
                x(this, "Numeric value overflow", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (!(Math.floor(dN) == dN)) {
                x(this, "Can't convert " + dN + " to Long", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            j10 = (long) dN;
        }
        if (z13) {
            return j10;
        }
        if (j10 != Long.MIN_VALUE) {
            return -j10;
        }
        x(this, "Numeric value overflow", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final String o() {
        return this.f21317c != null ? M() : i();
    }

    protected final String p(CharSequence source, int i10, int i11) {
        int I;
        kotlin.jvm.internal.t.f(source, "source");
        char cCharAt = source.charAt(i11);
        boolean z10 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                I = I(b(i10, i11));
                if (I == -1) {
                    x(this, "Unexpected EOF", I, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                i11++;
                if (i11 >= source.length()) {
                    d(i10, i11);
                    I = I(i11);
                    if (I == -1) {
                        x(this, "Unexpected EOF", I, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                }
                cCharAt = source.charAt(i11);
            }
            z10 = true;
            i10 = I;
            i11 = i10;
            cCharAt = source.charAt(i11);
        }
        String strL = !z10 ? L(i10, i11) : s(i10, i11);
        this.f21315a = i11 + 1;
        return strL;
    }

    public final String q() {
        if (this.f21317c != null) {
            return M();
        }
        int iK = K();
        if (iK >= D().length() || iK == -1) {
            x(this, "EOF", iK, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte bA = b.a(D().charAt(iK));
        if (bA == 1) {
            return o();
        }
        if (bA != 0) {
            x(this, "Expected beginning of the string, but got " + D().charAt(iK), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z10 = false;
        while (b.a(D().charAt(iK)) == 0) {
            iK++;
            if (iK >= D().length()) {
                d(this.f21315a, iK);
                int I = I(iK);
                if (I == -1) {
                    this.f21315a = iK;
                    return s(0, 0);
                }
                iK = I;
                z10 = true;
            }
        }
        String strL = !z10 ? L(this.f21315a, iK) : s(this.f21315a, iK);
        this.f21315a = iK;
        return strL;
    }

    public final String r() {
        String strQ = q();
        if (!kotlin.jvm.internal.t.a(strQ, "null") || !R()) {
            return strQ;
        }
        x(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void t() {
        this.f21317c = null;
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) D()) + "', currentPosition=" + this.f21315a + ')';
    }

    public final void v() {
        if (j() == 10) {
            return;
        }
        x(this, "Expected EOF after parsing, but had " + D().charAt(this.f21315a - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final Void w(String message, int i10, String hint) {
        String str;
        kotlin.jvm.internal.t.f(message, "message");
        kotlin.jvm.internal.t.f(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw k0.f(i10, message + " at path: " + this.f21316b.a() + str, D());
    }

    public final Void y(byte b10, boolean z10) {
        String strC = b.c(b10);
        int i10 = z10 ? this.f21315a - 1 : this.f21315a;
        x(this, "Expected " + strC + ", but had '" + ((this.f21315a == D().length() || i10 < 0) ? "EOF" : String.valueOf(D().charAt(i10))) + "' instead", i10, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public void u() {
    }
}
