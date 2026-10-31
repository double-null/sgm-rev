package j3;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.c1;
import com.google.firebase.crashlytics.internal.common.j0;
import com.google.firebase.crashlytics.internal.common.k0;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: SettingsController.java */
/* JADX INFO: loaded from: classes4.dex */
public class g implements SettingsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f20591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f20592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j0 f20593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j3.a f20594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f20595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DataCollectionArbiter f20596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicReference<d> f20597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicReference<TaskCompletionSource<d>> f20598i;

    /* JADX INFO: compiled from: SettingsController.java */
    class a implements SuccessContinuation<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CrashlyticsWorkers f20599a;

        a(CrashlyticsWorkers crashlyticsWorkers) {
            this.f20599a = crashlyticsWorkers;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ JSONObject b() throws Exception {
            return g.this.f20595f.a(g.this.f20591b, true);
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Task<Void> then(Void r10) throws Exception {
            JSONObject jSONObject = (JSONObject) this.f20599a.f12215d.c().submit(new Callable() { // from class: j3.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f20589a.b();
                }
            }).get();
            if (jSONObject != null) {
                d dVarB = g.this.f20592c.b(jSONObject);
                g.this.f20594e.c(dVarB.f20574c, jSONObject);
                g.this.q(jSONObject, "Loaded settings: ");
                g gVar = g.this;
                gVar.r(gVar.f20591b.f20607f);
                g.this.f20597h.set(dVarB);
                ((TaskCompletionSource) g.this.f20598i.get()).trySetResult(dVarB);
            }
            return Tasks.forResult(null);
        }
    }

    g(Context context, j jVar, j0 j0Var, h hVar, j3.a aVar, k kVar, DataCollectionArbiter dataCollectionArbiter) {
        AtomicReference<d> atomicReference = new AtomicReference<>();
        this.f20597h = atomicReference;
        this.f20598i = new AtomicReference<>(new TaskCompletionSource());
        this.f20590a = context;
        this.f20591b = jVar;
        this.f20593d = j0Var;
        this.f20592c = hVar;
        this.f20594e = aVar;
        this.f20595f = kVar;
        this.f20596g = dataCollectionArbiter;
        atomicReference.set(b.b(j0Var));
    }

    public static g l(Context context, String str, IdManager idManager, g3.b bVar, String str2, String str3, FileStore fileStore, DataCollectionArbiter dataCollectionArbiter) {
        String strG = idManager.g();
        c1 c1Var = new c1();
        return new g(context, new j(str, idManager.h(), idManager.i(), idManager.j(), idManager, com.google.firebase.crashlytics.internal.common.h.h(com.google.firebase.crashlytics.internal.common.h.m(context), str, str3, str2), str3, str2, k0.c(strG).e()), c1Var, new h(c1Var), new j3.a(fileStore), new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), dataCollectionArbiter);
    }

    private d m(e eVar) throws Throwable {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject jSONObjectB = this.f20594e.b();
                if (jSONObjectB != null) {
                    d dVarB = this.f20592c.b(jSONObjectB);
                    if (dVarB != null) {
                        q(jSONObjectB, "Loaded cached settings: ");
                        long jA = this.f20593d.a();
                        if (e.IGNORE_CACHE_EXPIRATION.equals(eVar) || !dVarB.a(jA)) {
                            try {
                                z2.f.f().i("Returning cached settings.");
                                dVar = dVarB;
                            } catch (Exception e10) {
                                e = e10;
                                dVar = dVarB;
                                z2.f.f().e("Failed to get cached settings", e);
                            }
                        } else {
                            z2.f.f().i("Cached settings have expired.");
                        }
                    } else {
                        z2.f.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    z2.f.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return dVar;
    }

    private String n() {
        return com.google.firebase.crashlytics.internal.common.h.q(this.f20590a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        z2.f.f().b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        SharedPreferences.Editor editorEdit = com.google.firebase.crashlytics.internal.common.h.q(this.f20590a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public Task<d> a() {
        return this.f20598i.get().getTask();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public d b() {
        return this.f20597h.get();
    }

    boolean k() {
        return !n().equals(this.f20591b.f20607f);
    }

    public Task<Void> o(CrashlyticsWorkers crashlyticsWorkers) {
        return p(e.USE_CACHE, crashlyticsWorkers);
    }

    public Task<Void> p(e eVar, CrashlyticsWorkers crashlyticsWorkers) throws Throwable {
        d dVarM;
        if (!k() && (dVarM = m(eVar)) != null) {
            this.f20597h.set(dVarM);
            this.f20598i.get().trySetResult(dVarM);
            return Tasks.forResult(null);
        }
        d dVarM2 = m(e.IGNORE_CACHE_EXPIRATION);
        if (dVarM2 != null) {
            this.f20597h.set(dVarM2);
            this.f20598i.get().trySetResult(dVarM2);
        }
        return this.f20596g.waitForDataCollectionPermission().onSuccessTask(crashlyticsWorkers.f12212a, new a(crashlyticsWorkers));
    }
}
