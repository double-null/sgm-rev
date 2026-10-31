package m4;

import com.applovin.shadow.okio.internal.Buffer;
import com.facebook.internal.ServerProtocol;
import com.google.gson.stream.MalformedJsonException;
import i4.e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: compiled from: JsonReader.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f22132a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f22140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f22142k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f22143l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String[] f22145n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int[] f22146o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22133b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[] f22134c = new char[1024];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22135d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22136e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22137f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22138g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f22139h = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f22144m = 0 + 1;

    /* JADX INFO: renamed from: m4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JsonReader.java */
    class C0363a extends e {
        C0363a() {
        }

        @Override // i4.e
        public void a(a aVar) throws IOException {
            if (aVar instanceof com.google.gson.internal.bind.a) {
                ((com.google.gson.internal.bind.a) aVar).s0();
                return;
            }
            int iH = aVar.f22139h;
            if (iH == 0) {
                iH = aVar.h();
            }
            if (iH == 13) {
                aVar.f22139h = 9;
                return;
            }
            if (iH == 12) {
                aVar.f22139h = 8;
                return;
            }
            if (iH == 14) {
                aVar.f22139h = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + aVar.L() + aVar.u());
        }
    }

    static {
        e.f15953a = new C0363a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f22143l = iArr;
        iArr[0] = 6;
        this.f22145n = new String[32];
        this.f22146o = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f22132a = reader;
    }

    private int G(boolean z10) throws IOException {
        char[] cArr = this.f22134c;
        int i10 = this.f22135d;
        int i11 = this.f22136e;
        while (true) {
            if (i10 == i11) {
                this.f22135d = i10;
                if (!o(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + u());
                }
                i10 = this.f22135d;
                i11 = this.f22136e;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f22137f++;
                this.f22138g = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f22135d = i12;
                    if (i12 == i11) {
                        this.f22135d = i12 - 1;
                        boolean zO = o(2);
                        this.f22135d++;
                        if (!zO) {
                            return c10;
                        }
                    }
                    e();
                    int i13 = this.f22135d;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f22135d = i13 + 1;
                        if (!j0("*/")) {
                            throw o0("Unterminated comment");
                        }
                        i10 = this.f22135d + 2;
                        i11 = this.f22136e;
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f22135d = i13 + 1;
                        k0();
                        i10 = this.f22135d;
                        i11 = this.f22136e;
                    }
                } else {
                    if (c10 != '#') {
                        this.f22135d = i12;
                        return c10;
                    }
                    this.f22135d = i12;
                    e();
                    k0();
                    i10 = this.f22135d;
                    i11 = this.f22136e;
                }
            }
            i10 = i12;
        }
    }

    private String I(char c10) throws IOException {
        int i10;
        char[] cArr = this.f22134c;
        StringBuilder sb2 = null;
        do {
            int i11 = this.f22135d;
            int i12 = this.f22136e;
            while (true) {
                int i13 = i12;
                i10 = i11;
                while (true) {
                    if (i11 < i13) {
                        int i14 = i11 + 1;
                        char c11 = cArr[i11];
                        if (c11 == c10) {
                            this.f22135d = i14;
                            int i15 = (i14 - i10) - 1;
                            if (sb2 == null) {
                                return new String(cArr, i10, i15);
                            }
                            sb2.append(cArr, i10, i15);
                            return sb2.toString();
                        }
                        if (c11 == '\\') {
                            this.f22135d = i14;
                            int i16 = (i14 - i10) - 1;
                            if (sb2 == null) {
                                sb2 = new StringBuilder(Math.max((i16 + 1) * 2, 16));
                            }
                            sb2.append(cArr, i10, i16);
                            sb2.append(a0());
                            i11 = this.f22135d;
                            i12 = this.f22136e;
                        } else {
                            if (c11 == '\n') {
                                this.f22137f++;
                                this.f22138g = i14;
                            }
                            i11 = i14;
                        }
                    }
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder(Math.max((i11 - i10) * 2, 16));
            }
            sb2.append(cArr, i10, i11 - i10);
            this.f22135d = i11;
        } while (o(1));
        throw o0("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private String K() throws IOException {
        String string;
        StringBuilder sb2 = null;
        int i10 = 0;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.f22135d;
                if (i12 + i11 < this.f22136e) {
                    char c10 = this.f22134c[i12 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        e();
                    }
                    i10 = i11;
                } else if (i11 >= this.f22134c.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb2.append(this.f22134c, this.f22135d, i11);
                    this.f22135d += i11;
                    if (!o(1)) {
                    }
                } else if (!o(i11 + 1)) {
                    i10 = i11;
                }
                if (sb2 == null) {
                    string = new String(this.f22134c, this.f22135d, i10);
                } else {
                    sb2.append(this.f22134c, this.f22135d, i10);
                    string = sb2.toString();
                }
                this.f22135d += i10;
                return string;
            }
        }
    }

    private int N() throws IOException {
        String str;
        String str2;
        int i10;
        char c10 = this.f22134c[this.f22135d];
        if (c10 == 't' || c10 == 'T') {
            str = ServerProtocol.DIALOG_RETURN_SCOPES_TRUE;
            str2 = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f22135d + i11 >= this.f22136e && !o(i11 + 1)) {
                return 0;
            }
            char c11 = this.f22134c[this.f22135d + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f22135d + length < this.f22136e || o(length + 1)) && t(this.f22134c[this.f22135d + length])) {
            return 0;
        }
        this.f22135d += length;
        this.f22139h = i10;
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:90:0x00df  */
    /* JADX WARN: Code duplicated, block: B:92:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:97:0x00eb  */
    private int U() throws IOException {
        char c10;
        char c11;
        char[] cArr = this.f22134c;
        int i10 = this.f22135d;
        int i11 = this.f22136e;
        int i12 = 0;
        int i13 = 0;
        char c12 = 0;
        boolean z10 = false;
        boolean z11 = true;
        long j10 = 0;
        while (true) {
            if (i10 + i13 != i11) {
                c10 = cArr[i10 + i13];
                if (c10 != '+') {
                    if (c10 != 'E' || c10 == 'e') {
                        i12 = 0;
                        if (c12 == 2 && c12 != 4) {
                            return 0;
                        }
                        c12 = 5;
                    } else if (c10 != '-') {
                        c11 = 3;
                        if (c10 == '.') {
                            i12 = 0;
                            if (c12 != 2) {
                                return 0;
                            }
                        } else {
                            if (c10 < '0' || c10 > '9') {
                                if (!t(c10)) {
                                    break;
                                }
                                return 0;
                            }
                            if (c12 == 1 || c12 == 0) {
                                j10 = -(c10 - '0');
                                c12 = 2;
                            } else if (c12 == 2) {
                                if (j10 == 0) {
                                    return 0;
                                }
                                long j11 = (10 * j10) - ((long) (c10 - '0'));
                                z11 &= j10 > Buffer.OVERFLOW_ZONE || (j10 == Buffer.OVERFLOW_ZONE && j11 < j10);
                                j10 = j11;
                            } else if (c12 == 3) {
                                i12 = 0;
                                c12 = 4;
                            } else if (c12 == 5 || c12 == 6) {
                                i12 = 0;
                                c12 = 7;
                            }
                            i12 = 0;
                        }
                    } else {
                        c11 = 6;
                        i12 = 0;
                        if (c12 == 0) {
                            c12 = 1;
                            z10 = true;
                        } else if (c12 != 5) {
                            return 0;
                        }
                    }
                    i13++;
                } else {
                    c11 = 6;
                    i12 = 0;
                    if (c12 != 5) {
                        return 0;
                    }
                }
                c12 = c11;
                i13++;
            } else {
                if (i13 == cArr.length) {
                    return i12;
                }
                if (!o(i13 + 1)) {
                    break;
                }
                i10 = this.f22135d;
                i11 = this.f22136e;
                c10 = cArr[i10 + i13];
                if (c10 != '+') {
                    if (c10 != 'E') {
                        i12 = 0;
                        if (c12 == 2) {
                        }
                        c12 = 5;
                    } else {
                        i12 = 0;
                        if (c12 == 2) {
                        }
                        c12 = 5;
                    }
                    i13++;
                } else {
                    c11 = 6;
                    i12 = 0;
                    if (c12 != 5) {
                        return 0;
                    }
                }
                c12 = c11;
                i13++;
            }
        }
        if (c12 == 2 && z11 && ((j10 != Long.MIN_VALUE || z10) && (j10 != 0 || !z10))) {
            if (!z10) {
                j10 = -j10;
            }
            this.f22140i = j10;
            this.f22135d += i13;
            this.f22139h = 15;
            return 15;
        }
        if (c12 != 2 && c12 != 4 && c12 != 7) {
            return 0;
        }
        this.f22141j = i13;
        this.f22139h = 16;
        return 16;
    }

    private void Y(int i10) {
        int i11 = this.f22144m;
        int[] iArr = this.f22143l;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f22143l = Arrays.copyOf(iArr, i12);
            this.f22146o = Arrays.copyOf(this.f22146o, i12);
            this.f22145n = (String[]) Arrays.copyOf(this.f22145n, i12);
        }
        int[] iArr2 = this.f22143l;
        int i13 = this.f22144m;
        this.f22144m = i13 + 1;
        iArr2[i13] = i10;
    }

    private char a0() throws IOException {
        int i10;
        int i11;
        if (this.f22135d == this.f22136e && !o(1)) {
            throw o0("Unterminated escape sequence");
        }
        char[] cArr = this.f22134c;
        int i12 = this.f22135d;
        int i13 = i12 + 1;
        this.f22135d = i13;
        char c10 = cArr[i12];
        if (c10 == '\n') {
            this.f22137f++;
            this.f22138g = i13;
        } else if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
            if (c10 == 'b') {
                return '\b';
            }
            if (c10 == 'f') {
                return '\f';
            }
            if (c10 == 'n') {
                return '\n';
            }
            if (c10 == 'r') {
                return '\r';
            }
            if (c10 == 't') {
                return '\t';
            }
            if (c10 != 'u') {
                throw o0("Invalid escape sequence");
            }
            if (i13 + 4 > this.f22136e && !o(4)) {
                throw o0("Unterminated escape sequence");
            }
            int i14 = this.f22135d;
            int i15 = i14 + 4;
            char c11 = 0;
            while (i14 < i15) {
                char c12 = this.f22134c[i14];
                char c13 = (char) (c11 << 4);
                if (c12 < '0' || c12 > '9') {
                    if (c12 >= 'a' && c12 <= 'f') {
                        i10 = c12 - 'a';
                    } else {
                        if (c12 < 'A' || c12 > 'F') {
                            throw new NumberFormatException("\\u" + new String(this.f22134c, this.f22135d, 4));
                        }
                        i10 = c12 - 'A';
                    }
                    i11 = i10 + 10;
                } else {
                    i11 = c12 - '0';
                }
                c11 = (char) (c13 + i11);
                i14++;
            }
            this.f22135d += 4;
            return c11;
        }
        return c10;
    }

    private void e() throws IOException {
        if (!this.f22133b) {
            throw o0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void f() throws IOException {
        G(true);
        int i10 = this.f22135d - 1;
        this.f22135d = i10;
        if (i10 + 5 <= this.f22136e || o(5)) {
            char[] cArr = this.f22134c;
            if (cArr[i10] == ')' && cArr[i10 + 1] == ']' && cArr[i10 + 2] == '}' && cArr[i10 + 3] == '\'' && cArr[i10 + 4] == '\n') {
                this.f22135d += 5;
            }
        }
    }

    private void i0(char c10) throws IOException {
        char[] cArr = this.f22134c;
        do {
            int i10 = this.f22135d;
            int i11 = this.f22136e;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f22135d = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f22135d = i12;
                    a0();
                    i10 = this.f22135d;
                    i11 = this.f22136e;
                } else {
                    if (c11 == '\n') {
                        this.f22137f++;
                        this.f22138g = i12;
                    }
                    i10 = i12;
                }
            }
            this.f22135d = i10;
        } while (o(1));
        throw o0("Unterminated string");
    }

    private boolean j0(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.f22135d + length > this.f22136e && !o(length)) {
                return false;
            }
            char[] cArr = this.f22134c;
            int i10 = this.f22135d;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f22134c[this.f22135d + i11] == str.charAt(i11)) {
                    }
                }
                return true;
            }
            this.f22137f++;
            this.f22138g = i10 + 1;
            this.f22135d++;
        }
    }

    private void k0() throws IOException {
        char c10;
        do {
            if (this.f22135d >= this.f22136e && !o(1)) {
                return;
            }
            char[] cArr = this.f22134c;
            int i10 = this.f22135d;
            int i11 = i10 + 1;
            this.f22135d = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f22137f++;
                this.f22138g = i11;
                return;
            }
        } while (c10 != '\r');
    }

    private void m0() throws IOException {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f22135d;
                if (i11 + i10 < this.f22136e) {
                    char c10 = this.f22134c[i11 + i10];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i10++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        e();
                    }
                    this.f22135d += i10;
                    return;
                }
                this.f22135d = i11 + i10;
            }
        } while (o(1));
    }

    private boolean o(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f22134c;
        int i13 = this.f22138g;
        int i14 = this.f22135d;
        this.f22138g = i13 - i14;
        int i15 = this.f22136e;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f22136e = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f22136e = 0;
        }
        this.f22135d = 0;
        do {
            Reader reader = this.f22132a;
            int i17 = this.f22136e;
            int i18 = reader.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f22136e + i18;
            this.f22136e = i11;
            if (this.f22137f == 0 && (i12 = this.f22138g) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f22135d++;
                this.f22138g = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    private IOException o0(String str) throws IOException {
        throw new MalformedJsonException(str + u());
    }

    private boolean t(char c10) throws IOException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        e();
        return false;
    }

    public int B() throws IOException {
        int iH = this.f22139h;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            long j10 = this.f22140i;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f22139h = 0;
                int[] iArr = this.f22146o;
                int i11 = this.f22144m - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.f22140i + u());
        }
        if (iH == 16) {
            this.f22142k = new String(this.f22134c, this.f22135d, this.f22141j);
            this.f22135d += this.f22141j;
        } else {
            if (iH != 8 && iH != 9 && iH != 10) {
                throw new IllegalStateException("Expected an int but was " + L() + u());
            }
            if (iH == 10) {
                this.f22142k = K();
            } else {
                this.f22142k = I(iH == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f22142k);
                this.f22139h = 0;
                int[] iArr2 = this.f22146o;
                int i13 = this.f22144m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f22139h = 11;
        double d10 = Double.parseDouble(this.f22142k);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f22142k + u());
        }
        this.f22142k = null;
        this.f22139h = 0;
        int[] iArr3 = this.f22146o;
        int i15 = this.f22144m - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long C() throws IOException {
        int iH = this.f22139h;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            this.f22139h = 0;
            int[] iArr = this.f22146o;
            int i10 = this.f22144m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f22140i;
        }
        if (iH == 16) {
            this.f22142k = new String(this.f22134c, this.f22135d, this.f22141j);
            this.f22135d += this.f22141j;
        } else {
            if (iH != 8 && iH != 9 && iH != 10) {
                throw new IllegalStateException("Expected a long but was " + L() + u());
            }
            if (iH == 10) {
                this.f22142k = K();
            } else {
                this.f22142k = I(iH == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f22142k);
                this.f22139h = 0;
                int[] iArr2 = this.f22146o;
                int i11 = this.f22144m - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f22139h = 11;
        double d10 = Double.parseDouble(this.f22142k);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f22142k + u());
        }
        this.f22142k = null;
        this.f22139h = 0;
        int[] iArr3 = this.f22146o;
        int i12 = this.f22144m - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public String F() throws IOException {
        String strI;
        int iH = this.f22139h;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 14) {
            strI = K();
        } else if (iH == 12) {
            strI = I('\'');
        } else {
            if (iH != 13) {
                throw new IllegalStateException("Expected a name but was " + L() + u());
            }
            strI = I('\"');
        }
        this.f22139h = 0;
        this.f22145n[this.f22144m - 1] = strI;
        return strI;
    }

    public void H() throws IOException {
        int iH = this.f22139h;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 7) {
            this.f22139h = 0;
            int[] iArr = this.f22146o;
            int i10 = this.f22144m - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + L() + u());
    }

    public String J() throws IOException {
        String str;
        int iH = this.f22139h;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 10) {
            str = K();
        } else if (iH == 8) {
            str = I('\'');
        } else if (iH == 9) {
            str = I('\"');
        } else if (iH == 11) {
            str = this.f22142k;
            this.f22142k = null;
        } else if (iH == 15) {
            str = Long.toString(this.f22140i);
        } else {
            if (iH != 16) {
                throw new IllegalStateException("Expected a string but was " + L() + u());
            }
            str = new String(this.f22134c, this.f22135d, this.f22141j);
            this.f22135d += this.f22141j;
        }
        this.f22139h = 0;
        int[] iArr = this.f22146o;
        int i10 = this.f22144m - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public b L() throws IOException {
        int iH = this.f22139h;
        if (iH == 0) {
            iH = h();
        }
        switch (iH) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public void b() throws IOException {
        int iH = this.f22139h;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 3) {
            Y(1);
            this.f22146o[this.f22144m - 1] = 0;
            this.f22139h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + L() + u());
        }
    }

    public void c() throws IOException {
        int iH = this.f22139h;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 1) {
            Y(3);
            this.f22139h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + L() + u());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f22139h = 0;
        this.f22143l[0] = 8;
        this.f22144m = 1;
        this.f22132a.close();
    }

    public final void e0(boolean z10) {
        this.f22133b = z10;
    }

    public String getPath() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = this.f22144m;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f22143l[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(this.f22146o[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = this.f22145n[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    int h() throws IOException {
        int iG;
        int[] iArr = this.f22143l;
        int i10 = this.f22144m;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iG2 = G(true);
            if (iG2 != 44) {
                if (iG2 != 59) {
                    if (iG2 != 93) {
                        throw o0("Unterminated array");
                    }
                    this.f22139h = 4;
                    return 4;
                }
                e();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (iG = G(true)) != 44) {
                    if (iG != 59) {
                        if (iG != 125) {
                            throw o0("Unterminated object");
                        }
                        this.f22139h = 2;
                        return 2;
                    }
                    e();
                }
                int iG3 = G(true);
                if (iG3 == 34) {
                    this.f22139h = 13;
                    return 13;
                }
                if (iG3 == 39) {
                    e();
                    this.f22139h = 12;
                    return 12;
                }
                if (iG3 == 125) {
                    if (i11 == 5) {
                        throw o0("Expected name");
                    }
                    this.f22139h = 2;
                    return 2;
                }
                e();
                this.f22135d--;
                if (!t((char) iG3)) {
                    throw o0("Expected name");
                }
                this.f22139h = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iG4 = G(true);
                if (iG4 != 58) {
                    if (iG4 != 61) {
                        throw o0("Expected ':'");
                    }
                    e();
                    if (this.f22135d < this.f22136e || o(1)) {
                        char[] cArr = this.f22134c;
                        int i12 = this.f22135d;
                        if (cArr[i12] == '>') {
                            this.f22135d = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.f22133b) {
                    f();
                }
                this.f22143l[this.f22144m - 1] = 7;
            } else if (i11 == 7) {
                if (G(false) == -1) {
                    this.f22139h = 17;
                    return 17;
                }
                e();
                this.f22135d--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iG5 = G(true);
        if (iG5 == 34) {
            this.f22139h = 9;
            return 9;
        }
        if (iG5 == 39) {
            e();
            this.f22139h = 8;
            return 8;
        }
        if (iG5 != 44 && iG5 != 59) {
            if (iG5 == 91) {
                this.f22139h = 3;
                return 3;
            }
            if (iG5 != 93) {
                if (iG5 == 123) {
                    this.f22139h = 1;
                    return 1;
                }
                this.f22135d--;
                int iN = N();
                if (iN != 0) {
                    return iN;
                }
                int iU = U();
                if (iU != 0) {
                    return iU;
                }
                if (!t(this.f22134c[this.f22135d])) {
                    throw o0("Expected value");
                }
                e();
                this.f22139h = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f22139h = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw o0("Unexpected value");
        }
        e();
        this.f22135d--;
        this.f22139h = 7;
        return 7;
    }

    public void k() throws IOException {
        int iH = this.f22139h;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + L() + u());
        }
        int i10 = this.f22144m - 1;
        this.f22144m = i10;
        int[] iArr = this.f22146o;
        int i11 = i10 - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f22139h = 0;
    }

    public void n() throws IOException {
        int iH = this.f22139h;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + L() + u());
        }
        int i10 = this.f22144m - 1;
        this.f22144m = i10;
        this.f22145n[i10] = null;
        int[] iArr = this.f22146o;
        int i11 = i10 - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f22139h = 0;
    }

    public void n0() throws IOException {
        int i10 = 0;
        do {
            int iH = this.f22139h;
            if (iH == 0) {
                iH = h();
            }
            if (iH == 3) {
                Y(1);
            } else {
                if (iH == 1) {
                    Y(3);
                } else if (iH == 4 || iH == 2) {
                    this.f22144m--;
                    i10--;
                } else if (iH == 14 || iH == 10) {
                    m0();
                } else if (iH == 8 || iH == 12) {
                    i0('\'');
                } else if (iH == 9 || iH == 13) {
                    i0('\"');
                } else if (iH == 16) {
                    this.f22135d += this.f22141j;
                }
                this.f22139h = 0;
            }
            i10++;
            this.f22139h = 0;
        } while (i10 != 0);
        int[] iArr = this.f22146o;
        int i11 = this.f22144m;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f22145n[i11 - 1] = "null";
    }

    public boolean p() throws IOException {
        int iH = this.f22139h;
        if (iH == 0) {
            iH = h();
        }
        return (iH == 2 || iH == 4) ? false : true;
    }

    public final boolean s() {
        return this.f22133b;
    }

    public String toString() {
        return getClass().getSimpleName() + u();
    }

    String u() {
        return " at line " + (this.f22137f + 1) + " column " + ((this.f22135d - this.f22138g) + 1) + " path " + getPath();
    }

    public boolean v() throws IOException {
        int iH = this.f22139h;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 5) {
            this.f22139h = 0;
            int[] iArr = this.f22146o;
            int i10 = this.f22144m - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iH == 6) {
            this.f22139h = 0;
            int[] iArr2 = this.f22146o;
            int i11 = this.f22144m - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + L() + u());
    }

    public double z() throws IOException {
        int iH = this.f22139h;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            this.f22139h = 0;
            int[] iArr = this.f22146o;
            int i10 = this.f22144m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f22140i;
        }
        if (iH == 16) {
            this.f22142k = new String(this.f22134c, this.f22135d, this.f22141j);
            this.f22135d += this.f22141j;
        } else if (iH == 8 || iH == 9) {
            this.f22142k = I(iH == 8 ? '\'' : '\"');
        } else if (iH == 10) {
            this.f22142k = K();
        } else if (iH != 11) {
            throw new IllegalStateException("Expected a double but was " + L() + u());
        }
        this.f22139h = 11;
        double d10 = Double.parseDouble(this.f22142k);
        if (!this.f22133b && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d10 + u());
        }
        this.f22142k = null;
        this.f22139h = 0;
        int[] iArr2 = this.f22146o;
        int i11 = this.f22144m - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }
}
