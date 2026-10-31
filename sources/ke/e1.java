package ke;

import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: StreamingJsonDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
public class e1 extends ie.a implements kotlinx.serialization.json.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kotlinx.serialization.json.b f21345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o1 f21346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ke.a f21347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final le.c f21348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f21350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kotlinx.serialization.json.g f21351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j0 f21352h;

    /* JADX INFO: compiled from: StreamingJsonDecoder.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f21353a;

        public a(String str) {
            this.f21353a = str;
        }
    }

    /* JADX INFO: compiled from: StreamingJsonDecoder.kt */
    public /* synthetic */ class b {
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
            try {
                iArr[o1.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e1(kotlinx.serialization.json.b json, o1 mode, ke.a lexer, he.f descriptor, a aVar) {
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(mode, "mode");
        kotlin.jvm.internal.t.f(lexer, "lexer");
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        this.f21345a = json;
        this.f21346b = mode;
        this.f21347c = lexer;
        this.f21348d = json.a();
        this.f21349e = -1;
        this.f21350f = aVar;
        kotlinx.serialization.json.g gVarE = json.e();
        this.f21351g = gVarE;
        this.f21352h = gVarE.j() ? null : new j0(descriptor);
    }

    private final void K() {
        if (this.f21347c.G() != 4) {
            return;
        }
        ke.a.x(this.f21347c, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean L(he.f fVar, int i10) {
        String strH;
        kotlinx.serialization.json.b bVar = this.f21345a;
        boolean zJ = fVar.j(i10);
        he.f fVarH = fVar.h(i10);
        if (zJ && !fVarH.b() && this.f21347c.O(true)) {
            return true;
        }
        if (kotlin.jvm.internal.t.a(fVarH.d(), he.m.b.f15863a) && ((!fVarH.b() || !this.f21347c.O(false)) && (strH = this.f21347c.H(this.f21351g.q())) != null)) {
            int i11 = m0.i(fVarH, bVar, strH);
            boolean z10 = !bVar.e().j() && fVarH.b();
            if (i11 == -3 && (zJ || z10)) {
                this.f21347c.o();
                return true;
            }
        }
        return false;
    }

    private final int M() {
        boolean zN = this.f21347c.N();
        if (!this.f21347c.e()) {
            if (!zN || this.f21345a.e().d()) {
                return -1;
            }
            k0.h(this.f21347c, "array");
            throw new KotlinNothingValueException();
        }
        int i10 = this.f21349e;
        if (i10 != -1 && !zN) {
            ke.a.x(this.f21347c, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = i10 + 1;
        this.f21349e = i11;
        return i11;
    }

    private final int N() {
        int i10 = this.f21349e;
        boolean zN = false;
        boolean z10 = i10 % 2 != 0;
        if (!z10) {
            this.f21347c.l(':');
        } else if (i10 != -1) {
            zN = this.f21347c.N();
        }
        if (!this.f21347c.e()) {
            if (!zN || this.f21345a.e().d()) {
                return -1;
            }
            k0.i(this.f21347c, null, 1, null);
            throw new KotlinNothingValueException();
        }
        if (z10) {
            if (this.f21349e == -1) {
                ke.a aVar = this.f21347c;
                boolean z11 = !zN;
                int i11 = aVar.f21315a;
                if (!z11) {
                    ke.a.x(aVar, "Unexpected leading comma", i11, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                ke.a aVar2 = this.f21347c;
                int i12 = aVar2.f21315a;
                if (!zN) {
                    ke.a.x(aVar2, "Expected comma after the key-value pair", i12, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i13 = this.f21349e + 1;
        this.f21349e = i13;
        return i13;
    }

    private final int O(he.f fVar) {
        boolean zN;
        boolean zN2 = this.f21347c.N();
        while (true) {
            boolean z10 = true;
            if (!this.f21347c.e()) {
                if (zN2 && !this.f21345a.e().d()) {
                    k0.i(this.f21347c, null, 1, null);
                    throw new KotlinNothingValueException();
                }
                j0 j0Var = this.f21352h;
                if (j0Var != null) {
                    return j0Var.d();
                }
                return -1;
            }
            String strP = P();
            this.f21347c.l(':');
            int i10 = m0.i(fVar, this.f21345a, strP);
            if (i10 == -3) {
                zN = false;
            } else {
                if (!this.f21351g.g() || !L(fVar, i10)) {
                    j0 j0Var2 = this.f21352h;
                    if (j0Var2 != null) {
                        j0Var2.c(i10);
                    }
                    return i10;
                }
                zN = this.f21347c.N();
                z10 = false;
            }
            zN2 = z10 ? Q(strP) : zN;
        }
    }

    private final String P() {
        return this.f21351g.q() ? this.f21347c.r() : this.f21347c.i();
    }

    private final boolean Q(String str) {
        if (this.f21351g.k() || S(this.f21350f, str)) {
            this.f21347c.J(this.f21351g.q());
        } else {
            this.f21347c.A(str);
        }
        return this.f21347c.N();
    }

    private final void R(he.f fVar) {
        while (f(fVar) != -1) {
        }
    }

    private final boolean S(a aVar, String str) {
        if (aVar == null || !kotlin.jvm.internal.t.a(aVar.f21353a, str)) {
            return false;
        }
        aVar.f21353a = null;
        return true;
    }

    @Override // ie.a, ie.e
    public String A() {
        return this.f21351g.q() ? this.f21347c.r() : this.f21347c.o();
    }

    @Override // ie.a, ie.e
    public boolean B() {
        j0 j0Var = this.f21352h;
        return ((j0Var != null ? j0Var.b() : false) || ke.a.P(this.f21347c, false, 1, null)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0157  */
    /* JADX WARN: Code duplicated, block: B:45:0x0158  */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x0158, please report this as an issue */
    @Override // ie.a, ie.e
    public <T> T C(fe.c<? extends T> deserializer) {
        String message;
        kotlinx.serialization.json.g0 g0VarK;
        kotlin.jvm.internal.t.f(deserializer, "deserializer");
        try {
            if ((deserializer instanceof je.b) && !this.f21345a.e().p()) {
                String strC = z0.c(((je.b) deserializer).getDescriptor(), this.f21345a);
                String strF = this.f21347c.F(strC, this.f21351g.q());
                if (strF != null) {
                    try {
                        fe.c cVarA = fe.i.a((je.b) deserializer, this, strF);
                        kotlin.jvm.internal.t.d(cVarA, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                        this.f21350f = new a(strC);
                        return (T) cVarA.deserialize(this);
                    } catch (SerializationException e10) {
                        String message2 = e10.getMessage();
                        kotlin.jvm.internal.t.c(message2);
                        String strC0 = rd.f0.C0(rd.f0.Y0(message2, '\n', null, 2, null), ".");
                        String message3 = e10.getMessage();
                        kotlin.jvm.internal.t.c(message3);
                        ke.a.x(this.f21347c, strC0, 0, rd.f0.Q0(message3, '\n', ""), 2, null);
                        throw new KotlinNothingValueException();
                    }
                }
                if ((deserializer instanceof je.b) && !d().e().p()) {
                    String strC2 = z0.c(((je.b) deserializer).getDescriptor(), d());
                    kotlinx.serialization.json.i iVarG = g();
                    String strI = ((je.b) deserializer).getDescriptor().i();
                    if (iVarG instanceof kotlinx.serialization.json.d0) {
                        kotlinx.serialization.json.d0 d0Var = (kotlinx.serialization.json.d0) iVarG;
                        kotlinx.serialization.json.i iVar = (kotlinx.serialization.json.i) d0Var.get(strC2);
                        try {
                            fe.c cVarA2 = fe.i.a((je.b) deserializer, this, (iVar == null || (g0VarK = kotlinx.serialization.json.k.k(iVar)) == null) ? null : kotlinx.serialization.json.k.f(g0VarK));
                            kotlin.jvm.internal.t.d(cVarA2, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                            return (T) l1.b(d(), strC2, d0Var, cVarA2);
                        } catch (SerializationException e11) {
                            String message4 = e11.getMessage();
                            kotlin.jvm.internal.t.c(message4);
                            throw k0.f(-1, message4, d0Var.toString());
                        }
                    }
                    throw k0.f(-1, "Expected " + kotlin.jvm.internal.i0.b(kotlinx.serialization.json.d0.class).g() + ", but had " + kotlin.jvm.internal.i0.b(iVarG.getClass()).g() + " as the serialized body of " + strI + " at element: " + this.f21347c.f21316b.a(), iVarG.toString());
                }
                return deserializer.deserialize(this);
                message = e.getMessage();
                kotlin.jvm.internal.t.c(message);
                if (rd.f0.U(message, "at path", false, 2, null)) {
                    throw e;
                }
                throw new MissingFieldException(e.b(), e.getMessage() + " at path: " + this.f21347c.f21316b.a(), e);
            }
            return deserializer.deserialize(this);
        } catch (MissingFieldException e12) {
            message = e12.getMessage();
            kotlin.jvm.internal.t.c(message);
            if (rd.f0.U(message, "at path", false, 2, null)) {
                throw e12;
            }
            throw new MissingFieldException(e12.b(), e12.getMessage() + " at path: " + this.f21347c.f21316b.a(), e12);
        }
    }

    @Override // ie.a, ie.e
    public byte G() {
        long jM = this.f21347c.m();
        byte b10 = (byte) jM;
        if (jM == b10) {
            return b10;
        }
        ke.a.x(this.f21347c, "Failed to parse byte for input '" + jM + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // ie.a, ie.e
    public int H(he.f enumDescriptor) {
        kotlin.jvm.internal.t.f(enumDescriptor, "enumDescriptor");
        return m0.j(enumDescriptor, this.f21345a, A(), " at path " + this.f21347c.f21316b.a());
    }

    @Override // ie.e, ie.c
    public le.c a() {
        return this.f21348d;
    }

    @Override // ie.a, ie.e
    public ie.c b(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        o1 o1VarB = p1.b(this.f21345a, descriptor);
        this.f21347c.f21316b.c(descriptor);
        this.f21347c.l(o1VarB.f21397a);
        K();
        int i10 = b.$EnumSwitchMapping$0[o1VarB.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return new e1(this.f21345a, o1VarB, this.f21347c, descriptor, this.f21350f);
        }
        return (this.f21346b == o1VarB && this.f21345a.e().j()) ? this : new e1(this.f21345a, o1VarB, this.f21347c, descriptor, this.f21350f);
    }

    @Override // ie.a, ie.c
    public void c(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        if (this.f21345a.e().k() && descriptor.e() == 0) {
            R(descriptor);
        }
        if (this.f21347c.N() && !this.f21345a.e().d()) {
            k0.h(this.f21347c, "");
            throw new KotlinNothingValueException();
        }
        this.f21347c.l(this.f21346b.f21398b);
        this.f21347c.f21316b.b();
    }

    @Override // kotlinx.serialization.json.h
    public final kotlinx.serialization.json.b d() {
        return this.f21345a;
    }

    @Override // ie.c
    public int f(he.f descriptor) {
        int iN;
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        int i10 = b.$EnumSwitchMapping$0[this.f21346b.ordinal()];
        if (i10 != 2) {
            iN = i10 != 4 ? M() : O(descriptor);
        } else {
            iN = N();
        }
        if (this.f21346b != o1.MAP) {
            this.f21347c.f21316b.g(iN);
        }
        return iN;
    }

    @Override // kotlinx.serialization.json.h
    public kotlinx.serialization.json.i g() {
        return new y0(this.f21345a.e(), this.f21347c).e();
    }

    @Override // ie.a, ie.e
    public int h() {
        long jM = this.f21347c.m();
        int i10 = (int) jM;
        if (jM == i10) {
            return i10;
        }
        ke.a.x(this.f21347c, "Failed to parse int for input '" + jM + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // ie.a, ie.e
    public Void i() {
        return null;
    }

    @Override // ie.a, ie.e
    public long k() {
        return this.f21347c.m();
    }

    @Override // ie.a, ie.e
    public ie.e r(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return g1.b(descriptor) ? new i0(this.f21347c, this.f21345a) : super.r(descriptor);
    }

    @Override // ie.a, ie.e
    public short s() {
        long jM = this.f21347c.m();
        short s10 = (short) jM;
        if (jM == s10) {
            return s10;
        }
        ke.a.x(this.f21347c, "Failed to parse short for input '" + jM + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // ie.a, ie.e
    public float t() {
        ke.a aVar = this.f21347c;
        String strQ = aVar.q();
        try {
            float f10 = Float.parseFloat(strQ);
            if (!this.f21345a.e().b()) {
                if (!((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true)) {
                    k0.l(this.f21347c, Float.valueOf(f10));
                    throw new KotlinNothingValueException();
                }
            }
            return f10;
        } catch (IllegalArgumentException unused) {
            ke.a.x(aVar, "Failed to parse type 'float' for input '" + strQ + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ie.a, ie.e
    public double u() {
        ke.a aVar = this.f21347c;
        String strQ = aVar.q();
        try {
            double d10 = Double.parseDouble(strQ);
            if (!this.f21345a.e().b()) {
                if (!((Double.isInfinite(d10) || Double.isNaN(d10)) ? false : true)) {
                    k0.l(this.f21347c, Double.valueOf(d10));
                    throw new KotlinNothingValueException();
                }
            }
            return d10;
        } catch (IllegalArgumentException unused) {
            ke.a.x(aVar, "Failed to parse type 'double' for input '" + strQ + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ie.a, ie.e
    public boolean v() {
        return this.f21347c.g();
    }

    @Override // ie.a, ie.e
    public char w() {
        String strQ = this.f21347c.q();
        if (strQ.length() == 1) {
            return strQ.charAt(0);
        }
        ke.a.x(this.f21347c, "Expected single char, but got '" + strQ + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ie.a, ie.c
    public <T> T F(he.f descriptor, int i10, fe.c<? extends T> cVar, T t10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        kotlin.jvm.internal.t.f(cVar, KBBdKxoAiHo.LZgJNFUGk);
        boolean z10 = this.f21346b == o1.MAP && (i10 & 1) == 0;
        if (z10) {
            this.f21347c.f21316b.d();
        }
        T t11 = (T) super.F(descriptor, i10, cVar, t10);
        if (z10) {
            this.f21347c.f21316b.f(t11);
        }
        return t11;
    }
}
