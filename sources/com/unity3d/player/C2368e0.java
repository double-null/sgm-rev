package com.unity3d.player;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: renamed from: com.unity3d.player.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2368e0 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC2366d0 f12889a;

    public C2368e0(Handler handler, InterfaceC2366d0 interfaceC2366d0) {
        super(handler);
        this.f12889a = interfaceC2366d0;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        InterfaceC2366d0 interfaceC2366d0 = this.f12889a;
        if (interfaceC2366d0 != null) {
            ((OrientationLockListener) interfaceC2366d0).b();
        }
    }
}
