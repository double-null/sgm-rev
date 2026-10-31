package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: SavedStateViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<Class<?>> f2876a = kotlin.collections.t.n(Application.class, v.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<Class<?>> f2877b = kotlin.collections.s.e(v.class);

    public static final <T> Constructor<T> c(Class<T> modelClass, List<? extends Class<?>> signature) {
        kotlin.jvm.internal.t.f(modelClass, "modelClass");
        kotlin.jvm.internal.t.f(signature, "signature");
        Object[] constructors = modelClass.getConstructors();
        kotlin.jvm.internal.t.e(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.t.e(parameterTypes, "constructor.parameterTypes");
            List listW = kotlin.collections.o.W(parameterTypes);
            if (kotlin.jvm.internal.t.a(signature, listW)) {
                kotlin.jvm.internal.t.d(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == listW.size() && listW.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends c0> T d(Class<T> modelClass, Constructor<T> constructor, Object... params) {
        kotlin.jvm.internal.t.f(modelClass, "modelClass");
        kotlin.jvm.internal.t.f(constructor, "constructor");
        kotlin.jvm.internal.t.f(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e12.getCause());
        }
    }
}
