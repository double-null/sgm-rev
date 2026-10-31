package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzanm implements zzagb {
    private final zzagb zzb;
    private final zzanj zzc;
    private final SparseArray zzd = new SparseArray();
    private boolean zze;

    public zzanm(zzagb zzagbVar, zzanj zzanjVar) {
        this.zzb = zzagbVar;
        this.zzc = zzanjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final zzahk zzu(int i10, int i11) {
        if (i11 != 3 && i11 != 5) {
            this.zze = true;
        }
        if (i11 != 3) {
            return this.zzb.zzu(i10, i11);
        }
        SparseArray sparseArray = this.zzd;
        zzano zzanoVar = (zzano) sparseArray.get(i10);
        if (zzanoVar != null) {
            return zzanoVar;
        }
        zzano zzanoVar2 = new zzano(this.zzb.zzu(i10, 3), this.zzc);
        sparseArray.put(i10, zzanoVar2);
        return zzanoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final void zzv() {
        this.zzb.zzv();
        if (!this.zze) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.zzd;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((zzano) sparseArray.valueAt(i10)).zzf(true);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final void zzw(zzahb zzahbVar) {
        this.zzb.zzw(zzahbVar);
    }
}
