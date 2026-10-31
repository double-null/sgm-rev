package io.bidmachine.analytics.internal.p002a;

import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import rd.f0;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f16862d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16865c;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final e a(String str) {
            Object objC;
            try {
                r.a aVar = r.f27774b;
                if (f0.k0(str)) {
                    return null;
                }
                List listK0 = f0.K0(str, new String[]{"."}, false, 0, 6, null);
                if (listK0.isEmpty()) {
                    return null;
                }
                int size = listK0.size();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i10 < size && i10 <= 6) {
                    if (i10 == 0) {
                        i11 = Integer.parseInt((String) listK0.get(0));
                    } else if (i10 != 1) {
                        i13 = i10 != 2 ? (i13 * 100) + Integer.parseInt((String) listK0.get(i10)) : Integer.parseInt((String) listK0.get(2));
                    } else {
                        i12 = Integer.parseInt((String) listK0.get(1));
                    }
                    i10++;
                }
                objC = r.c(new e(i11, i12, i13));
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                objC = r.c(s.a(th));
            }
            return (e) (r.k(objC) ? null : objC);
        }

        private a() {
        }
    }

    public e(int i10, int i11, int i12) {
        this.f16863a = i10;
        this.f16864b = i11;
        this.f16865c = i12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        int iG = t.g(this.f16863a, eVar.f16863a);
        if (iG != 0) {
            return iG;
        }
        int iG2 = t.g(this.f16864b, eVar.f16864b);
        return iG2 != 0 ? iG2 : t.g(this.f16865c, eVar.f16865c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f16863a == eVar.f16863a && this.f16864b == eVar.f16864b && this.f16865c == eVar.f16865c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f16863a) * 31) + Integer.hashCode(this.f16864b)) * 31) + Integer.hashCode(this.f16865c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16863a);
        sb2.append('.');
        sb2.append(this.f16864b);
        sb2.append('.');
        sb2.append(this.f16865c);
        return sb2.toString();
    }
}
