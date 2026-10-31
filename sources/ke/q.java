package ke;

/* JADX INFO: compiled from: AbstractJsonLexer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f21401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f21402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f21403c;

    static {
        q qVar = new q();
        f21401a = qVar;
        f21402b = new char[117];
        f21403c = new byte[126];
        qVar.f();
        qVar.e();
    }

    private q() {
    }

    private final void a(char c10, char c11) {
        b(c10, c11);
    }

    private final void b(int i10, char c10) {
        if (c10 != 'u') {
            f21402b[c10] = (char) i10;
        }
    }

    private final void c(char c10, byte b10) {
        d(c10, b10);
    }

    private final void d(int i10, byte b10) {
        f21403c[i10] = b10;
    }

    private final void e() {
        for (int i10 = 0; i10 < 33; i10++) {
            d(i10, (byte) 127);
        }
        d(9, (byte) 3);
        d(10, (byte) 3);
        d(13, (byte) 3);
        d(32, (byte) 3);
        c(',', (byte) 4);
        c(':', (byte) 5);
        c('{', (byte) 6);
        c('}', (byte) 7);
        c('[', (byte) 8);
        c(']', (byte) 9);
        c('\"', (byte) 1);
        c('\\', (byte) 2);
    }

    private final void f() {
        for (int i10 = 0; i10 < 32; i10++) {
            b(i10, 'u');
        }
        b(8, 'b');
        b(9, 't');
        b(10, 'n');
        b(12, 'f');
        b(13, 'r');
        a('/', '/');
        a('\"', '\"');
        a('\\', '\\');
    }
}
