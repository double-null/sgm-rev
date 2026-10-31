package g4;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: GsonBuilder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f15363h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Excluder f15356a = Excluder.f12331g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f15357b = r.f15376a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f15358c = d.f15322a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Type, h<?>> f15359d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<t> f15360e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<t> f15361f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f15362g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f15364i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f15365j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f15366k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f15367l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f15368m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f15369n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f15370o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f15371p = false;

    private void a(String str, int i10, int i11, List<t> list) {
        a aVar;
        a aVar2;
        a aVar3;
        if (str != null && !"".equals(str.trim())) {
            aVar = new a(Date.class, str);
            aVar2 = new a(Timestamp.class, str);
            aVar3 = new a(java.sql.Date.class, str);
        } else {
            if (i10 == 2 || i11 == 2) {
                return;
            }
            a aVar4 = new a(Date.class, i10, i11);
            a aVar5 = new a(Timestamp.class, i10, i11);
            a aVar6 = new a(java.sql.Date.class, i10, i11);
            aVar = aVar4;
            aVar2 = aVar5;
            aVar3 = aVar6;
        }
        list.add(TypeAdapters.a(Date.class, aVar));
        list.add(TypeAdapters.a(Timestamp.class, aVar2));
        list.add(TypeAdapters.a(java.sql.Date.class, aVar3));
    }

    public f b() {
        List<t> arrayList = new ArrayList<>(this.f15360e.size() + this.f15361f.size() + 3);
        arrayList.addAll(this.f15360e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f15361f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f15363h, this.f15364i, this.f15365j, arrayList);
        return new f(this.f15356a, this.f15358c, this.f15359d, this.f15362g, this.f15366k, this.f15370o, this.f15368m, this.f15369n, this.f15371p, this.f15367l, this.f15357b, this.f15363h, this.f15364i, this.f15365j, this.f15360e, this.f15361f, arrayList);
    }
}
