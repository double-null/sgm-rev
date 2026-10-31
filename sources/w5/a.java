package w5;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UiModeManager f27526a;

    public static o5.g a() {
        UiModeManager uiModeManager = f27526a;
        if (uiModeManager == null) {
            return o5.g.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? o5.g.OTHER : o5.g.CTV;
        }
        return o5.g.MOBILE;
    }

    public static void b(Context context) {
        if (context != null) {
            f27526a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
