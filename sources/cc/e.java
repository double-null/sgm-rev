package cc;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: NetworkError.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f5476a;

    public e(Throwable throwable) {
        t.f(throwable, "throwable");
        this.f5476a = throwable;
    }

    public final Throwable a() {
        return this.f5476a;
    }

    public String toString() {
        return this.f5476a.toString();
    }
}
