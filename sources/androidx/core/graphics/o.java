package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: compiled from: TypefaceCompatApi26Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class o extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final Class<?> f1867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Constructor<?> f1868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final Method f1869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final Method f1870j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final Method f1871k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final Method f1872l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final Method f1873m;

    public o() {
        Class<?> clsV;
        Constructor<?> constructorW;
        Method methodS;
        Method methodT;
        Method methodX;
        Method methodR;
        Method methodU;
        try {
            clsV = v();
            constructorW = w(clsV);
            methodS = s(clsV);
            methodT = t(clsV);
            methodX = x(clsV);
            methodR = r(clsV);
            methodU = u(clsV);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            clsV = null;
            constructorW = null;
            methodS = null;
            methodT = null;
            methodX = null;
            methodR = null;
            methodU = null;
        }
        this.f1867g = clsV;
        this.f1868h = constructorW;
        this.f1869i = methodS;
        this.f1870j = methodT;
        this.f1871k = methodX;
        this.f1872l = methodR;
        this.f1873m = methodU;
    }

    private Object l() {
        try {
            return this.f1868h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void m(Object obj) {
        try {
            this.f1872l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean n(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1869i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f1870j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p(Object obj) {
        try {
            return ((Boolean) this.f1871k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q() {
        if (this.f1869i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f1869i != null;
    }

    @Override // androidx.core.graphics.i, androidx.core.graphics.f0
    public Typeface a(Context context, androidx.core.content.res.a.c cVar, Resources resources, int i10) {
        if (!q()) {
            return super.a(context, cVar, resources, i10);
        }
        Object objL = l();
        if (objL == null) {
            return null;
        }
        for (androidx.core.content.res.a.d dVar : cVar.a()) {
            if (!n(context, objL, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                m(objL);
                return null;
            }
        }
        if (p(objL)) {
            return i(objL);
        }
        return null;
    }

    @Override // androidx.core.graphics.i, androidx.core.graphics.f0
    public Typeface b(Context context, CancellationSignal cancellationSignal, u.g.b[] bVarArr, int i10) {
        Typeface typefaceI;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!q()) {
            u.g.b bVarG = g(bVarArr, i10);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarG.d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarG.e()).setItalic(bVarG.f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapH = g0.h(context, bVarArr, cancellationSignal);
        Object objL = l();
        if (objL == null) {
            return null;
        }
        boolean z10 = false;
        for (u.g.b bVar : bVarArr) {
            ByteBuffer byteBuffer = mapH.get(bVar.d());
            if (byteBuffer != null) {
                if (!o(objL, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    m(objL);
                    return null;
                }
                z10 = true;
            }
        }
        if (!z10) {
            m(objL);
            return null;
        }
        if (p(objL) && (typefaceI = i(objL)) != null) {
            return Typeface.create(typefaceI, i10);
        }
        return null;
    }

    @Override // androidx.core.graphics.f0
    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        if (!q()) {
            return super.d(context, resources, i10, str, i11);
        }
        Object objL = l();
        if (objL == null) {
            return null;
        }
        if (!n(context, objL, str, 0, -1, -1, null)) {
            m(objL);
            return null;
        }
        if (p(objL)) {
            return i(objL);
        }
        return null;
    }

    protected Typeface i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f1867g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f1873m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method r(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method s(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method t(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method u(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> v() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> w(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    protected Method x(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }
}
