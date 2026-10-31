package b4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import java.util.Map;

/* JADX INFO: compiled from: SessionEvents.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f3972a = new l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o3.a f3973b;

    static {
        o3.a aVarI = new q3.d().j(c.f3886a).k(true).i();
        kotlin.jvm.internal.t.e(aVarI, "build(...)");
        f3973b = aVarI;
    }

    private l0() {
    }

    private final d d(c4.d dVar) {
        if (dVar == null) {
            return d.COLLECTION_SDK_NOT_INSTALLED;
        }
        return dVar.a() ? d.COLLECTION_ENABLED : d.COLLECTION_DISABLED;
    }

    public final k0 a(FirebaseApp firebaseApp, j0 sessionDetails, e4.j sessionsSettings, Map<c4.d.a, ? extends c4.d> subscribers, String firebaseInstallationId, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.t.f(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.t.f(sessionDetails, "sessionDetails");
        kotlin.jvm.internal.t.f(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.t.f(subscribers, "subscribers");
        kotlin.jvm.internal.t.f(firebaseInstallationId, "firebaseInstallationId");
        kotlin.jvm.internal.t.f(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new k0(j.SESSION_START, new r0(sessionDetails.b(), sessionDetails.a(), sessionDetails.c(), sessionDetails.d(), new e(d(subscribers.get(c4.d.a.PERFORMANCE)), d(subscribers.get(c4.d.a.CRASHLYTICS)), sessionsSettings.a()), firebaseInstallationId, firebaseAuthenticationToken), b(firebaseApp));
    }

    public final b b(FirebaseApp firebaseApp) throws PackageManager.NameNotFoundException {
        kotlin.jvm.internal.t.f(firebaseApp, "firebaseApp");
        Context applicationContext = firebaseApp.getApplicationContext();
        kotlin.jvm.internal.t.e(applicationContext, "getApplicationContext(...)");
        String packageName = applicationContext.getPackageName();
        PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String applicationId = firebaseApp.getOptions().getApplicationId();
        kotlin.jvm.internal.t.e(applicationId, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.t.e(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.t.e(RELEASE, "RELEASE");
        v vVar = v.LOG_ENVIRONMENT_PROD;
        kotlin.jvm.internal.t.c(packageName);
        String str = packageInfo.versionName;
        String str2 = str == null ? strValueOf : str;
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.t.e(MANUFACTURER, "MANUFACTURER");
        e0 e0Var = e0.f3940a;
        Context applicationContext2 = firebaseApp.getApplicationContext();
        kotlin.jvm.internal.t.e(applicationContext2, "getApplicationContext(...)");
        d0 d0VarB = e0Var.b(applicationContext2);
        Context applicationContext3 = firebaseApp.getApplicationContext();
        kotlin.jvm.internal.t.e(applicationContext3, "getApplicationContext(...)");
        return new b(applicationId, MODEL, "3.0.8", RELEASE, vVar, new a(packageName, str2, strValueOf, MANUFACTURER, d0VarB, e0Var.a(applicationContext3)));
    }

    public final o3.a c() {
        return f3973b;
    }
}
