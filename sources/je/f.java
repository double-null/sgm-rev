package je;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f<E> extends w<E, List<? extends E>, ArrayList<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final he.f f20897b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(fe.d<E> element) {
        super(element);
        kotlin.jvm.internal.t.f(element, "element");
        this.f20897b = new e(element.getDescriptor());
    }

    @Override // je.v, fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return this.f20897b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> a() {
        return new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList<E> arrayList) {
        kotlin.jvm.internal.t.f(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList<E> arrayList, int i10) {
        kotlin.jvm.internal.t.f(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.v
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(ArrayList<E> arrayList, int i10, E e10) {
        kotlin.jvm.internal.t.f(arrayList, "<this>");
        arrayList.add(i10, e10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> k(List<? extends E> list) {
        kotlin.jvm.internal.t.f(list, "<this>");
        ArrayList<E> arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList<>(list) : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public List<E> l(ArrayList<E> arrayList) {
        kotlin.jvm.internal.t.f(arrayList, "<this>");
        return arrayList;
    }
}
