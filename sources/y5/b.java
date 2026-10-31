package y5;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f28665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final InterfaceC0485b f28666b;

    public interface a {
        void a(b bVar);
    }

    /* JADX INFO: renamed from: y5.b$b, reason: collision with other inner class name */
    public interface InterfaceC0485b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0485b interfaceC0485b) {
        this.f28666b = interfaceC0485b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f28665a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void b(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }

    public void c(a aVar) {
        this.f28665a = aVar;
    }
}
