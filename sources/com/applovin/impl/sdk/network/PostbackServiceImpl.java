package com.applovin.impl.sdk.network;

import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.s5;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.l;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8566a;

    public PostbackServiceImpl(l lVar) {
        this.f8566a = lVar;
    }

    private boolean a(e eVar) {
        Map mapI = eVar.i();
        if (mapI == null) {
            return false;
        }
        Object obj = mapI.get("event");
        if ("postinstall".equals(obj)) {
            obj = mapI.get("sub_event");
        }
        return EventServiceImpl.ALLOW_PRE_INIT_EVENT_TYPES.contains(obj);
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(e.b(this.f8566a).b(str).a(false).a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(eVar, f6.b.OTHER, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }

    public void dispatchPostbackRequest(e eVar, f6.b bVar, AppLovinPostbackListener appLovinPostbackListener) {
        s5 s5Var = new s5(eVar, bVar, this.f8566a, appLovinPostbackListener);
        s5Var.a(a(eVar));
        this.f8566a.s0().a((k5) s5Var, bVar);
    }
}
