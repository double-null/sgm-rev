package od;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends od.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f23381e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c f23382f = new c(1, 0);

    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public c(char c10, char c11) {
        super(c10, c11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (a() != cVar.a() || c() != cVar.c()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + c();
    }

    public boolean isEmpty() {
        return t.g(a(), c()) > 0;
    }

    public String toString() {
        return a() + ".." + c();
    }
}
