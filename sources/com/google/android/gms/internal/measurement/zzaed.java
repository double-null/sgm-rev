package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.util.AbstractList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaed {
    public static final byte[] zza;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
    public class zza<T> extends AbstractList<T> {
        private final zzaeb zza;
        private final zzaec<T> zzb;

        public zza(zzaeb zzaebVar, zzaec<T> zzaecVar) {
            this.zza = zzaebVar;
            this.zzb = zzaecVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            return (T) this.zzb.zza(this.zza.zzf(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.zza.size();
        }
    }

    static {
        byte[] bArr = new byte[0];
        zza = bArr;
        ByteBuffer.wrap(bArr);
        zzacv.zzN(bArr, 0, 0, false);
    }

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int zzb(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
