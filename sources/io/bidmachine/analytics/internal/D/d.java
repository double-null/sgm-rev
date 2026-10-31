package io.bidmachine.analytics.internal.D;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u;
import wc.k;
import wc.m;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f16816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f16817b = m.a(new a());

    static final class a extends u implements id.a {
        a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.B.b invoke() {
            return new io.bidmachine.analytics.internal.B.b(d.this.f16816a);
        }
    }

    public d(SQLiteDatabase sQLiteDatabase) {
        this.f16816a = sQLiteDatabase;
    }

    @Override // io.bidmachine.analytics.internal.D.c
    public Object b(List list) {
        io.bidmachine.analytics.internal.B.b bVarA = a();
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.C.d.a((io.bidmachine.analytics.internal.g.d) it.next()));
        }
        return bVarA.a(arrayList);
    }

    @Override // io.bidmachine.analytics.internal.D.c
    public Object c(List list) {
        io.bidmachine.analytics.internal.B.b bVarA = a();
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.C.d.a((io.bidmachine.analytics.internal.g.d) it.next()));
        }
        return bVarA.b(arrayList);
    }

    private final io.bidmachine.analytics.internal.B.b a() {
        return (io.bidmachine.analytics.internal.B.b) this.f16817b.getValue();
    }

    @Override // io.bidmachine.analytics.internal.D.c
    public Object a(io.bidmachine.analytics.internal.g.d dVar) {
        return a().a(io.bidmachine.analytics.internal.C.d.a(dVar));
    }

    @Override // io.bidmachine.analytics.internal.D.c
    public Object a(String str, String str2) {
        return a(a().a(str, str2));
    }

    @Override // io.bidmachine.analytics.internal.D.c
    public Object a(String str, String str2, int i10) {
        return a(a().a(str, str2, Integer.valueOf(i10)));
    }

    public final Object b() {
        return a().a();
    }

    @Override // io.bidmachine.analytics.internal.D.c
    public Object a(List list) {
        io.bidmachine.analytics.internal.B.b bVarA = a();
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.C.d.a((io.bidmachine.analytics.internal.g.d) it.next()));
        }
        return bVarA.c(arrayList);
    }

    @Override // io.bidmachine.analytics.internal.D.c
    public Object a(String str, List list) {
        return a().a(str, list);
    }

    private final Object a(Object obj) {
        try {
            r.a aVar = r.f27774b;
            s.b(obj);
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(kotlin.collections.u.u(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(io.bidmachine.analytics.internal.C.d.a((io.bidmachine.analytics.internal.C.c) it.next()));
            }
            return r.c(arrayList);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }
}
