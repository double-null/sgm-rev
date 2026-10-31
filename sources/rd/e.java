package rd;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes5.dex */
final class e implements qd.g<od.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f25009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final id.p<CharSequence, Integer, wc.q<Integer, Integer>> f25012d;

    /* JADX INFO: compiled from: Strings.kt */
    public static final class a implements Iterator<od.h>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f25013a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f25015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private od.h f25016d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f25017e;

        a() {
            int iJ = od.k.j(e.this.f25010b, 0, e.this.f25009a.length());
            this.f25014b = iJ;
            this.f25015c = iJ;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0031 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:17:0x0098  */
        /* JADX WARN: Code duplicated, block: B:9:0x0023  */
        private final void a() {
            wc.q qVar;
            if (this.f25015c < 0) {
                this.f25013a = 0;
                this.f25016d = null;
                return;
            }
            if (e.this.f25011c > 0) {
                int i10 = this.f25017e + 1;
                this.f25017e = i10;
                if (i10 >= e.this.f25011c) {
                    this.f25016d = new od.h(this.f25014b, f0.c0(e.this.f25009a));
                    this.f25015c = -1;
                } else if (this.f25015c > e.this.f25009a.length() && (qVar = (wc.q) e.this.f25012d.invoke(e.this.f25009a, Integer.valueOf(this.f25015c))) != null) {
                    int iIntValue = ((Number) qVar.b()).intValue();
                    int iIntValue2 = ((Number) qVar.c()).intValue();
                    this.f25016d = od.k.n(this.f25014b, iIntValue);
                    int i11 = iIntValue + iIntValue2;
                    this.f25014b = i11;
                    this.f25015c = i11 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.f25016d = new od.h(this.f25014b, f0.c0(e.this.f25009a));
                    this.f25015c = -1;
                }
            } else if (this.f25015c > e.this.f25009a.length()) {
                this.f25016d = new od.h(this.f25014b, f0.c0(e.this.f25009a));
                this.f25015c = -1;
            } else {
                int iIntValue3 = ((Number) qVar.b()).intValue();
                int iIntValue4 = ((Number) qVar.c()).intValue();
                this.f25016d = od.k.n(this.f25014b, iIntValue3);
                int i12 = iIntValue3 + iIntValue4;
                this.f25014b = i12;
                this.f25015c = i12 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.f25013a = 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public od.h next() {
            if (this.f25013a == -1) {
                a();
            }
            if (this.f25013a == 0) {
                throw new NoSuchElementException();
            }
            od.h hVar = this.f25016d;
            kotlin.jvm.internal.t.d(hVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f25016d = null;
            this.f25013a = -1;
            return hVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f25013a == -1) {
                a();
            }
            return this.f25013a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(CharSequence input, int i10, int i11, id.p<? super CharSequence, ? super Integer, wc.q<Integer, Integer>> getNextMatch) {
        kotlin.jvm.internal.t.f(input, "input");
        kotlin.jvm.internal.t.f(getNextMatch, "getNextMatch");
        this.f25009a = input;
        this.f25010b = i10;
        this.f25011c = i11;
        this.f25012d = getNextMatch;
    }

    @Override // qd.g
    public Iterator<od.h> iterator() {
        return new a();
    }
}
