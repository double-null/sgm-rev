package v2;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.internal.f;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@23.2.0 */
/* JADX INFO: loaded from: classes4.dex */
public class b implements v2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile v2.a f27104c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AppMeasurementSdk f27105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f27106b;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@23.2.0 */
    class a implements v2.a.InterfaceC0448a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f27108b;

        a(b bVar, String str) {
            this.f27107a = str;
            Objects.requireNonNull(bVar);
            this.f27108b = bVar;
        }
    }

    b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f27105a = appMeasurementSdk;
        this.f27106b = new ConcurrentHashMap();
    }

    public static v2.a c(FirebaseApp firebaseApp, Context context, s3.d dVar) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f27104c == null) {
            synchronized (b.class) {
                if (f27104c == null) {
                    Bundle bundle = new Bundle(1);
                    if (firebaseApp.isDefaultApp()) {
                        dVar.a(DataCollectionDefaultChange.class, d.f27110a, c.f27109a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                    }
                    f27104c = new b(zzez.zza(context, bundle).zzb());
                }
            }
        }
        return f27104c;
    }

    static /* synthetic */ void d(s3.a aVar) {
        boolean z10 = ((DataCollectionDefaultChange) aVar.a()).enabled;
        synchronized (b.class) {
            ((b) Preconditions.checkNotNull(f27104c)).f27105a.zza(z10);
        }
    }

    private final boolean e(String str) {
        if (str.isEmpty()) {
            return false;
        }
        Map map = this.f27106b;
        return map.containsKey(str) && map.get(str) != null;
    }

    @Override // v2.a
    public v2.a.InterfaceC0448a a(String str, v2.a.b bVar) {
        Object fVar;
        Preconditions.checkNotNull(bVar);
        if (com.google.firebase.analytics.connector.internal.b.a(str) && !e(str)) {
            AppMeasurementSdk appMeasurementSdk = this.f27105a;
            if (AppMeasurement.FIAM_ORIGIN.equals(str)) {
                fVar = new com.google.firebase.analytics.connector.internal.d(appMeasurementSdk, bVar);
            } else {
                fVar = "clx".equals(str) ? new f(appMeasurementSdk, bVar) : null;
            }
            if (fVar != null) {
                this.f27106b.put(str, fVar);
                return new a(this, str);
            }
        }
        return null;
    }

    @Override // v2.a
    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.b(str2, bundle) && com.google.firebase.analytics.connector.internal.b.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f27105a.logEvent(str, str2, bundle);
        }
    }
}
