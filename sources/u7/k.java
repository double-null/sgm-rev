package u7;

import java.util.Objects;

/* JADX INFO: compiled from: DeviceInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f26180e = new b(0).e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f26181f = x7.l0.C0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f26182g = x7.l0.C0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f26183h = x7.l0.C0(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f26184i = x7.l0.C0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26188d;

    /* JADX INFO: compiled from: DeviceInfo.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f26189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f26190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f26191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f26192d;

        public b(int i10) {
            this.f26189a = i10;
        }

        public k e() {
            x7.a.a(this.f26190b <= this.f26191c);
            return new k(this);
        }

        public b f(int i10) {
            this.f26191c = i10;
            return this;
        }

        public b g(int i10) {
            this.f26190b = i10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f26185a == kVar.f26185a && this.f26186b == kVar.f26186b && this.f26187c == kVar.f26187c && Objects.equals(this.f26188d, kVar.f26188d);
    }

    public int hashCode() {
        int i10 = (((((527 + this.f26185a) * 31) + this.f26186b) * 31) + this.f26187c) * 31;
        String str = this.f26188d;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    private k(b bVar) {
        this.f26185a = bVar.f26189a;
        this.f26186b = bVar.f26190b;
        this.f26187c = bVar.f26191c;
        this.f26188d = bVar.f26192d;
    }
}
