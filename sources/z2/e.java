package z2;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: DevelopmentPlatformProvider.java */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f28931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f28932b = null;

    /* JADX INFO: compiled from: DevelopmentPlatformProvider.java */
    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f28933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f28934b;

        private b() {
            int iP = com.google.firebase.crashlytics.internal.common.h.p(e.this.f28931a, "com.google.firebase.crashlytics.unity_version", "string");
            if (iP == 0) {
                if (!e.this.c("flutter_assets/NOTICES.Z")) {
                    this.f28933a = null;
                    this.f28934b = null;
                    return;
                } else {
                    this.f28933a = "Flutter";
                    this.f28934b = null;
                    f.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.f28933a = "Unity";
            String string = e.this.f28931a.getResources().getString(iP);
            this.f28934b = string;
            f.f().i("Unity Editor version is: " + string);
        }
    }

    public e(Context context) {
        this.f28931a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f28931a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f28931a.getAssets().open(str);
            if (inputStreamOpen == null) {
                return true;
            }
            inputStreamOpen.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f28932b == null) {
            this.f28932b = new b();
        }
        return this.f28932b;
    }

    public static boolean g(Context context) {
        return com.google.firebase.crashlytics.internal.common.h.p(context, "com.google.firebase.crashlytics.unity_version", "string") != 0;
    }

    public String d() {
        return f().f28933a;
    }

    public String e() {
        return f().f28934b;
    }
}
