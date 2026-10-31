package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f1032a = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h1 h1VarS = h1.s(context, attributeSet, f1032a);
        setBackgroundDrawable(h1VarS.f(0));
        h1VarS.u();
    }
}
