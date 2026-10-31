package t0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import x0.e;

/* JADX INFO: compiled from: RoomSQLiteQuery.java */
/* JADX INFO: loaded from: classes.dex */
public class c implements e, x0.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final TreeMap<Integer, c> f25451i = new TreeMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f25452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long[] f25453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final double[] f25454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String[] f25455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final byte[][] f25456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f25457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f25458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f25459h;

    private c(int i10) {
        this.f25458g = i10;
        int i11 = i10 + 1;
        this.f25457f = new int[i11];
        this.f25453b = new long[i11];
        this.f25454c = new double[i11];
        this.f25455d = new String[i11];
        this.f25456e = new byte[i11][];
    }

    public static c e(String str, int i10) {
        TreeMap<Integer, c> treeMap = f25451i;
        synchronized (treeMap) {
            Map.Entry<Integer, c> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (entryCeilingEntry == null) {
                c cVar = new c(i10);
                cVar.f(str, i10);
                return cVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            c value = entryCeilingEntry.getValue();
            value.f(str, i10);
            return value;
        }
    }

    private static void h() {
        TreeMap<Integer, c> treeMap = f25451i;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i10 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i10;
        }
    }

    @Override // x0.d
    public void S(int i10, String str) {
        this.f25457f[i10] = 4;
        this.f25455d[i10] = str;
    }

    @Override // x0.d
    public void X(int i10, long j10) {
        this.f25457f[i10] = 2;
        this.f25453b[i10] = j10;
    }

    @Override // x0.d
    public void Z(int i10, byte[] bArr) {
        this.f25457f[i10] = 5;
        this.f25456e[i10] = bArr;
    }

    @Override // x0.e
    public void b(x0.d dVar) {
        for (int i10 = 1; i10 <= this.f25459h; i10++) {
            int i11 = this.f25457f[i10];
            if (i11 == 1) {
                dVar.f0(i10);
            } else if (i11 == 2) {
                dVar.X(i10, this.f25453b[i10]);
            } else if (i11 == 3) {
                dVar.q(i10, this.f25454c[i10]);
            } else if (i11 == 4) {
                dVar.S(i10, this.f25455d[i10]);
            } else if (i11 == 5) {
                dVar.Z(i10, this.f25456e[i10]);
            }
        }
    }

    @Override // x0.e
    public String c() {
        return this.f25452a;
    }

    void f(String str, int i10) {
        this.f25452a = str;
        this.f25459h = i10;
    }

    @Override // x0.d
    public void f0(int i10) {
        this.f25457f[i10] = 1;
    }

    @Override // x0.d
    public void q(int i10, double d10) {
        this.f25457f[i10] = 3;
        this.f25454c[i10] = d10;
    }

    public void release() {
        TreeMap<Integer, c> treeMap = f25451i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f25458g), this);
            h();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
