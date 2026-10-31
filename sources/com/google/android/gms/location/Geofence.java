package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public static final class Builder {
        private double zze;
        private double zzf;
        private float zzg;
        private String zza = null;
        private int zzb = 0;
        private long zzc = Long.MIN_VALUE;
        private short zzd = -1;
        private int zzh = 0;
        private int zzi = -1;

        public Geofence build() {
            String str = this.zza;
            if (str == null) {
                throw new IllegalArgumentException("Request ID not set.");
            }
            int i10 = this.zzb;
            if (i10 == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((i10 & 4) != 0 && this.zzi < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            }
            long j10 = this.zzc;
            if (j10 == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (this.zzd == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            int i11 = this.zzh;
            if (i11 >= 0) {
                return new com.google.android.gms.internal.location.zzbe(str, i10, (short) 1, this.zze, this.zzf, this.zzg, j10, i11, this.zzi);
            }
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        }

        public Builder setCircularRegion(double d10, double d11, float f10) {
            boolean z10 = d10 >= -90.0d && d10 <= 90.0d;
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("Invalid latitude: ");
            sb2.append(d10);
            Preconditions.checkArgument(z10, sb2.toString());
            boolean z11 = d11 >= -180.0d && d11 <= 180.0d;
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("Invalid longitude: ");
            sb3.append(d11);
            Preconditions.checkArgument(z11, sb3.toString());
            boolean z12 = f10 > 0.0f;
            StringBuilder sb4 = new StringBuilder(31);
            sb4.append("Invalid radius: ");
            sb4.append(f10);
            Preconditions.checkArgument(z12, sb4.toString());
            this.zzd = (short) 1;
            this.zze = d10;
            this.zzf = d11;
            this.zzg = f10;
            return this;
        }

        public Builder setExpirationDuration(long j10) {
            if (j10 < 0) {
                this.zzc = -1L;
            } else {
                this.zzc = DefaultClock.getInstance().elapsedRealtime() + j10;
            }
            return this;
        }

        public Builder setLoiteringDelay(int i10) {
            this.zzi = i10;
            return this;
        }

        public Builder setNotificationResponsiveness(int i10) {
            this.zzh = i10;
            return this;
        }

        public Builder setRequestId(String str) {
            this.zza = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        public Builder setTransitionTypes(int i10) {
            this.zzb = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public @interface GeofenceTransition {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public @interface TransitionTypes {
    }

    String getRequestId();
}
