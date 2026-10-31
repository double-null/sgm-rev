package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.p2;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.p;
import com.applovin.impl.v2;

/* JADX INFO: loaded from: classes.dex */
public class FullscreenAdService extends Service {
    public static final String DATA_KEY_RAW_FULL_AD_RESPONSE = "raw_full_ad_response";
    private static final String TAG = "FullscreenAdService";

    private static class b extends Handler {
        private b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                p2 p2Var = AppLovinFullscreenActivity.parentInterstitialWrapper;
                if (p2Var == null) {
                    if (!q7.a(1.0d)) {
                        super.handleMessage(message);
                        return;
                    }
                    throw new RuntimeException("parentWrapper is null for " + message.what);
                }
                com.applovin.impl.sdk.ad.b bVarF = p2Var.f();
                int i10 = message.what;
                c cVar = c.AD;
                if (i10 == cVar.b()) {
                    Bundle bundle = new Bundle();
                    bundle.putString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE, bVarF.getRawFullResponse());
                    Message messageObtain = Message.obtain((Handler) null, cVar.b());
                    messageObtain.setData(bundle);
                    try {
                        message.replyTo.send(messageObtain);
                        return;
                    } catch (RemoteException e10) {
                        p.c(FullscreenAdService.TAG, "Failed to respond to Fullscreen Activity in another process with ad", e10);
                        return;
                    }
                }
                if (message.what == c.AD_DISPLAYED.b()) {
                    v2.a(p2Var.c(), bVarF);
                    return;
                }
                if (message.what == c.AD_CLICKED.b()) {
                    v2.a(p2Var.b(), bVarF);
                    return;
                }
                if (message.what == c.AD_VIDEO_STARTED.b()) {
                    v2.a(p2Var.d(), bVarF);
                    return;
                }
                if (message.what == c.AD_VIDEO_ENDED.b()) {
                    Bundle data = message.getData();
                    v2.a(p2Var.d(), bVarF, data.getDouble("percent_viewed"), data.getBoolean("fully_watched"));
                    return;
                }
                if (message.what == c.AD_HIDDEN.b()) {
                    v2.b(p2Var.c(), bVarF);
                } else {
                    super.handleMessage(message);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public enum c {
        AD(0),
        AD_DISPLAYED(1),
        AD_CLICKED(2),
        AD_VIDEO_STARTED(3),
        AD_VIDEO_ENDED(4),
        AD_HIDDEN(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6025a;

        c(int i10) {
            this.f6025a = i10;
        }

        public int b() {
            return this.f6025a;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new Messenger(new b()).getBinder();
    }
}
