package hb;

import fb.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.t;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f15816a;

    public c(b stateGroupController) {
        t.f(stateGroupController, "stateGroupController");
        this.f15816a = stateGroupController;
    }

    @Override // fb.e
    public boolean a(List params) {
        t.f(params, "params");
        if (params.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList(u.u(params, 10));
        Iterator it = params.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        return !this.f15816a.a(arrayList);
    }
}
