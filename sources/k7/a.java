package k7;

import android.os.Bundle;
import android.text.TextUtils;
import h7.e;

/* JADX INFO: loaded from: classes4.dex */
public class a implements b {
    @Override // k7.b
    public String a(String str, Bundle bundle) {
        int i10;
        if (!TextUtils.isEmpty(str) && bundle != null && bundle.containsKey("params_error_code") && (i10 = bundle.getInt("params_error_code", -1)) > -1) {
            e.a("VastAdUrlProcessor", "Before prepare url: %s", str);
            if (str.contains("[ERRORCODE]")) {
                str = str.replace("[ERRORCODE]", String.valueOf(i10));
            }
            if (str.contains("%5BERRORCODE%5D")) {
                str = str.replace("%5BERRORCODE%5D", String.valueOf(i10));
            }
            e.a("VastAdUrlProcessor", "After prepare url: %s", str);
        }
        return str;
    }
}
