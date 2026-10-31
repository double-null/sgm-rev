package e0;

/* JADX INFO: compiled from: State.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t<T> extends k0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f13826b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Throwable finalException) {
        super(Integer.MAX_VALUE, null);
        kotlin.jvm.internal.t.f(finalException, "finalException");
        this.f13826b = finalException;
    }

    public final Throwable b() {
        return this.f13826b;
    }
}
