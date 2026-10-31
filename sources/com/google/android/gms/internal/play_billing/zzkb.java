package com.google.android.gms.internal.play_billing;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzkb extends zzgg implements zzhn {
    private static final zzkb zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        zzkb zzkbVar = new zzkb();
        zzb = zzkbVar;
        zzgg.zzB(zzkb.class, zzkbVar);
    }

    private zzkb() {
    }

    static /* synthetic */ void zzG(zzkb zzkbVar, long j10) {
        zzkbVar.zzd |= 512;
        zzkbVar.zzn = 912213584L;
    }

    static /* synthetic */ void zzH(zzkb zzkbVar, String str) {
        str.getClass();
        zzkbVar.zzd |= 4;
        zzkbVar.zzg = str;
    }

    static /* synthetic */ void zzI(zzkb zzkbVar, String str) {
        str.getClass();
        zzkbVar.zzd |= 1024;
        zzkbVar.zzo = str;
    }

    static /* synthetic */ void zzJ(zzkb zzkbVar, String str) {
        str.getClass();
        zzkbVar.zzd |= 8192;
        zzkbVar.zzr = str;
    }

    static /* synthetic */ void zzK(zzkb zzkbVar, String str) {
        str.getClass();
        zzkbVar.zzd |= 4096;
        zzkbVar.zzq = str;
    }

    static /* synthetic */ void zzL(zzkb zzkbVar, String str) {
        str.getClass();
        zzkbVar.zzd |= 2048;
        zzkbVar.zzp = str;
    }

    static /* synthetic */ void zzM(zzkb zzkbVar, int i10) {
        zzkbVar.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzkbVar.zzs = i10;
    }

    static /* synthetic */ void zzN(zzkb zzkbVar, boolean z10) {
        zzkbVar.zzd |= 64;
        zzkbVar.zzk = z10;
    }

    static /* synthetic */ void zzO(zzkb zzkbVar, String str) {
        str.getClass();
        zzkbVar.zzd |= 1;
        zzkbVar.zze = str;
    }

    static /* synthetic */ void zzP(zzkb zzkbVar, String str) {
        zzkbVar.zzd |= 2;
        zzkbVar.zzf = str;
    }

    public static zzjz zza() {
        return (zzjz) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzkb zzkbVar, int i10) {
        zzkbVar.zzd |= 128;
        zzkbVar.zzl = i10;
    }

    static /* synthetic */ void zze(zzkb zzkbVar, int i10) {
        zzkbVar.zzd |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        zzkbVar.zzm = i10;
    }

    static /* synthetic */ void zzf(zzkb zzkbVar, int i10) {
        zzkbVar.zzd |= 8;
        zzkbVar.zzh = i10;
    }

    static /* synthetic */ void zzg(zzkb zzkbVar, long j10) {
        zzkbVar.zzd |= 16;
        zzkbVar.zzi = j10;
    }

    static /* synthetic */ void zzh(zzkb zzkbVar, long j10) {
        zzkbVar.zzd |= 32;
        zzkbVar.zzj = j10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", WKirgUEJJ.unwr, "zzp", "zzq", "zzr", "zzs"});
        }
        if (i11 == 3) {
            return new zzkb();
        }
        zzka zzkaVar = null;
        if (i11 == 4) {
            return new zzjz(zzkaVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
