package td;

import c0.IbU.elEbP;
import java.io.Serializable;
import java.util.Comparator;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import rd.c0;
import rd.f;
import wc.b0;

/* JADX INFO: compiled from: Uuid.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25788c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b f25789d = new b(0, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Comparator<b> f25790e = new Comparator() { // from class: td.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return b.c((b) obj, (b) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f25791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25792b;

    /* JADX INFO: compiled from: Uuid.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        public final b a(long j10, long j11) {
            return (j10 == 0 && j11 == 0) ? b() : new b(j10, j11);
        }

        public final b b() {
            return b.f25789d;
        }

        public final b c(String str) {
            t.f(str, elEbP.VmuIuYiRxZbvW);
            if (!(str.length() == 36)) {
                throw new IllegalArgumentException("Expected a 36-char string in the standard uuid format.".toString());
            }
            long jF = f.f(str, 0, 8, null, 4, null);
            d.d(str, 8);
            long jF2 = f.f(str, 9, 13, null, 4, null);
            d.d(str, 13);
            long jF3 = f.f(str, 14, 18, null, 4, null);
            d.d(str, 18);
            long jF4 = f.f(str, 19, 23, null, 4, null);
            d.d(str, 23);
            return a((jF << 32) | (jF2 << 16) | jF3, f.f(str, 24, 36, null, 4, null) | (jF4 << 48));
        }
    }

    public b(long j10, long j11) {
        this.f25791a = j10;
        this.f25792b = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(b a10, b b10) {
        t.f(a10, "a");
        t.f(b10, "b");
        long j10 = a10.f25791a;
        return j10 != b10.f25791a ? Long.compare(b0.b(j10) ^ Long.MIN_VALUE, b0.b(b10.f25791a) ^ Long.MIN_VALUE) : Long.compare(b0.b(a10.f25792b) ^ Long.MIN_VALUE, b0.b(b10.f25792b) ^ Long.MIN_VALUE);
    }

    private final Object writeReplace() {
        return c.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f25791a == bVar.f25791a && this.f25792b == bVar.f25792b;
    }

    public final long f() {
        return this.f25792b;
    }

    public final long g() {
        return this.f25791a;
    }

    public int hashCode() {
        long j10 = this.f25791a ^ this.f25792b;
        return ((int) j10) ^ ((int) (j10 >> 32));
    }

    public String toString() {
        byte[] bArr = new byte[36];
        d.e(this.f25792b, bArr, 24, 6);
        bArr[23] = 45;
        d.e(this.f25792b >>> 48, bArr, 19, 2);
        bArr[18] = 45;
        d.e(this.f25791a, bArr, 14, 2);
        bArr[13] = 45;
        d.e(this.f25791a >>> 16, bArr, 9, 2);
        bArr[8] = 45;
        d.e(this.f25791a >>> 32, bArr, 0, 4);
        return c0.x(bArr);
    }
}
