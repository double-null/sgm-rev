package ac;

import java.io.File;
import java.math.BigInteger;
import kotlin.jvm.internal.t;
import rd.d;
import wb.d0;
import wb.e0;

/* JADX INFO: compiled from: FileUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f303a = new a();

    private a() {
    }

    public static final boolean a() {
        return d0.s();
    }

    public static final boolean b(File file) {
        return b.f(file);
    }

    public static final String c(String url) {
        t.f(url, "url");
        byte[] bytes = url.getBytes(d.f24999b);
        t.e(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrB = e0.b(bytes);
        if (bArrB == null) {
            return null;
        }
        return new BigInteger(bArrB).abs().toString(36);
    }
}
