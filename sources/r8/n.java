package r8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: SlidingPercentile.java */
/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator<b> f24974h = new Comparator() { // from class: r8.l
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.g((n.b) obj, (n.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<b> f24975i = new Comparator() { // from class: r8.m
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.h((n.b) obj, (n.b) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24976a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f24982g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f24978c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f24977b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24979d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: SlidingPercentile.java */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f24985c;

        private b() {
        }
    }

    public n(int i10) {
        this.f24976a = i10;
    }

    private void d() {
        if (this.f24979d != 1) {
            Collections.sort(this.f24977b, f24974h);
            this.f24979d = 1;
        }
    }

    private void e() {
        if (this.f24979d != 0) {
            Collections.sort(this.f24977b, f24975i);
            this.f24979d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f24983a - bVar2.f24983a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int h(b bVar, b bVar2) {
        return Float.compare(bVar.f24985c, bVar2.f24985c);
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f24982g;
        if (i11 > 0) {
            b[] bVarArr = this.f24978c;
            int i12 = i11 - 1;
            this.f24982g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f24980e;
        this.f24980e = i13 + 1;
        bVar.f24983a = i13;
        bVar.f24984b = i10;
        bVar.f24985c = f10;
        this.f24977b.add(bVar);
        this.f24981f += i10;
        while (true) {
            int i14 = this.f24981f;
            int i15 = this.f24976a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = this.f24977b.get(0);
            int i17 = bVar2.f24984b;
            if (i17 <= i16) {
                this.f24981f -= i17;
                this.f24977b.remove(0);
                int i18 = this.f24982g;
                if (i18 < 5) {
                    b[] bVarArr2 = this.f24978c;
                    this.f24982g = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f24984b = i17 - i16;
                this.f24981f -= i16;
            }
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f24981f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f24977b.size(); i11++) {
            b bVar = this.f24977b.get(i11);
            i10 += bVar.f24984b;
            if (i10 >= f11) {
                return bVar.f24985c;
            }
        }
        if (this.f24977b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f24977b;
        return arrayList.get(arrayList.size() - 1).f24985c;
    }

    public void i() {
        this.f24977b.clear();
        this.f24979d = -1;
        this.f24980e = 0;
        this.f24981f = 0;
    }
}
