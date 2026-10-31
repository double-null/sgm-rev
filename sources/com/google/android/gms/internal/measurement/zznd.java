package com.google.android.gms.internal.measurement;

import com.google.common.base.p;
import com.google.common.collect.v;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zznd {
    private static final zznd zza = new zznd(zzmw.zzb(), zzmq.zzi());
    private final zzmw zzb;
    private final zzmq zzc;

    private zznd(zzmw zzmwVar, zzmq zzmqVar) {
        this.zzb = (zzmw) p.l(zzmwVar);
        this.zzc = zzmqVar;
    }

    public static zznd zza() {
        return zza;
    }

    public static zznd zzb(zzacv zzacvVar, boolean z10) throws IOException {
        zzmw zzmwVar;
        int iZzr = zzacvVar.zzr();
        if (iZzr > 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzr).length() + 44);
            sb2.append("Unsupported version: ");
            sb2.append(iZzr);
            sb2.append(". Current version is: 1");
            throw new zzaeh(sb2.toString());
        }
        zzacvVar.zzr();
        int iZzD = zzacvVar.zzD(zzacvVar.zzp());
        zzmq zzmqVarZzh = zzmq.zzh(zzacvVar, zzadf.zza());
        zzacvVar.zzE(iZzD);
        zzmu zzmuVarZza = zzmu.zza();
        try {
            if (z10) {
                int iZzD2 = zzacvVar.zzD(zzacvVar.zzp());
                zzmwVar = (zzmw) zzmuVarZza.zzc(zzacvVar, zznb.zza);
                if (zzacvVar.zzF() != 0) {
                    throw new zzaeh("Unexpected bytes remaining after FlagsBlob parsing.");
                }
                zzacvVar.zzE(iZzD2);
            } else {
                zzmwVar = (zzmw) zzmuVarZza.zzb(zzacvVar.zzo(), zznc.zza);
            }
            zzmuVarZza.close();
            return new zznd(zzmwVar, zzmqVarZzh);
        } catch (Throwable th) {
            try {
                zzmuVarZza.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final zzmw zzc() {
        v vVarC;
        zzmq zzmqVar = this.zzc;
        if (zzmqVar.zze() <= 0) {
            return this.zzb;
        }
        zzmw zzmwVar = this.zzb;
        Collection<zzmi> collectionValues = zzmqVar.zzf().values();
        if (collectionValues == null) {
            vVarC = v.t();
        } else {
            v.a aVarB = v.b();
            for (zzmi zzmiVar : collectionValues) {
                int iZzq = zzmiVar.zzq();
                int i10 = iZzq - 1;
                if (iZzq == 0) {
                    throw null;
                }
                if (i10 == 0) {
                    aVarB.g(zzmiVar.zza(), Long.valueOf(zzmiVar.zzb()));
                } else if (i10 == 1) {
                    aVarB.g(zzmiVar.zza(), Boolean.valueOf(zzmiVar.zzc()));
                } else if (i10 == 2) {
                    aVarB.g(zzmiVar.zza(), Double.valueOf(zzmiVar.zzd()));
                } else if (i10 == 3) {
                    aVarB.g(zzmiVar.zza(), zzmiVar.zze());
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException("Could not serialize Flag for override: ".concat(String.valueOf(zzmiVar.zza())));
                    }
                    aVarB.g(zzmiVar.zza(), zzmiVar.zzf().zzm());
                }
            }
            vVarC = aVarB.c();
        }
        return zzmw.zza(zzmwVar, vVarC);
    }

    public final String zzd() {
        return this.zzc.zza();
    }

    public final String zze() {
        return this.zzc.zzc();
    }

    public final long zzf() {
        return this.zzc.zzd();
    }

    public final zzacr zzg() {
        return this.zzc.zzb();
    }

    public final Map zzh() {
        zzmq zzmqVar = this.zzc;
        if (zzmqVar.zze() == 0) {
            return null;
        }
        return zzmqVar.zzf();
    }

    public final boolean zzi() {
        if (this.zzb.zze().isEmpty()) {
            return zzmq.zzi().equals(this.zzc);
        }
        return false;
    }
}
