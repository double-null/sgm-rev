package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class x extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f11409a;

    x(ae aeVar) {
        this.f11409a = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.f11409a.f11369g) {
            if (this.f11409a.f11375m.get() > 0 && this.f11409a.f11375m.decrementAndGet() > 0) {
                this.f11409a.f11365c.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            ae aeVar = this.f11409a;
            if (aeVar.f11377o != null) {
                aeVar.f11365c.d("Unbind from service.", new Object[0]);
                ae aeVar2 = this.f11409a;
                aeVar2.f11364b.unbindService(aeVar2.f11376n);
                this.f11409a.f11370h = false;
                this.f11409a.f11377o = null;
                this.f11409a.f11376n = null;
            }
            this.f11409a.x();
        }
    }
}
