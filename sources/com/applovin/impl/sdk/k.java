package com.applovin.impl.sdk;

import android.os.Bundle;
import android.view.View;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.a3;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.d3;
import com.applovin.impl.e3;
import com.applovin.impl.f3;
import com.applovin.impl.f6;
import com.applovin.impl.g8;
import com.applovin.impl.j3;
import com.applovin.impl.k5;
import com.applovin.impl.k7;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y3;
import com.applovin.impl.z4;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.facebook.GraphResponse;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class k implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppLovinCommunicator f8425b;

    k(l lVar) {
        this.f8424a = lVar;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(l.p());
        this.f8425b = appLovinCommunicator;
        if (((Boolean) lVar.a(z4.f9375v7)).booleanValue()) {
            appLovinCommunicator.a(lVar);
            appLovinCommunicator.subscribe(this, k7.f7001a);
        }
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (b("safedk_init") && com.applovin.impl.j.c()) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8424a.k0());
            bundle.putString("applovin_random_token", this.f8424a.j0());
            bundle.putString("compass_random_token", this.f8424a.v());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(l.p()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z10));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(y3.b(this.f8424a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.f8424a.y0().e());
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject());
            if (!((Boolean) this.f8424a.a(z4.f9384w7)).booleanValue()) {
                JSONObject jSONObject4 = new JSONObject();
                JsonUtils.putBoolean(jSONObject4, "deactivated", true);
                JsonUtils.putJSONObject(jSONObject3, "safeDKDeactivation", jSONObject4);
            }
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            this.f8424a.Q();
            if (p.a()) {
                this.f8424a.Q().a("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle2, "safedk_init");
        }
    }

    public void b(String str, String str2) {
        if (b("user_info") && com.applovin.impl.j.c()) {
            Bundle bundle = new Bundle(2);
            bundle.putString("user_id", StringUtils.emptyIfNull(str));
            bundle.putString("applovin_random_token", str2);
            a(bundle, "user_info");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Map<String, Object> map;
        if (((Boolean) this.f8424a.a(z4.f9375v7)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map2 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString("id", "");
                if (!map2.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8424a.k0());
                }
                this.f8424a.h0().e(new com.applovin.impl.sdk.network.d.b().d(messageData.getString("url")).a(messageData.getString("backup_url")).b(stringMap).c(map2).a(stringMap2).a(((Boolean) this.f8424a.a(z4.f9319p5)).booleanValue()).b(string).a());
                return;
            }
            if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f8424a.l().addCustomQueryParams(q7.a((Map) BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
                    return;
                } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f8424a.l().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                    return;
                } else {
                    if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                        this.f8424a.Z().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                        return;
                    }
                    return;
                }
            }
            Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            String string2 = messageData2.getString("http_method", "POST");
            long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.f8424a.a(z4.f9308o3)).longValue();
            int i10 = messageData2.getInt("retry_count", ((Integer) this.f8424a.a(z4.f9317p3)).intValue());
            long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.f8424a.a(z4.f9326q3)).longValue();
            Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
            long j10 = millis2;
            if ("GET".equalsIgnoreCase(string2)) {
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f8424a.B().a((Map) null, false, false))));
                }
                millis = millis;
                i10 = i10;
                map = null;
            } else {
                map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    Map mapG = this.f8424a.B().G();
                    Map mapP = this.f8424a.B().p();
                    if (mapP.containsKey("idfv") && mapP.containsKey("idfv_scope")) {
                        String str = (String) mapP.get("idfv");
                        Integer num = (Integer) mapP.get("idfv_scope");
                        num.intValue();
                        mapP.remove("idfv");
                        mapP.remove("idfv_scope");
                        mapG.put("idfv", str);
                        mapG.put("idfv_scope", num);
                    }
                    mapG.put("server_installed_at", this.f8424a.a(z4.f9304o));
                    mapG.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8424a.k0());
                    map.put("app", mapG);
                    map.put(DeviceRequestsHelper.DEVICE_INFO_DEVICE, mapP);
                } else {
                    millis = millis;
                    i10 = i10;
                }
            }
            this.f8424a.s0().a((k5) new com.applovin.impl.o0(appLovinCommunicatorMessage.getPublisherId(), com.applovin.impl.sdk.network.a.a(this.f8424a).b(messageData2.getString("url")).a(messageData2.getString("backup_url")).b(stringMap3).c(string2).a((Map) BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(map != null ? new JSONObject(map) : null).c((int) millis).a(i10).b((int) j10).a((Object) new JSONObject()).a(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.f8424a), f6.b.OTHER);
        }
    }

    public void b(a3 a3Var, String str) {
        if (b("max_ad_events")) {
            Bundle bundleA = a(a3Var);
            bundleA.putString("type", str);
            this.f8424a.Q();
            if (p.a()) {
                this.f8424a.Q().a("CommunicatorService", "Sending \"max_ad_events\" message: " + bundleA);
            }
            a(bundleA, "max_ad_events");
        }
    }

    public void b(a3 a3Var) {
        if (b("max_revenue_events")) {
            Bundle bundleA = a(a3Var);
            bundleA.putAll(JsonUtils.toBundle(a3Var.S()));
            bundleA.putString("country_code", this.f8424a.w().getCountryCode());
            a(bundleA, "max_revenue_events");
        }
    }

    public void b(List list) {
        if (b("test_mode_networks_updated")) {
            if (list != null && !list.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("test_mode_networks", new ArrayList<>(list));
                a(bundle, "test_mode_networks_updated");
                return;
            }
            a(Bundle.EMPTY, "test_mode_networks_updated");
        }
    }

    public void a(a3 a3Var, String str) {
        if (b("ad_callback_blocked_after_hidden")) {
            Bundle bundleA = a(a3Var);
            bundleA.putString("callback_name", str);
            a(bundleA, "ad_callback_blocked_after_hidden");
        }
    }

    private boolean b(String str) {
        if (((Boolean) this.f8424a.a(z4.f9375v7)).booleanValue()) {
            return this.f8424a.c(z4.f9366u7).contains(str) || this.f8425b.hasSubscriber(str);
        }
        return false;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (b("adapter_initialization_status")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            a(bundle, "adapter_initialization_status");
        }
    }

    public void a() {
        if (b("privacy_setting_updated")) {
            a(new Bundle(), "privacy_setting_updated");
        }
    }

    public void a(String str, String str2) {
        if (b("network_sdk_version_updated")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public void a(List list) {
        if (b("live_networks_updated")) {
            if (list != null && !list.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("live_networks", new ArrayList<>(list));
                a(bundle, "live_networks_updated");
                return;
            }
            a(Bundle.EMPTY, "live_networks_updated");
        }
    }

    public void a(String str, String str2, String str3) {
        if (b("responses")) {
            String strMaybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String strMaybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", strMaybeConvertToIndentedString);
            bundle.putString("response", strMaybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(String str, String str2, int i10, Object obj, String str3, boolean z10) {
        if (b("receive_http_response")) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt("code", i10);
            bundle.putBundle(SDKConstants.PARAM_A2U_BODY, JsonUtils.toBundle(obj));
            bundle.putBoolean(GraphResponse.SUCCESS_KEY, z10);
            BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(Bundle bundle, String str) {
        if (b(str)) {
            this.f8425b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.f8424a.c(z4.f9366u7).contains(str)));
        }
    }

    public boolean a(String str) {
        return k7.f7001a.contains(str);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
    private Bundle a(a3 a3Var) {
        View viewV0;
        Bundle bundle = new Bundle();
        bundle.putString("id", a3Var.T());
        bundle.putString("network_name", a3Var.c());
        bundle.putString("max_ad_unit_id", a3Var.getAdUnitId());
        bundle.putString("third_party_ad_placement_id", a3Var.U());
        bundle.putString("ad_format", a3Var.getFormat().getLabel());
        BundleUtils.putStringIfValid("creative_id", a3Var.getCreativeId(), bundle);
        BundleUtils.putStringIfValid("adomain", a3Var.v(), bundle);
        BundleUtils.putStringIfValid("dsp_name", a3Var.getDspName(), bundle);
        if ("CUSTOM_NETWORK_SDK".equalsIgnoreCase(a3Var.c())) {
            bundle.putString("custom_sdk_network_name", a3Var.getNetworkName());
        }
        bundle.putAll(JsonUtils.toBundle(a3Var.y()));
        if (a3Var instanceof j3) {
            if (a3Var instanceof d3) {
                viewV0 = ((d3) a3Var).z();
            } else if (a3Var instanceof f3) {
                f3 f3Var = (f3) a3Var;
                if (f3Var.A0()) {
                    viewV0 = null;
                } else {
                    viewV0 = f3Var.v0() != null ? f3Var.v0() : f3Var.w0();
                }
            } else {
                viewV0 = null;
            }
            bundle.putString("ad_view", viewV0 != null ? g8.a(viewV0) : "N/A");
        } else if (a3Var instanceof e3) {
            Bundle bundle2 = ((e3) a3Var).t0().getBundle("applovin_ad_view_info");
            bundle.putString("ad_view", BundleUtils.getString("ad_view_address", "N/A", bundle2));
            bundle.putString("video_view", BundleUtils.getString("video_view_address", "N/A", bundle2));
        }
        return bundle;
    }
}
