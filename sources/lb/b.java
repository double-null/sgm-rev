package lb;

import kotlin.jvm.internal.t;
import pa.h;
import ud.o0;
import ud.p0;
import ud.t2;
import zc.j;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements o0, a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f21943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f21944b;

    public b(a adState, h coroutineDispatchers) {
        t.f(adState, "adState");
        t.f(coroutineDispatchers, "coroutineDispatchers");
        this.f21943a = adState;
        this.f21944b = t2.b(null, 1, null).z(coroutineDispatchers.i());
        if (adState.i()) {
            p0.c(this, null, 1, null);
        } else {
            adState.l(this);
        }
    }

    @Override // lb.a.b
    public void a(a source, a.EnumC0355a event) {
        t.f(source, "source");
        t.f(event, "event");
        if (event == a.EnumC0355a.Destroyed && t.a(this.f21943a, source)) {
            p0.c(this, null, 1, null);
            source.m(this);
        }
    }

    @Override // ud.o0
    public j q() {
        return this.f21944b;
    }
}
