package x7;

/* JADX INFO: compiled from: Size.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f28098c = new c0(-1, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f28099d = new c0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28101b;

    public c0(int i10, int i11) {
        a.a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f28100a = i10;
        this.f28101b = i11;
    }

    public int a() {
        return this.f28101b;
    }

    public int b() {
        return this.f28100a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f28100a == c0Var.f28100a && this.f28101b == c0Var.f28101b;
    }

    public int hashCode() {
        int i10 = this.f28101b;
        int i11 = this.f28100a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f28100a + "x" + this.f28101b;
    }
}
