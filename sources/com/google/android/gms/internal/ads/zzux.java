package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzux implements zzvk {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzds zzg;
    private boolean zzh;

    public zzux(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzds zzdsVar = new zzds(zzdo.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdsVar;
        this.zzf = new AtomicReference();
    }

    private static zzuw zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzuw();
            }
            return (zzuw) arrayDeque.removeFirst();
        }
    }

    private static int[] zzj(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    private static byte[] zzk(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final void zza() {
        if (this.zzh) {
            return;
        }
        HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new zzuv(this, handlerThread.getLooper());
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final void zzb(int i10, int i11, int i12, long j10, int i13) {
        zzg();
        zzuw zzuwVarZzi = zzi();
        zzuwVarZzi.zza(i10, 0, i12, j10, i13);
        Handler handler = this.zze;
        String str = zzfl.zza;
        handler.obtainMessage(1, zzuwVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final void zzc(int i10, int i11, zzis zzisVar, long j10, int i12) {
        zzg();
        zzuw zzuwVarZzi = zzi();
        zzuwVarZzi.zza(i10, 0, 0, j10, i12);
        MediaCodec.CryptoInfo cryptoInfo = zzuwVarZzi.zzd;
        cryptoInfo.numSubSamples = zzisVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzisVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzisVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzk = zzk(zzisVar.zzb, cryptoInfo.key);
        bArrZzk.getClass();
        cryptoInfo.key = bArrZzk;
        byte[] bArrZzk2 = zzk(zzisVar.zza, cryptoInfo.iv);
        bArrZzk2.getClass();
        cryptoInfo.iv = bArrZzk2;
        cryptoInfo.mode = zzisVar.zzc;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzisVar.zzg, zzisVar.zzh));
        Handler handler = this.zze;
        String str = zzfl.zza;
        handler.obtainMessage(2, zzuwVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final void zzd(Bundle bundle) {
        zzg();
        Handler handler = this.zze;
        String str = zzfl.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final void zze() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                zzds zzdsVar = this.zzg;
                zzdsVar.zzb();
                Handler handler2 = this.zze;
                handler2.getClass();
                handler2.obtainMessage(3).sendToTarget();
                zzdsVar.zzc();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final void zzf() {
        if (this.zzh) {
            zze();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final /* synthetic */ void zzh(Message message) {
        zzuw zzuwVar;
        ArrayDeque arrayDeque;
        int i10 = message.what;
        zzuw zzuwVar2 = null;
        if (i10 != 1) {
            if (i10 == 2) {
                zzuwVar = (zzuw) message.obj;
                int i11 = zzuwVar.zza;
                MediaCodec.CryptoInfo cryptoInfo = zzuwVar.zzd;
                long j10 = zzuwVar.zze;
                int i12 = zzuwVar.zzf;
                try {
                    synchronized (zzb) {
                        this.zzc.queueSecureInputBuffer(i11, 0, cryptoInfo, j10, i12);
                    }
                } catch (RuntimeException e10) {
                    com.applovin.impl.sdk.i0.a(this.zzf, null, e10);
                }
            } else if (i10 == 3) {
                this.zzg.zza();
            } else if (i10 != 4) {
                com.applovin.impl.sdk.i0.a(this.zzf, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                try {
                    this.zzc.setParameters((Bundle) message.obj);
                } catch (RuntimeException e11) {
                    com.applovin.impl.sdk.i0.a(this.zzf, null, e11);
                }
            }
            if (zzuwVar2 != null) {
                arrayDeque = zza;
                synchronized (arrayDeque) {
                    arrayDeque.add(zzuwVar2);
                }
            }
        }
        zzuwVar = (zzuw) message.obj;
        try {
            this.zzc.queueInputBuffer(zzuwVar.zza, 0, zzuwVar.zzc, zzuwVar.zze, zzuwVar.zzf);
        } catch (RuntimeException e12) {
            com.applovin.impl.sdk.i0.a(this.zzf, null, e12);
        }
        zzuwVar2 = zzuwVar;
        if (zzuwVar2 != null) {
            arrayDeque = zza;
            synchronized (arrayDeque) {
                arrayDeque.add(zzuwVar2);
            }
        }
    }
}
