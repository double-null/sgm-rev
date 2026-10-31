package m4;

import com.facebook.internal.ServerProtocol;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: compiled from: JsonWriter.java */
/* JADX INFO: loaded from: classes4.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f22158j = new String[128];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f22159k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f22160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f22161b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22162c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f22163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f22164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f22167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22168i;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f22158j[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f22158j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f22159k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        B(6);
        this.f22164e = ":";
        this.f22168i = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f22160a = writer;
    }

    private void B(int i10) {
        int i11 = this.f22162c;
        int[] iArr = this.f22161b;
        if (i11 == iArr.length) {
            this.f22161b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f22161b;
        int i12 = this.f22162c;
        this.f22162c = i12 + 1;
        iArr2[i12] = i10;
    }

    private void C(int i10) {
        this.f22161b[this.f22162c - 1] = i10;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    private void G(String str) throws IOException {
        String str2;
        String[] strArr = this.f22166g ? f22159k : f22158j;
        this.f22160a.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        this.f22160a.write(str, i10, i11 - i10);
                    }
                    this.f22160a.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    this.f22160a.write(str, i10, i11 - i10);
                }
                this.f22160a.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            this.f22160a.write(str, i10, length - i10);
        }
        this.f22160a.write(34);
    }

    private void N() throws IOException {
        if (this.f22167h != null) {
            b();
            G(this.f22167h);
            this.f22167h = null;
        }
    }

    private void b() throws IOException {
        int iZ = z();
        if (iZ == 5) {
            this.f22160a.write(44);
        } else if (iZ != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        t();
        C(4);
    }

    private void c() throws IOException {
        int iZ = z();
        if (iZ == 1) {
            C(2);
            t();
            return;
        }
        if (iZ == 2) {
            this.f22160a.append(',');
            t();
        } else {
            if (iZ == 4) {
                this.f22160a.append((CharSequence) this.f22164e);
                C(5);
                return;
            }
            if (iZ != 6) {
                if (iZ != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f22165f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            C(7);
        }
    }

    private c h(int i10, int i11, char c10) throws IOException {
        int iZ = z();
        if (iZ != i11 && iZ != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f22167h != null) {
            throw new IllegalStateException("Dangling name: " + this.f22167h);
        }
        this.f22162c--;
        if (iZ == i11) {
            t();
        }
        this.f22160a.write(c10);
        return this;
    }

    private void t() throws IOException {
        if (this.f22163d == null) {
            return;
        }
        this.f22160a.write(10);
        int i10 = this.f22162c;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f22160a.write(this.f22163d);
        }
    }

    private c v(int i10, char c10) throws IOException {
        c();
        B(i10);
        this.f22160a.write(c10);
        return this;
    }

    private int z() {
        int i10 = this.f22162c;
        if (i10 != 0) {
            return this.f22161b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void F(boolean z10) {
        this.f22165f = z10;
    }

    public c H(long j10) throws IOException {
        N();
        c();
        this.f22160a.write(Long.toString(j10));
        return this;
    }

    public c I(Boolean bool) throws IOException {
        if (bool == null) {
            return u();
        }
        N();
        c();
        this.f22160a.write(bool.booleanValue() ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
        return this;
    }

    public c J(Number number) throws IOException {
        if (number == null) {
            return u();
        }
        N();
        String string = number.toString();
        if (this.f22165f || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            c();
            this.f22160a.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c K(String str) throws IOException {
        if (str == null) {
            return u();
        }
        N();
        c();
        G(str);
        return this;
    }

    public c L(boolean z10) throws IOException {
        N();
        c();
        this.f22160a.write(z10 ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f22160a.close();
        int i10 = this.f22162c;
        if (i10 > 1 || (i10 == 1 && this.f22161b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f22162c = 0;
    }

    public c e() throws IOException {
        N();
        return v(1, '[');
    }

    public c f() throws IOException {
        N();
        return v(3, '{');
    }

    public void flush() throws IOException {
        if (this.f22162c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f22160a.flush();
    }

    public c k() throws IOException {
        return h(1, 2, ']');
    }

    public c n() throws IOException {
        return h(3, 5, '}');
    }

    public final boolean o() {
        return this.f22168i;
    }

    public boolean p() {
        return this.f22165f;
    }

    public c s(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f22167h != null) {
            throw new IllegalStateException();
        }
        if (this.f22162c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f22167h = str;
        return this;
    }

    public c u() throws IOException {
        if (this.f22167h != null) {
            if (!this.f22168i) {
                this.f22167h = null;
                return this;
            }
            N();
        }
        c();
        this.f22160a.write("null");
        return this;
    }
}
