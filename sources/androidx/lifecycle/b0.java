package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: compiled from: ServiceLifecycleDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f2885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f2886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f2887c;

    /* JADX INFO: compiled from: ServiceLifecycleDispatcher.kt */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f2888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f.a f2889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f2890c;

        public a(k registry, f.a event) {
            kotlin.jvm.internal.t.f(registry, "registry");
            kotlin.jvm.internal.t.f(event, "event");
            this.f2888a = registry;
            this.f2889b = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2890c) {
                return;
            }
            this.f2888a.h(this.f2889b);
            this.f2890c = true;
        }
    }

    public b0(j provider) {
        kotlin.jvm.internal.t.f(provider, "provider");
        this.f2885a = new k(provider);
        this.f2886b = new Handler();
    }

    private final void f(f.a aVar) {
        a aVar2 = this.f2887c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f2885a, aVar);
        this.f2887c = aVar3;
        Handler handler = this.f2886b;
        kotlin.jvm.internal.t.c(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    public f a() {
        return this.f2885a;
    }

    public void b() {
        f(f.a.ON_START);
    }

    public void c() {
        f(f.a.ON_CREATE);
    }

    public void d() {
        f(f.a.ON_STOP);
        f(f.a.ON_DESTROY);
    }

    public void e() {
        f(f.a.ON_START);
    }
}
