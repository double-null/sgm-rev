package je;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: PluginGeneratedSerialDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h2 {
    public static final int a(he.f fVar, he.f[] typeParams) {
        kotlin.jvm.internal.t.f(fVar, "<this>");
        kotlin.jvm.internal.t.f(typeParams, "typeParams");
        int iHashCode = (fVar.i().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<he.f> iterableA = he.j.a(fVar);
        Iterator<he.f> it = iterableA.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String strI = it.next().i();
            if (strI != null) {
                iHashCode3 = strI.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator<he.f> it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            he.m mVarD = it2.next().d();
            iHashCode2 = i12 + (mVarD != null ? mVarD.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }
}
