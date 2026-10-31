package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import androidx.core.app.n0;
import d5.LXP.wcAlQCOdREZdI;
import java.io.File;

/* JADX INFO: compiled from: ContextCompat.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f1817a = new Object();

    /* JADX INFO: renamed from: androidx.core.content.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ContextCompat.java */
    /* JADX INFO: loaded from: classes.dex */
    static class C0032a {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }

        static Drawable b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    /* JADX INFO: loaded from: classes.dex */
    static class b {
        static int a(Context context, int i10) {
            return context.getColor(i10);
        }

        static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    /* JADX INFO: loaded from: classes.dex */
    static class c {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static File b(Context context) {
            return context.getDataDir();
        }

        static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    /* JADX INFO: loaded from: classes.dex */
    static class d {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            return ((i10 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, a.f(context), handler);
        }

        static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    /* JADX INFO: loaded from: classes.dex */
    static class e {
        static Context a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        static String b(Context context) {
            return context.getAttributionTag();
        }

        static Display c(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Log.w("ContextCompat", "The context:" + context + " is not associated with any display. Return a fallback display instead.");
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    /* JADX INFO: loaded from: classes.dex */
    static class f {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10);
        }
    }

    public static Context b(Context context) {
        return c.a(context);
    }

    public static String c(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return e.b(context);
        }
        return null;
    }

    public static int d(Context context, int i10) {
        return b.a(context, i10);
    }

    public static Drawable e(Context context, int i10) {
        return C0032a.b(context, i10);
    }

    static String f(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (g.b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent g(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i10) {
        return h(context, broadcastReceiver, intentFilter, null, null, i10);
    }

    public static Intent h(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
        int i11 = i10 & 1;
        if (i11 != 0 && (i10 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i11 != 0) {
            i10 |= 2;
        }
        int i12 = i10;
        int i13 = i12 & 2;
        if (i13 == 0 && (i12 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i13 != 0 && (i12 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            return f.a(context, broadcastReceiver, intentFilter, str, handler, i12);
        }
        if (i14 >= 26) {
            return d.a(context, broadcastReceiver, intentFilter, str, handler, i12);
        }
        return ((i12 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, f(context), handler);
    }

    public static boolean i(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    public static void j(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void k(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            d.b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static int a(Context context, String str) {
        w.d.d(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals(wcAlQCOdREZdI.BhpBAPiTCoJtASb, str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return n0.b(context).a() ? 0 : -1;
    }
}
