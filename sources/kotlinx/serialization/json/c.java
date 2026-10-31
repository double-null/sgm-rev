package kotlinx.serialization.json;

import d5.LXP.wcAlQCOdREZdI;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes5.dex */
@fe.l(with = d.class)
public final class c extends i implements List<i>, jd.a {
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<i> f21557a;

    /* JADX INFO: compiled from: JsonElement.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final fe.d<c> serializer() {
            return d.f21558a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends i> content) {
        super(null);
        kotlin.jvm.internal.t.f(content, "content");
        this.f21557a = content;
    }

    public boolean a(i element) {
        kotlin.jvm.internal.t.f(element, "element");
        return this.f21557a.contains(element);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends i> collection) {
        throw new UnsupportedOperationException(wcAlQCOdREZdI.fZPhkIMe);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i get(int i10) {
        return this.f21557a.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return a((i) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        return this.f21557a.containsAll(elements);
    }

    public int d() {
        return this.f21557a.size();
    }

    public int e(i element) {
        kotlin.jvm.internal.t.f(element, "element");
        return this.f21557a.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return kotlin.jvm.internal.t.a(this.f21557a, obj);
    }

    public int f(i element) {
        kotlin.jvm.internal.t.f(element, "element");
        return this.f21557a.lastIndexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f21557a.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return e((i) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f21557a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<i> iterator() {
        return this.f21557a.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return f((i) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<i> listIterator() {
        return this.f21557a.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ i remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<i> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ i set(int i10, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.List
    public void sort(Comparator<? super i> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<i> subList(int i10, int i11) {
        return this.f21557a.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.j.a(this);
    }

    public String toString() {
        return kotlin.collections.b0.V(this.f21557a, ",", "[", "]", 0, null, null, 56, null);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends i> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<i> listIterator(int i10) {
        return this.f21557a.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.t.f(array, "array");
        return (T[]) kotlin.jvm.internal.j.b(this, array);
    }
}
