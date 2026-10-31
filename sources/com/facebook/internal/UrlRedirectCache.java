package com.facebook.internal;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashSet;
import kotlin.jvm.internal.i0;

/* JADX INFO: compiled from: UrlRedirectCache.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UrlRedirectCache {
    public static final UrlRedirectCache INSTANCE = new UrlRedirectCache();
    private static final String redirectContentTag;
    private static final String tag;
    private static FileLruCache urlRedirectFileLruCache;

    static {
        String strG = i0.b(UrlRedirectCache.class).g();
        if (strG == null) {
            strG = "UrlRedirectCache";
        }
        tag = strG;
        redirectContentTag = strG + "_Redirect";
    }

    private UrlRedirectCache() {
    }

    public static final void cacheUriRedirect(Uri uri, Uri uri2) {
        if (uri == null || uri2 == null) {
            return;
        }
        OutputStream outputStreamOpenPutStream = null;
        try {
            try {
                FileLruCache cache = getCache();
                String string = uri.toString();
                kotlin.jvm.internal.t.e(string, "fromUri.toString()");
                outputStreamOpenPutStream = cache.openPutStream(string, redirectContentTag);
                String string2 = uri2.toString();
                kotlin.jvm.internal.t.e(string2, "toUri.toString()");
                byte[] bytes = string2.getBytes(rd.d.f24999b);
                kotlin.jvm.internal.t.e(bytes, "this as java.lang.String).getBytes(charset)");
                outputStreamOpenPutStream.write(bytes);
            } catch (IOException e10) {
                Logger.Companion.log(LoggingBehavior.CACHE, 4, tag, "IOException when accessing cache: " + e10.getMessage());
            }
        } finally {
            Utility.closeQuietly(outputStreamOpenPutStream);
        }
    }

    public static final void clearCache() {
        try {
            getCache().clearCache();
        } catch (IOException e10) {
            Logger.Companion.log(LoggingBehavior.CACHE, 5, tag, "clearCache failed " + e10.getMessage());
        }
    }

    public static final synchronized FileLruCache getCache() throws IOException {
        FileLruCache fileLruCache;
        fileLruCache = urlRedirectFileLruCache;
        if (fileLruCache == null) {
            fileLruCache = new FileLruCache(tag, new FileLruCache.Limits());
        }
        urlRedirectFileLruCache = fileLruCache;
        return fileLruCache;
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00b8: MOVE (r0 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:184), block:B:43:0x00b8 */
    public static final Uri getRedirectedUri(Uri uri) throws Throwable {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        InputStreamReader inputStreamReader3 = null;
        if (uri == null) {
            return null;
        }
        String string = uri.toString();
        kotlin.jvm.internal.t.e(string, "uri.toString()");
        HashSet hashSet = new HashSet();
        hashSet.add(string);
        try {
            try {
                FileLruCache cache = getCache();
                InputStream inputStream = cache.get(string, redirectContentTag);
                inputStreamReader = null;
                boolean z10 = false;
                while (inputStream != null) {
                    try {
                        InputStreamReader inputStreamReader4 = new InputStreamReader(inputStream);
                        try {
                            char[] cArr = new char[128];
                            StringBuilder sb2 = new StringBuilder();
                            for (int i10 = inputStreamReader4.read(cArr, 0, 128); i10 > 0; i10 = inputStreamReader4.read(cArr, 0, 128)) {
                                sb2.append(cArr, 0, i10);
                            }
                            Utility.closeQuietly(inputStreamReader4);
                            String string2 = sb2.toString();
                            kotlin.jvm.internal.t.e(string2, "urlBuilder.toString()");
                            if (hashSet.contains(string2)) {
                                if (kotlin.jvm.internal.t.a(string2, string)) {
                                    inputStreamReader = inputStreamReader4;
                                    z10 = true;
                                    break;
                                }
                                Logger.Companion.log(LoggingBehavior.CACHE, 6, tag, RHIpdOnfgiYkEj.FvxM);
                                Utility.closeQuietly(inputStreamReader4);
                                return null;
                            }
                            hashSet.add(string2);
                            inputStreamReader = inputStreamReader4;
                            z10 = true;
                            inputStream = cache.get(string2, redirectContentTag);
                            string = string2;
                        } catch (IOException e10) {
                            e = e10;
                            inputStreamReader = inputStreamReader4;
                            Logger.Companion.log(LoggingBehavior.CACHE, 4, tag, "IOException when accessing cache: " + e.getMessage());
                        } catch (Throwable th) {
                            th = th;
                            inputStreamReader3 = inputStreamReader4;
                            Utility.closeQuietly(inputStreamReader3);
                            throw th;
                        }
                    } catch (IOException e11) {
                        e = e11;
                    }
                }
                if (z10) {
                    Uri uri2 = Uri.parse(string);
                    Utility.closeQuietly(inputStreamReader);
                    return uri2;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader3 = inputStreamReader2;
            }
        } catch (IOException e12) {
            e = e12;
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
        }
        Utility.closeQuietly(inputStreamReader);
        return null;
    }
}
