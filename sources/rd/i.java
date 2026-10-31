package rd;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes5.dex */
final class i implements Iterator<String>, jd.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f25052f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f25053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25057e;

    /* JADX INFO: compiled from: Strings.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public i(CharSequence string) {
        kotlin.jvm.internal.t.f(string, "string");
        this.f25053a = string;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f25054b = 0;
        int i10 = this.f25056d;
        int i11 = this.f25055c;
        this.f25055c = this.f25057e + i10;
        return this.f25053a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f25054b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f25057e < 0) {
            this.f25054b = 2;
            return false;
        }
        int length = this.f25053a.length();
        int length2 = this.f25053a.length();
        for (int i13 = this.f25055c; i13 < length2; i13++) {
            char cCharAt = this.f25053a.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < this.f25053a.length() && this.f25053a.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f25054b = 1;
                this.f25057e = i10;
                this.f25056d = length;
                return true;
            }
        }
        i10 = -1;
        this.f25054b = 1;
        this.f25057e = i10;
        this.f25056d = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
