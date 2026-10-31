package kotlin.jvm.internal;

/* JADX INFO: compiled from: FunctionReference.java */
/* JADX INFO: loaded from: classes5.dex */
public class p extends f implements o, pd.g {
    private final int arity;
    private final int flags;

    public p(int i10) {
        this(i10, f.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.f
    protected pd.b computeReflected() {
        return i0.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return getName().equals(pVar.getName()) && getSignature().equals(pVar.getSignature()) && this.flags == pVar.flags && this.arity == pVar.arity && t.a(getBoundReceiver(), pVar.getBoundReceiver()) && t.a(getOwner(), pVar.getOwner());
        }
        if (obj instanceof pd.g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.o
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // pd.g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // pd.g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // pd.g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // pd.g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.f, pd.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        pd.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public p(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.f
    public pd.g getReflected() {
        return (pd.g) super.getReflected();
    }

    public p(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}
