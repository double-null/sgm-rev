package v8;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: TrackOutput.java */
/* JADX INFO: loaded from: classes4.dex */
public interface o0 {

    /* JADX INFO: compiled from: TrackOutput.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f27403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f27404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f27405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f27406d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f27403a = i10;
            this.f27404b = bArr;
            this.f27405c = i11;
            this.f27406d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f27403a == aVar.f27403a && this.f27405c == aVar.f27405c && this.f27406d == aVar.f27406d && Arrays.equals(this.f27404b, aVar.f27404b);
        }

        public int hashCode() {
            return (((((this.f27403a * 31) + Arrays.hashCode(this.f27404b)) * 31) + this.f27405c) * 31) + this.f27406d;
        }
    }

    void a(u7.q qVar);

    default void b(x7.a0 a0Var, int i10) {
        d(a0Var, i10, 0);
    }

    default int c(u7.h hVar, int i10, boolean z10) throws IOException {
        return e(hVar, i10, z10, 0);
    }

    void d(x7.a0 a0Var, int i10, int i11);

    int e(u7.h hVar, int i10, boolean z10, int i11) throws IOException;

    void f(long j10, int i10, int i11, int i12, a aVar);

    default void g(long j10) {
    }
}
