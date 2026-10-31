package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f3491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f3492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f3493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final androidx.room.e f3494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final androidx.room.e.c f3495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.room.c f3496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Executor f3497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final androidx.room.b f3498h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final AtomicBoolean f3499i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ServiceConnection f3500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Runnable f3501k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Runnable f3502l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f3503m;

    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
    class a extends androidx.room.b.a {

        /* JADX INFO: renamed from: androidx.room.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
        class RunnableC0069a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String[] f3505a;

            RunnableC0069a(String[] strArr) {
                this.f3505a = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.f3494d.e(this.f3505a);
            }
        }

        a() {
        }

        @Override // androidx.room.b
        public void e(String[] strArr) {
            f.this.f3497g.execute(new RunnableC0069a(strArr));
        }
    }

    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            f.this.f3496f = androidx.room.c.a.M(iBinder);
            f fVar = f.this;
            fVar.f3497g.execute(fVar.f3501k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            f fVar = f.this;
            fVar.f3497g.execute(fVar.f3502l);
            f.this.f3496f = null;
        }
    }

    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f fVar = f.this;
                androidx.room.c cVar = fVar.f3496f;
                if (cVar != null) {
                    fVar.f3493c = cVar.p(fVar.f3498h, fVar.f3492b);
                    f fVar2 = f.this;
                    fVar2.f3494d.a(fVar2.f3495e);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
            }
        }
    }

    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f3494d.g(fVar.f3495e);
        }
    }

    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f3494d.g(fVar.f3495e);
            try {
                f fVar2 = f.this;
                androidx.room.c cVar = fVar2.f3496f;
                if (cVar != null) {
                    cVar.K(fVar2.f3498h, fVar2.f3493c);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            f fVar3 = f.this;
            fVar3.f3491a.unbindService(fVar3.f3500j);
        }
    }

    /* JADX INFO: renamed from: androidx.room.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.java */
    class C0070f extends androidx.room.e.c {
        C0070f(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.e.c
        boolean a() {
            return true;
        }

        @Override // androidx.room.e.c
        public void b(Set<String> set) {
            if (f.this.f3499i.get()) {
                return;
            }
            try {
                f fVar = f.this;
                androidx.room.c cVar = fVar.f3496f;
                if (cVar != null) {
                    cVar.l(fVar.f3493c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    f(Context context, String str, androidx.room.e eVar, Executor executor) {
        b bVar = new b();
        this.f3500j = bVar;
        this.f3501k = new c();
        this.f3502l = new d();
        this.f3503m = new e();
        Context applicationContext = context.getApplicationContext();
        this.f3491a = applicationContext;
        this.f3492b = str;
        this.f3494d = eVar;
        this.f3497g = executor;
        this.f3495e = new C0070f((String[]) eVar.f3468a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, (Class<?>) MultiInstanceInvalidationService.class), bVar, 1);
    }
}
