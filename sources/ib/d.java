package ib;

/* JADX INFO: loaded from: classes5.dex */
public interface d {

    public static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16230a;

        public a(int i10) {
            this.f16230a = i10;
        }

        public int a() {
            return this.f16230a;
        }

        @Override // ib.d
        public int a(int i10, int i11, int i12) {
            return od.k.j((int) (i12 * (Math.min(i10, i11) / a())), 1, Math.max(1, i12));
        }
    }

    int a(int i10, int i11, int i12);
}
