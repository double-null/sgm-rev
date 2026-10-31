package oc;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: ViewHelper.java */
/* JADX INFO: loaded from: classes5.dex */
public class r {
    public static boolean a(ViewGroup viewGroup, View view) {
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup2 = (ViewGroup) parent;
        return viewGroup2.equals(viewGroup) || a(viewGroup, viewGroup2);
    }

    public static void b(View view) {
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public static void c(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        try {
            viewGroup.removeAllViews();
        } catch (Exception e10) {
            io.bidmachine.core.a.o(e10);
        }
        d(viewGroup, view, layoutParams);
    }

    public static void d(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        try {
            b(view);
            if (layoutParams != null) {
                viewGroup.addView(view, layoutParams);
            } else {
                viewGroup.addView(view);
            }
        } catch (Exception e10) {
            io.bidmachine.core.a.o(e10);
        }
    }
}
