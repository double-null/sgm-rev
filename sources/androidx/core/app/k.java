package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.google.firebase.crashlytics.internal.RPrM.UICvx;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f1731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IconCompat f1732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d1[] f1733c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d1[] f1734d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1735e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f1736f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f1737g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f1738h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f1739i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f1740j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f1741k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f1742l;

        /* JADX INFO: renamed from: androidx.core.app.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NotificationCompat.java */
        public static final class C0030a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final IconCompat f1743a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final CharSequence f1744b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final PendingIntent f1745c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f1746d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Bundle f1747e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private ArrayList<d1> f1748f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f1749g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f1750h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f1751i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f1752j;

            public C0030a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void b() {
                if (this.f1751i && this.f1745c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public a a() {
                b();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<d1> arrayList3 = this.f1748f;
                if (arrayList3 != null) {
                    for (d1 d1Var : arrayList3) {
                        if (d1Var.j()) {
                            arrayList.add(d1Var);
                        } else {
                            arrayList2.add(d1Var);
                        }
                    }
                }
                d1[] d1VarArr = arrayList.isEmpty() ? null : (d1[]) arrayList.toArray(new d1[arrayList.size()]);
                return new a(this.f1743a, this.f1744b, this.f1745c, this.f1747e, arrayList2.isEmpty() ? null : (d1[]) arrayList2.toArray(new d1[arrayList2.size()]), d1VarArr, this.f1746d, this.f1749g, this.f1750h, this.f1751i, this.f1752j);
            }

            private C0030a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, d1[] d1VarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f1746d = true;
                this.f1750h = true;
                this.f1743a = iconCompat;
                this.f1744b = e.d(charSequence);
                this.f1745c = pendingIntent;
                this.f1747e = bundle;
                this.f1748f = d1VarArr == null ? null : new ArrayList<>(Arrays.asList(d1VarArr));
                this.f1746d = z10;
                this.f1749g = i10;
                this.f1750h = z11;
                this.f1751i = z12;
                this.f1752j = z13;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.i(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f1741k;
        }

        public boolean b() {
            return this.f1735e;
        }

        public Bundle c() {
            return this.f1731a;
        }

        public IconCompat d() {
            int i10;
            if (this.f1732b == null && (i10 = this.f1739i) != 0) {
                this.f1732b = IconCompat.i(null, "", i10);
            }
            return this.f1732b;
        }

        public d1[] e() {
            return this.f1733c;
        }

        public int f() {
            return this.f1737g;
        }

        public boolean g() {
            return this.f1736f;
        }

        public CharSequence h() {
            return this.f1740j;
        }

        public boolean i() {
            return this.f1742l;
        }

        public boolean j() {
            return this.f1738h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, d1[] d1VarArr, d1[] d1VarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f1736f = true;
            this.f1732b = iconCompat;
            if (iconCompat != null && iconCompat.m() == 2) {
                this.f1739i = iconCompat.k();
            }
            this.f1740j = e.d(charSequence);
            this.f1741k = pendingIntent;
            this.f1731a = bundle == null ? new Bundle() : bundle;
            this.f1733c = d1VarArr;
            this.f1734d = d1VarArr2;
            this.f1735e = z10;
            this.f1737g = i10;
            this.f1736f = z11;
            this.f1738h = z12;
            this.f1742l = z13;
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class b extends g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IconCompat f1753e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IconCompat f1754f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f1755g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f1756h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f1757i;

        /* JADX INFO: compiled from: NotificationCompat.java */
        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.k$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NotificationCompat.java */
        private static class C0031b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // androidx.core.app.k.g
        public void b(j jVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(jVar.a()).setBigContentTitle(this.f1796b);
            IconCompat iconCompat = this.f1753e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0031b.a(bigContentTitle, this.f1753e.t(jVar instanceof z ? ((z) jVar).f() : null));
                } else if (iconCompat.m() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f1753e.j());
                }
            }
            if (this.f1755g) {
                if (this.f1754f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f1754f.t(jVar instanceof z ? ((z) jVar).f() : null));
                }
            }
            if (this.f1798d) {
                bigContentTitle.setSummaryText(this.f1797c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0031b.c(bigContentTitle, this.f1757i);
                C0031b.b(bigContentTitle, this.f1756h);
            }
        }

        @Override // androidx.core.app.k.g
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f1754f = bitmap == null ? null : IconCompat.e(bitmap);
            this.f1755g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f1753e = bitmap == null ? null : IconCompat.e(bitmap);
            return this;
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class c extends g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f1758e;

        @Override // androidx.core.app.k.g
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.k.g
        public void b(j jVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(jVar.a()).setBigContentTitle(this.f1796b).bigText(this.f1758e);
            if (this.f1798d) {
                bigTextStyleBigText.setSummaryText(this.f1797c);
            }
        }

        @Override // androidx.core.app.k.g
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f1758e = e.d(charSequence);
            return this;
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    /* JADX INFO: loaded from: classes2.dex */
    public static class f extends g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f1785e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c1 f1786f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private PendingIntent f1787g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private PendingIntent f1788h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private PendingIntent f1789i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f1790j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Integer f1791k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Integer f1792l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private IconCompat f1793m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private CharSequence f1794n;

        /* JADX INFO: compiled from: NotificationCompat.java */
        /* JADX INFO: loaded from: classes.dex */
        static class a {
            static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        /* JADX INFO: loaded from: classes.dex */
        static class d {
            static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle d(Notification.CallStyle callStyle, int i10) {
                return callStyle.setAnswerButtonColorHint(i10);
            }

            static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z10) {
                return builder.setAuthenticationRequired(z10);
            }

            static Notification.CallStyle f(Notification.CallStyle callStyle, int i10) {
                return callStyle.setDeclineButtonColorHint(i10);
            }

            static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z10) {
                return callStyle.setIsVideo(z10);
            }

            static Notification.CallStyle h(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle i(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        private String i() {
            int i10 = this.f1785e;
            if (i10 == 1) {
                return this.f1795a.f1759a.getResources().getString(r.f.f24834e);
            }
            if (i10 == 2) {
                return this.f1795a.f1759a.getResources().getString(r.f.f24835f);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f1795a.f1759a.getResources().getString(r.f.f24836g);
        }

        private boolean j(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        private a k(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(androidx.core.content.a.d(this.f1795a.f1759a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f1795a.f1759a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a aVarA = new a.C0030a(IconCompat.h(this.f1795a.f1759a, i10), spannableStringBuilder, pendingIntent).a();
            aVarA.c().putBoolean("key_action_priority", true);
            return aVarA;
        }

        private a l() {
            int i10 = r.d.f24802b;
            int i11 = r.d.f24801a;
            PendingIntent pendingIntent = this.f1787g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f1790j;
            return k(z10 ? i10 : i11, z10 ? r.f.f24831b : r.f.f24830a, this.f1791k, r.b.f24797a, pendingIntent);
        }

        private a m() {
            int i10 = r.d.f24803c;
            PendingIntent pendingIntent = this.f1788h;
            return pendingIntent == null ? k(i10, r.f.f24833d, this.f1792l, r.b.f24798b, this.f1789i) : k(i10, r.f.f24832c, this.f1792l, r.b.f24798b, pendingIntent);
        }

        @Override // androidx.core.app.k.g
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.f1785e);
            bundle.putBoolean("android.callIsVideo", this.f1790j);
            c1 c1Var = this.f1786f;
            if (c1Var != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", c.b(c1Var.h()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", c1Var.i());
                }
            }
            IconCompat iconCompat = this.f1793m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", b.a(iconCompat.t(this.f1795a.f1759a)));
            }
            bundle.putCharSequence("android.verificationText", this.f1794n);
            bundle.putParcelable("android.answerIntent", this.f1787g);
            bundle.putParcelable("android.declineIntent", this.f1788h);
            bundle.putParcelable("android.hangUpIntent", this.f1789i);
            Integer num = this.f1791k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f1792l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // androidx.core.app.k.g
        protected String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public ArrayList<a> h() {
            a aVarM = m();
            a aVarL = l();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(aVarM);
            ArrayList<a> arrayList2 = this.f1795a.f1760b;
            int i10 = 2;
            if (arrayList2 != null) {
                for (a aVar : arrayList2) {
                    if (aVar.j()) {
                        arrayList.add(aVar);
                    } else if (!j(aVar) && i10 > 1) {
                        arrayList.add(aVar);
                        i10--;
                    }
                    if (aVarL != null && i10 == 1) {
                        arrayList.add(aVarL);
                        i10--;
                    }
                }
            }
            if (aVarL != null && i10 >= 1) {
                arrayList.add(aVarL);
            }
            return arrayList;
        }

        @Override // androidx.core.app.k.g
        public void b(j jVar) {
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequenceI = null;
            callStyleA = null;
            Notification.CallStyle callStyleA = null;
            charSequenceI = null;
            if (i10 < 31) {
                Notification.Builder builderA = jVar.a();
                c1 c1Var = this.f1786f;
                builderA.setContentTitle(c1Var != null ? c1Var.c() : null);
                Bundle bundle = this.f1795a.D;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequenceI = this.f1795a.D.getCharSequence("android.text");
                }
                if (charSequenceI == null) {
                    charSequenceI = i();
                }
                builderA.setContentText(charSequenceI);
                c1 c1Var2 = this.f1786f;
                if (c1Var2 != null) {
                    if (c1Var2.a() != null) {
                        b.c(builderA, this.f1786f.a().t(this.f1795a.f1759a));
                    }
                    if (i10 >= 28) {
                        c.a(builderA, this.f1786f.h());
                    } else {
                        a.a(builderA, this.f1786f.d());
                    }
                }
                a.b(builderA, "call");
                return;
            }
            int i11 = this.f1785e;
            if (i11 == 1) {
                callStyleA = d.a(this.f1786f.h(), this.f1788h, this.f1787g);
            } else if (i11 == 2) {
                callStyleA = d.b(this.f1786f.h(), this.f1789i);
            } else if (i11 == 3) {
                callStyleA = d.c(this.f1786f.h(), this.f1789i, this.f1787g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", UICvx.HBTwrULAKnMxD + String.valueOf(this.f1785e));
            }
            if (callStyleA != null) {
                callStyleA.setBuilder(jVar.a());
                Integer num = this.f1791k;
                if (num != null) {
                    d.d(callStyleA, num.intValue());
                }
                Integer num2 = this.f1792l;
                if (num2 != null) {
                    d.f(callStyleA, num2.intValue());
                }
                d.i(callStyleA, this.f1794n);
                IconCompat iconCompat = this.f1793m;
                if (iconCompat != null) {
                    d.h(callStyleA, iconCompat.t(this.f1795a.f1759a));
                }
                d.g(callStyleA, this.f1790j);
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        /* JADX INFO: loaded from: classes.dex */
        static class b {
            static Notification.Action.Builder b(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            static void c(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }

            static Parcelable a(Icon icon) {
                return icon;
            }
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        /* JADX INFO: loaded from: classes.dex */
        static class c {
            static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            static Parcelable b(Person person) {
                return person;
            }
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static abstract class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected e f1795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CharSequence f1796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f1797c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f1798d = false;

        public void a(Bundle bundle) {
            if (this.f1798d) {
                bundle.putCharSequence("android.summaryText", this.f1797c);
            }
            CharSequence charSequence = this.f1796b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(j jVar);

        protected abstract String c();

        public RemoteViews d(j jVar) {
            return null;
        }

        public RemoteViews e(j jVar) {
            return null;
        }

        public RemoteViews f(j jVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f1795a != eVar) {
                this.f1795a = eVar;
                if (eVar != null) {
                    eVar.q(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(r.c.f24800b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(r.c.f24799a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class e {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        long N;
        int O;
        int P;
        boolean Q;
        Notification R;
        boolean S;
        Object T;

        @Deprecated
        public ArrayList<String> U;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f1759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<a> f1760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<c1> f1761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList<a> f1762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CharSequence f1763e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f1764f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        PendingIntent f1765g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f1766h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        RemoteViews f1767i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        IconCompat f1768j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        CharSequence f1769k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f1770l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f1771m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f1772n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f1773o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        g f1774p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        CharSequence f1775q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        CharSequence f1776r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        CharSequence[] f1777s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f1778t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f1779u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f1780v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        String f1781w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        boolean f1782x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        String f1783y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        boolean f1784z;

        /* JADX INFO: compiled from: NotificationCompat.java */
        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setLegacyStreamType(i10);
            }

            static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public e(Context context, String str) {
            this.f1760b = new ArrayList<>();
            this.f1761c = new ArrayList<>();
            this.f1762d = new ArrayList<>();
            this.f1772n = true;
            this.f1784z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.R = notification;
            this.f1759a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.f1771m = 0;
            this.U = new ArrayList<>();
            this.Q = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void k(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.R;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.R;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1760b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new z(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public e e(boolean z10) {
            k(16, z10);
            return this;
        }

        public e f(String str) {
            this.K = str;
            return this;
        }

        public e g(PendingIntent pendingIntent) {
            this.f1765g = pendingIntent;
            return this;
        }

        public e h(CharSequence charSequence) {
            this.f1764f = d(charSequence);
            return this;
        }

        public e i(CharSequence charSequence) {
            this.f1763e = d(charSequence);
            return this;
        }

        public e j(PendingIntent pendingIntent) {
            this.R.deleteIntent = pendingIntent;
            return this;
        }

        public e l(Bitmap bitmap) {
            this.f1768j = bitmap == null ? null : IconCompat.e(k.b(this.f1759a, bitmap));
            return this;
        }

        public e m(boolean z10) {
            this.f1784z = z10;
            return this;
        }

        public e n(int i10) {
            this.f1771m = i10;
            return this;
        }

        public e o(int i10) {
            this.R.icon = i10;
            return this;
        }

        public e p(Uri uri) {
            Notification notification = this.R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderE = a.e(a.c(a.b(), 4), 5);
            this.R.audioAttributes = a.a(builderE);
            return this;
        }

        public e q(g gVar) {
            if (this.f1774p != gVar) {
                this.f1774p = gVar;
                if (gVar != null) {
                    gVar.g(this);
                }
            }
            return this;
        }

        public e r(CharSequence charSequence) {
            this.R.tickerText = d(charSequence);
            return this;
        }

        public e s(long j10) {
            this.R.when = j10;
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }
    }
}
