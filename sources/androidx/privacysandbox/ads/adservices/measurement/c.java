package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: MeasurementManagerApi31Ext9Impl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends f {
    /* JADX WARN: Illegal instructions before constructor call */
    public c(Context context) {
        t.f(context, "context");
        MeasurementManager measurementManager = MeasurementManager.get(context);
        t.e(measurementManager, "get(context)");
        super(measurementManager);
    }
}
