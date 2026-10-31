package ce;

import id.q;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.s;
import kotlin.jvm.internal.t;
import ud.c3;
import ud.g1;
import ud.m;
import ud.n;
import wc.g0;
import zc.j;
import zd.b0;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes5.dex */
public class a<R> implements m, b, c3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5530f = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f5531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<a<R>.C0100a> f5532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f5533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f5535e;
    private volatile /* synthetic */ Object state$volatile;

    /* JADX INFO: renamed from: ce.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Select.kt */
    public final class C0100a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f5536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f5537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q<b<?>, Object, Object, q<Throwable, Object, j, g0>> f5538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f5539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a<R> f5541f;

        public final q<Throwable, Object, j, g0> a(b<?> bVar, Object obj) {
            q<b<?>, Object, Object, q<Throwable, Object, j, g0>> qVar = this.f5538c;
            if (qVar != null) {
                return qVar.invoke(bVar, this.f5537b, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f5539d;
            a<R> aVar = this.f5541f;
            if (obj instanceof b0) {
                ((b0) obj).s(this.f5540e, null, aVar.getContext());
                return;
            }
            g1 g1Var = obj instanceof g1 ? (g1) obj : null;
            if (g1Var != null) {
                g1Var.e();
            }
        }
    }

    private final a<R>.C0100a e(Object obj) {
        List<a<R>.C0100a> list = this.f5532b;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        for (Object obj3 : list) {
            if (((C0100a) obj3).f5536a == obj) {
                obj2 = obj3;
                break;
            }
        }
        a<R>.C0100a c0100a = (C0100a) obj2;
        if (c0100a != null) {
            return c0100a;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    private final int h(Object obj, Object obj2) {
        while (true) {
            Object obj3 = f5530f.get(this);
            if (obj3 instanceof n) {
                a<R>.C0100a c0100aE = e(obj);
                if (c0100aE == null) {
                    continue;
                } else {
                    q<Throwable, Object, j, g0> qVarA = c0100aE.a(this, obj2);
                    if (androidx.concurrent.futures.b.a(f5530f, this, obj3, c0100aE)) {
                        this.f5535e = obj2;
                        if (c.h((n) obj3, qVarA)) {
                            return 0;
                        }
                        this.f5535e = c.f5546e;
                        return 2;
                    }
                }
            } else {
                if (t.a(obj3, c.f5544c) || (obj3 instanceof C0100a)) {
                    return 3;
                }
                if (t.a(obj3, c.f5545d)) {
                    return 2;
                }
                if (t.a(obj3, c.f5543b)) {
                    if (androidx.concurrent.futures.b.a(f5530f, this, obj3, s.e(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (androidx.concurrent.futures.b.a(f5530f, this, obj3, kotlin.collections.b0.d0((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    @Override // ud.c3
    public void a(b0<?> b0Var, int i10) {
        this.f5533c = b0Var;
        this.f5534d = i10;
    }

    @Override // ud.m
    public void b(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5530f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == c.f5544c) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, c.f5545d));
        List<a<R>.C0100a> list = this.f5532b;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((C0100a) it.next()).b();
        }
        this.f5535e = c.f5546e;
        this.f5532b = null;
    }

    @Override // ce.b
    public void c(Object obj) {
        this.f5535e = obj;
    }

    @Override // ce.b
    public boolean d(Object obj, Object obj2) {
        return h(obj, obj2) == 0;
    }

    public final d g(Object obj, Object obj2) {
        return c.a(h(obj, obj2));
    }

    @Override // ce.b
    public j getContext() {
        return this.f5531a;
    }
}
