package f8;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: AdaptationSet.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<j> f14657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<e> f14658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e> f14659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e> f14660f;

    public a(long j10, int i10, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        this.f14655a = j10;
        this.f14656b = i10;
        this.f14657c = Collections.unmodifiableList(list);
        this.f14658d = Collections.unmodifiableList(list2);
        this.f14659e = Collections.unmodifiableList(list3);
        this.f14660f = Collections.unmodifiableList(list4);
    }
}
