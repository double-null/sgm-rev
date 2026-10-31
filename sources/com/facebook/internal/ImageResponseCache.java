package com.facebook.internal;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import rd.c0;

/* JADX INFO: compiled from: ImageResponseCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ImageResponseCache {
    public static final ImageResponseCache INSTANCE = new ImageResponseCache();
    private static final String TAG = ImageResponseCache.class.getSimpleName();
    private static FileLruCache imageCache;

    /* JADX INFO: compiled from: ImageResponseCache.kt */
    private static final class BufferedHttpInputStream extends BufferedInputStream {
        private HttpURLConnection connection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BufferedHttpInputStream(InputStream inputStream, HttpURLConnection connection) {
            super(inputStream, 8192);
            kotlin.jvm.internal.t.f(connection, "connection");
            this.connection = connection;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            Utility.disconnectQuietly(this.connection);
        }

        public final HttpURLConnection getConnection() {
            return this.connection;
        }

        public final void setConnection(HttpURLConnection httpURLConnection) {
            kotlin.jvm.internal.t.f(httpURLConnection, "<set-?>");
            this.connection = httpURLConnection;
        }
    }

    private ImageResponseCache() {
    }

    public static final void clearCache() {
        try {
            getCache().clearCache();
        } catch (IOException e10) {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
            String TAG2 = TAG;
            kotlin.jvm.internal.t.e(TAG2, "TAG");
            companion.log(loggingBehavior, 5, TAG2, "clearCache failed " + e10.getMessage());
        }
    }

    public static final synchronized FileLruCache getCache() throws IOException {
        FileLruCache fileLruCache;
        if (imageCache == null) {
            String TAG2 = TAG;
            kotlin.jvm.internal.t.e(TAG2, "TAG");
            imageCache = new FileLruCache(TAG2, new FileLruCache.Limits());
        }
        fileLruCache = imageCache;
        if (fileLruCache == null) {
            kotlin.jvm.internal.t.u("imageCache");
            fileLruCache = null;
        }
        return fileLruCache;
    }

    public static final InputStream getCachedImageStream(Uri uri) {
        if (uri == null || !INSTANCE.isCDNURL(uri)) {
            return null;
        }
        try {
            FileLruCache cache = getCache();
            String string = uri.toString();
            kotlin.jvm.internal.t.e(string, "uri.toString()");
            return FileLruCache.get$default(cache, string, null, 2, null);
        } catch (IOException e10) {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
            String TAG2 = TAG;
            kotlin.jvm.internal.t.e(TAG2, "TAG");
            companion.log(loggingBehavior, 5, TAG2, e10.toString());
            return null;
        }
    }

    public static final InputStream interceptAndCacheImageStream(HttpURLConnection connection) throws IOException {
        kotlin.jvm.internal.t.f(connection, "connection");
        if (connection.getResponseCode() != 200) {
            return null;
        }
        Uri uri = Uri.parse(connection.getURL().toString());
        InputStream inputStream = connection.getInputStream();
        try {
            if (!INSTANCE.isCDNURL(uri)) {
                return inputStream;
            }
            FileLruCache cache = getCache();
            String string = uri.toString();
            kotlin.jvm.internal.t.e(string, "uri.toString()");
            return cache.interceptAndPut(string, new BufferedHttpInputStream(inputStream, connection));
        } catch (IOException unused) {
            return inputStream;
        }
    }

    private final boolean isCDNURL(Uri uri) {
        String host;
        return (uri == null || (host = uri.getHost()) == null || (!kotlin.jvm.internal.t.a(host, "fbcdn.net") && !c0.A(host, ".fbcdn.net", false, 2, null) && (!c0.O(host, "fbcdn", false, 2, null) || !c0.A(host, ".akamaihd.net", false, 2, null)))) ? false : true;
    }

    public final String getTAG() {
        return TAG;
    }
}
