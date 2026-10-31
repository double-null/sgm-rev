package com.iab.omid.library.applovin.attestation;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public class j implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile j f12528d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Boolean f12529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Boolean f12530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f12531c;

    private j(Context context) {
        this.f12531c = context;
        c();
    }

    public static j a(Context context) {
        if (f12528d == null) {
            synchronized (j.class) {
                if (f12528d == null) {
                    f12528d = new j(context);
                }
            }
        }
        return f12528d;
    }

    public boolean b() {
        if (this.f12530b != null) {
            return this.f12530b.booleanValue();
        }
        synchronized (this) {
            if (this.f12530b != null) {
                return this.f12530b.booleanValue();
            }
            if (!c()) {
                this.f12530b = Boolean.FALSE;
                return false;
            }
            try {
                try {
                    PackageManager packageManager = this.f12531c.getPackageManager();
                    if (packageManager == null) {
                        com.iab.omid.library.applovin.utils.d.b("PackageManager is null when checking attestation capability");
                        this.f12530b = Boolean.FALSE;
                        return false;
                    }
                    Boolean boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("com.amazon.privacypass"));
                    this.f12530b = boolValueOf;
                    return boolValueOf.booleanValue();
                } catch (SecurityException e10) {
                    com.iab.omid.library.applovin.utils.d.a("Security exception when checking attestation capability", e10);
                    this.f12530b = Boolean.FALSE;
                    return false;
                }
            } catch (Exception e11) {
                com.iab.omid.library.applovin.utils.d.a("Unexpected error when checking attestation capability", e11);
                this.f12530b = Boolean.FALSE;
                return false;
            }
        }
    }

    public boolean c() {
        int i10;
        if (this.f12529a != null) {
            return this.f12529a.booleanValue();
        }
        synchronized (this) {
            if (this.f12529a != null) {
                return this.f12529a.booleanValue();
            }
            Boolean boolValueOf = Boolean.valueOf(this.f12531c != null && Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.toLowerCase().startsWith("aft") && (i10 = Build.VERSION.SDK_INT) >= 25 && i10 <= 30);
            this.f12529a = boolValueOf;
            return boolValueOf.booleanValue();
        }
    }

    @Override // com.iab.omid.library.applovin.attestation.k
    public boolean a() {
        return c();
    }
}
