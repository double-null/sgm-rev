package com.adjust.sdk;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityHandler f5768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5769b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5770c = 0;

    public k1(ActivityHandler activityHandler) {
        this.f5768a = activityHandler;
    }

    public final void a(Runnable runnable, String str) {
        if (this.f5770c != 3) {
            runnable.run();
            return;
        }
        this.f5768a.getAdjustConfig().getLogger().debug("Enqueuing \"" + str + "\" action to be executed after first session delay ends", new Object[0]);
        this.f5769b.add(runnable);
    }

    public final void b(String str, IRunActivityHandler iRunActivityHandler) {
        if (this.f5770c != 3) {
            iRunActivityHandler.run(this.f5768a);
            return;
        }
        this.f5768a.getAdjustConfig().getLogger().debug("Enqueuing \"" + str + "\" action to be executed after first session delay ends", new Object[0]);
        this.f5768a.getAdjustConfig().preLaunchActions.preLaunchActionsArray.add(iRunActivityHandler);
    }
}
