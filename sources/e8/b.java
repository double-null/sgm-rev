package e8;

import android.os.SystemClock;
import android.util.Pair;
import com.google.common.collect.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import x7.l0;

/* JADX INFO: compiled from: BaseUrlExclusionList.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f14505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, Long> f14506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<List<Pair<String, Integer>>, f8.b> f14507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Random f14508d;

    public b() {
        this(new Random());
    }

    private static <T> void b(T t10, long j10, Map<T, Long> map) {
        if (map.containsKey(t10)) {
            j10 = Math.max(j10, ((Long) l0.i(map.get(t10))).longValue());
        }
        map.put(t10, Long.valueOf(j10));
    }

    private List<f8.b> c(List<f8.b> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        h(jElapsedRealtime, this.f14505a);
        h(jElapsedRealtime, this.f14506b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            f8.b bVar = list.get(i10);
            if (!this.f14505a.containsKey(bVar.f14662b) && !this.f14506b.containsKey(Integer.valueOf(bVar.f14663c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(f8.b bVar, f8.b bVar2) {
        int iCompare = Integer.compare(bVar.f14663c, bVar2.f14663c);
        return iCompare != 0 ? iCompare : bVar.f14662b.compareTo(bVar2.f14662b);
    }

    public static int f(List<f8.b> list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(list.get(i10).f14663c));
        }
        return hashSet.size();
    }

    private static <T> void h(long j10, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    private f8.b k(List<f8.b> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += list.get(i11).f14664d;
        }
        int iNextInt = this.f14508d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            f8.b bVar = list.get(i13);
            i12 += bVar.f14664d;
            if (iNextInt < i12) {
                return bVar;
            }
        }
        return (f8.b) y.d(list);
    }

    public void e(f8.b bVar, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        b(bVar.f14662b, jElapsedRealtime, this.f14505a);
        int i10 = bVar.f14663c;
        if (i10 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i10), jElapsedRealtime, this.f14506b);
        }
    }

    public int g(List<f8.b> list) {
        HashSet hashSet = new HashSet();
        List<f8.b> listC = c(list);
        for (int i10 = 0; i10 < listC.size(); i10++) {
            hashSet.add(Integer.valueOf(listC.get(i10).f14663c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f14505a.clear();
        this.f14506b.clear();
        this.f14507c.clear();
    }

    public f8.b j(List<f8.b> list) {
        List<f8.b> listC = c(list);
        if (listC.size() < 2) {
            return (f8.b) y.c(listC, null);
        }
        Collections.sort(listC, new Comparator() { // from class: e8.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b.d((f8.b) obj, (f8.b) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i10 = listC.get(0).f14663c;
        for (int i11 = 0; i11 < listC.size(); i11++) {
            f8.b bVar = listC.get(i11);
            if (i10 != bVar.f14663c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return listC.get(0);
            }
            arrayList.add(new Pair(bVar.f14662b, Integer.valueOf(bVar.f14664d)));
        }
        f8.b bVar2 = this.f14507c.get(arrayList);
        if (bVar2 != null) {
            return bVar2;
        }
        f8.b bVarK = k(listC.subList(0, arrayList.size()));
        this.f14507c.put(arrayList, bVarK);
        return bVarK;
    }

    b(Random random) {
        this.f14507c = new HashMap();
        this.f14508d = random;
        this.f14505a = new HashMap();
        this.f14506b = new HashMap();
    }
}
