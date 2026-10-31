package zd;

/* JADX INFO: compiled from: Scopes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements ud.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zc.j f29188a;

    public d(zc.j jVar) {
        this.f29188a = jVar;
    }

    @Override // ud.o0
    public zc.j q() {
        return this.f29188a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + q() + ')';
    }
}
