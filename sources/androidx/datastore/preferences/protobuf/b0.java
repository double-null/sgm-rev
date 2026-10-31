package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: LazyFieldLite.java */
/* JADX INFO: loaded from: classes.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f2106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f2107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected volatile p0 f2108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile g f2109d;

    protected void a(p0 p0Var) {
        if (this.f2108c != null) {
            return;
        }
        synchronized (this) {
            if (this.f2108c != null) {
                return;
            }
            try {
                if (this.f2106a != null) {
                    this.f2108c = p0Var.getParserForType().a(this.f2106a, this.f2107b);
                    this.f2109d = this.f2106a;
                } else {
                    this.f2108c = p0Var;
                    this.f2109d = g.f2126b;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f2108c = p0Var;
                this.f2109d = g.f2126b;
            }
        }
    }

    public int b() {
        if (this.f2109d != null) {
            return this.f2109d.size();
        }
        g gVar = this.f2106a;
        if (gVar != null) {
            return gVar.size();
        }
        if (this.f2108c != null) {
            return this.f2108c.getSerializedSize();
        }
        return 0;
    }

    public p0 c(p0 p0Var) {
        a(p0Var);
        return this.f2108c;
    }

    public p0 d(p0 p0Var) {
        p0 p0Var2 = this.f2108c;
        this.f2106a = null;
        this.f2109d = null;
        this.f2108c = p0Var;
        return p0Var2;
    }

    public g e() {
        if (this.f2109d != null) {
            return this.f2109d;
        }
        g gVar = this.f2106a;
        if (gVar != null) {
            return gVar;
        }
        synchronized (this) {
            if (this.f2109d != null) {
                return this.f2109d;
            }
            if (this.f2108c == null) {
                this.f2109d = g.f2126b;
            } else {
                this.f2109d = this.f2108c.toByteString();
            }
            return this.f2109d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        p0 p0Var = this.f2108c;
        p0 p0Var2 = b0Var.f2108c;
        if (p0Var == null && p0Var2 == null) {
            return e().equals(b0Var.e());
        }
        if (p0Var == null || p0Var2 == null) {
            return p0Var != null ? p0Var.equals(b0Var.c(p0Var.getDefaultInstanceForType())) : c(p0Var2.getDefaultInstanceForType()).equals(p0Var2);
        }
        return p0Var.equals(p0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
