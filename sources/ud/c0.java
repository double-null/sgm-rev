package ud;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes5.dex */
public class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f26723b = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f26724a;

    public c0(Throwable th, boolean z10) {
        this.f26724a = th;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final boolean a() {
        return f26723b.get(this) != 0;
    }

    public final boolean c() {
        return f26723b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return s0.a(this) + '[' + this.f26724a + ']';
    }

    public /* synthetic */ c0(Throwable th, boolean z10, int i10, kotlin.jvm.internal.k kVar) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }
}
