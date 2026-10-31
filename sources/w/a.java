package w;

import android.util.Log;
import com.android.billingclient.gp.VRfCTjjLv;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: AtomicFile.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f27484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f27485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f27486c;

    public a(File file) {
        this.f27484a = file;
        this.f27485b = new File(file.getPath() + ".new");
        this.f27486c = new File(file.getPath() + ".bak");
    }

    private static void c(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    private static boolean e(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void a(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!e(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e10) {
            Log.e("AtomicFile", "Failed to close file output stream", e10);
        }
        if (this.f27485b.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + this.f27485b);
    }

    public FileOutputStream d() throws IOException {
        if (this.f27486c.exists()) {
            c(this.f27486c, this.f27484a);
        }
        try {
            return new FileOutputStream(this.f27485b);
        } catch (FileNotFoundException unused) {
            if (!this.f27485b.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + this.f27485b);
            }
            try {
                return new FileOutputStream(this.f27485b);
            } catch (FileNotFoundException e10) {
                throw new IOException("Failed to create new file " + this.f27485b, e10);
            }
        }
    }

    public void b(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        boolean zE = e(fileOutputStream);
        String str = VRfCTjjLv.FXkNym;
        if (!zE) {
            Log.e(str, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e10) {
            Log.e(str, "Failed to close file output stream", e10);
        }
        c(this.f27485b, this.f27484a);
    }
}
