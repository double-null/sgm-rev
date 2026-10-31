package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: CustomTabsClient.java */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c.b f1518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ComponentName f1519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f1520c;

    /* JADX INFO: compiled from: CustomTabsClient.java */
    class b extends c.a.AbstractBinderC0089a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f1522a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.browser.customtabs.b f1523b;

        /* JADX INFO: compiled from: CustomTabsClient.java */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f1525a;

            a(Bundle bundle) {
                this.f1525a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1523b.onUnminimized(this.f1525a);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CustomTabsClient.java */
        class RunnableC0021b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1527a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f1528b;

            RunnableC0021b(int i10, Bundle bundle) {
                this.f1527a = i10;
                this.f1528b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1523b.onNavigationEvent(this.f1527a, this.f1528b);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$b$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CustomTabsClient.java */
        class RunnableC0022c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1530a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f1531b;

            RunnableC0022c(String str, Bundle bundle) {
                this.f1530a = str;
                this.f1531b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1523b.extraCallback(this.f1530a, this.f1531b);
            }
        }

        /* JADX INFO: compiled from: CustomTabsClient.java */
        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f1533a;

            d(Bundle bundle) {
                this.f1533a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1523b.onMessageChannelReady(this.f1533a);
            }
        }

        /* JADX INFO: compiled from: CustomTabsClient.java */
        class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1535a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f1536b;

            e(String str, Bundle bundle) {
                this.f1535a = str;
                this.f1536b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1523b.onPostMessage(this.f1535a, this.f1536b);
            }
        }

        /* JADX INFO: compiled from: CustomTabsClient.java */
        class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1538a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Uri f1539b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f1540c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f1541d;

            f(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f1538a = i10;
                this.f1539b = uri;
                this.f1540c = z10;
                this.f1541d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1523b.onRelationshipValidationResult(this.f1538a, this.f1539b, this.f1540c, this.f1541d);
            }
        }

        /* JADX INFO: compiled from: CustomTabsClient.java */
        class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1543a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f1544b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f1545c;

            g(int i10, int i11, Bundle bundle) {
                this.f1543a = i10;
                this.f1544b = i11;
                this.f1545c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1523b.onActivityResized(this.f1543a, this.f1544b, this.f1545c);
            }
        }

        /* JADX INFO: compiled from: CustomTabsClient.java */
        class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f1547a;

            h(Bundle bundle) {
                this.f1547a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1523b.onWarmupCompleted(this.f1547a);
            }
        }

        /* JADX INFO: compiled from: CustomTabsClient.java */
        class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1549a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f1550b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1551c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f1552d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f1553e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Bundle f1554f;

            i(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
                this.f1549a = i10;
                this.f1550b = i11;
                this.f1551c = i12;
                this.f1552d = i13;
                this.f1553e = i14;
                this.f1554f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1523b.onActivityLayout(this.f1549a, this.f1550b, this.f1551c, this.f1552d, this.f1553e, this.f1554f);
            }
        }

        /* JADX INFO: compiled from: CustomTabsClient.java */
        class j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f1556a;

            j(Bundle bundle) {
                this.f1556a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1523b.onMinimized(this.f1556a);
            }
        }

        b(androidx.browser.customtabs.b bVar) {
            this.f1523b = bVar;
        }

        @Override // c.a
        public void C(Bundle bundle) throws RemoteException {
            if (this.f1523b == null) {
                return;
            }
            this.f1522a.post(new a(bundle));
        }

        @Override // c.a
        public void E(int i10, int i11, Bundle bundle) throws RemoteException {
            if (this.f1523b == null) {
                return;
            }
            this.f1522a.post(new g(i10, i11, bundle));
        }

        @Override // c.a
        public void F(int i10, Bundle bundle) {
            if (this.f1523b == null) {
                return;
            }
            this.f1522a.post(new RunnableC0021b(i10, bundle));
        }

        @Override // c.a
        public void G(String str, Bundle bundle) throws RemoteException {
            if (this.f1523b == null) {
                return;
            }
            this.f1522a.post(new e(str, bundle));
        }

        @Override // c.a
        public void H(Bundle bundle) throws RemoteException {
            if (this.f1523b == null) {
                return;
            }
            this.f1522a.post(new d(bundle));
        }

        @Override // c.a
        public void I(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException {
            if (this.f1523b == null) {
                return;
            }
            this.f1522a.post(new f(i10, uri, z10, bundle));
        }

        @Override // c.a
        public void d(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws RemoteException {
            if (this.f1523b == null) {
                return;
            }
            this.f1522a.post(new i(i10, i11, i12, i13, i14, bundle));
        }

        @Override // c.a
        public Bundle g(String str, Bundle bundle) throws RemoteException {
            androidx.browser.customtabs.b bVar = this.f1523b;
            if (bVar == null) {
                return null;
            }
            return bVar.extraCallbackWithResult(str, bundle);
        }

        @Override // c.a
        public void h(String str, Bundle bundle) throws RemoteException {
            if (this.f1523b == null) {
                return;
            }
            this.f1522a.post(new RunnableC0022c(str, bundle));
        }

        @Override // c.a
        public void i(Bundle bundle) throws RemoteException {
            if (this.f1523b == null) {
                return;
            }
            this.f1522a.post(new h(bundle));
        }

        @Override // c.a
        public void v(Bundle bundle) throws RemoteException {
            if (this.f1523b == null) {
                return;
            }
            this.f1522a.post(new j(bundle));
        }
    }

    c(c.b bVar, ComponentName componentName, Context context) {
        this.f1518a = bVar;
        this.f1519b = componentName;
        this.f1520c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    public static boolean b(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return a(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    private c.a.AbstractBinderC0089a c(androidx.browser.customtabs.b bVar) {
        return new b(bVar);
    }

    public static String d(Context context, List<String> list) {
        return e(context, list, false);
    }

    public static String e(Context context, List<String> list, boolean z10) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    private f g(androidx.browser.customtabs.b bVar, PendingIntent pendingIntent) {
        boolean zF;
        c.a.AbstractBinderC0089a abstractBinderC0089aC = c(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zF = this.f1518a.c(abstractBinderC0089aC, bundle);
            } else {
                zF = this.f1518a.f(abstractBinderC0089aC);
            }
            if (zF) {
                return new f(this.f1518a, abstractBinderC0089aC, this.f1519b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f f(androidx.browser.customtabs.b bVar) {
        return g(bVar, null);
    }

    public boolean h(long j10) {
        try {
            return this.f1518a.q(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* JADX INFO: compiled from: CustomTabsClient.java */
    class a extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f1521b;

        a(Context context) {
            this.f1521b = context;
        }

        @Override // androidx.browser.customtabs.e
        public final void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
            cVar.h(0L);
            this.f1521b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
