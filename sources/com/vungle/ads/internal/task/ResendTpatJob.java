package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import c0.IbU.elEbP;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.util.PathProvider;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import wc.m;
import wc.o;

/* JADX INFO: compiled from: ResendTpatJob.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ResendTpatJob implements Job {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "ResendTpatJob";
    private final Context context;
    private final PathProvider pathProvider;

    /* JADX INFO: compiled from: ResendTpatJob.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final JobInfo makeJobInfo() {
            return new JobInfo(ResendTpatJob.TAG).setPriority(0).setUpdateCurrent(true);
        }
    }

    public ResendTpatJob(Context context, PathProvider pathProvider) {
        t.f(context, "context");
        t.f(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    /* JADX INFO: renamed from: onRunJob$lambda-0, reason: not valid java name */
    private static final TpatSender m289onRunJob$lambda0(wc.k<TpatSender> kVar) {
        return kVar.getValue();
    }

    public final Context getContext() {
        return this.context;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    @Override // com.vungle.ads.internal.task.Job
    public int onRunJob(Bundle bundle, JobRunner jobRunner) {
        t.f(bundle, elEbP.zqDjWCBDJ);
        t.f(jobRunner, "jobRunner");
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        m289onRunJob$lambda0(m.b(o.SYNCHRONIZED, new ResendTpatJob$onRunJob$$inlined$inject$1(this.context))).resendStoredTpats$vungle_ads_release();
        return 0;
    }
}
