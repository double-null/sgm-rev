package kotlin.jvm.internal;

/* JADX INFO: compiled from: PropertyReference.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d0 extends f implements pd.h {
    private final boolean syntheticJavaProperty;

    public d0() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.f
    public pd.b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return getOwner().equals(d0Var.getOwner()) && getName().equals(d0Var.getName()) && getSignature().equals(d0Var.getSignature()) && t.a(getBoundReceiver(), d0Var.getBoundReceiver());
        }
        if (obj instanceof pd.h) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // pd.h
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // pd.h
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        pd.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.f
    public pd.h getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (pd.h) super.getReflected();
    }

    public d0(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    public d0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.syntheticJavaProperty = (i10 & 2) == 2;
    }
}
