package pb;

/* JADX INFO: loaded from: classes5.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f24242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f24243b;

    public w(z source, boolean z10) {
        kotlin.jvm.internal.t.f(source, "source");
        this.f24242a = source;
        this.f24243b = z10;
    }

    public final z a() {
        return this.f24242a;
    }

    public final boolean b() {
        return this.f24243b;
    }

    public /* synthetic */ w(z zVar, boolean z10, int i10, kotlin.jvm.internal.k kVar) {
        this(zVar, (i10 & 2) != 0 ? false : z10);
    }
}
