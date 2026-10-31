package com.vungle.ads.internal.task;

/* JADX INFO: compiled from: JobRunner.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface JobRunner {
    void cancelPendingJob(String str);

    void execute(JobInfo jobInfo);
}
