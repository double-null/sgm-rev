package ke;

import com.adjust.sdk.Constants;
import com.android.billingclient.gp.VRfCTjjLv;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
abstract class c extends je.m1 implements kotlinx.serialization.json.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kotlinx.serialization.json.b f21328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kotlinx.serialization.json.i f21329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f21330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final kotlinx.serialization.json.g f21331f;

    public /* synthetic */ c(kotlinx.serialization.json.b bVar, kotlinx.serialization.json.i iVar, String str, kotlin.jvm.internal.k kVar) {
        this(bVar, iVar, str);
    }

    private final Void B0(kotlinx.serialization.json.g0 g0Var, String str, String str2) {
        StringBuilder sb2;
        String str3;
        if (rd.c0.O(str, "i", false, 2, null)) {
            sb2 = new StringBuilder();
            str3 = VRfCTjjLv.kvJIronEyxtk;
        } else {
            sb2 = new StringBuilder();
            str3 = "a ";
        }
        sb2.append(str3);
        sb2.append(str);
        throw k0.f(-1, "Failed to parse literal '" + g0Var + "' as " + sb2.toString() + " value at element: " + A0(str2), m0().toString());
    }

    public final String A0(String currentTag) {
        kotlin.jvm.internal.t.f(currentTag, "currentTag");
        return i0() + '.' + currentTag;
    }

    @Override // ie.e
    public boolean B() {
        return !(m0() instanceof kotlinx.serialization.json.a0);
    }

    @Override // je.y2, ie.e
    public <T> T C(fe.c<? extends T> deserializer) {
        kotlinx.serialization.json.g0 g0VarK;
        kotlin.jvm.internal.t.f(deserializer, "deserializer");
        if (!(deserializer instanceof je.b) || d().e().p()) {
            return deserializer.deserialize(this);
        }
        je.b bVar = (je.b) deserializer;
        String strC = z0.c(bVar.getDescriptor(), d());
        kotlinx.serialization.json.i iVarG = g();
        String strI = bVar.getDescriptor().i();
        if (iVarG instanceof kotlinx.serialization.json.d0) {
            kotlinx.serialization.json.d0 d0Var = (kotlinx.serialization.json.d0) iVarG;
            kotlinx.serialization.json.i iVar = (kotlinx.serialization.json.i) d0Var.get(strC);
            try {
                fe.c cVarA = fe.i.a((je.b) deserializer, this, (iVar == null || (g0VarK = kotlinx.serialization.json.k.k(iVar)) == null) ? null : kotlinx.serialization.json.k.f(g0VarK));
                kotlin.jvm.internal.t.d(cVarA, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return (T) l1.b(d(), strC, d0Var, cVarA);
            } catch (SerializationException e10) {
                String message = e10.getMessage();
                kotlin.jvm.internal.t.c(message);
                throw k0.f(-1, message, d0Var.toString());
            }
        }
        throw k0.f(-1, "Expected " + kotlin.jvm.internal.i0.b(kotlinx.serialization.json.d0.class).g() + ", but had " + kotlin.jvm.internal.i0.b(iVarG.getClass()).g() + " as the serialized body of " + strI + " at element: " + i0(), iVarG.toString());
    }

    @Override // ie.e, ie.c
    public le.c a() {
        return d().a();
    }

    @Override // ie.e
    public ie.c b(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        kotlinx.serialization.json.i iVarM0 = m0();
        he.m mVarD = descriptor.d();
        if (kotlin.jvm.internal.t.a(mVarD, he.n.b.f15865a) || (mVarD instanceof he.d)) {
            kotlinx.serialization.json.b bVarD = d();
            String strI = descriptor.i();
            if (iVarM0 instanceof kotlinx.serialization.json.c) {
                return new u0(bVarD, (kotlinx.serialization.json.c) iVarM0);
            }
            throw k0.f(-1, "Expected " + kotlin.jvm.internal.i0.b(kotlinx.serialization.json.c.class).g() + ", but had " + kotlin.jvm.internal.i0.b(iVarM0.getClass()).g() + " as the serialized body of " + strI + " at element: " + i0(), iVarM0.toString());
        }
        if (!kotlin.jvm.internal.t.a(mVarD, he.n.c.f15866a)) {
            kotlinx.serialization.json.b bVarD2 = d();
            String strI2 = descriptor.i();
            if (iVarM0 instanceof kotlinx.serialization.json.d0) {
                return new s0(bVarD2, (kotlinx.serialization.json.d0) iVarM0, this.f21330e, null, 8, null);
            }
            throw k0.f(-1, "Expected " + kotlin.jvm.internal.i0.b(kotlinx.serialization.json.d0.class).g() + ", but had " + kotlin.jvm.internal.i0.b(iVarM0.getClass()).g() + " as the serialized body of " + strI2 + " at element: " + i0(), iVarM0.toString());
        }
        kotlinx.serialization.json.b bVarD3 = d();
        he.f fVarA = p1.a(descriptor.h(0), bVarD3.a());
        he.m mVarD2 = fVarA.d();
        if ((mVarD2 instanceof he.e) || kotlin.jvm.internal.t.a(mVarD2, he.m.b.f15863a)) {
            kotlinx.serialization.json.b bVarD4 = d();
            String strI3 = descriptor.i();
            if (iVarM0 instanceof kotlinx.serialization.json.d0) {
                return new w0(bVarD4, (kotlinx.serialization.json.d0) iVarM0);
            }
            throw k0.f(-1, "Expected " + kotlin.jvm.internal.i0.b(kotlinx.serialization.json.d0.class).g() + ", but had " + kotlin.jvm.internal.i0.b(iVarM0.getClass()).g() + " as the serialized body of " + strI3 + " at element: " + i0(), iVarM0.toString());
        }
        if (!bVarD3.e().c()) {
            throw k0.d(fVarA);
        }
        kotlinx.serialization.json.b bVarD5 = d();
        String strI4 = descriptor.i();
        if (iVarM0 instanceof kotlinx.serialization.json.c) {
            return new u0(bVarD5, (kotlinx.serialization.json.c) iVarM0);
        }
        throw k0.f(-1, "Expected " + kotlin.jvm.internal.i0.b(kotlinx.serialization.json.c.class).g() + ", but had " + kotlin.jvm.internal.i0.b(iVarM0.getClass()).g() + " as the serialized body of " + strI4 + " at element: " + i0(), iVarM0.toString());
    }

    @Override // ie.c
    public void c(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.json.h
    public kotlinx.serialization.json.b d() {
        return this.f21328c;
    }

    @Override // je.m1
    protected String e0(String parentName, String childName) {
        kotlin.jvm.internal.t.f(parentName, "parentName");
        kotlin.jvm.internal.t.f(childName, "childName");
        return childName;
    }

    @Override // kotlinx.serialization.json.h
    public kotlinx.serialization.json.i g() {
        return m0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract kotlinx.serialization.json.i l0(String str);

    protected final kotlinx.serialization.json.i m0() {
        kotlinx.serialization.json.i iVarL0;
        String strY = Y();
        return (strY == null || (iVarL0 = l0(strY)) == null) ? z0() : iVarL0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.y2
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public boolean N(String tag) {
        kotlin.jvm.internal.t.f(tag, "tag");
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        if (iVarL0 instanceof kotlinx.serialization.json.g0) {
            kotlinx.serialization.json.g0 g0Var = (kotlinx.serialization.json.g0) iVarL0;
            try {
                Boolean boolE = kotlinx.serialization.json.k.e(g0Var);
                if (boolE != null) {
                    return boolE.booleanValue();
                }
                B0(g0Var, "boolean", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                B0(g0Var, "boolean", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw k0.f(-1, "Expected " + kotlin.jvm.internal.i0.b(kotlinx.serialization.json.g0.class).g() + ", but had " + kotlin.jvm.internal.i0.b(iVarL0.getClass()).g() + " as the serialized body of boolean at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.y2
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public byte O(String tag) {
        kotlin.jvm.internal.t.f(tag, "tag");
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        if (!(iVarL0 instanceof kotlinx.serialization.json.g0)) {
            throw k0.f(-1, "Expected " + kotlin.jvm.internal.i0.b(kotlinx.serialization.json.g0.class).g() + ", but had " + kotlin.jvm.internal.i0.b(iVarL0.getClass()).g() + " as the serialized body of byte at element: " + A0(tag), iVarL0.toString());
        }
        kotlinx.serialization.json.g0 g0Var = (kotlinx.serialization.json.g0) iVarL0;
        try {
            int i10 = kotlinx.serialization.json.k.i(g0Var);
            boolean z10 = false;
            if (-128 <= i10 && i10 <= 127) {
                z10 = true;
            }
            Byte bValueOf = z10 ? Byte.valueOf((byte) i10) : null;
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            B0(g0Var, "byte", tag);
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            B0(g0Var, "byte", tag);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.y2
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public char P(String tag) {
        kotlin.jvm.internal.t.f(tag, "tag");
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        if (iVarL0 instanceof kotlinx.serialization.json.g0) {
            kotlinx.serialization.json.g0 g0Var = (kotlinx.serialization.json.g0) iVarL0;
            try {
                return rd.h0.i1(g0Var.a());
            } catch (IllegalArgumentException unused) {
                B0(g0Var, "char", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw k0.f(-1, "Expected " + kotlin.jvm.internal.i0.b(kotlinx.serialization.json.g0.class).g() + ", but had " + kotlin.jvm.internal.i0.b(iVarL0.getClass()).g() + " as the serialized body of char at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.y2
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public double Q(String tag) {
        kotlin.jvm.internal.t.f(tag, "tag");
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        if (iVarL0 instanceof kotlinx.serialization.json.g0) {
            kotlinx.serialization.json.g0 g0Var = (kotlinx.serialization.json.g0) iVarL0;
            try {
                double dG = kotlinx.serialization.json.k.g(g0Var);
                if (!d().e().b()) {
                    if (!((Double.isInfinite(dG) || Double.isNaN(dG)) ? false : true)) {
                        throw k0.a(Double.valueOf(dG), tag, m0().toString());
                    }
                }
                return dG;
            } catch (IllegalArgumentException unused) {
                B0(g0Var, "double", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw k0.f(-1, "Expected " + kotlin.jvm.internal.i0.b(kotlinx.serialization.json.g0.class).g() + ", but had " + kotlin.jvm.internal.i0.b(iVarL0.getClass()).g() + " as the serialized body of double at element: " + A0(tag), iVarL0.toString());
    }

    @Override // je.y2, ie.e
    public ie.e r(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return Y() != null ? super.r(descriptor) : new o0(d(), z0(), this.f21330e).r(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.y2
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public int R(String tag, he.f enumDescriptor) {
        kotlin.jvm.internal.t.f(tag, "tag");
        kotlin.jvm.internal.t.f(enumDescriptor, "enumDescriptor");
        kotlinx.serialization.json.b bVarD = d();
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        String strI = enumDescriptor.i();
        if (iVarL0 instanceof kotlinx.serialization.json.g0) {
            return m0.k(enumDescriptor, bVarD, ((kotlinx.serialization.json.g0) iVarL0).a(), null, 4, null);
        }
        throw k0.f(-1, "Expected " + kotlin.jvm.internal.i0.b(kotlinx.serialization.json.g0.class).g() + ", but had " + kotlin.jvm.internal.i0.b(iVarL0.getClass()).g() + " as the serialized body of " + strI + " at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.y2
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public float S(String tag) {
        kotlin.jvm.internal.t.f(tag, "tag");
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        if (iVarL0 instanceof kotlinx.serialization.json.g0) {
            kotlinx.serialization.json.g0 g0Var = (kotlinx.serialization.json.g0) iVarL0;
            try {
                float fH = kotlinx.serialization.json.k.h(g0Var);
                if (!d().e().b()) {
                    if (!((Float.isInfinite(fH) || Float.isNaN(fH)) ? false : true)) {
                        throw k0.a(Float.valueOf(fH), tag, m0().toString());
                    }
                }
                return fH;
            } catch (IllegalArgumentException unused) {
                B0(g0Var, "float", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw k0.f(-1, "Expected " + kotlin.jvm.internal.i0.b(kotlinx.serialization.json.g0.class).g() + ", but had " + kotlin.jvm.internal.i0.b(iVarL0.getClass()).g() + " as the serialized body of float at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.y2
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public int U(String tag) {
        kotlin.jvm.internal.t.f(tag, "tag");
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        if (iVarL0 instanceof kotlinx.serialization.json.g0) {
            kotlinx.serialization.json.g0 g0Var = (kotlinx.serialization.json.g0) iVarL0;
            try {
                return kotlinx.serialization.json.k.i(g0Var);
            } catch (IllegalArgumentException unused) {
                B0(g0Var, "int", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw k0.f(-1, "Expected " + kotlin.jvm.internal.i0.b(kotlinx.serialization.json.g0.class).g() + ", but had " + kotlin.jvm.internal.i0.b(iVarL0.getClass()).g() + " as the serialized body of int at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.y2
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public long V(String tag) {
        kotlin.jvm.internal.t.f(tag, "tag");
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        if (iVarL0 instanceof kotlinx.serialization.json.g0) {
            kotlinx.serialization.json.g0 g0Var = (kotlinx.serialization.json.g0) iVarL0;
            try {
                return kotlinx.serialization.json.k.m(g0Var);
            } catch (IllegalArgumentException unused) {
                B0(g0Var, Constants.LONG, tag);
                throw new KotlinNothingValueException();
            }
        }
        throw k0.f(-1, "Expected " + kotlin.jvm.internal.i0.b(kotlinx.serialization.json.g0.class).g() + ", but had " + kotlin.jvm.internal.i0.b(iVarL0.getClass()).g() + " as the serialized body of " + Constants.LONG + " at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.y2
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public short W(String tag) {
        kotlin.jvm.internal.t.f(tag, "tag");
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        if (!(iVarL0 instanceof kotlinx.serialization.json.g0)) {
            throw k0.f(-1, "Expected " + kotlin.jvm.internal.i0.b(kotlinx.serialization.json.g0.class).g() + ", but had " + kotlin.jvm.internal.i0.b(iVarL0.getClass()).g() + " as the serialized body of short at element: " + A0(tag), iVarL0.toString());
        }
        kotlinx.serialization.json.g0 g0Var = (kotlinx.serialization.json.g0) iVarL0;
        try {
            int i10 = kotlinx.serialization.json.k.i(g0Var);
            boolean z10 = false;
            if (-32768 <= i10 && i10 <= 32767) {
                z10 = true;
            }
            Short shValueOf = z10 ? Short.valueOf((short) i10) : null;
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            B0(g0Var, "short", tag);
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            B0(g0Var, "short", tag);
            throw new KotlinNothingValueException();
        }
    }

    protected final String y0() {
        return this.f21330e;
    }

    public abstract kotlinx.serialization.json.i z0();

    public /* synthetic */ c(kotlinx.serialization.json.b bVar, kotlinx.serialization.json.i iVar, String str, int i10, kotlin.jvm.internal.k kVar) {
        this(bVar, iVar, (i10 & 4) != 0 ? null : str, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.y2
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public ie.e T(String tag, he.f fVar) {
        kotlin.jvm.internal.t.f(tag, "tag");
        kotlin.jvm.internal.t.f(fVar, ljglrLUdGZhMhQ.mHemRNm);
        if (!g1.b(fVar)) {
            return super.T(tag, fVar);
        }
        kotlinx.serialization.json.b bVarD = d();
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        String strI = fVar.i();
        if (iVarL0 instanceof kotlinx.serialization.json.g0) {
            return new i0(i1.a(bVarD, ((kotlinx.serialization.json.g0) iVarL0).a()), d());
        }
        throw k0.f(-1, "Expected " + kotlin.jvm.internal.i0.b(kotlinx.serialization.json.g0.class).g() + ", but had " + kotlin.jvm.internal.i0.b(iVarL0.getClass()).g() + " as the serialized body of " + strI + " at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.y2
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public String X(String tag) {
        kotlin.jvm.internal.t.f(tag, "tag");
        kotlinx.serialization.json.i iVarL0 = l0(tag);
        if (!(iVarL0 instanceof kotlinx.serialization.json.g0)) {
            throw k0.f(-1, "Expected " + kotlin.jvm.internal.i0.b(kotlinx.serialization.json.g0.class).g() + ", but had " + kotlin.jvm.internal.i0.b(iVarL0.getClass()).g() + " as the serialized body of string at element: " + A0(tag), iVarL0.toString());
        }
        kotlinx.serialization.json.g0 g0Var = (kotlinx.serialization.json.g0) iVarL0;
        if (!(g0Var instanceof kotlinx.serialization.json.w)) {
            throw k0.f(-1, edUJlCZxhVnO.uVMczXXEfpBLpzT + tag + "', got null literal instead at element: " + A0(tag), m0().toString());
        }
        kotlinx.serialization.json.w wVar = (kotlinx.serialization.json.w) g0Var;
        if (wVar.d() || d().e().q()) {
            return wVar.a();
        }
        throw k0.f(-1, "String literal for key '" + tag + "' should be quoted at element: " + A0(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", m0().toString());
    }

    private c(kotlinx.serialization.json.b bVar, kotlinx.serialization.json.i iVar, String str) {
        this.f21328c = bVar;
        this.f21329d = iVar;
        this.f21330e = str;
        this.f21331f = d().e();
    }
}
