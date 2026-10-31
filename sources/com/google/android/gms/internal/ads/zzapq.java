package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzapq implements zzarg {
    private final List zza;

    public zzapq(int i10, List list) {
        this.zza = list;
    }

    private final zzaqw zzc(zzarf zzarfVar) {
        return new zzaqw(zze(zzarfVar), "video/mp2t");
    }

    private final zzarl zzd(zzarf zzarfVar) {
        return new zzarl(zze(zzarfVar), "video/mp2t");
    }

    private final List zze(zzarf zzarfVar) {
        String str;
        int i10;
        List listSingletonList;
        zzet zzetVar = new zzet(zzarfVar.zze);
        List arrayList = this.zza;
        while (zzetVar.zzd() > 0) {
            int iZzs = zzetVar.zzs();
            int iZzg = zzetVar.zzg() + zzetVar.zzs();
            if (iZzs == 134) {
                arrayList = new ArrayList();
                int iZzs2 = zzetVar.zzs() & 31;
                for (int i11 = 0; i11 < iZzs2; i11++) {
                    String strZzK = zzetVar.zzK(3, StandardCharsets.UTF_8);
                    int iZzs3 = zzetVar.zzs();
                    boolean z10 = (iZzs3 & 128) != 0;
                    if (z10) {
                        i10 = iZzs3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bZzs = (byte) zzetVar.zzs();
                    zzetVar.zzk(1);
                    if (z10) {
                        int i12 = bZzs & 64;
                        int i13 = zzdq.zza;
                        listSingletonList = Collections.singletonList(i12 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    zzt zztVar = new zzt();
                    zztVar.zzo(str);
                    zztVar.zze(strZzK);
                    zztVar.zzL(i10);
                    zztVar.zzr(listSingletonList);
                    arrayList.add(zztVar.zzO());
                }
            }
            zzetVar.zzh(iZzg);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final SparseArray zza() {
        return new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final zzari zzb(int i10, zzarf zzarfVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new zzaqm(new zzaqf(zzarfVar.zzb, zzarfVar.zza(), "video/mp2t"));
            }
            if (i10 == 21) {
                return new zzaqm(new zzaqd("video/mp2t"));
            }
            if (i10 == 27) {
                return new zzaqm(new zzaqa(zzc(zzarfVar), false, false, "video/mp2t"));
            }
            if (i10 == 36) {
                return new zzaqm(new zzaqc(zzc(zzarfVar), "video/mp2t"));
            }
            if (i10 == 45) {
                return new zzaqm(new zzaqg("video/mp2t"));
            }
            if (i10 == 89) {
                return new zzaqm(new zzaps(zzarfVar.zzd, "video/mp2t"));
            }
            if (i10 == 172) {
                return new zzaqm(new zzapm(zzarfVar.zzb, zzarfVar.zza(), "video/mp2t"));
            }
            if (i10 == 257) {
                return new zzaqu(new zzaql("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i10 != 128) {
                if (i10 != 129) {
                    if (i10 != 138) {
                        if (i10 == 139) {
                            return new zzaqm(new zzapr(zzarfVar.zzb, zzarfVar.zza(), 5408, "video/mp2t"));
                        }
                        switch (i10) {
                            case 15:
                                return new zzaqm(new zzapp(false, zzarfVar.zzb, zzarfVar.zza(), "video/mp2t"));
                            case 16:
                                return new zzaqm(new zzapy(zzd(zzarfVar), "video/mp2t"));
                            case 17:
                                return new zzaqm(new zzaqe(zzarfVar.zzb, zzarfVar.zza(), "video/mp2t"));
                            default:
                                switch (i10) {
                                    case STORE_REGION_CODE_ERROR_VALUE:
                                        return new zzaqu(new zzaql("application/x-scte35", "video/mp2t"));
                                    case INVALID_CONFIG_RESPONSE_VALUE:
                                        break;
                                    case PRIVACY_URL_ERROR_VALUE:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                    }
                    return new zzaqm(new zzapr(zzarfVar.zzb, zzarfVar.zza(), 4096, "video/mp2t"));
                }
                return new zzaqm(new zzapj(zzarfVar.zzb, zzarfVar.zza(), "video/mp2t"));
            }
        }
        return new zzaqm(new zzapv(zzd(zzarfVar), "video/mp2t"));
    }

    public zzapq() {
        this(0);
    }

    public zzapq(int i10) {
        this.zza = zzgwm.zzi();
    }
}
