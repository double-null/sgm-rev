package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: TypefaceCompatApi21Impl.java */
/* JADX INFO: loaded from: classes.dex */
class i extends f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Class<?> f1858b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Constructor<?> f1859c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f1860d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f1861e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f1862f = false;

    i() {
    }

    private static boolean h(Object obj, String str, int i10, boolean z10) {
        k();
        try {
            return ((Boolean) f1860d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface i(Object obj) {
        k();
        try {
            Object objNewInstance = Array.newInstance(f1858b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f1861e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void k() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f1862f) {
            return;
        }
        f1862f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f1859c = constructor;
        f1858b = cls;
        f1860d = method2;
        f1861e = method;
    }

    private static Object l() {
        k();
        try {
            return f1859c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // androidx.core.graphics.f0
    public Typeface a(Context context, androidx.core.content.res.a.c cVar, Resources resources, int i10) {
        Object objL = l();
        for (androidx.core.content.res.a.d dVar : cVar.a()) {
            File fileE = g0.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!g0.c(fileE, resources, dVar.b())) {
                    return null;
                }
                if (!h(objL, fileE.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                fileE.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileE.delete();
            }
        }
        return i(objL);
    }

    @Override // androidx.core.graphics.f0
    public Typeface b(Context context, CancellationSignal cancellationSignal, u.g.b[] bVarArr, int i10) {
        if (bVarArr.length < 1) {
            return null;
        }
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
                File fileJ = j(parcelFileDescriptorOpenFileDescriptor);
                if (fileJ != null && fileJ.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileJ);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceC = super.c(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceC;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
