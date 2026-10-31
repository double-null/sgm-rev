package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@23.2.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics zza;
    private final zzez zzb;
    private ExecutorService zzc;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@23.2.0 */
    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@23.2.0 */
    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public FirebaseAnalytics(zzez zzezVar) {
        Preconditions.checkNotNull(zzezVar);
        this.zzb = zzezVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (zza == null) {
            synchronized (FirebaseAnalytics.class) {
                if (zza == null) {
                    zza = new FirebaseAnalytics(zzez.zza(context, null));
                }
            }
        }
        return zza;
    }

    public static zzlk getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzez zzezVarZza = zzez.zza(context, bundle);
        if (zzezVarZza == null) {
            return null;
        }
        return new d(zzezVarZza);
    }

    private final ExecutorService zzb() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            if (this.zzc == null) {
                this.zzc = new a(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.zzc;
        }
        return executorService;
    }

    public Task<String> getAppInstanceId() {
        try {
            return Tasks.call(zzb(), new b(this));
        } catch (RuntimeException e10) {
            this.zzb.zzD(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(e10);
        }
    }

    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(com.google.firebase.installations.c.p().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public Task<Long> getSessionId() {
        try {
            return Tasks.call(zzb(), new c(this));
        } catch (RuntimeException e10) {
            this.zzb.zzD(5, "Failed to schedule task for getSessionId", null, null, null);
            return Tasks.forException(e10);
        }
    }

    public void logEvent(String str, Bundle bundle) {
        this.zzb.zzh(str, bundle);
    }

    public void resetAnalyticsData() {
        this.zzb.zzs();
    }

    public void setAnalyticsCollectionEnabled(boolean z10) {
        this.zzb.zzq(Boolean.valueOf(z10));
    }

    public void setConsent(Map<ConsentType, ConsentStatus> map) {
        Bundle bundle = new Bundle();
        ConsentStatus consentStatus = map.get(ConsentType.AD_STORAGE);
        if (consentStatus != null) {
            int iOrdinal = consentStatus.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        ConsentStatus consentStatus2 = map.get(ConsentType.ANALYTICS_STORAGE);
        if (consentStatus2 != null) {
            int iOrdinal2 = consentStatus2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        ConsentStatus consentStatus3 = map.get(ConsentType.AD_USER_DATA);
        if (consentStatus3 != null) {
            int iOrdinal3 = consentStatus3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        ConsentStatus consentStatus4 = map.get(ConsentType.AD_PERSONALIZATION);
        if (consentStatus4 != null) {
            int iOrdinal4 = consentStatus4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.zzb.zzr(bundle);
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.zzb.zzp(zzdd.zza(activity), str, str2);
    }

    public void setDefaultEventParameters(Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.zzb.zzL(bundle);
    }

    public void setSessionTimeoutDuration(long j10) {
        this.zzb.zzt(j10);
    }

    public void setUserId(String str) {
        this.zzb.zzo(str);
    }

    public void setUserProperty(String str, String str2) {
        this.zzb.zzk(null, str, str2, false);
    }

    final /* synthetic */ zzez zza() {
        return this.zzb;
    }
}
