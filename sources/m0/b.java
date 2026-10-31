package m0;

import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f<?>[] f22040b;

    public b(f<?>... initializers) {
        t.f(initializers, "initializers");
        this.f22040b = initializers;
    }

    @Override // androidx.lifecycle.d0.b
    public <T extends c0> T a(Class<T> modelClass, a extras) {
        t.f(modelClass, "modelClass");
        t.f(extras, "extras");
        T t10 = null;
        for (f<?> fVar : this.f22040b) {
            if (t.a(fVar.a(), modelClass)) {
                T tInvoke = fVar.b().invoke(extras);
                t10 = tInvoke instanceof c0 ? tInvoke : null;
            }
        }
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("No initializer set for given class " + modelClass.getName());
    }
}
