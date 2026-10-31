package u;

import android.graphics.Typeface;
import android.os.Handler;

/* JADX INFO: compiled from: CallbackWithHandler.java */
/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.c f25824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f25825b;

    /* JADX INFO: renamed from: u.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CallbackWithHandler.java */
    class RunnableC0434a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f25826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f25827b;

        RunnableC0434a(g.c cVar, Typeface typeface) {
            this.f25826a = cVar;
            this.f25827b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25826a.b(this.f25827b);
        }
    }

    /* JADX INFO: compiled from: CallbackWithHandler.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f25829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25830b;

        b(g.c cVar, int i10) {
            this.f25829a = cVar;
            this.f25830b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25829a.a(this.f25830b);
        }
    }

    a(g.c cVar, Handler handler) {
        this.f25824a = cVar;
        this.f25825b = handler;
    }

    private void a(int i10) {
        this.f25825b.post(new b(this.f25824a, i10));
    }

    private void c(Typeface typeface) {
        this.f25825b.post(new RunnableC0434a(this.f25824a, typeface));
    }

    void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f25854a);
        } else {
            a(eVar.f25855b);
        }
    }
}
