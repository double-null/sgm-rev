package ve;

import af.a0;
import af.c0;
import af.q;
import af.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0458a f27481a = C0458a.f27483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27482b = new C0458a.C0459a();

    /* JADX INFO: renamed from: ve.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FileSystem.kt */
    public static final class C0458a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0458a f27483a = new C0458a();

        /* JADX INFO: renamed from: ve.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FileSystem.kt */
        private static final class C0459a implements a {
            @Override // ve.a
            public a0 appendingSink(File file) throws FileNotFoundException {
                t.f(file, "file");
                try {
                    return q.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return q.a(file);
                }
            }

            @Override // ve.a
            public void delete(File file) throws IOException {
                t.f(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException(t.n("failed to delete ", file));
                }
            }

            @Override // ve.a
            public void deleteContents(File directory) throws IOException {
                t.f(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException(t.n("not a readable directory: ", directory));
                }
                int length = fileArrListFiles.length;
                int i10 = 0;
                while (i10 < length) {
                    File file = fileArrListFiles[i10];
                    i10++;
                    if (file.isDirectory()) {
                        t.e(file, "file");
                        deleteContents(file);
                    }
                    if (!file.delete()) {
                        throw new IOException(t.n("failed to delete ", file));
                    }
                }
            }

            @Override // ve.a
            public boolean exists(File file) {
                t.f(file, "file");
                return file.exists();
            }

            @Override // ve.a
            public void rename(File from, File to) throws IOException {
                t.f(from, "from");
                t.f(to, "to");
                delete(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // ve.a
            public a0 sink(File file) throws FileNotFoundException {
                t.f(file, "file");
                try {
                    return r.g(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return r.g(file, false, 1, null);
                }
            }

            @Override // ve.a
            public long size(File file) {
                t.f(file, "file");
                return file.length();
            }

            @Override // ve.a
            public c0 source(File file) throws FileNotFoundException {
                t.f(file, "file");
                return q.j(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private C0458a() {
        }
    }

    a0 appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    a0 sink(File file) throws FileNotFoundException;

    long size(File file);

    c0 source(File file) throws FileNotFoundException;
}
