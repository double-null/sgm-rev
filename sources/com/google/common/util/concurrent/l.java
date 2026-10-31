package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: Callables.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l {
    public static <T> Callable<T> c(final T t10) {
        return new Callable() { // from class: com.google.common.util.concurrent.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return l.b(t10);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object b(Object obj) throws Exception {
        return obj;
    }
}
