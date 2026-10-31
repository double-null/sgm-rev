package je;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p0<E> extends w<E, Set<? extends E>, HashSet<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final he.f f20979b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(fe.d<E> eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.t.f(eSerializer, "eSerializer");
        this.f20979b = new o0(eSerializer.getDescriptor());
    }

    @Override // je.v, fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return this.f20979b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashSet<E> a() {
        return new HashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(HashSet<E> hashSet) {
        kotlin.jvm.internal.t.f(hashSet, "<this>");
        return hashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(HashSet<E> hashSet, int i10) {
        kotlin.jvm.internal.t.f(hashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.v
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(HashSet<E> hashSet, int i10, E e10) {
        kotlin.jvm.internal.t.f(hashSet, "<this>");
        hashSet.add(e10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public HashSet<E> k(Set<? extends E> set) {
        kotlin.jvm.internal.t.f(set, "<this>");
        HashSet<E> hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet<>(set) : hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set<E> l(HashSet<E> hashSet) {
        kotlin.jvm.internal.t.f(hashSet, "<this>");
        return hashSet;
    }
}
