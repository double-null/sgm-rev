package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.appevents.AppEventQueue;
import com.facebook.appevents.FlushReason;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.Utility;
import com.vungle.ads.internal.signals.SignalManager;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: AccessTokenManager.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AccessTokenManager {
    public static final String ACTION_CURRENT_ACCESS_TOKEN_CHANGED = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_NEW_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN";
    public static final String EXTRA_OLD_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN";
    private static final String ME_PERMISSIONS_GRAPH_PATH = "me/permissions";
    public static final String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";
    public static final String TAG = "AccessTokenManager";
    private static final int TOKEN_EXTEND_RETRY_SECONDS = 3600;
    private static final int TOKEN_EXTEND_THRESHOLD_SECONDS = 86400;
    private static AccessTokenManager instanceField;
    private final AccessTokenCache accessTokenCache;
    private AccessToken currentAccessTokenField;
    private Date lastAttemptedTokenExtendDate;
    private final n0.a localBroadcastManager;
    private final AtomicBoolean tokenRefreshInProgress;

    /* JADX INFO: compiled from: AccessTokenManager.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GraphRequest createExtendAccessTokenRequest(AccessToken accessToken, GraphRequest.Callback callback) {
            RefreshTokenInfo refreshTokenInfoForToken = getRefreshTokenInfoForToken(accessToken);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", refreshTokenInfoForToken.getGrantType());
            bundle.putString("client_id", accessToken.getApplicationId());
            bundle.putString(GraphRequest.FIELDS_PARAM, "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest graphRequestNewGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(accessToken, refreshTokenInfoForToken.getGraphPath(), callback);
            graphRequestNewGraphPathRequest.setParameters(bundle);
            graphRequestNewGraphPathRequest.setHttpMethod(HttpMethod.GET);
            return graphRequestNewGraphPathRequest;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GraphRequest createGrantedPermissionsRequest(AccessToken accessToken, GraphRequest.Callback callback) {
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, "permission,status");
            GraphRequest graphRequestNewGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(accessToken, AccessTokenManager.ME_PERMISSIONS_GRAPH_PATH, callback);
            graphRequestNewGraphPathRequest.setParameters(bundle);
            graphRequestNewGraphPathRequest.setHttpMethod(HttpMethod.GET);
            return graphRequestNewGraphPathRequest;
        }

        private final RefreshTokenInfo getRefreshTokenInfoForToken(AccessToken accessToken) {
            String graphDomain = accessToken.getGraphDomain();
            if (graphDomain == null) {
                graphDomain = AccessToken.DEFAULT_GRAPH_DOMAIN;
            }
            return kotlin.jvm.internal.t.a(graphDomain, FacebookSdk.INSTAGRAM) ? new InstagramRefreshTokenInfo() : new FacebookRefreshTokenInfo();
        }

        public final AccessTokenManager getInstance() {
            AccessTokenManager accessTokenManager;
            AccessTokenManager accessTokenManager2 = AccessTokenManager.instanceField;
            if (accessTokenManager2 != null) {
                return accessTokenManager2;
            }
            synchronized (this) {
                accessTokenManager = AccessTokenManager.instanceField;
                if (accessTokenManager == null) {
                    n0.a aVarB = n0.a.b(FacebookSdk.getApplicationContext());
                    kotlin.jvm.internal.t.e(aVarB, "getInstance(applicationContext)");
                    AccessTokenManager accessTokenManager3 = new AccessTokenManager(aVarB, new AccessTokenCache());
                    AccessTokenManager.instanceField = accessTokenManager3;
                    accessTokenManager = accessTokenManager3;
                }
            }
            return accessTokenManager;
        }
    }

    /* JADX INFO: compiled from: AccessTokenManager.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class FacebookRefreshTokenInfo implements RefreshTokenInfo {
        private final String graphPath = "oauth/access_token";
        private final String grantType = "fb_extend_sso_token";

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public String getGrantType() {
            return this.grantType;
        }

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public String getGraphPath() {
            return this.graphPath;
        }
    }

    /* JADX INFO: compiled from: AccessTokenManager.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class InstagramRefreshTokenInfo implements RefreshTokenInfo {
        private final String graphPath = "refresh_access_token";
        private final String grantType = "ig_refresh_token";

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public String getGrantType() {
            return this.grantType;
        }

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public String getGraphPath() {
            return this.graphPath;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AccessTokenManager.kt */
    /* JADX INFO: loaded from: classes.dex */
    static final class RefreshResult {
        private String accessToken;
        private Long dataAccessExpirationTime;
        private int expiresAt;
        private int expiresIn;
        private String graphDomain;

        public final String getAccessToken() {
            return this.accessToken;
        }

        public final Long getDataAccessExpirationTime() {
            return this.dataAccessExpirationTime;
        }

        public final int getExpiresAt() {
            return this.expiresAt;
        }

        public final int getExpiresIn() {
            return this.expiresIn;
        }

        public final String getGraphDomain() {
            return this.graphDomain;
        }

        public final void setAccessToken(String str) {
            this.accessToken = str;
        }

        public final void setDataAccessExpirationTime(Long l10) {
            this.dataAccessExpirationTime = l10;
        }

        public final void setExpiresAt(int i10) {
            this.expiresAt = i10;
        }

        public final void setExpiresIn(int i10) {
            this.expiresIn = i10;
        }

        public final void setGraphDomain(String str) {
            this.graphDomain = str;
        }
    }

    /* JADX INFO: compiled from: AccessTokenManager.kt */
    /* JADX INFO: loaded from: classes.dex */
    public interface RefreshTokenInfo {
        String getGrantType();

        String getGraphPath();
    }

    public AccessTokenManager(n0.a localBroadcastManager, AccessTokenCache accessTokenCache) {
        kotlin.jvm.internal.t.f(localBroadcastManager, "localBroadcastManager");
        kotlin.jvm.internal.t.f(accessTokenCache, "accessTokenCache");
        this.localBroadcastManager = localBroadcastManager;
        this.accessTokenCache = accessTokenCache;
        this.tokenRefreshInProgress = new AtomicBoolean(false);
        this.lastAttemptedTokenExtendDate = new Date(0L);
    }

    public static final AccessTokenManager getInstance() {
        return Companion.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshCurrentAccessToken$lambda$1(AccessTokenManager this$0, AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        this$0.refreshCurrentAccessTokenImpl(accessTokenRefreshCallback);
    }

    private final void refreshCurrentAccessTokenImpl(final AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback) {
        final AccessToken currentAccessToken = getCurrentAccessToken();
        if (currentAccessToken == null) {
            if (accessTokenRefreshCallback != null) {
                accessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("No current access token to refresh"));
                return;
            }
            return;
        }
        if (!this.tokenRefreshInProgress.compareAndSet(false, true)) {
            if (accessTokenRefreshCallback != null) {
                accessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("Refresh already in progress"));
                return;
            }
            return;
        }
        this.lastAttemptedTokenExtendDate = new Date();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        final HashSet hashSet3 = new HashSet();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final RefreshResult refreshResult = new RefreshResult();
        final GraphRequest.Callback callback = new GraphRequest.Callback() { // from class: com.facebook.c
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(GraphResponse graphResponse) {
                AccessTokenManager.refreshCurrentAccessTokenImpl$lambda$2(atomicBoolean, hashSet, hashSet2, hashSet3, graphResponse);
            }
        };
        final GraphRequest.Callback callback2 = new GraphRequest.Callback() { // from class: com.facebook.d
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(GraphResponse graphResponse) {
                AccessTokenManager.refreshCurrentAccessTokenImpl$lambda$3(refreshResult, graphResponse);
            }
        };
        final Runnable runnable = new Runnable() { // from class: com.facebook.e
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                AccessTokenManager.refreshCurrentAccessTokenImpl$lambda$4(refreshResult, currentAccessToken, accessTokenRefreshCallback, atomicBoolean, hashSet, hashSet2, hashSet3, this);
            }
        };
        Companion companion = Companion;
        GraphRequest graphRequestCreateGrantedPermissionsRequest = companion.createGrantedPermissionsRequest(currentAccessToken, callback);
        GraphRequest graphRequestCreateExtendAccessTokenRequest = companion.createExtendAccessTokenRequest(currentAccessToken, callback2);
        if (!kotlin.jvm.internal.t.a(currentAccessToken.getGraphDomain(), FacebookSdk.GAMING)) {
            GraphRequestBatch graphRequestBatch = new GraphRequestBatch(graphRequestCreateGrantedPermissionsRequest, graphRequestCreateExtendAccessTokenRequest);
            graphRequestBatch.addCallback(new GraphRequestBatch.Callback() { // from class: com.facebook.h
                @Override // com.facebook.GraphRequestBatch.Callback
                public final void onBatchCompleted(GraphRequestBatch graphRequestBatch2) {
                    AccessTokenManager.refreshCurrentAccessTokenImpl$lambda$7(runnable, graphRequestBatch2);
                }
            });
            graphRequestBatch.executeAsync();
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        GraphRequest.Callback callback3 = new GraphRequest.Callback() { // from class: com.facebook.f
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(GraphResponse graphResponse) {
                AccessTokenManager.refreshCurrentAccessTokenImpl$lambda$5(callback, atomicInteger, runnable, graphResponse);
            }
        };
        GraphRequest.Callback callback4 = new GraphRequest.Callback() { // from class: com.facebook.g
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(GraphResponse graphResponse) {
                AccessTokenManager.refreshCurrentAccessTokenImpl$lambda$6(callback2, atomicInteger, runnable, graphResponse);
            }
        };
        graphRequestCreateGrantedPermissionsRequest.setCallback(callback3);
        graphRequestCreateExtendAccessTokenRequest.setCallback(callback4);
        graphRequestCreateGrantedPermissionsRequest.executeAsync();
        graphRequestCreateExtendAccessTokenRequest.executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x009f, please report this as an issue */
    public static final void refreshCurrentAccessTokenImpl$lambda$2(AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set expiredPermissions, GraphResponse response) {
        JSONArray jSONArrayOptJSONArray;
        kotlin.jvm.internal.t.f(permissionsCallSucceeded, "$permissionsCallSucceeded");
        kotlin.jvm.internal.t.f(permissions, "$permissions");
        kotlin.jvm.internal.t.f(declinedPermissions, "$declinedPermissions");
        kotlin.jvm.internal.t.f(expiredPermissions, "$expiredPermissions");
        kotlin.jvm.internal.t.f(response, "response");
        JSONObject jsonObject = response.getJsonObject();
        if (jsonObject == null || (jSONArrayOptJSONArray = jsonObject.optJSONArray("data")) == null) {
            return;
        }
        permissionsCallSucceeded.set(true);
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("permission");
                String status = jSONObjectOptJSONObject.optString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS);
                if (!Utility.isNullOrEmpty(strOptString) && !Utility.isNullOrEmpty(status)) {
                    kotlin.jvm.internal.t.e(status, "status");
                    Locale US = Locale.US;
                    kotlin.jvm.internal.t.e(US, "US");
                    String status2 = status.toLowerCase(US);
                    kotlin.jvm.internal.t.e(status2, "this as java.lang.String).toLowerCase(locale)");
                    kotlin.jvm.internal.t.e(status2, "status");
                    int iHashCode = status2.hashCode();
                    if (iHashCode != -1309235419) {
                        if (iHashCode != 280295099) {
                            if (iHashCode == 568196142 && status2.equals("declined")) {
                                declinedPermissions.add(strOptString);
                            } else {
                                Log.w(TAG, "Unexpected status: " + status2);
                            }
                        } else if (status2.equals("granted")) {
                            permissions.add(strOptString);
                        } else {
                            Log.w(TAG, "Unexpected status: " + status2);
                        }
                    } else if (status2.equals("expired")) {
                        expiredPermissions.add(strOptString);
                    } else {
                        Log.w(TAG, "Unexpected status: " + status2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshCurrentAccessTokenImpl$lambda$4(RefreshResult refreshResult, AccessToken accessToken, AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback, AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set expiredPermissions, AccessTokenManager this$0) throws Throwable {
        boolean z10;
        AccessToken accessToken2;
        kotlin.jvm.internal.t.f(refreshResult, "$refreshResult");
        kotlin.jvm.internal.t.f(permissionsCallSucceeded, "$permissionsCallSucceeded");
        kotlin.jvm.internal.t.f(permissions, "$permissions");
        kotlin.jvm.internal.t.f(declinedPermissions, "$declinedPermissions");
        kotlin.jvm.internal.t.f(expiredPermissions, "$expiredPermissions");
        kotlin.jvm.internal.t.f(this$0, "this$0");
        String accessToken3 = refreshResult.getAccessToken();
        int expiresAt = refreshResult.getExpiresAt();
        Long dataAccessExpirationTime = refreshResult.getDataAccessExpirationTime();
        String graphDomain = refreshResult.getGraphDomain();
        try {
            Companion companion = Companion;
            try {
                if (companion.getInstance().getCurrentAccessToken() != null) {
                    AccessToken currentAccessToken = companion.getInstance().getCurrentAccessToken();
                    if ((currentAccessToken != null ? currentAccessToken.getUserId() : null) == accessToken.getUserId()) {
                        if (!permissionsCallSucceeded.get() && accessToken3 == null && expiresAt == 0) {
                            if (accessTokenRefreshCallback != null) {
                                accessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("Failed to refresh access token"));
                            }
                            this$0.tokenRefreshInProgress.set(false);
                            return;
                        }
                        Date expires = accessToken.getExpires();
                        if (refreshResult.getExpiresAt() != 0) {
                            expires = new Date(((long) refreshResult.getExpiresAt()) * 1000);
                        } else if (refreshResult.getExpiresIn() != 0) {
                            expires = new Date((((long) refreshResult.getExpiresIn()) * 1000) + new Date().getTime());
                        }
                        Date date = expires;
                        if (accessToken3 == null) {
                            accessToken3 = accessToken.getToken();
                        }
                        String str = accessToken3;
                        String applicationId = accessToken.getApplicationId();
                        String userId = accessToken.getUserId();
                        Set permissions2 = permissionsCallSucceeded.get() ? permissions : accessToken.getPermissions();
                        Set declinedPermissions2 = permissionsCallSucceeded.get() ? declinedPermissions : accessToken.getDeclinedPermissions();
                        Set expiredPermissions2 = permissionsCallSucceeded.get() ? expiredPermissions : accessToken.getExpiredPermissions();
                        AccessTokenSource source = accessToken.getSource();
                        Date date2 = new Date();
                        Date date3 = dataAccessExpirationTime != null ? new Date(dataAccessExpirationTime.longValue() * 1000) : accessToken.getDataAccessExpirationTime();
                        if (graphDomain == null) {
                            graphDomain = accessToken.getGraphDomain();
                        }
                        AccessToken accessToken4 = new AccessToken(str, applicationId, userId, permissions2, declinedPermissions2, expiredPermissions2, source, date, date2, date3, graphDomain);
                        try {
                            companion.getInstance().setCurrentAccessToken(accessToken4);
                            this$0.tokenRefreshInProgress.set(false);
                            if (accessTokenRefreshCallback != null) {
                                accessTokenRefreshCallback.OnTokenRefreshed(accessToken4);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            accessToken2 = accessToken4;
                            z10 = false;
                            this$0.tokenRefreshInProgress.set(z10);
                            if (accessTokenRefreshCallback != null && accessToken2 != null) {
                                accessTokenRefreshCallback.OnTokenRefreshed(accessToken2);
                            }
                            throw th;
                        }
                    }
                }
                if (accessTokenRefreshCallback != null) {
                    accessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("No current access token to refresh"));
                }
                this$0.tokenRefreshInProgress.set(false);
            } catch (Throwable th2) {
                th = th2;
                z10 = false;
                accessToken2 = null;
                this$0.tokenRefreshInProgress.set(z10);
                if (accessTokenRefreshCallback != null) {
                    accessTokenRefreshCallback.OnTokenRefreshed(accessToken2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshCurrentAccessTokenImpl$lambda$5(GraphRequest.Callback permissionsCallback, AtomicInteger completedCount, Runnable onAllCompleted, GraphResponse response) {
        kotlin.jvm.internal.t.f(permissionsCallback, "$permissionsCallback");
        kotlin.jvm.internal.t.f(completedCount, "$completedCount");
        kotlin.jvm.internal.t.f(onAllCompleted, "$onAllCompleted");
        kotlin.jvm.internal.t.f(response, "response");
        permissionsCallback.onCompleted(response);
        if (completedCount.incrementAndGet() == 2) {
            onAllCompleted.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshCurrentAccessTokenImpl$lambda$6(GraphRequest.Callback extendCallback, AtomicInteger completedCount, Runnable onAllCompleted, GraphResponse response) {
        kotlin.jvm.internal.t.f(extendCallback, "$extendCallback");
        kotlin.jvm.internal.t.f(completedCount, "$completedCount");
        kotlin.jvm.internal.t.f(onAllCompleted, "$onAllCompleted");
        kotlin.jvm.internal.t.f(response, "response");
        extendCallback.onCompleted(response);
        if (completedCount.incrementAndGet() == 2) {
            onAllCompleted.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshCurrentAccessTokenImpl$lambda$7(Runnable onAllCompleted, GraphRequestBatch it) {
        kotlin.jvm.internal.t.f(onAllCompleted, "$onAllCompleted");
        kotlin.jvm.internal.t.f(it, "it");
        onAllCompleted.run();
    }

    private final void sendCurrentAccessTokenChangedBroadcastIntent(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(FacebookSdk.getApplicationContext(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction(ACTION_CURRENT_ACCESS_TOKEN_CHANGED);
        intent.putExtra(EXTRA_OLD_ACCESS_TOKEN, accessToken);
        intent.putExtra(EXTRA_NEW_ACCESS_TOKEN, accessToken2);
        this.localBroadcastManager.d(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCurrentAccessToken$lambda$0() {
        AppEventQueue.flushAndWait(FlushReason.EAGER_FLUSHING_EVENT);
    }

    private final void setTokenExpirationBroadcastAlarm() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        AccessToken.Companion companion = AccessToken.Companion;
        AccessToken currentAccessToken = companion.getCurrentAccessToken();
        AlarmManager alarmManager = (AlarmManager) applicationContext.getSystemService("alarm");
        if (companion.isCurrentAccessTokenActive()) {
            if ((currentAccessToken != null ? currentAccessToken.getExpires() : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(applicationContext, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction(ACTION_CURRENT_ACCESS_TOKEN_CHANGED);
            try {
                alarmManager.set(1, currentAccessToken.getExpires().getTime(), PendingIntent.getBroadcast(applicationContext, 0, intent, 67108864));
            } catch (Exception unused) {
            }
        }
    }

    private final boolean shouldExtendAccessToken() {
        AccessToken currentAccessToken = getCurrentAccessToken();
        if (currentAccessToken == null) {
            return false;
        }
        long time = new Date().getTime();
        return currentAccessToken.getSource().canExtendToken() && time - this.lastAttemptedTokenExtendDate.getTime() > 3600000 && time - currentAccessToken.getLastRefresh().getTime() > SignalManager.TWENTY_FOUR_HOURS_MILLIS;
    }

    public final void currentAccessTokenChanged() {
        sendCurrentAccessTokenChangedBroadcastIntent(getCurrentAccessToken(), getCurrentAccessToken());
    }

    public final void extendAccessTokenIfNeeded() {
        if (shouldExtendAccessToken()) {
            refreshCurrentAccessToken(null);
        }
    }

    public final AccessToken getCurrentAccessToken() {
        return this.currentAccessTokenField;
    }

    public final boolean loadCurrentAccessToken() {
        AccessToken accessTokenLoad = this.accessTokenCache.load();
        if (accessTokenLoad == null) {
            return false;
        }
        setCurrentAccessToken(accessTokenLoad, false);
        return true;
    }

    public final void refreshCurrentAccessToken(final AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback) {
        if (kotlin.jvm.internal.t.a(Looper.getMainLooper(), Looper.myLooper())) {
            refreshCurrentAccessTokenImpl(accessTokenRefreshCallback);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.a
                @Override // java.lang.Runnable
                public final void run() {
                    AccessTokenManager.refreshCurrentAccessToken$lambda$1(this.f10942a, accessTokenRefreshCallback);
                }
            });
        }
    }

    public final void setCurrentAccessToken(AccessToken accessToken) {
        setCurrentAccessToken(accessToken, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshCurrentAccessTokenImpl$lambda$3(RefreshResult refreshResult, GraphResponse response) {
        kotlin.jvm.internal.t.f(refreshResult, "$refreshResult");
        kotlin.jvm.internal.t.f(response, "response");
        JSONObject jsonObject = response.getJsonObject();
        if (jsonObject == null) {
            return;
        }
        refreshResult.setAccessToken(jsonObject.optString("access_token"));
        refreshResult.setExpiresAt(jsonObject.optInt("expires_at"));
        refreshResult.setExpiresIn(jsonObject.optInt(WKirgUEJJ.sDAWkwDvousjx));
        refreshResult.setDataAccessExpirationTime(Long.valueOf(jsonObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
        refreshResult.setGraphDomain(jsonObject.optString("graph_domain", null));
    }

    private final void setCurrentAccessToken(AccessToken accessToken, boolean z10) {
        AccessToken accessToken2 = this.currentAccessTokenField;
        String userId = accessToken2 != null ? accessToken2.getUserId() : null;
        String userId2 = accessToken != null ? accessToken.getUserId() : null;
        if (userId != null && !kotlin.jvm.internal.t.a(userId, userId2)) {
            FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.b
                @Override // java.lang.Runnable
                public final void run() {
                    AccessTokenManager.setCurrentAccessToken$lambda$0();
                }
            });
        }
        this.currentAccessTokenField = accessToken;
        this.tokenRefreshInProgress.set(false);
        this.lastAttemptedTokenExtendDate = new Date(0L);
        if (z10) {
            if (accessToken != null) {
                this.accessTokenCache.save(accessToken);
            } else {
                this.accessTokenCache.clear();
                Utility.clearFacebookCookies(FacebookSdk.getApplicationContext());
            }
        }
        if (Utility.areObjectsEqual(accessToken2, accessToken)) {
            return;
        }
        sendCurrentAccessTokenChangedBroadcastIntent(accessToken2, accessToken);
        setTokenExpirationBroadcastAlarm();
    }
}
