package io.bidmachine.rendering.ad.fullscreen;

import android.os.Bundle;
import kotlin.jvm.internal.t;
import na.a;
import na.n;
import pa.b;
import wb.b0;

/* JADX INFO: loaded from: classes5.dex */
public final class FullScreenActivity extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f20405a;

    private final void e() {
        b0.f(this);
        n nVar = this.f20405a;
        if (nVar != null) {
            nVar.a0();
        }
        this.f20405a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pa.b, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n nVar = a.f22921a;
        this.f20405a = nVar;
        if (nVar == null) {
            e();
        } else {
            nVar.e0(this);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isChangingConfigurations()) {
            return;
        }
        if (t.a(a.f22921a, this.f20405a)) {
            a.f22921a = null;
        }
        e();
    }
}
