package ga;

import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.CreativeLoadingMethod;
import io.bidmachine.protobuf.rendering.Rendering;
import io.bidmachine.protobuf.sdk.ViewabilityConfiguration;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import oc.m;
import vb.k;

/* JADX INFO: compiled from: AdObjectParams.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mc.d f15544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<TrackEventType, List<String>> f15545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vb.a f15546c;

    public b(Ad ad2) {
        t.f(ad2, "ad");
        this.f15545b = new EnumMap(TrackEventType.class);
        this.f15546c = new vb.a();
        AdExtension adExtensionE = m.e(ad2);
        if (adExtensionE != null) {
            i(adExtensionE);
            ViewabilityConfiguration viewabilityConfiguration = adExtensionE.getViewabilityConfiguration();
            t.e(viewabilityConfiguration, "adExtension.viewabilityConfiguration");
            this.f15544a = m.O(viewabilityConfiguration);
        } else {
            this.f15544a = null;
        }
        Map<String, Value> fieldsMap = ad2.getExt().getFieldsMap();
        t.e(fieldsMap, "ad.ext.fieldsMap");
        j(fieldsMap);
        Map<String, Object> mapB = b();
        String id2 = ad2.getId();
        t.e(id2, "ad.id");
        mapB.put("creativeId", id2);
    }

    protected final void a(TrackEventType trackEventType, String str) {
        t.f(trackEventType, "trackEventType");
        oc.h.a(this.f15545b, trackEventType, str);
    }

    public final Map<String, Object> b() {
        Map<String, Object> mapQ = this.f15546c.q();
        t.e(mapQ, "unifiedMediationParams.params");
        return mapQ;
    }

    public final int c() {
        return d().j(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
    }

    public final k d() {
        return this.f15546c;
    }

    public final Map<TrackEventType, List<String>> e() {
        return this.f15545b;
    }

    public final int f() {
        return d().j(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
    }

    public abstract boolean g();

    protected final void h(List<Ad.Event> list) {
        oc.h.q(this.f15545b, list);
    }

    protected final void i(AdExtension adExtension) {
        t.f(adExtension, "adExtension");
        h(adExtension.getEventList());
        Map<String, Object> mapB = b();
        mapB.put("useNativeClose", Boolean.valueOf(adExtension.getUseNativeClose()));
        CreativeLoadingMethod creativeLoadingMethod = adExtension.getCreativeLoadingMethod();
        t.e(creativeLoadingMethod, "adExtension.creativeLoadingMethod");
        mapB.put("cacheControl", creativeLoadingMethod);
        mapB.put("placeholderTimeoutSec", Float.valueOf(adExtension.getPlaceholderTimeout()));
        mapB.put("skipOffset", Integer.valueOf(adExtension.getSkipoffset()));
        mapB.put("companionSkipOffset", Integer.valueOf(adExtension.getCompanionSkipoffset()));
        mapB.put("r1", Boolean.valueOf(adExtension.getR1()));
        mapB.put("r2", Boolean.valueOf(adExtension.getR2()));
        String storeUrl = adExtension.getStoreUrl();
        t.e(storeUrl, "adExtension.storeUrl");
        mapB.put("store_url", storeUrl);
        mapB.put("progress_duration", Integer.valueOf(adExtension.getProgressDuration()));
        AdExtension.ControlAsset closeButton = adExtension.getCloseButton();
        if (closeButton != null && closeButton != AdExtension.ControlAsset.getDefaultInstance()) {
            mapB.put("close_button_control_asset", closeButton);
        }
        AdExtension.ControlAsset countdown = adExtension.getCountdown();
        if (countdown != null && countdown != AdExtension.ControlAsset.getDefaultInstance()) {
            mapB.put("countdown_control_asset", countdown);
        }
        AdExtension.ControlAsset progress = adExtension.getProgress();
        if (progress != null && progress != AdExtension.ControlAsset.getDefaultInstance()) {
            mapB.put("progress_control_asset", progress);
        }
        Rendering renderingConfiguration = adExtension.getRenderingConfiguration();
        if (renderingConfiguration == null || renderingConfiguration == Rendering.getDefaultInstance()) {
            return;
        }
        mapB.put("rendering_configuration", renderingConfiguration);
    }

    protected final void j(Map<String, Value> extensionMap) {
        t.f(extensionMap, "extensionMap");
        Value value = extensionMap.get("omsdk_enabled");
        if (value == null) {
            return;
        }
        b().put("omsdk_enabled", Boolean.valueOf(value.getBoolValue()));
    }

    public final void k(int i10) {
        b().put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, Integer.valueOf(i10));
    }

    public final void l(int i10) {
        b().put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, Integer.valueOf(i10));
    }
}
