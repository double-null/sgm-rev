package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.system.OsConstants;
import com.facebook.appevents.eventdeactivation.ksG.UomBEukHFwrS;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: compiled from: SessionReportingCoordinator.java */
/* JADX INFO: loaded from: classes4.dex */
public class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f12104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.a f12105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i3.b f12106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d3.f f12107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d3.o f12108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IdManager f12109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CrashlyticsWorkers f12110g;

    b1(g0 g0Var, com.google.firebase.crashlytics.internal.persistence.a aVar, i3.b bVar, d3.f fVar, d3.o oVar, IdManager idManager, CrashlyticsWorkers crashlyticsWorkers) {
        this.f12104a = g0Var;
        this.f12105b = aVar;
        this.f12106c = bVar;
        this.f12107d = fVar;
        this.f12108e = oVar;
        this.f12109f = idManager;
        this.f12110g = crashlyticsWorkers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean A(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getReason() == 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean D(Task<h0> task) {
        if (!task.isSuccessful()) {
            z2.f.f().l("Crashlytics report could not be enqueued to DataTransport", task.getException());
            return false;
        }
        h0 result = task.getResult();
        z2.f.f().b("Crashlytics report successfully enqueued to DataTransport: " + result.d());
        File fileC = result.c();
        if (fileC.delete()) {
            z2.f.f().b("Deleted report file: " + fileC.getPath());
            return true;
        }
        z2.f.f().k("Crashlytics could not delete report file: " + fileC.getPath());
        return true;
    }

    private void E(Throwable th, Thread thread, String str, final d3.c cVar, boolean z10) {
        final boolean zEquals = str.equals(AppMeasurement.CRASH_ORIGIN);
        final e3.h0.f.d dVarJ = j(this.f12104a.d(th, thread, str, cVar.c(), 4, 8, z10), cVar.a());
        if (z10) {
            this.f12105b.E(dVarJ, cVar.b(), zEquals);
        } else {
            this.f12110g.f12213b.f(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.v0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12193a.x(dVarJ, cVar, zEquals);
                }
            });
        }
    }

    private e3.h0.f.d h(e3.h0.f.d dVar, d3.f fVar, d3.o oVar) {
        return i(dVar, fVar, oVar, Collections.emptyMap());
    }

    private e3.h0.f.d j(e3.h0.f.d dVar, Map<String, String> map) {
        return k(i(dVar, this.f12107d, this.f12108e, map), this.f12108e);
    }

    private e3.h0.f.d k(e3.h0.f.d dVar, d3.o oVar) {
        List<e3.h0.f.d.e> listH = oVar.h();
        if (listH.isEmpty()) {
            return dVar;
        }
        e3.h0.f.d.b bVarH = dVar.h();
        bVarH.e(e3.h0.f.d.AbstractC0212f.a().b(listH).a());
        return bVarH.a();
    }

    private static e3.h0.a l(ApplicationExitInfo applicationExitInfo) {
        String strM = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strM = m(traceInputStream);
            }
        } catch (IOException e10) {
            z2.f.f().k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e10);
        }
        return e3.h0.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(strM).a();
    }

    public static String m(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = bufferedInputStream.read(bArr);
                    if (i10 == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            bufferedInputStream.close();
            throw th4;
        }
    }

    public static b1 n(Context context, IdManager idManager, FileStore fileStore, AppData appData, d3.f fVar, d3.o oVar, k3.d dVar, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, CrashlyticsWorkers crashlyticsWorkers) {
        return new b1(new g0(context, idManager, appData, dVar, settingsProvider), new com.google.firebase.crashlytics.internal.persistence.a(fileStore, settingsProvider, crashlyticsAppQualitySessionsSubscriber), i3.b.b(context, settingsProvider, onDemandCounter), fVar, oVar, idManager, crashlyticsWorkers);
    }

    private h0 o(h0 h0Var) {
        if (h0Var.b().h() != null && h0Var.b().g() != null) {
            return h0Var;
        }
        n0 n0VarD = this.f12109f.d(true);
        return h0.a(h0Var.b().t(n0VarD.b()).s(n0VarD.a()), h0Var.d(), h0Var.c());
    }

    private ApplicationExitInfo r(String str, List<ApplicationExitInfo> list, Predicate<ApplicationExitInfo> predicate) {
        long jT = this.f12105b.t(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getTimestamp() >= jT && predicate.test(applicationExitInfo)) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    private static List<e3.h0.c> s(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(e3.h0.c.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.y0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b1.v((e3.h0.c) obj, (e3.h0.c) obj2);
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int v(e3.h0.c cVar, e3.h0.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean w(ApplicationExitInfo applicationExitInfo) {
        return (applicationExitInfo.getReason() == 3 && applicationExitInfo.getDescription() != null && applicationExitInfo.getDescription().contains("OOM")) || (applicationExitInfo.getReason() == 2 && applicationExitInfo.getStatus() == OsConstants.SIGKILL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(e3.h0.f.d dVar, d3.c cVar, boolean z10) {
        z2.f.f().b("disk worker: log non-fatal event to persistence");
        this.f12105b.E(dVar, cVar.b(), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Optional y(String str, List list) {
        return u(str, list) ? Optional.of(7) : Optional.empty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(String str, Integer num) {
        this.f12105b.F(e3.h0.e.a().b(e3.h0.e.b.a().b(num.intValue()).a()).a(), str);
    }

    public SortedSet<String> B() {
        return this.f12105b.s();
    }

    public void C(String str, long j10) {
        this.f12105b.G(this.f12104a.e(str, j10));
    }

    public void F(Throwable th, Thread thread, String str, long j10) {
        z2.f.f().i("Persisting fatal event for session " + str);
        E(th, thread, AppMeasurement.CRASH_ORIGIN, new d3.c(str, j10), true);
    }

    public void G(Throwable th, Thread thread, d3.c cVar) {
        z2.f.f().i("Persisting non-fatal event for session " + cVar.b());
        E(th, thread, "error", cVar, false);
    }

    public void H(final String str, List<Integer> list, final List<ApplicationExitInfo> list2) {
        t0.a(list.stream().findFirst(), new Supplier() { // from class: com.google.firebase.crashlytics.internal.common.w0
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f12198a.y(str, list2);
            }
        }).ifPresent(new Consumer() { // from class: com.google.firebase.crashlytics.internal.common.x0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f12204a.z(str, (Integer) obj);
            }
        });
    }

    public void I(String str, List<ApplicationExitInfo> list, d3.f fVar, d3.o oVar) {
        ApplicationExitInfo applicationExitInfoR = r(str, list, new Predicate() { // from class: com.google.firebase.crashlytics.internal.common.z0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b1.A((ApplicationExitInfo) obj);
            }
        });
        if (applicationExitInfoR == null) {
            z2.f.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        e3.h0.f.d dVarC = this.f12104a.c(l(applicationExitInfoR));
        z2.f.f().b("Persisting anr for session " + str);
        this.f12105b.E(k(h(dVarC, fVar, oVar), oVar), str, true);
    }

    public void J() {
        this.f12105b.l();
    }

    public Task<Void> K(Executor executor) {
        return L(executor, null);
    }

    public Task<Void> L(Executor executor, String str) {
        List<h0> listC = this.f12105b.C();
        ArrayList arrayList = new ArrayList();
        for (h0 h0Var : listC) {
            if (str == null || str.equals(h0Var.d())) {
                arrayList.add(this.f12106c.c(o(h0Var), str != null).continueWith(executor, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.u0
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return Boolean.valueOf(this.f12190a.D(task));
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }

    public void p(String str, List<q0> list, e3.h0.a aVar) {
        z2.f.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<q0> it = list.iterator();
        while (it.hasNext()) {
            e3.h0.d.b bVarK = it.next().k();
            if (bVarK != null) {
                arrayList.add(bVarK);
            }
        }
        this.f12105b.o(str, e3.h0.d.a().b(Collections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void q(long j10, String str) {
        this.f12105b.n(str, j10);
    }

    public boolean t() {
        return this.f12105b.u();
    }

    boolean u(String str, List<ApplicationExitInfo> list) {
        return r(str, list, new Predicate() { // from class: com.google.firebase.crashlytics.internal.common.a1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b1.w((ApplicationExitInfo) obj);
            }
        }) != null;
    }

    private e3.h0.f.d i(e3.h0.f.d dVar, d3.f fVar, d3.o oVar, Map<String, String> map) {
        e3.h0.f.d.b bVarH = dVar.h();
        String strC = fVar.c();
        if (strC != null) {
            bVarH.d(e3.h0.f.d.AbstractC0211d.a().b(strC).a());
        } else {
            z2.f.f().i(UomBEukHFwrS.oVnJV);
        }
        List<e3.h0.c> listS = s(oVar.f(map));
        List<e3.h0.c> listS2 = s(oVar.g());
        if (!listS.isEmpty() || !listS2.isEmpty()) {
            bVarH.b(dVar.b().i().e(listS).g(listS2).a());
        }
        return bVarH.a();
    }
}
