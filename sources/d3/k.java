package d3;

import e3.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: RolloutAssignmentList.java */
/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<j> f13297a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13298b;

    public k(int i10) {
        this.f13298b = i10;
    }

    public List<h0.f.d.e> a() {
        List<j> listB = b();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listB.size(); i10++) {
            arrayList.add(listB.get(i10).h());
        }
        return arrayList;
    }

    public synchronized List<j> b() {
        return Collections.unmodifiableList(new ArrayList(this.f13297a));
    }

    public synchronized boolean c(List<j> list) {
        this.f13297a.clear();
        if (list.size() <= this.f13298b) {
            return this.f13297a.addAll(list);
        }
        z2.f.f().k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f13298b);
        return this.f13297a.addAll(list.subList(0, this.f13298b));
    }
}
