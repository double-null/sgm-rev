package wb;

/* JADX INFO: compiled from: Tag.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wc.k f27732b;

    /* JADX INFO: compiled from: Tag.kt */
    static final class a extends kotlin.jvm.internal.u implements id.a<String> {
        a() {
            super(0);
        }

        @Override // id.a
        public final String invoke() {
            return y.this.f27731a + " @" + e0.d(y.this);
        }
    }

    public y(String name) {
        kotlin.jvm.internal.t.f(name, "name");
        this.f27731a = name;
        this.f27732b = wc.m.a(new a());
    }

    private final String b() {
        return (String) this.f27732b.getValue();
    }

    public String toString() {
        return b();
    }
}
