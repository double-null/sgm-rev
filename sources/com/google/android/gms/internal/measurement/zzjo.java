package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjo extends AbstractSafeParcelable implements Comparable<zzjo> {
    public static final Parcelable.Creator<zzjo> CREATOR = new zzjp();
    public final String zza;
    final long zzb;
    final boolean zzc;
    final double zzd;
    final String zze;
    final byte[] zzf;
    public final int zzg;
    public final int zzh;
    private final int zzi;

    zzjo(String str, long j10, boolean z10, double d10, String str2, byte[] bArr, int i10, int i11, int i12) {
        this.zza = str;
        this.zzb = j10;
        this.zzc = z10;
        this.zzd = d10;
        this.zze = str2;
        this.zzf = bArr;
        this.zzg = i10;
        this.zzh = i11;
        this.zzi = i12;
    }

    private static int zzg(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 != i11 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0096, code lost:
    
        if (r0 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a3, code lost:
    
        if (r4 == r6) goto L45;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ int compareTo(com.google.android.gms.internal.measurement.zzjo r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.measurement.zzjo r9 = (com.google.android.gms.internal.measurement.zzjo) r9
            java.lang.String r0 = r9.zza
            java.lang.String r1 = r8.zza
            int r0 = r1.compareTo(r0)
            if (r0 == 0) goto Le
            goto La7
        Le:
            int r0 = r8.zzg
            int r1 = r9.zzg
            int r1 = zzg(r0, r1)
            if (r1 == 0) goto L1b
        L18:
            r0 = r1
            goto La7
        L1b:
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L99
            r4 = 2
            if (r0 == r4) goto L8e
            r4 = 3
            if (r0 == r4) goto L85
            r4 = 4
            if (r0 == r4) goto L73
            r4 = 5
            if (r0 != r4) goto L52
            byte[] r0 = r8.zzf
            byte[] r9 = r9.zzf
            if (r0 != r9) goto L33
            goto L79
        L33:
            if (r0 != 0) goto L36
            goto L18
        L36:
            if (r9 != 0) goto L3a
            goto La6
        L3a:
            int r1 = r9.length
            int r3 = r0.length
            int r4 = java.lang.Math.min(r3, r1)
            if (r2 >= r4) goto L4d
            r1 = r0[r2]
            r3 = r9[r2]
            int r1 = r1 - r3
            if (r1 == 0) goto L4a
            goto L18
        L4a:
            int r2 = r2 + 1
            goto L3a
        L4d:
            int r0 = zzg(r3, r1)
            goto La7
        L52:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 20
            r2.<init>(r1)
            java.lang.String r1 = "Invalid enum value: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r9.<init>(r0)
            throw r9
        L73:
            java.lang.String r0 = r8.zze
            java.lang.String r9 = r9.zze
            if (r0 != r9) goto L7a
        L79:
            goto L94
        L7a:
            if (r0 != 0) goto L7d
            goto L18
        L7d:
            if (r9 != 0) goto L80
            goto L98
        L80:
            int r0 = r0.compareTo(r9)
            goto La7
        L85:
            double r0 = r8.zzd
            double r2 = r9.zzd
            int r0 = java.lang.Double.compare(r0, r2)
            goto La7
        L8e:
            boolean r0 = r8.zzc
            boolean r9 = r9.zzc
            if (r0 != r9) goto L96
        L94:
            r0 = r2
            goto La7
        L96:
            if (r0 == 0) goto L18
        L98:
            goto La6
        L99:
            long r4 = r8.zzb
            long r6 = r9.zzb
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto La3
            goto L18
        La3:
            if (r9 != 0) goto La6
            goto L79
        La6:
            r0 = r3
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjo.compareTo(java.lang.Object):int");
    }

    public final boolean equals(Object obj) {
        int i10;
        if (obj instanceof zzjo) {
            zzjo zzjoVar = (zzjo) obj;
            if (zzkl.zza(this.zza, zzjoVar.zza) && (i10 = this.zzg) == zzjoVar.zzg && this.zzh == zzjoVar.zzh && this.zzi == zzjoVar.zzi) {
                if (i10 == 1) {
                    return this.zzb == zzjoVar.zzb;
                }
                if (i10 == 2) {
                    return this.zzc == zzjoVar.zzc;
                }
                if (i10 == 3) {
                    return this.zzd == zzjoVar.zzd;
                }
                if (i10 == 4) {
                    return zzkl.zza(this.zze, zzjoVar.zze);
                }
                if (i10 == 5) {
                    return Arrays.equals(this.zzf, zzjoVar.zzf);
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
                sb2.append("Invalid enum value: ");
                sb2.append(i10);
                throw new AssertionError(sb2.toString());
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        zzf(sb2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        boolean zZzb = zzjp.zzb(str);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        if (!zZzb) {
            SafeParcelWriter.writeString(parcel, 2, str, false);
        }
        long j10 = this.zzb;
        if (j10 != 0) {
            SafeParcelWriter.writeLong(parcel, 3, j10);
        }
        if (this.zzc) {
            SafeParcelWriter.writeBoolean(parcel, 4, true);
        }
        double d10 = this.zzd;
        if (d10 != 0.0d) {
            SafeParcelWriter.writeDouble(parcel, 5, d10);
        }
        String str2 = this.zze;
        if (!zzjp.zzb(str2)) {
            SafeParcelWriter.writeString(parcel, 6, str2, false);
        }
        byte[] bArr = this.zzf;
        if (!zzjp.zzb(bArr)) {
            SafeParcelWriter.writeByteArray(parcel, 7, bArr, false);
        }
        int i11 = this.zzg;
        if (!zzjp.zza(i11)) {
            SafeParcelWriter.writeInt(parcel, 8, i11);
        }
        int i12 = this.zzh;
        if (!zzjp.zza(i12)) {
            SafeParcelWriter.writeInt(parcel, 9, i12);
        }
        int i13 = this.zzi;
        if (!zzjp.zza(i13)) {
            SafeParcelWriter.writeInt(parcel, 10, i13);
        }
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final long zza() {
        if (this.zzg == 1) {
            return this.zzb;
        }
        throw new IllegalArgumentException("Not a long type");
    }

    public final boolean zzb() {
        if (this.zzg == 2) {
            return this.zzc;
        }
        throw new IllegalArgumentException("Not a boolean type");
    }

    public final double zzc() {
        if (this.zzg == 3) {
            return this.zzd;
        }
        throw new IllegalArgumentException("Not a double type");
    }

    public final String zzd() {
        if (this.zzg == 4) {
            return (String) Preconditions.checkNotNull(this.zze);
        }
        throw new IllegalArgumentException("Not a String type");
    }

    public final byte[] zze() {
        if (this.zzg == 5) {
            return (byte[]) Preconditions.checkNotNull(this.zzf);
        }
        throw new IllegalArgumentException("Not a bytes type");
    }

    final void zzf(StringBuilder sb2) {
        sb2.append("Flag(");
        String str = this.zza;
        sb2.append(str);
        sb2.append(", ");
        int i10 = this.zzg;
        if (i10 == 1) {
            sb2.append(this.zzb);
        } else if (i10 == 2) {
            sb2.append(this.zzc);
        } else if (i10 == 3) {
            sb2.append(this.zzd);
        } else if (i10 == 4) {
            sb2.append("'");
            sb2.append((String) Preconditions.checkNotNull(this.zze));
            sb2.append("'");
        } else {
            if (i10 != 5) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i10).length());
                sb3.append("Invalid type: ");
                sb3.append(str);
                sb3.append(", ");
                sb3.append(i10);
                throw new AssertionError(sb3.toString());
            }
            sb2.append("'");
            sb2.append(Base64.encodeToString((byte[]) Preconditions.checkNotNull(this.zzf), 3));
            sb2.append("'");
        }
        sb2.append(", ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(this.zzh);
        sb2.append(", ");
        sb2.append(this.zzi);
        sb2.append(")");
    }
}
