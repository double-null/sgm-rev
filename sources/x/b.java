package x;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: AccessibilityEventCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }
}
