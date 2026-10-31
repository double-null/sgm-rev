package com.facebook.internal;

import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidParameterException;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import rd.c0;
import wc.g0;

/* JADX INFO: compiled from: FileLruCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FileLruCache {
    private static final String HEADER_CACHEKEY_KEY = "key";
    private static final String HEADER_CACHE_CONTENT_TAG_KEY = "tag";
    private final Condition condition;
    private final File directory;
    private boolean isTrimInProgress;
    private boolean isTrimPending;
    private final AtomicLong lastClearCacheTime;
    private final Limits limits;
    private final ReentrantLock lock;
    private final String tag;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = FileLruCache.class.getSimpleName();
    private static final AtomicLong bufferIndex = new AtomicLong();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: FileLruCache.kt */
    static final class BufferFile {
        private static final String FILE_NAME_PREFIX = "buffer";
        public static final BufferFile INSTANCE = new BufferFile();
        private static final FilenameFilter filterExcludeBufferFiles = new FilenameFilter() { // from class: com.facebook.internal.l
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return FileLruCache.BufferFile.filterExcludeBufferFiles$lambda$0(file, str);
            }
        };
        private static final FilenameFilter filterExcludeNonBufferFiles = new FilenameFilter() { // from class: com.facebook.internal.m
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return FileLruCache.BufferFile.filterExcludeNonBufferFiles$lambda$1(file, str);
            }
        };

        private BufferFile() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean filterExcludeBufferFiles$lambda$0(File file, String filename) {
            kotlin.jvm.internal.t.e(filename, "filename");
            return !c0.O(filename, FILE_NAME_PREFIX, false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean filterExcludeNonBufferFiles$lambda$1(File file, String filename) {
            kotlin.jvm.internal.t.e(filename, "filename");
            return c0.O(filename, FILE_NAME_PREFIX, false, 2, null);
        }

        public final void deleteAll(File root) {
            kotlin.jvm.internal.t.f(root, "root");
            File[] fileArrListFiles = root.listFiles(excludeNonBufferFiles());
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
        }

        public final FilenameFilter excludeBufferFiles() {
            return filterExcludeBufferFiles;
        }

        public final FilenameFilter excludeNonBufferFiles() {
            return filterExcludeNonBufferFiles;
        }

        public final File newFile(File file) {
            return new File(file, FILE_NAME_PREFIX + FileLruCache.bufferIndex.incrementAndGet());
        }
    }

    /* JADX INFO: compiled from: FileLruCache.kt */
    private static final class CloseCallbackOutputStream extends OutputStream {
        private final StreamCloseCallback callback;
        private final OutputStream innerStream;

        public CloseCallbackOutputStream(OutputStream innerStream, StreamCloseCallback callback) {
            kotlin.jvm.internal.t.f(innerStream, "innerStream");
            kotlin.jvm.internal.t.f(callback, "callback");
            this.innerStream = innerStream;
            this.callback = callback;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.innerStream.close();
            } finally {
                this.callback.onClose();
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.innerStream.flush();
        }

        public final StreamCloseCallback getCallback() {
            return this.callback;
        }

        public final OutputStream getInnerStream() {
            return this.innerStream;
        }

        @Override // java.io.OutputStream
        public void write(byte[] buffer, int i10, int i11) throws IOException {
            kotlin.jvm.internal.t.f(buffer, "buffer");
            this.innerStream.write(buffer, i10, i11);
        }

        @Override // java.io.OutputStream
        public void write(byte[] buffer) throws IOException {
            kotlin.jvm.internal.t.f(buffer, "buffer");
            this.innerStream.write(buffer);
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.innerStream.write(i10);
        }
    }

    /* JADX INFO: compiled from: FileLruCache.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final String getTAG() {
            return FileLruCache.TAG;
        }
    }

    /* JADX INFO: compiled from: FileLruCache.kt */
    public static final class Limits {
        private int byteCount = 1048576;
        private int fileCount = 1024;

        public final int getByteCount() {
            return this.byteCount;
        }

        public final int getFileCount() {
            return this.fileCount;
        }

        public final void setByteCount(int i10) {
            if (i10 < 0) {
                throw new InvalidParameterException("Cache byte-count limit must be >= 0");
            }
            this.byteCount = i10;
        }

        public final void setFileCount(int i10) {
            if (i10 < 0) {
                throw new InvalidParameterException("Cache file count limit must be >= 0");
            }
            this.fileCount = i10;
        }
    }

    /* JADX INFO: compiled from: FileLruCache.kt */
    private static final class ModifiedFile implements Comparable<ModifiedFile> {
        public static final Companion Companion = new Companion(null);
        private static final int HASH_MULTIPLIER = 37;
        private static final int HASH_SEED = 29;
        private final File file;
        private final long modified;

        /* JADX INFO: compiled from: FileLruCache.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }
        }

        public ModifiedFile(File file) {
            kotlin.jvm.internal.t.f(file, "file");
            this.file = file;
            this.modified = file.lastModified();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ModifiedFile) && compareTo((ModifiedFile) obj) == 0;
        }

        public final File getFile() {
            return this.file;
        }

        public final long getModified() {
            return this.modified;
        }

        public int hashCode() {
            return ((1073 + this.file.hashCode()) * 37) + ((int) (this.modified % ((long) Integer.MAX_VALUE)));
        }

        @Override // java.lang.Comparable
        public int compareTo(ModifiedFile another) {
            kotlin.jvm.internal.t.f(another, "another");
            long j10 = this.modified;
            long j11 = another.modified;
            if (j10 < j11) {
                return -1;
            }
            if (j10 > j11) {
                return 1;
            }
            return this.file.compareTo(another.file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: FileLruCache.kt */
    interface StreamCloseCallback {
        void onClose();
    }

    /* JADX INFO: compiled from: FileLruCache.kt */
    private static final class StreamHeader {
        private static final int HEADER_VERSION = 0;
        public static final StreamHeader INSTANCE = new StreamHeader();

        private StreamHeader() {
        }

        public final JSONObject readHeader(InputStream stream) throws IOException {
            kotlin.jvm.internal.t.f(stream, "stream");
            if (stream.read() != 0) {
                return null;
            }
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = stream.read();
                if (i13 == -1) {
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String TAG = FileLruCache.Companion.getTAG();
                    kotlin.jvm.internal.t.e(TAG, "TAG");
                    companion.log(loggingBehavior, TAG, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i11 = (i11 << 8) + (i13 & 255);
            }
            byte[] bArr = new byte[i11];
            while (i10 < i11) {
                int i14 = stream.read(bArr, i10, i11 - i10);
                if (i14 < 1) {
                    Logger.Companion companion2 = Logger.Companion;
                    LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                    String TAG2 = FileLruCache.Companion.getTAG();
                    kotlin.jvm.internal.t.e(TAG2, "TAG");
                    companion2.log(loggingBehavior2, TAG2, "readHeader: stream.read stopped at " + Integer.valueOf(i10) + " when expected " + i11);
                    return null;
                }
                i10 += i14;
            }
            try {
                Object objNextValue = new JSONTokener(new String(bArr, rd.d.f24999b)).nextValue();
                if (objNextValue instanceof JSONObject) {
                    return (JSONObject) objNextValue;
                }
                Logger.Companion companion3 = Logger.Companion;
                LoggingBehavior loggingBehavior3 = LoggingBehavior.CACHE;
                String TAG3 = FileLruCache.Companion.getTAG();
                kotlin.jvm.internal.t.e(TAG3, "TAG");
                companion3.log(loggingBehavior3, TAG3, "readHeader: expected JSONObject, got " + objNextValue.getClass().getCanonicalName());
                return null;
            } catch (JSONException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final void writeHeader(OutputStream stream, JSONObject header) throws IOException {
            kotlin.jvm.internal.t.f(stream, "stream");
            kotlin.jvm.internal.t.f(header, "header");
            String string = header.toString();
            kotlin.jvm.internal.t.e(string, "header.toString()");
            byte[] bytes = string.getBytes(rd.d.f24999b);
            kotlin.jvm.internal.t.e(bytes, "this as java.lang.String).getBytes(charset)");
            stream.write(0);
            stream.write((bytes.length >> 16) & 255);
            stream.write((bytes.length >> 8) & 255);
            stream.write((bytes.length >> 0) & 255);
            stream.write(bytes);
        }
    }

    public FileLruCache(String tag, Limits limits) {
        kotlin.jvm.internal.t.f(tag, "tag");
        kotlin.jvm.internal.t.f(limits, "limits");
        this.tag = tag;
        this.limits = limits;
        File file = new File(FacebookSdk.getCacheDir(), tag);
        this.directory = file;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.lastClearCacheTime = new AtomicLong(0L);
        if (file.mkdirs() || file.isDirectory()) {
            BufferFile.INSTANCE.deleteAll(file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearCache$lambda$1(File[] filesToDelete) {
        kotlin.jvm.internal.t.e(filesToDelete, "filesToDelete");
        for (File file : filesToDelete) {
            file.delete();
        }
    }

    public static /* synthetic */ InputStream get$default(FileLruCache fileLruCache, String str, String str2, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return fileLruCache.get(str, str2);
    }

    public static /* synthetic */ OutputStream openPutStream$default(FileLruCache fileLruCache, String str, String str2, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return fileLruCache.openPutStream(str, str2);
    }

    private final void postTrim() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.isTrimPending) {
                this.isTrimPending = true;
                FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.internal.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        FileLruCache.postTrim$lambda$3$lambda$2(this.f11100a);
                    }
                });
            }
            g0 g0Var = g0.f27756a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postTrim$lambda$3$lambda$2(FileLruCache this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        this$0.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renameToTargetAndTrim(String str, File file) {
        if (!file.renameTo(new File(this.directory, Utility.md5hash(str)))) {
            file.delete();
        }
        postTrim();
    }

    private final void trim() {
        long j10;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isTrimPending = false;
            this.isTrimInProgress = true;
            g0 g0Var = g0.f27756a;
            reentrantLock.unlock();
            try {
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String TAG2 = TAG;
                kotlin.jvm.internal.t.e(TAG2, "TAG");
                companion.log(loggingBehavior, TAG2, "trim started");
                PriorityQueue priorityQueue = new PriorityQueue();
                File[] fileArrListFiles = this.directory.listFiles(BufferFile.INSTANCE.excludeBufferFiles());
                long length = 0;
                if (fileArrListFiles != null) {
                    int length2 = fileArrListFiles.length;
                    int i10 = 0;
                    j10 = 0;
                    while (i10 < length2) {
                        File file = fileArrListFiles[i10];
                        kotlin.jvm.internal.t.e(file, "file");
                        ModifiedFile modifiedFile = new ModifiedFile(file);
                        priorityQueue.add(modifiedFile);
                        Logger.Companion companion2 = Logger.Companion;
                        LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                        String TAG3 = TAG;
                        kotlin.jvm.internal.t.e(TAG3, "TAG");
                        companion2.log(loggingBehavior2, TAG3, "  trim considering time=" + Long.valueOf(modifiedFile.getModified()) + " name=" + modifiedFile.getFile().getName());
                        length += file.length();
                        j10++;
                        i10++;
                        fileArrListFiles = fileArrListFiles;
                    }
                } else {
                    j10 = 0;
                }
                while (true) {
                    if (length <= this.limits.getByteCount() && j10 <= this.limits.getFileCount()) {
                        ReentrantLock reentrantLock2 = this.lock;
                        reentrantLock2.lock();
                        try {
                            this.isTrimInProgress = false;
                            this.condition.signalAll();
                            g0 g0Var2 = g0.f27756a;
                            return;
                        } finally {
                            reentrantLock2.unlock();
                        }
                    }
                    File file2 = ((ModifiedFile) priorityQueue.remove()).getFile();
                    Logger.Companion companion3 = Logger.Companion;
                    LoggingBehavior loggingBehavior3 = LoggingBehavior.CACHE;
                    String TAG4 = TAG;
                    kotlin.jvm.internal.t.e(TAG4, "TAG");
                    companion3.log(loggingBehavior3, TAG4, "  trim removing " + file2.getName());
                    length -= file2.length();
                    j10 += -1;
                    file2.delete();
                }
            } catch (Throwable th) {
                ReentrantLock reentrantLock3 = this.lock;
                reentrantLock3.lock();
                try {
                    this.isTrimInProgress = false;
                    this.condition.signalAll();
                    g0 g0Var3 = g0.f27756a;
                    throw th;
                } finally {
                    reentrantLock3.unlock();
                }
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void clearCache() {
        final File[] fileArrListFiles = this.directory.listFiles(BufferFile.INSTANCE.excludeBufferFiles());
        this.lastClearCacheTime.set(System.currentTimeMillis());
        if (fileArrListFiles != null) {
            FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.internal.k
                @Override // java.lang.Runnable
                public final void run() {
                    FileLruCache.clearCache$lambda$1(fileArrListFiles);
                }
            });
        }
    }

    public final InputStream get(String key) throws IOException {
        kotlin.jvm.internal.t.f(key, "key");
        return get$default(this, key, null, 2, null);
    }

    public final String getLocation() {
        String path = this.directory.getPath();
        kotlin.jvm.internal.t.e(path, "directory.path");
        return path;
    }

    public final InputStream interceptAndPut(String key, InputStream input) throws IOException {
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(input, "input");
        return new CopyingInputStream(input, openPutStream$default(this, key, null, 2, null));
    }

    public final OutputStream openPutStream(String key) throws IOException {
        kotlin.jvm.internal.t.f(key, "key");
        return openPutStream$default(this, key, null, 2, null);
    }

    public final long sizeInBytesForTest() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (true) {
            try {
                if (!this.isTrimPending && !this.isTrimInProgress) {
                    break;
                }
                try {
                    this.condition.await();
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        g0 g0Var = g0.f27756a;
        reentrantLock.unlock();
        File[] fileArrListFiles = this.directory.listFiles();
        long length = 0;
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                length += file.length();
            }
        }
        return length;
    }

    public String toString() {
        return "{FileLruCache: tag:" + this.tag + " file:" + this.directory.getName() + '}';
    }

    /* JADX INFO: compiled from: FileLruCache.kt */
    private static final class CopyingInputStream extends InputStream {
        private final InputStream input;
        private final OutputStream output;

        public CopyingInputStream(InputStream input, OutputStream output) {
            kotlin.jvm.internal.t.f(input, "input");
            kotlin.jvm.internal.t.f(output, "output");
            this.input = input;
            this.output = output;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.input.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.input.close();
            } finally {
                this.output.close();
            }
        }

        public final InputStream getInput() {
            return this.input;
        }

        public final OutputStream getOutput() {
            return this.output;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read(byte[] buffer) throws IOException {
            kotlin.jvm.internal.t.f(buffer, "buffer");
            int i10 = this.input.read(buffer);
            if (i10 > 0) {
                this.output.write(buffer, 0, i10);
            }
            return i10;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public long skip(long j10) throws IOException {
            byte[] bArr = new byte[1024];
            long j11 = 0;
            while (j11 < j10) {
                int i10 = read(bArr, 0, (int) Math.min(j10 - j11, 1024));
                if (i10 < 0) {
                    return j11;
                }
                j11 += (long) i10;
            }
            return j11;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int i10 = this.input.read();
            if (i10 >= 0) {
                this.output.write(i10);
            }
            return i10;
        }

        @Override // java.io.InputStream
        public int read(byte[] buffer, int i10, int i11) throws IOException {
            kotlin.jvm.internal.t.f(buffer, "buffer");
            int i12 = this.input.read(buffer, i10, i11);
            if (i12 > 0) {
                this.output.write(buffer, i10, i12);
            }
            return i12;
        }
    }

    public final InputStream get(String key, String str) throws IOException {
        kotlin.jvm.internal.t.f(key, "key");
        File file = new File(this.directory, Utility.md5hash(key));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            try {
                JSONObject header = StreamHeader.INSTANCE.readHeader(bufferedInputStream);
                if (header == null) {
                    bufferedInputStream.close();
                    return null;
                }
                if (!kotlin.jvm.internal.t.a(header.optString("key"), key)) {
                    bufferedInputStream.close();
                    return null;
                }
                String strOptString = header.optString("tag", null);
                if (str != null && !kotlin.jvm.internal.t.a(str, strOptString)) {
                    bufferedInputStream.close();
                    return null;
                }
                long time = new Date().getTime();
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String TAG2 = TAG;
                kotlin.jvm.internal.t.e(TAG2, "TAG");
                companion.log(loggingBehavior, TAG2, "Setting lastModified to " + Long.valueOf(time) + " for " + file.getName());
                file.setLastModified(time);
                return bufferedInputStream;
            } catch (Throwable th) {
                bufferedInputStream.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final OutputStream openPutStream(final String key, String str) throws IOException {
        kotlin.jvm.internal.t.f(key, "key");
        final File fileNewFile = BufferFile.INSTANCE.newFile(this.directory);
        fileNewFile.delete();
        if (!fileNewFile.createNewFile()) {
            throw new IOException("Could not create file at " + fileNewFile.getAbsolutePath());
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileNewFile);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new CloseCallbackOutputStream(fileOutputStream, new StreamCloseCallback() { // from class: com.facebook.internal.FileLruCache$openPutStream$renameToTargetCallback$1
                @Override // com.facebook.internal.FileLruCache.StreamCloseCallback
                public void onClose() {
                    if (jCurrentTimeMillis < this.lastClearCacheTime.get()) {
                        fileNewFile.delete();
                    } else {
                        this.renameToTargetAndTrim(key, fileNewFile);
                    }
                }
            }), 8192);
            try {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", key);
                    if (!Utility.isNullOrEmpty(str)) {
                        jSONObject.put("tag", str);
                    }
                    StreamHeader.INSTANCE.writeHeader(bufferedOutputStream, jSONObject);
                    return bufferedOutputStream;
                } catch (JSONException e10) {
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String TAG2 = TAG;
                    kotlin.jvm.internal.t.e(TAG2, "TAG");
                    companion.log(loggingBehavior, 5, TAG2, "Error creating JSON header for cache file: " + e10);
                    throw new IOException(e10.getMessage());
                }
            } catch (Throwable th) {
                bufferedOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e11) {
            Logger.Companion companion2 = Logger.Companion;
            LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
            String TAG3 = TAG;
            kotlin.jvm.internal.t.e(TAG3, "TAG");
            companion2.log(loggingBehavior2, 5, TAG3, "Error creating buffer output stream: " + e11);
            throw new IOException(e11.getMessage());
        }
    }
}
