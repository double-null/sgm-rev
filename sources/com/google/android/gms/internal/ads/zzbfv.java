package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbfv {
    private final int zza;
    private final zzbfs zzb = new zzbfx();

    public zzbfv(int i10) {
        this.zza = i10;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] strArrSplit = sb2.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        zzbfu zzbfuVar = new zzbfu();
        int i11 = this.zza;
        PriorityQueue priorityQueue = new PriorityQueue(i11, new zzbft(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzbfw.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzbfz.zza(strArrZzb, i11, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbfuVar.zzb.write(this.zzb.zza(((zzbfy) it.next()).zzb));
            } catch (IOException e10) {
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while writing hash to byteStream", e10);
            }
        }
        return zzbfuVar.toString();
    }
}
