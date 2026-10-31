package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.google.android.gms.internal.measurement.zzahn;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaa extends zzab {
    final /* synthetic */ zzad zza;
    private final com.google.android.gms.internal.measurement.zzff zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaa(zzad zzadVar, String str, int i10, com.google.android.gms.internal.measurement.zzff zzffVar) {
        super(str, i10);
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
        this.zzh = zzffVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final int zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final boolean zzc() {
        return this.zzh.zzh();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0286  */
    /* JADX WARN: Code duplicated, block: B:106:0x0294  */
    /* JADX WARN: Code duplicated, block: B:108:0x029a  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:111:0x02af  */
    /* JADX WARN: Code duplicated, block: B:113:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:122:0x030b A[EDGE_INSN: B:122:0x030b->B:125:0x034b BREAK  A[LOOP:0: B:41:0x00f5->B:46:0x0122]] */
    /* JADX WARN: Code duplicated, block: B:123:0x032b A[EDGE_INSN: B:123:0x032b->B:125:0x034b BREAK  A[LOOP:0: B:41:0x00f5->B:46:0x0122]] */
    /* JADX WARN: Code duplicated, block: B:159:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0349 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x034b A[EDGE_INSN: B:177:0x034b->B:125:0x034b BREAK  A[LOOP:0: B:41:0x00f5->B:46:0x0122], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x034b A[EDGE_INSN: B:180:0x034b->B:125:0x034b BREAK  A[LOOP:0: B:41:0x00f5->B:46:0x0122], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x020a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x024f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0309 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x02eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x034b A[EDGE_INSN: B:188:0x034b->B:125:0x034b BREAK  A[LOOP:0: B:41:0x00f5->B:46:0x0122], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:46:0x0122 A[LOOP:0: B:41:0x00f5->B:46:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x013d  */
    /* JADX WARN: Code duplicated, block: B:56:0x015d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0166  */
    /* JADX WARN: Code duplicated, block: B:63:0x017b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0184  */
    /* JADX WARN: Code duplicated, block: B:68:0x018f  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x0202  */
    /* JADX WARN: Code duplicated, block: B:87:0x022f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0241  */
    /* JADX WARN: Code duplicated, block: B:98:0x0274  */
    /* JADX WARN: Multi-variable type inference failed */
    final boolean zzd(Long l10, Long l11, com.google.android.gms.internal.measurement.zzhs zzhsVar, long j10, zzbd zzbdVar, boolean z10) {
        HashSet hashSet;
        Iterator it;
        androidx.collection.a aVar;
        Iterator it2;
        Iterator it3;
        com.google.android.gms.internal.measurement.zzfh zzfhVar;
        boolean z11;
        String strZzi;
        V v10;
        Boolean boolZzg;
        Boolean boolZzh;
        String str;
        Boolean boolZzi;
        com.google.android.gms.internal.measurement.zzhw zzhwVar;
        Long lValueOf;
        Double dValueOf;
        com.google.android.gms.internal.measurement.zzfh zzfhVar2;
        zzahn.zza();
        zzad zzadVar = this.zza;
        zzic zzicVar = zzadVar.zzu;
        zzal zzalVarZzc = zzicVar.zzc();
        String str2 = this.zzb;
        boolean zZzp = zzalVarZzc.zzp(str2, zzfy.zzaF);
        com.google.android.gms.internal.measurement.zzff zzffVar = this.zzh;
        long j11 = zzffVar.zzm() ? zzbdVar.zze : j10;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (Log.isLoggable(zzicVar.zzaW().zzn(), 2)) {
            zzicVar.zzaW().zzk().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(this.zzc), zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null, zzicVar.zzl().zza(zzffVar.zzc()));
            zzicVar.zzaW().zzk().zzb("Filter definition", zzadVar.zzg.zzp().zzj(zzffVar));
        }
        if (!zzffVar.zza() || zzffVar.zzb() > 256) {
            zzicVar.zzaW().zze().zzc("Invalid event filter ID. appId, id", zzgu.zzl(str2), String.valueOf(zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null));
            return false;
        }
        Object[] objArr = zzffVar.zzj() || zzffVar.zzk() || zzffVar.zzm();
        if (z10 && objArr != true) {
            zzicVar.zzaW().zzk().zzc("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null);
            return true;
        }
        String strZzd = zzhsVar.zzd();
        if (!zzffVar.zzh()) {
            hashSet = new HashSet();
            it = zzffVar.zzd().iterator();
            while (true) {
                if (it.hasNext()) {
                    aVar = new androidx.collection.a();
                    it2 = zzhsVar.zza().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = zzffVar.zzd().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                zzfhVar = (com.google.android.gms.internal.measurement.zzfh) it3.next();
                                if (zzfhVar.zze() || !zzfhVar.zzf()) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                strZzi = zzfhVar.zzi();
                                if (strZzi.isEmpty()) {
                                    v10 = aVar.get(strZzi);
                                    if (v10 instanceof Long) {
                                        if (v10 instanceof Double) {
                                            if (v10 instanceof String) {
                                                if (v10 == 0) {
                                                    zzicVar.zzaW().zze().zzc("Unknown param type. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                    break;
                                                }
                                                zzicVar.zzaW().zzk().zzc("Missing param for filter. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (zzfhVar.zza()) {
                                                if (zzfhVar.zzc()) {
                                                    zzicVar.zzaW().zze().zzc("No filter for String param. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                    break;
                                                }
                                                str = (String) v10;
                                                if (zzpk.zzm(str)) {
                                                    zzicVar.zzaW().zze().zzc("Invalid param value for number filter. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                    break;
                                                }
                                                boolZzi = zzab.zzi(str, zzfhVar.zzd());
                                            } else {
                                                boolZzi = zzab.zzf((String) v10, zzfhVar.zzb(), zzicVar.zzaW());
                                            }
                                            if (boolZzi != null) {
                                                break;
                                            }
                                            if (boolZzi.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            if (zzfhVar.zzc()) {
                                                zzicVar.zzaW().zze().zzc("No number filter for double param. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                break;
                                            }
                                            boolZzh = zzab.zzh(((Double) v10).doubleValue(), zzfhVar.zzd());
                                            if (boolZzh != null) {
                                                break;
                                            }
                                            if (boolZzh.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (zzfhVar.zzc()) {
                                            zzicVar.zzaW().zze().zzc("No number filter for long param. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                            break;
                                        }
                                        boolZzg = zzab.zzg(((Long) v10).longValue(), zzfhVar.zzd());
                                        if (boolZzg != null) {
                                            break;
                                        }
                                        if (boolZzg.booleanValue() == z11) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    }
                                } else {
                                    zzicVar.zzaW().zze().zzb("Event has empty param name. event", zzicVar.zzl().zza(strZzd));
                                    break;
                                }
                            }
                        } else {
                            zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it2.next();
                            if (!hashSet.contains(zzhwVar.zzb())) {
                                if (zzhwVar.zze()) {
                                    if (zzhwVar.zzj()) {
                                        if (zzhwVar.zzc()) {
                                            zzicVar.zzaW().zze().zzc("Unknown value for param. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(zzhwVar.zzb()));
                                            break;
                                        }
                                        aVar.put(zzhwVar.zzb(), zzhwVar.zzd());
                                    } else {
                                        String strZzb = zzhwVar.zzb();
                                        if (zzhwVar.zzj()) {
                                            dValueOf = Double.valueOf(zzhwVar.zzk());
                                        } else {
                                            dValueOf = null;
                                        }
                                        aVar.put(strZzb, dValueOf);
                                    }
                                } else {
                                    String strZzb2 = zzhwVar.zzb();
                                    if (zzhwVar.zze()) {
                                        lValueOf = Long.valueOf(zzhwVar.zzf());
                                    } else {
                                        lValueOf = null;
                                    }
                                    aVar.put(strZzb2, lValueOf);
                                }
                            }
                        }
                    }
                } else {
                    zzfhVar2 = (com.google.android.gms.internal.measurement.zzfh) it.next();
                    if (zzfhVar2.zzi().isEmpty()) {
                        zzicVar.zzaW().zze().zzb("null or empty param name in filter. event", zzicVar.zzl().zza(strZzd));
                        break;
                    }
                    hashSet.add(zzfhVar2.zzi());
                }
            }
        } else {
            Boolean boolZzg2 = zzab.zzg(j11, zzffVar.zzi());
            if (boolZzg2 != null) {
                if (boolZzg2.booleanValue()) {
                    hashSet = new HashSet();
                    it = zzffVar.zzd().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            aVar = new androidx.collection.a();
                            it2 = zzhsVar.zza().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    it3 = zzffVar.zzd().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            bool = Boolean.TRUE;
                                            break;
                                        }
                                        zzfhVar = (com.google.android.gms.internal.measurement.zzfh) it3.next();
                                        if (zzfhVar.zze()) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                        }
                                        strZzi = zzfhVar.zzi();
                                        if (strZzi.isEmpty()) {
                                            v10 = aVar.get(strZzi);
                                            if (v10 instanceof Long) {
                                                if (v10 instanceof Double) {
                                                    if (v10 instanceof String) {
                                                        if (v10 == 0) {
                                                            zzicVar.zzaW().zze().zzc("Unknown param type. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                            break;
                                                        }
                                                        zzicVar.zzaW().zzk().zzc("Missing param for filter. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    if (zzfhVar.zza()) {
                                                        if (zzfhVar.zzc()) {
                                                            zzicVar.zzaW().zze().zzc("No filter for String param. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                            break;
                                                        }
                                                        str = (String) v10;
                                                        if (zzpk.zzm(str)) {
                                                            zzicVar.zzaW().zze().zzc("Invalid param value for number filter. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                            break;
                                                        }
                                                        boolZzi = zzab.zzi(str, zzfhVar.zzd());
                                                    } else {
                                                        boolZzi = zzab.zzf((String) v10, zzfhVar.zzb(), zzicVar.zzaW());
                                                    }
                                                    if (boolZzi != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolZzi.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else if (zzfhVar.zzc()) {
                                                    boolZzh = zzab.zzh(((Double) v10).doubleValue(), zzfhVar.zzd());
                                                    if (boolZzh != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolZzh.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else {
                                                    zzicVar.zzaW().zze().zzc("No number filter for double param. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                    break;
                                                }
                                            } else if (zzfhVar.zzc()) {
                                                boolZzg = zzab.zzg(((Long) v10).longValue(), zzfhVar.zzd());
                                                if (boolZzg != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolZzg.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            } else {
                                                zzicVar.zzaW().zze().zzc("No number filter for long param. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                break;
                                            }
                                        } else {
                                            zzicVar.zzaW().zze().zzb("Event has empty param name. event", zzicVar.zzl().zza(strZzd));
                                            break;
                                        }
                                    }
                                } else {
                                    zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it2.next();
                                    if (!hashSet.contains(zzhwVar.zzb())) {
                                        if (zzhwVar.zze()) {
                                            if (zzhwVar.zzj()) {
                                                if (zzhwVar.zzc()) {
                                                    zzicVar.zzaW().zze().zzc("Unknown value for param. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(zzhwVar.zzb()));
                                                    break;
                                                }
                                                aVar.put(zzhwVar.zzb(), zzhwVar.zzd());
                                            } else {
                                                String strZzb3 = zzhwVar.zzb();
                                                if (zzhwVar.zzj()) {
                                                    dValueOf = Double.valueOf(zzhwVar.zzk());
                                                } else {
                                                    dValueOf = null;
                                                }
                                                aVar.put(strZzb3, dValueOf);
                                            }
                                        } else {
                                            String strZzb4 = zzhwVar.zzb();
                                            if (zzhwVar.zze()) {
                                                lValueOf = Long.valueOf(zzhwVar.zzf());
                                            } else {
                                                lValueOf = null;
                                            }
                                            aVar.put(strZzb4, lValueOf);
                                        }
                                    }
                                }
                            }
                        } else {
                            zzfhVar2 = (com.google.android.gms.internal.measurement.zzfh) it.next();
                            if (zzfhVar2.zzi().isEmpty()) {
                                zzicVar.zzaW().zze().zzb("null or empty param name in filter. event", zzicVar.zzl().zza(strZzd));
                                break;
                            }
                            hashSet.add(zzfhVar2.zzi());
                        }
                    }
                } else {
                    bool = Boolean.FALSE;
                }
            }
        }
        zzicVar.zzaW().zzk().zzb("Event filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.zzd = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.zze = bool2;
        if (objArr != false && zzhsVar.zze()) {
            Long lValueOf2 = Long.valueOf(zzhsVar.zzf());
            if (zzffVar.zzk()) {
                if (zZzp && zzffVar.zzh()) {
                    lValueOf2 = l10;
                }
                this.zzg = lValueOf2;
            } else {
                if (zZzp && zzffVar.zzh()) {
                    lValueOf2 = l11;
                }
                this.zzf = lValueOf2;
            }
        }
        return true;
    }
}
