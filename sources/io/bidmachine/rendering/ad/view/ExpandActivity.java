package io.bidmachine.rendering.ad.view;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.t;
import oa.s;
import oa.u;
import pa.b;
import wb.b0;

/* JADX INFO: loaded from: classes5.dex */
public final class ExpandActivity extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s f20406a;

    private final void e() {
        b0.f(this);
        s sVar = this.f20406a;
        if (sVar != null) {
            sVar.u0();
        }
        this.f20406a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pa.b, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WeakReference weakReference = u.f23328a;
        s sVar = weakReference != null ? (s) weakReference.get() : null;
        this.f20406a = sVar;
        if (sVar == null) {
            e();
        } else {
            sVar.Z0(this);
            sVar.U0();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isChangingConfigurations()) {
            return;
        }
        WeakReference weakReference = u.f23328a;
        if (t.a(weakReference != null ? (s) weakReference.get() : null, this.f20406a)) {
            u.a();
        }
        e();
    }
}
