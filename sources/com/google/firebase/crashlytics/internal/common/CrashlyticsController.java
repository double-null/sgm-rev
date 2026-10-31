package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import android.os.ProfilingTrigger;
import android.os.StatFs;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import sc.NfwM.XDucgbzInpQa;

/* JADX INFO: loaded from: classes4.dex */
class CrashlyticsController {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final FilenameFilter f12044t = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.p
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return CrashlyticsController.S(file, str);
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Charset f12045u = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataCollectionArbiter f12047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CrashlyticsFileMarker f12048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d3.o f12049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CrashlyticsWorkers f12050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IdManager f12051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final FileStore f12052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppData f12053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d3.f f12054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CrashlyticsNativeComponent f12055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AnalyticsEventLogger f12056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final CrashlyticsAppQualitySessionsSubscriber f12057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b1 f12058m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private i0 f12059n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SettingsProvider f12060o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final TaskCompletionSource<Boolean> f12061p = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final TaskCompletionSource<Boolean> f12062q = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final TaskCompletionSource<Void> f12063r = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final AtomicBoolean f12064s = new AtomicBoolean(false);

    class a implements i0.a {
        a() {
        }

        @Override // com.google.firebase.crashlytics.internal.common.i0.a
        public void a(SettingsProvider settingsProvider, Thread thread, Throwable th) {
            CrashlyticsController.this.N(settingsProvider, thread, th);
        }
    }

    class b implements Callable<Task<Void>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f12066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f12067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Thread f12068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SettingsProvider f12069d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f12070e;

        class a implements SuccessContinuation<j3.d, Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f12072a;

            a(String str) {
                this.f12072a = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task<Void> then(j3.d dVar) throws Exception {
                if (dVar == null) {
                    z2.f.f().k("Received null app settings, cannot send reports at crash time.");
                    return Tasks.forResult(null);
                }
                Task[] taskArr = new Task[2];
                taskArr[0] = CrashlyticsController.this.Y();
                taskArr[1] = CrashlyticsController.this.f12058m.L(CrashlyticsController.this.f12050e.f12212a, b.this.f12070e ? this.f12072a : null);
                return Tasks.whenAll((Task<?>[]) taskArr);
            }
        }

        b(long j10, Throwable th, Thread thread, SettingsProvider settingsProvider, boolean z10) {
            this.f12066a = j10;
            this.f12067b = th;
            this.f12068c = thread;
            this.f12069d = settingsProvider;
            this.f12070e = z10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() throws Exception {
            long jL = CrashlyticsController.L(this.f12066a);
            String strH = CrashlyticsController.this.H();
            if (strH == null) {
                z2.f.f().d("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            CrashlyticsController.this.f12048c.a();
            CrashlyticsController.this.f12058m.F(this.f12067b, this.f12068c, strH, jL);
            CrashlyticsController.this.B(this.f12066a);
            CrashlyticsController.this.y(this.f12069d);
            CrashlyticsController.this.A(new g().c(), Boolean.valueOf(this.f12070e));
            return !CrashlyticsController.this.f12047b.isAutomaticDataCollectionEnabled() ? Tasks.forResult(null) : this.f12069d.a().onSuccessTask(CrashlyticsController.this.f12050e.f12212a, new a(strH));
        }
    }

    class c implements SuccessContinuation<Void, Boolean> {
        c() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Boolean> then(Void r10) throws Exception {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    class d implements SuccessContinuation<Boolean, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Task f12075a;

        class a implements SuccessContinuation<j3.d, Void> {
            a() {
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task<Void> then(j3.d dVar) throws Exception {
                if (dVar == null) {
                    z2.f.f().k("Received null app settings at app startup. Cannot send cached reports");
                    return Tasks.forResult(null);
                }
                CrashlyticsController.this.Y();
                CrashlyticsController.this.f12058m.K(CrashlyticsController.this.f12050e.f12212a);
                CrashlyticsController.this.f12063r.trySetResult(null);
                return Tasks.forResult(null);
            }
        }

        d(Task task) {
            this.f12075a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> then(Boolean bool) throws Exception {
            if (bool.booleanValue()) {
                z2.f.f().b("Sending cached crash reports...");
                CrashlyticsController.this.f12047b.grantDataCollectionPermission(bool.booleanValue());
                return this.f12075a.onSuccessTask(CrashlyticsController.this.f12050e.f12212a, new a());
            }
            z2.f.f().i("Deleting cached crash reports...");
            CrashlyticsController.v(CrashlyticsController.this.W());
            CrashlyticsController.this.f12058m.J();
            CrashlyticsController.this.f12063r.trySetResult(null);
            return Tasks.forResult(null);
        }
    }

    class e implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f12078a;

        e(long j10) {
            this.f12078a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, this.f12078a);
            CrashlyticsController.this.f12056k.a("_ae", bundle);
            return null;
        }
    }

    CrashlyticsController(Context context, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, CrashlyticsFileMarker crashlyticsFileMarker, AppData appData, d3.o oVar, d3.f fVar, b1 b1Var, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, CrashlyticsWorkers crashlyticsWorkers) {
        this.f12046a = context;
        this.f12051f = idManager;
        this.f12047b = dataCollectionArbiter;
        this.f12052g = fileStore;
        this.f12048c = crashlyticsFileMarker;
        this.f12053h = appData;
        this.f12049d = oVar;
        this.f12054i = fVar;
        this.f12055j = crashlyticsNativeComponent;
        this.f12056k = analyticsEventLogger;
        this.f12057l = crashlyticsAppQualitySessionsSubscriber;
        this.f12058m = b1Var;
        this.f12050e = crashlyticsWorkers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(String str, Boolean bool) {
        long jI = I();
        z2.f.f().b("Opening a new session with ID " + str);
        this.f12055j.prepareNativeSession(str, String.format(Locale.US, "Crashlytics Android SDK/%s", CrashlyticsCore.getVersion()), jI, e3.i0.b(s(this.f12051f, this.f12053h), u(), t(this.f12046a)));
        if (bool.booleanValue() && str != null) {
            this.f12049d.q(str);
        }
        this.f12054i.e(str);
        this.f12057l.e(str);
        this.f12058m.C(str, jI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(long j10) {
        try {
            if (this.f12052g.g(".ae" + j10).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            z2.f.f().l("Could not create app exception marker file.", e10);
        }
    }

    private void E(String str) {
        z2.f.f().i("Finalizing native report for session " + str);
        z2.g sessionFileProvider = this.f12055j.getSessionFileProvider(str);
        File minidumpFile = sessionFileProvider.getMinidumpFile();
        e3.h0.a applicationExitInto = sessionFileProvider.getApplicationExitInto();
        if (a0(str, minidumpFile, applicationExitInto)) {
            z2.f.f().k("No native core present");
            return;
        }
        long jLastModified = minidumpFile.lastModified();
        d3.f fVar = new d3.f(this.f12052g, str);
        File fileK = this.f12052g.k(str);
        if (!fileK.isDirectory()) {
            z2.f.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        B(jLastModified);
        List<q0> listJ = J(sessionFileProvider, str, this.f12052g, fVar.b());
        r0.b(fileK, listJ);
        z2.f.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f12058m.p(str, listJ, applicationExitInto);
        fVar.a();
    }

    private static boolean G() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String H() {
        SortedSet<String> sortedSetB = this.f12058m.B();
        if (sortedSetB.isEmpty()) {
            return null;
        }
        return sortedSetB.first();
    }

    private static long I() {
        return L(System.currentTimeMillis());
    }

    private InputStream K(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader != null) {
            return classLoader.getResourceAsStream(str);
        }
        z2.f.f().k("Couldn't get Class Loader");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long L(long j10) {
        return j10 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(String str) {
        A(str, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(String str, ProfilingResult profilingResult) {
        r0(str, profilingResult.getTriggerType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean S(File file, String str) {
        return str.startsWith(".ae");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean T(File file, String str) {
        return m.a(new Object[]{"trigger-type-anomaly", "trigger-type-oom"}).contains(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer U(File file) {
        String name = file.getName();
        name.hashCode();
        if (name.equals("trigger-type-anomaly")) {
            return 8;
        }
        return !name.equals("trigger-type-oom") ? 0 : 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean V(Integer num) {
        return num.intValue() != 0;
    }

    private Task<Void> X(long j10) {
        if (G()) {
            z2.f.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        z2.f.f().b("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new e(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> Y() {
        ArrayList arrayList = new ArrayList();
        for (File file : W()) {
            try {
                arrayList.add(X(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                z2.f.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private static boolean a0(String str, File file, e3.h0.a aVar) {
        if (file == null || !file.exists()) {
            z2.f.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            z2.f.f().g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    private static q0 b0(z2.g gVar) {
        File minidumpFile = gVar.getMinidumpFile();
        return (minidumpFile == null || !minidumpFile.exists()) ? new f("minidump_file", "minidump", new byte[]{0}) : new m0("minidump_file", "minidump", minidumpFile);
    }

    private static byte[] d0(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void e0(final String str, Executor executor) {
        ProfilingManager profilingManager = (ProfilingManager) this.f12046a.getSystemService(ProfilingManager.class);
        profilingManager.addProfilingTriggers(m.a(new Object[]{new ProfilingTrigger.Builder(7).build(), new ProfilingTrigger.Builder(8).build()}));
        profilingManager.registerForAllProfilingResults(executor, new Consumer() { // from class: com.google.firebase.crashlytics.internal.common.o
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f12182a.R(str, (ProfilingResult) obj);
            }
        });
    }

    private Task<Boolean> m0() {
        if (this.f12047b.isAutomaticDataCollectionEnabled()) {
            z2.f.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f12061p.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        z2.f.f().b("Automatic data collection is disabled.");
        z2.f.f().i("Notifying that unsent reports are available.");
        this.f12061p.trySetResult(Boolean.TRUE);
        Task<TContinuationResult> taskOnSuccessTask = this.f12047b.waitForAutomaticDataCollectionEnabled().onSuccessTask(new c());
        z2.f.f().b("Waiting for send/deleteUnsentReports to be called.");
        return c3.b.c(taskOnSuccessTask, this.f12062q.getTask());
    }

    private void n0(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            z2.f.f().i("ANR feature enabled, but device is API " + i10);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f12046a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f12058m.I(str, historicalProcessExitReasons, new d3.f(this.f12052g, str), d3.o.k(str, this.f12052g, this.f12050e));
        } else {
            z2.f.f().i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    private void p0(String str) {
        ActivityManager activityManager = (ActivityManager) this.f12046a.getSystemService("activity");
        this.f12058m.H(str, (List) this.f12052g.r(str, new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.r
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return CrashlyticsController.T(file, str2);
            }
        }).stream().map(new Function() { // from class: com.google.firebase.crashlytics.internal.common.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CrashlyticsController.U((File) obj);
            }
        }).filter(new Predicate() { // from class: com.google.firebase.crashlytics.internal.common.t
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return CrashlyticsController.V((Integer) obj);
            }
        }).collect(Collectors.toList()), activityManager.getHistoricalProcessExitReasons(null, 0, 0));
    }

    private static e3.i0.a s(IdManager idManager, AppData appData) {
        return e3.i0.a.b(idManager.f(), appData.f12039f, appData.f12040g, idManager.a().c(), k0.c(appData.f12037d).e(), appData.f12041h);
    }

    private static e3.i0.b t(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return e3.i0.b.c(h.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), h.b(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), h.x(), h.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static e3.i0.c u() {
        return e3.i0.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, h.y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void z(boolean z10, SettingsProvider settingsProvider, boolean z11) {
        String str;
        CrashlyticsWorkers.c();
        ArrayList arrayList = new ArrayList(this.f12058m.B());
        if (arrayList.size() <= z10) {
            z2.f.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z10 ? 1 : 0);
        if (z11 && settingsProvider.b().f20573b.f20581b) {
            n0(str2);
        } else {
            z2.f.f().i("ANR feature disabled.");
        }
        if (z11 && this.f12055j.hasCrashDataForSession(str2)) {
            E(str2);
        }
        if (Build.VERSION.SDK_INT >= 37) {
            p0(str2);
        }
        if (z10 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f12057l.e(null);
            str = null;
        }
        this.f12058m.q(I(), str);
    }

    void C(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, SettingsProvider settingsProvider) {
        this.f12060o = settingsProvider;
        c0(str);
        i0 i0Var = new i0(new a(), settingsProvider, uncaughtExceptionHandler, this.f12055j);
        this.f12059n = i0Var;
        Thread.setDefaultUncaughtExceptionHandler(i0Var);
    }

    void D(String str) {
        e0(str, this.f12050e.f12213b.c());
    }

    boolean F(SettingsProvider settingsProvider) {
        CrashlyticsWorkers.c();
        if (P()) {
            z2.f.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        z2.f.f().i("Finalizing previously open sessions.");
        try {
            z(true, settingsProvider, true);
            z2.f.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            z2.f.f().e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    String M() throws IOException {
        String strR = h.r(this.f12046a);
        if (strR != null) {
            z2.f.f().b("Read version control info from string resource");
            return Base64.encodeToString(strR.getBytes(f12045u), 0);
        }
        InputStream inputStreamK = K("META-INF/version-control-info.textproto");
        if (inputStreamK == null) {
            if (inputStreamK != null) {
                inputStreamK.close();
            }
            z2.f.f().g("No version control information found");
            return null;
        }
        try {
            z2.f.f().b("Read version control info from file");
            String strEncodeToString = Base64.encodeToString(d0(inputStreamK), 0);
            inputStreamK.close();
            return strEncodeToString;
        } catch (Throwable th) {
            try {
                inputStreamK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    void N(SettingsProvider settingsProvider, Thread thread, Throwable th) {
        O(settingsProvider, thread, th, false);
    }

    synchronized void O(SettingsProvider settingsProvider, Thread thread, Throwable th, boolean z10) {
        z2.f.f().b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        if (!z10) {
            c4.a.b();
        }
        Task taskG = this.f12050e.f12212a.g(new b(System.currentTimeMillis(), th, thread, settingsProvider, z10));
        if (!z10) {
            try {
                e1.b(taskG);
            } catch (TimeoutException unused) {
                z2.f.f().d("Cannot send reports. Timed out while fetching settings.");
            } catch (Exception e10) {
                z2.f.f().e("Error handling uncaught exception", e10);
            }
        }
    }

    boolean P() {
        i0 i0Var = this.f12059n;
        return i0Var != null && i0Var.a();
    }

    List<File> W() {
        return this.f12052g.h(f12044t);
    }

    void Z(Thread thread, Throwable th) {
        SettingsProvider settingsProvider = this.f12060o;
        if (settingsProvider == null) {
            z2.f.f().k("settingsProvider not set");
        } else {
            O(settingsProvider, thread, th, true);
        }
    }

    void c0(final String str) {
        this.f12050e.f12212a.f(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f12185a.Q(str);
            }
        });
    }

    void f0() {
        try {
            String strM = M();
            if (strM != null) {
                j0("com.crashlytics.version-control-info", strM);
                z2.f.f().g("Saved version control info");
            }
        } catch (IOException e10) {
            z2.f.f().l("Unable to save version control info", e10);
        }
    }

    Task<Void> g0() {
        this.f12062q.trySetResult(Boolean.TRUE);
        return this.f12063r.getTask();
    }

    void h0(String str, String str2) {
        try {
            this.f12049d.n(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f12046a;
            if (context != null && h.v(context)) {
                throw e10;
            }
            z2.f.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void i0(Map<String, String> map) {
        this.f12049d.o(map);
    }

    void j0(String str, String str2) {
        try {
            this.f12049d.p(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f12046a;
            if (context != null && h.v(context)) {
                throw e10;
            }
            z2.f.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void k0(String str) {
        this.f12049d.r(str);
    }

    void l0(Task<j3.d> task) {
        if (this.f12058m.t()) {
            z2.f.f().i("Crash reports are available to be sent.");
            m0().onSuccessTask(this.f12050e.f12212a, new d(task));
        } else {
            z2.f.f().i("No crash reports are available to be sent.");
            this.f12061p.trySetResult(Boolean.FALSE);
        }
    }

    void o0(Thread thread, Throwable th, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (P()) {
            return;
        }
        long jL = L(jCurrentTimeMillis);
        String strH = H();
        if (strH == null) {
            z2.f.f().k("Tried to write a non-fatal exception while no session was open.");
        } else {
            this.f12058m.G(th, thread, new d3.c(strH, jL, map));
        }
    }

    void q0(long j10, String str) {
        if (P()) {
            return;
        }
        this.f12054i.g(j10, str);
    }

    Task<Boolean> r() {
        if (this.f12064s.compareAndSet(false, true)) {
            return this.f12061p.getTask();
        }
        z2.f.f().k("checkForUnsentReports should only be called once per execution.");
        return Tasks.forResult(Boolean.FALSE);
    }

    Task<Void> w() {
        this.f12062q.trySetResult(Boolean.FALSE);
        return this.f12063r.getTask();
    }

    boolean x() {
        CrashlyticsWorkers.c();
        if (!this.f12048c.c()) {
            String strH = H();
            return strH != null && this.f12055j.hasCrashDataForSession(strH);
        }
        z2.f.f().i("Found previous crash marker.");
        this.f12048c.d();
        return true;
    }

    void y(SettingsProvider settingsProvider) {
        z(false, settingsProvider, false);
    }

    static List<q0> J(z2.g gVar, String str, FileStore fileStore, byte[] bArr) {
        File fileQ = fileStore.q(str, WKirgUEJJ.UTAO);
        File fileQ2 = fileStore.q(str, "keys");
        File fileQ3 = fileStore.q(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f("logs_file", "logs", bArr));
        arrayList.add(new m0("crash_meta_file", "metadata", gVar.getMetadataFile()));
        arrayList.add(new m0("session_meta_file", "session", gVar.getSessionFile()));
        arrayList.add(new m0("app_meta_file", "app", gVar.getAppFile()));
        arrayList.add(new m0("device_meta_file", DeviceRequestsHelper.DEVICE_INFO_DEVICE, gVar.getDeviceFile()));
        arrayList.add(new m0("os_meta_file", "os", gVar.getOsFile()));
        arrayList.add(b0(gVar));
        arrayList.add(new m0("user_meta_file", "user", fileQ));
        arrayList.add(new m0("keys_file", "keys", fileQ2));
        arrayList.add(new m0("rollouts_file", "rollouts", fileQ3));
        return arrayList;
    }

    void r0(String str, int i10) {
        String str2;
        if (i10 == 8) {
            str2 = "trigger-type-anomaly";
        } else {
            str2 = i10 == 7 ? "trigger-type-oom" : XDucgbzInpQa.jaQqDKANv;
        }
        try {
            if (this.f12052g.q(str, str2).createNewFile()) {
                return;
            }
            z2.f.f().b("Trigger file " + str2 + " exists for session: " + str);
        } catch (IOException unused) {
            z2.f.f().d("Unable to touch trigger file " + str2);
        }
    }
}
