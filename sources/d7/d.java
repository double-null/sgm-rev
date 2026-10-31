package d7;

import android.text.TextUtils;
import io.bidmachine.iab.mraid.b0;
import io.bidmachine.iab.mraid.l0;
import io.bidmachine.iab.mraid.s0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f13353a = new CopyOnWriteArrayList();

    private static a c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (a aVar : f13353a) {
            if (aVar.a(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d() {
        return "handleJsCommand not found";
    }

    public static boolean e(a aVar) {
        List list = f13353a;
        return !list.contains(aVar) && list.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(String str) {
        return "handleJsCommand - " + str;
    }

    public static void g(s0 s0Var, final String str) {
        Map<String, String> mapS;
        b0.c("JsBridgeHandler", new id.a() { // from class: d7.b
            @Override // id.a
            public final Object invoke() {
                return d.f(str);
            }
        });
        try {
            a aVarC = c(str);
            if (aVarC == null || (mapS = l0.s(str, aVarC.d())) == null) {
                return;
            }
            String str2 = mapS.get("command");
            if (str2 == null) {
                b0.i("JsBridgeHandler", new id.a() { // from class: d7.c
                    @Override // id.a
                    public final Object invoke() {
                        return d.d();
                    }
                });
            } else {
                aVarC.b(s0Var, str2, mapS);
            }
        } catch (Throwable th) {
            b0.f("JsBridgeHandler", th);
        }
    }

    public static boolean h(String str) {
        return c(str) != null;
    }

    public static String i() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = f13353a.iterator();
        while (it.hasNext()) {
            sb2.append(f7.e.a(((a) it.next()).c(new Object[0])));
        }
        return sb2.toString();
    }
}
