package x7;

import android.os.Looper;

/* JADX INFO: compiled from: BackgroundThreadStateHandler.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f28110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f28111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a<T> f28112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T f28113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private T f28114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28115f;

    /* JADX INFO: compiled from: BackgroundThreadStateHandler.java */
    public interface a<T> {
        void a(T t10, T t11);
    }

    public f(T t10, Looper looper, Looper looper2, h hVar, a<T> aVar) {
        this.f28110a = hVar.b(looper, null);
        this.f28111b = hVar.b(looper2, null);
        this.f28113d = t10;
        this.f28114e = t10;
        this.f28112c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void e(Object obj) {
        if (this.f28115f == 0) {
            k(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void f(Object obj) {
        int i10 = this.f28115f - 1;
        this.f28115f = i10;
        if (i10 == 0) {
            k(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(com.google.common.base.g gVar) {
        final T t10 = (T) gVar.apply(this.f28114e);
        this.f28114e = t10;
        this.f28111b.i(new Runnable() { // from class: x7.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f28104a.f(t10);
            }
        });
    }

    private void k(T t10) {
        T t11 = this.f28113d;
        this.f28113d = t10;
        if (t11.equals(t10)) {
            return;
        }
        this.f28112c.a(t11, t10);
    }

    public T d() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.f28111b.g()) {
            return this.f28113d;
        }
        x7.a.g(looperMyLooper == this.f28110a.g());
        return this.f28114e;
    }

    public void h(Runnable runnable) {
        this.f28110a.i(runnable);
    }

    public void i(final T t10) {
        this.f28114e = t10;
        this.f28111b.i(new Runnable() { // from class: x7.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f28096a.e(t10);
            }
        });
    }

    public void j(com.google.common.base.g<T, T> gVar, final com.google.common.base.g<T, T> gVar2) {
        x7.a.g(Looper.myLooper() == this.f28111b.g());
        this.f28115f++;
        this.f28110a.i(new Runnable() { // from class: x7.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f28102a.g(gVar2);
            }
        });
        k(gVar.apply(this.f28113d));
    }
}
