package je;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b1<E> extends w<E, Set<? extends E>, LinkedHashSet<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final he.f f20869b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(fe.d<E> eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.t.f(eSerializer, "eSerializer");
        this.f20869b = new a1(eSerializer.getDescriptor());
    }

    @Override // je.v, fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return this.f20869b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> a() {
        return new LinkedHashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(LinkedHashSet<E> linkedHashSet) {
        kotlin.jvm.internal.t.f(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(LinkedHashSet<E> linkedHashSet, int i10) {
        kotlin.jvm.internal.t.f(linkedHashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.v
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(LinkedHashSet<E> linkedHashSet, int i10, E e10) {
        kotlin.jvm.internal.t.f(linkedHashSet, "<this>");
        linkedHashSet.add(e10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> k(Set<? extends E> set) {
        kotlin.jvm.internal.t.f(set, "<this>");
        LinkedHashSet<E> linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet<>(set) : linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set<E> l(LinkedHashSet<E> linkedHashSet) {
        kotlin.jvm.internal.t.f(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
