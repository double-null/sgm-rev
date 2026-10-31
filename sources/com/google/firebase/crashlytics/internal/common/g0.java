package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.ndk.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: CrashlyticsReportDataCapture.java */
/* JADX INFO: loaded from: classes4.dex */
public class g0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map<String, Integer> f12132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f12133h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IdManager f12135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AppData f12136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k3.d f12137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SettingsProvider f12138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z2.h f12139f = z2.h.f28939a;

    static {
        HashMap map = new HashMap();
        f12132g = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f12133h = String.format(Locale.US, "Crashlytics Android SDK/%s", BuildConfig.VERSION_NAME);
    }

    public g0(Context context, IdManager idManager, AppData appData, k3.d dVar, SettingsProvider settingsProvider) {
        this.f12134a = context;
        this.f12135b = idManager;
        this.f12136c = appData;
        this.f12137d = dVar;
        this.f12138e = settingsProvider;
    }

    private e3.h0.f.d.a.c A(e3.h0.a aVar) {
        return this.f12139f.a(aVar.e(), aVar.d(), aVar.c());
    }

    private e3.h0.a a(e3.h0.a aVar) {
        List<e3.h0.a.AbstractC0197a> listUnmodifiableList;
        if (!this.f12138e.b().f20573b.f20582c || this.f12136c.f12036c.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (e eVar : this.f12136c.f12036c) {
                arrayList.add(e3.h0.a.AbstractC0197a.a().d(eVar.c()).b(eVar.a()).c(eVar.b()).a());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return e3.h0.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(listUnmodifiableList).a();
    }

    private e3.h0.b b() {
        return e3.h0.b().l(BuildConfig.VERSION_NAME).h(this.f12136c.f12034a).i(this.f12135b.a().c()).g(this.f12135b.a().e()).f(this.f12135b.a().d()).d(this.f12136c.f12039f).e(this.f12136c.f12040g).k(4);
    }

    private static long f(long j10) {
        if (j10 > 0) {
            return j10;
        }
        return 0L;
    }

    private static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f12132g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private e3.h0.f.d.a.b.AbstractC0201a h() {
        return e3.h0.f.d.a.b.AbstractC0201a.a().b(0L).d(0L).c(this.f12136c.f12038e).e(this.f12136c.f12035b).a();
    }

    private List<e3.h0.f.d.a.b.AbstractC0201a> i() {
        return Collections.singletonList(h());
    }

    private e3.h0.f.d.a j(int i10, e3.h0.a aVar) {
        return e3.h0.f.d.a.a().c(Boolean.valueOf(aVar.c() != 100)).d(A(aVar)).h(i10).f(o(aVar)).a();
    }

    private e3.h0.f.d.a k(int i10, k3.e eVar, Thread thread, int i11, int i12, boolean z10) {
        Boolean boolValueOf;
        e3.h0.f.d.a.c cVarE = this.f12139f.e(this.f12134a);
        if (cVarE.b() > 0) {
            boolValueOf = Boolean.valueOf(cVarE.b() != 100);
        } else {
            boolValueOf = null;
        }
        return e3.h0.f.d.a.a().c(boolValueOf).d(cVarE).b(this.f12139f.d(this.f12134a)).h(i10).f(p(eVar, thread, i11, i12, z10)).a();
    }

    private e3.h0.f.d.c l(int i10) {
        d dVarA = d.a(this.f12134a);
        Float fB = dVarA.b();
        Double dValueOf = fB != null ? Double.valueOf(fB.doubleValue()) : null;
        int iC = dVarA.c();
        boolean zN = h.n(this.f12134a);
        return e3.h0.f.d.c.a().b(dValueOf).c(iC).f(zN).e(i10).g(f(h.b(this.f12134a) - h.a(this.f12134a))).d(h.c(Environment.getDataDirectory().getPath())).a();
    }

    private e3.h0.f.d.a.b.c m(k3.e eVar, int i10, int i11) {
        return n(eVar, i10, i11, 0);
    }

    private e3.h0.f.d.a.b.c n(k3.e eVar, int i10, int i11, int i12) {
        String str = eVar.f21216b;
        String str2 = eVar.f21215a;
        StackTraceElement[] stackTraceElementArr = eVar.f21217c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        k3.e eVar2 = eVar.f21218d;
        if (i12 >= i11) {
            k3.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f21218d;
                i13++;
            }
        }
        e3.h0.f.d.a.b.c.AbstractC0204a abstractC0204aD = e3.h0.f.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i10)).d(i13);
        if (eVar2 != null && i13 == 0) {
            abstractC0204aD.b(n(eVar2, i10, i11, i12 + 1));
        }
        return abstractC0204aD.a();
    }

    private e3.h0.f.d.a.b o(e3.h0.a aVar) {
        return e3.h0.f.d.a.b.a().b(aVar).f(w()).c(i()).a();
    }

    private e3.h0.f.d.a.b p(k3.e eVar, Thread thread, int i10, int i11, boolean z10) {
        return e3.h0.f.d.a.b.a().g(z(eVar, thread, i10, z10)).d(m(eVar, i10, i11)).f(w()).c(i()).a();
    }

    private e3.h0.f.d.a.b.e.AbstractC0208b q(StackTraceElement stackTraceElement, e3.h0.f.d.a.b.e.AbstractC0208b.AbstractC0209a abstractC0209a) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC0209a.e(jMax).f(str).b(fileName).d(lineNumber).a();
    }

    private List<e3.h0.f.d.a.b.e.AbstractC0208b> r(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, e3.h0.f.d.a.b.e.AbstractC0208b.a().c(i10)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private e3.h0.f.a s() {
        return e3.h0.f.a.a().e(this.f12135b.f()).g(this.f12136c.f12039f).d(this.f12136c.f12040g).f(this.f12135b.a().c()).b(this.f12136c.f12041h.d()).c(this.f12136c.f12041h.e()).a();
    }

    private e3.h0.f t(String str, long j10) {
        return e3.h0.f.a().m(j10).j(str).h(f12133h).b(s()).l(v()).e(u()).i(3).a();
    }

    private e3.h0.f.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iG = g();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jB = h.b(this.f12134a);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zX = h.x();
        int iL = h.l();
        String str = Build.MANUFACTURER;
        return e3.h0.f.c.a().b(iG).f(Build.MODEL).c(iAvailableProcessors).h(jB).d(blockCount).i(zX).j(iL).e(str).g(Build.PRODUCT).a();
    }

    private e3.h0.f.e v() {
        return e3.h0.f.e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(h.y()).a();
    }

    private e3.h0.f.d.a.b.AbstractC0205d w() {
        return e3.h0.f.d.a.b.AbstractC0205d.a().d(AppEventsConstants.EVENT_PARAM_VALUE_NO).c(AppEventsConstants.EVENT_PARAM_VALUE_NO).b(0L).a();
    }

    private e3.h0.f.d.a.b.e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    private e3.h0.f.d.a.b.e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return e3.h0.f.d.a.b.e.a().d(thread.getName()).c(i10).b(r(stackTraceElementArr, i10)).a();
    }

    private List<e3.h0.f.d.a.b.e> z(k3.e eVar, Thread thread, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f21217c, i10));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.f12137d.a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public e3.h0.f.d c(e3.h0.a aVar) {
        int i10 = this.f12134a.getResources().getConfiguration().orientation;
        return e3.h0.f.d.a().g("anr").f(aVar.i()).b(j(i10, a(aVar))).c(l(i10)).a();
    }

    public e3.h0.f.d d(Throwable th, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        int i12 = this.f12134a.getResources().getConfiguration().orientation;
        return e3.h0.f.d.a().g(str).f(j10).b(k(i12, k3.e.a(th, this.f12137d), thread, i10, i11, z10)).c(l(i12)).a();
    }

    public e3.h0 e(String str, long j10) {
        return b().m(t(str, j10)).a();
    }
}
