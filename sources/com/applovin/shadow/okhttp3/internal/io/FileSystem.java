package com.applovin.shadow.okhttp3.internal.io;

import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Okio__JvmOkioKt;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes.dex */
public interface FileSystem {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    /* JADX INFO: compiled from: FileSystem.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: FileSystem.kt */
        private static final class SystemFileSystem implements FileSystem {
            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public Sink appendingSink(File file) throws FileNotFoundException {
                t.f(file, "file");
                try {
                    return Okio.appendingSink(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio.appendingSink(file);
                }
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public void delete(File file) throws IOException {
                t.f(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public void deleteContents(File directory) throws IOException {
                t.f(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        t.e(file, "file");
                        deleteContents(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public boolean exists(File file) {
                t.f(file, "file");
                return file.exists();
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public void rename(File from, File to) throws IOException {
                t.f(from, "from");
                t.f(to, "to");
                delete(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public Sink sink(File file) throws FileNotFoundException {
                t.f(file, "file");
                try {
                    return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                }
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public long size(File file) {
                t.f(file, "file");
                return file.length();
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public Source source(File file) throws FileNotFoundException {
                t.f(file, "file");
                return Okio.source(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    Sink appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    Sink sink(File file) throws FileNotFoundException;

    long size(File file);

    Source source(File file) throws FileNotFoundException;
}
