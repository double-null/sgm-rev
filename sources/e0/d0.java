package e0;

/* JADX INFO: compiled from: State.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d0<T> extends k0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f13567b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Throwable readException, int i10) {
        super(i10, null);
        kotlin.jvm.internal.t.f(readException, "readException");
        this.f13567b = readException;
    }

    public final Throwable b() {
        return this.f13567b;
    }
}
