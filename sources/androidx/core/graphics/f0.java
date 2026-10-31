package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
/* JADX INFO: loaded from: classes.dex */
class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<Long, androidx.core.content.res.a.c> f1848a = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
    class a implements b<u.g.b> {
        a() {
        }

        @Override // androidx.core.graphics.f0.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(u.g.b bVar) {
            return bVar.e();
        }

        @Override // androidx.core.graphics.f0.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(u.g.b bVar) {
            return bVar.f();
        }
    }

    /* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
    private interface b<T> {
        boolean a(T t10);

        int b(T t10);
    }

    f0() {
    }

    private static <T> T e(T[] tArr, int i10, b<T> bVar) {
        return (T) f(tArr, (i10 & 1) == 0 ? 400 : 700, (i10 & 2) != 0, bVar);
    }

    private static <T> T f(T[] tArr, int i10, boolean z10, b<T> bVar) {
        T t10 = null;
        int i11 = Integer.MAX_VALUE;
        for (T t11 : tArr) {
            int iAbs = (Math.abs(bVar.b(t11) - i10) * 2) + (bVar.a(t11) == z10 ? 0 : 1);
            if (t10 == null || i11 > iAbs) {
                t10 = t11;
                i11 = iAbs;
            }
        }
        return t10;
    }

    public Typeface a(Context context, androidx.core.content.res.a.c cVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, u.g.b[] bVarArr, int i10) {
        throw null;
    }

    protected Typeface c(Context context, InputStream inputStream) {
        File fileE = g0.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (g0.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File fileE = g0.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (g0.c(fileE, resources, i10)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    protected u.g.b g(u.g.b[] bVarArr, int i10) {
        return (u.g.b) e(bVarArr, i10, new a());
    }
}
