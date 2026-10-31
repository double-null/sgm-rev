package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zziy {
    private final Map zza;

    public zziy() {
        this.zza = new HashMap();
    }

    public final zziy zza(String str, int i10) {
        this.zza.put(str, Integer.valueOf(i10));
        return this;
    }

    public final zziy zzb(String str, long j10) {
        this.zza.put(str, Long.valueOf(j10));
        return this;
    }

    public final zziy zzc(String str, float f10) {
        this.zza.put(str, Float.valueOf(f10));
        return this;
    }

    public final zziy zzd(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zziy zze(String str, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            this.zza.put(str, null);
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            byteBufferAllocate.put(byteBuffer.duplicate());
            byteBufferAllocate.flip();
            this.zza.put(str, byteBufferAllocate);
        }
        return this;
    }

    public final zziy zzf(String str) {
        this.zza.remove(str);
        return this;
    }

    public final zziz zzg() {
        return new zziz(this.zza, null);
    }
}
