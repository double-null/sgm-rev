package m0;

import androidx.lifecycle.c0;
import id.l;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f<T extends c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<T> f22043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<a, T> f22044b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Class<T> clazz, l<? super a, ? extends T> initializer) {
        t.f(clazz, "clazz");
        t.f(initializer, "initializer");
        this.f22043a = clazz;
        this.f22044b = initializer;
    }

    public final Class<T> a() {
        return this.f22043a;
    }

    public final l<a, T> b() {
        return this.f22044b;
    }
}
