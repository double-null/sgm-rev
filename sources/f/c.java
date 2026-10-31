package f;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: ActivityResultContracts.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a<Intent, androidx.activity.result.a> {
    @Override // f.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public androidx.activity.result.a parseResult(int i10, Intent intent) {
        return new androidx.activity.result.a(i10, intent);
    }

    @Override // f.a
    public Intent createIntent(Context context, Intent intent) {
        return intent;
    }
}
