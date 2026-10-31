package l3;

import i0.f;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: JavaDataStorage.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static final <T> T a(f fVar, f.a<T> key, T t10) {
        t.f(fVar, "<this>");
        t.f(key, "key");
        T t11 = (T) fVar.b(key);
        return t11 == null ? t10 : t11;
    }
}
