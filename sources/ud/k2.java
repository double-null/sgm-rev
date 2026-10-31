package ud;

/* JADX INFO: compiled from: MainCoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class k2 extends k0 {
    @Override // ud.k0
    public k0 o0(int i10, String str) {
        zd.m.a(i10);
        return zd.m.b(this, str);
    }

    public abstract k2 q0();

    protected final String r0() {
        k2 k2VarQ0;
        k2 k2VarC = e1.c();
        if (this == k2VarC) {
            return "Dispatchers.Main";
        }
        try {
            k2VarQ0 = k2VarC.q0();
        } catch (UnsupportedOperationException unused) {
            k2VarQ0 = null;
        }
        if (this == k2VarQ0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // ud.k0
    public String toString() {
        String strR0 = r0();
        if (strR0 != null) {
            return strR0;
        }
        return s0.a(this) + '@' + s0.b(this);
    }
}
