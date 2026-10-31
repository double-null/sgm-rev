package od;

import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import kotlin.collections.j0;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes5.dex */
public class f implements Iterable<Integer>, jd.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f23385d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23388c;

    /* JADX INFO: compiled from: Progressions.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final f a(int i10, int i11, int i12) {
            return new f(i10, i11, i12);
        }
    }

    public f(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f23386a = i10;
        this.f23387b = cd.c.b(i10, i11, i12);
        this.f23388c = i12;
    }

    public final int a() {
        return this.f23386a;
    }

    public final int c() {
        return this.f23387b;
    }

    public final int d() {
        return this.f23388c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public j0 iterator() {
        return new g(this.f23386a, this.f23387b, this.f23388c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (this.f23386a != fVar.f23386a || this.f23387b != fVar.f23387b || this.f23388c != fVar.f23388c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f23386a * 31) + this.f23387b) * 31) + this.f23388c;
    }

    public boolean isEmpty() {
        if (this.f23388c > 0) {
            if (this.f23386a > this.f23387b) {
                return true;
            }
        } else if (this.f23386a < this.f23387b) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f23388c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f23386a);
            sb2.append("..");
            sb2.append(this.f23387b);
            sb2.append(" step ");
            i10 = this.f23388c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f23386a);
            sb2.append(RHIpdOnfgiYkEj.wDXITyRv);
            sb2.append(this.f23387b);
            sb2.append(" step ");
            i10 = -this.f23388c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
