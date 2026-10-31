package o2;

import android.util.SparseArray;
import b2.e;
import java.util.HashMap;

/* JADX INFO: compiled from: PriorityMapping.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray<e> f23008a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<e, Integer> f23009b;

    static {
        HashMap<e, Integer> map = new HashMap<>();
        f23009b = map;
        map.put(e.DEFAULT, 0);
        f23009b.put(e.VERY_LOW, 1);
        f23009b.put(e.HIGHEST, 2);
        for (e eVar : f23009b.keySet()) {
            f23008a.append(f23009b.get(eVar).intValue(), eVar);
        }
    }

    public static int a(e eVar) {
        Integer num = f23009b.get(eVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + eVar);
    }

    public static e b(int i10) {
        e eVar = f23008a.get(i10);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
