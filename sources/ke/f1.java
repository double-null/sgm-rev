package ke;

import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: StreamingJsonEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f1 extends ie.b implements kotlinx.serialization.json.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f21354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kotlinx.serialization.json.b f21355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o1 f21356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kotlinx.serialization.json.t[] f21357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final le.c f21358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final kotlinx.serialization.json.g f21359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f21361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f21362i;

    /* JADX INFO: compiled from: StreamingJsonEncoder.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[o1.values().length];
            try {
                iArr[o1.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o1.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o1.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f1(s composer, kotlinx.serialization.json.b json, o1 mode, kotlinx.serialization.json.t[] tVarArr) {
        kotlin.jvm.internal.t.f(composer, "composer");
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(mode, "mode");
        this.f21354a = composer;
        this.f21355b = json;
        this.f21356c = mode;
        this.f21357d = tVarArr;
        this.f21358e = d().a();
        this.f21359f = d().e();
        int iOrdinal = mode.ordinal();
        if (tVarArr != null) {
            kotlinx.serialization.json.t tVar = tVarArr[iOrdinal];
            if (tVar == null && tVar == this) {
                return;
            }
            tVarArr[iOrdinal] = this;
        }
    }

    private final void K(String str, String str2) {
        this.f21354a.c();
        G(str);
        this.f21354a.f(':');
        this.f21354a.p();
        G(str2);
    }

    @Override // kotlinx.serialization.json.t
    public void C(kotlinx.serialization.json.i element) {
        kotlin.jvm.internal.t.f(element, "element");
        if (this.f21361h == null || (element instanceof kotlinx.serialization.json.d0)) {
            q(kotlinx.serialization.json.r.f21606a, element);
        } else {
            z0.d(this.f21362i, element);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ie.b, ie.f
    public void D(int i10) {
        if (this.f21360g) {
            G(String.valueOf(i10));
        } else {
            this.f21354a.i(i10);
        }
    }

    @Override // ie.b, ie.f
    public void G(String value) {
        kotlin.jvm.internal.t.f(value, "value");
        this.f21354a.n(value);
    }

    @Override // ie.b
    public boolean H(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        int i11 = a.$EnumSwitchMapping$0[this.f21356c.ordinal()];
        if (i11 != 1) {
            boolean z10 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (!this.f21354a.a()) {
                        this.f21354a.f(',');
                    }
                    this.f21354a.c();
                    G(m0.h(descriptor, d(), i10));
                    this.f21354a.f(':');
                    this.f21354a.p();
                } else {
                    if (i10 == 0) {
                        this.f21360g = true;
                    }
                    if (i10 == 1) {
                        this.f21354a.f(',');
                        this.f21354a.p();
                        this.f21360g = false;
                    }
                }
            } else if (this.f21354a.a()) {
                this.f21360g = true;
                this.f21354a.c();
            } else {
                if (i10 % 2 == 0) {
                    this.f21354a.f(',');
                    this.f21354a.c();
                    z10 = true;
                } else {
                    this.f21354a.f(':');
                    this.f21354a.p();
                }
                this.f21360g = z10;
            }
        } else {
            if (!this.f21354a.a()) {
                this.f21354a.f(',');
            }
            this.f21354a.c();
        }
        return true;
    }

    @Override // ie.f
    public le.c a() {
        return this.f21358e;
    }

    @Override // ie.b, ie.f
    public ie.d b(he.f descriptor) {
        kotlinx.serialization.json.t tVar;
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        o1 o1VarB = p1.b(d(), descriptor);
        char c10 = o1VarB.f21397a;
        if (c10 != 0) {
            this.f21354a.f(c10);
            this.f21354a.b();
        }
        String str = this.f21361h;
        if (str != null) {
            String strI = this.f21362i;
            if (strI == null) {
                strI = descriptor.i();
            }
            K(str, strI);
            this.f21361h = null;
            this.f21362i = null;
        }
        if (this.f21356c == o1VarB) {
            return this;
        }
        kotlinx.serialization.json.t[] tVarArr = this.f21357d;
        return (tVarArr == null || (tVar = tVarArr[o1VarB.ordinal()]) == null) ? new f1(this.f21354a, d(), o1VarB, this.f21357d) : tVar;
    }

    @Override // ie.b, ie.d
    public void c(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        if (this.f21356c.f21398b != 0) {
            this.f21354a.q();
            this.f21354a.d();
            this.f21354a.f(this.f21356c.f21398b);
        }
    }

    @Override // kotlinx.serialization.json.t
    public kotlinx.serialization.json.b d() {
        return this.f21355b;
    }

    @Override // ie.b, ie.f
    public void f(double d10) {
        if (this.f21360g) {
            G(String.valueOf(d10));
        } else {
            this.f21354a.g(d10);
        }
        if (this.f21359f.b()) {
            return;
        }
        if (!((Double.isInfinite(d10) || Double.isNaN(d10)) ? false : true)) {
            throw k0.b(Double.valueOf(d10), this.f21354a.f21412a.toString());
        }
    }

    @Override // ie.b, ie.f
    public void g(byte b10) {
        if (this.f21360g) {
            G(String.valueOf((int) b10));
        } else {
            this.f21354a.e(b10);
        }
    }

    @Override // ie.b, ie.f
    public void l(he.f enumDescriptor, int i10) {
        kotlin.jvm.internal.t.f(enumDescriptor, "enumDescriptor");
        G(enumDescriptor.f(i10));
    }

    @Override // ie.b, ie.f
    public void m(long j10) {
        if (this.f21360g) {
            G(String.valueOf(j10));
        } else {
            this.f21354a.j(j10);
        }
    }

    @Override // ie.b, ie.f
    public ie.f n(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        if (g1.b(descriptor)) {
            s a0Var = this.f21354a;
            if (!(a0Var instanceof a0)) {
                a0Var = new a0(a0Var.f21412a, this.f21360g);
            }
            return new f1(a0Var, d(), this.f21356c, (kotlinx.serialization.json.t[]) null);
        }
        if (g1.a(descriptor)) {
            s tVar = this.f21354a;
            if (!(tVar instanceof t)) {
                tVar = new t(tVar.f21412a, this.f21360g);
            }
            return new f1(tVar, d(), this.f21356c, (kotlinx.serialization.json.t[]) null);
        }
        if (this.f21361h == null) {
            return super.n(descriptor);
        }
        this.f21362i = descriptor.i();
        return this;
    }

    @Override // ie.b, ie.d
    public <T> void o(he.f descriptor, int i10, fe.m<? super T> serializer, T t10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        kotlin.jvm.internal.t.f(serializer, "serializer");
        if (t10 != null || this.f21359f.j()) {
            super.o(descriptor, i10, serializer, t10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ie.b, ie.f
    public <T> void q(fe.m<? super T> serializer, T t10) {
        kotlin.jvm.internal.t.f(serializer, "serializer");
        if (d().e().p()) {
            serializer.serialize(this, t10);
            return;
        }
        boolean z10 = serializer instanceof je.b;
        boolean z11 = false;
        if (!z10) {
            int i10 = z0.a.$EnumSwitchMapping$0[d().e().f().ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                he.m mVarD = serializer.getDescriptor().d();
                if (kotlin.jvm.internal.t.a(mVarD, he.n.a.f15864a) || kotlin.jvm.internal.t.a(mVarD, he.n.d.f15867a)) {
                    z11 = true;
                }
            }
        } else if (d().e().f() != kotlinx.serialization.json.a.NONE) {
            z11 = true;
        }
        String strC = z11 ? z0.c(serializer.getDescriptor(), d()) : null;
        if (z10) {
            je.b bVar = (je.b) serializer;
            if (t10 == 0) {
                throw new IllegalArgumentException(("Value for serializer " + bVar.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            fe.m<? super T> mVarB = fe.i.b(bVar, this, t10);
            if (strC != null) {
                z0.e(serializer, mVarB, strC);
            }
            z0.b(mVarB.getDescriptor().d());
            kotlin.jvm.internal.t.d(mVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializer = mVarB;
        }
        if (strC != null) {
            String strI = serializer.getDescriptor().i();
            this.f21361h = strC;
            this.f21362i = strI;
        }
        serializer.serialize(this, t10);
    }

    @Override // ie.b, ie.f
    public void r() {
        this.f21354a.k("null");
    }

    @Override // ie.b, ie.f
    public void u(short s10) {
        if (this.f21360g) {
            G(String.valueOf((int) s10));
        } else {
            this.f21354a.l(s10);
        }
    }

    @Override // ie.b, ie.f
    public void v(boolean z10) {
        if (this.f21360g) {
            G(String.valueOf(z10));
        } else {
            this.f21354a.m(z10);
        }
    }

    @Override // ie.b, ie.d
    public boolean w(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return this.f21359f.i();
    }

    @Override // ie.b, ie.f
    public void x(float f10) {
        if (this.f21360g) {
            G(String.valueOf(f10));
        } else {
            this.f21354a.h(f10);
        }
        if (this.f21359f.b()) {
            return;
        }
        if (!((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true)) {
            throw k0.b(Float.valueOf(f10), this.f21354a.f21412a.toString());
        }
    }

    @Override // ie.b, ie.f
    public void y(char c10) {
        G(String.valueOf(c10));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f1(g0 output, kotlinx.serialization.json.b json, o1 mode, kotlinx.serialization.json.t[] modeReuseCache) {
        this(c0.a(output, json), json, mode, modeReuseCache);
        kotlin.jvm.internal.t.f(output, "output");
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(mode, "mode");
        kotlin.jvm.internal.t.f(modeReuseCache, "modeReuseCache");
    }
}
