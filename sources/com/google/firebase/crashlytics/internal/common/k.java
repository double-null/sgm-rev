package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: CrashlyticsAppQualitySessionsStore.java */
/* JADX INFO: loaded from: classes4.dex */
class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final FilenameFilter f12158d = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.i
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return k.d(file, str);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Comparator<File> f12159e = new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.j
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return k.e((File) obj, (File) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileStore f12160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12161b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f12162c = null;

    k(FileStore fileStore) {
        this.f12160a = fileStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(File file, String str) {
        return str.startsWith("aqs.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    private static void f(FileStore fileStore, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            fileStore.q(str, "aqs." + str2).createNewFile();
        } catch (IOException e10) {
            z2.f.f().l("Failed to persist App Quality Sessions session id.", e10);
        }
    }

    static String g(FileStore fileStore, String str) {
        List<File> listR = fileStore.r(str, f12158d);
        if (!listR.isEmpty()) {
            return ((File) Collections.min(listR, f12159e)).getName().substring(4);
        }
        z2.f.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    public synchronized String c(String str) {
        if (Objects.equals(this.f12161b, str)) {
            return this.f12162c;
        }
        return g(this.f12160a, str);
    }

    public synchronized void h(String str) {
        if (!Objects.equals(this.f12162c, str)) {
            f(this.f12160a, this.f12161b, str);
            this.f12162c = str;
        }
    }

    public synchronized void i(String str) {
        if (!Objects.equals(this.f12161b, str)) {
            f(this.f12160a, str, this.f12162c);
            this.f12161b = str;
        }
    }
}
