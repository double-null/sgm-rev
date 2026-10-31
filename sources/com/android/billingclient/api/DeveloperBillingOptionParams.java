package com.android.billingclient.api;

import android.net.Uri;
import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DeveloperBillingOptionParams {
    private final Uri zza;
    private final int zzb;
    private final int zzc;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    public static final class Builder {
        private Uri zza;
        private int zzb = 0;
        private int zzc = 0;

        private Builder() {
        }

        public DeveloperBillingOptionParams build() {
            int i10 = this.zzc;
            if (i10 == 0) {
                throw new IllegalArgumentException("Billing program is required.");
            }
            zzdi zzdiVar = null;
            if (i10 == 5 && this.zza != null && TextUtils.isEmpty(null)) {
                throw new IllegalArgumentException("External transaction token is required for side by side billing with an external link.");
            }
            Uri uri = this.zza;
            if (uri == null || uri.getScheme() != null) {
                return new DeveloperBillingOptionParams(this, zzdiVar);
            }
            throw new IllegalArgumentException("URI must have a scheme.");
        }

        public Builder setBillingProgram(int i10) {
            this.zzc = i10;
            return this;
        }

        public Builder setLaunchMode(int i10) {
            this.zzb = i10;
            return this;
        }

        public Builder setLinkUri(Uri uri) {
            this.zza = uri;
            return this;
        }

        /* synthetic */ Builder(zzdi zzdiVar) {
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface LaunchMode {
        public static final int CALLER_WILL_LAUNCH_LINK = 2;
        public static final int LAUNCH_IN_EXTERNAL_BROWSER_OR_APP = 1;
        public static final int LAUNCH_MODE_UNSPECIFIED = 0;
    }

    /* synthetic */ DeveloperBillingOptionParams(Builder builder, zzdi zzdiVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public int getBillingProgram() {
        return this.zzc;
    }

    public int getLaunchMode() {
        return this.zzb;
    }

    public Uri getLinkUri() {
        return this.zza;
    }
}
