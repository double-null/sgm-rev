package bc;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: TagLogger.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f4452b;

    public e(String tag, c logger) {
        t.f(tag, "tag");
        t.f(logger, "logger");
        this.f4451a = tag;
        this.f4452b = logger;
    }

    @Override // bc.c
    public void b(Object obj, id.a<String> messageBuilder) {
        t.f(messageBuilder, "messageBuilder");
        c cVar = this.f4452b;
        if (obj == null) {
            obj = this.f4451a;
        }
        cVar.b(obj, messageBuilder);
    }

    @Override // bc.c
    public void d(Object obj, id.a<String> messageBuilder) {
        t.f(messageBuilder, "messageBuilder");
        c cVar = this.f4452b;
        if (obj == null) {
            obj = this.f4451a;
        }
        cVar.d(obj, messageBuilder);
    }

    @Override // bc.c
    public void g(Object obj, id.a<String> messageBuilder) {
        t.f(messageBuilder, "messageBuilder");
        c cVar = this.f4452b;
        if (obj == null) {
            obj = this.f4451a;
        }
        cVar.g(obj, messageBuilder);
    }

    public /* synthetic */ e(String str, c cVar, int i10, k kVar) {
        this(str, (i10 & 2) != 0 ? d.f4449a.a() : cVar);
    }
}
