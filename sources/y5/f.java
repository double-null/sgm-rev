package y5;

import android.text.TextUtils;
import java.util.HashSet;
import o5.o;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class f extends a {
    public f(b.InterfaceC0485b interfaceC0485b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0485b, hashSet, jSONObject, j10);
    }

    private void e(String str) {
        s5.c cVarE = s5.c.e();
        if (cVarE != null) {
            for (o oVar : cVarE.c()) {
                if (this.f28662c.contains(oVar.k())) {
                    oVar.l().s(str, this.f28664e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y5.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            e(str);
        }
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (w5.c.w(this.f28663d, this.f28666b.a())) {
            return null;
        }
        this.f28666b.a(this.f28663d);
        return this.f28663d.toString();
    }
}
