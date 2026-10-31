package g4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LongSerializationPolicy.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f15376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f15377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ r[] f15378c;

    /* JADX INFO: compiled from: LongSerializationPolicy.java */
    final enum a extends r {
        a(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f15376a = aVar;
        r rVar = new r("STRING", 1) { // from class: g4.r.b
            {
                a aVar2 = null;
            }
        };
        f15377b = rVar;
        f15378c = new r[]{aVar, rVar};
    }

    private r(String str, int i10) {
        super(str, i10);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f15378c.clone();
    }

    /* synthetic */ r(String str, int i10, a aVar) {
        this(str, i10);
    }
}
