package com.vungle.ads.internal.task;

import android.content.Context;
import com.vungle.ads.internal.util.PathProvider;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleJobCreator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VungleJobCreator implements JobCreator {
    private final Context context;
    private final PathProvider pathProvider;

    public VungleJobCreator(Context context, PathProvider pathProvider) {
        t.f(context, "context");
        t.f(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    @Override // com.vungle.ads.internal.task.JobCreator
    public Job create(String tag) throws UnknownTagException {
        t.f(tag, "tag");
        if (tag.length() == 0) {
            throw new UnknownTagException("Job tag is null");
        }
        if (t.a(tag, CleanupJob.TAG)) {
            return new CleanupJob(this.context, this.pathProvider);
        }
        if (t.a(tag, ResendTpatJob.TAG)) {
            return new ResendTpatJob(this.context, this.pathProvider);
        }
        throw new UnknownTagException("Unknown Job Type " + tag);
    }

    public final Context getContext() {
        return this.context;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }
}
