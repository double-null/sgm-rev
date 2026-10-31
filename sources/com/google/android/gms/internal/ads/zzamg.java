package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzamg {
    private static final zzgty zza = zzgty.zza(zzgsx.zzc(':'));
    private static final zzgty zzb = zzgty.zza(zzgsx.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zza() {
        this.zzc.clear();
        this.zzd = 0;
    }

    public final int zzb(zzafz zzafzVar, zzagy zzagyVar, List list) throws IOException {
        byte b10;
        char c10;
        int i10 = this.zzd;
        if (i10 == 0) {
            long jZzo = zzafzVar.zzo();
            zzagyVar.zza = (jZzo == -1 || jZzo < 8) ? 0L : jZzo - 8;
            this.zzd = 1;
            return 1;
        }
        int i11 = 2;
        if (i10 != 1) {
            char c11 = 2819;
            short s10 = 2817;
            short s11 = 2816;
            short s12 = 2192;
            if (i10 != 2) {
                long jZzn = zzafzVar.zzn();
                int iZzo = (int) ((zzafzVar.zzo() - zzafzVar.zzn()) - ((long) this.zze));
                zzet zzetVar = new zzet(iZzo);
                zzafzVar.zzc(zzetVar.zzi(), 0, iZzo);
                int i12 = 0;
                while (true) {
                    List list2 = this.zzc;
                    if (i12 >= list2.size()) {
                        zzagyVar.zza = 0L;
                        return 1;
                    }
                    zzamf zzamfVar = (zzamf) list2.get(i12);
                    zzetVar.zzh((int) (zzamfVar.zza - jZzn));
                    zzetVar.zzk(4);
                    int iZzC = zzetVar.zzC();
                    switch (zzetVar.zzK(iZzC, StandardCharsets.UTF_8)) {
                        case "SlowMotion_Data":
                            b10 = 0;
                            break;
                        case "Super_SlowMotion_Edit_Data":
                            b10 = 3;
                            break;
                        case "Super_SlowMotion_Data":
                            b10 = 1;
                            break;
                        case "Super_SlowMotion_Deflickering_On":
                            b10 = 4;
                            break;
                        case "Super_SlowMotion_BGM":
                            b10 = 2;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 0) {
                        c10 = 2192;
                    } else if (b10 == 1) {
                        c10 = 2816;
                    } else if (b10 == 2) {
                        c10 = 2817;
                    } else if (b10 == 3) {
                        c10 = c11;
                    } else {
                        if (b10 != 4) {
                            throw zzat.zzb("Invalid SEF name", null);
                        }
                        c10 = 2820;
                    }
                    int i13 = zzamfVar.zzb - (iZzC + 8);
                    if (c10 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List listZze = zzb.zze(zzetVar.zzK(i13, StandardCharsets.UTF_8));
                        for (int i14 = 0; i14 < listZze.size(); i14++) {
                            List listZze2 = zza.zze((CharSequence) listZze.get(i14));
                            if (listZze2.size() != 3) {
                                throw zzat.zzb(null, null);
                            }
                            try {
                                arrayList.add(new zzajv(Long.parseLong((String) listZze2.get(0)), Long.parseLong((String) listZze2.get(1)), 1 << (Integer.parseInt((String) listZze2.get(2)) - 1)));
                            } catch (NumberFormatException e10) {
                                throw zzat.zzb(null, e10);
                            }
                        }
                        list.add(new zzajw(arrayList));
                    } else if (c10 != 2816 && c10 != 2817 && c10 != c11 && c10 != 2820) {
                        throw new IllegalStateException();
                    }
                    i12++;
                    c11 = 2819;
                }
            } else {
                long jZzo2 = zzafzVar.zzo();
                int i15 = this.zze - 20;
                zzet zzetVar2 = new zzet(i15);
                zzafzVar.zzc(zzetVar2.zzi(), 0, i15);
                int i16 = 0;
                while (i16 < i15 / 12) {
                    zzetVar2.zzk(i11);
                    short sZzw = zzetVar2.zzw();
                    if (sZzw == s12 || sZzw == s11 || sZzw == s10 || sZzw == 2819 || sZzw == 2820) {
                        this.zzc.add(new zzamf(sZzw, (jZzo2 - ((long) this.zze)) - ((long) zzetVar2.zzC()), zzetVar2.zzC()));
                    } else {
                        zzetVar2.zzk(8);
                    }
                    i16++;
                    i15 = i15;
                    i11 = 2;
                    s10 = 2817;
                    s11 = 2816;
                    s12 = 2192;
                }
                List list3 = this.zzc;
                if (list3.isEmpty()) {
                    zzagyVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzagyVar.zza = ((zzamf) list3.get(0)).zza;
                }
            }
        } else {
            zzet zzetVar3 = new zzet(8);
            zzafzVar.zzc(zzetVar3.zzi(), 0, 8);
            this.zze = zzetVar3.zzC() + 8;
            if (zzetVar3.zzB() != 1397048916) {
                zzagyVar.zza = 0L;
            } else {
                zzagyVar.zza = zzafzVar.zzn() - ((long) (this.zze - 12));
                this.zzd = 2;
            }
        }
        return 1;
    }
}
