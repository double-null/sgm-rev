package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: ViewGroup.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t2 {

    /* JADX INFO: compiled from: ViewGroup.kt */
    public static final class a implements qd.g<View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f1966a;

        a(ViewGroup viewGroup) {
            this.f1966a = viewGroup;
        }

        @Override // qd.g
        public Iterator<View> iterator() {
            return t2.c(this.f1966a);
        }
    }

    /* JADX INFO: compiled from: ViewGroup.kt */
    static final class b extends kotlin.jvm.internal.u implements id.l<View, Iterator<? extends View>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f1967d = new b();

        b() {
            super(1);
        }

        @Override // id.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterator<View> invoke(View view) {
            qd.g<View> gVarA;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (gVarA = t2.a(viewGroup)) == null) {
                return null;
            }
            return gVarA.iterator();
        }
    }

    /* JADX INFO: compiled from: ViewGroup.kt */
    public static final class c implements Iterator<View>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f1969b;

        c(ViewGroup viewGroup) {
            this.f1969b = viewGroup;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f1969b;
            int i10 = this.f1968a;
            this.f1968a = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1968a < this.f1969b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f1969b;
            int i10 = this.f1968a - 1;
            this.f1968a = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class d implements qd.g<View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f1970a;

        public d(ViewGroup viewGroup) {
            this.f1970a = viewGroup;
        }

        @Override // qd.g
        public Iterator<View> iterator() {
            return new v0(t2.a(this.f1970a).iterator(), b.f1967d);
        }
    }

    public static final qd.g<View> a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final qd.g<View> b(ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    public static final Iterator<View> c(ViewGroup viewGroup) {
        return new c(viewGroup);
    }
}
