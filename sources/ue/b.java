package ue;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Header.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f26859d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final af.h f26860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final af.h f26861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final af.h f26862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final af.h f26863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final af.h f26864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final af.h f26865j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final af.h f26866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final af.h f26867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26868c;

    /* JADX INFO: compiled from: Header.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    static {
        af.h.a aVar = af.h.f361d;
        f26860e = aVar.d(":");
        f26861f = aVar.d(Header.RESPONSE_STATUS_UTF8);
        f26862g = aVar.d(Header.TARGET_METHOD_UTF8);
        f26863h = aVar.d(Header.TARGET_PATH_UTF8);
        f26864i = aVar.d(Header.TARGET_SCHEME_UTF8);
        f26865j = aVar.d(Header.TARGET_AUTHORITY_UTF8);
    }

    public b(af.h name, af.h value) {
        t.f(name, "name");
        t.f(value, "value");
        this.f26866a = name;
        this.f26867b = value;
        this.f26868c = name.F() + 32 + value.F();
    }

    public final af.h a() {
        return this.f26866a;
    }

    public final af.h b() {
        return this.f26867b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return t.a(this.f26866a, bVar.f26866a) && t.a(this.f26867b, bVar.f26867b);
    }

    public int hashCode() {
        return (this.f26866a.hashCode() * 31) + this.f26867b.hashCode();
    }

    public String toString() {
        return this.f26866a.I() + ": " + this.f26867b.I();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(String name, String value) {
        t.f(name, "name");
        t.f(value, "value");
        af.h.a aVar = af.h.f361d;
        this(aVar.d(name), aVar.d(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(af.h name, String value) {
        this(name, af.h.f361d.d(value));
        t.f(name, "name");
        t.f(value, "value");
    }
}
