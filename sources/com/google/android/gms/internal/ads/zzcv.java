package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcv extends zzcp {
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.zzb.zzd;
        if (i11 == 3) {
            i10 += i10;
        } else if (i11 == 4) {
            i10 /= 2;
        } else {
            if (i11 != 21) {
                if (i11 == 22) {
                    i10 /= 2;
                } else if (i11 != 268435456) {
                    if (i11 != 1342177280) {
                        if (i11 == 1610612736) {
                            i10 /= 2;
                        } else {
                            if (i11 != 1879048192) {
                                throw new IllegalStateException();
                            }
                            i10 /= 4;
                        }
                    }
                }
            }
            i10 /= 3;
            i10 += i10;
        }
        ByteBuffer byteBufferZzk = zzk(i10);
        int i12 = this.zzb.zzd;
        if (i12 == 3) {
            while (iPosition < iLimit) {
                byteBufferZzk.put((byte) 0);
                byteBufferZzk.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i12 == 4) {
            while (iPosition < iLimit) {
                float f10 = byteBuffer.getFloat(iPosition);
                String str = zzfl.zza;
                short sMax = (short) (Math.max(-1.0f, Math.min(f10, 1.0f)) * 32767.0f);
                byteBufferZzk.put((byte) (sMax & 255));
                byteBufferZzk.put((byte) ((sMax >> 8) & 255));
                iPosition += 4;
            }
        } else if (i12 == 21) {
            while (iPosition < iLimit) {
                byteBufferZzk.put(byteBuffer.get(iPosition + 1));
                byteBufferZzk.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i12 == 22) {
            while (iPosition < iLimit) {
                byteBufferZzk.put(byteBuffer.get(iPosition + 2));
                byteBufferZzk.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i12 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferZzk.put(byteBuffer.get(iPosition + 1));
                byteBufferZzk.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i12 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferZzk.put(byteBuffer.get(iPosition + 1));
                byteBufferZzk.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else if (i12 == 1610612736) {
            while (iPosition < iLimit) {
                byteBufferZzk.put(byteBuffer.get(iPosition + 1));
                byteBufferZzk.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        } else {
            if (i12 != 1879048192) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                short sZzm = (short) (zzfl.zzm(byteBuffer.getDouble(iPosition), -1.0d, 1.0d) * 32767.0d);
                byteBufferZzk.put((byte) (sZzm & 255));
                byteBufferZzk.put((byte) ((sZzm >> 8) & 255));
                iPosition += 8;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferZzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        int i10 = zzclVar.zzd;
        if (zzfl.zzD(i10)) {
            return i10 != 2 ? new zzcl(zzclVar.zzb, zzclVar.zzc, 2) : zzcl.zza;
        }
        throw new zzcn("Unhandled input format:", zzclVar);
    }
}
