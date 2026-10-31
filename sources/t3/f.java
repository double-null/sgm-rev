package t3;

import android.content.Context;
import android.util.Base64OutputStream;
import com.adjust.sdk.Constants;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: DefaultHeartBeatController.java */
/* JADX INFO: loaded from: classes4.dex */
public class f implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<u> f25479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f25480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<com.google.firebase.platforminfo.h> f25481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<g> f25482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f25483e;

    private f(final Context context, final String str, Set<g> set, Provider<com.google.firebase.platforminfo.h> provider, Executor executor) {
        this(new Lazy(new Provider() { // from class: t3.e
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return f.i(context, str);
            }
        }), set, executor, provider, context);
    }

    public static x2.c<f> f() {
        final x2.o oVarA = x2.o.a(w2.a.class, Executor.class);
        return x2.c.d(f.class, i.class, j.class).b(x2.m.i(Context.class)).b(x2.m.i(FirebaseApp.class)).b(x2.m.m(g.class)).b(x2.m.k(com.google.firebase.platforminfo.h.class)).b(x2.m.j(oVarA)).e(new x2.g() { // from class: t3.c
            @Override // x2.g
            public final Object create(x2.d dVar) {
                return f.g(oVarA, dVar);
            }
        }).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f g(x2.o oVar, x2.d dVar) {
        return new f((Context) dVar.a(Context.class), ((FirebaseApp) dVar.a(FirebaseApp.class)).getPersistenceKey(), (Set<g>) dVar.b(g.class), (Provider<com.google.firebase.platforminfo.h>) dVar.d(com.google.firebase.platforminfo.h.class), (Executor) dVar.f(oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String h() throws Exception {
        String string;
        synchronized (this) {
            u uVar = this.f25479a.get();
            List<v> listF = uVar.f();
            uVar.e();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < listF.size(); i10++) {
                v vVar = listF.get(i10);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", vVar.c());
                jSONObject.put("dates", new JSONArray((Collection) vVar.b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "2");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                try {
                    gZIPOutputStream.write(jSONObject2.toString().getBytes(Constants.ENCODING));
                    gZIPOutputStream.close();
                    base64OutputStream.close();
                    string = byteArrayOutputStream.toString(Constants.ENCODING);
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    base64OutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ u i(Context context, String str) {
        return new u(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void j() throws Exception {
        synchronized (this) {
            this.f25479a.get().m(System.currentTimeMillis(), this.f25481c.get().getUserAgent());
        }
        return null;
    }

    @Override // t3.i
    public Task<String> a() {
        return androidx.core.os.m.a(this.f25480b) ^ true ? Tasks.forResult("") : Tasks.call(this.f25483e, new Callable() { // from class: t3.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f25476a.h();
            }
        });
    }

    public Task<Void> k() {
        if (this.f25482d.size() <= 0) {
            return Tasks.forResult(null);
        }
        return androidx.core.os.m.a(this.f25480b) ^ true ? Tasks.forResult(null) : Tasks.call(this.f25483e, new Callable() { // from class: t3.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f25474a.j();
            }
        });
    }

    f(Provider<u> provider, Set<g> set, Executor executor, Provider<com.google.firebase.platforminfo.h> provider2, Context context) {
        this.f25479a = provider;
        this.f25482d = set;
        this.f25483e = executor;
        this.f25481c = provider2;
        this.f25480b = context;
    }
}
