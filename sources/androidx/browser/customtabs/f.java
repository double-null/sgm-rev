package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: CustomTabsSession.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f1571a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c.b f1572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f1573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ComponentName f1574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PendingIntent f1575e;

    f(c.b bVar, c.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f1572b = bVar;
        this.f1573c = aVar;
        this.f1574d = componentName;
        this.f1575e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f1575e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    private Bundle c(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f1575e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    IBinder d() {
        return this.f1573c.asBinder();
    }

    ComponentName e() {
        return this.f1574d;
    }

    PendingIntent f() {
        return this.f1575e;
    }

    public boolean g(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f1572b.j(this.f1573c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int h(String str, Bundle bundle) {
        int iK;
        Bundle bundleB = b(bundle);
        synchronized (this.f1571a) {
            try {
                try {
                    iK = this.f1572b.k(this.f1573c, str, bundleB);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iK;
    }

    public boolean i(Uri uri) {
        return j(uri, null, new Bundle());
    }

    public boolean j(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundleC = c(uri2);
            if (bundleC == null) {
                return this.f1572b.u(this.f1573c, uri);
            }
            bundle.putAll(bundleC);
            return this.f1572b.J(this.f1573c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean k(int i10, Uri uri, Bundle bundle) {
        if (i10 >= 1 && i10 <= 2) {
            try {
                return this.f1572b.o(this.f1573c, i10, uri, b(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
