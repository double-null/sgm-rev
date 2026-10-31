package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzheb implements zzhec {
    private final List zza;
    private final Map zzb;
    private final zzheb zzc;

    private zzheb(List list, Map map, zzheb zzhebVar) {
        this.zza = list;
        this.zzb = map;
        this.zzc = zzhebVar;
    }

    static final zzheb zza(zzhsz zzhszVar) throws GeneralSecurityException {
        if (zzhszVar == null || zzhszVar.zzc() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzheb(zzj(zzhszVar), new HashMap());
    }

    public static final zzheb zzg(zzheh zzhehVar) throws GeneralSecurityException {
        zzhdw zzhdwVar = new zzhdw();
        zzhdu zzhduVar = new zzhdu(zzhehVar, null);
        zzhduVar.zzb();
        zzhduVar.zza();
        zzhdwVar.zza(zzhduVar);
        return zzhdwVar.zzb();
    }

    static /* synthetic */ zzheb zzi(final zzheb zzhebVar) {
        final zzhmc zzhmcVar = (zzhmc) zzhebVar.zzf(zzhmc.class);
        if (zzhmcVar == null) {
            return zzhebVar;
        }
        zzhdx zzhdxVar = new zzhdx() { // from class: com.google.android.gms.internal.ads.zzhea
            @Override // com.google.android.gms.internal.ads.zzhdx
            public final /* synthetic */ void zza(zzhdz zzhdzVar) {
                zzhmm.zza().zzb().zza(this.zza, zzhmcVar, "keyset_handle", "get_key");
            }
        };
        List<zzhdz> list = zzhebVar.zza;
        ArrayList arrayList = new ArrayList(list.size());
        for (zzhdz zzhdzVar : list) {
            arrayList.add(new zzhdz(zzhdzVar.zzf(), zzhdzVar.zzj(), zzhdzVar.zzg(), zzhdzVar.zzh(), zzhdzVar.zzi(), zzhdxVar, null));
        }
        return new zzheb(arrayList, zzhebVar.zzb, zzhebVar);
    }

    private static List zzj(zzhsz zzhszVar) throws GeneralSecurityException {
        zzhdq zzhlzVar;
        boolean z10;
        ArrayList arrayList = new ArrayList(zzhszVar.zzc());
        for (zzhsy zzhsyVar : zzhszVar.zzb()) {
            int iZzc = zzhsyVar.zzc();
            try {
                zzhnm zzhnmVarZzl = zzl(zzhsyVar);
                zzhmr zzhmrVarZza = zzhmr.zza();
                zzhel zzhelVarZza = zzhel.zza();
                zzhdq zzhlzVar2 = !zzhmrVarZza.zzf(zzhnmVarZzl) ? new zzhlz(zzhnmVarZzl, zzhelVarZza) : zzhmrVarZza.zzg(zzhnmVarZzl, zzhelVarZza);
                z10 = false;
                zzhlzVar = zzhlzVar2;
            } catch (GeneralSecurityException e10) {
                if (zzhkp.zza.zza()) {
                    throw e10;
                }
                zzhlzVar = new zzhlz(zzl(zzhsyVar), zzhel.zza());
                z10 = true;
            }
            if (zzhkp.zza.zza() && !zzm(zzhsyVar.zzk())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            arrayList.add(new zzhdz(zzhlzVar, zzhsyVar.zzk(), iZzc, iZzc == zzhszVar.zza(), z10, zzhdz.zza, null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final zzheb zzk() {
        zzheb zzhebVar = this.zzc;
        return zzhebVar == null ? this : zzhebVar;
    }

    private static zzhnm zzl(zzhsy zzhsyVar) throws GeneralSecurityException {
        return zzhnm.zza(zzhsyVar.zzb().zza(), zzhsyVar.zzb().zzb(), zzhsyVar.zzb().zzc(), zzhsyVar.zzd(), zzhsyVar.zzd() == zzhtm.RAW ? null : Integer.valueOf(zzhsyVar.zzc()));
    }

    private static boolean zzm(int i10) {
        int i11 = i10 - 2;
        return i11 == 1 || i11 == 2 || i11 == 3;
    }

    public final String toString() {
        zzhsz zzhszVarZzb = zzb();
        int i10 = zzheo.zza;
        zzhta zzhtaVarZza = zzhtd.zza();
        zzhtaVarZza.zza(zzhszVarZzb.zza());
        for (zzhsy zzhsyVar : zzhszVarZzb.zzb()) {
            zzhtb zzhtbVarZza = zzhtc.zza();
            zzhtbVarZza.zza(zzhsyVar.zzb().zza());
            zzhtbVarZza.zzd(zzhsyVar.zzk());
            zzhtbVarZza.zzc(zzhsyVar.zzd());
            zzhtbVarZza.zzb(zzhsyVar.zzc());
            zzhtaVarZza.zzb((zzhtc) zzhtbVarZza.zzbu());
        }
        return ((zzhtd) zzhtaVarZza.zzbu()).toString();
    }

    final zzhsz zzb() {
        try {
            zzhsw zzhswVarZzh = zzhsz.zzh();
            for (zzhdz zzhdzVar : this.zza) {
                zzhdq zzhdqVarZza = zzhdzVar.zza();
                int iZzj = zzhdzVar.zzj();
                int iZzc = zzhdzVar.zzc();
                zzhnm zzhnmVar = (zzhnm) zzhmr.zza().zzh(zzhdqVarZza, zzhnm.class, zzhel.zza());
                Integer numZzb = zzhdqVarZza.zzb();
                if (numZzb != null && numZzb.intValue() != iZzc) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zzhsx zzhsxVarZze = zzhsy.zze();
                zzhso zzhsoVarZzd = zzhsq.zzd();
                zzhsoVarZzd.zza(zzhnmVar.zzg());
                zzhsoVarZzd.zzb(zzhnmVar.zzb());
                zzhsoVarZzd.zzc(zzhnmVar.zzc());
                zzhsxVarZze.zzb(zzhsoVarZzd);
                zzhsxVarZze.zze(iZzj);
                zzhsxVarZze.zzc(iZzc);
                zzhsxVarZze.zzd(zzhnmVar.zzd());
                zzhswVarZzh.zzb((zzhsy) zzhsxVarZze.zzbu());
                if (zzhdzVar.zzd()) {
                    zzhswVarZzh.zza(zzhdzVar.zzc());
                }
            }
            return (zzhsz) zzhswVarZzh.zzbu();
        } catch (GeneralSecurityException e10) {
            throw new zzhny(e10);
        }
    }

    public final zzhdz zzc() {
        for (zzhdz zzhdzVar : this.zza) {
            if (zzhdzVar != null && zzhdzVar.zzd()) {
                if (zzhdzVar.zzb() == zzhds.zza) {
                    return zzhdzVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final int zzd() {
        return this.zza.size();
    }

    public final zzhdz zze(int i10) {
        if (i10 < 0 || i10 >= zzd()) {
            int iZzd = zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 34 + String.valueOf(iZzd).length());
            sb2.append("Invalid index ");
            sb2.append(i10);
            sb2.append(" for keyset of size ");
            sb2.append(iZzd);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        List list = this.zza;
        zzhdz zzhdzVar = (zzhdz) list.get(i10);
        if (!zzm(zzhdzVar.zzj())) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 42);
            sb3.append("Keyset-Entry at position ");
            sb3.append(i10);
            sb3.append(" has wrong status");
            throw new IllegalStateException(sb3.toString());
        }
        if (!zzhdzVar.zzi()) {
            return (zzhdz) list.get(i10);
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i10).length() + 48);
        sb4.append("Keyset-Entry at position ");
        sb4.append(i10);
        sb4.append(" didn't parse correctly");
        throw new IllegalStateException(sb4.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final zzhdj zzf(Class cls) {
        return (zzhdj) this.zzb.get(cls);
    }

    public final Object zzh(zzhdn zzhdnVar, Class cls) throws GeneralSecurityException {
        zzhsz zzhszVarZzb = zzk().zzb();
        int i10 = zzheo.zza;
        int iZza = zzhszVarZzb.zza();
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (zzhsy zzhsyVar : zzhszVarZzb.zzb()) {
            if (zzhsyVar.zzk() == 3) {
                if (!zzhsyVar.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzhsyVar.zzc())));
                }
                if (zzhsyVar.zzd() == zzhtm.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzhsyVar.zzc())));
                }
                if (zzhsyVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzhsyVar.zzc())));
                }
                if (zzhsyVar.zzc() == iZza) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                z11 &= zzhsyVar.zzb().zzc() == zzhsp.ASYMMETRIC_PUBLIC;
                i11++;
            }
        }
        if (i11 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i12 = 0; i12 < zzd(); i12++) {
            List list = this.zza;
            if (((zzhdz) list.get(i12)).zzi() || !zzm(((zzhdz) list.get(i12)).zzj())) {
                String strZza = zzhszVarZzb.zzd(i12).zzb().zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 44 + String.valueOf(strZza).length() + 32);
                sb2.append("Key parsing of key with index ");
                sb2.append(i12);
                sb2.append(" and type_url ");
                sb2.append(strZza);
                sb2.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb2.toString());
            }
        }
        return zzhdnVar.zza(zzk(), cls);
    }

    /* synthetic */ zzheb(List list, Map map, byte[] bArr) {
        this(list, map);
    }

    private zzheb(List list, Map map) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = map;
        if (zzhkp.zza.zza()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean zZzd = false;
            while (it.hasNext()) {
                zzhdz zzhdzVar = (zzhdz) it.next();
                if (!hashSet.contains(Integer.valueOf(zzhdzVar.zzc()))) {
                    hashSet.add(Integer.valueOf(zzhdzVar.zzc()));
                    zZzd |= zzhdzVar.zzd();
                } else {
                    int iZzc = zzhdzVar.zzc();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzc).length() + 121);
                    sb2.append("KeyID ");
                    sb2.append(iZzc);
                    sb2.append(" is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                    throw new GeneralSecurityException(sb2.toString());
                }
            }
            if (!zZzd) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }
}
