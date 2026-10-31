package io.bidmachine.analytics.internal.y;

import com.explorestack.protobuf.BytesValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import io.bidmachine.analytics.internal.E.c;
import io.bidmachine.analytics.internal.E.d;
import io.bidmachine.analytics.internal.g.b;
import io.bidmachine.analytics.internal.g.e;
import io.bidmachine.analytics.internal.g.h;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.protobuf.sdk.Event;
import io.bidmachine.protobuf.sdk.Reader;
import java.io.FileNotFoundException;
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
    private final String f17475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Struct f17476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f17477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC0314a f17478i;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.y.a$a, reason: collision with other inner class name */
    public interface InterfaceC0314a {
        BytesValue a(e.a aVar);
    }

    public /* synthetic */ a(String str, String str2, Struct struct, List list, InterfaceC0314a interfaceC0314a, d dVar, int i10, k kVar) {
        this(str, str2, struct, list, interfaceC0314a, (i10 & 32) != 0 ? d.f16823g.a() : dVar);
    }

    @Override // io.bidmachine.analytics.internal.w.a
    public byte[] b() {
        Object next;
        Timestamp timestampA;
        Object objC;
        try {
            r.a aVar = r.f27774b;
            Reader.Builder name = Reader.newBuilder().setName(this.f17475f);
            List<e> list = this.f17477h;
            ArrayList arrayList = new ArrayList(u.u(list, 10));
            for (e eVar : list) {
                Reader.Record.Builder rule = Reader.Record.newBuilder().setRule(a(eVar.e()));
                h hVarB = eVar.b();
                if (hVarB == null) {
                    try {
                        r.a aVar2 = r.f27774b;
                        objC = r.c(rule.setRawData(this.f17478i.a(eVar.e())));
                    } catch (Throwable th) {
                        r.a aVar3 = r.f27774b;
                        objC = r.c(s.a(th));
                    }
                    Throwable thG = r.g(objC);
                    if (thG != null) {
                        hVarB = new h(this.f17475f, thG instanceof b ? true : thG instanceof FileNotFoundException ? h.a.READER_NO_CONTENT : thG instanceof SecurityException ? h.a.READER_NO_ACCESS : h.a.READER_INVALID, io.bidmachine.analytics.internal.E.e.a(thG));
                    }
                }
                if (hVarB != null) {
                    rule.setError(Error.newBuilder().setName(hVarB.a()).setError(Error.Data.newBuilder().setCode(io.bidmachine.analytics.internal.w.b.a(hVarB.c()).getNumber()).setDescription(hVarB.b()).build()).build());
                }
                arrayList.add(rule.build());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                name.addRecords((Reader.Record) it.next());
            }
            Iterator it2 = this.f17477h.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    long jF = ((e) next).f();
                    do {
                        Object next2 = it2.next();
                        long jF2 = ((e) next2).f();
                        if (jF < jF2) {
                            next = next2;
                            jF = jF2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            e eVar2 = (e) next;
            if (eVar2 != null && (timestampA = c.a(eVar2.f())) != null) {
                name.setTimestamp(timestampA);
            }
            return Event.newBuilder().setReader(name.build()).setExtrasPrivate(this.f17476g).build().toByteArray();
        } catch (Throwable th2) {
            r.a aVar4 = r.f27774b;
            r.c(s.a(th2));
            return null;
        }
    }

    private final Reader.Rule.Builder a(e.a aVar) {
        Reader.Rule.Builder builderNewBuilder = Reader.Rule.newBuilder();
        if (aVar instanceof e.a.C0280a) {
            e.a.C0280a c0280a = (e.a.C0280a) aVar;
            builderNewBuilder.setGeneralRule(Reader.Rule.GeneralRule.newBuilder().setTag(c.c(c0280a.b())).setPath(c.c(c0280a.a())).build());
        } else if (aVar instanceof e.a.b) {
            e.a.b bVar = (e.a.b) aVar;
            Reader.Rule.PurRule.Builder shouldReport = Reader.Rule.PurRule.newBuilder().setTag(c.c(bVar.d())).setPath(c.c(bVar.a())).setShouldReport(c.a(bVar.c()));
            String strB = bVar.b();
            if (strB != null) {
                shouldReport.setQuery(c.c(strB));
            }
            builderNewBuilder.setPurRule(shouldReport.build());
        }
        return builderNewBuilder;
    }

    public a(String str, String str2, Struct struct, List list, InterfaceC0314a interfaceC0314a, d dVar) {
        super(io.bidmachine.analytics.internal.w.c.f17469c, str, dVar, null, 8, null);
        this.f17475f = str2;
        this.f17476g = struct;
        this.f17477h = list;
        this.f17478i = interfaceC0314a;
    }

    @Override // io.bidmachine.analytics.internal.w.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a() {
        return this;
    }
}
