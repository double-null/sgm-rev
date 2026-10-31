package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class aa extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ IBinder f11359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f11360b;

    aa(ad adVar, IBinder iBinder) {
        this.f11359a = iBinder;
        this.f11360b = adVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        this.f11360b.f11362a.f11377o = (IInterface) this.f11360b.f11362a.f11372j.a(this.f11359a);
        ae.r(this.f11360b.f11362a);
        this.f11360b.f11362a.f11370h = false;
        Iterator it = this.f11360b.f11362a.f11367e.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f11360b.f11362a.f11367e.clear();
    }
}
