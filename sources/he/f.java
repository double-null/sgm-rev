package he;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.t;

/* JADX INFO: compiled from: SerialDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface f {

    /* JADX INFO: compiled from: SerialDescriptor.kt */
    public static final class a {
        public static List<Annotation> a(f fVar) {
            return t.k();
        }

        public static boolean b(f fVar) {
            return false;
        }

        public static boolean c(f fVar) {
            return false;
        }
    }

    boolean b();

    int c(String str);

    m d();

    int e();

    String f(int i10);

    List<Annotation> g(int i10);

    List<Annotation> getAnnotations();

    f h(int i10);

    String i();

    boolean isInline();

    boolean j(int i10);
}
