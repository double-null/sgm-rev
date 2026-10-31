package com.google.android.ump;

import android.util.Log;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class ConsentRequestParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f11417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConsentDebugSettings f11419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f11420d;

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f11421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f11422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ConsentDebugSettings f11423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f11424d;

        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this, null);
        }

        public Builder setAdMobAppId(String str) {
            this.f11422b = str;
            return this;
        }

        public Builder setConsentDebugSettings(ConsentDebugSettings consentDebugSettings) {
            this.f11423c = consentDebugSettings;
            return this;
        }

        public Builder setConsentSyncId(String str) {
            if (str == null) {
                str = null;
            } else if (!str.matches("^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$")) {
                Log.e("UserMessagingPlatform", "The UMP SDK requires a valid consent sync ID matching the following regex: ^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$. See the setConsentSyncId() API documentation for more details.");
                return this;
            }
            this.f11424d = str;
            return this;
        }

        public Builder setTagForUnderAgeOfConsent(boolean z10) {
            this.f11421a = z10;
            return this;
        }
    }

    /* synthetic */ ConsentRequestParameters(Builder builder, zzb zzbVar) {
        this.f11417a = builder.f11421a;
        this.f11418b = builder.f11422b;
        this.f11419c = builder.f11423c;
        this.f11420d = builder.f11424d;
    }

    public ConsentDebugSettings getConsentDebugSettings() {
        return this.f11419c;
    }

    public String getConsentSyncId() {
        return this.f11420d;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.f11417a;
    }

    public final String zza() {
        return this.f11418b;
    }
}
