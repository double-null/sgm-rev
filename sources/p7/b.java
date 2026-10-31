package p7;

import android.content.Context;
import fd.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;
import rd.b0;
import rd.f0;
import rd.h0;
import wc.g0;
import wc.r;
import wc.s;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: compiled from: StartupMetricsStorage.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f23493b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23494a;

    /* JADX INFO: compiled from: StartupMetricsStorage.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    public b(Context context) {
        t.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        t.e(applicationContext, "context.applicationContext");
        this.f23494a = applicationContext;
    }

    private final File d() {
        File file = new File(this.f23494a.getFilesDir(), "bm/quality/startup");
        file.mkdirs();
        return file;
    }

    private final p7.a f(JSONObject jSONObject) {
        try {
            return new p7.a(jSONObject.getLong("startInitTime"), jSONObject.getLong("initDuration"), jSONObject.getBoolean("finished"));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void a() {
        try {
            r.a aVar = r.f27774b;
            r.c(Boolean.valueOf(ac.b.f(d())));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            r.c(s.a(th));
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    public final List<p7.a> b(long j10) {
        p7.a aVarF;
        boolean z10;
        List<p7.a> listK = null;
        try {
            File fileD = d();
            if (fileD.exists()) {
                File[] fileArrListFiles = fileD.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                ArrayList<File> arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    t.e(name, "it.name");
                    int iI0 = f0.i0(name, ".", 0, false, 6, null);
                    if (iI0 >= 1) {
                        String name2 = file.getName();
                        t.e(name2, "it.name");
                        Long lR = b0.r(h0.j1(name2, iI0));
                        z10 = lR != null && lR.longValue() > j10;
                    }
                    if (z10) {
                        arrayList.add(file);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (File it : arrayList) {
                    t.e(it, "it");
                    String strJ = ac.b.j(it);
                    if (strJ != null) {
                        arrayList2.add(strJ);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    try {
                        try {
                            aVarF = f(new JSONObject((String) it2.next()));
                        } catch (Throwable unused) {
                            aVarF = null;
                        }
                    } catch (Throwable unused2) {
                    }
                    if (aVarF != null) {
                        try {
                            arrayList3.add(aVarF);
                        } catch (Throwable unused3) {
                        }
                    }
                }
                listK = arrayList3;
            } else {
                listK = kotlin.collections.t.k();
            }
        } catch (Throwable unused4) {
        }
        return listK == null ? kotlin.collections.t.k() : listK;
    }

    public final Object c(p7.a startupMetrics) {
        t.f(startupMetrics, "startupMetrics");
        try {
            r.a aVar = r.f27774b;
            File fileD = d();
            if (fileD.exists()) {
                File file = new File(fileD, startupMetrics.b() + ".trace.json");
                String string = e(startupMetrics).toString();
                t.e(string, "startupMetrics.toJSONObject().toString()");
                h.h(file, string, null, 2, null);
            }
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    private final JSONObject e(p7.a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("startInitTime", aVar.b());
        jSONObject.put(GEmOVMyH.JnTW, aVar.a());
        jSONObject.put("finished", aVar.c());
        return jSONObject;
    }
}
