package v0;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: CopyLock.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, Lock> f27074e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f27075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lock f27076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileChannel f27078d;

    public a(String str, File file, boolean z10) {
        File file2 = new File(file, str + ".lck");
        this.f27075a = file2;
        this.f27076b = a(file2.getAbsolutePath());
        this.f27077c = z10;
    }

    private static Lock a(String str) {
        Lock reentrantLock;
        Map<String, Lock> map = f27074e;
        synchronized (map) {
            reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
        }
        return reentrantLock;
    }

    public void b() {
        this.f27076b.lock();
        if (this.f27077c) {
            try {
                FileChannel channel = new FileOutputStream(this.f27075a).getChannel();
                this.f27078d = channel;
                channel.lock();
            } catch (IOException e10) {
                throw new IllegalStateException("Unable to grab copy lock.", e10);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f27078d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f27076b.unlock();
    }
}
