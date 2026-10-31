package b2;

/* JADX INFO: compiled from: Event.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c<T> {
    public static <T> c<T> f(T t10) {
        return new a(null, t10, e.DEFAULT, null, null);
    }

    public static <T> c<T> g(T t10) {
        return new a(null, t10, e.HIGHEST, null, null);
    }

    public abstract Integer a();

    public abstract d b();

    public abstract T c();

    public abstract e d();

    public abstract f e();
}
