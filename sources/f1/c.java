package f1;

import androidx.lifecycle.p;
import androidx.work.o;

/* JADX INFO: compiled from: OperationImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class c implements o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p<o.b> f14534c = new p<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<o.b.c> f14535d = androidx.work.impl.utils.futures.c.s();

    public c() {
        a(o.f3825b);
    }

    public void a(o.b bVar) {
        this.f14534c.l(bVar);
        if (bVar instanceof o.b.c) {
            this.f14535d.o((o.b.c) bVar);
        } else if (bVar instanceof o.b.a) {
            this.f14535d.p(((o.b.a) bVar).a());
        }
    }
}
