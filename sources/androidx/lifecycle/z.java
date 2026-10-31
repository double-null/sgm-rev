package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: SavedStateViewModelFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends d0.d implements d0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Application f2950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0.b f2951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f2952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f2953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.savedstate.a f2954f;

    public z(Application application, w0.d owner, Bundle bundle) {
        kotlin.jvm.internal.t.f(owner, "owner");
        this.f2954f = owner.getSavedStateRegistry();
        this.f2953e = owner.getLifecycle();
        this.f2952d = bundle;
        this.f2950b = application;
        this.f2951c = application != null ? d0.a.f2897f.a(application) : new d0.a();
    }

    @Override // androidx.lifecycle.d0.b
    public <T extends c0> T b(Class<T> modelClass) {
        kotlin.jvm.internal.t.f(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.d0.d
    public void c(c0 viewModel) {
        kotlin.jvm.internal.t.f(viewModel, "viewModel");
        if (this.f2953e != null) {
            androidx.savedstate.a aVar = this.f2954f;
            kotlin.jvm.internal.t.c(aVar);
            f fVar = this.f2953e;
            kotlin.jvm.internal.t.c(fVar);
            LegacySavedStateHandleController.a(viewModel, aVar, fVar);
        }
    }

    public final <T extends c0> T d(String key, Class<T> modelClass) {
        T t10;
        Application application;
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(modelClass, "modelClass");
        f fVar = this.f2953e;
        if (fVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || this.f2950b == null) ? a0.c(modelClass, a0.f2877b) : a0.c(modelClass, a0.f2876a);
        if (constructorC == null) {
            return this.f2950b != null ? (T) this.f2951c.b(modelClass) : (T) d0.c.f2904b.a().b(modelClass);
        }
        androidx.savedstate.a aVar = this.f2954f;
        kotlin.jvm.internal.t.c(aVar);
        SavedStateHandleController savedStateHandleControllerB = LegacySavedStateHandleController.b(aVar, fVar, key, this.f2952d);
        if (!zIsAssignableFrom || (application = this.f2950b) == null) {
            t10 = (T) a0.d(modelClass, constructorC, savedStateHandleControllerB.i());
        } else {
            kotlin.jvm.internal.t.c(application);
            t10 = (T) a0.d(modelClass, constructorC, application, savedStateHandleControllerB.i());
        }
        t10.e("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerB);
        return t10;
    }

    @Override // androidx.lifecycle.d0.b
    public <T extends c0> T a(Class<T> modelClass, m0.a extras) {
        kotlin.jvm.internal.t.f(modelClass, "modelClass");
        kotlin.jvm.internal.t.f(extras, "extras");
        String str = (String) extras.a(d0.c.f2906d);
        if (str == null) {
            throw new IllegalStateException(wHzciBnJlYkdX.LIHOe);
        }
        if (extras.a(w.f2941a) == null || extras.a(w.f2942b) == null) {
            if (this.f2953e != null) {
                return (T) d(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(d0.a.f2899h);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? a0.c(modelClass, a0.f2877b) : a0.c(modelClass, a0.f2876a);
        if (constructorC == null) {
            return (T) this.f2951c.a(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? (T) a0.d(modelClass, constructorC, w.a(extras)) : (T) a0.d(modelClass, constructorC, application, w.a(extras));
    }
}
