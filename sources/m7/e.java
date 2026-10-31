package m7;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import g7.n;

/* JADX INFO: loaded from: classes4.dex */
public class e extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f22203e;

    public e(Context context) {
        super(context);
        this.f22203e = "%1.0fs";
    }

    @Override // m7.b, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (TextUtils.isEmpty(getText())) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setProgress(int i10) {
        setText(this.f22203e.replace("%1.0f", String.valueOf(i10)));
    }

    public void setRemaining(int i10) {
        setText(this.f22203e.replace("%1.0f", String.valueOf(i10)));
    }

    @Override // m7.b, g7.m
    public void setStyle(n nVar) {
        super.setStyle(nVar);
        String strH = nVar.h();
        if (strH != null) {
            this.f22203e = strH;
        }
    }
}
