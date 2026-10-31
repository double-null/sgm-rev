package yd;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
final class s<T> implements zc.f<T>, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zc.f<T> f28907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zc.j f28908b;

    /* JADX WARN: Multi-variable type inference failed */
    public s(zc.f<? super T> fVar, zc.j jVar) {
        this.f28907a = fVar;
        this.f28908b = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        zc.f<T> fVar = this.f28907a;
        if (fVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) fVar;
        }
        return null;
    }

    @Override // zc.f
    public zc.j getContext() {
        return this.f28908b;
    }

    @Override // zc.f
    public void resumeWith(Object obj) {
        this.f28907a.resumeWith(obj);
    }
}
