package af;

/* JADX INFO: compiled from: -JvmPlatform.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f0 {
    public static final byte[] a(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        byte[] bytes = str.getBytes(rd.d.f24999b);
        kotlin.jvm.internal.t.e(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        kotlin.jvm.internal.t.f(bArr, "<this>");
        return new String(bArr, rd.d.f24999b);
    }
}
