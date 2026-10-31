package u;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: FontRequestWorker.java */
/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final androidx.collection.f<String, Typeface> f25840a = new androidx.collection.f<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f25841b = h.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f25842c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final androidx.collection.h<String, ArrayList<w.b<e>>> f25843d = new androidx.collection.h<>();

    /* JADX INFO: compiled from: FontRequestWorker.java */
    class a implements Callable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f25844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f25845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u.e f25846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f25847d;

        a(String str, Context context, u.e eVar, int i10) {
            this.f25844a = str;
            this.f25845b = context;
            this.f25846c = eVar;
            this.f25847d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f25844a, this.f25845b, this.f25846c, this.f25847d);
        }
    }

    /* JADX INFO: compiled from: FontRequestWorker.java */
    class b implements w.b<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u.a f25848a;

        b(u.a aVar) {
            this.f25848a = aVar;
        }

        @Override // w.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f25848a.b(eVar);
        }
    }

    /* JADX INFO: compiled from: FontRequestWorker.java */
    class c implements Callable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f25849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f25850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u.e f25851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f25852d;

        c(String str, Context context, u.e eVar, int i10) {
            this.f25849a = str;
            this.f25850b = context;
            this.f25851c = eVar;
            this.f25852d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f25849a, this.f25850b, this.f25851c, this.f25852d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* JADX INFO: compiled from: FontRequestWorker.java */
    class d implements w.b<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f25853a;

        d(String str) {
            this.f25853a = str;
        }

        @Override // w.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f25842c) {
                androidx.collection.h<String, ArrayList<w.b<e>>> hVar = f.f25843d;
                ArrayList<w.b<e>> arrayList = hVar.get(this.f25853a);
                if (arrayList == null) {
                    return;
                }
                hVar.remove(this.f25853a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(eVar);
                }
            }
        }
    }

    private static String a(u.e eVar, int i10) {
        return eVar.d() + "-" + i10;
    }

    private static int b(g.a aVar) {
        int i10 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] bVarArrB = aVar.b();
        if (bVarArrB != null && bVarArrB.length != 0) {
            i10 = 0;
            for (g.b bVar : bVarArrB) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, u.e eVar, int i10) {
        androidx.collection.f<String, Typeface> fVar = f25840a;
        Typeface typeface = fVar.get(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a aVarE = u.d.e(context, eVar, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = androidx.core.graphics.h.b(context, null, aVarE.b(), i10);
            if (typefaceB == null) {
                return new e(-3);
            }
            fVar.put(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    static Typeface d(Context context, u.e eVar, int i10, Executor executor, u.a aVar) {
        String strA = a(eVar, i10);
        Typeface typeface = f25840a.get(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f25842c) {
            androidx.collection.h<String, ArrayList<w.b<e>>> hVar = f25843d;
            ArrayList<w.b<e>> arrayList = hVar.get(strA);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<w.b<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            hVar.put(strA, arrayList2);
            c cVar = new c(strA, context, eVar, i10);
            if (executor == null) {
                executor = f25841b;
            }
            h.b(executor, cVar, new d(strA));
            return null;
        }
    }

    static Typeface e(Context context, u.e eVar, u.a aVar, int i10, int i11) {
        String strA = a(eVar, i10);
        Typeface typeface = f25840a.get(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, eVar, i10);
            aVar.b(eVarC);
            return eVarC.f25854a;
        }
        try {
            e eVar2 = (e) h.c(f25841b, new a(strA, context, eVar, i10), i11);
            aVar.b(eVar2);
            return eVar2.f25854a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    /* JADX INFO: compiled from: FontRequestWorker.java */
    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f25854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f25855b;

        e(int i10) {
            this.f25854a = null;
            this.f25855b = i10;
        }

        boolean a() {
            return this.f25855b == 0;
        }

        e(Typeface typeface) {
            this.f25854a = typeface;
            this.f25855b = 0;
        }
    }
}
