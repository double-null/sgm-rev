package wc;

import java.io.Serializable;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class r<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27774b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f27775a;

    /* JADX INFO: compiled from: Result.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: Result.kt */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f27776a;

        public b(Throwable exception) {
            kotlin.jvm.internal.t.f(exception, "exception");
            this.f27776a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && kotlin.jvm.internal.t.a(this.f27776a, ((b) obj).f27776a);
        }

        public int hashCode() {
            return this.f27776a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f27776a + ')';
        }
    }

    private /* synthetic */ r(Object obj) {
        this.f27775a = obj;
    }

    public static final /* synthetic */ r b(Object obj) {
        return new r(obj);
    }

    public static boolean e(Object obj, Object obj2) {
        return (obj2 instanceof r) && kotlin.jvm.internal.t.a(obj, ((r) obj2).p());
    }

    public static final boolean f(Object obj, Object obj2) {
        return kotlin.jvm.internal.t.a(obj, obj2);
    }

    public static final Throwable g(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f27776a;
        }
        return null;
    }

    public static int h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean k(Object obj) {
        return obj instanceof b;
    }

    public static final boolean n(Object obj) {
        return !(obj instanceof b);
    }

    public static String o(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f27775a, obj);
    }

    public int hashCode() {
        return h(this.f27775a);
    }

    public final /* synthetic */ Object p() {
        return this.f27775a;
    }

    public String toString() {
        return o(this.f27775a);
    }

    public static <T> Object c(Object obj) {
        return obj;
    }
}
