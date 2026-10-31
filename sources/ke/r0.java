package ke;

import java.util.Arrays;

/* JADX INFO: compiled from: JsonToStringWriter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class r0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f21410a = n.f21383c.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21411b;

    private final void d(int i10, int i11, String str) {
        byte b10;
        int length = str.length();
        while (i10 < length) {
            int iF = f(i11, 2);
            char cCharAt = str.charAt(i10);
            if (cCharAt >= k1.a().length || (b10 = k1.a()[cCharAt]) == 0) {
                int i12 = iF + 1;
                this.f21410a[iF] = cCharAt;
                i11 = i12;
            } else if (b10 == 1) {
                String str2 = k1.b()[cCharAt];
                kotlin.jvm.internal.t.c(str2);
                int iF2 = f(iF, str2.length());
                str2.getChars(0, str2.length(), this.f21410a, iF2);
                i11 = iF2 + str2.length();
                this.f21411b = i11;
            } else {
                char[] cArr = this.f21410a;
                cArr[iF] = '\\';
                cArr[iF + 1] = (char) b10;
                i11 = iF + 2;
                this.f21411b = i11;
            }
            i10++;
        }
        int iF3 = f(i11, 1);
        this.f21410a[iF3] = '\"';
        this.f21411b = iF3 + 1;
    }

    private final void e(int i10) {
        f(this.f21411b, i10);
    }

    private final int f(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f21410a;
        if (cArr.length <= i12) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, od.k.d(i12, i10 * 2));
            kotlin.jvm.internal.t.e(cArrCopyOf, "copyOf(...)");
            this.f21410a = cArrCopyOf;
        }
        return i10;
    }

    @Override // ke.g0
    public void a(char c10) {
        e(1);
        char[] cArr = this.f21410a;
        int i10 = this.f21411b;
        this.f21411b = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // ke.g0
    public void b(String text) {
        kotlin.jvm.internal.t.f(text, "text");
        e(text.length() + 2);
        char[] cArr = this.f21410a;
        int i10 = this.f21411b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        for (int i13 = i11; i13 < i12; i13++) {
            char c10 = cArr[i13];
            if (c10 < k1.a().length && k1.a()[c10] != 0) {
                d(i13 - i11, i13, text);
                return;
            }
        }
        cArr[i12] = '\"';
        this.f21411b = i12 + 1;
    }

    @Override // ke.g0
    public void c(String text) {
        kotlin.jvm.internal.t.f(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        e(length);
        text.getChars(0, text.length(), this.f21410a, this.f21411b);
        this.f21411b += length;
    }

    public void g() {
        n.f21383c.c(this.f21410a);
    }

    public String toString() {
        return new String(this.f21410a, 0, this.f21411b);
    }

    @Override // ke.g0
    public void writeLong(long j10) {
        c(String.valueOf(j10));
    }
}
