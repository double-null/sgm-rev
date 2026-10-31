package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import t3.i;

/* JADX INFO: compiled from: FirebaseInstallations.java */
/* JADX INFO: loaded from: classes4.dex */
public class c implements FirebaseInstallationsApi {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f12254m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f12255n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseApp f12256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x3.c f12257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w3.c f12258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f12259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy<w3.b> f12260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u3.f f12261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f12262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f12263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f12264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f12265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Set<v3.a> f12266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<g> f12267l;

    /* JADX INFO: compiled from: FirebaseInstallations.java */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f12268a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f12268a.getAndIncrement())));
        }
    }

    /* JADX INFO: compiled from: FirebaseInstallations.java */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f12270b;

        static {
            int[] iArr = new int[x3.f.b.values().length];
            f12270b = iArr;
            try {
                iArr[x3.f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12270b[x3.f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12270b[x3.f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[x3.d.b.values().length];
            f12269a = iArr2;
            try {
                iArr2[x3.d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12269a[x3.d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    c(final FirebaseApp firebaseApp, Provider<i> provider, ExecutorService executorService, Executor executor) {
        this(executorService, executor, firebaseApp, new x3.c(firebaseApp.getApplicationContext(), provider), new w3.c(firebaseApp), h.c(), new Lazy(new Provider() { // from class: u3.c
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return com.google.firebase.installations.c.y(firebaseApp);
            }
        }), new u3.f());
    }

    private String A(w3.d dVar) {
        if ((!this.f12256a.getName().equals("CHIME_ANDROID_SDK") && !this.f12256a.isDefaultApp()) || !dVar.m()) {
            return this.f12261f.a();
        }
        String strF = o().f();
        return TextUtils.isEmpty(strF) ? this.f12261f.a() : strF;
    }

    private w3.d B(w3.d dVar) throws FirebaseInstallationsException {
        x3.d dVarD = this.f12257b.d(l(), dVar.d(), t(), m(), (dVar.d() == null || dVar.d().length() != 11) ? null : o().i());
        int i10 = b.f12269a[dVarD.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f12259d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
    }

    private void C(Exception exc) {
        synchronized (this.f12262g) {
            Iterator<g> it = this.f12267l.iterator();
            while (it.hasNext()) {
                if (it.next().a(exc)) {
                    it.remove();
                }
            }
        }
    }

    private void D(w3.d dVar) {
        synchronized (this.f12262g) {
            Iterator<g> it = this.f12267l.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void E(String str) {
        this.f12265j = str;
    }

    private synchronized void F(w3.d dVar, w3.d dVar2) {
        if (this.f12266k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator<v3.a> it = this.f12266k.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }

    private Task<f> f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new d(this.f12259d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<String> g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new e(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void h(g gVar) {
        synchronized (this.f12262g) {
            this.f12267l.add(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void v(boolean z10) {
        w3.d dVarB;
        w3.d dVarR = r();
        try {
            if (dVarR.i() || dVarR.l()) {
                dVarB = B(dVarR);
            } else {
                if (!z10 && !this.f12259d.f(dVarR)) {
                    return;
                }
                dVarB = k(dVarR);
            }
            u(dVarB);
            F(dVarR, dVarB);
            if (dVarB.k()) {
                E(dVarB.d());
            }
            if (dVarB.i()) {
                C(new FirebaseInstallationsException(FirebaseInstallationsException.a.BAD_CONFIG));
            } else if (dVarB.j()) {
                C(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                D(dVarB);
            }
        } catch (FirebaseInstallationsException e10) {
            C(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void x(final boolean z10) {
        w3.d dVarS = s();
        if (z10) {
            dVarS = dVarS.p();
        }
        D(dVarS);
        this.f12264i.execute(new Runnable() { // from class: u3.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f25898a.v(z10);
            }
        });
    }

    private w3.d k(w3.d dVar) throws FirebaseInstallationsException {
        x3.f fVarE = this.f12257b.e(l(), dVar.d(), t(), dVar.f());
        int i10 = b.f12270b[fVarE.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f12259d.b());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
        E(null);
        return dVar.r();
    }

    private synchronized String n() {
        return this.f12265j;
    }

    private w3.b o() {
        return this.f12260e.get();
    }

    public static c p() {
        return q(FirebaseApp.getInstance());
    }

    public static c q(FirebaseApp firebaseApp) {
        Preconditions.checkArgument(firebaseApp != null, "Null is not a valid value of FirebaseApp.");
        return (c) firebaseApp.get(FirebaseInstallationsApi.class);
    }

    private w3.d r() {
        w3.d dVarD;
        synchronized (f12254m) {
            com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f12256a.getApplicationContext(), "generatefid.lock");
            try {
                dVarD = this.f12258c.d();
                if (bVarA != null) {
                    bVarA.b();
                }
            } catch (Throwable th) {
                if (bVarA != null) {
                    bVarA.b();
                }
                throw th;
            }
        }
        return dVarD;
    }

    private w3.d s() {
        w3.d dVarD;
        synchronized (f12254m) {
            com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f12256a.getApplicationContext(), "generatefid.lock");
            try {
                dVarD = this.f12258c.d();
                if (dVarD.j()) {
                    dVarD = this.f12258c.b(dVarD.t(A(dVarD)));
                }
                if (bVarA != null) {
                    bVarA.b();
                }
            } catch (Throwable th) {
                if (bVarA != null) {
                    bVarA.b();
                }
                throw th;
            }
        }
        return dVarD;
    }

    private void u(w3.d dVar) {
        synchronized (f12254m) {
            com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f12256a.getApplicationContext(), "generatefid.lock");
            try {
                this.f12258c.b(dVar);
                if (bVarA != null) {
                    bVarA.b();
                }
            } catch (Throwable th) {
                if (bVarA != null) {
                    bVarA.b();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        x(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w3.b y(FirebaseApp firebaseApp) {
        return new w3.b(firebaseApp);
    }

    private void z() {
        Preconditions.checkNotEmpty(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(h.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(h.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public Task<f> a(final boolean z10) {
        z();
        Task<f> taskF = f();
        this.f12263h.execute(new Runnable() { // from class: u3.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f25894a.x(z10);
            }
        });
        return taskF;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public Task<String> getId() {
        z();
        String strN = n();
        if (strN != null) {
            return Tasks.forResult(strN);
        }
        Task<String> taskG = g();
        this.f12263h.execute(new Runnable() { // from class: u3.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f25896a.w();
            }
        });
        return taskG;
    }

    String l() {
        return this.f12256a.getOptions().getApiKey();
    }

    String m() {
        return this.f12256a.getOptions().getApplicationId();
    }

    String t() {
        return this.f12256a.getOptions().getProjectId();
    }

    c(ExecutorService executorService, Executor executor, FirebaseApp firebaseApp, x3.c cVar, w3.c cVar2, h hVar, Lazy<w3.b> lazy, u3.f fVar) {
        this.f12262g = new Object();
        this.f12266k = new HashSet();
        this.f12267l = new ArrayList();
        this.f12256a = firebaseApp;
        this.f12257b = cVar;
        this.f12258c = cVar2;
        this.f12259d = hVar;
        this.f12260e = lazy;
        this.f12261f = fVar;
        this.f12263h = executorService;
        this.f12264i = executor;
    }
}
