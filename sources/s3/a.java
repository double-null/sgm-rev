package s3;

import x2.n;

/* JADX INFO: compiled from: Event.java */
/* JADX INFO: loaded from: classes4.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<T> f25204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f25205b;

    public a(Class<T> cls, T t10) {
        this.f25204a = (Class) n.b(cls);
        this.f25205b = (T) n.b(t10);
    }

    public T a() {
        return this.f25205b;
    }

    public Class<T> b() {
        return this.f25204a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f25204a, this.f25205b);
    }
}
