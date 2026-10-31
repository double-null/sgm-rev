package de;

import wc.g0;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: de.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Mutex.kt */
    public static final class C0181a {
        public static /* synthetic */ boolean a(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return aVar.a(obj);
        }

        public static /* synthetic */ void b(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            aVar.c(obj);
        }
    }

    boolean a(Object obj);

    boolean b();

    void c(Object obj);

    Object d(Object obj, zc.f<? super g0> fVar);
}
