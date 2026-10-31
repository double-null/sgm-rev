package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: compiled from: SQLiteCopyOpenHelper.java */
/* JADX INFO: loaded from: classes.dex */
class j implements x0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f3554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x0.c f3556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f3557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f3558g;

    j(Context context, String str, File file, int i10, x0.c cVar) {
        this.f3552a = context;
        this.f3553b = str;
        this.f3554c = file;
        this.f3555d = i10;
        this.f3556e = cVar;
    }

    private void b(File file) throws IOException {
        ReadableByteChannel channel;
        if (this.f3553b != null) {
            channel = Channels.newChannel(this.f3552a.getAssets().open(this.f3553b));
        } else {
            if (this.f3554c == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(this.f3554c).getChannel();
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f3552a.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        v0.d.a(channel, new FileOutputStream(fileCreateTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private void e() {
        String databaseName = getDatabaseName();
        File databasePath = this.f3552a.getDatabasePath(databaseName);
        a aVar = this.f3557f;
        v0.a aVar2 = new v0.a(databaseName, this.f3552a.getFilesDir(), aVar == null || aVar.f3457j);
        try {
            aVar2.b();
            if (!databasePath.exists()) {
                try {
                    b(databasePath);
                    aVar2.c();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            if (this.f3557f == null) {
                aVar2.c();
                return;
            }
            try {
                int iC = v0.c.c(databasePath);
                int i10 = this.f3555d;
                if (iC == i10) {
                    aVar2.c();
                    return;
                }
                if (this.f3557f.a(iC, i10)) {
                    aVar2.c();
                    return;
                }
                if (this.f3552a.deleteDatabase(databaseName)) {
                    try {
                        b(databasePath);
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar2.c();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                aVar2.c();
                return;
            }
        } catch (Throwable th) {
            aVar2.c();
            throw th;
        }
        aVar2.c();
        throw th;
    }

    @Override // x0.c
    public synchronized x0.b b0() {
        if (!this.f3558g) {
            e();
            this.f3558g = true;
        }
        return this.f3556e.b0();
    }

    void c(a aVar) {
        this.f3557f = aVar;
    }

    @Override // x0.c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f3556e.close();
        this.f3558g = false;
    }

    @Override // x0.c
    public String getDatabaseName() {
        return this.f3556e.getDatabaseName();
    }

    @Override // x0.c
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f3556e.setWriteAheadLoggingEnabled(z10);
    }
}
