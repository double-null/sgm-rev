package com.applovin.impl.sdk;

import android.os.Process;
import android.text.TextUtils;
import com.applovin.impl.f2;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.z4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AppLovinExceptionHandler f8216e = new AppLovinExceptionHandler();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f8217a = new HashSet(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f8218b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f8219c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f8220d;

    private String a(Throwable th, int i10) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        return TextUtils.join("\n", (StackTraceElement[]) Arrays.copyOf(stackTrace, Math.min(i10, stackTrace.length)));
    }

    public static AppLovinExceptionHandler shared() {
        return f8216e;
    }

    public void addSdk(l lVar) {
        if (this.f8217a.contains(lVar)) {
            return;
        }
        this.f8217a.add(lVar);
    }

    public void enable() {
        if (this.f8218b.compareAndSet(false, true)) {
            this.f8220d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (this.f8219c.getAndSet(true)) {
            Process.killProcess(Process.myPid());
            System.exit(1);
            return;
        }
        long jLongValue = 500;
        for (l lVar : this.f8217a) {
            lVar.Q();
            if (p.a()) {
                lVar.Q().a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", th.toString());
            Integer num = (Integer) lVar.a(z4.M6);
            if (num.intValue() > 0) {
                mapHashMap.put("details", a(th, num.intValue()));
            }
            lVar.E().d(f2.Y0, mapHashMap);
            lVar.G().trackEventSynchronously("paused");
            jLongValue = ((Long) lVar.a(z4.f9344s3)).longValue();
        }
        try {
            Thread.sleep(jLongValue);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f8220d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
