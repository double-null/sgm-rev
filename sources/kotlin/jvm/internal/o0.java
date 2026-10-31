package kotlin.jvm.internal;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;

/* JADX INFO: compiled from: TypeReference.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class o0 implements pd.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f21530e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd.e f21531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<pd.m> f21532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pd.l f21533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21534d;

    /* JADX INFO: compiled from: TypeReference.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: TypeReference.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[pd.n.values().length];
            try {
                iArr[pd.n.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pd.n.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pd.n.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o0(pd.e classifier, List<pd.m> arguments, pd.l lVar, int i10) {
        t.f(classifier, "classifier");
        t.f(arguments, "arguments");
        this.f21531a = classifier;
        this.f21532b = arguments;
        this.f21533c = lVar;
        this.f21534d = i10;
    }

    private final String d(pd.m mVar) {
        String strValueOf;
        if (mVar.b() == null) {
            return "*";
        }
        pd.l lVarA = mVar.a();
        o0 o0Var = lVarA instanceof o0 ? (o0) lVarA : null;
        if (o0Var == null || (strValueOf = o0Var.i(true)) == null) {
            strValueOf = String.valueOf(mVar.a());
        }
        pd.n nVarB = mVar.b();
        int i10 = nVarB == null ? -1 : b.$EnumSwitchMapping$0[nVarB.ordinal()];
        if (i10 == 1) {
            return strValueOf;
        }
        if (i10 == 2) {
            return "in " + strValueOf;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + strValueOf;
    }

    private final String i(boolean z10) {
        String name;
        pd.e eVarC = c();
        pd.c cVar = eVarC instanceof pd.c ? (pd.c) eVarC : null;
        Class<?> clsA = cVar != null ? hd.a.a(cVar) : null;
        if (clsA == null) {
            name = c().toString();
        } else if ((this.f21534d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsA.isArray()) {
            name = k(clsA);
        } else if (z10 && clsA.isPrimitive()) {
            pd.e eVarC2 = c();
            t.d(eVarC2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = hd.a.b((pd.c) eVarC2).getName();
        } else {
            name = clsA.getName();
        }
        String str = name + (h().isEmpty() ? "" : kotlin.collections.b0.V(h(), ", ", "<", ">", 0, null, new id.l() { // from class: kotlin.jvm.internal.n0
            @Override // id.l
            public final Object invoke(Object obj) {
                return o0.j(this.f21529a, (pd.m) obj);
            }
        }, 24, null)) + (b() ? "?" : "");
        pd.l lVar = this.f21533c;
        if (!(lVar instanceof o0)) {
            return str;
        }
        String strI = ((o0) lVar).i(true);
        if (t.a(strI, str)) {
            return str;
        }
        if (t.a(strI, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + strI + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence j(o0 o0Var, pd.m it) {
        t.f(it, "it");
        return o0Var.d(it);
    }

    @Override // pd.l
    public boolean b() {
        return (this.f21534d & 1) != 0;
    }

    @Override // pd.l
    public pd.e c() {
        return this.f21531a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            if (t.a(c(), o0Var.c()) && t.a(h(), o0Var.h()) && t.a(this.f21533c, o0Var.f21533c) && this.f21534d == o0Var.f21534d) {
                return true;
            }
        }
        return false;
    }

    @Override // pd.l
    public List<pd.m> h() {
        return this.f21532b;
    }

    public int hashCode() {
        return (((c().hashCode() * 31) + h().hashCode()) * 31) + Integer.hashCode(this.f21534d);
    }

    public final int l() {
        return this.f21534d;
    }

    public final pd.l m() {
        return this.f21533c;
    }

    public String toString() {
        return i(false) + " (Kotlin reflection is not available)";
    }

    private final String k(Class<?> cls) {
        if (t.a(cls, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (t.a(cls, char[].class)) {
            return "kotlin.CharArray";
        }
        if (t.a(cls, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (t.a(cls, short[].class)) {
            return "kotlin.ShortArray";
        }
        if (t.a(cls, int[].class)) {
            return "kotlin.IntArray";
        }
        if (t.a(cls, float[].class)) {
            return "kotlin.FloatArray";
        }
        if (t.a(cls, long[].class)) {
            return "kotlin.LongArray";
        }
        return t.a(cls, double[].class) ? "kotlin.DoubleArray" : oqHAiWkeGzWld.stpuzj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(pd.e classifier, List<pd.m> arguments, boolean z10) {
        this(classifier, arguments, null, z10 ? 1 : 0);
        t.f(classifier, "classifier");
        t.f(arguments, "arguments");
    }
}
