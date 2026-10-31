package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzejk implements zzhbt {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzejl zzb;

    zzejk(zzejl zzejlVar, boolean z10) {
        this.zza = z10;
        Objects.requireNonNull(zzejlVar);
        this.zzb = zzejlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<String> listEmptyList;
        List listAsList;
        final ArrayList arrayList;
        byte b10;
        zzbhv.zzd.zza zzaVar;
        zzejl zzejlVar = this.zzb;
        Bundle bundle = (Bundle) obj;
        if (zzejlVar.zzf()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (!(obj2 instanceof List)) {
            if (obj2 instanceof String[]) {
                listAsList = Arrays.asList((String[]) obj2);
            } else {
                listEmptyList = Collections.emptyList();
            }
            arrayList = new ArrayList();
            for (String str : listEmptyList) {
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            b10 = 0;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            b10 = 2;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case -239580146:
                        if (str.equals(Constants.PLACEMENT_TYPE_REWARDED)) {
                            b10 = 3;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 604727084:
                        if (str.equals(RHIpdOnfgiYkEj.Tne)) {
                            b10 = 1;
                        } else {
                            b10 = -1;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                if (b10 != 0) {
                    zzaVar = zzbhv.zzd.zza.BANNER;
                } else if (b10 != 1) {
                    zzaVar = zzbhv.zzd.zza.INTERSTITIAL;
                } else if (b10 != 2) {
                    zzaVar = zzbhv.zzd.zza.NATIVE_APP_INSTALL;
                } else if (b10 != 3) {
                    zzaVar = zzbhv.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                } else {
                    zzaVar = zzbhv.zzd.zza.REWARD_BASED_VIDEO_AD;
                }
                arrayList.add(zzaVar);
            }
            final zzbhv.zzaf.zzd zzdVarZze = zzejl.zze(bundle);
            final zzbhv.zzab zzabVarZzb = zzejlVar.zzb(bundle);
            final boolean z10 = this.zza;
            zzejlVar.zza.zza(new zzfok() { // from class: com.google.android.gms.internal.ads.zzejj
                @Override // com.google.android.gms.internal.ads.zzfok
                public final /* synthetic */ Object zza(Object obj3) {
                    zzejl zzejlVar2 = this.zza.zzb;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    if (zzejlVar2.zzf()) {
                        return null;
                    }
                    zzbhv.zzaf.zzd zzdVar = zzdVarZze;
                    zzbhv.zzab zzabVar = zzabVarZzb;
                    ArrayList arrayList2 = arrayList;
                    boolean z11 = z10;
                    byte[] bArrZzc = zzejlVar2.zzc(z11, arrayList2, zzabVar, zzdVar);
                    zzejo.zzf(sQLiteDatabase, z11, true);
                    zzejo.zze(sQLiteDatabase, zzejlVar2.zzd().zzb(), bArrZzc);
                    return null;
                }
            });
        }
        listAsList = (List) obj2;
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listEmptyList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        while (r1.hasNext()) {
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -239580146:
                    if (str.equals(Constants.PLACEMENT_TYPE_REWARDED)) {
                        b10 = 3;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 604727084:
                    if (str.equals(RHIpdOnfgiYkEj.Tne)) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 != 0) {
                zzaVar = zzbhv.zzd.zza.BANNER;
            } else if (b10 != 1) {
                zzaVar = zzbhv.zzd.zza.INTERSTITIAL;
            } else if (b10 != 2) {
                zzaVar = zzbhv.zzd.zza.NATIVE_APP_INSTALL;
            } else if (b10 != 3) {
                zzaVar = zzbhv.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
            } else {
                zzaVar = zzbhv.zzd.zza.REWARD_BASED_VIDEO_AD;
            }
            arrayList.add(zzaVar);
        }
        final zzbhv.zzaf.zzd zzdVarZze2 = zzejl.zze(bundle);
        final zzbhv.zzab zzabVarZzb2 = zzejlVar.zzb(bundle);
        final boolean z11 = this.zza;
        zzejlVar.zza.zza(new zzfok() { // from class: com.google.android.gms.internal.ads.zzejj
            @Override // com.google.android.gms.internal.ads.zzfok
            public final /* synthetic */ Object zza(Object obj4) {
                zzejl zzejlVar2 = this.zza.zzb;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj4;
                if (zzejlVar2.zzf()) {
                    return null;
                }
                zzbhv.zzaf.zzd zzdVar = zzdVarZze2;
                zzbhv.zzab zzabVar = zzabVarZzb2;
                ArrayList arrayList3 = arrayList;
                boolean z12 = z11;
                byte[] bArrZzc = zzejlVar2.zzc(z12, arrayList3, zzabVar, zzdVar);
                zzejo.zzf(sQLiteDatabase, z12, true);
                zzejo.zze(sQLiteDatabase, zzejlVar2.zzd().zzb(), bArrZzc);
                return null;
            }
        });
    }
}
