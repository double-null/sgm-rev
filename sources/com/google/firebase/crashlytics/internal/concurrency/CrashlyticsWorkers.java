package com.google.firebase.crashlytics.internal.concurrency;

import android.os.Looper;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import rd.f0;
import z2.f;

/* JADX INFO: compiled from: CrashlyticsWorkers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CrashlyticsWorkers {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f12210e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f12211f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.concurrency.a f12212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.concurrency.a f12213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.concurrency.a f12214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.concurrency.a f12215d;

    /* JADX INFO: compiled from: CrashlyticsWorkers.kt */
    public static final class a {

        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CrashlyticsWorkers.kt */
        /* synthetic */ class C0151a extends q implements id.a<Boolean> {
            C0151a(Object obj) {
                super(0, obj, a.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            @Override // id.a
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).p());
            }
        }

        /* JADX INFO: compiled from: CrashlyticsWorkers.kt */
        /* synthetic */ class b extends q implements id.a<Boolean> {
            b(Object obj) {
                super(0, obj, a.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            @Override // id.a
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).q());
            }
        }

        /* JADX INFO: compiled from: CrashlyticsWorkers.kt */
        /* synthetic */ class c extends q implements id.a<Boolean> {
            c(Object obj) {
                super(0, obj, a.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            @Override // id.a
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).r());
            }
        }

        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String h() {
            return "Must be called on a background thread, was called on " + CrashlyticsWorkers.f12210e.o() + '.';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String j() {
            return "Must be called on a blocking thread, was called on " + CrashlyticsWorkers.f12210e.o() + '.';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String l() {
            return "Must not be called on a main thread, was called on " + CrashlyticsWorkers.f12210e.o() + '.';
        }

        private final void m(id.a<Boolean> aVar, id.a<String> aVar2) {
            if (aVar.invoke().booleanValue()) {
                return;
            }
            f.f().b(aVar2.invoke());
            n();
        }

        private final String o() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean p() {
            String strO = o();
            t.e(strO, "<get-threadName>(...)");
            return f0.U(strO, "Firebase Background Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean q() {
            String strO = o();
            t.e(strO, "<get-threadName>(...)");
            return f0.U(strO, "Firebase Blocking Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean r() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        public final void g() {
            m(new C0151a(this), new id.a() { // from class: c3.e
                @Override // id.a
                public final Object invoke() {
                    return CrashlyticsWorkers.a.h();
                }
            });
        }

        public final void i() {
            m(new b(this), new id.a() { // from class: c3.g
                @Override // id.a
                public final Object invoke() {
                    return CrashlyticsWorkers.a.j();
                }
            });
        }

        public final void k() {
            m(new c(this), new id.a() { // from class: c3.f
                @Override // id.a
                public final Object invoke() {
                    return CrashlyticsWorkers.a.l();
                }
            });
        }

        public final boolean n() {
            return CrashlyticsWorkers.f12211f;
        }

        public final void s(boolean z10) {
            CrashlyticsWorkers.f12211f = z10;
        }
    }

    public CrashlyticsWorkers(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        t.f(backgroundExecutorService, "backgroundExecutorService");
        t.f(blockingExecutorService, "blockingExecutorService");
        this.f12212a = new com.google.firebase.crashlytics.internal.concurrency.a(backgroundExecutorService);
        this.f12213b = new com.google.firebase.crashlytics.internal.concurrency.a(backgroundExecutorService);
        this.f12214c = new com.google.firebase.crashlytics.internal.concurrency.a(backgroundExecutorService);
        this.f12215d = new com.google.firebase.crashlytics.internal.concurrency.a(blockingExecutorService);
    }

    public static final void c() {
        f12210e.g();
    }

    public static final void d() {
        f12210e.i();
    }

    public static final void e() {
        f12210e.k();
    }

    public static final void f(boolean z10) {
        f12210e.s(z10);
    }
}
