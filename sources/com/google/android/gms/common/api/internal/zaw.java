package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zaw implements zabt {
    final /* synthetic */ zax zaa;

    /* synthetic */ zaw(zax zaxVar, byte[] bArr) {
        Objects.requireNonNull(zaxVar);
        this.zaa = zaxVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    public final void zaa(Bundle bundle) {
        zax zaxVar = this.zaa;
        zaxVar.zay().lock();
        try {
            zaxVar.zav(ConnectionResult.RESULT_SUCCESS);
            zaxVar.zao();
        } finally {
            this.zaa.zay().unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    public final void zab(ConnectionResult connectionResult) {
        zax zaxVar = this.zaa;
        zaxVar.zay().lock();
        try {
            zaxVar.zav(connectionResult);
            zaxVar.zao();
        } finally {
            this.zaa.zay().unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    public final void zac(int i10, boolean z10) {
        zax zaxVar = this.zaa;
        zaxVar.zay().lock();
        try {
            if (zaxVar.zaw()) {
                zaxVar.zax(false);
                zaxVar.zap(i10, z10);
            } else {
                zaxVar.zax(true);
                zaxVar.zar().onConnectionSuspended(i10);
            }
        } finally {
            this.zaa.zay().unlock();
        }
    }
}
