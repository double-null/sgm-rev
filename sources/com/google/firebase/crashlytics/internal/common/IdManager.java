package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class IdManager implements o0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f12082g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f12083h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f12084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f12085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FirebaseInstallationsApi f12087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final DataCollectionArbiter f12088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o0.a f12089f;

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionArbiter dataCollectionArbiter) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f12085b = context;
        this.f12086c = str;
        this.f12087d = firebaseInstallationsApi;
        this.f12088e = dataCollectionArbiter;
        this.f12084a = new p0();
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String strE;
        strE = e(UUID.randomUUID().toString());
        z2.f.f().i("Created new Crashlytics installation ID: " + strE + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strE).putString("firebase.installation.id", str).apply();
        return strE;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        return f12082g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f12083h, "");
    }

    private boolean n() {
        o0.a aVar = this.f12089f;
        return aVar == null || (aVar.e() == null && this.f12088e.isAutomaticDataCollectionEnabled());
    }

    @Override // com.google.firebase.crashlytics.internal.common.o0
    public synchronized o0.a a() {
        if (!n()) {
            return this.f12089f;
        }
        z2.f.f().i("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesQ = h.q(this.f12085b);
        String string = sharedPreferencesQ.getString("firebase.installation.id", null);
        z2.f.f().i("Cached Firebase Installation ID: " + string);
        if (this.f12088e.isAutomaticDataCollectionEnabled()) {
            n0 n0VarD = d(false);
            z2.f.f().i("Fetched Firebase Installation ID: " + n0VarD.b());
            if (n0VarD.b() == null) {
                n0VarD = new n0(string == null ? c() : string, null);
            }
            if (Objects.equals(n0VarD.b(), string)) {
                this.f12089f = o0.a.a(l(sharedPreferencesQ), n0VarD);
            } else {
                this.f12089f = o0.a.a(b(n0VarD.b(), sharedPreferencesQ), n0VarD);
            }
        } else if (k(string)) {
            this.f12089f = o0.a.b(l(sharedPreferencesQ));
        } else {
            this.f12089f = o0.a.b(b(c(), sharedPreferencesQ));
        }
        z2.f.f().i("Install IDs: " + this.f12089f);
        return this.f12089f;
    }

    public n0 d(boolean z10) {
        String strB;
        CrashlyticsWorkers.e();
        String str = null;
        if (z10) {
            try {
                strB = ((com.google.firebase.installations.f) Tasks.await(this.f12087d.a(false), 10000L, TimeUnit.MILLISECONDS)).b();
            } catch (Exception e10) {
                z2.f.f().l("Error getting Firebase authentication token.", e10);
                strB = null;
            }
        } else {
            strB = null;
        }
        try {
            str = (String) Tasks.await(this.f12087d.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            z2.f.f().l("Error getting Firebase installation id.", e11);
        }
        return new n0(str, strB);
    }

    public String f() {
        return this.f12086c;
    }

    public String g() {
        return this.f12084a.a(this.f12085b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
