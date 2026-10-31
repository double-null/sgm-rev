package io.bidmachine.analytics.internal.o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.E.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.u;
import kotlin.jvm.internal.k;
import wb.e0;
import wb.t;
import zc.f;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends io.bidmachine.analytics.internal.n.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0296a f17167j = new C0296a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.p002a.a f17168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f17169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f17170i = "aapp";

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.o.a$a, reason: collision with other inner class name */
    public static final class C0296a {
        public /* synthetic */ C0296a(k kVar) {
            this();
        }

        private C0296a() {
        }
    }

    public a(io.bidmachine.analytics.internal.p002a.a aVar) {
        this.f17168g = aVar;
    }

    private final b d() {
        return this.f17168g.c().a();
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public String a() {
        return this.f17170i;
    }

    @Override // io.bidmachine.analytics.internal.n.a, io.bidmachine.analytics.internal.h.d
    /* JADX INFO: renamed from: a */
    public void b(io.bidmachine.analytics.internal.n.a.C0295a c0295a) {
        super.b(c0295a);
        if (c0295a.c().size() != 1) {
            throw new IllegalStateException(("Reader " + a() + " should contains only one rule, received " + c0295a.c().size()).toString());
        }
        ReaderConfig.Rule rule = (ReaderConfig.Rule) b0.O(c0295a.c());
        if (!(rule instanceof ReaderConfig.Rule.GeneralRule)) {
            throw new IllegalStateException("Check failed.");
        }
        b bVarD = d();
        Integer numP = e0.P(e.b(((ReaderConfig.Rule.GeneralRule) rule).getPath()), null, 1, null);
        bVarD.a(numP != null ? numP.intValue() : 0);
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void d(Context context) {
        this.f17169h = context;
    }

    @Override // io.bidmachine.analytics.internal.n.a
    public Object a(ReaderConfig.Rule rule, f fVar) {
        Context context = this.f17169h;
        if (context != null) {
            Object objB = t.b(context.getPackageManager(), e.a("cXVlcnlJbnRlbnRBY3Rpdml0aWVz"), new Class[]{Intent.class, Integer.TYPE}, new Object[]{new Intent(e.a("YW5kcm9pZC5pbnRlbnQuYWN0aW9uLk1BSU4=")), kotlin.coroutines.jvm.internal.b.c(0)});
            kotlin.jvm.internal.t.d(objB, "null cannot be cast to non-null type kotlin.collections.List<android.content.pm.ResolveInfo>");
            List list = (List) objB;
            ArrayList arrayList = new ArrayList(u.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
            }
            ArrayList arrayList2 = new ArrayList(b0.I(arrayList));
            d().a(arrayList2);
            return String.valueOf(arrayList2.hashCode());
        }
        throw new IllegalArgumentException("Context is null");
    }
}
