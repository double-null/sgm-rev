package com.vungle.ads.internal.omsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.vungle.ads.R;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.util.Logger;
import fd.b;
import fd.l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import rd.d;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: OMInjector.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class OMInjector {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "OMInjector";
    private AtomicReference<String> cachedOMSDKJS;
    private AtomicReference<String> cachedOMSessionJS;
    private final Context context;
    private final Handler uiHandler;

    /* JADX INFO: compiled from: OMInjector.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public OMInjector(Context context) {
        t.f(context, "context");
        this.context = context;
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.cachedOMSDKJS = new AtomicReference<>(null);
        this.cachedOMSessionJS = new AtomicReference<>(null);
    }

    private final String getOMSessionJS() {
        String str = this.cachedOMSessionJS.get();
        if (str != null) {
            return str;
        }
        String strLoadJsFromRaw = loadJsFromRaw(R.raw.omid_session_client_v1_6_2);
        this.cachedOMSessionJS.set(strLoadJsFromRaw);
        return strLoadJsFromRaw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-2, reason: not valid java name */
    public static final void m270init$lambda2(OMInjector this$0) {
        Object objC;
        t.f(this$0, "this$0");
        try {
            r.a aVar = r.f27774b;
            if (!n5.a.b()) {
                n5.a.a(this$0.context);
            }
            objC = r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        Throwable thG = r.g(objC);
        if (thG != null) {
            Logger.Companion.e(TAG, "error: " + thG.getLocalizedMessage());
        }
    }

    private final String loadJsFromRaw(int i10) {
        Object objC;
        try {
            r.a aVar = r.f27774b;
            InputStream inputStreamOpenRawResource = this.context.getResources().openRawResource(i10);
            t.e(inputStreamOpenRawResource, "context.resources.openRawResource(resId)");
            Reader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource, d.f24999b);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String strD = l.d(bufferedReader);
                b.a(bufferedReader, null);
                objC = r.c(strD);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    b.a(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th3));
        }
        return (String) (r.k(objC) ? null : objC);
    }

    private final File writeToFile(String str, File file) throws IOException {
        if (str == null) {
            throw new IOException("omsdk js must not be null");
        }
        FileWriter fileWriter = new FileWriter(file);
        try {
            fileWriter.write(str);
            fileWriter.flush();
            b.a(fileWriter, null);
            return file;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.a(fileWriter, th);
                throw th2;
            }
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getOMSDKJS$vungle_ads_release() {
        String str = this.cachedOMSDKJS.get();
        if (str != null) {
            return str;
        }
        String strLoadJsFromRaw = loadJsFromRaw(R.raw.omsdk_v1_6_2);
        this.cachedOMSDKJS.set(strLoadJsFromRaw);
        return strLoadJsFromRaw;
    }

    public final void init() {
        this.uiHandler.post(new Runnable() { // from class: com.vungle.ads.internal.omsdk.a
            @Override // java.lang.Runnable
            public final void run() {
                OMInjector.m270init$lambda2(this.f13081a);
            }
        });
    }

    public final List<File> injectJsFiles$vungle_ads_release(File dir) throws IOException {
        t.f(dir, "dir");
        ArrayList arrayList = new ArrayList();
        File file = new File(dir, Constants.OM_SDK_JS);
        if (!file.exists()) {
            Logger.Companion.d(TAG, "injecting omsdk.js to " + file.getAbsolutePath());
            String oMSDKJS$vungle_ads_release = getOMSDKJS$vungle_ads_release();
            if (oMSDKJS$vungle_ads_release != null) {
                writeToFile(oMSDKJS$vungle_ads_release, file);
            }
            arrayList.add(file);
        }
        File file2 = new File(dir, Constants.OM_SESSION_JS);
        if (!file2.exists()) {
            Logger.Companion.d(TAG, "injecting omsdk-session.js to " + file2.getAbsolutePath());
            String oMSessionJS = getOMSessionJS();
            if (oMSessionJS != null) {
                writeToFile(oMSessionJS, file2);
            }
            arrayList.add(file2);
        }
        return arrayList;
    }
}
