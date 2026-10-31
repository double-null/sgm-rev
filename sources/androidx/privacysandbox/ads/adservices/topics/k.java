package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: TopicsManagerApi33Ext4Impl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k extends m {
    /* JADX WARN: Illegal instructions before constructor call */
    public k(Context context) {
        t.f(context, "context");
        Object systemService = context.getSystemService((Class<Object>) b.d.class);
        t.e(systemService, "context.getSystemService…opicsManager::class.java)");
        super((b.d) systemService);
    }
}
