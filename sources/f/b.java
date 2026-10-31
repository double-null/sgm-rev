package f;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ActivityResultContracts.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a<String[], Map<String, Boolean>> {
    static Intent b(String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // f.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, String[] strArr) {
        return b(strArr);
    }

    @Override // f.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a.C0220a<Map<String, Boolean>> getSynchronousResult(Context context, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new a.C0220a<>(Collections.emptyMap());
        }
        androidx.collection.a aVar = new androidx.collection.a();
        boolean z10 = true;
        for (String str : strArr) {
            boolean z11 = androidx.core.content.a.a(context, str) == 0;
            aVar.put(str, Boolean.valueOf(z11));
            if (!z11) {
                z10 = false;
            }
        }
        if (z10) {
            return new a.C0220a<>(aVar);
        }
        return null;
    }

    @Override // f.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Map<String, Boolean> parseResult(int i10, Intent intent) {
        if (i10 != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        int length = stringArrayExtra.length;
        for (int i11 = 0; i11 < length; i11++) {
            map.put(stringArrayExtra[i11], Boolean.valueOf(intArrayExtra[i11] == 0));
        }
        return map;
    }
}
