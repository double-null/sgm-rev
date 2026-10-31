package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: ResourcesFlusher.java */
/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Field f703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class<?> f705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Field f707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Field f709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f710h;

    static void a(Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        b(resources);
    }

    private static void b(Resources resources) {
        Object obj;
        if (!f710h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f709g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f710h = true;
        }
        Field field = f709g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f704b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f703a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f704b = true;
        }
        Field field2 = f703a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            c(obj2);
        }
    }

    private static void c(Object obj) {
        LongSparseArray longSparseArray;
        if (!f706d) {
            try {
                f705c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f706d = true;
        }
        Class<?> cls = f705c;
        if (cls == null) {
            return;
        }
        if (!f708f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f707e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f708f = true;
        }
        Field field = f707e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
