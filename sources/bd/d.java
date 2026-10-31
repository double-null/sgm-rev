package bd;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: EnumEntriesSerializationProxy.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d<E extends Enum<E>> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f4454b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<E> f4455a;

    /* JADX INFO: compiled from: EnumEntriesSerializationProxy.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    public d(E[] entries) {
        t.f(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        t.c(cls);
        this.f4455a = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.f4455a.getEnumConstants();
        t.e(enumConstants, "getEnumConstants(...)");
        return b.a(enumConstants);
    }
}
