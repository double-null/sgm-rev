package f4;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import x2.d;
import x2.g;
import x2.i;

/* JADX INFO: compiled from: ComponentMonitor.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, x2.c cVar, d dVar) {
        try {
            c.b(str);
            return cVar.h().create(dVar);
        } finally {
            c.a();
        }
    }

    @Override // x2.i
    public List<x2.c<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final x2.c<?> cVarT : componentRegistrar.getComponents()) {
            final String strI = cVarT.i();
            if (strI != null) {
                cVarT = cVarT.t(new g() { // from class: f4.a
                    @Override // x2.g
                    public final Object create(d dVar) {
                        return b.c(strI, cVarT, dVar);
                    }
                });
            }
            arrayList.add(cVarT);
        }
        return arrayList;
    }
}
