package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzvp extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzvm zzc;
    public final String zzd;

    public zzvp(zzv zzvVar, Throwable th, boolean z10, int i10) {
        String string = zzvVar.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 25 + string.length());
        sb2.append("Decoder init failed: [");
        sb2.append(i10);
        sb2.append("], ");
        sb2.append(string);
        String string2 = sb2.toString();
        String str = zzvVar.zzp;
        int iAbs = Math.abs(i10);
        StringBuilder sb3 = new StringBuilder(String.valueOf(iAbs).length() + 60);
        sb3.append("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_");
        sb3.append(iAbs);
        this(string2, th, str, false, null, sb3.toString(), null);
    }

    final /* synthetic */ zzvp zza(zzvp zzvpVar) {
        return new zzvp(getMessage(), getCause(), this.zza, false, this.zzc, this.zzd, zzvpVar);
    }

    public zzvp(zzv zzvVar, Throwable th, boolean z10, zzvm zzvmVar) {
        String str = zzvmVar.zza;
        int length = str.length();
        String string = zzvVar.toString();
        StringBuilder sb2 = new StringBuilder(length + 23 + string.length());
        sb2.append("Decoder init failed: ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(string);
        this(sb2.toString(), th, zzvVar.zzp, false, zzvmVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private zzvp(String str, Throwable th, String str2, boolean z10, zzvm zzvmVar, String str3, zzvp zzvpVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzvmVar;
        this.zzd = str3;
    }
}
