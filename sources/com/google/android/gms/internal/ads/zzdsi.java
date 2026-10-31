package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdsi {
    private final com.google.android.gms.ads.internal.util.zzbl zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdsi(com.google.android.gms.ads.internal.util.zzbl zzblVar, Clock clock, Executor executor) {
        this.zza = zzblVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzd(byte[] bArr, double d10, boolean z10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z10) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhd)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zze(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhe)).intValue())) / 2);
            }
        }
        return zze(bArr, options);
    }

    private final Bitmap zze(byte[] bArr, BitmapFactory.Options options) {
        Clock clock = this.zzb;
        long jElapsedRealtime = clock.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jElapsedRealtime2 = clock.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j10 = jElapsedRealtime2 - jElapsedRealtime;
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            boolean z10 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb2 = new StringBuilder(String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + String.valueOf(j10).length() + 15 + String.valueOf(z10).length());
            sb2.append("Decoded image w: ");
            sb2.append(width);
            sb2.append(" h:");
            sb2.append(height);
            sb2.append(" bytes: ");
            sb2.append(allocationByteCount);
            sb2.append(" time: ");
            sb2.append(j10);
            sb2.append(" on ui thread: ");
            sb2.append(z10);
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        return bitmapDecodeByteArray;
    }

    final /* synthetic */ Bitmap zzb(double d10, boolean z10, zzata zzataVar) {
        return zzd(zzataVar.zzb, d10, z10);
    }

    final /* synthetic */ Bitmap zzc(String str, double d10, boolean z10) {
        int iIndexOf = str.indexOf(",");
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Bad data URL: no ',' found for base64 data");
        }
        if (!str.substring(0, iIndexOf).endsWith(";base64")) {
            throw new IllegalArgumentException("Bad data URL: only base64 is supported");
        }
        int iIndexOf2 = str.indexOf(":");
        int iIndexOf3 = str.indexOf(";");
        if (iIndexOf2 == -1 || !str.substring(iIndexOf2 + 1, iIndexOf3).startsWith("image/")) {
            throw new IllegalArgumentException("Bad data URL: only image media is supported");
        }
        return zzd(Base64.decode(str.substring(iIndexOf + 1), 0), d10, z10);
    }

    public final ListenableFuture zza(final String str, final double d10, final boolean z10) {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhf)).booleanValue() && str != null && str.startsWith(UyXgnuLGEkgnZE.TAdD)) ? zzhbw.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzdsg
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(str, d10, z10);
            }
        }, this.zzc) : zzhbw.zzk(this.zza.zza(str), new zzgta() { // from class: com.google.android.gms.internal.ads.zzdsh
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzb(d10, z10, (zzata) obj);
            }
        }, this.zzc);
    }
}
