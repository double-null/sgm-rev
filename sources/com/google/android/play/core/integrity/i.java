package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements k {
    i() {
    }

    @Override // com.google.android.play.core.integrity.k
    public final ApiException a(Bundle bundle) {
        int i10 = bundle.getInt("error");
        if (i10 == 0) {
            return null;
        }
        return new IntegrityServiceException(i10, null);
    }
}
