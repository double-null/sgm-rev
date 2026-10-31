package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdug extends zzbmu {
    private final Context zza;
    private final zzdpt zzb;
    private zzdqs zzc;
    private zzdpo zzd;

    public zzdug(Context context, zzdpt zzdptVar, zzdqs zzdqsVar, zzdpo zzdpoVar) {
        this.zza = context;
        this.zzb = zzdptVar;
        this.zzc = zzdqsVar;
        this.zzd = zzdpoVar;
    }

    final /* synthetic */ zzdpo zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final String zze(String str) {
        return (String) this.zzb.zzad().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final zzbme zzf(String str) {
        return (zzbme) this.zzb.zzaa().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final List zzg() {
        try {
            zzdpt zzdptVar = this.zzb;
            androidx.collection.h hVarZzaa = zzdptVar.zzaa();
            androidx.collection.h hVarZzad = zzdptVar.zzad();
            String[] strArr = new String[hVarZzaa.size() + hVarZzad.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < hVarZzaa.size(); i11++) {
                strArr[i10] = (String) hVarZzaa.j(i11);
                i10++;
            }
            for (int i12 = 0; i12 < hVarZzad.size(); i12++) {
                strArr[i10] = (String) hVarZzad.j(i12);
                i10++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final String zzh() {
        return this.zzb.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzi(String str) {
        zzdpo zzdpoVar = this.zzd;
        if (zzdpoVar != null) {
            zzdpoVar.zza(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzj() {
        zzdpo zzdpoVar = this.zzd;
        if (zzdpoVar != null) {
            zzdpoVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final com.google.android.gms.ads.internal.client.zzea zzk() {
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzl() {
        zzdpo zzdpoVar = this.zzd;
        if (zzdpoVar != null) {
            zzdpoVar.zzd();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final IObjectWrapper zzm() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final boolean zzn(IObjectWrapper iObjectWrapper) {
        zzdqs zzdqsVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdqsVar = this.zzc) == null || !zzdqsVar.zzd((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzT().zzaq(new zzduf(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final boolean zzo() {
        zzdpo zzdpoVar = this.zzd;
        if (zzdpoVar != null && !zzdpoVar.zzM()) {
            return false;
        }
        zzdpt zzdptVar = this.zzb;
        return zzdptVar.zzW() != null && zzdptVar.zzT() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final boolean zzp() {
        zzdpt zzdptVar = this.zzb;
        zzeln zzelnVarZzZ = zzdptVar.zzZ();
        if (zzelnVarZzZ == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zze(zzelnVarZzZ.zza());
        if (zzdptVar.zzW() == null) {
            return true;
        }
        zzdptVar.zzW().zze("onSdkLoaded", new androidx.collection.a());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzq(IObjectWrapper iObjectWrapper) {
        zzdpo zzdpoVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof View) || this.zzb.zzZ() == null || (zzdpoVar = this.zzd) == null) {
            return;
        }
        zzdpoVar.zzN((View) objUnwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzr() {
        try {
            String strZzac = this.zzb.zzac();
            if (Objects.equals(strZzac, "Google")) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(strZzac)) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdpo zzdpoVar = this.zzd;
                if (zzdpoVar != null) {
                    zzdpoVar.zzL(strZzac, false);
                }
            }
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final zzbmb zzs() throws RemoteException {
        try {
            return this.zzd.zzP().zza();
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final boolean zzt(IObjectWrapper iObjectWrapper) {
        zzdqs zzdqsVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdqsVar = this.zzc) == null || !zzdqsVar.zze((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzU().zzaq(new zzduf(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }
}
