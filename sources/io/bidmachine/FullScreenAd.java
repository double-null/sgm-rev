package io.bidmachine;

import android.content.Context;
import io.bidmachine.AdListener;
import io.bidmachine.FullScreenAd;
import io.bidmachine.FullScreenAdObject;
import io.bidmachine.FullScreenAdRequest;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FullScreenAd<SelfType extends FullScreenAd<SelfType, AdRequestType, AdObjectType, ListenerType>, AdRequestType extends FullScreenAdRequest<AdRequestType>, AdObjectType extends FullScreenAdObject<AdRequestType>, ListenerType extends AdListener<SelfType>> extends BidMachineAd<SelfType, AdRequestType, AdObjectType, ga.b, vb.j, ListenerType> {
    protected FullScreenAd(Context context, AdsType adsType) {
        super(context, adsType);
    }

    private void resetTracked() {
        this.isFinishTracked.set(false);
        this.isCloseTracked.set(false);
    }

    @Override // io.bidmachine.BidMachineAd
    public boolean isDuplicateShowDisabled() {
        return true;
    }

    public void show() {
        AdObjectType adobjecttypePrepareShow = prepareShow();
        if (adobjecttypePrepareShow == null) {
            return;
        }
        try {
            resetTracked();
            adobjecttypePrepareShow.show(getContextProvider(), this.rendererConfiguration);
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            processShowFail(oc.a.l("Exception showing fullscreen object", th));
        }
    }
}
