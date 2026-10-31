package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: TypefaceCompatApi24Impl.java */
/* JADX INFO: loaded from: classes.dex */
class j extends f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f1863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Constructor<?> f1864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f1865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Method f1866e;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f1864c = constructor;
        f1863b = cls;
        f1865d = method2;
        f1866e = method;
    }

    j() {
    }

    private static boolean h(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f1865d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(f1863b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f1866e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean j() {
        Method method = f1865d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object k() {
        try {
            return f1864c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.f0
    public Typeface a(Context context, androidx.core.content.res.a.c cVar, Resources resources, int i10) {
        Object objK = k();
        if (objK == null) {
            return null;
        }
        for (androidx.core.content.res.a.d dVar : cVar.a()) {
            ByteBuffer byteBufferB = g0.b(context, resources, dVar.b());
            if (byteBufferB == null || !h(objK, byteBufferB, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return i(objK);
    }

    @Override // androidx.core.graphics.f0
    public Typeface b(Context context, CancellationSignal cancellationSignal, u.g.b[] bVarArr, int i10) {
        Object objK = k();
        if (objK == null) {
            return null;
        }
        androidx.collection.h hVar = new androidx.collection.h();
        for (u.g.b bVar : bVarArr) {
            Uri uriD = bVar.d();
            ByteBuffer byteBufferF = (ByteBuffer) hVar.get(uriD);
            if (byteBufferF == null) {
                byteBufferF = g0.f(context, cancellationSignal, uriD);
                hVar.put(uriD, byteBufferF);
            }
            if (byteBufferF == null || !h(objK, byteBufferF, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface typefaceI = i(objK);
        if (typefaceI == null) {
            return null;
        }
        return Typeface.create(typefaceI, i10);
    }
}
