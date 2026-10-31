package m1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: WorkSpec.java */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f22076s = androidx.work.l.f("WorkSpec");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o.a<List<c>, List<androidx.work.u>> f22077t = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.work.u.a f22079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f22080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f22081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.work.e f22082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.work.e f22083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f22085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f22086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.work.c f22087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.work.a f22089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f22090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f22091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f22092o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f22093p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f22094q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.work.p f22095r;

    /* JADX INFO: compiled from: WorkSpec.java */
    class a implements o.a<List<c>, List<androidx.work.u>> {
        a() {
        }

        @Override // o.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<androidx.work.u> apply(List<c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<c> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: WorkSpec.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f22096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.work.u.a f22097b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f22097b != bVar.f22097b) {
                return false;
            }
            return this.f22096a.equals(bVar.f22096a);
        }

        public int hashCode() {
            return (this.f22096a.hashCode() * 31) + this.f22097b.hashCode();
        }
    }

    /* JADX INFO: compiled from: WorkSpec.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f22098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.work.u.a f22099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.work.e f22100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22101d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List<String> f22102e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<androidx.work.e> f22103f;

        public androidx.work.u a() {
            List<androidx.work.e> list = this.f22103f;
            return new androidx.work.u(UUID.fromString(this.f22098a), this.f22099b, this.f22100c, this.f22102e, (list == null || list.isEmpty()) ? androidx.work.e.f3659c : this.f22103f.get(0), this.f22101d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f22101d != cVar.f22101d) {
                return false;
            }
            String str = this.f22098a;
            if (str == null ? cVar.f22098a != null : !str.equals(cVar.f22098a)) {
                return false;
            }
            if (this.f22099b != cVar.f22099b) {
                return false;
            }
            androidx.work.e eVar = this.f22100c;
            if (eVar == null ? cVar.f22100c != null : !eVar.equals(cVar.f22100c)) {
                return false;
            }
            List<String> list = this.f22102e;
            if (list == null ? cVar.f22102e != null : !list.equals(cVar.f22102e)) {
                return false;
            }
            List<androidx.work.e> list2 = this.f22103f;
            List<androidx.work.e> list3 = cVar.f22103f;
            if (list2 != null) {
                return list2.equals(list3);
            }
            return list3 == null;
        }

        public int hashCode() {
            String str = this.f22098a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            androidx.work.u.a aVar = this.f22099b;
            int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            androidx.work.e eVar = this.f22100c;
            int iHashCode3 = (((iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f22101d) * 31;
            List<String> list = this.f22102e;
            int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<androidx.work.e> list2 = this.f22103f;
            return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
        }
    }

    public p(String str, String str2) {
        this.f22079b = androidx.work.u.a.ENQUEUED;
        androidx.work.e eVar = androidx.work.e.f3659c;
        this.f22082e = eVar;
        this.f22083f = eVar;
        this.f22087j = androidx.work.c.f3638i;
        this.f22089l = androidx.work.a.EXPONENTIAL;
        this.f22090m = 30000L;
        this.f22093p = -1L;
        this.f22095r = androidx.work.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f22078a = str;
        this.f22080c = str2;
    }

    public long a() {
        if (c()) {
            return this.f22091n + Math.min(18000000L, this.f22089l == androidx.work.a.f3612b ? this.f22090m * ((long) this.f22088k) : (long) Math.scalb(this.f22090m, this.f22088k - 1));
        }
        if (!d()) {
            long jCurrentTimeMillis = this.f22091n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f22084g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j10 = this.f22091n;
        long j11 = j10 == 0 ? jCurrentTimeMillis2 + this.f22084g : j10;
        long j12 = this.f22086i;
        long j13 = this.f22085h;
        if (j12 != j13) {
            return j11 + j13 + (j10 == 0 ? j12 * (-1) : 0L);
        }
        return j11 + (j10 != 0 ? j13 : 0L);
    }

    public boolean b() {
        return !androidx.work.c.f3638i.equals(this.f22087j);
    }

    public boolean c() {
        return this.f22079b == androidx.work.u.a.ENQUEUED && this.f22088k > 0;
    }

    public boolean d() {
        return this.f22085h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f22084g != pVar.f22084g || this.f22085h != pVar.f22085h || this.f22086i != pVar.f22086i || this.f22088k != pVar.f22088k || this.f22090m != pVar.f22090m || this.f22091n != pVar.f22091n || this.f22092o != pVar.f22092o || this.f22093p != pVar.f22093p || this.f22094q != pVar.f22094q || !this.f22078a.equals(pVar.f22078a) || this.f22079b != pVar.f22079b || !this.f22080c.equals(pVar.f22080c)) {
            return false;
        }
        String str = this.f22081d;
        if (str == null ? pVar.f22081d == null : str.equals(pVar.f22081d)) {
            return this.f22082e.equals(pVar.f22082e) && this.f22083f.equals(pVar.f22083f) && this.f22087j.equals(pVar.f22087j) && this.f22089l == pVar.f22089l && this.f22095r == pVar.f22095r;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((this.f22078a.hashCode() * 31) + this.f22079b.hashCode()) * 31) + this.f22080c.hashCode()) * 31;
        String str = this.f22081d;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f22082e.hashCode()) * 31) + this.f22083f.hashCode()) * 31;
        long j10 = this.f22084g;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f22085h;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f22086i;
        int iHashCode3 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f22087j.hashCode()) * 31) + this.f22088k) * 31) + this.f22089l.hashCode()) * 31;
        long j13 = this.f22090m;
        int i12 = (iHashCode3 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f22091n;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f22092o;
        int i14 = (i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f22093p;
        return ((((i14 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f22094q ? 1 : 0)) * 31) + this.f22095r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f22078a + "}";
    }

    public p(p pVar) {
        this.f22079b = androidx.work.u.a.ENQUEUED;
        androidx.work.e eVar = androidx.work.e.f3659c;
        this.f22082e = eVar;
        this.f22083f = eVar;
        this.f22087j = androidx.work.c.f3638i;
        this.f22089l = androidx.work.a.EXPONENTIAL;
        this.f22090m = 30000L;
        this.f22093p = -1L;
        this.f22095r = androidx.work.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f22078a = pVar.f22078a;
        this.f22080c = pVar.f22080c;
        this.f22079b = pVar.f22079b;
        this.f22081d = pVar.f22081d;
        this.f22082e = new androidx.work.e(pVar.f22082e);
        this.f22083f = new androidx.work.e(pVar.f22083f);
        this.f22084g = pVar.f22084g;
        this.f22085h = pVar.f22085h;
        this.f22086i = pVar.f22086i;
        this.f22087j = new androidx.work.c(pVar.f22087j);
        this.f22088k = pVar.f22088k;
        this.f22089l = pVar.f22089l;
        this.f22090m = pVar.f22090m;
        this.f22091n = pVar.f22091n;
        this.f22092o = pVar.f22092o;
        this.f22093p = pVar.f22093p;
        this.f22094q = pVar.f22094q;
        this.f22095r = pVar.f22095r;
    }
}
