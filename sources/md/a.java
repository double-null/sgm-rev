package md;

import java.util.Random;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends d {
    @Override // md.d
    public int c(int i10) {
        return e.b(h().nextInt(), i10);
    }

    @Override // md.d
    public double e() {
        return h().nextDouble();
    }

    @Override // md.d
    public int f() {
        return h().nextInt();
    }

    @Override // md.d
    public long g() {
        return h().nextLong();
    }

    public abstract Random h();
}
