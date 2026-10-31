package h7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static List f15708a = new b();

    public interface a {
        void a(String str);
    }

    class b extends ArrayList {
        b() {
            add(new k7.a());
        }
    }

    public static String a(String str, Bundle bundle) {
        if (str == null) {
            return null;
        }
        Iterator it = f15708a.iterator();
        while (it.hasNext()) {
            str = ((k7.b) it.next()).a(str, bundle);
        }
        return str;
    }

    public static void b(List<String> list, Bundle bundle, a aVar) {
        if (list == null || list.isEmpty() || aVar == null) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            aVar.a(a(it.next(), bundle));
        }
    }
}
