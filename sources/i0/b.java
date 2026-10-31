package i0;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Actual.jvmAndroid.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f15869a;

    public b(boolean z10) {
        this.f15869a = new AtomicBoolean(z10);
    }

    public final boolean a() {
        return this.f15869a.get();
    }

    public final void b(boolean z10) {
        this.f15869a.set(z10);
    }
}
