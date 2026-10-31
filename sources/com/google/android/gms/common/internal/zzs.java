package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzs implements Handler.Callback {
    final /* synthetic */ zzt zza;

    /* synthetic */ zzs(zzt zztVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zztVar);
        this.zza = zztVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int iZzn;
        zzr zzrVar;
        ArrayList arrayList;
        ComponentName componentName;
        int i10 = message.what;
        if (i10 == 0) {
            zzt zztVar = this.zza;
            synchronized (zztVar.zzh()) {
                zzo zzoVar = (zzo) message.obj;
                zzr zzrVar2 = (zzr) zztVar.zzh().get(zzoVar);
                if (zzrVar2 != null && zzrVar2.zzj()) {
                    if (zzrVar2.zzg()) {
                        zzrVar2.zzd("GmsClientSupervisor");
                    }
                    zztVar.zzh().remove(zzoVar);
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        zzt zztVar2 = this.zza;
        synchronized (zztVar2.zzh()) {
            Object obj = message.obj;
            iZzn = -1;
            zzrVar = null;
            if (obj instanceof zzp) {
                zzp zzpVar = (zzp) obj;
                zzo zzoVar2 = zzpVar.zza;
                zzr zzrVar3 = (zzr) zztVar2.zzh().get(zzoVar2);
                if (zzrVar3 != null && zzrVar3 == zzpVar.zzb && zzrVar3.zzh() == 3) {
                    String string = zzoVar2.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(string);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName componentNameZzl = zzrVar3.zzl();
                    if (componentNameZzl == null) {
                        componentNameZzl = zzoVar2.zzc();
                    }
                    if (componentNameZzl == null) {
                        String strZzb = zzoVar2.zzb();
                        Preconditions.checkNotNull(strZzb);
                        componentNameZzl = new ComponentName(strZzb, "unknown");
                    }
                    zztVar2.zzg(zzrVar3);
                    zzrVar3.zzq(null);
                    zzrVar3.zzr(componentNameZzl);
                    zzrVar3.zzp(2);
                    zzrVar3.zzo(zzrVar3.zzn() + 1);
                    iZzn = zzrVar3.zzn();
                    ArrayList arrayList2 = new ArrayList(zzrVar3.zzm().size());
                    for (Map.Entry entry : zzrVar3.zzm().entrySet()) {
                        arrayList2.add(new AbstractMap.SimpleImmutableEntry((ServiceConnection) entry.getKey(), (ServiceConnection) entry.getValue()));
                    }
                    componentName = componentNameZzl;
                    arrayList = arrayList2;
                    zzrVar = zzrVar3;
                }
            } else {
                zzo zzoVar3 = (zzo) obj;
                zzr zzrVar4 = (zzr) zztVar2.zzh().get(zzoVar3);
                if (zzrVar4 != null && zzrVar4.zzh() == 3) {
                    String strValueOf = String.valueOf(zzoVar3);
                    StringBuilder sb3 = new StringBuilder(strValueOf.length() + 47);
                    sb3.append("Timeout waiting for ServiceConnection callback ");
                    sb3.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb3.toString(), new Exception());
                    ComponentName componentNameZzl2 = zzrVar4.zzl();
                    if (componentNameZzl2 == null) {
                        componentNameZzl2 = zzoVar3.zzc();
                    }
                    if (componentNameZzl2 == null) {
                        String strZzb2 = zzoVar3.zzb();
                        Preconditions.checkNotNull(strZzb2);
                        componentNameZzl2 = new ComponentName(strZzb2, "unknown");
                    }
                    zzrVar4.onServiceDisconnected(componentNameZzl2);
                }
            }
            arrayList = null;
            componentName = null;
        }
        if (zzrVar != null) {
            zzrVar.zza(arrayList, iZzn, componentName);
        }
        return true;
    }
}
