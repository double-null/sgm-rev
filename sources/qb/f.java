package qb;

import pa.t;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements bc.c {
    private final void h(Object obj, id.a aVar) {
        if (t.j()) {
            if (obj != null) {
                t.b(obj, (String) aVar.invoke(), new Object[0]);
            } else {
                t.c((String) aVar.invoke(), new Object[0]);
            }
        }
    }

    private final void i(Object obj, id.a aVar) {
        if (t.j()) {
            if (obj != null) {
                t.g(obj, (String) aVar.invoke(), new Object[0]);
            } else {
                t.h((String) aVar.invoke(), new Object[0]);
            }
        }
    }

    @Override // bc.c
    public void b(Object obj, id.a<String> messageBuilder) {
        kotlin.jvm.internal.t.f(messageBuilder, "messageBuilder");
        i(obj, messageBuilder);
    }

    @Override // bc.c
    public void d(Object obj, id.a<String> messageBuilder) {
        kotlin.jvm.internal.t.f(messageBuilder, "messageBuilder");
        h(obj, messageBuilder);
    }

    @Override // bc.c
    public void g(Object obj, id.a<String> messageBuilder) {
        kotlin.jvm.internal.t.f(messageBuilder, "messageBuilder");
        i(obj, messageBuilder);
    }
}
