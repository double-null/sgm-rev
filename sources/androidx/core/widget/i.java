package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: PopupWindowCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: compiled from: PopupWindowCompat.java */
    static class a {
        static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        static void c(PopupWindow popupWindow, boolean z10) {
            popupWindow.setOverlapAnchor(z10);
        }

        static void d(PopupWindow popupWindow, int i10) {
            popupWindow.setWindowLayoutType(i10);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z10) {
        a.c(popupWindow, z10);
    }

    public static void b(PopupWindow popupWindow, int i10) {
        a.d(popupWindow, i10);
    }

    public static void c(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
        popupWindow.showAsDropDown(view, i10, i11, i12);
    }
}
