package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeuw implements zzfci {
    public final com.google.android.gms.ads.internal.client.zzr zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final int zzi;
    public final boolean zzj;
    public final androidx.core.graphics.g zzk;
    public final zzeut zzl;

    public zzeuw(com.google.android.gms.ads.internal.client.zzr zzrVar, String str, boolean z10, String str2, float f10, int i10, int i11, String str3, int i12, boolean z11, androidx.core.graphics.g gVar, zzeut zzeutVar) {
        Preconditions.checkNotNull(zzrVar, "the adSize must not be null");
        this.zza = zzrVar;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = str2;
        this.zze = f10;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = str3;
        this.zzi = i12;
        this.zzj = z11;
        this.zzk = gVar;
        this.zzl = zzeutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zza;
        Bundle bundle = (Bundle) obj;
        int i10 = zzrVar.zze;
        zzfln.zzb(bundle, "smart_w", "full", i10 == -1);
        int i11 = zzrVar.zzb;
        zzfln.zzb(bundle, "smart_h", "auto", i11 == -2);
        zzfln.zzd(bundle, "ene", true, zzrVar.zzj);
        zzfln.zzb(bundle, "rafmt", "102", zzrVar.zzm);
        zzfln.zzb(bundle, "rafmt", "108", zzrVar.zzp);
        zzfln.zzb(bundle, "rafmt", "103", zzrVar.zzn);
        zzfln.zzb(bundle, "rafmt", "105", zzrVar.zzo);
        zzfln.zzd(bundle, "inline_adaptive_slot", true, this.zzj);
        zzfln.zzd(bundle, "interscroller_slot", true, zzrVar.zzo);
        zzfln.zze(bundle, "format", this.zzb);
        zzfln.zzb(bundle, "fluid", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, this.zzc);
        String str = this.zzd;
        zzfln.zzb(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        String str2 = this.zzh;
        zzfln.zzb(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        int i12 = this.zzi;
        if (i12 != -1) {
            bundle.putInt("u_mso", i12);
        }
        androidx.core.graphics.g gVar = this.zzk;
        if (gVar != null) {
            bundle.putInt("sam_t", gVar.f1852b);
            bundle.putInt("sam_b", gVar.f1854d);
            bundle.putInt("sam_l", gVar.f1851a);
            bundle.putInt("sam_r", gVar.f1853c);
        }
        zzeut zzeutVar = this.zzl;
        if (zzeutVar != null) {
            bundle.putInt("rc_tl", zzeutVar.zza);
            bundle.putInt("rc_tr", zzeutVar.zzb);
            bundle.putInt("rc_bl", zzeutVar.zzc);
            bundle.putInt("rc_br", zzeutVar.zzd);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i11);
            bundle2.putInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i10);
            bundle2.putBoolean("is_fluid_height", zzrVar.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzrVar2.zzi);
                bundle3.putInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, zzrVar2.zzb);
                bundle3.putInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, zzrVar2.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
