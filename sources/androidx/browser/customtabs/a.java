package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: compiled from: CustomTabColorSchemeParams.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f1511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f1512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f1513d;

    /* JADX INFO: renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CustomTabColorSchemeParams.java */
    public static final class C0020a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f1514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f1515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f1516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f1517d;

        public a a() {
            return new a(this.f1514a, this.f1515b, this.f1516c, this.f1517d);
        }

        public C0020a b(int i10) {
            this.f1514a = Integer.valueOf(i10 | (-16777216));
            return this;
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f1510a = num;
        this.f1511b = num2;
        this.f1512c = num3;
        this.f1513d = num4;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f1510a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f1511b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f1512c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f1513d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
