package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: NotificationCompatBuilder.java */
/* JADX INFO: loaded from: classes.dex */
class z implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Notification.Builder f1809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k.e f1810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RemoteViews f1811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RemoteViews f1812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<Bundle> f1813f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f1814g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RemoteViews f1816i;

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    z(k.e eVar) {
        int i10;
        this.f1810c = eVar;
        Context context = eVar.f1759a;
        this.f1808a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1809b = e.a(context, eVar.K);
        } else {
            this.f1809b = new Notification.Builder(eVar.f1759a);
        }
        Notification notification = eVar.R;
        this.f1809b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f1767i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f1763e).setContentText(eVar.f1764f).setContentInfo(eVar.f1769k).setContentIntent(eVar.f1765g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f1766h, (notification.flags & 128) != 0).setNumber(eVar.f1770l).setProgress(eVar.f1778t, eVar.f1779u, eVar.f1780v);
        Notification.Builder builder = this.f1809b;
        IconCompat iconCompat = eVar.f1768j;
        c.b(builder, iconCompat == null ? null : iconCompat.t(context));
        this.f1809b.setSubText(eVar.f1775q).setUsesChronometer(eVar.f1773o).setPriority(eVar.f1771m);
        k.g gVar = eVar.f1774p;
        if (gVar instanceof k.f) {
            Iterator<k.a> it = ((k.f) gVar).h().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        } else {
            Iterator<k.a> it2 = eVar.f1760b.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
        }
        Bundle bundle = eVar.D;
        if (bundle != null) {
            this.f1814g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f1811d = eVar.H;
        this.f1812e = eVar.I;
        this.f1809b.setShowWhen(eVar.f1772n);
        a.i(this.f1809b, eVar.f1784z);
        a.g(this.f1809b, eVar.f1781w);
        a.j(this.f1809b, eVar.f1783y);
        a.h(this.f1809b, eVar.f1782x);
        this.f1815h = eVar.O;
        b.b(this.f1809b, eVar.C);
        b.c(this.f1809b, eVar.E);
        b.f(this.f1809b, eVar.F);
        b.d(this.f1809b, eVar.G);
        b.e(this.f1809b, notification.sound, notification.audioAttributes);
        List listE = i11 < 28 ? e(g(eVar.f1761c), eVar.U) : eVar.U;
        if (listE != null && !listE.isEmpty()) {
            Iterator it3 = listE.iterator();
            while (it3.hasNext()) {
                b.a(this.f1809b, (String) it3.next());
            }
        }
        this.f1816i = eVar.J;
        if (eVar.f1762d.size() > 0) {
            Bundle bundle2 = eVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < eVar.f1762d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), m0.a(eVar.f1762d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f1814g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        Object obj = eVar.T;
        if (obj != null) {
            c.c(this.f1809b, obj);
        }
        this.f1809b.setExtras(eVar.D);
        d.e(this.f1809b, eVar.f1777s);
        RemoteViews remoteViews = eVar.H;
        if (remoteViews != null) {
            d.c(this.f1809b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.I;
        if (remoteViews2 != null) {
            d.b(this.f1809b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.J;
        if (remoteViews3 != null) {
            d.d(this.f1809b, remoteViews3);
        }
        if (i13 >= 26) {
            e.b(this.f1809b, eVar.L);
            e.e(this.f1809b, eVar.f1776r);
            e.f(this.f1809b, eVar.M);
            e.g(this.f1809b, eVar.N);
            e.d(this.f1809b, eVar.O);
            if (eVar.B) {
                e.c(this.f1809b, eVar.A);
            }
            if (!TextUtils.isEmpty(eVar.K)) {
                this.f1809b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator<c1> it4 = eVar.f1761c.iterator();
            while (it4.hasNext()) {
                f.a(this.f1809b, it4.next().h());
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            g.a(this.f1809b, eVar.Q);
            g.b(this.f1809b, k.d.a(null));
        }
        if (i14 >= 31 && (i10 = eVar.P) != 0) {
            h.b(this.f1809b, i10);
        }
        if (eVar.S) {
            if (this.f1810c.f1782x) {
                this.f1815h = 2;
            } else {
                this.f1815h = 1;
            }
            this.f1809b.setVibrate(null);
            this.f1809b.setSound(null);
            int i15 = notification.defaults & (-2) & (-3);
            notification.defaults = i15;
            this.f1809b.setDefaults(i15);
            if (i14 >= 26) {
                if (TextUtils.isEmpty(this.f1810c.f1781w)) {
                    a.g(this.f1809b, "silent");
                }
                e.d(this.f1809b, this.f1815h);
            }
        }
    }

    private void b(k.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = c.a(iconCompatD != null ? iconCompatD.s() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : d1.b(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i10 = Build.VERSION.SDK_INT;
        d.a(builderA, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i10 >= 28) {
            f.b(builderA, aVar.f());
        }
        if (i10 >= 29) {
            g.c(builderA, aVar.j());
        }
        if (i10 >= 31) {
            h.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.f1809b, a.d(builderA));
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.b bVar = new androidx.collection.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> g(List<c1> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<c1> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    @Override // androidx.core.app.j
    public Notification.Builder a() {
        return this.f1809b;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        k.g gVar = this.f1810c.f1774p;
        if (gVar != null) {
            gVar.b(this);
        }
        RemoteViews remoteViewsE = gVar != null ? gVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.f1810c.H;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (gVar != null && (remoteViewsD = gVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (gVar != null && (remoteViewsF = this.f1810c.f1774p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (gVar != null && (bundleA = k.a(notificationD)) != null) {
            gVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f1809b.build();
        }
        Notification notificationBuild = this.f1809b.build();
        if (this.f1815h != 0) {
            if (a.f(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.f1815h == 2) {
                h(notificationBuild);
            }
            if (a.f(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.f1815h == 1) {
                h(notificationBuild);
            }
        }
        return notificationBuild;
    }

    Context f() {
        return this.f1808a;
    }
}
