package androidx.core.view;

import android.view.MotionEvent;

/* JADX INFO: compiled from: MotionEventCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public static boolean a(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }
}
