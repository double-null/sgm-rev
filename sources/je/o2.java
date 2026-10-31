package je;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class o2<ElementKlass, Element extends ElementKlass> extends v<Element, Element[], ArrayList<Element>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pd.c<ElementKlass> f20973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final he.f f20974c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(pd.c<ElementKlass> kClass, fe.d<Element> eSerializer) {
        super(eSerializer, null);
        kotlin.jvm.internal.t.f(kClass, "kClass");
        kotlin.jvm.internal.t.f(eSerializer, "eSerializer");
        this.f20973b = kClass;
        this.f20974c = new d(eSerializer.getDescriptor());
    }

    @Override // je.v, fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return this.f20974c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> a() {
        return new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList<Element> arrayList) {
        kotlin.jvm.internal.t.f(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList<Element> arrayList, int i10) {
        kotlin.jvm.internal.t.f(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Iterator<Element> d(Element[] elementArr) {
        kotlin.jvm.internal.t.f(elementArr, "<this>");
        return kotlin.jvm.internal.c.a(elementArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int e(Element[] elementArr) {
        kotlin.jvm.internal.t.f(elementArr, "<this>");
        return elementArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.v
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(ArrayList<Element> arrayList, int i10, Element element) {
        kotlin.jvm.internal.t.f(arrayList, "<this>");
        arrayList.add(i10, element);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> k(Element[] elementArr) {
        kotlin.jvm.internal.t.f(elementArr, "<this>");
        return new ArrayList<>(kotlin.collections.m.c(elementArr));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Element[] l(ArrayList<Element> arrayList) {
        kotlin.jvm.internal.t.f(arrayList, "<this>");
        return (Element[]) z1.q(arrayList, this.f20973b);
    }
}
