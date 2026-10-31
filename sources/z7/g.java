package z7;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import u7.t;

/* JADX INFO: compiled from: DataSpec.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f29009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f29010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f29012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, String> f29013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public final long f29014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f29015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f29016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f29017i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f29018j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f29019k;

    /* JADX INFO: compiled from: DataSpec.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f29020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f29021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f29022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f29023d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<String, String> f29024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f29025f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f29026g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f29027h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f29028i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f29029j;

        public g a() {
            x7.a.j(this.f29020a, "The uri must be set.");
            return new g(this.f29020a, this.f29021b, this.f29022c, this.f29023d, this.f29024e, this.f29025f, this.f29026g, this.f29027h, this.f29028i, this.f29029j);
        }

        public b b(int i10) {
            this.f29028i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f29023d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f29022c = i10;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f29024e = map;
            return this;
        }

        public b f(String str) {
            this.f29027h = str;
            return this;
        }

        public b g(long j10) {
            this.f29026g = j10;
            return this;
        }

        public b h(long j10) {
            this.f29025f = j10;
            return this;
        }

        public b i(Uri uri) {
            this.f29020a = uri;
            return this;
        }

        public b j(String str) {
            this.f29020a = Uri.parse(str);
            return this;
        }

        public b() {
            this.f29022c = 1;
            this.f29024e = Collections.emptyMap();
            this.f29026g = -1L;
        }

        private b(g gVar) {
            this.f29020a = gVar.f29009a;
            this.f29021b = gVar.f29010b;
            this.f29022c = gVar.f29011c;
            this.f29023d = gVar.f29012d;
            this.f29024e = gVar.f29013e;
            this.f29025f = gVar.f29015g;
            this.f29026g = gVar.f29016h;
            this.f29027h = gVar.f29017i;
            this.f29028i = gVar.f29018j;
            this.f29029j = gVar.f29019k;
        }
    }

    static {
        t.a("media3.datasource");
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f29011c);
    }

    public boolean d(int i10) {
        return (this.f29018j & i10) == i10;
    }

    public g e(long j10) {
        long j11 = this.f29016h;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public g f(long j10, long j11) {
        return (j10 == 0 && this.f29016h == j11) ? this : new g(this.f29009a, this.f29010b, this.f29011c, this.f29012d, this.f29013e, this.f29015g + j10, j11, this.f29017i, this.f29018j, this.f29019k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f29009a + ", " + this.f29015g + ", " + this.f29016h + ", " + this.f29017i + ", " + this.f29018j + "]";
    }

    private g(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        boolean z10 = true;
        x7.a.a(j13 >= 0);
        x7.a.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        x7.a.a(z10);
        this.f29009a = (Uri) x7.a.e(uri);
        this.f29010b = j10;
        this.f29011c = i10;
        this.f29012d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f29013e = Collections.unmodifiableMap(new HashMap(map));
        this.f29015g = j11;
        this.f29014f = j13;
        this.f29016h = j12;
        this.f29017i = str;
        this.f29018j = i11;
        this.f29019k = obj;
    }
}
