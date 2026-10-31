package b4;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.FirebaseOptions;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: FirebaseSessions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f3966c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseApp f3967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4.j f3968b;

    /* JADX INFO: compiled from: FirebaseSessions.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {51, 55}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements id.p<ud.o0, zc.f<? super wc.g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f3969h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ s0 f3971j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s0 s0Var, zc.f<? super a> fVar) {
            super(2, fVar);
            this.f3971j = s0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(s0 s0Var, String str, FirebaseOptions firebaseOptions) {
            Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will stop collecting data.");
            s0Var.a();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            return l.this.new a(this.f3971j, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f<? super wc.g0> fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x007d  */
        /* JADX WARN: Code duplicated, block: B:32:0x0087  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f3969h;
            boolean z10 = true;
            if (i10 != 0) {
                if (i10 == 1) {
                    wc.s.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(obj);
                }
                if (l.this.f3968b.c()) {
                    FirebaseApp firebaseApp = l.this.f3967a;
                    final s0 s0Var = this.f3971j;
                    firebaseApp.addLifecycleEventListener(new FirebaseAppLifecycleListener() { // from class: b4.k
                        @Override // com.google.firebase.FirebaseAppLifecycleListener
                        public final void onDeleted(String str, FirebaseOptions firebaseOptions) {
                            l.a.o(s0Var, str, firebaseOptions);
                        }
                    });
                    wc.g0 g0Var = wc.g0.f27756a;
                } else {
                    kotlin.coroutines.jvm.internal.b.c(Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events."));
                }
                return wc.g0.f27756a;
            }
            wc.s.b(obj);
            c4.c cVar = c4.c.f4718a;
            this.f3969h = 1;
            obj = cVar.d(this);
            if (obj == objF) {
                return objF;
            }
            Collection collectionValues = ((Map) obj).values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((c4.d) it.next()).a()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10) {
                kotlin.coroutines.jvm.internal.b.c(Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events."));
            } else {
                e4.j jVar = l.this.f3968b;
                this.f3969h = 2;
                if (jVar.f(this) == objF) {
                    return objF;
                }
                if (l.this.f3968b.c()) {
                    kotlin.coroutines.jvm.internal.b.c(Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events."));
                } else {
                    FirebaseApp firebaseApp2 = l.this.f3967a;
                    final s0 s0Var2 = this.f3971j;
                    firebaseApp2.addLifecycleEventListener(new FirebaseAppLifecycleListener() { // from class: b4.k
                        @Override // com.google.firebase.FirebaseAppLifecycleListener
                        public final void onDeleted(String str, FirebaseOptions firebaseOptions) {
                            l.a.o(s0Var2, str, firebaseOptions);
                        }
                    });
                    wc.g0 g0Var2 = wc.g0.f27756a;
                }
            }
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: FirebaseSessions.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public l(FirebaseApp firebaseApp, e4.j settings, @w2.a zc.j backgroundDispatcher, s0 sessionsActivityLifecycleCallbacks) {
        kotlin.jvm.internal.t.f(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.t.f(settings, "settings");
        kotlin.jvm.internal.t.f(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.t.f(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.f3967a = firebaseApp;
        this.f3968b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.8.");
        Context applicationContext = firebaseApp.getApplicationContext().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            ud.k.d(ud.p0.a(backgroundDispatcher), null, null, new a(sessionsActivityLifecycleCallbacks, null), 3, null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
