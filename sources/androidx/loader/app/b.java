package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.i;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.j;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: LoaderManagerImpl.java */
/* JADX INFO: loaded from: classes2.dex */
class b extends androidx.loader.app.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f2955c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f2956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f2957b;

    /* JADX INFO: compiled from: LoaderManagerImpl.java */
    /* JADX INFO: loaded from: classes.dex */
    public static class a<D> extends p<D> implements androidx.loader.content.b.InterfaceC0056b<D> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f2958l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Bundle f2959m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final androidx.loader.content.b<D> f2960n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private j f2961o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private C0054b<D> f2962p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private androidx.loader.content.b<D> f2963q;

        a(int i10, Bundle bundle, androidx.loader.content.b<D> bVar, androidx.loader.content.b<D> bVar2) {
            this.f2958l = i10;
            this.f2959m = bundle;
            this.f2960n = bVar;
            this.f2963q = bVar2;
            bVar.registerListener(i10, this);
        }

        @Override // androidx.loader.content.b.InterfaceC0056b
        public void a(androidx.loader.content.b<D> bVar, D d10) {
            if (b.f2955c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                n(d10);
                return;
            }
            if (b.f2955c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            l(d10);
        }

        @Override // androidx.lifecycle.LiveData
        protected void j() {
            if (b.f2955c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f2960n.startLoading();
        }

        @Override // androidx.lifecycle.LiveData
        protected void k() {
            if (b.f2955c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f2960n.stopLoading();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void m(q<? super D> qVar) {
            super.m(qVar);
            this.f2961o = null;
            this.f2962p = null;
        }

        @Override // androidx.lifecycle.p, androidx.lifecycle.LiveData
        public void n(D d10) {
            super.n(d10);
            androidx.loader.content.b<D> bVar = this.f2963q;
            if (bVar != null) {
                bVar.reset();
                this.f2963q = null;
            }
        }

        androidx.loader.content.b<D> o(boolean z10) {
            if (b.f2955c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f2960n.cancelLoad();
            this.f2960n.abandon();
            C0054b<D> c0054b = this.f2962p;
            if (c0054b != null) {
                m(c0054b);
                if (z10) {
                    c0054b.d();
                }
            }
            this.f2960n.unregisterListener(this);
            if ((c0054b == null || c0054b.c()) && !z10) {
                return this.f2960n;
            }
            this.f2960n.reset();
            return this.f2963q;
        }

        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f2958l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f2959m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f2960n);
            this.f2960n.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f2962p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f2962p);
                this.f2962p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(q().dataToString(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        androidx.loader.content.b<D> q() {
            return this.f2960n;
        }

        void r() {
            j jVar = this.f2961o;
            C0054b<D> c0054b = this.f2962p;
            if (jVar == null || c0054b == null) {
                return;
            }
            super.m(c0054b);
            h(jVar, c0054b);
        }

        androidx.loader.content.b<D> s(j jVar, androidx.loader.app.a.InterfaceC0053a<D> interfaceC0053a) {
            C0054b<D> c0054b = new C0054b<>(this.f2960n, interfaceC0053a);
            h(jVar, c0054b);
            C0054b<D> c0054b2 = this.f2962p;
            if (c0054b2 != null) {
                m(c0054b2);
            }
            this.f2961o = jVar;
            this.f2962p = c0054b;
            return this.f2960n;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f2958l);
            sb2.append(" : ");
            w.c.a(this.f2960n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LoaderManagerImpl.java */
    /* JADX INFO: loaded from: classes.dex */
    static class C0054b<D> implements q<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.loader.content.b<D> f2964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.loader.app.a.InterfaceC0053a<D> f2965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f2966c = false;

        C0054b(androidx.loader.content.b<D> bVar, androidx.loader.app.a.InterfaceC0053a<D> interfaceC0053a) {
            this.f2964a = bVar;
            this.f2965b = interfaceC0053a;
        }

        @Override // androidx.lifecycle.q
        public void a(D d10) {
            if (b.f2955c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f2964a + ": " + this.f2964a.dataToString(d10));
            }
            this.f2965b.onLoadFinished(this.f2964a, d10);
            this.f2966c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f2966c);
        }

        boolean c() {
            return this.f2966c;
        }

        void d() {
            if (this.f2966c) {
                if (b.f2955c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f2964a);
                }
                this.f2965b.onLoaderReset(this.f2964a);
            }
        }

        public String toString() {
            return this.f2965b.toString();
        }
    }

    /* JADX INFO: compiled from: LoaderManagerImpl.java */
    /* JADX INFO: loaded from: classes.dex */
    static class c extends c0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final d0.b f2967f = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private i<a> f2968d = new i<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f2969e = false;

        /* JADX INFO: compiled from: LoaderManagerImpl.java */
        static class a implements d0.b {
            a() {
            }

            @Override // androidx.lifecycle.d0.b
            public <T extends c0> T b(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c h(f0 f0Var) {
            return (c) new d0(f0Var, f2967f).a(c.class);
        }

        @Override // androidx.lifecycle.c0
        protected void d() {
            super.d();
            int iL = this.f2968d.l();
            for (int i10 = 0; i10 < iL; i10++) {
                this.f2968d.m(i10).o(true);
            }
            this.f2968d.b();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f2968d.l() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f2968d.l(); i10++) {
                    a aVarM = this.f2968d.m(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f2968d.j(i10));
                    printWriter.print(": ");
                    printWriter.println(aVarM.toString());
                    aVarM.p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void g() {
            this.f2969e = false;
        }

        <D> a<D> i(int i10) {
            return this.f2968d.h(i10);
        }

        boolean j() {
            return this.f2969e;
        }

        void k() {
            int iL = this.f2968d.l();
            for (int i10 = 0; i10 < iL; i10++) {
                this.f2968d.m(i10).r();
            }
        }

        void l(int i10, a aVar) {
            this.f2968d.k(i10, aVar);
        }

        void m() {
            this.f2969e = true;
        }
    }

    b(j jVar, f0 f0Var) {
        this.f2956a = jVar;
        this.f2957b = c.h(f0Var);
    }

    private <D> androidx.loader.content.b<D> e(int i10, Bundle bundle, androidx.loader.app.a.InterfaceC0053a<D> interfaceC0053a, androidx.loader.content.b<D> bVar) {
        try {
            this.f2957b.m();
            androidx.loader.content.b<D> bVarOnCreateLoader = interfaceC0053a.onCreateLoader(i10, bundle);
            if (bVarOnCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (bVarOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(bVarOnCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + bVarOnCreateLoader);
            }
            a aVar = new a(i10, bundle, bVarOnCreateLoader, bVar);
            if (f2955c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.f2957b.l(i10, aVar);
            this.f2957b.g();
            return aVar.s(this.f2956a, interfaceC0053a);
        } catch (Throwable th) {
            this.f2957b.g();
            throw th;
        }
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f2957b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public <D> androidx.loader.content.b<D> c(int i10, Bundle bundle, androidx.loader.app.a.InterfaceC0053a<D> interfaceC0053a) {
        if (this.f2957b.j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> aVarI = this.f2957b.i(i10);
        if (f2955c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarI == null) {
            return e(i10, bundle, interfaceC0053a, null);
        }
        if (f2955c) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarI);
        }
        return aVarI.s(this.f2956a, interfaceC0053a);
    }

    @Override // androidx.loader.app.a
    public void d() {
        this.f2957b.k();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        w.c.a(this.f2956a, sb2);
        sb2.append(ljglrLUdGZhMhQ.OsEkWpy);
        return sb2.toString();
    }
}
