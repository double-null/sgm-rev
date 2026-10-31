package ga;

import ga.b;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import java.util.Map;
import vb.c;
import vb.d;

/* JADX INFO: compiled from: AdObject.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface a<AdObjectParamsType extends b, UnifiedAdRequestParamsType extends vb.d, UnifiedAdCallbackType extends vb.c> {
    Map<String, Object> getCustomParams();

    AdObjectParamsType getParams();

    void hide();

    void load(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype, NetworkAdUnit networkAdUnit) throws Throwable;

    Boolean onClicked();

    void onClosed(boolean z10);

    void onDestroy();

    void onExpired();

    void onFinished();

    void onShowFailed();

    void onShown();
}
