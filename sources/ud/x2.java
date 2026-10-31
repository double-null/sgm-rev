package ud;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes5.dex */
final class x2<U, T extends U> extends zd.a0<T> implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f26830e;

    public x2(long j10, zc.f<? super U> fVar) {
        super(fVar.getContext(), fVar);
        this.f26830e = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        L(y2.a(this.f26830e, y0.c(getContext()), this));
    }

    @Override // ud.a, ud.g2
    public String z0() {
        return super.z0() + "(timeMillis=" + this.f26830e + ')';
    }
}
