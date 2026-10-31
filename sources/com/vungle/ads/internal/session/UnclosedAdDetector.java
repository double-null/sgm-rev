package com.vungle.ads.internal.session;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.FutureResult;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import fe.d;
import fe.u;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.v;
import pd.m;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: UnclosedAdDetector.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class UnclosedAdDetector {
    private static final String FILENAME = "unclosed_ad";
    private final Context context;
    private final Executors executors;
    private File file;
    private final PathProvider pathProvider;
    private boolean ready;
    private final String sessionId;
    private final CopyOnWriteArrayList<UnclosedAd> unclosedAdList;
    public static final Companion Companion = new Companion(null);
    private static final kotlinx.serialization.json.b json = v.b(null, UnclosedAdDetector$Companion$json$1.INSTANCE, 1, null);

    /* JADX INFO: compiled from: UnclosedAdDetector.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public UnclosedAdDetector(Context context, String sessionId, Executors executors, PathProvider pathProvider) {
        Object objC;
        boolean zN;
        t.f(context, "context");
        t.f(sessionId, "sessionId");
        t.f(executors, "executors");
        t.f(pathProvider, "pathProvider");
        this.context = context;
        this.sessionId = sessionId;
        this.executors = executors;
        this.pathProvider = pathProvider;
        this.file = pathProvider.getUnclosedAdFile(FILENAME);
        this.unclosedAdList = new CopyOnWriteArrayList<>();
        if (this.file.exists()) {
            zN = true;
        } else {
            try {
                r.a aVar = r.f27774b;
                objC = r.c(Boolean.valueOf(this.file.createNewFile()));
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                objC = r.c(s.a(th));
            }
            Throwable thG = r.g(objC);
            if (thG != null) {
                Logger.Companion.e("UnclosedAdDetector", "Fail to create unclosed ad file: " + thG.getMessage());
            }
            zN = r.n(objC);
        }
        this.ready = zN;
    }

    private final /* synthetic */ <T> T decodeJson(String str) {
        kotlinx.serialization.json.b bVar = json;
        le.c cVarA = bVar.a();
        t.k(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        d<Object> dVarB = u.b(cVarA, null);
        t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (T) bVar.c(dVarB, str);
    }

    private final List<UnclosedAd> readUnclosedAdFromFile() {
        return !this.ready ? kotlin.collections.t.k() : (List) new FutureResult(this.executors.getIoExecutor().submit(new Callable() { // from class: com.vungle.ads.internal.session.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UnclosedAdDetector.m283readUnclosedAdFromFile$lambda4(this.f13095a);
            }
        })).get(1000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readUnclosedAdFromFile$lambda-4, reason: not valid java name */
    public static final List m283readUnclosedAdFromFile$lambda4(UnclosedAdDetector this$0) {
        t.f(this$0, "this$0");
        try {
            String string = FileUtility.INSTANCE.readString(this$0.file);
            if (string == null || string.length() == 0) {
                return new ArrayList();
            }
            kotlinx.serialization.json.b bVar = json;
            d<Object> dVarB = u.b(bVar.a(), i0.k(List.class, m.f24255c.a(i0.j(UnclosedAd.class))));
            t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return (List) bVar.c(dVarB, string);
        } catch (Exception e10) {
            Logger.Companion.e("UnclosedAdDetector", "Fail to read unclosed ad file " + e10.getMessage());
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: retrieveUnclosedAd$lambda-3, reason: not valid java name */
    public static final void m284retrieveUnclosedAd$lambda3(UnclosedAdDetector this$0) {
        t.f(this$0, "this$0");
        try {
            FileUtility.deleteAndLogIfFailed(this$0.file);
        } catch (Exception e10) {
            Logger.Companion.e("UnclosedAdDetector", "Fail to delete file " + e10.getMessage());
        }
    }

    private final void writeUnclosedAdToFile(List<UnclosedAd> list) {
        if (this.ready) {
            try {
                kotlinx.serialization.json.b bVar = json;
                d<Object> dVarB = u.b(bVar.a(), i0.k(List.class, m.f24255c.a(i0.j(UnclosedAd.class))));
                t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                final String strB = bVar.b(dVarB, list);
                this.executors.getIoExecutor().execute(new Runnable() { // from class: com.vungle.ads.internal.session.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        UnclosedAdDetector.m285writeUnclosedAdToFile$lambda5(this.f13093a, strB);
                    }
                });
            } catch (Throwable th) {
                Logger.Companion.e("UnclosedAdDetector", "Fail to write unclosed ad file " + th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeUnclosedAdToFile$lambda-5, reason: not valid java name */
    public static final void m285writeUnclosedAdToFile$lambda5(UnclosedAdDetector this$0, String jsonContent) {
        t.f(this$0, "this$0");
        t.f(jsonContent, "$jsonContent");
        FileUtility.INSTANCE.writeString(this$0.file, jsonContent);
    }

    public final void addUnclosedAd(UnclosedAd ad2) {
        t.f(ad2, "ad");
        if (this.ready) {
            ad2.setSessionId(this.sessionId);
            this.unclosedAdList.add(ad2);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final Executors getExecutors() {
        return this.executors;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    public final void removeUnclosedAd(UnclosedAd ad2) {
        t.f(ad2, "ad");
        if (this.ready && this.unclosedAdList.contains(ad2)) {
            this.unclosedAdList.remove(ad2);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    public final List<UnclosedAd> retrieveUnclosedAd() {
        ArrayList arrayList = new ArrayList();
        if (!this.ready) {
            return arrayList;
        }
        List<UnclosedAd> unclosedAdFromFile = readUnclosedAdFromFile();
        if (unclosedAdFromFile != null) {
            arrayList.addAll(unclosedAdFromFile);
        }
        this.executors.getIoExecutor().execute(new Runnable() { // from class: com.vungle.ads.internal.session.a
            @Override // java.lang.Runnable
            public final void run() {
                UnclosedAdDetector.m284retrieveUnclosedAd$lambda3(this.f13092a);
            }
        });
        return arrayList;
    }
}
