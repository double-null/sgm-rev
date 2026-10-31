package ke;

import com.facebook.internal.ServerProtocol;

/* JADX INFO: compiled from: StringOps.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f21373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f21374b;

    static {
        String[] strArr = new String[93];
        for (int i10 = 0; i10 < 32; i10++) {
            strArr[i10] = "\\u" + e(i10 >> 12) + e(i10 >> 8) + e(i10 >> 4) + e(i10);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f21373a = strArr;
        byte[] bArr = new byte[93];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i11] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f21374b = bArr;
    }

    public static final byte[] a() {
        return f21374b;
    }

    public static final String[] b() {
        return f21373a;
    }

    public static final void c(StringBuilder sb2, String value) {
        kotlin.jvm.internal.t.f(sb2, "<this>");
        kotlin.jvm.internal.t.f(value, "value");
        sb2.append('\"');
        int length = value.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = value.charAt(i11);
            String[] strArr = f21373a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb2.append((CharSequence) value, i10, i11);
                sb2.append(strArr[cCharAt]);
                i10 = i11 + 1;
            }
        }
        if (i10 != 0) {
            sb2.append((CharSequence) value, i10, value.length());
        } else {
            sb2.append(value);
        }
        sb2.append('\"');
    }

    public static final Boolean d(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        if (rd.c0.B(str, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, true)) {
            return Boolean.TRUE;
        }
        if (rd.c0.B(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static final char e(int i10) {
        int i11 = i10 & 15;
        return (char) (i11 < 10 ? i11 + 48 : (i11 - 10) + 97);
    }
}
