package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzarb implements zzaqt {
    final /* synthetic */ zzard zza;
    private final zzes zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzarb(zzard zzardVar, int i10) {
        Objects.requireNonNull(zzardVar);
        this.zza = zzardVar;
        this.zzb = new zzes(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i10;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00eb  */
    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzb(zzet zzetVar) {
        zzfi zzfiVar;
        int i10;
        int i11;
        if (zzetVar.zzs() == 2) {
            zzard zzardVar = this.zza;
            zzfi zzfiVar2 = (zzfi) zzardVar.zzh().get(0);
            if ((zzetVar.zzs() & 128) != 0) {
                zzetVar.zzk(1);
                int iZzt = zzetVar.zzt();
                int i12 = 3;
                zzetVar.zzk(3);
                zzes zzesVar = this.zzb;
                zzetVar.zzl(zzesVar, 2);
                zzesVar.zzh(3);
                int i13 = 13;
                zzardVar.zzq(zzesVar.zzj(13));
                zzetVar.zzl(zzesVar, 2);
                int i14 = 4;
                zzesVar.zzh(4);
                int i15 = 12;
                zzetVar.zzk(zzesVar.zzj(12));
                SparseArray sparseArray = this.zzc;
                sparseArray.clear();
                SparseIntArray sparseIntArray = this.zzd;
                sparseIntArray.clear();
                int iZzd = zzetVar.zzd();
                while (iZzd > 0) {
                    int i16 = 5;
                    zzetVar.zzl(zzesVar, 5);
                    int iZzj = zzesVar.zzj(8);
                    zzesVar.zzh(i12);
                    int iZzj2 = zzesVar.zzj(i13);
                    zzesVar.zzh(i14);
                    int iZzj3 = zzesVar.zzj(i15);
                    int iZzg = zzetVar.zzg();
                    int i17 = iZzg + iZzj3;
                    String str = null;
                    ArrayList arrayList = null;
                    int i18 = -1;
                    int iZzs = 0;
                    while (zzetVar.zzg() < i17) {
                        int iZzs2 = zzetVar.zzs();
                        int iZzg2 = zzetVar.zzg() + zzetVar.zzs();
                        if (iZzg2 > i17) {
                            break;
                        }
                        if (iZzs2 == i16) {
                            long jZzz = zzetVar.zzz();
                            if (jZzz == 1094921523) {
                                i18 = 129;
                            } else if (jZzz == 1161904947) {
                                i18 = 135;
                            } else if (jZzz == 1094921524) {
                                i18 = 172;
                            } else if (jZzz == 1212503619) {
                                i11 = 36;
                                i18 = i11;
                            }
                        } else if (iZzs2 == 106) {
                            i18 = 129;
                        } else if (iZzs2 == 122) {
                            i18 = 135;
                        } else if (iZzs2 == 127) {
                            int iZzs3 = zzetVar.zzs();
                            if (iZzs3 == 21) {
                                i18 = 172;
                            } else {
                                if (iZzs3 == 14) {
                                    i11 = Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                                } else if (iZzs3 == 33) {
                                    i11 = 139;
                                }
                                i18 = i11;
                            }
                        } else if (iZzs2 == 123) {
                            i11 = Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE;
                            i18 = i11;
                        } else if (iZzs2 == 10) {
                            String strTrim = zzetVar.zzK(3, StandardCharsets.UTF_8).trim();
                            iZzs = zzetVar.zzs();
                            str = strTrim;
                        } else if (iZzs2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (zzetVar.zzg() < iZzg2) {
                                zzes zzesVar2 = zzesVar;
                                String strTrim2 = zzetVar.zzK(3, StandardCharsets.UTF_8).trim();
                                int iZzs4 = zzetVar.zzs();
                                zzfi zzfiVar3 = zzfiVar2;
                                byte[] bArr = new byte[4];
                                zzetVar.zzm(bArr, 0, 4);
                                arrayList2.add(new zzare(strTrim2, iZzs4, bArr));
                                zzfiVar2 = zzfiVar3;
                                zzesVar = zzesVar2;
                                iZzt = iZzt;
                            }
                            zzfiVar2 = zzfiVar2;
                            iZzt = iZzt;
                            zzesVar = zzesVar;
                            arrayList = arrayList2;
                            i18 = 89;
                        } else {
                            zzfiVar2 = zzfiVar2;
                            iZzt = iZzt;
                            zzesVar = zzesVar;
                            if (iZzs2 == 111) {
                                i18 = 257;
                            }
                        }
                        zzetVar.zzk(iZzg2 - zzetVar.zzg());
                        zzfiVar2 = zzfiVar2;
                        zzesVar = zzesVar;
                        iZzt = iZzt;
                        i16 = 5;
                    }
                    zzfi zzfiVar4 = zzfiVar2;
                    int i19 = iZzt;
                    zzes zzesVar3 = zzesVar;
                    zzetVar.zzh(i17);
                    zzarf zzarfVar = new zzarf(i18, str, iZzs, arrayList, Arrays.copyOfRange(zzetVar.zzi(), iZzg, i17));
                    if (iZzj == 6 || iZzj == 5) {
                        iZzj = zzarfVar.zza;
                    }
                    iZzd -= iZzj3 + 5;
                    if (!zzardVar.zzk().get(iZzj2)) {
                        zzari zzariVarZzb = zzardVar.zzi().zzb(iZzj, zzarfVar);
                        sparseIntArray.put(iZzj2, iZzj2);
                        sparseArray.put(iZzj2, zzariVarZzb);
                    }
                    i14 = 4;
                    zzfiVar2 = zzfiVar4;
                    zzesVar = zzesVar3;
                    iZzt = i19;
                    i12 = 3;
                    i13 = 13;
                    i15 = 12;
                }
                zzfi zzfiVar5 = zzfiVar2;
                int i20 = iZzt;
                int size = sparseIntArray.size();
                int i21 = 0;
                while (i21 < size) {
                    int iKeyAt = sparseIntArray.keyAt(i21);
                    int iValueAt = sparseIntArray.valueAt(i21);
                    zzardVar.zzk().put(iKeyAt, true);
                    zzardVar.zzl().put(iValueAt, true);
                    zzari zzariVar = (zzari) sparseArray.valueAt(i21);
                    if (zzariVar != null) {
                        i10 = i20;
                        zzfiVar = zzfiVar5;
                        zzariVar.zza(zzfiVar, zzardVar.zzm(), new zzarh(i10, iKeyAt, 8192));
                        zzardVar.zzj().put(iValueAt, zzariVar);
                    } else {
                        zzfiVar = zzfiVar5;
                        i10 = i20;
                    }
                    i21++;
                    zzfiVar5 = zzfiVar;
                    i20 = i10;
                }
                zzardVar.zzj().remove(this.zze);
                zzardVar.zzo(0);
                if (zzardVar.zzn() == 0) {
                    zzardVar.zzm().zzv();
                    zzardVar.zzp(true);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zza(zzfi zzfiVar, zzagb zzagbVar, zzarh zzarhVar) {
    }
}
