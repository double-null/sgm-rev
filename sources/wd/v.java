package wd;

import sc.NfwM.XDucgbzInpQa;
import wc.g0;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface v<E> {

    /* JADX INFO: compiled from: Channel.kt */
    public static final class a {
        public static /* synthetic */ boolean a(v vVar, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(XDucgbzInpQa.lOG);
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return vVar.m(th);
        }
    }

    void d(id.l<? super Throwable, g0> lVar);

    Object i(E e10);

    Object j(E e10, zc.f<? super g0> fVar);

    boolean m(Throwable th);
}
