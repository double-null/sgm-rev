package io.bidmachine;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: Debugger.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class Debugger {
    private static final String DIR_NAME = "features";
    private static final String FILE_NAME = "DebugParameters.json";
    private static final String PARAMETER_CONSENT = "consent";
    private static final String PARAMETER_COPPA = "coppa";
    private static final String PARAMETER_ENDPOINT = "endpoint";
    private static final String PARAMETER_GDPR_STRING = "GDPRString";
    private static final String PARAMETER_LOGGING_ENABLED = "loggingEnabled";
    private static final String PARAMETER_SUBJECT_TO_GDPR = "subjectToGDPR";
    private static final String PARAMETER_TEST_MODE = "testMode";
    private static final String PARAMETER_US_PRIVACY_STRING = "usPrivacyString";
    private static final String TAG = "Debugger";
    public static final Debugger INSTANCE = new Debugger();
    private static final AtomicBoolean LOGGING_LOCK = new AtomicBoolean(false);
    private static final AtomicBoolean TEST_MODE_LOCK = new AtomicBoolean(false);
    private static final wc.k scope$delegate = wc.m.a(b.f16454d);

    /* JADX INFO: compiled from: Debugger.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.Debugger$checkGlobalSettings$1", f = "Debugger.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements id.p<ud.o0, zc.f<? super wc.g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16451h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Context f16452i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ File f16453j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, File file, zc.f<? super a> fVar) {
            super(2, fVar);
            this.f16452i = context;
            this.f16453j = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            return new a(this.f16452i, this.f16453j, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f<? super wc.g0> fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f16451h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(obj);
            try {
                String string = Settings.Global.getString(this.f16452i.getContentResolver(), "bmsdk_dfp");
                if (string == null) {
                    return wc.g0.f27756a;
                }
                Log.d(Debugger.TAG, "Debug config found, restart the app to apply");
                File parentFile = this.f16453j.getParentFile();
                if (parentFile != null) {
                    kotlin.coroutines.jvm.internal.b.a(parentFile.mkdirs());
                }
                fd.h.h(this.f16453j, string, null, 2, null);
                return wc.g0.f27756a;
            } catch (Throwable th) {
                Log.w(Debugger.TAG, th);
            }
        }
    }

    /* JADX INFO: compiled from: Debugger.kt */
    static final class b extends kotlin.jvm.internal.u implements id.a<ud.o0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f16454d = new b();

        b() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ud.o0 invoke() {
            return ud.p0.a(ud.t2.b(null, 1, null).z(ud.e1.b()));
        }
    }

    private Debugger() {
    }

    private final void applyAndLockIfExists(AtomicBoolean atomicBoolean, JSONObject jSONObject, String str, id.l<? super Boolean, wc.g0> lVar) {
        if (jSONObject.has(str)) {
            lVar.invoke(Boolean.valueOf(jSONObject.optBoolean(str)));
            atomicBoolean.set(true);
        }
    }

    private final void checkGlobalSettings(Context context, File file) {
        ud.k.d(getScope(), null, null, new a(context, file, null), 3, null);
    }

    private final ud.o0 getScope() {
        return (ud.o0) scope$delegate.getValue();
    }

    public static final boolean isLoggingLock() {
        return LOGGING_LOCK.get();
    }

    public static final boolean isTestModeLock() {
        return TEST_MODE_LOCK.get();
    }

    public static final void setup(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        try {
            File fileH = ac.b.h(context);
            if (fileH == null) {
                return;
            }
            File file = new File(fileH, "features/DebugParameters.json");
            if (!file.exists()) {
                INSTANCE.checkGlobalSettings(context, file);
            } else {
                Log.d(TAG, "Debug file found");
                INSTANCE.setupFromJson$bidmachine_android_sdk_ba_3_6_1(ac.b.j(file));
            }
        } catch (Throwable th) {
            Log.w(TAG, th);
        }
    }

    public final void setupFromJson$bidmachine_android_sdk_ba_3_6_1(String str) {
        if (str == null || rd.f0.k0(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        AtomicBoolean atomicBoolean = LOGGING_LOCK;
        if (jSONObject.has(PARAMETER_LOGGING_ENABLED)) {
            BidMachine.setLoggingEnabled(jSONObject.optBoolean(PARAMETER_LOGGING_ENABLED));
            atomicBoolean.set(true);
        }
        AtomicBoolean atomicBoolean2 = TEST_MODE_LOCK;
        if (jSONObject.has(PARAMETER_TEST_MODE)) {
            BidMachine.setTestMode(jSONObject.optBoolean(PARAMETER_TEST_MODE));
            atomicBoolean2.set(true);
        }
        if (jSONObject.has(PARAMETER_ENDPOINT)) {
            String strOptString = jSONObject.optString(PARAMETER_ENDPOINT);
            kotlin.jvm.internal.t.e(strOptString, "jsonObject.optString(PARAMETER_ENDPOINT)");
            String string = rd.f0.d1(strOptString).toString();
            if ((string.length() > 0) && wb.d0.u(string)) {
                BidMachine.setEndpoint(string);
            }
        }
        if (jSONObject.has(PARAMETER_COPPA)) {
            BidMachine.setCoppa(Boolean.valueOf(jSONObject.optBoolean(PARAMETER_COPPA)));
        }
        if (jSONObject.has(PARAMETER_US_PRIVACY_STRING)) {
            BidMachine.setUSPrivacyString(jSONObject.optString(PARAMETER_US_PRIVACY_STRING));
        }
        if (jSONObject.has(PARAMETER_SUBJECT_TO_GDPR)) {
            BidMachine.setSubjectToGDPR(Boolean.valueOf(jSONObject.optBoolean(PARAMETER_SUBJECT_TO_GDPR)));
        }
        if (jSONObject.has(PARAMETER_CONSENT)) {
            BidMachine.setConsentConfig(jSONObject.optBoolean(PARAMETER_CONSENT), jSONObject.has(PARAMETER_GDPR_STRING) ? jSONObject.optString(PARAMETER_GDPR_STRING) : null);
        }
    }

    public static /* synthetic */ void isLoggingLock$annotations() {
    }

    public static /* synthetic */ void isTestModeLock$annotations() {
    }
}
