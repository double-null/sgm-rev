package k5;

import a5.p;
import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class f extends a {
    public f(b.InterfaceC0344b interfaceC0344b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0344b, hashSet, jSONObject, j10);
    }

    private void e(String str) {
        e5.c cVarE = e5.c.e();
        if (cVarE != null) {
            for (p pVar : cVarE.c()) {
                if (this.f21223c.contains(pVar.l())) {
                    pVar.m().t(str, this.f21225e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k5.b, android.os.AsyncTask
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
        if (i5.c.w(this.f21224d, this.f21227b.a())) {
            return null;
        }
        this.f21227b.a(this.f21224d);
        return this.f21224d.toString();
    }
}
