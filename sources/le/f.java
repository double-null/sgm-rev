package le;

import fe.m;
import id.l;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SerializersModuleCollector.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface f {

    /* JADX INFO: compiled from: SerializersModuleCollector.kt */
    public static final class a {
        public static <T> void b(f fVar, pd.c<T> kClass, final fe.d<T> serializer) {
            t.f(kClass, "kClass");
            t.f(serializer, "serializer");
            fVar.a(kClass, new l() { // from class: le.e
                @Override // id.l
                public final Object invoke(Object obj) {
                    return f.a.c(serializer, (List) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static fe.d c(fe.d dVar, List it) {
            t.f(it, "it");
            return dVar;
        }
    }

    <T> void a(pd.c<T> cVar, l<? super List<? extends fe.d<?>>, ? extends fe.d<?>> lVar);

    <Base> void b(pd.c<Base> cVar, l<? super Base, ? extends m<? super Base>> lVar);

    <T> void c(pd.c<T> cVar, fe.d<T> dVar);

    <Base> void d(pd.c<Base> cVar, l<? super String, ? extends fe.c<? extends Base>> lVar);

    <Base, Sub extends Base> void e(pd.c<Base> cVar, pd.c<Sub> cVar2, fe.d<Sub> dVar);
}
