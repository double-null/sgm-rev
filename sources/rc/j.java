package rc;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: UtilsLoggerInstance.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j implements bc.c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(id.a messageBuilder) {
        t.f(messageBuilder, "$messageBuilder");
        return (String) messageBuilder.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(id.a messageBuilder) {
        t.f(messageBuilder, "$messageBuilder");
        return (String) messageBuilder.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p(id.a messageBuilder) {
        t.f(messageBuilder, "$messageBuilder");
        return (String) messageBuilder.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q(id.a messageBuilder) {
        t.f(messageBuilder, "$messageBuilder");
        return (String) messageBuilder.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r(id.a messageBuilder) {
        t.f(messageBuilder, "$messageBuilder");
        return (String) messageBuilder.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String s(id.a messageBuilder) {
        t.f(messageBuilder, "$messageBuilder");
        return (String) messageBuilder.invoke();
    }

    @Override // bc.c
    public void b(Object obj, final id.a<String> messageBuilder) {
        t.f(messageBuilder, "messageBuilder");
        if (obj == null) {
            io.bidmachine.core.a.d(new qc.b() { // from class: rc.d
                @Override // qc.b
                public final Object get() {
                    return j.n(messageBuilder);
                }
            });
        } else {
            io.bidmachine.core.a.b(obj, new qc.b() { // from class: rc.e
                @Override // qc.b
                public final Object get() {
                    return j.o(messageBuilder);
                }
            });
        }
    }

    @Override // bc.c
    public void d(Object obj, final id.a<String> messageBuilder) {
        t.f(messageBuilder, "messageBuilder");
        if (obj == null) {
            io.bidmachine.core.a.g(new qc.b() { // from class: rc.h
                @Override // qc.b
                public final Object get() {
                    return j.p(messageBuilder);
                }
            });
        } else {
            io.bidmachine.core.a.e(obj, new qc.b() { // from class: rc.i
                @Override // qc.b
                public final Object get() {
                    return j.q(messageBuilder);
                }
            });
        }
    }

    @Override // bc.c
    public void g(Object obj, final id.a<String> messageBuilder) {
        t.f(messageBuilder, "messageBuilder");
        if (obj == null) {
            io.bidmachine.core.a.p(new qc.b() { // from class: rc.f
                @Override // qc.b
                public final Object get() {
                    return j.r(messageBuilder);
                }
            });
        } else {
            io.bidmachine.core.a.m(obj, new qc.b() { // from class: rc.g
                @Override // qc.b
                public final Object get() {
                    return j.s(messageBuilder);
                }
            });
        }
    }
}
