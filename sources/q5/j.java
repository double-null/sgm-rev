package q5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public class j implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile j f24437d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Boolean f24438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Boolean f24439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f24440c;

    private j(Context context) {
        this.f24440c = context;
        c();
    }

    public static j a(Context context) {
        if (f24437d == null) {
            synchronized (j.class) {
                if (f24437d == null) {
                    f24437d = new j(context);
                }
            }
        }
        return f24437d;
    }

    public boolean b() {
        if (this.f24439b != null) {
            return this.f24439b.booleanValue();
        }
        synchronized (this) {
            if (this.f24439b != null) {
                return this.f24439b.booleanValue();
            }
            if (!c()) {
                this.f24439b = Boolean.FALSE;
                return false;
            }
            try {
                try {
                    PackageManager packageManager = this.f24440c.getPackageManager();
                    if (packageManager == null) {
                        w5.d.c("PackageManager is null when checking attestation capability");
                        this.f24439b = Boolean.FALSE;
                        return false;
                    }
                    Boolean boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("com.amazon.privacypass"));
                    this.f24439b = boolValueOf;
                    return boolValueOf.booleanValue();
                } catch (SecurityException e10) {
                    w5.d.b("Security exception when checking attestation capability", e10);
                    this.f24439b = Boolean.FALSE;
                    return false;
                }
            } catch (Exception e11) {
                w5.d.b("Unexpected error when checking attestation capability", e11);
                this.f24439b = Boolean.FALSE;
                return false;
            }
        }
    }

    public boolean c() {
        int i10;
        if (this.f24438a != null) {
            return this.f24438a.booleanValue();
        }
        synchronized (this) {
            if (this.f24438a != null) {
                return this.f24438a.booleanValue();
            }
            Boolean boolValueOf = Boolean.valueOf(this.f24440c != null && Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.toLowerCase().startsWith("aft") && (i10 = Build.VERSION.SDK_INT) >= 25 && i10 <= 30);
            this.f24438a = boolValueOf;
            return boolValueOf.booleanValue();
        }
    }

    @Override // q5.k
    public boolean a() {
        return c();
    }
}
