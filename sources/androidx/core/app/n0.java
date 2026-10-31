package androidx.core.app;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: NotificationManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f1803c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Set<String> f1804d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f1805e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotificationManager f1807b;

    /* JADX INFO: compiled from: NotificationManagerCompat.java */
    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    private n0(Context context) {
        this.f1806a = context;
        this.f1807b = (NotificationManager) context.getSystemService("notification");
    }

    public static n0 b(Context context) {
        return new n0(context);
    }

    public boolean a() {
        return a.a(this.f1807b);
    }
}
