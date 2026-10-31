package androidx.core.content.res;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.graphics.h;
import com.android.billingclient.gp.VRfCTjjLv;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ResourcesCompat.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1833a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Object, SparseArray<Object>> f1834b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f1835c = new Object();

    /* JADX INFO: compiled from: ResourcesCompat.java */
    /* JADX INFO: loaded from: classes.dex */
    public static abstract class a {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i10, Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1831a.f(i10);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1829a.g(typeface);
                }
            });
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void f(int i10);

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void g(Typeface typeface);
    }

    public static Typeface a(Context context, int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface b(Context context, int i10, TypedValue typedValue, int i11, a aVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i10, typedValue, i11, aVar, null, true, false);
    }

    private static Typeface c(Context context, int i10, TypedValue typedValue, int i11, a aVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface typefaceD = d(context, resources, typedValue, i10, i11, aVar, handler, z10, z11);
        if (typefaceD != null || aVar != null || z11) {
            return typefaceD;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    private static Typeface d(Context context, Resources resources, TypedValue typedValue, int i10, int i11, a aVar, Handler handler, boolean z10, boolean z11) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (aVar != null) {
                aVar.c(-3, handler);
            }
            return null;
        }
        Typeface typefaceF = h.f(resources, i10, string, typedValue.assetCookie, i11);
        if (typefaceF != null) {
            if (aVar != null) {
                aVar.d(typefaceF, handler);
            }
            return typefaceF;
        }
        if (z11) {
            return null;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                Typeface typefaceD = h.d(context, resources, i10, string, typedValue.assetCookie, i11);
                if (aVar != null) {
                    if (typefaceD != null) {
                        aVar.d(typefaceD, handler);
                    } else {
                        aVar.c(-3, handler);
                    }
                }
                return typefaceD;
            }
            androidx.core.content.res.a.b bVarB = androidx.core.content.res.a.b(resources.getXml(i10), resources);
            if (bVarB != null) {
                return h.c(context, bVarB, resources, i10, string, typedValue.assetCookie, i11, aVar, handler, z10);
            }
            Log.e("ResourcesCompat", "Failed to find font-family tag");
            if (aVar != null) {
                aVar.c(-3, handler);
            }
            return null;
        } catch (IOException e10) {
            Log.e("ResourcesCompat", "Failed to read xml resource " + string, e10);
            if (aVar != null) {
                aVar.c(-3, handler);
            }
            return null;
        } catch (XmlPullParserException e11) {
            Log.e("ResourcesCompat", VRfCTjjLv.WOsL + string, e11);
            if (aVar != null) {
                aVar.c(-3, handler);
            }
            return null;
        }
    }
}
