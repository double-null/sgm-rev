package je;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class w<E, C extends Collection<? extends E>, B> extends v<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(fe.d<E> element) {
        super(element, null);
        kotlin.jvm.internal.t.f(element, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator<E> d(C c10) {
        kotlin.jvm.internal.t.f(c10, "<this>");
        return c10.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int e(C c10) {
        kotlin.jvm.internal.t.f(c10, "<this>");
        return c10.size();
    }
}
