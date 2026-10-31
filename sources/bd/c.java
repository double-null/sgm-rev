package bd;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.collections.o;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: EnumEntries.kt */
/* JADX INFO: loaded from: classes5.dex */
final class c<T extends Enum<T>> extends kotlin.collections.d<T> implements a<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T[] f4453a;

    public c(T[] entries) {
        t.f(entries, "entries");
        this.f4453a = entries;
    }

    private final Object writeReplace() {
        return new d(this.f4453a);
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return e((Enum) obj);
        }
        return false;
    }

    public boolean e(T element) {
        t.f(element, "element");
        return ((Enum) o.E(this.f4453a, element.ordinal())) == element;
    }

    @Override // kotlin.collections.d, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public T get(int i10) {
        kotlin.collections.d.Companion.b(i10, this.f4453a.length);
        return this.f4453a[i10];
    }

    public int g(T element) {
        t.f(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) o.E(this.f4453a, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.d, kotlin.collections.b
    public int getSize() {
        return this.f4453a.length;
    }

    @Override // kotlin.collections.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return g((Enum) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return o((Enum) obj);
        }
        return -1;
    }

    public int o(T element) {
        t.f(element, "element");
        return indexOf(element);
    }
}
