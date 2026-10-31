package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzaj;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbqq;
import com.google.android.gms.internal.ads.zzbqt;
import com.google.android.gms.internal.ads.zzbvc;
import com.google.android.gms.internal.ads.zzbyu;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzcbs;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcem;
import com.google.android.gms.internal.ads.zzcnj;
import com.google.android.gms.internal.ads.zzdqm;
import com.google.android.gms.internal.ads.zzdqo;
import com.google.android.gms.internal.ads.zzebc;
import com.google.android.gms.internal.ads.zzesd;
import com.google.android.gms.internal.ads.zzffg;
import com.google.android.gms.internal.ads.zzfgu;
import com.google.android.gms.internal.ads.zzfik;
import com.google.android.gms.internal.ads.zzfjy;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class ClientApi extends zzcn {
    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzb(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbvc zzbvcVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfgu zzfguVarZzj = zzcnj.zza(context, zzbvcVar, i10).zzj();
        zzfguVarZzj.zzd(context);
        zzfguVarZzj.zzb(zzrVar);
        zzfguVarZzj.zzc(str);
        return zzfguVarZzj.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbvc zzbvcVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfik zzfikVarZzn = zzcnj.zza(context, zzbvcVar, i10).zzn();
        zzfikVarZzn.zzd(context);
        zzfikVarZzn.zzb(zzrVar);
        zzfikVarZzn.zzc(str);
        return zzfikVarZzn.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbq zzd(IObjectWrapper iObjectWrapper, String str, zzbvc zzbvcVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzesd(zzcnj.zza(context, zzbvcVar, i10), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbmi zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdqo((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcbs zzf(IObjectWrapper iObjectWrapper, zzbvc zzbvcVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfjy zzfjyVarZzq = zzcnj.zza(context, zzbvcVar, i10).zzq();
        zzfjyVarZzq.zzc(context);
        return zzfjyVarZzq.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbzb zzg(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new zzw(activity);
        }
        int i10 = adOverlayInfoParcelZza.zzk;
        if (i10 == 1) {
            return new zzv(activity);
        }
        if (i10 == 2) {
            return new zzai(activity);
        }
        if (i10 == 3) {
            return new zzaj(activity);
        }
        if (i10 != 4) {
            return i10 != 5 ? new zzw(activity) : new zzag(activity);
        }
        return new zzac(activity, adOverlayInfoParcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzch zzh(IObjectWrapper iObjectWrapper, zzbvc zzbvcVar, int i10) {
        return zzcnj.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbvcVar, i10).zzf();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcy zzi(IObjectWrapper iObjectWrapper, int i10) {
        return zzcnj.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i10).zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    @Deprecated
    public final zzbu zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, int i10) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzrVar, str, new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i10, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbmn zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdqm((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcci zzl(IObjectWrapper iObjectWrapper, String str, zzbvc zzbvcVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfjy zzfjyVarZzq = zzcnj.zza(context, zzbvcVar, i10).zzq();
        zzfjyVarZzq.zzc(context);
        zzfjyVarZzq.zzb(str);
        return zzfjyVarZzq.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzm(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbvc zzbvcVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzffg zzffgVarZzl = zzcnj.zza(context, zzbvcVar, i10).zzl();
        zzffgVarZzl.zzb(str);
        zzffgVarZzl.zzc(context);
        return zzffgVarZzl.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcem zzn(IObjectWrapper iObjectWrapper, zzbvc zzbvcVar, int i10) {
        return zzcnj.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbvcVar, i10).zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbyu zzo(IObjectWrapper iObjectWrapper, zzbvc zzbvcVar, int i10) {
        return zzcnj.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbvcVar, i10).zzu();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbqt zzp(IObjectWrapper iObjectWrapper, zzbvc zzbvcVar, int i10, zzbqq zzbqqVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzebc zzebcVarZzA = zzcnj.zza(context, zzbvcVar, i10).zzA();
        zzebcVarZzA.zzc(context);
        zzebcVarZzA.zzb(zzbqqVar);
        return zzebcVarZzA.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzdt zzq(IObjectWrapper iObjectWrapper, zzbvc zzbvcVar, int i10) {
        return zzcnj.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbvcVar, i10).zzC();
    }
}
