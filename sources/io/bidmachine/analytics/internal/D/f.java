package io.bidmachine.analytics.internal.D;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u;
import wc.g0;
import wc.k;
import wc.m;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f16819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f16820b = m.a(new a());

    static final class a extends u implements id.a {
        a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.B.c invoke() {
            return new io.bidmachine.analytics.internal.B.c(f.this.f16819a);
        }
    }

    public f(SQLiteDatabase sQLiteDatabase) {
        this.f16819a = sQLiteDatabase;
    }

    @Override // io.bidmachine.analytics.internal.D.e
    public Object b(io.bidmachine.analytics.internal.g.e eVar) {
        return a().c(io.bidmachine.analytics.internal.C.f.a(eVar));
    }

    @Override // io.bidmachine.analytics.internal.D.e
    public Object c(List list) {
        io.bidmachine.analytics.internal.B.c cVarA = a();
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.C.f.a((io.bidmachine.analytics.internal.g.e) it.next()));
        }
        return cVarA.d(arrayList);
    }

    private final io.bidmachine.analytics.internal.B.c a() {
        return (io.bidmachine.analytics.internal.B.c) this.f16820b.getValue();
    }

    @Override // io.bidmachine.analytics.internal.D.e
    public Object b(List list) {
        io.bidmachine.analytics.internal.B.c cVarA = a();
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.C.f.a((io.bidmachine.analytics.internal.g.e) it.next()));
        }
        return cVarA.a(arrayList);
    }

    @Override // io.bidmachine.analytics.internal.D.e
    public Object a(io.bidmachine.analytics.internal.g.e eVar) {
        return a().a(io.bidmachine.analytics.internal.C.f.a(eVar));
    }

    @Override // io.bidmachine.analytics.internal.D.e
    public Object a(String str, io.bidmachine.analytics.internal.g.e.a aVar) {
        Object objA = a().a(str, io.bidmachine.analytics.internal.C.f.a(aVar).toString());
        try {
            r.a aVar2 = r.f27774b;
            s.b(objA);
            io.bidmachine.analytics.internal.C.e eVar = (io.bidmachine.analytics.internal.C.e) objA;
            return r.c(eVar != null ? io.bidmachine.analytics.internal.C.f.a(eVar) : null);
        } catch (Throwable th) {
            r.a aVar3 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    @Override // io.bidmachine.analytics.internal.D.e
    public Object a(String str) {
        return a(a().a(str));
    }

    @Override // io.bidmachine.analytics.internal.D.e
    public Object a(List list) {
        io.bidmachine.analytics.internal.B.c cVarA = a();
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.C.f.a((io.bidmachine.analytics.internal.g.e) it.next()));
        }
        return cVarA.e(arrayList);
    }

    public final Object b() {
        return a().b();
    }

    @Override // io.bidmachine.analytics.internal.D.e
    public Object a(String str, List list) {
        io.bidmachine.analytics.internal.B.c cVarA = a();
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.C.f.a((io.bidmachine.analytics.internal.g.e.a) it.next()).toString());
        }
        return cVarA.a(str, arrayList);
    }

    @Override // io.bidmachine.analytics.internal.D.e
    public Object a(List list, List list2) {
        a().b(list);
        io.bidmachine.analytics.internal.B.c cVarA = a();
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.C.f.a((io.bidmachine.analytics.internal.g.e.a) it.next()).toString());
        }
        cVarA.c(arrayList);
        r.a aVar = r.f27774b;
        return r.c(g0.f27756a);
    }

    private final Object a(Object obj) {
        try {
            r.a aVar = r.f27774b;
            s.b(obj);
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(kotlin.collections.u.u(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(io.bidmachine.analytics.internal.C.f.a((io.bidmachine.analytics.internal.C.e) it.next()));
            }
            return r.c(arrayList);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }
}
