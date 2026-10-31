package a3;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;

/* JADX INFO: compiled from: CrashlyticsOriginAnalyticsEventLogger.java */
/* JADX INFO: loaded from: classes4.dex */
public class d implements AnalyticsEventLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v2.a f28a;

    public d(v2.a aVar) {
        this.f28a = aVar;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void a(String str, Bundle bundle) {
        this.f28a.b("clx", str, bundle);
    }
}
