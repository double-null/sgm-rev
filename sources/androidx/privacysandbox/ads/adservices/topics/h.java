package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: TopicsManagerApi31Ext11Impl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h extends m {
    /* JADX WARN: Illegal instructions before constructor call */
    public h(Context context) {
        t.f(context, "context");
        b.d dVarA = b.d.a(context);
        t.e(dVarA, "get(context)");
        super(dVarA);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.m
    public b.a c(b request) {
        t.f(request, "request");
        c.f3026a.a(request);
        return null;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.m
    public d d(b.b response) {
        t.f(response, "response");
        return e.f3029a.b(response);
    }
}
