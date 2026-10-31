package com.google.firebase.crashlytics.internal.persistence;

import android.os.Build;
import com.adjust.sdk.Constants;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import d3.o;
import e3.h0;
import f3.j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;
import z2.f;

/* JADX INFO: compiled from: CrashlyticsReportPersistence.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f12226e = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f12227f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j f12228g = new j();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator<? super File> f12229h = new Comparator() { // from class: h3.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return com.google.firebase.crashlytics.internal.persistence.a.A((File) obj, (File) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final FilenameFilter f12230i = new FilenameFilter() { // from class: h3.e
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return com.google.firebase.crashlytics.internal.persistence.a.B(file, str);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f12231a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileStore f12232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SettingsProvider f12233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CrashlyticsAppQualitySessionsSubscriber f12234d;

    public a(FileStore fileStore, SettingsProvider settingsProvider, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        this.f12232b = fileStore;
        this.f12233c = settingsProvider;
        this.f12234d = crashlyticsAppQualitySessionsSubscriber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int A(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean B(File file, String str) {
        return str.startsWith("event");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int D(File file, File file2) {
        return r(file.getName()).compareTo(r(file2.getName()));
    }

    private static String H(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f12226e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private void I(File file, h0.d dVar, String str, h0.a aVar) {
        String strD = this.f12234d.d(str);
        try {
            j jVar = f12228g;
            M(this.f12232b.i(str), jVar.Q(jVar.P(H(file)).u(dVar).q(aVar).p(strD)));
        } catch (IOException e10) {
            f.f().l("Could not synthesize final native report file for " + file, e10);
        }
    }

    private void J(String str, long j10) {
        boolean z10;
        List<File> listR = this.f12232b.r(str, f12230i);
        if (listR.isEmpty()) {
            f.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(listR);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = listR.iterator();
        loop0: while (true) {
            z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File next = it.next();
                try {
                    arrayList.add(k(str, f12228g.j(H(next))));
                    if (z10 || w(next.getName())) {
                        z10 = true;
                    }
                } catch (IOException e10) {
                    f.f().l("Could not add event to report for " + next, e10);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            K(this.f12232b.q(str, "report"), arrayList, j10, z10, o.l(str, this.f12232b), this.f12234d.d(str));
        } else {
            f.f().k("Could not parse event files for session " + str);
        }
    }

    private void K(File file, List<h0.f.d> list, long j10, boolean z10, String str, String str2) {
        try {
            j jVar = f12228g;
            h0 h0VarR = jVar.P(H(file)).v(j10, z10, str).p(str2).r(list);
            h0.f fVarN = h0VarR.n();
            if (fVarN == null) {
                return;
            }
            f.f().b("appQualitySessionId: " + str2);
            M(z10 ? this.f12232b.l(fVarN.i()) : this.f12232b.n(fVarN.i()), jVar.Q(h0VarR));
        } catch (IOException e10) {
            f.f().l("Could not synthesize final report file for " + file, e10);
        }
    }

    private int L(String str, int i10) {
        List<File> listR = this.f12232b.r(str, new FilenameFilter() { // from class: h3.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return com.google.firebase.crashlytics.internal.persistence.a.x(file, str2);
            }
        });
        Collections.sort(listR, new Comparator() { // from class: h3.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return com.google.firebase.crashlytics.internal.persistence.a.D((File) obj, (File) obj2);
            }
        });
        return h(listR, i10);
    }

    private static void M(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f12226e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void N(File file, String str, long j10) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f12226e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(j(j10));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private SortedSet<String> g(String str) {
        this.f12232b.d();
        SortedSet<String> sortedSetS = s();
        if (str != null) {
            sortedSetS.remove(str);
        }
        if (sortedSetS.size() <= 8) {
            return sortedSetS;
        }
        while (sortedSetS.size() > 8) {
            String strLast = sortedSetS.last();
            f.f().b("Removing session over cap: " + strLast);
            this.f12232b.e(strLast);
            sortedSetS.remove(strLast);
        }
        return sortedSetS;
    }

    private static int h(List<File> list, int i10) {
        int size = list.size();
        for (File file : list) {
            if (size <= i10) {
                return size;
            }
            FileStore.v(file);
            size--;
        }
        return size;
    }

    private void i() {
        int i10 = this.f12233c.b().f20572a.f20584b;
        List<File> listQ = q();
        int size = listQ.size();
        if (size <= i10) {
            return;
        }
        Iterator<File> it = listQ.subList(i10, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static long j(long j10) {
        return j10 * 1000;
    }

    private h0.f.d k(String str, final h0.f.d dVar) {
        return (Build.VERSION.SDK_INT < 37 || !v(dVar)) ? dVar : (h0.f.d) Optional.of(this.f12232b.q(str, "profiling-manager-info")).filter(new Predicate() { // from class: h3.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((File) obj).exists();
            }
        }).flatMap(new Function() { // from class: h3.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return com.google.firebase.crashlytics.internal.persistence.a.y((File) obj);
            }
        }).map(new Function() { // from class: h3.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return com.google.firebase.crashlytics.internal.persistence.a.z(dVar, (h0.e) obj);
            }
        }).orElse(dVar);
    }

    private void m(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static String p(int i10, boolean z10) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i10)) + (z10 ? "_" : "");
    }

    private List<File> q() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f12232b.m());
        arrayList.addAll(this.f12232b.j());
        Comparator<? super File> comparator = f12229h;
        Collections.sort(arrayList, comparator);
        List<File> listO = this.f12232b.o();
        Collections.sort(listO, comparator);
        arrayList.addAll(listO);
        return arrayList;
    }

    private static String r(String str) {
        return str.substring(0, f12227f);
    }

    private static boolean v(h0.f.d dVar) {
        return dVar.g().equals(AppMeasurement.CRASH_ORIGIN) || dVar.g().equals("ndk-crash");
    }

    private static boolean w(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean x(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Optional y(File file) {
        try {
            return Optional.of(f12228g.N(H(file)));
        } catch (IOException e10) {
            f.f().l("Unable to read the Profiling Manager file ", e10);
            return Optional.empty();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h0.f.d z(h0.f.d dVar, h0.e eVar) {
        return dVar.h().b(dVar.b().i().f(dVar.b().f().h().e(eVar).a()).a()).a();
    }

    public List<com.google.firebase.crashlytics.internal.common.h0> C() {
        List<File> listQ = q();
        ArrayList arrayList = new ArrayList();
        for (File file : listQ) {
            try {
                arrayList.add(com.google.firebase.crashlytics.internal.common.h0.a(f12228g.P(H(file)), file.getName(), file));
            } catch (IOException e10) {
                f.f().l("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        return arrayList;
    }

    public void E(h0.f.d dVar, String str, boolean z10) {
        int i10 = this.f12233c.b().f20572a.f20583a;
        try {
            M(this.f12232b.q(str, p(this.f12231a.getAndIncrement(), z10)), f12228g.k(dVar));
        } catch (IOException e10) {
            f.f().l("Could not persist event for session " + str, e10);
        }
        L(str, i10);
    }

    public void F(h0.e eVar, String str) {
        try {
            M(this.f12232b.q(str, "profiling-manager-info"), f12228g.O(eVar));
        } catch (IOException e10) {
            f.f().l("Could not persist Profiling Manager info " + str, e10);
        }
    }

    public void G(h0 h0Var) {
        h0.f fVarN = h0Var.n();
        if (fVarN == null) {
            f.f().b("Could not get session for report");
            return;
        }
        String strI = fVarN.i();
        try {
            M(this.f12232b.q(strI, "report"), f12228g.Q(h0Var));
            N(this.f12232b.q(strI, "start-time"), "", fVarN.l());
        } catch (IOException e10) {
            f.f().c("Could not persist report for session " + strI, e10);
        }
    }

    public void l() {
        m(this.f12232b.o());
        m(this.f12232b.m());
        m(this.f12232b.j());
    }

    public void n(String str, long j10) {
        for (String str2 : g(str)) {
            f.f().i("Finalizing report for session " + str2);
            J(str2, j10);
            this.f12232b.e(str2);
        }
        i();
    }

    public void o(String str, h0.d dVar, h0.a aVar) {
        File fileQ = this.f12232b.q(str, "report");
        f.f().b("Writing native session report for " + str + " to file: " + fileQ);
        I(fileQ, dVar, str, aVar);
    }

    public SortedSet<String> s() {
        return new TreeSet(this.f12232b.f()).descendingSet();
    }

    public long t(String str) {
        return this.f12232b.q(str, "start-time").lastModified();
    }

    public boolean u() {
        return (this.f12232b.o().isEmpty() && this.f12232b.m().isEmpty() && this.f12232b.j().isEmpty()) ? false : true;
    }
}
