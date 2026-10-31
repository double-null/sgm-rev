package com.google.android.gms.internal.measurement;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaas extends zzaag {
    public static final /* synthetic */ int zza = 0;
    private static final Set zzb;
    private static final zzzq zzc;
    private static final zzaaq zzd;
    private final String zze;
    private final Level zzf;
    private final Set zzg;
    private final zzzq zzh;
    private final int zzi;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzxx.zza, zzyw.zza, zzyx.zza)));
        zzb = setUnmodifiableSet;
        zzc = zzzt.zza(setUnmodifiableSet).zzc();
        zzd = new zzaaq(null);
    }

    /* synthetic */ zzaas(String str, String str2, boolean z10, int i10, Level level, Set set, zzzq zzzqVar, byte[] bArr) {
        super(str2);
        this.zze = zzaal.zza("", str2, true);
        this.zzi = 2;
        this.zzf = level;
        this.zzg = set;
        this.zzh = zzzqVar;
    }

    public static zzaaq zze() {
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    public static void zzi(zzzd zzzdVar, String str, int i10, Level level, Set set, zzzq zzzqVar) {
        StringBuilder sb2;
        String string;
        Boolean bool = (Boolean) zzzdVar.zzl().zzd(zzyx.zza);
        if (bool == null || !bool.booleanValue()) {
            zzaaa zzaaaVarZzh = zzaaa.zzh(zzaad.zzj(), zzzdVar.zzl());
            boolean z10 = zzzdVar.zze().intValue() < level.intValue();
            if (z10) {
                sb2 = new StringBuilder();
                if (zzze.zza(2, zzzdVar.zzg(), sb2)) {
                    sb2.append(" ");
                }
                if (z10) {
                    zzyy.zza(zzzdVar, sb2);
                    int i11 = zzaae.zza;
                    zzzc zzzcVar = new zzzc("[CONTEXT ", " ]", sb2);
                    zzaaaVarZzh.zza(zzzqVar, zzzcVar);
                    zzzcVar.zzb();
                } else {
                    zzyy.zza(zzzdVar, sb2);
                    int i12 = zzaae.zza;
                    zzzc zzzcVar2 = new zzzc("[CONTEXT ", " ]", sb2);
                    zzaaaVarZzh.zza(zzzqVar, zzzcVar2);
                    zzzcVar2.zzb();
                }
                string = sb2.toString();
            } else {
                int i13 = zzaae.zza;
                if (zzzdVar.zzh() == null && zzaaaVarZzh.zzb() <= set.size() && set.containsAll(zzaaaVarZzh.zzc())) {
                    string = zzzh.zza(zzzdVar.zzj());
                } else {
                    sb2 = new StringBuilder();
                    if (zzze.zza(2, zzzdVar.zzg(), sb2)) {
                        sb2.append(" ");
                    }
                    if (z10 || zzzdVar.zzh() == null) {
                        zzyy.zza(zzzdVar, sb2);
                        int i14 = zzaae.zza;
                        zzzc zzzcVar3 = new zzzc("[CONTEXT ", " ]", sb2);
                        zzaaaVarZzh.zza(zzzqVar, zzzcVar3);
                        zzzcVar3.zzb();
                    } else {
                        sb2.append("(REDACTED) ");
                        sb2.append(zzzdVar.zzh().zzb());
                    }
                    string = sb2.toString();
                }
            }
            Throwable th = (Throwable) zzzdVar.zzl().zzd(zzxx.zza);
            int iZzb = zzaal.zzb(zzzdVar.zze());
            if (iZzb == 2) {
                Log.v(str, string, th);
                return;
            }
            if (iZzb == 3) {
                Log.d(str, string, th);
                return;
            }
            if (iZzb == 4) {
                Log.i(str, string, th);
            } else if (iZzb != 5) {
                Log.e(str, string, th);
            } else {
                Log.w(str, string, th);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final boolean zzb(Level level) {
        String str = this.zze;
        int iZzb = zzaal.zzb(level);
        return Log.isLoggable(str, iZzb) || Log.isLoggable("all", iZzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final void zzc(zzzd zzzdVar) {
        zzi(zzzdVar, this.zze, 2, this.zzf, this.zzg, this.zzh);
    }
}
