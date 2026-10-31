package androidx.core.widget;

import android.os.Build;

/* JADX INFO: compiled from: AutoSizeableTextView.java */
/* JADX INFO: loaded from: classes.dex */
public interface b {

    @Deprecated
    public static final boolean S8;

    static {
        S8 = Build.VERSION.SDK_INT >= 27;
    }
}
