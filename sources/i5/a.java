package i5;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UiModeManager f15984a;

    public static a5.g a() {
        UiModeManager uiModeManager = f15984a;
        if (uiModeManager == null) {
            return a5.g.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? a5.g.OTHER : a5.g.CTV;
        }
        return a5.g.MOBILE;
    }

    public static void b(Context context) {
        if (context != null) {
            f15984a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
