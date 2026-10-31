package pa;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b extends Activity {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(b this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        this$0.b();
    }

    protected void d() {
        wb.b0.i(this, -16777216);
        wb.b0.j(this);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        d();
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, new OnBackInvokedCallback() { // from class: pa.a
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    b.c(this.f23713a);
                }
            });
        }
    }

    protected void b() {
    }
}
