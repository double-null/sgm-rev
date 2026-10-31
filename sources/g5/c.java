package g5;

import a5.p;
import android.view.View;
import i5.e;
import i5.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f15382a;

    public c(a aVar) {
        this.f15382a = aVar;
    }

    @Override // g5.a
    public JSONObject a(View view) {
        JSONObject jSONObjectC = i5.c.c(0, 0, 0, 0);
        i5.c.e(jSONObjectC, e.a());
        return jSONObjectC;
    }

    ArrayList<View> b() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        e5.c cVarE = e5.c.e();
        if (cVarE != null) {
            Collection<p> collectionA = cVarE.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionA.size() * 2) + 3);
            Iterator<p> it = collectionA.iterator();
            while (it.hasNext()) {
                View viewN = it.next().n();
                if (viewN != null && h.g(viewN) && (rootView = viewN.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
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

    @Override // g5.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0231a interfaceC0231a, boolean z10, boolean z11) {
        Iterator<View> it = b().iterator();
        while (it.hasNext()) {
            interfaceC0231a.a(it.next(), this.f15382a, jSONObject, z11);
        }
    }
}
