package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzeq;
import com.google.android.gms.internal.play_billing.zzer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzer<MessageType extends zzer<MessageType, BuilderType>, BuilderType extends zzeq<MessageType, BuilderType>> implements zzhm {
    protected transient int zza = 0;

    protected static void zzk(Iterable iterable, List list) {
        int size = ((Collection) iterable).size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof zzhu) {
            ((zzhu) list).zzf(list.size() + size);
        }
        int size2 = list.size();
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object obj = list2.get(i10);
            if (obj == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size2) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public final byte[] zzQ() {
        try {
            int iZzn = zzn();
            byte[] bArr = new byte[iZzn];
            int i10 = zzfo.zzb;
            zzfl zzflVar = new zzfl(bArr, 0, iZzn);
            zzD(zzflVar);
            zzflVar.zzA();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }

    int zzi(zzhw zzhwVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhm
    public final zzfg zzj() {
        try {
            int iZzn = zzn();
            zzfg zzfgVar = zzfg.zza;
            byte[] bArr = new byte[iZzn];
            int i10 = zzfo.zzb;
            zzfl zzflVar = new zzfl(bArr, 0, iZzn);
            zzD(zzflVar);
            return zzfc.zza(zzflVar, bArr);
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }
}
