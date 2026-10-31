package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f7800a = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f7801b = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f7802c = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f7803d = new HashMap(2);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f7807d;

        public a(int i10, int i11, int i12, int i13) {
            this.f7804a = i10;
            this.f7805b = i11;
            this.f7806c = i12;
            this.f7807d = i13;
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public int b() {
            return this.f7804a;
        }

        public int c() {
            return this.f7806c;
        }

        public int d() {
            return this.f7805b;
        }

        public Map e() {
            HashMap map = new HashMap();
            map.put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, Integer.valueOf(this.f7804a));
            map.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, Integer.valueOf(this.f7805b));
            map.put("right", Integer.valueOf(this.f7806c));
            map.put("bottom", Integer.valueOf(this.f7807d));
            return map;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a(this) && b() == aVar.b() && d() == aVar.d() && c() == aVar.c() && a() == aVar.a();
        }

        public int hashCode() {
            return ((((((b() + 59) * 59) + d()) * 59) + c()) * 59) + a();
        }

        public String toString() {
            return "CompatibilityUtils.Insets(left=" + b() + ", top=" + d() + ", right=" + c() + ", bottom=" + a() + ")";
        }

        public int a() {
            return this.f7807d;
        }

        public static a a(Insets insets) {
            return new a(insets.left, insets.top, insets.right, insets.bottom);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f7811d;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f7812a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f7813b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f7814c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f7815d;

            a() {
            }

            public a a(int i10) {
                this.f7814c = i10;
                return this;
            }

            public a b(int i10) {
                this.f7815d = i10;
                return this;
            }

            public a c(int i10) {
                this.f7812a = i10;
                return this;
            }

            public a d(int i10) {
                this.f7813b = i10;
                return this;
            }

            public String toString() {
                return "CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=" + this.f7812a + ", topRight=" + this.f7813b + ", bottomLeft=" + this.f7814c + ", bottomRight=" + this.f7815d + ")";
            }

            public b a() {
                return new b(this.f7812a, this.f7813b, this.f7814c, this.f7815d);
            }
        }

        b(int i10, int i11, int i12, int i13) {
            this.f7808a = i10;
            this.f7809b = i11;
            this.f7810c = i12;
            this.f7811d = i13;
        }

        protected boolean a(Object obj) {
            return obj instanceof b;
        }

        public int b() {
            return this.f7811d;
        }

        public int c() {
            return this.f7808a;
        }

        public int d() {
            return this.f7809b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a(this) && c() == bVar.c() && d() == bVar.d() && a() == bVar.a() && b() == bVar.b();
        }

        public int hashCode() {
            return ((((((c() + 59) * 59) + d()) * 59) + a()) * 59) + b();
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + c() + ", topRight=" + d() + ", bottomLeft=" + a() + ", bottomRight=" + b() + ")";
        }

        public int a() {
            return this.f7810c;
        }
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    public static Point b(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
        boolean z10 = lVar == null || ((Boolean) lVar.a(z4.I6)).booleanValue();
        if (!c(context) || z10) {
            Map map = f7803d;
            if (map.containsKey(Integer.valueOf(orientation))) {
                return (Point) map.get(Integer.valueOf(orientation));
            }
        }
        Point point = new Point();
        point.x = 480;
        point.y = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        WindowManager windowManagerF = q7.f(context);
        if (windowManagerF != null) {
            Display defaultDisplay = windowManagerF.getDefaultDisplay();
            if (b()) {
                Rect bounds = windowManagerF.getMaximumWindowMetrics().getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else {
                defaultDisplay.getRealSize(point);
            }
        }
        f7803d.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.type.foldable") || packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    public static boolean d() {
        return true;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static a c(WindowInsets windowInsets, com.applovin.impl.sdk.l lVar) {
        if (lVar == null || !((Boolean) lVar.a(z4.J4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.statusBars()));
    }

    public static Point a(Context context) {
        Display defaultDisplay = q7.f(context).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static Map c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f7801b.get(str);
    }

    public static a a(WindowInsets windowInsets, com.applovin.impl.sdk.l lVar) {
        if (lVar == null || !((Boolean) lVar.a(z4.J4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.displayCutout());
        return new a(insetsIgnoringVisibility.left, insetsIgnoringVisibility.top, insetsIgnoringVisibility.right, insetsIgnoringVisibility.bottom);
    }

    public static void c(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f7801b.put(str, aVar.e());
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static Map a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f7800a.get(str);
    }

    public static void a(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f7800a.put(str, aVar.e());
    }

    public static a b(WindowInsets windowInsets, com.applovin.impl.sdk.l lVar) {
        if (lVar == null || !((Boolean) lVar.a(z4.J4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars()));
    }

    public static b a(Context context, com.applovin.impl.sdk.l lVar) {
        WindowManager windowManagerF;
        if (!((Boolean) lVar.a(z4.f9219e4)).booleanValue() || !i() || (windowManagerF = q7.f(context)) == null) {
            return null;
        }
        try {
            Display defaultDisplay = windowManagerF.getDefaultDisplay();
            return new b.a().c(a(0, defaultDisplay)).d(a(1, defaultDisplay)).a(a(3, defaultDisplay)).b(a(2, defaultDisplay)).a();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Map b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f7802c.get(str);
    }

    public static void b(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f7802c.put(str, aVar.e());
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private static int a(int i10, Display display) {
        RoundedCorner roundedCorner = display.getRoundedCorner(i10);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return -1;
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
