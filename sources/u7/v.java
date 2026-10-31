package u7;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: Metadata.java */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a[] f26506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26507b;

    public v(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    public v a(a... aVarArr) {
        return aVarArr.length == 0 ? this : new v(this.f26507b, (a[]) x7.l0.X0(this.f26506a, aVarArr));
    }

    public v b(v vVar) {
        return vVar == null ? this : a(vVar.f26506a);
    }

    public v c(long j10) {
        return this.f26507b == j10 ? this : new v(j10, this.f26506a);
    }

    public a d(int i10) {
        return this.f26506a[i10];
    }

    public int e() {
        return this.f26506a.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return Arrays.equals(this.f26506a, vVar.f26506a) && this.f26507b == vVar.f26507b;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f26506a) * 31) + com.google.common.primitives.h.a(this.f26507b);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f26506a));
        if (this.f26507b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f26507b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public v(long j10, a... aVarArr) {
        this.f26507b = j10;
        this.f26506a = aVarArr;
    }

    public v(List<? extends a> list) {
        this((a[]) list.toArray(new a[0]));
    }

    public v(long j10, List<? extends a> list) {
        this(j10, (a[]) list.toArray(new a[0]));
    }

    /* JADX INFO: compiled from: Metadata.java */
    public interface a {
        default q a() {
            return null;
        }

        default byte[] c() {
            return null;
        }

        default void b(u.b bVar) {
        }
    }
}
