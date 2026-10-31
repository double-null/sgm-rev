package je;

import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: compiled from: PluginExceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b2 {
    public static final void a(int i10, int i11, he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(descriptor.f(i13));
            }
            i12 >>>= 1;
        }
        throw new MissingFieldException(arrayList, descriptor.i());
    }
}
