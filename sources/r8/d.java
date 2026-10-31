package r8;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import z7.o;

/* JADX INFO: compiled from: BandwidthMeter.java */
/* JADX INFO: loaded from: classes4.dex */
public interface d {

    /* JADX INFO: compiled from: BandwidthMeter.java */
    public interface a {

        /* JADX INFO: renamed from: r8.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BandwidthMeter.java */
        public static final class C0406a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C0407a> f24933a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: r8.d$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: BandwidthMeter.java */
            static final class C0407a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Handler f24934a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final a f24935b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f24936c;

                public C0407a(Handler handler, a aVar) {
                    this.f24934a = handler;
                    this.f24935b = aVar;
                }

                public void d() {
                    this.f24936c = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void d(C0407a c0407a, int i10, long j10, long j11) {
                c0407a.f24935b.J(i10, j10, j11);
            }

            public void b(Handler handler, a aVar) {
                x7.a.e(handler);
                x7.a.e(aVar);
                e(aVar);
                this.f24933a.add(new C0407a(handler, aVar));
            }

            public void c(final int i10, final long j10, final long j11) {
                for (final C0407a c0407a : this.f24933a) {
                    if (!c0407a.f24936c) {
                        c0407a.f24934a.post(new Runnable() { // from class: r8.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                d.a.C0406a.d(c0407a, i10, j10, j11);
                            }
                        });
                    }
                }
            }

            public void e(a aVar) {
                for (C0407a c0407a : this.f24933a) {
                    if (c0407a.f24935b == aVar) {
                        c0407a.d();
                        this.f24933a.remove(c0407a);
                    }
                }
            }
        }

        void J(int i10, long j10, long j11);
    }

    default long a() {
        return -9223372036854775807L;
    }

    o c();

    void d(a aVar);

    long e();

    void g(Handler handler, a aVar);
}
