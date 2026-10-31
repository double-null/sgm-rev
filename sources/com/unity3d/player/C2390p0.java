package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2390p0 implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ RunnableC2392q0 f12963a;

    C2390p0(RunnableC2392q0 runnableC2392q0) {
        this.f12963a = runnableC2392q0;
    }

    public final void a() {
        RunnableC2392q0 runnableC2392q0 = this.f12963a;
        runnableC2392q0.f12967a = true;
        if (runnableC2392q0.f12968b) {
            runnableC2392q0.f12969c.release();
        }
    }
}
