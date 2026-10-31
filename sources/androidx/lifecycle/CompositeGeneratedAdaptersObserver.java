package androidx.lifecycle;

/* JADX INFO: compiled from: CompositeGeneratedAdaptersObserver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d[] f2842a;

    public CompositeGeneratedAdaptersObserver(d[] generatedAdapters) {
        kotlin.jvm.internal.t.f(generatedAdapters, "generatedAdapters");
        this.f2842a = generatedAdapters;
    }

    @Override // androidx.lifecycle.h
    public void b(j source, f.a event) {
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(event, "event");
        o oVar = new o();
        for (d dVar : this.f2842a) {
            dVar.a(source, event, false, oVar);
        }
        for (d dVar2 : this.f2842a) {
            dVar2.a(source, event, true, oVar);
        }
    }
}
