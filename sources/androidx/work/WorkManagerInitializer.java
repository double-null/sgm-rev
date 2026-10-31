package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements z0.a<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f3596a = l.f("WrkMgrInitializer");

    @Override // z0.a
    public List<Class<? extends z0.a<?>>> a() {
        return Collections.emptyList();
    }

    @Override // z0.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v create(Context context) {
        l.c().a(f3596a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        v.e(context, new b.C0073b().a());
        return v.d(context);
    }
}
