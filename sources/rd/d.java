package rd;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Charsets.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f24998a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f24999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f25000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f25001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f25002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f25003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f25004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Charset f25005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile Charset f25006i;

    static {
        Charset charsetForName = Charset.forName(Constants.ENCODING);
        kotlin.jvm.internal.t.e(charsetForName, "forName(...)");
        f24999b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        kotlin.jvm.internal.t.e(charsetForName2, "forName(...)");
        f25000c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        kotlin.jvm.internal.t.e(charsetForName3, "forName(...)");
        f25001d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        kotlin.jvm.internal.t.e(charsetForName4, "forName(...)");
        f25002e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        kotlin.jvm.internal.t.e(charsetForName5, "forName(...)");
        f25003f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.t.e(charsetForName6, "forName(...)");
        f25004g = charsetForName6;
    }

    private d() {
    }

    public final Charset a() {
        Charset charset = f25006i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        kotlin.jvm.internal.t.e(charsetForName, "forName(...)");
        f25006i = charsetForName;
        return charsetForName;
    }

    public final Charset b() {
        Charset charset = f25005h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        kotlin.jvm.internal.t.e(charsetForName, "forName(...)");
        f25005h = charsetForName;
        return charsetForName;
    }
}
