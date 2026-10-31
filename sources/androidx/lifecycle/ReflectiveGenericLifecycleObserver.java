package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b.a f2870b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2869a = obj;
        this.f2870b = b.f2878c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.h
    public void b(j jVar, f.a aVar) {
        this.f2870b.a(jVar, aVar, this.f2869a);
    }
}
