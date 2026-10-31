package kotlin.jvm.internal;

import java.util.Iterator;

/* JADX INFO: compiled from: ArrayIterator.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public static final <T> Iterator<T> a(T[] array) {
        t.f(array, "array");
        return new b(array);
    }
}
