package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import z2.f;
import z2.h;

/* JADX INFO: loaded from: classes4.dex */
public class FileStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f12219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f12220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f12221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f12222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f12223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final File f12224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f12225g;

    public FileStore(Context context) {
        String str;
        String strD = h.f28939a.e(context).d();
        this.f12219a = strD;
        File filesDir = context.getFilesDir();
        this.f12220b = filesDir;
        if (y()) {
            str = ".crashlytics.v3" + File.separator + x(strD);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileT = t(new File(filesDir, str));
        this.f12221c = fileT;
        this.f12222d = t(new File(fileT, "open-sessions"));
        this.f12223e = t(new File(fileT, "reports"));
        this.f12224f = t(new File(fileT, "priority-reports"));
        this.f12225g = t(new File(fileT, "native-reports"));
    }

    private void b(String str) {
        File file = new File(this.f12220b, str);
        if (file.exists() && v(file)) {
            f.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void c(final String str) {
        String[] list;
        if (!this.f12220b.exists() || (list = this.f12220b.list(new FilenameFilter() { // from class: h3.h
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return FileStore.s(str, file, str2);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            b(str2);
        }
    }

    private File p(String str) {
        return u(new File(this.f12222d, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean s(String str, File file, String str2) {
        return str2.startsWith(str);
    }

    private static synchronized File t(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return file;
            }
            f.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
            file.delete();
        }
        if (!file.mkdirs()) {
            f.f().d("Could not create Crashlytics-specific directory: " + file);
        }
        return file;
    }

    private static File u(File file) {
        file.mkdirs();
        return file;
    }

    static boolean v(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                v(file2);
            }
        }
        return file.delete();
    }

    private static <T> List<T> w(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    static String x(String str) {
        return str.length() > 40 ? com.google.firebase.crashlytics.internal.common.h.A(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean y() {
        return !this.f12219a.isEmpty();
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (y()) {
            b(".com.google.firebase.crashlytics.files.v1");
            c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    public boolean e(String str) {
        return v(new File(this.f12222d, str));
    }

    public List<String> f() {
        return w(this.f12222d.list());
    }

    public File g(String str) {
        return new File(this.f12221c, str);
    }

    public List<File> h(FilenameFilter filenameFilter) {
        return w(this.f12221c.listFiles(filenameFilter));
    }

    public File i(String str) {
        return new File(this.f12225g, str);
    }

    public List<File> j() {
        return w(this.f12225g.listFiles());
    }

    public File k(String str) {
        return u(new File(p(str), "native"));
    }

    public File l(String str) {
        return new File(this.f12224f, str);
    }

    public List<File> m() {
        return w(this.f12224f.listFiles());
    }

    public File n(String str) {
        return new File(this.f12223e, str);
    }

    public List<File> o() {
        return w(this.f12223e.listFiles());
    }

    public File q(String str, String str2) {
        return new File(p(str), str2);
    }

    public List<File> r(String str, FilenameFilter filenameFilter) {
        return w(p(str).listFiles(filenameFilter));
    }
}
