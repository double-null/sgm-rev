package pd;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: KTypeProjection.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f24255c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f24256d = new m(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f24257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f24258b;

    /* JADX INFO: compiled from: KTypeProjection.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final m a(l type) {
            t.f(type, "type");
            return new m(n.INVARIANT, type);
        }
    }

    /* JADX INFO: compiled from: KTypeProjection.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public m(n nVar, l lVar) {
        String str;
        this.f24257a = nVar;
        this.f24258b = lVar;
        if ((nVar == null) == (lVar == null)) {
            return;
        }
        if (nVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + nVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final l a() {
        return this.f24258b;
    }

    public final n b() {
        return this.f24257a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f24257a == mVar.f24257a && t.a(this.f24258b, mVar.f24258b);
    }

    public int hashCode() {
        n nVar = this.f24257a;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        l lVar = this.f24258b;
        return iHashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    public String toString() {
        n nVar = this.f24257a;
        int i10 = nVar == null ? -1 : b.$EnumSwitchMapping$0[nVar.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        if (i10 == 1) {
            return String.valueOf(this.f24258b);
        }
        if (i10 == 2) {
            return "in " + this.f24258b;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + this.f24258b;
    }
}
