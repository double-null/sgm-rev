package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzawh {
    public final zzavc zza;
    public final zzawd zzb;
    public final zzawa zzc;
    public final zzavv zzd;

    public zzawh(zzavc zzavcVar, zzawd zzawdVar, zzavv zzavvVar) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        this.zza = zzavcVar;
        this.zzb = zzawdVar;
        this.zzd = zzavvVar;
        this.zzc = new zzawa((i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)) ^ (i17 % 454333378));
    }

    public final Optional zza() {
        zzauw zzauwVar;
        try {
            ArrayDeque arrayDeque = this.zzc.zza;
            if (arrayDeque.isEmpty()) {
                throw new zzavz();
            }
            zzavx zzavxVar = (zzavx) arrayDeque.pop();
            long j10 = zzavxVar.zza;
            long j11 = zzavxVar.zzb;
            long j12 = zzavxVar.zzc;
            zzawd zzawdVar = this.zzb;
            if (zzawdVar.zzb < j11) {
                return Optional.of(zzauw.zzG);
            }
            this.zzd.zza(j10);
            if (j12 == 0) {
                while (zzawdVar.zzb > j11) {
                    zzawdVar.zzc();
                }
            }
            return Optional.empty();
        } catch (zzavt e10) {
            e = e10;
            throw new AssertionError(zzavo.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzavu e11) {
            e = e11;
            throw new AssertionError(zzavo.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzavz unused) {
            zzauwVar = zzauw.zzw;
            return Optional.of(zzauwVar);
        } catch (zzawb unused2) {
            zzauwVar = zzauw.zzG;
            return Optional.of(zzauwVar);
        }
    }
}
