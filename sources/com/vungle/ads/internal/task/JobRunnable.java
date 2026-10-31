package com.vungle.ads.internal.task;

import android.os.Bundle;
import android.os.Process;
import com.vungle.ads.internal.util.Logger;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: JobRunnable.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class JobRunnable extends PriorityRunnable {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = JobRunnable.class.getSimpleName();
    private final JobCreator creator;
    private final JobRunner jobRunner;
    private final JobInfo jobinfo;
    private final ThreadPriorityHelper threadPriorityHelper;

    /* JADX INFO: compiled from: JobRunnable.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public JobRunnable(JobInfo jobinfo, JobCreator creator, JobRunner jobRunner, ThreadPriorityHelper threadPriorityHelper) {
        t.f(jobinfo, "jobinfo");
        t.f(creator, "creator");
        t.f(jobRunner, "jobRunner");
        this.jobinfo = jobinfo;
        this.creator = creator;
        this.jobRunner = jobRunner;
        this.threadPriorityHelper = threadPriorityHelper;
    }

    @Override // com.vungle.ads.internal.task.PriorityRunnable
    public int getPriority() {
        return this.jobinfo.getPriority();
    }

    @Override // java.lang.Runnable
    public void run() {
        ThreadPriorityHelper threadPriorityHelper = this.threadPriorityHelper;
        if (threadPriorityHelper != null) {
            try {
                int iMakeAndroidThreadPriority = threadPriorityHelper.makeAndroidThreadPriority(this.jobinfo);
                Process.setThreadPriority(iMakeAndroidThreadPriority);
                Logger.Companion companion = Logger.Companion;
                String TAG2 = TAG;
                t.e(TAG2, "TAG");
                companion.d(TAG2, "Setting process thread prio = " + iMakeAndroidThreadPriority + " for " + this.jobinfo.getJobTag());
            } catch (Throwable unused) {
                Logger.Companion companion2 = Logger.Companion;
                String TAG3 = TAG;
                t.e(TAG3, "TAG");
                companion2.e(TAG3, "Error on setting process thread priority");
            }
        }
        try {
            String jobTag = this.jobinfo.getJobTag();
            Bundle extras = this.jobinfo.getExtras();
            Logger.Companion companion3 = Logger.Companion;
            String TAG4 = TAG;
            t.e(TAG4, "TAG");
            companion3.d(TAG4, "Start job " + jobTag + "Thread " + Thread.currentThread().getName());
            int iOnRunJob = this.creator.create(jobTag).onRunJob(extras, this.jobRunner);
            t.e(TAG4, "TAG");
            companion3.d(TAG4, "On job finished " + jobTag + " with result " + iOnRunJob);
            if (iOnRunJob == 2) {
                long jMakeNextRescedule = this.jobinfo.makeNextRescedule();
                if (jMakeNextRescedule > 0) {
                    this.jobinfo.setDelay(jMakeNextRescedule);
                    this.jobRunner.execute(this.jobinfo);
                    t.e(TAG4, "TAG");
                    companion3.d(TAG4, "Rescheduling " + jobTag + " in " + jMakeNextRescedule);
                }
            }
        } catch (Exception e10) {
            Logger.Companion companion4 = Logger.Companion;
            String TAG5 = TAG;
            t.e(TAG5, "TAG");
            companion4.e(TAG5, "Cannot create job" + e10.getLocalizedMessage());
        }
    }

    public static /* synthetic */ void getPriority$annotations() {
    }
}
