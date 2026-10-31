package c5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public class j implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile j f4750d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Boolean f4751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Boolean f4752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f4753c;

    private j(Context context) {
        this.f4753c = context;
        c();
    }

    public static j a(Context context) {
        if (f4750d == null) {
            synchronized (j.class) {
                if (f4750d == null) {
                    f4750d = new j(context);
                }
            }
        }
        return f4750d;
    }

    public boolean b() {
        if (this.f4752b != null) {
            return this.f4752b.booleanValue();
        }
        synchronized (this) {
            if (this.f4752b != null) {
                return this.f4752b.booleanValue();
            }
            if (!c()) {
                this.f4752b = Boolean.FALSE;
                return false;
            }
            try {
                try {
                    PackageManager packageManager = this.f4753c.getPackageManager();
                    if (packageManager == null) {
                        i5.d.c("PackageManager is null when checking attestation capability");
                        this.f4752b = Boolean.FALSE;
                        return false;
                    }
                    Boolean boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("com.amazon.privacypass"));
                    this.f4752b = boolValueOf;
                    return boolValueOf.booleanValue();
                } catch (SecurityException e10) {
                    i5.d.b("Security exception when checking attestation capability", e10);
                    this.f4752b = Boolean.FALSE;
                    return false;
                }
            } catch (Exception e11) {
                i5.d.b("Unexpected error when checking attestation capability", e11);
                this.f4752b = Boolean.FALSE;
                return false;
            }
        }
    }

    public boolean c() {
        int i10;
        if (this.f4751a != null) {
            return this.f4751a.booleanValue();
        }
        synchronized (this) {
            if (this.f4751a != null) {
                return this.f4751a.booleanValue();
            }
            Boolean boolValueOf = Boolean.valueOf(this.f4753c != null && Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.toLowerCase().startsWith("aft") && (i10 = Build.VERSION.SDK_INT) >= 25 && i10 <= 30);
            this.f4751a = boolValueOf;
            return boolValueOf.booleanValue();
        }
    }

    @Override // c5.k
    public boolean a() {
        return c();
    }
}
