package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f11363a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f11364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f11365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f11366d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f11370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Intent f11371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final z f11372j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ServiceConnection f11376n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private IInterface f11377o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f11367e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f11368f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f11369g = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final IBinder.DeathRecipient f11374l = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.u
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            ae.k(this.f11403a);
        }
    };

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicInteger f11375m = new AtomicInteger(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final WeakReference f11373k = new WeakReference(null);

    public ae(Context context, s sVar, String str, Intent intent, z zVar, y yVar) {
        this.f11364b = context;
        this.f11365c = sVar;
        this.f11366d = str;
        this.f11371i = intent;
        this.f11372j = zVar;
    }

    static /* bridge */ /* synthetic */ void o(final ae aeVar, final TaskCompletionSource taskCompletionSource) {
        aeVar.f11368f.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.v
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f11404a.u(taskCompletionSource, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void q(ae aeVar, t tVar) {
        if (aeVar.f11377o != null || aeVar.f11370h) {
            if (!aeVar.f11370h) {
                tVar.run();
                return;
            } else {
                aeVar.f11365c.d("Waiting to bind to the service.", new Object[0]);
                aeVar.f11367e.add(tVar);
                return;
            }
        }
        aeVar.f11365c.d("Initiate binding to the service.", new Object[0]);
        aeVar.f11367e.add(tVar);
        ad adVar = new ad(aeVar, null);
        aeVar.f11376n = adVar;
        aeVar.f11370h = true;
        if (aeVar.f11364b.bindService(aeVar.f11371i, adVar, 1)) {
            return;
        }
        aeVar.f11365c.d("Failed to bind to the service.", new Object[0]);
        aeVar.f11370h = false;
        Iterator it = aeVar.f11367e.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(new af());
        }
        aeVar.f11367e.clear();
    }

    static /* bridge */ /* synthetic */ void r(ae aeVar) {
        aeVar.f11365c.d("linkToDeath", new Object[0]);
        try {
            aeVar.f11377o.asBinder().linkToDeath(aeVar.f11374l, 0);
        } catch (RemoteException e10) {
            aeVar.f11365c.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void s(ae aeVar) {
        aeVar.f11365c.d("unlinkToDeath", new Object[0]);
        aeVar.f11377o.asBinder().unlinkToDeath(aeVar.f11374l, 0);
    }

    private final RemoteException w() {
        return new RemoteException(String.valueOf(this.f11366d).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        Iterator it = this.f11368f.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(w());
        }
        this.f11368f.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f11363a;
        synchronized (map) {
            if (!map.containsKey(this.f11366d)) {
                HandlerThread handlerThread = new HandlerThread(this.f11366d, 10);
                handlerThread.start();
                map.put(this.f11366d, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f11366d);
        }
        return handler;
    }

    public final IInterface e() {
        return this.f11377o;
    }

    public final void t(t tVar, TaskCompletionSource taskCompletionSource) {
        c().post(new w(this, tVar.c(), taskCompletionSource, tVar));
    }

    final /* synthetic */ void u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f11369g) {
            this.f11368f.remove(taskCompletionSource);
        }
    }

    public final void v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f11369g) {
            this.f11368f.remove(taskCompletionSource);
        }
        c().post(new x(this));
    }

    public static /* synthetic */ void k(ae aeVar) {
        aeVar.f11365c.d(sRGQSqxgxlS.PTvKc, new Object[0]);
        y yVar = (y) aeVar.f11373k.get();
        if (yVar != null) {
            aeVar.f11365c.d("calling onBinderDied", new Object[0]);
            yVar.a();
        } else {
            aeVar.f11365c.d("%s : Binder has died.", aeVar.f11366d);
            Iterator it = aeVar.f11367e.iterator();
            while (it.hasNext()) {
                ((t) it.next()).a(aeVar.w());
            }
            aeVar.f11367e.clear();
        }
        synchronized (aeVar.f11369g) {
            aeVar.x();
        }
    }
}
