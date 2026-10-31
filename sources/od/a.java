package od;

import kotlin.collections.q;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes5.dex */
public class a implements Iterable<Character>, jd.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0385a f23373d = new C0385a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f23374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f23375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23376c;

    /* JADX INFO: renamed from: od.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Progressions.kt */
    public static final class C0385a {
        private C0385a() {
        }

        public /* synthetic */ C0385a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f23374a = c10;
        this.f23375b = (char) cd.c.b(c10, c11, i10);
        this.f23376c = i10;
    }

    public final char a() {
        return this.f23374a;
    }

    public final char c() {
        return this.f23375b;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public q iterator() {
        return new b(this.f23374a, this.f23375b, this.f23376c);
    }
}
