package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbuy extends zzbvb {
    @Override // com.google.android.gms.internal.ads.zzbvc
    public final zzbvf zzb(String str) throws RemoteException {
        zzbwd zzbwdVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbuy.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzbwd((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzbwd((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 64);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(" (not a valid adapter).");
                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
                throw new RemoteException();
            } catch (Throwable th) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                sb3.append("Could not instantiate mediation adapter: ");
                sb3.append(str);
                sb3.append(". ");
                com.google.android.gms.ads.internal.util.client.zzo.zzj(sb3.toString(), th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Reflection failed, retrying using direct instantiation");
            if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    zzbwdVar = new zzbwd(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
            zzbwdVar = new zzbwd(new AdMobAdapter());
            return zzbwdVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final boolean zzc(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbuy.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 88);
            sb2.append("Could not load custom event implementation class: ");
            sb2.append(str);
            sb2.append(", trying Adapter implementation class.");
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final boolean zzd(String str) throws RemoteException {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbuy.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 104);
            sb2.append("Could not load custom event implementation class as Adapter: ");
            sb2.append(str);
            sb2.append(", assuming old custom event implementation.");
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final zzbxb zze(String str) throws RemoteException {
        try {
            return new zzbxo((RtbAdapter) Class.forName(str, false, zzbxf.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }
}
