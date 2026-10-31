package zc;

import id.l;
import kotlin.jvm.internal.t;
import zc.j.b;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b<B extends j.b, E extends B> implements j.c<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l<j.b, E> f29171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j.c<?> f29172b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [zc.j$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [id.l<? super zc.j$b, ? extends E extends B>, id.l<zc.j$b, E extends B>, java.lang.Object] */
    public b(j.c<B> baseKey, l<? super j.b, ? extends E> safeCast) {
        t.f(baseKey, "baseKey");
        t.f(safeCast, "safeCast");
        this.f29171a = safeCast;
        this.f29172b = baseKey instanceof b ? (j.c<B>) ((b) baseKey).f29172b : baseKey;
    }

    public final boolean a(j.c<?> key) {
        t.f(key, "key");
        return key == this || this.f29172b == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lzc/j$b;)TE; */
    public final j.b b(j.b element) {
        t.f(element, "element");
        return (j.b) this.f29171a.invoke(element);
    }
}
