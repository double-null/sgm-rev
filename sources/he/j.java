package he;

import java.util.Iterator;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SerialDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: compiled from: SerialDescriptor.kt */
    public static final class a implements Iterator<f>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f15856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f15857b;

        a(f fVar) {
            this.f15857b = fVar;
            this.f15856a = fVar.e();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f15857b;
            int iE = fVar.e();
            int i10 = this.f15856a;
            this.f15856a = i10 - 1;
            return fVar.h(iE - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15856a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: SerialDescriptor.kt */
    public static final class b implements Iterator<String>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f15858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f15859b;

        b(f fVar) {
            this.f15859b = fVar;
            this.f15858a = fVar.e();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            f fVar = this.f15859b;
            int iE = fVar.e();
            int i10 = this.f15858a;
            this.f15858a = i10 - 1;
            return fVar.f(iE - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15858a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: Iterables.kt */
    public static final class c implements Iterable<f>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f15860a;

        public c(f fVar) {
            this.f15860a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<f> iterator() {
            return new a(this.f15860a);
        }
    }

    /* JADX INFO: compiled from: Iterables.kt */
    public static final class d implements Iterable<String>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f15861a;

        public d(f fVar) {
            this.f15861a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new b(this.f15861a);
        }
    }

    public static final Iterable<f> a(f fVar) {
        t.f(fVar, "<this>");
        return new c(fVar);
    }

    public static final Iterable<String> b(f fVar) {
        t.f(fVar, "<this>");
        return new d(fVar);
    }
}
