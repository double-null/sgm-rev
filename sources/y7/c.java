package y7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import x7.a0;

/* JADX INFO: compiled from: Mp4Box.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28684a;

    /* JADX INFO: compiled from: Mp4Box.java */
    public static final class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f28685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<C0487c> f28686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<b> f28687d;

        public b(int i10, long j10) {
            super(i10);
            this.f28685b = j10;
            this.f28686c = new ArrayList();
            this.f28687d = new ArrayList();
        }

        public void b(b bVar) {
            this.f28687d.add(bVar);
        }

        public void c(C0487c c0487c) {
            this.f28686c.add(c0487c);
        }

        public b d(int i10) {
            int size = this.f28687d.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f28687d.get(i11);
                if (bVar.f28684a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public C0487c e(int i10) {
            int size = this.f28686c.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0487c c0487c = this.f28686c.get(i11);
                if (c0487c.f28684a == i10) {
                    return c0487c;
                }
            }
            return null;
        }

        @Override // y7.c
        public String toString() {
            return c.a(this.f28684a) + " leaves: " + Arrays.toString(this.f28686c.toArray()) + " containers: " + Arrays.toString(this.f28687d.toArray());
        }
    }

    /* JADX INFO: renamed from: y7.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Mp4Box.java */
    public static final class C0487c extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a0 f28688b;

        public C0487c(int i10, a0 a0Var) {
            super(i10);
            this.f28688b = a0Var;
        }
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public String toString() {
        return a(this.f28684a);
    }

    private c(int i10) {
        this.f28684a = i10;
    }
}
