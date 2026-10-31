package hc;

import java.util.List;
import java.util.ListIterator;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.jvm.internal.k;
import rd.o;

/* JADX INFO: compiled from: Version.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements Comparable<a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0241a f15817d = new C0241a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15820c;

    /* JADX INFO: renamed from: hc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Version.kt */
    public static final class C0241a {
        private C0241a() {
        }

        public /* synthetic */ C0241a(k kVar) {
            this();
        }

        public final a a(String str) {
            List listK;
            if (str == null || str.length() == 0) {
                return null;
            }
            try {
                List<String> listG = new o("\\.").g(str, 0);
                if (!listG.isEmpty()) {
                    ListIterator<String> listIterator = listG.listIterator(listG.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            listK = t.k();
                            break;
                        }
                        if (!(listIterator.previous().length() == 0)) {
                            listK = b0.j0(listG, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                } else {
                    listK = t.k();
                    break;
                }
                String[] strArr = (String[]) listK.toArray(new String[0]);
                if (strArr.length == 0) {
                    return null;
                }
                int length = strArr.length;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i10 < length) {
                    if (i10 == 0) {
                        i11 = Integer.parseInt(strArr[0]);
                    } else if (i10 != 1) {
                        i13 = i10 != 2 ? (i13 * 100) + Integer.parseInt(strArr[i10]) : Integer.parseInt(strArr[2]);
                    } else {
                        i12 = Integer.parseInt(strArr[1]);
                    }
                    i10++;
                }
                return new a(i11, i12, i13);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public a(int i10, int i11, int i12) {
        this.f15818a = i10;
        this.f15819b = i11;
        this.f15820c = i12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a other) {
        kotlin.jvm.internal.t.f(other, "other");
        int iG = kotlin.jvm.internal.t.g(this.f15818a, other.f15818a);
        if (iG != 0) {
            return iG;
        }
        int iG2 = kotlin.jvm.internal.t.g(this.f15819b, other.f15819b);
        return iG2 != 0 ? iG2 : kotlin.jvm.internal.t.g(this.f15820c, other.f15820c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15818a == aVar.f15818a && this.f15819b == aVar.f15819b && this.f15820c == aVar.f15820c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f15818a) * 31) + Integer.hashCode(this.f15819b)) * 31) + Integer.hashCode(this.f15820c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f15818a);
        sb2.append('.');
        sb2.append(this.f15819b);
        sb2.append('.');
        sb2.append(this.f15820c);
        return sb2.toString();
    }
}
