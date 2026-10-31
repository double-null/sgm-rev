package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzibw extends AbstractMap implements Serializable {
    private static final Comparator zze = new zzibp();
    zzibv zza;
    int zzb;
    int zzc;
    final zzibv zzd;
    private final Comparator zzf;
    private final boolean zzg;
    private zzibr zzh;
    private zzibt zzi;

    public zzibw() {
        this(zze, true);
    }

    private final void zzf(zzibv zzibvVar, zzibv zzibvVar2) {
        zzibv zzibvVar3 = zzibvVar.zza;
        zzibvVar.zza = null;
        if (zzibvVar2 != null) {
            zzibvVar2.zza = zzibvVar3;
        }
        if (zzibvVar3 == null) {
            this.zza = zzibvVar2;
        } else if (zzibvVar3.zzb == zzibvVar) {
            zzibvVar3.zzb = zzibvVar2;
        } else {
            zzibvVar3.zzc = zzibvVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0080 A[SYNTHETIC] */
    private final void zzg(zzibv zzibvVar, boolean z10) {
        while (zzibvVar != null) {
            zzibv zzibvVar2 = zzibvVar.zzb;
            zzibv zzibvVar3 = zzibvVar.zzc;
            boolean z11 = false;
            int i10 = zzibvVar2 != null ? zzibvVar2.zzi : 0;
            int i11 = zzibvVar3 != null ? zzibvVar3.zzi : 0;
            int i12 = i10 - i11;
            boolean z12 = true;
            if (i12 == -2) {
                zzibv zzibvVar4 = zzibvVar3.zzb;
                zzibv zzibvVar5 = zzibvVar3.zzc;
                int i13 = (zzibvVar4 != null ? zzibvVar4.zzi : 0) - (zzibvVar5 != null ? zzibvVar5.zzi : 0);
                if (i13 != -1) {
                    if (i13 == 0) {
                        if (!z10) {
                        }
                        if (z12) {
                            return;
                        }
                    } else {
                        z12 = z10;
                    }
                    zzi(zzibvVar3);
                    zzh(zzibvVar);
                    if (z12) {
                        return;
                    }
                } else {
                    z11 = z10;
                }
                zzh(zzibvVar);
                z12 = z11;
                if (z12) {
                    return;
                }
            } else if (i12 == 2) {
                zzibv zzibvVar6 = zzibvVar2.zzb;
                zzibv zzibvVar7 = zzibvVar2.zzc;
                int i14 = (zzibvVar6 != null ? zzibvVar6.zzi : 0) - (zzibvVar7 != null ? zzibvVar7.zzi : 0);
                if (i14 != 1) {
                    if (i14 == 0) {
                        if (!z10) {
                        }
                        if (z12) {
                            return;
                        }
                    } else {
                        z12 = z10;
                    }
                    zzh(zzibvVar2);
                    zzi(zzibvVar);
                    if (z12) {
                        return;
                    }
                } else {
                    z11 = z10;
                }
                zzi(zzibvVar);
                z12 = z11;
                if (z12) {
                    return;
                }
            } else if (i12 == 0) {
                zzibvVar.zzi = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                zzibvVar.zzi = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            zzibvVar = zzibvVar.zza;
        }
    }

    private final void zzh(zzibv zzibvVar) {
        zzibv zzibvVar2 = zzibvVar.zzb;
        zzibv zzibvVar3 = zzibvVar.zzc;
        zzibv zzibvVar4 = zzibvVar3.zzb;
        zzibv zzibvVar5 = zzibvVar3.zzc;
        zzibvVar.zzc = zzibvVar4;
        if (zzibvVar4 != null) {
            zzibvVar4.zza = zzibvVar;
        }
        zzf(zzibvVar, zzibvVar3);
        zzibvVar3.zzb = zzibvVar;
        zzibvVar.zza = zzibvVar3;
        int iMax = Math.max(zzibvVar2 != null ? zzibvVar2.zzi : 0, zzibvVar4 != null ? zzibvVar4.zzi : 0) + 1;
        zzibvVar.zzi = iMax;
        zzibvVar3.zzi = Math.max(iMax, zzibvVar5 != null ? zzibvVar5.zzi : 0) + 1;
    }

    private final void zzi(zzibv zzibvVar) {
        zzibv zzibvVar2 = zzibvVar.zzb;
        zzibv zzibvVar3 = zzibvVar.zzc;
        zzibv zzibvVar4 = zzibvVar2.zzb;
        zzibv zzibvVar5 = zzibvVar2.zzc;
        zzibvVar.zzb = zzibvVar5;
        if (zzibvVar5 != null) {
            zzibvVar5.zza = zzibvVar;
        }
        zzf(zzibvVar, zzibvVar2);
        zzibvVar2.zzc = zzibvVar;
        zzibvVar.zza = zzibvVar2;
        int iMax = Math.max(zzibvVar3 != null ? zzibvVar3.zzi : 0, zzibvVar5 != null ? zzibvVar5.zzi : 0) + 1;
        zzibvVar.zzi = iMax;
        zzibvVar2.zzi = Math.max(iMax, zzibvVar4 != null ? zzibvVar4.zzi : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zza = null;
        this.zzb = 0;
        this.zzc++;
        zzibv zzibvVar = this.zzd;
        zzibvVar.zze = zzibvVar;
        zzibvVar.zzd = zzibvVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzb(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzibr zzibrVar = this.zzh;
        if (zzibrVar != null) {
            return zzibrVar;
        }
        zzibr zzibrVar2 = new zzibr(this);
        this.zzh = zzibrVar2;
        return zzibrVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzibv zzibvVarZzb = zzb(obj);
        if (zzibvVarZzb != null) {
            return zzibvVarZzb.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzibt zzibtVar = this.zzi;
        if (zzibtVar != null) {
            return zzibtVar;
        }
        zzibt zzibtVar2 = new zzibt(this);
        this.zzi = zzibtVar2;
        return zzibtVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        zzibv zzibvVarZza = zza(obj, true);
        Object obj3 = zzibvVarZza.zzh;
        zzibvVarZza.zzh = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzibv zzibvVarZze = zze(obj);
        if (zzibvVarZze != null) {
            return zzibvVarZze.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb;
    }

    final zzibv zza(Object obj, boolean z10) {
        int iCompareTo;
        zzibv zzibvVar;
        Comparator comparator = this.zzf;
        zzibv zzibvVar2 = this.zza;
        if (zzibvVar2 != null) {
            Comparable comparable = comparator == zze ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(zzibvVar2.zzf) : comparator.compare(obj, zzibvVar2.zzf);
                if (iCompareTo == 0) {
                    return zzibvVar2;
                }
                zzibv zzibvVar3 = iCompareTo < 0 ? zzibvVar2.zzb : zzibvVar2.zzc;
                if (zzibvVar3 == null) {
                    break;
                }
                zzibvVar2 = zzibvVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z10) {
            return null;
        }
        zzibv zzibvVar4 = this.zzd;
        if (zzibvVar2 != null) {
            zzibvVar = new zzibv(this.zzg, zzibvVar2, obj, zzibvVar4, zzibvVar4.zze);
            if (iCompareTo < 0) {
                zzibvVar2.zzb = zzibvVar;
            } else {
                zzibvVar2.zzc = zzibvVar;
            }
            zzg(zzibvVar2, true);
        } else {
            if (comparator == zze && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            zzibvVar = new zzibv(this.zzg, null, obj, zzibvVar4, zzibvVar4.zze);
            this.zza = zzibvVar;
        }
        this.zzb++;
        this.zzc++;
        return zzibvVar;
    }

    final zzibv zzb(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return zza(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    final zzibv zzc(Map.Entry entry) {
        zzibv zzibvVarZzb = zzb(entry.getKey());
        if (zzibvVarZzb == null || !Objects.equals(zzibvVarZzb.zzh, entry.getValue())) {
            return null;
        }
        return zzibvVarZzb;
    }

    final void zzd(zzibv zzibvVar, boolean z10) {
        zzibv zzibvVar2;
        zzibv zzibvVar3;
        int i10;
        if (z10) {
            zzibv zzibvVar4 = zzibvVar.zze;
            zzibvVar4.zzd = zzibvVar.zzd;
            zzibvVar.zzd.zze = zzibvVar4;
        }
        zzibv zzibvVar5 = zzibvVar.zzb;
        zzibv zzibvVar6 = zzibvVar.zzc;
        zzibv zzibvVar7 = zzibvVar.zza;
        int i11 = 0;
        if (zzibvVar5 == null || zzibvVar6 == null) {
            if (zzibvVar5 != null) {
                zzf(zzibvVar, zzibvVar5);
                zzibvVar.zzb = null;
            } else if (zzibvVar6 != null) {
                zzf(zzibvVar, zzibvVar6);
                zzibvVar.zzc = null;
            } else {
                zzf(zzibvVar, null);
            }
            zzg(zzibvVar7, false);
            this.zzb--;
            this.zzc++;
            return;
        }
        if (zzibvVar5.zzi > zzibvVar6.zzi) {
            do {
                zzibvVar3 = zzibvVar5;
                zzibvVar5 = zzibvVar5.zzc;
            } while (zzibvVar5 != null);
        } else {
            do {
                zzibvVar2 = zzibvVar6;
                zzibvVar6 = zzibvVar6.zzb;
            } while (zzibvVar6 != null);
            zzibvVar3 = zzibvVar2;
        }
        zzd(zzibvVar3, false);
        zzibv zzibvVar8 = zzibvVar.zzb;
        if (zzibvVar8 != null) {
            i10 = zzibvVar8.zzi;
            zzibvVar3.zzb = zzibvVar8;
            zzibvVar8.zza = zzibvVar3;
            zzibvVar.zzb = null;
        } else {
            i10 = 0;
        }
        zzibv zzibvVar9 = zzibvVar.zzc;
        if (zzibvVar9 != null) {
            i11 = zzibvVar9.zzi;
            zzibvVar3.zzc = zzibvVar9;
            zzibvVar9.zza = zzibvVar3;
            zzibvVar.zzc = null;
        }
        zzibvVar3.zzi = Math.max(i10, i11) + 1;
        zzf(zzibvVar, zzibvVar3);
    }

    final zzibv zze(Object obj) {
        zzibv zzibvVarZzb = zzb(obj);
        if (zzibvVarZzb != null) {
            zzd(zzibvVarZzb, true);
        }
        return zzibvVarZzb;
    }

    public zzibw(Comparator comparator, boolean z10) {
        this.zzb = 0;
        this.zzc = 0;
        this.zzf = comparator;
        this.zzg = z10;
        this.zzd = new zzibv(z10);
    }

    public zzibw(boolean z10) {
        this(zze, false);
    }
}
