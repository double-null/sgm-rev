package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;

/* JADX INFO: compiled from: TypefaceCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f0 f1855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.collection.f<String, Typeface> f1856b;

    /* JADX INFO: compiled from: TypefaceCompat.java */
    public static class a extends u.g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.core.content.res.d.a f1857a;

        public a(androidx.core.content.res.d.a aVar) {
            this.f1857a = aVar;
        }

        @Override // u.g.c
        public void a(int i10) {
            androidx.core.content.res.d.a aVar = this.f1857a;
            if (aVar != null) {
                aVar.f(i10);
            }
        }

        @Override // u.g.c
        public void b(Typeface typeface) {
            androidx.core.content.res.d.a aVar = this.f1857a;
            if (aVar != null) {
                aVar.g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f1855a = new e0();
        } else if (i10 >= 28) {
            f1855a = new p();
        } else if (i10 >= 26) {
            f1855a = new o();
        } else if (j.j()) {
            f1855a = new j();
        } else {
            f1855a = new i();
        }
        f1856b = new androidx.collection.f<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, u.g.b[] bVarArr, int i10) {
        return f1855a.b(context, cancellationSignal, bVarArr, i10);
    }

    public static Typeface c(Context context, androidx.core.content.res.a.b bVar, Resources resources, int i10, String str, int i11, int i12, androidx.core.content.res.d.a aVar, Handler handler, boolean z10) {
        Typeface typefaceA;
        if (bVar instanceof androidx.core.content.res.a.e) {
            androidx.core.content.res.a.e eVar = (androidx.core.content.res.a.e) bVar;
            Typeface typefaceG = g(eVar.c());
            if (typefaceG != null) {
                if (aVar != null) {
                    aVar.d(typefaceG, handler);
                }
                return typefaceG;
            }
            boolean z11 = !z10 ? aVar != null : eVar.a() != 0;
            int iD = z10 ? eVar.d() : -1;
            typefaceA = u.g.a(context, eVar.b(), i12, z11, iD, androidx.core.content.res.d.a.e(handler), new a(aVar));
        } else {
            typefaceA = f1855a.a(context, (androidx.core.content.res.a.c) bVar, resources, i12);
            if (aVar != null) {
                if (typefaceA != null) {
                    aVar.d(typefaceA, handler);
                } else {
                    aVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f1856b.put(e(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface d(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceD = f1855a.d(context, resources, i10, str, i12);
        if (typefaceD != null) {
            f1856b.put(e(resources, i10, str, i11, i12), typefaceD);
        }
        return typefaceD;
    }

    private static String e(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface f(Resources resources, int i10, String str, int i11, int i12) {
        return f1856b.get(e(resources, i10, str, i11, i12));
    }

    private static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
