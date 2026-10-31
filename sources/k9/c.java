package k9;

import com.google.common.collect.m;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import u7.v;
import x7.l0;

/* JADX INFO: compiled from: SlowMotionData.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f21271a;

    /* JADX INFO: compiled from: SlowMotionData.java */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Comparator<a> f21272d = new Comparator() { // from class: k9.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.a.b((c.a) obj, (c.a) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f21273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f21274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f21275c;

        public a(long j10, long j11, int i10) {
            x7.a.a(j10 < j11);
            this.f21273a = j10;
            this.f21274b = j11;
            this.f21275c = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int b(a aVar, a aVar2) {
            return m.j().e(aVar.f21273a, aVar2.f21273a).e(aVar.f21274b, aVar2.f21274b).d(aVar.f21275c, aVar2.f21275c).i();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f21273a == aVar.f21273a && this.f21274b == aVar.f21274b && this.f21275c == aVar.f21275c;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f21273a), Long.valueOf(this.f21274b), Integer.valueOf(this.f21275c));
        }

        public String toString() {
            return l0.G("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f21273a), Long.valueOf(this.f21274b), Integer.valueOf(this.f21275c));
        }
    }

    public c(List<a> list) {
        this.f21271a = list;
        x7.a.a(!d(list));
    }

    private static boolean d(List<a> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f21274b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f21273a < j10) {
                return true;
            }
            j10 = list.get(i10).f21274b;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f21271a.equals(((c) obj).f21271a);
    }

    public int hashCode() {
        return this.f21271a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f21271a;
    }
}
