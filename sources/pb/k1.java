package pb;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class k1 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f24157a;

    public k1(List<String> urls) {
        kotlin.jvm.internal.t.f(urls, "urls");
        this.f24157a = urls;
    }

    public final List<String> a() {
        return this.f24157a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k1(String url) {
        this((List<String>) kotlin.collections.s.e(url));
        kotlin.jvm.internal.t.f(url, "url");
    }
}
