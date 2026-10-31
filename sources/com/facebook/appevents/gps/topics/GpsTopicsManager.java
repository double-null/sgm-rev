package com.facebook.appevents.gps.topics;

import android.content.Context;
import android.os.Build;
import android.os.OutcomeReceiver;
import android.util.Log;
import b.a;
import b.b;
import b.c;
import b.d;
import com.applovin.mediation.ads.Zfi.OgqfiHA;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.u;
import kotlin.jvm.internal.t;
import wc.k;
import wc.m;

/* JADX INFO: compiled from: GpsTopicsManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class GpsTopicsManager {
    public static final GpsTopicsManager INSTANCE = new GpsTopicsManager();
    private static final boolean RECORD_OBSERVATION = true;
    private static final String TAG;
    private static final k executor$delegate;
    private static final AtomicBoolean isTopicsObservationEnabled;

    static {
        String string = GpsTopicsManager.class.toString();
        t.e(string, "GpsTopicsManager::class.java.toString()");
        TAG = string;
        executor$delegate = m.a(GpsTopicsManager$executor$2.INSTANCE);
        isTopicsObservationEnabled = new AtomicBoolean(false);
    }

    private GpsTopicsManager() {
    }

    public static final /* synthetic */ String access$getTAG$p() {
        if (CrashShieldHandler.isObjectCrashing(GpsTopicsManager.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, GpsTopicsManager.class);
            return null;
        }
    }

    public static final /* synthetic */ List access$processObservedTopics(GpsTopicsManager gpsTopicsManager, b bVar) {
        if (CrashShieldHandler.isObjectCrashing(GpsTopicsManager.class)) {
            return null;
        }
        try {
            return gpsTopicsManager.processObservedTopics(bVar);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, GpsTopicsManager.class);
            return null;
        }
    }

    public static final void enableTopicsObservation() {
        if (CrashShieldHandler.isObjectCrashing(GpsTopicsManager.class)) {
            return;
        }
        try {
            isTopicsObservationEnabled.set(RECORD_OBSERVATION);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, GpsTopicsManager.class);
        }
    }

    private final Executor getExecutor() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Object value = executor$delegate.getValue();
            t.e(value, "<get-executor>(...)");
            return (Executor) value;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final CompletableFuture<List<TopicData>> getTopics() {
        if (CrashShieldHandler.isObjectCrashing(GpsTopicsManager.class)) {
            return null;
        }
        try {
            if (!shouldObserveTopics()) {
                CompletableFuture<List<TopicData>> completableFutureCompletedFuture = CompletableFuture.completedFuture(kotlin.collections.t.k());
                t.e(completableFutureCompletedFuture, "completedFuture(emptyList())");
                return completableFutureCompletedFuture;
            }
            final CompletableFuture<List<TopicData>> completableFuture = new CompletableFuture<>();
            try {
                Context applicationContext = FacebookSdk.getApplicationContext();
                OutcomeReceiver<b, Exception> outcomeReceiver = new OutcomeReceiver<b, Exception>() { // from class: com.facebook.appevents.gps.topics.GpsTopicsManager$getTopics$callback$1
                    @Override // android.os.OutcomeReceiver
                    public void onError(Exception error) {
                        t.f(error, "error");
                        Log.w(GpsTopicsManager.access$getTAG$p(), "GPS_TOPICS_OBSERVATION_FAILURE", error);
                        completableFuture.completeExceptionally(error);
                    }

                    @Override // android.os.OutcomeReceiver
                    public void onResult(b response) {
                        t.f(response, "response");
                        try {
                            completableFuture.complete(GpsTopicsManager.access$processObservedTopics(GpsTopicsManager.INSTANCE, response));
                        } catch (Throwable th) {
                            Log.w(GpsTopicsManager.access$getTAG$p(), OgqfiHA.zxcM, th);
                            completableFuture.completeExceptionally(th);
                        }
                    }
                };
                a.C0079a c0079a = new a.C0079a();
                c0079a.c(RECORD_OBSERVATION);
                c0079a.b(applicationContext.getPackageName());
                d dVar = (d) applicationContext.getSystemService(d.class);
                if (dVar != null) {
                    c0079a.a();
                    dVar.b(null, INSTANCE.getExecutor(), outcomeReceiver);
                }
            } catch (Throwable th) {
                Log.w(TAG, "GPS_TOPICS_OBSERVATION_FAILURE", th);
                completableFuture.completeExceptionally(th);
            }
            return completableFuture;
        } catch (Throwable th2) {
            CrashShieldHandler.handleThrowable(th2, GpsTopicsManager.class);
            return null;
        }
    }

    private final List<TopicData> processObservedTopics(b bVar) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            List<c> listA = bVar.a();
            t.e(listA, "response.topics");
            ArrayList arrayList = new ArrayList(u.u(listA, 10));
            for (c cVar : listA) {
                arrayList.add(new TopicData(cVar.b(), cVar.a(), cVar.c()));
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final boolean shouldObserveTopics() {
        if (CrashShieldHandler.isObjectCrashing(GpsTopicsManager.class)) {
            return false;
        }
        try {
            if (isTopicsObservationEnabled.get() && Build.VERSION.SDK_INT >= 33) {
                return RECORD_OBSERVATION;
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, GpsTopicsManager.class);
            return false;
        }
    }
}
