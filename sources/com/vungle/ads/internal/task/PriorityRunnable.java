package com.vungle.ads.internal.task;

import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: PriorityRunnable.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class PriorityRunnable implements VungleThreadPoolExecutor.ComparableRunnable {
    @Override // java.lang.Comparable
    public int compareTo(Object other) {
        t.f(other, "other");
        if (!(other instanceof PriorityRunnable)) {
            return -1;
        }
        return t.g(((PriorityRunnable) other).getPriority(), getPriority());
    }

    public abstract int getPriority();
}
