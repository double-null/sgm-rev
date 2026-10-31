package pd;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: KClasses.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T a(c<T> cVar, Object obj) {
        t.f(cVar, "<this>");
        if (cVar.e(obj)) {
            t.d(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + cVar.f());
    }
}
