package com.google.android.gms.internal.measurement;

import com.google.common.base.p;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmv implements Comparable {
    final long zza;
    final String zzb;
    final int zzc;
    final long zzd;
    final Object zze;
    private final RuntimeException zzf;

    zzmv(long j10, String str, int i10, long j11, Object obj) {
        p.d(((j10 > 0L ? 1 : (j10 == 0L ? 0 : -1)) == 0) == (str != null));
        this.zza = j10;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = j11;
        this.zze = obj;
        if (i10 != 5) {
            this.zzf = null;
            return;
        }
        if (obj == null) {
            this.zzf = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof zzacr)) {
            this.zzf = null;
        } else {
            this.zzf = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzmv zzmvVar = (zzmv) obj;
        long j10 = zzmvVar.zza;
        long j11 = this.zza;
        int iCompare = Long.compare(j11, j10);
        if (iCompare != 0) {
            return iCompare;
        }
        if (j11 != 0) {
            return 0;
        }
        return ((String) p.l(this.zzb)).compareTo((String) p.l(zzmvVar.zzb));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmv)) {
            return false;
        }
        zzmv zzmvVar = (zzmv) obj;
        return this.zza == zzmvVar.zza && Objects.equals(this.zzb, zzmvVar.zzb);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String strZza = zza();
        String strValueOf = String.valueOf(zzb());
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZza).length() + 1 + strValueOf.length());
        sb2.append(strZza);
        sb2.append(":");
        sb2.append(strValueOf);
        return sb2.toString();
    }

    public final String zza() {
        String str = this.zzb;
        return str != null ? str : Long.toString(this.zza);
    }

    public final Object zzb() {
        int i10 = this.zzc;
        if (i10 == 0) {
            return Boolean.FALSE;
        }
        if (i10 == 1) {
            return Boolean.TRUE;
        }
        if (i10 == 2) {
            return Long.valueOf(this.zzd);
        }
        if (i10 == 3) {
            return Double.valueOf(Double.longBitsToDouble(this.zzd));
        }
        if (i10 == 4) {
            Object obj = this.zze;
            p.l(obj);
            return obj;
        }
        if (i10 != 5) {
            throw new AssertionError("Impossible, this was validated when parsed or created");
        }
        Object obj2 = this.zze;
        p.l(obj2);
        try {
            return obj2 instanceof byte[] ? (byte[]) obj2 : ((zzacr) obj2).zzm();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.zzf;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }
}
