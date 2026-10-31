package com.facebook.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.FacebookException;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import wc.g0;

/* JADX INFO: compiled from: ImageDownloader.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ImageDownloader {
    private static final int CACHE_READ_QUEUE_MAX_CONCURRENT = 2;
    private static final int DOWNLOAD_QUEUE_MAX_CONCURRENT = 8;
    private static Handler handler;
    public static final ImageDownloader INSTANCE = new ImageDownloader();
    private static final WorkQueue downloadQueue = new WorkQueue(8, null, 2, null);
    private static final WorkQueue cacheReadQueue = new WorkQueue(2, null, 2, null);
    private static final Map<RequestKey, DownloaderContext> pendingRequests = new HashMap();

    /* JADX INFO: compiled from: ImageDownloader.kt */
    private static final class CacheReadWorkItem implements Runnable {
        private final boolean allowCachedRedirects;
        private final RequestKey key;

        public CacheReadWorkItem(RequestKey key, boolean z10) {
            kotlin.jvm.internal.t.f(key, "key");
            this.key = key;
            this.allowCachedRedirects = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    ImageDownloader.INSTANCE.readFromCache(this.key, this.allowCachedRedirects);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, this);
            }
        }
    }

    /* JADX INFO: compiled from: ImageDownloader.kt */
    private static final class DownloadImageWorkItem implements Runnable {
        private final RequestKey key;

        public DownloadImageWorkItem(RequestKey key) {
            kotlin.jvm.internal.t.f(key, "key");
            this.key = key;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    ImageDownloader.INSTANCE.download(this.key);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, this);
            }
        }
    }

    /* JADX INFO: compiled from: ImageDownloader.kt */
    public static final class DownloaderContext {
        private boolean isCancelled;
        private ImageRequest request;
        private WorkQueue.WorkItem workItem;

        public DownloaderContext(ImageRequest request) {
            kotlin.jvm.internal.t.f(request, "request");
            this.request = request;
        }

        public final ImageRequest getRequest() {
            return this.request;
        }

        public final WorkQueue.WorkItem getWorkItem() {
            return this.workItem;
        }

        public final boolean isCancelled() {
            return this.isCancelled;
        }

        public final void setCancelled(boolean z10) {
            this.isCancelled = z10;
        }

        public final void setRequest(ImageRequest imageRequest) {
            kotlin.jvm.internal.t.f(imageRequest, "<set-?>");
            this.request = imageRequest;
        }

        public final void setWorkItem(WorkQueue.WorkItem workItem) {
            this.workItem = workItem;
        }
    }

    /* JADX INFO: compiled from: ImageDownloader.kt */
    public static final class RequestKey {
        public static final Companion Companion = new Companion(null);
        private static final int HASH_MULTIPLIER = 37;
        private static final int HASH_SEED = 29;
        private Object tag;
        private Uri uri;

        /* JADX INFO: compiled from: ImageDownloader.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }
        }

        public RequestKey(Uri uri, Object tag) {
            kotlin.jvm.internal.t.f(uri, "uri");
            kotlin.jvm.internal.t.f(tag, "tag");
            this.uri = uri;
            this.tag = tag;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof RequestKey)) {
                return false;
            }
            RequestKey requestKey = (RequestKey) obj;
            return kotlin.jvm.internal.t.a(requestKey.uri, this.uri) && kotlin.jvm.internal.t.a(requestKey.tag, this.tag);
        }

        public final Object getTag() {
            return this.tag;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return ((1073 + this.uri.hashCode()) * 37) + this.tag.hashCode();
        }

        public final void setTag(Object obj) {
            kotlin.jvm.internal.t.f(obj, "<set-?>");
            this.tag = obj;
        }

        public final void setUri(Uri uri) {
            kotlin.jvm.internal.t.f(uri, "<set-?>");
            this.uri = uri;
        }
    }

    private ImageDownloader() {
    }

    public static final boolean cancelRequest(ImageRequest request) {
        boolean z10;
        kotlin.jvm.internal.t.f(request, "request");
        RequestKey requestKey = new RequestKey(request.getImageUri(), request.getCallerTag());
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            DownloaderContext downloaderContext = map.get(requestKey);
            if (downloaderContext != null) {
                WorkQueue.WorkItem workItem = downloaderContext.getWorkItem();
                z10 = true;
                if (workItem == null || !workItem.cancel()) {
                    downloaderContext.setCancelled(true);
                } else {
                    map.remove(requestKey);
                }
            } else {
                z10 = false;
            }
            g0 g0Var = g0.f27756a;
        }
        return z10;
    }

    public static final void clearCache() {
        ImageResponseCache.clearCache();
        UrlRedirectCache.clearCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    public final void download(RequestKey requestKey) throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? responseCode;
        Exception facebookException;
        InputStream inputStreamInterceptAndCacheImageStream;
        Bitmap bitmapDecodeStream;
        ?? r10 = 0;
        InputStream inputStream = null;
        r10 = 0;
        Bitmap bitmap = null;
        boolean z10 = true;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(requestKey.getUri().toString()).openConnection();
            kotlin.jvm.internal.t.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    responseCode = httpURLConnection.getResponseCode();
                    try {
                        if (responseCode != 200) {
                            if (responseCode == 301 || responseCode == 302) {
                                try {
                                    String headerField = httpURLConnection.getHeaderField("location");
                                    if (!Utility.isNullOrEmpty(headerField)) {
                                        Uri redirectUri = Uri.parse(headerField);
                                        UrlRedirectCache.cacheUriRedirect(requestKey.getUri(), redirectUri);
                                        DownloaderContext downloaderContextRemovePendingRequest = removePendingRequest(requestKey);
                                        if (downloaderContextRemovePendingRequest != null && !downloaderContextRemovePendingRequest.isCancelled()) {
                                            ImageRequest request = downloaderContextRemovePendingRequest.getRequest();
                                            kotlin.jvm.internal.t.e(redirectUri, "redirectUri");
                                            enqueueCacheRead(request, new RequestKey(redirectUri, requestKey.getTag()), false);
                                        }
                                    }
                                    z10 = false;
                                    bitmapDecodeStream = null;
                                    facebookException = null;
                                } catch (IOException e10) {
                                    e = e10;
                                    z10 = false;
                                    responseCode = 0;
                                    Utility.closeQuietly(responseCode);
                                    Utility.disconnectQuietly(httpURLConnection);
                                    facebookException = e;
                                }
                            } else {
                                inputStreamInterceptAndCacheImageStream = httpURLConnection.getErrorStream();
                                StringBuilder sb2 = new StringBuilder();
                                if (inputStreamInterceptAndCacheImageStream != null) {
                                    InputStreamReader inputStreamReader = new InputStreamReader(inputStreamInterceptAndCacheImageStream);
                                    char[] cArr = new char[128];
                                    while (true) {
                                        int i10 = inputStreamReader.read(cArr, 0, 128);
                                        if (i10 <= 0) {
                                            break;
                                        } else {
                                            sb2.append(cArr, 0, i10);
                                        }
                                    }
                                    Utility.closeQuietly(inputStreamReader);
                                } else {
                                    sb2.append("Unexpected error while downloading an image.");
                                }
                                facebookException = new FacebookException(sb2.toString());
                                bitmapDecodeStream = null;
                            }
                            Utility.closeQuietly(inputStream);
                            Utility.disconnectQuietly(httpURLConnection);
                            bitmap = bitmapDecodeStream;
                            if (z10) {
                                issueResponse(requestKey, facebookException, bitmap, false);
                            }
                        }
                        inputStreamInterceptAndCacheImageStream = ImageResponseCache.interceptAndCacheImageStream(httpURLConnection);
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamInterceptAndCacheImageStream);
                        facebookException = null;
                        inputStream = inputStreamInterceptAndCacheImageStream;
                        Utility.closeQuietly(inputStream);
                        Utility.disconnectQuietly(httpURLConnection);
                        bitmap = bitmapDecodeStream;
                    } catch (IOException e11) {
                        e = e11;
                        Utility.closeQuietly(responseCode);
                        Utility.disconnectQuietly(httpURLConnection);
                        facebookException = e;
                    } catch (Throwable th) {
                        th = th;
                        r10 = responseCode;
                        Utility.closeQuietly(r10);
                        Utility.disconnectQuietly(httpURLConnection);
                        throw th;
                    }
                } catch (IOException e12) {
                    e = e12;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e13) {
            e = e13;
            httpURLConnection = null;
            responseCode = 0;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
        if (z10) {
            issueResponse(requestKey, facebookException, bitmap, false);
        }
    }

    public static final void downloadAsync(ImageRequest imageRequest) {
        if (imageRequest == null) {
            return;
        }
        RequestKey requestKey = new RequestKey(imageRequest.getImageUri(), imageRequest.getCallerTag());
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            DownloaderContext downloaderContext = map.get(requestKey);
            if (downloaderContext != null) {
                downloaderContext.setRequest(imageRequest);
                downloaderContext.setCancelled(false);
                WorkQueue.WorkItem workItem = downloaderContext.getWorkItem();
                if (workItem != null) {
                    workItem.moveToFront();
                    g0 g0Var = g0.f27756a;
                }
            } else {
                INSTANCE.enqueueCacheRead(imageRequest, requestKey, imageRequest.isCachedRedirectAllowed());
                g0 g0Var2 = g0.f27756a;
            }
        }
    }

    private final void enqueueCacheRead(ImageRequest imageRequest, RequestKey requestKey, boolean z10) {
        enqueueRequest(imageRequest, requestKey, cacheReadQueue, new CacheReadWorkItem(requestKey, z10));
    }

    private final void enqueueDownload(ImageRequest imageRequest, RequestKey requestKey) {
        enqueueRequest(imageRequest, requestKey, downloadQueue, new DownloadImageWorkItem(requestKey));
    }

    private final void enqueueRequest(ImageRequest imageRequest, RequestKey requestKey, WorkQueue workQueue, Runnable runnable) {
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            DownloaderContext downloaderContext = new DownloaderContext(imageRequest);
            map.put(requestKey, downloaderContext);
            downloaderContext.setWorkItem(WorkQueue.addActiveWorkItem$default(workQueue, runnable, false, 2, null));
            g0 g0Var = g0.f27756a;
        }
    }

    private final synchronized Handler getHandler() {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        return handler;
    }

    private final void issueResponse(RequestKey requestKey, final Exception exc, final Bitmap bitmap, final boolean z10) {
        Handler handler2;
        DownloaderContext downloaderContextRemovePendingRequest = removePendingRequest(requestKey);
        if (downloaderContextRemovePendingRequest == null || downloaderContextRemovePendingRequest.isCancelled()) {
            return;
        }
        final ImageRequest request = downloaderContextRemovePendingRequest.getRequest();
        final ImageRequest.Callback callback = request != null ? request.getCallback() : null;
        if (callback == null || (handler2 = getHandler()) == null) {
            return;
        }
        handler2.post(new Runnable() { // from class: com.facebook.internal.n
            @Override // java.lang.Runnable
            public final void run() {
                ImageDownloader.issueResponse$lambda$4(request, exc, z10, bitmap, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void issueResponse$lambda$4(ImageRequest request, Exception exc, boolean z10, Bitmap bitmap, ImageRequest.Callback callback) {
        kotlin.jvm.internal.t.f(request, "$request");
        callback.onCompleted(new ImageResponse(request, exc, z10, bitmap));
    }

    public static final void prioritizeRequest(ImageRequest request) {
        WorkQueue.WorkItem workItem;
        kotlin.jvm.internal.t.f(request, "request");
        RequestKey requestKey = new RequestKey(request.getImageUri(), request.getCallerTag());
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            DownloaderContext downloaderContext = map.get(requestKey);
            if (downloaderContext != null && (workItem = downloaderContext.getWorkItem()) != null) {
                workItem.moveToFront();
            }
            g0 g0Var = g0.f27756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void readFromCache(RequestKey requestKey, boolean z10) {
        InputStream cachedImageStream;
        Uri redirectedUri;
        boolean z11 = false;
        if (!z10 || (redirectedUri = UrlRedirectCache.getRedirectedUri(requestKey.getUri())) == null) {
            cachedImageStream = null;
        } else {
            cachedImageStream = ImageResponseCache.getCachedImageStream(redirectedUri);
            if (cachedImageStream != null) {
                z11 = true;
            }
        }
        if (!z11) {
            cachedImageStream = ImageResponseCache.getCachedImageStream(requestKey.getUri());
        }
        if (cachedImageStream != null) {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(cachedImageStream);
            Utility.closeQuietly(cachedImageStream);
            issueResponse(requestKey, null, bitmapDecodeStream, z11);
            return;
        }
        DownloaderContext downloaderContextRemovePendingRequest = removePendingRequest(requestKey);
        ImageRequest request = downloaderContextRemovePendingRequest != null ? downloaderContextRemovePendingRequest.getRequest() : null;
        if (downloaderContextRemovePendingRequest == null || downloaderContextRemovePendingRequest.isCancelled() || request == null) {
            return;
        }
        enqueueDownload(request, requestKey);
    }

    private final DownloaderContext removePendingRequest(RequestKey requestKey) {
        DownloaderContext downloaderContextRemove;
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            downloaderContextRemove = map.remove(requestKey);
        }
        return downloaderContextRemove;
    }

    public final Map<RequestKey, DownloaderContext> getPendingRequests() {
        return pendingRequests;
    }
}
