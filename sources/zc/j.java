package zc;

import id.p;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface j {

    /* JADX INFO: compiled from: CoroutineContext.kt */
    public static final class a {
        public static j b(j jVar, j context) {
            t.f(context, "context");
            return context == k.f29181a ? jVar : (j) context.U(jVar, new p() { // from class: zc.i
                @Override // id.p
                public final Object invoke(Object obj, Object obj2) {
                    return j.a.c((j) obj, (j.b) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static j c(j acc, b element) {
            e eVar;
            t.f(acc, "acc");
            t.f(element, "element");
            j jVarA0 = acc.a0(element.getKey());
            k kVar = k.f29181a;
            if (jVarA0 == kVar) {
                return element;
            }
            g.b bVar = g.f29179a9;
            g gVar = (g) jVarA0.e(bVar);
            if (gVar == null) {
                eVar = new e(jVarA0, element);
            } else {
                j jVarA1 = jVarA0.a0(bVar);
                if (jVarA1 == kVar) {
                    return new e(element, gVar);
                }
                eVar = new e(new e(jVarA1, element), gVar);
            }
            return eVar;
        }
    }

    /* JADX INFO: compiled from: CoroutineContext.kt */
    public interface b extends j {

        /* JADX INFO: compiled from: CoroutineContext.kt */
        public static final class a {
            public static <R> R a(b bVar, R r10, p<? super R, ? super b, ? extends R> operation) {
                t.f(operation, "operation");
                return operation.invoke(r10, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> key) {
                t.f(key, "key");
                if (!t.a(bVar.getKey(), key)) {
                    return null;
                }
                t.d(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static j c(b bVar, c<?> key) {
                t.f(key, "key");
                return t.a(bVar.getKey(), key) ? k.f29181a : bVar;
            }

            public static j d(b bVar, j context) {
                t.f(context, "context");
                return a.b(bVar, context);
            }
        }

        @Override // zc.j
        <E extends b> E e(c<E> cVar);

        c<?> getKey();
    }

    /* JADX INFO: compiled from: CoroutineContext.kt */
    public interface c<E extends b> {
    }

    <R> R U(R r10, p<? super R, ? super b, ? extends R> pVar);

    j a0(c<?> cVar);

    <E extends b> E e(c<E> cVar);

    j z(j jVar);
}
