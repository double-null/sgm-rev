package com.facebook.appevents.suggestedevents;

import android.os.Bundle;
import android.view.View;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.eventdeactivation.ksG.UomBEukHFwrS;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.suggestedevents.ViewOnClickListener;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;
import rd.c0;

/* JADX INFO: compiled from: ViewOnClickListener.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListener implements View.OnClickListener {
    private static final String API_ENDPOINT = "%s/suggested_events";
    public static final String OTHER_EVENT = "other";
    private final String activityName;
    private final View.OnClickListener baseListener;
    private final WeakReference<View> hostViewWeakReference;
    private final WeakReference<View> rootViewWeakReference;
    public static final Companion Companion = new Companion(null);
    private static final Set<Integer> viewsAttachedListener = new HashSet();

    /* JADX INFO: compiled from: ViewOnClickListener.kt */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void processPredictedResult(String str, String str2, float[] fArr) {
            if (SuggestedEventsManager.isProductionEvents$facebook_core_release(str)) {
                new InternalAppEventsLogger(FacebookSdk.getApplicationContext()).logEventFromSE(str, str2);
            } else if (SuggestedEventsManager.isEligibleEvents$facebook_core_release(str)) {
                sendPredictedResult(str, str2, fArr);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean queryHistoryAndProcess(String str, final String str2) {
            final String strQueryEvent = PredictionHistoryManager.queryEvent(str);
            if (strQueryEvent == null) {
                return false;
            }
            if (t.a(strQueryEvent, "other")) {
                return true;
            }
            Utility.runOnNonUiThread(new Runnable() { // from class: t1.d
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnClickListener.Companion.queryHistoryAndProcess$lambda$0(strQueryEvent, str2);
                }
            });
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void queryHistoryAndProcess$lambda$0(String queriedEvent, String buttonText) {
            t.f(queriedEvent, "$queriedEvent");
            t.f(buttonText, "$buttonText");
            ViewOnClickListener.Companion.processPredictedResult(queriedEvent, buttonText, new float[0]);
        }

        public final void attachListener$facebook_core_release(View hostView, View rootView, String activityName) {
            t.f(hostView, "hostView");
            t.f(rootView, "rootView");
            t.f(activityName, "activityName");
            int iHashCode = hostView.hashCode();
            if (ViewOnClickListener.access$getViewsAttachedListener$cp().contains(Integer.valueOf(iHashCode))) {
                return;
            }
            ViewHierarchy.setOnClickListener(hostView, new ViewOnClickListener(hostView, rootView, activityName, null));
            ViewOnClickListener.access$getViewsAttachedListener$cp().add(Integer.valueOf(iHashCode));
        }

        private final void sendPredictedResult(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString(UomBEukHFwrS.YzgImr, str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb2 = new StringBuilder();
                for (float f10 : fArr) {
                    sb2.append(f10);
                    sb2.append(",");
                }
                jSONObject.put("dense", sb2.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                GraphRequest.Companion companion = GraphRequest.Companion;
                l0 l0Var = l0.f21527a;
                String str3 = String.format(Locale.US, ViewOnClickListener.API_ENDPOINT, Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
                t.e(str3, "format(locale, format, *args)");
                GraphRequest graphRequestNewPostRequest = companion.newPostRequest(null, str3, null, null);
                graphRequestNewPostRequest.setParameters(bundle);
                graphRequestNewPostRequest.executeAndWait();
            } catch (JSONException unused) {
            }
        }
    }

    public /* synthetic */ ViewOnClickListener(View view, View view2, String str, k kVar) {
        this(view, view2, str);
    }

    public static final /* synthetic */ Set access$getViewsAttachedListener$cp() {
        if (CrashShieldHandler.isObjectCrashing(ViewOnClickListener.class)) {
            return null;
        }
        try {
            return viewsAttachedListener;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewOnClickListener.class);
            return null;
        }
    }

    public static final void attachListener$facebook_core_release(View view, View view2, String str) {
        if (CrashShieldHandler.isObjectCrashing(ViewOnClickListener.class)) {
            return;
        }
        try {
            Companion.attachListener$facebook_core_release(view, view2, str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewOnClickListener.class);
        }
    }

    private final void predictAndProcess(final String str, final String str2, final JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Utility.runOnNonUiThread(new Runnable() { // from class: t1.c
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnClickListener.predictAndProcess$lambda$0(jSONObject, str2, this, str);
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void predictAndProcess$lambda$0(JSONObject viewData, String buttonText, ViewOnClickListener this$0, String pathID) {
        String[] strArrPredict;
        if (CrashShieldHandler.isObjectCrashing(ViewOnClickListener.class)) {
            return;
        }
        try {
            t.f(viewData, "$viewData");
            t.f(buttonText, "$buttonText");
            t.f(this$0, "this$0");
            t.f(pathID, "$pathID");
            try {
                String lowerCase = Utility.getAppName(FacebookSdk.getApplicationContext()).toLowerCase();
                t.e(lowerCase, "this as java.lang.String).toLowerCase()");
                float[] denseFeatures = FeatureExtractor.getDenseFeatures(viewData, lowerCase);
                String textFeature = FeatureExtractor.getTextFeature(buttonText, this$0.activityName, lowerCase);
                if (denseFeatures == null || (strArrPredict = ModelManager.predict(ModelManager.Task.MTML_APP_EVENT_PREDICTION, new float[][]{denseFeatures}, new String[]{textFeature})) == null) {
                    return;
                }
                String str = strArrPredict[0];
                PredictionHistoryManager.addPrediction(pathID, str);
                if (t.a(str, "other")) {
                    return;
                }
                Companion.processPredictedResult(str, buttonText, denseFeatures);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewOnClickListener.class);
        }
    }

    private final void process() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            View view = this.rootViewWeakReference.get();
            View view2 = this.hostViewWeakReference.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                String textOfViewRecursively = SuggestedEventViewHierarchy.getTextOfViewRecursively(view2);
                String pathID = PredictionHistoryManager.getPathID(view2, textOfViewRecursively);
                if (pathID == null || Companion.queryHistoryAndProcess(pathID, textOfViewRecursively)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ViewHierarchyConstants.VIEW_KEY, SuggestedEventViewHierarchy.getDictionaryOfView(view, view2));
                jSONObject.put(ViewHierarchyConstants.SCREEN_NAME_KEY, this.activityName);
                predictAndProcess(pathID, textOfViewRecursively, jSONObject);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                t.f(view, "view");
                View.OnClickListener onClickListener = this.baseListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                process();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.handleThrowable(th2, this);
        }
    }

    private ViewOnClickListener(View view, View view2, String str) {
        this.baseListener = ViewHierarchy.getExistingOnClickListener(view);
        this.rootViewWeakReference = new WeakReference<>(view2);
        this.hostViewWeakReference = new WeakReference<>(view);
        String lowerCase = str.toLowerCase();
        t.e(lowerCase, "this as java.lang.String).toLowerCase()");
        this.activityName = c0.K(lowerCase, "activity", "", false, 4, null);
    }
}
