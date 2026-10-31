package e0;

/* JADX INFO: compiled from: State.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h<T> extends k0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f13576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13577c;

    public h(T t10, int i10, int i11) {
        super(i11, null);
        this.f13576b = t10;
        this.f13577c = i10;
    }

    public final void b() {
        T t10 = this.f13576b;
        if (!((t10 != null ? t10.hashCode() : 0) == this.f13577c)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    public final T c() {
        return this.f13576b;
    }
}
