package he;

import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SerialKinds.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class m {

    /* JADX INFO: compiled from: SerialKinds.kt */
    public static final class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15862a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    public static final class b extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15863a = new b();

        private b() {
            super(null);
        }
    }

    private m() {
    }

    public /* synthetic */ m(kotlin.jvm.internal.k kVar) {
        this();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String strG = i0.b(getClass()).g();
        t.c(strG);
        return strG;
    }
}
