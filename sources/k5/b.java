package k5;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f21226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final InterfaceC0344b f21227b;

    public interface a {
        void a(b bVar);
    }

    /* JADX INFO: renamed from: k5.b$b, reason: collision with other inner class name */
    public interface InterfaceC0344b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0344b interfaceC0344b) {
        this.f21227b = interfaceC0344b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f21226a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void b(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }

    public void c(a aVar) {
        this.f21226a = aVar;
    }
}
