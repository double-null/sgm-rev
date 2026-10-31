package com.vungle.ads.internal.task;

import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface Job {

    /* JADX INFO: compiled from: Job.kt */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int FAILURE = 1;
        public static final int RESCHEDULE = 2;
        public static final int SUCCESS = 0;

        /* JADX INFO: compiled from: Job.kt */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int FAILURE = 1;
            public static final int RESCHEDULE = 2;
            public static final int SUCCESS = 0;

            private Companion() {
            }
        }
    }

    int onRunJob(Bundle bundle, JobRunner jobRunner);
}
