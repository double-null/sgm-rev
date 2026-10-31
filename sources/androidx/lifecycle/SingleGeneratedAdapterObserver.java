package androidx.lifecycle;

/* JADX INFO: compiled from: SingleGeneratedAdapterObserver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SingleGeneratedAdapterObserver implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f2875a;

    public SingleGeneratedAdapterObserver(d generatedAdapter) {
        kotlin.jvm.internal.t.f(generatedAdapter, "generatedAdapter");
        this.f2875a = generatedAdapter;
    }

    @Override // androidx.lifecycle.h
    public void b(j source, f.a event) {
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(event, "event");
        this.f2875a.a(source, event, false, null);
        this.f2875a.a(source, event, true, null);
    }
}
