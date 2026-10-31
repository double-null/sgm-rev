package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.applovin.impl.f2;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.z4;
import com.facebook.share.internal.ShareConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class i implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f8400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f8401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f8402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicLong f8403e = new AtomicLong(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f8404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f8405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f8406h;

    private enum b {
        INELIGIBLE,
        IDLE,
        MONITORING
    }

    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (i.this.f8400b.get() != b.MONITORING) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - i.this.f8403e.get();
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= i.this.f8404f) {
                i.this.f8402d.postDelayed(this, i.this.f8406h);
                return;
            }
            i.this.f8400b.set(b.INELIGIBLE);
            AppLovinBroadcastManager.unregisterReceiver(i.this);
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (stackTrace.length > 0) {
                StackTraceElement stackTraceElement = stackTrace[0];
                str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str = "None";
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - l.o());
            HashMap map = new HashMap(3);
            map.put("top_main_method", str);
            map.put(ShareConstants.FEED_SOURCE_PARAM, i.this.f8399a.B0() ? "non_first_session" : "first_session");
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "seconds_since_app_launch", String.valueOf(seconds));
            List listA = i.this.f8399a.h().a();
            if (!CollectionUtils.isEmpty(listA)) {
                JsonUtils.putJsonArray(jSONObject, "ad_info", new JSONArray((Collection) listA));
            }
            map.put("details", jSONObject.toString());
            i.this.f8399a.E().d(f2.O0, map);
        }
    }

    private class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i.this.f8400b.get() != b.MONITORING) {
                return;
            }
            i.this.f8403e.set(System.currentTimeMillis());
            i.this.f8401c.postDelayed(this, i.this.f8405g);
        }
    }

    public i(l lVar) {
        this.f8399a = lVar;
        this.f8400b = new AtomicReference(q7.c(lVar) ^ true ? b.IDLE : b.INELIGIBLE);
        this.f8401c = new Handler(l.p().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:anr_detector");
        handlerThread.start();
        this.f8402d = new Handler(handlerThread.getLooper());
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    private void b() {
        if (i0.a(this.f8400b, b.MONITORING, b.IDLE)) {
            this.f8401c.removeCallbacksAndMessages(null);
            this.f8402d.removeCallbacksAndMessages(null);
        }
        this.f8399a.h().b(this);
    }

    private void c() {
        if (((Boolean) this.f8399a.a(z4.f9284l6)).booleanValue() && this.f8399a.o0().getCurrentApplicationState() == SessionTracker.e.PAUSED) {
            return;
        }
        if (i0.a(this.f8400b, b.IDLE, b.MONITORING)) {
            this.f8401c.post(new d());
            this.f8402d.postDelayed(new c(), this.f8406h / 2);
        }
        this.f8399a.h().a(this);
    }

    private void d() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f8404f = ((Long) this.f8399a.a(z4.f9257i6)).longValue();
        this.f8405g = ((Long) this.f8399a.a(z4.f9266j6)).longValue();
        this.f8406h = ((Long) this.f8399a.a(z4.f9275k6)).longValue();
        if (((Boolean) this.f8399a.a(z4.f9284l6)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
        }
    }

    public void a() {
        if (this.f8400b.get() == b.INELIGIBLE) {
            return;
        }
        if (!((Boolean) this.f8399a.a(z4.f9248h6)).booleanValue()) {
            b();
        } else {
            d();
            c();
        }
    }
}
