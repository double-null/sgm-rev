package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: MeasurementManagerApi33Ext5Impl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends f {
    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context) {
        t.f(context, "context");
        Object systemService = context.getSystemService((Class<Object>) MeasurementManager.class);
        t.e(systemService, "context.getSystemService…ementManager::class.java)");
        super((MeasurementManager) systemService);
    }
}
