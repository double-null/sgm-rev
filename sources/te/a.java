package te;

import af.g;
import java.io.IOException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: HeadersReader.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0432a f25796c = new C0432a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f25797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f25798b;

    /* JADX INFO: renamed from: te.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HeadersReader.kt */
    public static final class C0432a {
        private C0432a() {
        }

        public /* synthetic */ C0432a(k kVar) {
            this();
        }
    }

    public a(g source) {
        t.f(source, "source");
        this.f25797a = source;
        this.f25798b = 262144L;
    }

    public final me.t a() throws IOException {
        me.t.a aVar = new me.t.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.d();
            }
            aVar.b(strB);
        }
    }

    public final String b() throws IOException {
        String utf8LineStrict = this.f25797a.readUtf8LineStrict(this.f25798b);
        this.f25798b -= (long) utf8LineStrict.length();
        return utf8LineStrict;
    }
}
