package f8;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Period.java */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a> f14703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<f> f14704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f14705e;

    public g(String str, long j10, List<a> list, List<f> list2) {
        this(str, j10, list, list2, null);
    }

    public int a(int i10) {
        int size = this.f14703c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f14703c.get(i11).f14656b == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g(String str, long j10, List<a> list, List<f> list2, e eVar) {
        this.f14701a = str;
        this.f14702b = j10;
        this.f14703c = Collections.unmodifiableList(list);
        this.f14704d = Collections.unmodifiableList(list2);
        this.f14705e = eVar;
    }
}
