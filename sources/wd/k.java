package wd;

import com.facebook.internal.AnalyticsEvents;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f27846b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f27847c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f27848a;

    /* JADX INFO: compiled from: Channel.kt */
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f27849a;

        public a(Throwable th) {
            this.f27849a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && kotlin.jvm.internal.t.a(this.f27849a, ((a) obj).f27849a);
        }

        public int hashCode() {
            Throwable th = this.f27849a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // wd.k.c
        public String toString() {
            return "Closed(" + this.f27849a + ')';
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final <E> Object a(Throwable th) {
            return k.c(new a(th));
        }

        public final <E> Object b() {
            return k.c(k.f27847c);
        }

        public final <E> Object c(E e10) {
            return k.c(e10);
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    public static class c {
        public String toString() {
            return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED;
        }
    }

    private /* synthetic */ k(Object obj) {
        this.f27848a = obj;
    }

    public static final /* synthetic */ k b(Object obj) {
        return new k(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof k) && kotlin.jvm.internal.t.a(obj, ((k) obj2).k());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f27849a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f27848a, obj);
    }

    public int hashCode() {
        return g(this.f27848a);
    }

    public final /* synthetic */ Object k() {
        return this.f27848a;
    }

    public String toString() {
        return j(this.f27848a);
    }

    public static <T> Object c(Object obj) {
        return obj;
    }
}
