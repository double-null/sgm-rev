package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: DrawableCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DrawableCompat.java */
    static class C0034a {
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f10, float f11) {
            drawable.setHotspot(f10, f11);
        }

        static void f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        static void g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* JADX INFO: compiled from: DrawableCompat.java */
    static class b {
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    public static boolean a(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    public static void b(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void c(Drawable drawable, boolean z10) {
        drawable.setAutoMirrored(z10);
    }

    public static void d(Drawable drawable, float f10, float f11) {
        C0034a.e(drawable, f10, f11);
    }

    public static void e(Drawable drawable, int i10, int i11, int i12, int i13) {
        C0034a.f(drawable, i10, i11, i12, i13);
    }

    public static boolean f(Drawable drawable, int i10) {
        return b.b(drawable, i10);
    }

    public static void g(Drawable drawable, int i10) {
        C0034a.g(drawable, i10);
    }

    public static void h(Drawable drawable, ColorStateList colorStateList) {
        C0034a.h(drawable, colorStateList);
    }

    public static void i(Drawable drawable, PorterDuff.Mode mode) {
        C0034a.i(drawable, mode);
    }

    public static Drawable j(Drawable drawable) {
        return drawable;
    }
}
