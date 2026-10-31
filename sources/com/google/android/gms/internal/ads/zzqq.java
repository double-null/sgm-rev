package com.google.android.gms.internal.ads;

import android.media.AudioDescriptor;
import android.os.Build;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzqq {
    public static zzgwm zza(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            return zzgwm.zzi();
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(zzqp.zza).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptor = (AudioDescriptor) it.next();
            if (audioDescriptor.getStandard() == 1) {
                byte[] descriptor = audioDescriptor.getDescriptor();
                int length = descriptor.length;
                if (length != 3) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 20);
                    sb2.append("Invalid SAD length: ");
                    sb2.append(length);
                    zzeg.zzc("AudioDescriptorUtil", sb2.toString());
                } else {
                    byte b10 = descriptor[0];
                    int i10 = (b10 & 7) + 1;
                    if (((b10 >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(zzfl.zzE(i10)));
                    }
                }
            }
        }
        return zzgwm.zzq(treeSet);
    }
}
