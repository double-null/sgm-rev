package sb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.jvm.internal.t;
import pa.s;
import wb.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        t.f(context, "context");
        setClickable(false);
        setFocusable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(d this$0, Drawable drawable) {
        t.f(this$0, "this$0");
        this$0.setBackground(drawable);
    }

    public final void setWatermark(final Drawable drawable) {
        a0.c(new s() { // from class: sb.c
            @Override // wb.v
            public final void p() {
                d.b(this.f25398a, drawable);
            }
        });
    }
}
