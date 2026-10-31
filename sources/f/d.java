package f;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: ActivityResultContracts.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a<androidx.activity.result.d, androidx.activity.result.a> {
    @Override // f.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, androidx.activity.result.d dVar) {
        return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", dVar);
    }

    @Override // f.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public androidx.activity.result.a parseResult(int i10, Intent intent) {
        return new androidx.activity.result.a(i10, intent);
    }
}
