package com.google.android.gms.internal.measurement;

import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzff extends zzadu implements zzafd {
    private static final zzff zzm;
    private static volatile zzafj zzn;
    private int zzb;
    private int zze;
    private String zzf = "";
    private zzaef zzg = zzadu.zzcy();
    private boolean zzh;
    private zzfl zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        zzff zzffVar = new zzff();
        zzm = zzffVar;
        zzadu.zzcs(zzff.class, zzffVar);
    }

    private zzff() {
    }

    public static zzfe zzn() {
        return (zzfe) zzm.zzcn();
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final List zzd() {
        return this.zzg;
    }

    public final int zze() {
        return this.zzg.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfh zzf(int i10) {
        return (zzfh) this.zzg.get(i10);
    }

    public final boolean zzh() {
        return (this.zzb & 8) != 0;
    }

    public final zzfl zzi() {
        zzfl zzflVar = this.zzi;
        return zzflVar == null ? zzfl.zzk() : zzflVar;
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final boolean zzk() {
        return this.zzk;
    }

    public final boolean zzl() {
        return (this.zzb & 64) != 0;
    }

    public final boolean zzm() {
        return this.zzl;
    }

    final /* synthetic */ void zzo(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    final /* synthetic */ void zzp(int i10, zzfh zzfhVar) {
        zzfhVar.getClass();
        zzaef zzaefVar = this.zzg;
        if (!zzaefVar.zza()) {
            this.zzg = zzadu.zzcz(zzaefVar);
        }
        this.zzg.set(i10, zzfhVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", yhXxbqGRMeI.ybLpW, "zzg", zzfh.class, "zzh", "zzi", "zzj", CwEo.xCBghTb, "zzl"});
        }
        if (i11 == 3) {
            return new zzff();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzfe(bArr);
        }
        if (i11 == 5) {
            return zzm;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzn;
        if (zzadqVar == null) {
            synchronized (zzff.class) {
                zzadqVar = zzn;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzm);
                    zzn = zzadqVar;
                }
            }
        }
        return zzadqVar;
    }
}
