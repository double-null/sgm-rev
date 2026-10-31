package a3;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import z2.f;

/* JADX INFO: compiled from: UnavailableAnalyticsEventLogger.java */
/* JADX INFO: loaded from: classes4.dex */
public class e implements AnalyticsEventLogger {
    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void a(String str, Bundle bundle) {
        f.f().b("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }
}
