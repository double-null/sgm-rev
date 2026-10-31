package ke;

import com.facebook.appevents.eventdeactivation.ksG.UomBEukHFwrS;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
abstract class e extends je.n1 implements kotlinx.serialization.json.t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kotlinx.serialization.json.b f21333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final id.l<kotlinx.serialization.json.i, wc.g0> f21334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final kotlinx.serialization.json.g f21335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f21336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f21337f;

    /* JADX INFO: compiled from: TreeJsonEncoder.kt */
    public static final class a extends ie.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ he.f f21340c;

        a(String str, he.f fVar) {
            this.f21339b = str;
            this.f21340c = fVar;
        }

        @Override // ie.b, ie.f
        public void G(String value) {
            kotlin.jvm.internal.t.f(value, "value");
            e.this.w0(this.f21339b, new kotlinx.serialization.json.w(value, false, this.f21340c));
        }

        @Override // ie.f
        public le.c a() {
            return e.this.d().a();
        }
    }

    /* JADX INFO: compiled from: TreeJsonEncoder.kt */
    public static final class b extends ie.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final le.c f21341a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21343c;

        b(String str) {
            this.f21343c = str;
            this.f21341a = e.this.d().a();
        }

        @Override // ie.b, ie.f
        public void D(int i10) {
            K(Long.toString(((long) wc.z.b(i10)) & 4294967295L, 10));
        }

        public final void K(String s10) {
            kotlin.jvm.internal.t.f(s10, "s");
            e.this.w0(this.f21343c, new kotlinx.serialization.json.w(s10, false, null, 4, null));
        }

        @Override // ie.f
        public le.c a() {
            return this.f21341a;
        }

        @Override // ie.b, ie.f
        public void g(byte b10) {
            K(wc.x.e(wc.x.b(b10)));
        }

        @Override // ie.b, ie.f
        public void m(long j10) {
            K(h.a(wc.b0.b(j10), 10));
        }

        @Override // ie.b, ie.f
        public void u(short s10) {
            K(wc.e0.e(wc.e0.b(s10)));
        }
    }

    public /* synthetic */ e(kotlinx.serialization.json.b bVar, id.l lVar, kotlin.jvm.internal.k kVar) {
        this(bVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wc.g0 f0(e eVar, kotlinx.serialization.json.i node) {
        kotlin.jvm.internal.t.f(node, "node");
        eVar.w0(eVar.V(), node);
        return wc.g0.f27756a;
    }

    private final a u0(String str, he.f fVar) {
        return new a(str, fVar);
    }

    private final b v0(String str) {
        return new b(str);
    }

    @Override // kotlinx.serialization.json.t
    public void C(kotlinx.serialization.json.i element) {
        kotlin.jvm.internal.t.f(element, "element");
        if (this.f21336e == null || (element instanceof kotlinx.serialization.json.d0)) {
            q(kotlinx.serialization.json.r.f21606a, element);
        } else {
            z0.d(this.f21337f, element);
            throw new KotlinNothingValueException();
        }
    }

    @Override // je.z2
    protected void U(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        this.f21334c.invoke(s0());
    }

    @Override // ie.f
    public final le.c a() {
        return this.f21333b.a();
    }

    @Override // je.n1
    protected String a0(String parentName, String childName) {
        kotlin.jvm.internal.t.f(parentName, "parentName");
        kotlin.jvm.internal.t.f(childName, "childName");
        return childName;
    }

    @Override // je.n1
    protected String b0(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return m0.h(descriptor, this.f21333b, i10);
    }

    @Override // kotlinx.serialization.json.t
    public final kotlinx.serialization.json.b d() {
        return this.f21333b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.z2
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void J(String tag, boolean z10) {
        kotlin.jvm.internal.t.f(tag, "tag");
        w0(tag, kotlinx.serialization.json.k.a(Boolean.valueOf(z10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.z2
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void K(String tag, byte b10) {
        kotlin.jvm.internal.t.f(tag, "tag");
        w0(tag, kotlinx.serialization.json.k.b(Byte.valueOf(b10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.z2
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void L(String tag, char c10) {
        kotlin.jvm.internal.t.f(tag, "tag");
        w0(tag, kotlinx.serialization.json.k.c(String.valueOf(c10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.z2
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void M(String tag, double d10) {
        kotlin.jvm.internal.t.f(tag, "tag");
        w0(tag, kotlinx.serialization.json.k.b(Double.valueOf(d10)));
        if (this.f21335d.b()) {
            return;
        }
        if (!((Double.isInfinite(d10) || Double.isNaN(d10)) ? false : true)) {
            throw k0.c(Double.valueOf(d10), tag, s0().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.z2
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void N(String tag, he.f enumDescriptor, int i10) {
        kotlin.jvm.internal.t.f(tag, "tag");
        kotlin.jvm.internal.t.f(enumDescriptor, "enumDescriptor");
        w0(tag, kotlinx.serialization.json.k.c(enumDescriptor.f(i10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.z2
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void O(String tag, float f10) {
        kotlin.jvm.internal.t.f(tag, "tag");
        w0(tag, kotlinx.serialization.json.k.b(Float.valueOf(f10)));
        if (this.f21335d.b()) {
            return;
        }
        if (!((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true)) {
            throw k0.c(Float.valueOf(f10), tag, s0().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.z2
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public ie.f P(String tag, he.f inlineDescriptor) {
        kotlin.jvm.internal.t.f(tag, "tag");
        kotlin.jvm.internal.t.f(inlineDescriptor, "inlineDescriptor");
        if (g1.b(inlineDescriptor)) {
            return v0(tag);
        }
        return g1.a(inlineDescriptor) ? u0(tag, inlineDescriptor) : super.P(tag, inlineDescriptor);
    }

    @Override // je.z2, ie.f
    public ie.f n(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        if (W() == null) {
            return new p0(this.f21333b, this.f21334c).n(descriptor);
        }
        if (this.f21336e != null) {
            this.f21337f = descriptor.i();
        }
        return super.n(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.z2
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void Q(String tag, int i10) {
        kotlin.jvm.internal.t.f(tag, "tag");
        w0(tag, kotlinx.serialization.json.k.b(Integer.valueOf(i10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.z2
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void R(String tag, long j10) {
        kotlin.jvm.internal.t.f(tag, "tag");
        w0(tag, kotlinx.serialization.json.k.b(Long.valueOf(j10)));
    }

    protected void p0(String tag) {
        kotlin.jvm.internal.t.f(tag, "tag");
        w0(tag, kotlinx.serialization.json.a0.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.z2
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void S(String tag, short s10) {
        kotlin.jvm.internal.t.f(tag, "tag");
        w0(tag, kotlinx.serialization.json.k.b(Short.valueOf(s10)));
    }

    @Override // ie.f
    public void r() {
        String strW = W();
        if (strW == null) {
            this.f21334c.invoke(kotlinx.serialization.json.a0.INSTANCE);
        } else {
            p0(strW);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.z2
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void T(String tag, String value) {
        kotlin.jvm.internal.t.f(tag, "tag");
        kotlin.jvm.internal.t.f(value, "value");
        w0(tag, kotlinx.serialization.json.k.c(value));
    }

    public abstract kotlinx.serialization.json.i s0();

    protected final id.l<kotlinx.serialization.json.i, wc.g0> t0() {
        return this.f21334c;
    }

    @Override // ie.d
    public boolean w(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return this.f21335d.i();
    }

    public abstract void w0(String str, kotlinx.serialization.json.i iVar);

    @Override // ie.f
    public void z() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e(kotlinx.serialization.json.b bVar, id.l<? super kotlinx.serialization.json.i, wc.g0> lVar) {
        this.f21333b = bVar;
        this.f21334c = lVar;
        this.f21335d = bVar.e();
    }

    @Override // ie.f
    public ie.d b(he.f fVar) {
        e v0Var;
        kotlin.jvm.internal.t.f(fVar, UomBEukHFwrS.IRj);
        id.l<kotlinx.serialization.json.i, wc.g0> lVar = W() == null ? this.f21334c : new id.l() { // from class: ke.d
            @Override // id.l
            public final Object invoke(Object obj) {
                return e.f0(this.f21332a, (kotlinx.serialization.json.i) obj);
            }
        };
        he.m mVarD = fVar.d();
        if (kotlin.jvm.internal.t.a(mVarD, he.n.b.f15865a) || (mVarD instanceof he.d)) {
            v0Var = new v0(this.f21333b, lVar);
        } else if (kotlin.jvm.internal.t.a(mVarD, he.n.c.f15866a)) {
            kotlinx.serialization.json.b bVar = this.f21333b;
            he.f fVarA = p1.a(fVar.h(0), bVar.a());
            he.m mVarD2 = fVarA.d();
            if ((mVarD2 instanceof he.e) || kotlin.jvm.internal.t.a(mVarD2, he.m.b.f15863a)) {
                v0Var = new x0(this.f21333b, lVar);
            } else {
                if (!bVar.e().c()) {
                    throw k0.d(fVarA);
                }
                v0Var = new v0(this.f21333b, lVar);
            }
        } else {
            v0Var = new t0(this.f21333b, lVar);
        }
        String str = this.f21336e;
        if (str != null) {
            if (v0Var instanceof x0) {
                x0 x0Var = (x0) v0Var;
                x0Var.w0(SDKConstants.PARAM_KEY, kotlinx.serialization.json.k.c(str));
                String strI = this.f21337f;
                if (strI == null) {
                    strI = fVar.i();
                }
                x0Var.w0("value", kotlinx.serialization.json.k.c(strI));
            } else {
                String strI2 = this.f21337f;
                if (strI2 == null) {
                    strI2 = fVar.i();
                }
                v0Var.w0(str, kotlinx.serialization.json.k.c(strI2));
            }
            this.f21336e = null;
            this.f21337f = null;
        }
        return v0Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // je.z2, ie.f
    public <T> void q(fe.m<? super T> mVar, T t10) {
        kotlin.jvm.internal.t.f(mVar, wHzciBnJlYkdX.JJasz);
        if (W() == null && n1.c(p1.a(mVar.getDescriptor(), a()))) {
            new p0(this.f21333b, this.f21334c).q(mVar, t10);
            return;
        }
        if (d().e().p()) {
            mVar.serialize(this, t10);
            return;
        }
        boolean z10 = mVar instanceof je.b;
        boolean z11 = false;
        if (!z10) {
            int i10 = z0.a.$EnumSwitchMapping$0[d().e().f().ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                he.m mVarD = mVar.getDescriptor().d();
                if (kotlin.jvm.internal.t.a(mVarD, he.n.a.f15864a) || kotlin.jvm.internal.t.a(mVarD, he.n.d.f15867a)) {
                    z11 = true;
                }
            }
        } else if (d().e().f() != kotlinx.serialization.json.a.NONE) {
            z11 = true;
        }
        String strC = z11 ? z0.c(mVar.getDescriptor(), d()) : null;
        if (z10) {
            je.b bVar = (je.b) mVar;
            if (t10 == 0) {
                throw new IllegalArgumentException(("Value for serializer " + bVar.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            fe.m<? super T> mVarB = fe.i.b(bVar, this, t10);
            if (strC != null) {
                z0.e(mVar, mVarB, strC);
            }
            z0.b(mVarB.getDescriptor().d());
            kotlin.jvm.internal.t.d(mVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            mVar = mVarB;
        }
        if (strC != null) {
            String strI = mVar.getDescriptor().i();
            this.f21336e = strC;
            this.f21337f = strI;
        }
        mVar.serialize(this, t10);
    }
}
