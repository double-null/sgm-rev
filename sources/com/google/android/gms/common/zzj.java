package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzj extends com.google.android.gms.common.internal.zzy {
    private final int zza;

    protected zzj(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 25);
        this.zza = Arrays.hashCode(bArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof com.google.android.gms.common.internal.zzz)) {
            return false;
        }
        try {
            com.google.android.gms.common.internal.zzz zzzVar = (com.google.android.gms.common.internal.zzz) obj;
            if (zzzVar.zze() != this.zza) {
                return false;
            }
            return Arrays.equals(zzc(), (byte[]) ObjectWrapper.unwrap(zzzVar.zzd()));
        } catch (RemoteException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return false;
        }
    }

    public final int hashCode() {
        return this.zza;
    }

    abstract byte[] zzc();

    @Override // com.google.android.gms.common.internal.zzz
    public final IObjectWrapper zzd() {
        return ObjectWrapper.wrap(zzc());
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final int zze() {
        return this.zza;
    }
}
