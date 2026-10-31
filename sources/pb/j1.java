package pb;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class j1 extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f24145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r0.b f24146d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(List<String> urls, r0.b deliveryType) {
        super(deliveryType, null);
        kotlin.jvm.internal.t.f(urls, "urls");
        kotlin.jvm.internal.t.f(deliveryType, "deliveryType");
        this.f24145c = urls;
        this.f24146d = deliveryType;
    }

    @Override // pb.r0
    public r0.b a() {
        return this.f24146d;
    }

    public final List<String> b() {
        return this.f24145c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return kotlin.jvm.internal.t.a(this.f24145c, j1Var.f24145c) && a() == j1Var.a();
    }

    public int hashCode() {
        return (this.f24145c.hashCode() * 31) + a().hashCode();
    }

    public String toString() {
        return "UrlMediaSource(urls=" + this.f24145c + ", deliveryType=" + a() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j1(String url, r0.b deliveryType) {
        this((List<String>) kotlin.collections.s.e(url), deliveryType);
        kotlin.jvm.internal.t.f(url, "url");
        kotlin.jvm.internal.t.f(deliveryType, "deliveryType");
    }
}
