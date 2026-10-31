package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements zc.f<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f21488a = new c();

    private c() {
    }

    @Override // zc.f
    public zc.j getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // zc.f
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
