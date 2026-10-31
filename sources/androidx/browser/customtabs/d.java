package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.app.ActivityOptionsCompat;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import g7.EinF.ZHgPsTG;
import java.util.ArrayList;

/* JADX INFO: compiled from: CustomTabsIntent.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f1558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f1559b;

    /* JADX INFO: compiled from: CustomTabsIntent.java */
    private static class a {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* JADX INFO: compiled from: CustomTabsIntent.java */
    private static class b {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: CustomTabsIntent.java */
    private static class c {
        static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setShareIdentityEnabled(z10);
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CustomTabsIntent.java */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class C0023d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList<Bundle> f1562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ActivityOptions f1563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ArrayList<Bundle> f1564e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SparseArray<Bundle> f1565f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f1566g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f1569j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Intent f1560a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.browser.customtabs.a.C0020a f1561b = new androidx.browser.customtabs.a.C0020a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f1567h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f1568i = true;

        public C0023d() {
        }

        private void d() {
            String strA = b.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.f1560a.hasExtra("com.android.browser.headers") ? this.f1560a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.f1560a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void k(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f1560a.putExtras(bundle);
        }

        private void l() {
            if (this.f1563d == null) {
                this.f1563d = a.a();
            }
            c.a(this.f1563d, this.f1569j);
        }

        public d a() {
            if (!this.f1560a.hasExtra("android.support.customtabs.extra.SESSION")) {
                k(null, null);
            }
            ArrayList<Bundle> arrayList = this.f1562c;
            if (arrayList != null) {
                this.f1560a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f1564e;
            if (arrayList2 != null) {
                this.f1560a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1560a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1568i);
            this.f1560a.putExtras(this.f1561b.a().a());
            Bundle bundle = this.f1566g;
            if (bundle != null) {
                this.f1560a.putExtras(bundle);
            }
            if (this.f1565f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f1565f);
                this.f1560a.putExtras(bundle2);
            }
            this.f1560a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f1567h);
            int i10 = Build.VERSION.SDK_INT;
            d();
            if (i10 >= 34) {
                l();
            }
            ActivityOptions activityOptions = this.f1563d;
            return new d(this.f1560a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public C0023d b(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.f1560a.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i10);
            return this;
        }

        public C0023d e(androidx.browser.customtabs.a aVar) {
            this.f1566g = aVar.a();
            return this;
        }

        public C0023d f(Context context, int i10, int i11) {
            this.f1560a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptionsCompat.b(context, i10, i11).c());
            return this;
        }

        public C0023d g(int i10) {
            return h(i10, 0);
        }

        public C0023d i(boolean z10) {
            this.f1568i = z10;
            return this;
        }

        public C0023d j(f fVar) {
            this.f1560a.setPackage(fVar.e().getPackageName());
            k(fVar.d(), fVar.f());
            return this;
        }

        public C0023d m(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f1567h = i10;
            if (i10 == 1) {
                this.f1560a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (i10 == 2) {
                this.f1560a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                this.f1560a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
            return this;
        }

        public C0023d n(boolean z10) {
            this.f1560a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z10 ? 1 : 0);
            return this;
        }

        public C0023d o(Context context, int i10, int i11) {
            this.f1563d = ActivityOptions.makeCustomAnimation(context, i10, i11);
            return this;
        }

        @Deprecated
        public C0023d p(int i10) {
            this.f1561b.b(i10);
            return this;
        }

        public C0023d q(boolean z10) {
            this.f1560a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z10);
            return this;
        }

        public C0023d c(int i10, androidx.browser.customtabs.a aVar) {
            if (i10 < 0 || i10 > 2 || i10 == 0) {
                throw new IllegalArgumentException(RHIpdOnfgiYkEj.eQdEfGXFFCPNt + i10);
            }
            if (this.f1565f == null) {
                this.f1565f = new SparseArray<>();
            }
            this.f1565f.put(i10, aVar.a());
            return this;
        }

        public C0023d h(int i10, int i11) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i11 < 0 || i11 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.f1560a.putExtra(ZHgPsTG.UCkUK, i10);
            this.f1560a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i11);
            return this;
        }

        public C0023d(f fVar) {
            if (fVar != null) {
                j(fVar);
            }
        }
    }

    d(Intent intent, Bundle bundle) {
        this.f1558a = intent;
        this.f1559b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f1558a.setData(uri);
        androidx.core.content.a.j(context, this.f1558a, this.f1559b);
    }
}
