package zd;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import ud.k2;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f29237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f29238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k2 f29239c;

    static {
        t tVar = new t();
        f29237a = tVar;
        f29238b = f0.f("kotlinx.coroutines.fast.service.loader", true);
        f29239c = tVar.a();
    }

    private t() {
    }

    private final k2 a() {
        Object next;
        k2 k2VarE;
        try {
            List<s> listC = f29238b ? i.f29202a.c() : qd.r.x(qd.n.d(ServiceLoader.load(s.class, s.class.getClassLoader()).iterator()));
            Iterator<T> it = listC.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((s) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((s) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            s sVar = (s) next;
            return (sVar == null || (k2VarE = u.e(sVar, listC)) == null) ? u.b(null, null, 3, null) : k2VarE;
        } catch (Throwable th) {
            return u.b(th, null, 2, null);
        }
    }
}
