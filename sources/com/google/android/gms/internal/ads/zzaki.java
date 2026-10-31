package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaki {
    private final zzet zza = new zzet(8);
    private int zzb;

    private final long zzb(zzafz zzafzVar) throws IOException {
        int i10;
        zzet zzetVar = this.zza;
        zzafp zzafpVar = (zzafp) zzafzVar;
        int i11 = 0;
        zzafpVar.zzh(zzetVar.zzi(), 0, 1, false);
        int i12 = zzetVar.zzi()[0] & 255;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int i13 = 128;
        int i14 = 0;
        while (true) {
            i10 = i14 + 1;
            if ((i12 & i13) != 0) {
                break;
            }
            i13 >>= 1;
            i14 = i10;
        }
        int i15 = i12 & (~i13);
        zzafpVar.zzh(zzetVar.zzi(), 1, i14, false);
        while (i11 < i14) {
            i11++;
            i15 = (zzetVar.zzi()[i11] & 255) + (i15 << 8);
        }
        this.zzb += i10;
        return i15;
    }

    public final boolean zza(zzafz zzafzVar) throws IOException {
        long jZzo = zzafzVar.zzo();
        long j10 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (jZzo != -1 && jZzo <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j10 = jZzo;
        }
        zzet zzetVar = this.zza;
        zzafp zzafpVar = (zzafp) zzafzVar;
        zzafpVar.zzh(zzetVar.zzi(), 0, 4, false);
        this.zzb = 4;
        for (long jZzz = zzetVar.zzz(); jZzz != 440786851; jZzz = ((jZzz << 8) & (-256)) | ((long) (zzetVar.zzi()[0] & 255))) {
            int i10 = (int) j10;
            int i11 = this.zzb + 1;
            this.zzb = i11;
            if (i11 == i10) {
                return false;
            }
            zzafpVar.zzh(zzetVar.zzi(), 0, 1, false);
        }
        long jZzb = zzb(zzafzVar);
        long j11 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j12 = j11 + jZzb;
            if (jZzo == -1 || j12 < jZzo) {
                while (true) {
                    long j13 = this.zzb;
                    if (j13 < j12) {
                        if (zzb(zzafzVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzafzVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i12 = (int) jZzb2;
                            zzafpVar.zzj(i12, false);
                            this.zzb += i12;
                        }
                    } else if (j13 == j12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
