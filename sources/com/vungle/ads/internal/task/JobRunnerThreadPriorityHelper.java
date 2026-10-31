package com.vungle.ads.internal.task;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: JobRunnerThreadPriorityHelper.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class JobRunnerThreadPriorityHelper implements ThreadPriorityHelper {
    @Override // com.vungle.ads.internal.task.ThreadPriorityHelper
    public int makeAndroidThreadPriority(JobInfo jobInfo) {
        t.f(jobInfo, "jobInfo");
        return Math.min(19, Math.abs(Math.min(0, jobInfo.getPriority() - 2)) + 10);
    }
}
