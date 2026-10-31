package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: TopicsManagerApi33Ext5Impl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {
    /* JADX WARN: Illegal instructions before constructor call */
    public l(Context context) {
        t.f(context, "context");
        Object systemService = context.getSystemService((Class<Object>) b.d.class);
        t.e(systemService, "context.getSystemService…opicsManager::class.java)");
        super((b.d) systemService);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.m
    public b.a c(b request) {
        t.f(request, "request");
        c.f3026a.a(request);
        return null;
    }
}
