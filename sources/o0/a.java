package o0;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* JADX INFO: compiled from: AdServicesInfo.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23000a = new a();

    /* JADX INFO: renamed from: o0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdServicesInfo.kt */
    private static final class C0382a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0382a f23001a = new C0382a();

        private C0382a() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(31);
        }
    }

    /* JADX INFO: compiled from: AdServicesInfo.kt */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f23002a = new b();

        private b() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private a() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return b.f23002a.a();
        }
        return 0;
    }

    public final int b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 31 || i10 == 32) {
            return C0382a.f23001a.a();
        }
        return 0;
    }
}
