package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.u6;
import com.applovin.impl.w4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", "paused", "resumed", "cf_start", "tos_ok", "gdpr_ok");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f8238b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deque f8239c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f8240d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f8241e;

    public EventServiceImpl(l lVar) {
        this.f8237a = lVar;
    }

    private void c(final String str, final Map map, final Map map2) {
        if (map.containsKey("items")) {
            Object obj = map.get("items");
            if (!(obj instanceof List)) {
                a(str, map, map2, "Invalid 'items' value: expected a list.");
                a("Invalid 'items' value: expected a list.");
                return;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Map)) {
                    a(str, map, map2, "Invalid element in 'items': expected a map.");
                    a("Invalid element in 'items': expected a map.");
                    return;
                }
            }
        }
        a(str, map, map2, "");
        this.f8237a.s0().a((k5) new u6(this.f8237a, false, "track_event:" + str, new Runnable() { // from class: com.applovin.impl.sdk.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f8734a.b(str, map, map2);
            }
        }), f6.b.OTHER);
    }

    private String d() {
        return ((String) this.f8237a.a(z4.f9314p0)) + "4.0/pix";
    }

    public void clearTrackedAxonEvents() {
        synchronized (this.f8240d) {
            this.f8239c.clear();
        }
    }

    public List<com.applovin.impl.f0> getTrackedAxonEvents() {
        ArrayList arrayList;
        synchronized (this.f8240d) {
            arrayList = new ArrayList(this.f8239c);
        }
        return arrayList;
    }

    public boolean isAxonEventTracked() {
        return this.f8241e;
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f8238b.compareAndSet(false, true)) {
            this.f8237a.G().trackEvent("landing");
        }
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        map2.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    public void trackEventSynchronously(String str) {
        this.f8237a.Q();
        if (p.a()) {
            this.f8237a.Q().a("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        com.applovin.impl.t1 t1Var = new com.applovin.impl.t1(str, new HashMap());
        boolean zContains = this.f8237a.c(z4.f9402z0).contains(t1Var.c());
        Map mapA = a(t1Var, true, zContains);
        HashMap map = new HashMap(t1Var.d());
        if (((Boolean) this.f8237a.a(z4.J5)).booleanValue() || ((Boolean) this.f8237a.a(z4.E5)).booleanValue()) {
            map.putAll(mapA);
            mapA = null;
        }
        this.f8237a.h0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).b(mapA).c(map).a(a(t1Var, zContains)).c(((Boolean) this.f8237a.a(z4.U5)).booleanValue()).a(((Boolean) this.f8237a.a(z4.f9319p5)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            p.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            this.f8237a.E().a("AppLovinEventService", "trackIAP", th);
        }
        trackEvent(AppLovinEventTypes.USER_COMPLETED_IN_APP_PURCHASE, map2);
    }

    private void a(final String str, final Map map) {
        final boolean zContains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        this.f8237a.s0().a((k5) new u6(this.f8237a, zContains, "submitTrackEventPostback", new Runnable() { // from class: com.applovin.impl.sdk.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f8738a.a(str, map, zContains);
            }
        }), f6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, Map map, Map map2) {
        Map map3 = CollectionUtils.map("AppLovin-Event", str);
        map3.put("AppLovin-SDK-Name", "AppLovin-MAX");
        com.applovin.impl.sdk.network.d.b bVarD = com.applovin.impl.sdk.network.d.b().d(b()).a(a()).a(map3).c(a(str, map, map2)).a(((Boolean) this.f8237a.a(z4.f9319p5)).booleanValue()).a(w4.a.a(((Integer) this.f8237a.a(z4.A5)).intValue())).d(false);
        if (this.f8237a.u0().c()) {
            bVarD.b(CollectionUtils.map("axon_test_code", AppEventsConstants.EVENT_PARAM_VALUE_YES));
        }
        this.f8237a.h0().e(bVarD.a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map) {
        trackEvent(str, map, new HashMap());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map, Map<String, Object> map2) {
        if (TextUtils.isEmpty(str)) {
            a("Unable to track empty event");
        } else if (this.f8237a.c(z4.A0).contains(str)) {
            c(str, map, map2);
        } else {
            a(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Map map, boolean z10) {
        com.applovin.impl.t1 t1Var = new com.applovin.impl.t1(str, map);
        boolean zContains = this.f8237a.c(z4.f9402z0).contains(t1Var.c());
        Map mapA = a(t1Var, false, zContains);
        HashMap map2 = new HashMap(t1Var.d());
        if (((Boolean) this.f8237a.a(z4.J5)).booleanValue() || ((Boolean) this.f8237a.a(z4.E5)).booleanValue()) {
            map2.putAll(mapA);
            mapA = null;
        }
        this.f8237a.h0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).a(a(t1Var, zContains)).b(mapA).c(map2).c(((Boolean) this.f8237a.a(z4.U5)).booleanValue()).a(((Boolean) this.f8237a.a(z4.f9319p5)).booleanValue()).d(z10).a(w4.a.a(((Integer) this.f8237a.a(z4.f9407z5)).intValue())).a());
    }

    private String c() {
        return ((String) this.f8237a.a(z4.f9323q0)) + "4.0/pix";
    }

    private String b() {
        return ((String) this.f8237a.a(z4.f9332r0)) + "v1/app";
    }

    private void a(String str) {
        p.h("AppLovinEventService", str);
        if (q7.c(this.f8237a)) {
            throw new IllegalArgumentException(str);
        }
    }

    private Map a(com.applovin.impl.t1 t1Var, boolean z10, boolean z11) {
        Map mapA = this.f8237a.B().a((Map) null, z10, false);
        mapA.put("event_id", t1Var.b());
        mapA.put("ts", Long.toString(t1Var.a()));
        if (z11) {
            mapA.put("event", t1Var.c());
        } else {
            mapA.put("event", "postinstall");
            mapA.put("sub_event", t1Var.c());
        }
        return q7.a(mapA);
    }

    private Map a(com.applovin.impl.t1 t1Var, boolean z10) {
        HashMap map = new HashMap();
        if (z10) {
            map.put("AppLovin-Event", t1Var.c());
        } else {
            map.put("AppLovin-Event", "postinstall");
            map.put("AppLovin-Sub-Event", t1Var.c());
        }
        return map;
    }

    private Map a(String str, Map map, Map map2) {
        HashMap map3 = new HashMap();
        com.applovin.impl.t1 t1Var = new com.applovin.impl.t1(str, map);
        map3.put("id", t1Var.b());
        map3.put("name", t1Var.c());
        map3.put("data", t1Var.d());
        map3.put(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, com.applovin.impl.j1.a(t1Var.a()));
        Map mapG = this.f8237a.B().G();
        map3.put("app_info", mapG);
        map3.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, this.f8237a.B().p());
        CollectionUtils.putObjectToStringIfValid("dedupe_id", map2.get("dedupe_id"), map3);
        HashMap map4 = new HashMap();
        map4.put("connectEventKey", this.f8237a.r());
        CollectionUtils.putStringIfValid("eventId", this.f8237a.F(), map4);
        map4.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, AppLovinSdk.VERSION);
        map4.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8237a.k0());
        map4.put("platform", this.f8237a.B().A());
        if (((Boolean) this.f8237a.a(z4.P3)).booleanValue()) {
            CollectionUtils.putStringIfValid("art", this.f8237a.s(), map4);
        }
        HashMap map5 = new HashMap();
        map5.put("firstVisitTs", mapG.get("ia_v2"));
        map5.put("lastVisitTs", mapG.get("last_launch_ms"));
        map5.put("visitCount", mapG.get("app_launch_count"));
        map5.put("currentVisitStartTs", mapG.get("alts_ms"));
        map4.put("visitInfo", map5);
        map3.put("axon", map4);
        return map3;
    }

    private void a(String str, Map map, Map map2, String str2) {
        com.applovin.impl.f0 f0Var = new com.applovin.impl.f0(str, map, map2, str2);
        synchronized (this.f8240d) {
            if (this.f8239c.size() == ((Integer) this.f8237a.a(z4.B0)).intValue()) {
                this.f8239c.pollLast();
            }
            this.f8239c.addFirst(f0Var);
        }
        this.f8241e = true;
    }

    private String a() {
        return ((String) this.f8237a.a(z4.f9341s0)) + "v1/app";
    }
}
