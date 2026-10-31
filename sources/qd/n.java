package qd;

import java.util.Iterator;
import kotlin.jvm.internal.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public class n extends l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f24764a;

        public a(Iterator it) {
            this.f24764a = it;
        }

        @Override // qd.g
        public Iterator<T> iterator() {
            return this.f24764a;
        }
    }

    public static <T> g<T> d(Iterator<? extends T> it) {
        t.f(it, "<this>");
        return e(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> g<T> e(g<? extends T> gVar) {
        t.f(gVar, "<this>");
        return gVar instanceof qd.a ? gVar : new qd.a(gVar);
    }

    public static <T> g<T> f(final T t10, id.l<? super T, ? extends T> nextFunction) {
        t.f(nextFunction, "nextFunction");
        return t10 == null ? d.f24745a : new f(new id.a() { // from class: qd.m
            @Override // id.a
            public final Object invoke() {
                return n.g(t10);
            }
        }, nextFunction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(Object obj) {
        return obj;
    }
}
