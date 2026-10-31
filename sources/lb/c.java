package lb;

import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import pa.h;
import wc.k;
import wc.m;
import wc.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final h f21945p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final k f21946q;

    static final class a extends u implements id.a {
        a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            c cVar = c.this;
            return new b(cVar, cVar.p());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String parent, h coroutineDispatchers) {
        super(parent);
        t.f(parent, "parent");
        t.f(coroutineDispatchers, "coroutineDispatchers");
        this.f21945p = coroutineDispatchers;
        this.f21946q = m.b(o.PUBLICATION, new a());
    }

    public final h p() {
        return this.f21945p;
    }

    public final b q() {
        return (b) this.f21946q.getValue();
    }
}
