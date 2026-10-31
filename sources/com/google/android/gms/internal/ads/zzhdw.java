package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhdw {
    private final List zza = new ArrayList();
    private final Map zzb = new HashMap();
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzhdu) it.next()).zzd(false);
        }
    }

    public final zzhdw zza(zzhdu zzhduVar) {
        if (zzhduVar.zzh() != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzhduVar.zzc()) {
            zzc();
        }
        zzhduVar.zzi(this);
        this.zza.add(zzhduVar);
        return this;
    }

    public final zzheb zzb() throws GeneralSecurityException {
        int i10;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c10 = 1;
        this.zzc = true;
        List<zzhdu> list = this.zza;
        ArrayList arrayList = new ArrayList(list.size());
        int i11 = 0;
        while (i11 < list.size() - 1) {
            int i12 = i11 + 1;
            if (((zzhdu) list.get(i11)).zzg() == zzhdv.zza && ((zzhdu) list.get(i12)).zzg() != zzhdv.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i11 = i12;
        }
        HashSet hashSet = new HashSet();
        byte[] bArr = null;
        Integer num = null;
        for (zzhdu zzhduVar : list) {
            zzhduVar.zze();
            if (zzhduVar.zzg() == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i13 = 3;
            if (zzhduVar.zzg() == zzhdv.zza) {
                i10 = 0;
                while (true) {
                    if (i10 != 0 && !hashSet.contains(Integer.valueOf(i10))) {
                        break;
                    }
                    int i14 = zzhnz.zza;
                    i10 = 0;
                    while (i10 == 0) {
                        byte[] bArrZza = zzhnp.zza(4);
                        i10 = (bArrZza[3] & 255) | ((bArrZza[0] & 255) << 24) | ((bArrZza[c10] & 255) << 16) | ((bArrZza[2] & 255) << 8);
                    }
                }
            } else {
                zzhduVar.zzg();
                i10 = 0;
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (hashSet.contains(numValueOf)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 31);
                sb2.append("Id ");
                sb2.append(i10);
                sb2.append(" is used twice in the keyset");
                throw new GeneralSecurityException(sb2.toString());
            }
            hashSet.add(numValueOf);
            zzhdq zzhdqVarZzc = zzhmi.zza().zzc(zzhduVar.zzf(), c10 != zzhduVar.zzf().zza() ? null : numValueOf);
            zzhds zzhdsVarZze = zzhduVar.zze();
            zzhds zzhdsVar = zzhds.zza;
            if (!zzhdsVar.equals(zzhdsVarZze)) {
                if (zzhds.zzb.equals(zzhdsVarZze)) {
                    i13 = 4;
                } else {
                    if (!zzhds.zzc.equals(zzhdsVarZze)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i13 = 5;
                }
            }
            zzhdz zzhdzVar = new zzhdz(zzhdqVarZzc, i13, i10, zzhduVar.zzc(), false, zzhdz.zza, null);
            if (zzhduVar.zzc()) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzhduVar.zze() != zzhdsVar) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzhdzVar);
            c10 = 1;
        }
        if (num != null) {
            return zzheb.zzi(new zzheb(arrayList, this.zzb, bArr));
        }
        throw new GeneralSecurityException("No primary was set");
    }
}
