package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.task.JobRunner;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: com.vungle.ads.internal.AdInternal$_set_adState_$lambda-1$$inlined$inject$1, reason: invalid class name */
/* JADX INFO: compiled from: ServiceLocator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdInternal$_set_adState_$lambda1$$inlined$inject$1 extends u implements id.a<JobRunner> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdInternal$_set_adState_$lambda1$$inlined$inject$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.JobRunner, java.lang.Object] */
    @Override // id.a
    public final JobRunner invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getService(JobRunner.class);
    }
}
