package io.bidmachine.analytics.internal.x;

import com.explorestack.protobuf.Struct;
import io.bidmachine.analytics.internal.E.c;
import io.bidmachine.analytics.internal.E.d;
import io.bidmachine.analytics.internal.g.h;
import io.bidmachine.analytics.internal.w.b;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.protobuf.sdk.Event;
import io.bidmachine.protobuf.sdk.Monitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.k;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends io.bidmachine.analytics.internal.w.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f17472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Struct f17473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f17474h;

    public /* synthetic */ a(String str, String str2, Struct struct, List list, d dVar, int i10, k kVar) {
        this(str, str2, struct, list, (i10 & 16) != 0 ? d.f16823g.a() : dVar);
    }

    @Override // io.bidmachine.analytics.internal.w.a
    public byte[] b() {
        try {
            r.a aVar = r.f27774b;
            Monitor.Builder name = Monitor.newBuilder().setName(this.f17472f);
            List<io.bidmachine.analytics.internal.g.d> list = this.f17474h;
            ArrayList arrayList = new ArrayList(u.u(list, 10));
            for (io.bidmachine.analytics.internal.g.d dVar : list) {
                Monitor.Record.Builder timestamp = Monitor.Record.newBuilder().setFields(c.a(dVar.a())).setTimestamp(c.a(dVar.f()));
                h hVarB = dVar.b();
                if (hVarB != null) {
                    timestamp.setError(Error.newBuilder().setName(hVarB.a()).setError(Error.Data.newBuilder().setCode(b.a(hVarB.c()).getNumber()).setDescription(hVarB.b()).build()).build());
                }
                arrayList.add(timestamp.build());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                name.addRecords((Monitor.Record) it.next());
            }
            return Event.newBuilder().setMonitor(name.build()).setExtrasPrivate(this.f17473g).build().toByteArray();
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            r.c(s.a(th));
            return null;
        }
    }

    public a(String str, String str2, Struct struct, List list, d dVar) {
        super(io.bidmachine.analytics.internal.w.c.f17469c, str, dVar, null, 8, null);
        this.f17472f = str2;
        this.f17473g = struct;
        this.f17474h = list;
    }

    @Override // io.bidmachine.analytics.internal.w.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a() {
        return this;
    }
}
