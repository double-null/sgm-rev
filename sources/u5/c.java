package u5;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import o5.o;
import org.json.JSONObject;
import w5.e;
import w5.h;

/* JADX INFO: loaded from: classes4.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f25904a;

    public c(a aVar) {
        this.f25904a = aVar;
    }

    @Override // u5.a
    public JSONObject a(View view) {
        JSONObject jSONObjectB = w5.c.b(0, 0, 0, 0);
        w5.c.h(jSONObjectB, e.a());
        return jSONObjectB;
    }

    ArrayList<View> b() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        s5.c cVarE = s5.c.e();
        if (cVarE != null) {
            Collection<o> collectionA = cVarE.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionA.size() * 2) + 3);
            Iterator<o> it = collectionA.iterator();
            while (it.hasNext()) {
                View viewM = it.next().m();
                if (viewM != null && h.g(viewM) && (rootView = viewM.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fD = h.d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.d(arrayList.get(size - 1)) > fD) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // u5.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0436a interfaceC0436a, boolean z10, boolean z11) {
        Iterator<View> it = b().iterator();
        while (it.hasNext()) {
            interfaceC0436a.a(it.next(), this.f25904a, jSONObject, z11);
        }
    }
}
