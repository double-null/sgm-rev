package io.bidmachine.analytics.internal.z;

import com.explorestack.protobuf.BytesValue;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements io.bidmachine.analytics.internal.y.a.InterfaceC0314a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.o.b f17479a;

    public b(io.bidmachine.analytics.internal.o.b bVar) {
        this.f17479a = bVar;
    }

    @Override // io.bidmachine.analytics.internal.y.a.InterfaceC0314a
    public BytesValue a(io.bidmachine.analytics.internal.g.e.a aVar) throws io.bidmachine.analytics.internal.g.b {
        List listB = this.f17479a.b();
        if (listB == null) {
            throw new io.bidmachine.analytics.internal.g.b("List is null");
        }
        if (listB.isEmpty()) {
            throw new io.bidmachine.analytics.internal.g.b("List is empty");
        }
        if (listB.size() >= this.f17479a.a()) {
            return io.bidmachine.analytics.internal.E.c.b(io.bidmachine.analytics.internal.E.e.a(listB).toString());
        }
        throw new io.bidmachine.analytics.internal.g.b("List size less then limit for send");
    }
}
