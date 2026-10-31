package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzvl extends zzit {
    public final int zza;

    public zzvl(Throwable th, zzvm zzvmVar) {
        super("Decoder failed: ".concat(String.valueOf(zzvmVar == null ? null : zzvmVar.zza)), th);
        boolean z10 = th instanceof MediaCodec.CodecException;
        if (z10) {
            ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zza = z10 ? ((MediaCodec.CodecException) th).getErrorCode() : 0;
    }
}
