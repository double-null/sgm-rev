package h7;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f15693a = new WeakHashMap();

    public static synchronized g a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = f15693a.entrySet().iterator();
        while (it.hasNext()) {
            g gVar = (g) ((Map.Entry) it.next()).getKey();
            if (gVar.H().equals(str)) {
                return gVar;
            }
        }
        return null;
    }

    public static synchronized void b(g gVar) {
        if (gVar == null) {
            return;
        }
        f15693a.put(gVar, Boolean.TRUE);
    }
}
