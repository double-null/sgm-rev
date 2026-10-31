package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzata {
    public final int zza;
    public final byte[] zzb;
    public final Map zzc;
    public final List zzd;
    public final boolean zze;

    private zzata(int i10, byte[] bArr, Map map, List list, boolean z10, long j10) {
        this.zza = i10;
        this.zzb = bArr;
        this.zzc = map;
        this.zzd = list == null ? null : Collections.unmodifiableList(list);
        this.zze = z10;
    }

    private static List zza(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new zzasw((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    @Deprecated
    public zzata(int i10, byte[] bArr, Map map, boolean z10, long j10) {
        this(i10, bArr, map, zza(map), z10, j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzata(int i10, byte[] bArr, boolean z10, long j10, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzasw zzaswVar = (zzasw) it.next();
                treeMap.put(zzaswVar.zza(), zzaswVar.zzb());
            }
        }
        this(i10, bArr, treeMap, list, z10, j10);
    }

    @Deprecated
    public zzata(byte[] bArr, Map map) {
        this(200, bArr, map, zza(map), false, 0L);
    }
}
