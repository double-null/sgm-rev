package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.vungle.ads.internal.network.converters.vY.vgmm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final zzr[] zzg;
    public final boolean zzh;
    public final boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public boolean zzl;
    public boolean zzm;
    public boolean zzn;
    public boolean zzo;
    public boolean zzp;

    public zzr() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
    }

    public static int zza(DisplayMetrics displayMetrics) {
        return (int) (zze(displayMetrics) * displayMetrics.density);
    }

    public static zzr zzb() {
        return new zzr("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false, false);
    }

    public static zzr zzd() {
        return new zzr("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false, false);
    }

    private static int zze(DisplayMetrics displayMetrics) {
        int i10 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i10 <= 400) {
            return 32;
        }
        return i10 <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzg, i10, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzn);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzo);
        SafeParcelWriter.writeBoolean(parcel, 17, this.zzp);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzr(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    public static zzr zzc() {
        return new zzr(vgmm.woNp, 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f0  */
    public zzr(Context context, AdSize[] adSizeArr) {
        int height;
        int i10;
        int iZze;
        String string;
        int dimensionPixelSize;
        AdSize adSize = adSizeArr[0];
        this.zzd = false;
        boolean zIsFluid = adSize.isFluid();
        this.zzi = zIsFluid;
        this.zzm = com.google.android.gms.ads.zzc.zzf(adSize);
        this.zzn = com.google.android.gms.ads.zzc.zzg(adSize);
        this.zzo = com.google.android.gms.ads.zzc.zzd(adSize);
        this.zzp = com.google.android.gms.ads.zzc.zzi(adSize);
        if (zIsFluid) {
            AdSize adSize2 = AdSize.BANNER;
            this.zze = adSize2.getWidth();
            height = adSize2.getHeight();
            this.zzb = height;
        } else if (this.zzn) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzc.zzh(adSize);
            this.zzb = height;
        } else if (this.zzo) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzc.zze(adSize);
            this.zzb = height;
        } else {
            this.zze = adSize.getWidth();
            height = adSize.getHeight();
            this.zzb = height;
        }
        boolean z10 = this.zze == -1;
        boolean z11 = height == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z10) {
            zzay.zza();
            if (context.getResources().getConfiguration().orientation == 2) {
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (((int) (displayMetrics2.heightPixels / displayMetrics2.density)) < 600) {
                    zzay.zza();
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i11 = displayMetrics3.heightPixels;
                        int i12 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i13 = displayMetrics3.heightPixels;
                        int i14 = displayMetrics3.widthPixels;
                        if (i13 == i11 && i14 == i12) {
                            int i15 = displayMetrics.widthPixels;
                            zzay.zza();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            dimensionPixelSize = i15 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.zzf = dimensionPixelSize;
                        } else {
                            dimensionPixelSize = displayMetrics.widthPixels;
                            this.zzf = dimensionPixelSize;
                        }
                    } else {
                        dimensionPixelSize = displayMetrics.widthPixels;
                        this.zzf = dimensionPixelSize;
                    }
                } else {
                    dimensionPixelSize = displayMetrics.widthPixels;
                    this.zzf = dimensionPixelSize;
                }
            } else {
                dimensionPixelSize = displayMetrics.widthPixels;
                this.zzf = dimensionPixelSize;
            }
            double d10 = dimensionPixelSize / displayMetrics.density;
            i10 = (int) d10;
            if (d10 - ((double) i10) >= 0.01d) {
                i10++;
            }
        } else {
            i10 = this.zze;
            zzay.zza();
            this.zzf = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, this.zze);
        }
        if (z11) {
            iZze = zze(displayMetrics);
        } else {
            iZze = this.zzb;
        }
        zzay.zza();
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, iZze);
        if (!z10 && !z11) {
            if (this.zzn || this.zzo) {
                int i16 = this.zze;
                int i17 = this.zzb;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i16).length() + 1 + String.valueOf(i17).length() + 3);
                sb2.append(i16);
                sb2.append("x");
                sb2.append(i17);
                sb2.append("_as");
                string = sb2.toString();
            } else if (zIsFluid) {
                string = "320x50_mb";
            } else {
                this.zza = adSize.toString();
            }
            this.zza = string;
        } else {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 1 + String.valueOf(iZze).length() + 3);
            sb3.append(i10);
            sb3.append("x");
            sb3.append(iZze);
            sb3.append("_as");
            this.zza = sb3.toString();
        }
        int length = adSizeArr.length;
        if (length > 1) {
            this.zzg = new zzr[length];
            for (int i18 = 0; i18 < adSizeArr.length; i18++) {
                this.zzg[i18] = new zzr(context, adSizeArr[i18]);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    zzr(String str, int i10, int i11, boolean z10, int i12, int i13, zzr[] zzrVarArr, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = z10;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = zzrVarArr;
        this.zzh = z11;
        this.zzi = z12;
        this.zzj = z13;
        this.zzk = z14;
        this.zzl = z15;
        this.zzm = z16;
        this.zzn = z17;
        this.zzo = z18;
        this.zzp = z19;
    }
}
