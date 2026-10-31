package i3;

import android.content.Context;
import b2.g;
import b2.i;
import com.adjust.sdk.Constants;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import d2.u;
import e3.h0;
import f3.j;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: DataTransportCrashlyticsReportSender.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j f15894c = new j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f15895d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f15896e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g<h0, byte[]> f15897f = new g() { // from class: i3.a
        @Override // b2.g
        public final Object apply(Object obj) {
            return b.d((h0) obj);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f15898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g<h0, byte[]> f15899b;

    b(e eVar, g<h0, byte[]> gVar) {
        this.f15898a = eVar;
        this.f15899b = gVar;
    }

    public static b b(Context context, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter) {
        u.f(context);
        i iVarG = u.c().g(new com.google.android.datatransport.cct.a(f15895d, f15896e));
        b2.b bVarB = b2.b.b("json");
        g<h0, byte[]> gVar = f15897f;
        return new b(new e(iVarG.a("FIREBASE_CRASHLYTICS_REPORT", h0.class, bVarB, gVar), settingsProvider.b(), onDemandCounter), gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] d(h0 h0Var) {
        return f15894c.Q(h0Var).getBytes(Charset.forName(Constants.ENCODING));
    }

    private static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    public Task<com.google.firebase.crashlytics.internal.common.h0> c(com.google.firebase.crashlytics.internal.common.h0 h0Var, boolean z10) {
        return this.f15898a.i(h0Var, z10).getTask();
    }
}
