package com.google.android.ump;

import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zzct;
import com.google.android.gms.internal.consent_sdk.zzdb;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class ConsentDebugSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f11410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11411b;

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
    public static class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f11413b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f11415d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f11412a = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f11414c = 0;

        public Builder(Context context) {
            this.f11413b = context.getApplicationContext();
        }

        public Builder addTestDeviceHashedId(String str) {
            this.f11412a.add(str);
            return this;
        }

        public ConsentDebugSettings build() {
            boolean z10 = true;
            if (!zzdb.zza(true) && !this.f11412a.contains(zzct.zza(this.f11413b)) && !this.f11415d) {
                z10 = false;
            }
            return new ConsentDebugSettings(z10, this, null);
        }

        public Builder setDebugGeography(int i10) {
            this.f11414c = i10;
            return this;
        }

        public Builder setForceTesting(boolean z10) {
            this.f11415d = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;

        @Deprecated
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
        public static final int DEBUG_GEOGRAPHY_OTHER = 4;
        public static final int DEBUG_GEOGRAPHY_REGULATED_US_STATE = 3;
    }

    /* synthetic */ ConsentDebugSettings(boolean z10, Builder builder, zza zzaVar) {
        this.f11410a = z10;
        this.f11411b = builder.f11414c;
    }

    public int getDebugGeography() {
        return this.f11411b;
    }

    public boolean isTestDevice() {
        return this.f11410a;
    }
}
