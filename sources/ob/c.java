package ob;

import android.webkit.WebView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class c extends b<e, WebView> implements e {
    public c(List<e> list) {
        super(list);
    }

    @Override // ob.e
    public String d(String str) {
        Iterator it = this.f23332a.iterator();
        while (it.hasNext()) {
            str = ((e) it.next()).d(str);
        }
        return str;
    }
}
