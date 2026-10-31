package x2;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Set;

/* JADX INFO: compiled from: ComponentContainer.java */
/* JADX INFO: loaded from: classes4.dex */
public interface d {
    default <T> T a(Class<T> cls) {
        return (T) f(o.b(cls));
    }

    default <T> Set<T> b(Class<T> cls) {
        return g(o.b(cls));
    }

    <T> Deferred<T> c(o<T> oVar);

    default <T> Provider<T> d(Class<T> cls) {
        return e(o.b(cls));
    }

    <T> Provider<T> e(o<T> oVar);

    default <T> T f(o<T> oVar) {
        Provider<T> providerE = e(oVar);
        if (providerE == null) {
            return null;
        }
        return providerE.get();
    }

    default <T> Set<T> g(o<T> oVar) {
        return i(oVar).get();
    }

    default <T> Deferred<T> h(Class<T> cls) {
        return c(o.b(cls));
    }

    <T> Provider<Set<T>> i(o<T> oVar);
}
