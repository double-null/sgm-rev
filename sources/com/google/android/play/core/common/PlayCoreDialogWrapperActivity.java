package com.google.android.play.core.common;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: com.google.android.play:core-common@@2.0.4 */
/* JADX INFO: loaded from: classes2.dex */
public class PlayCoreDialogWrapperActivity extends Activity {
    private ResultReceiver zza;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza() {
        ResultReceiver resultReceiver = this.zza;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 0 && (resultReceiver = this.zza) != null) {
            if (i11 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i11 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        VMRunner.invoke("uivR2AOvbLCREqxS", new Object[]{this, bundle});
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.zza);
    }
}
