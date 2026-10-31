package io.bidmachine;

import android.content.Context;
import android.view.ViewGroup;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.ViewAd;
import io.bidmachine.ViewAdObject;
import vb.d;
import ze.tmM.zKUlck;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ViewAd<AdType extends ViewAd<AdType, AdRequestType, AdObjectType, UnifiedAdRequestParamsType, AdListenerType>, AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, AdObjectType extends ViewAdObject<AdRequestType, ?, UnifiedAdRequestParamsType>, UnifiedAdRequestParamsType extends vb.d, AdListenerType extends AdListener<AdType>> extends BidMachineAd<AdType, AdRequestType, AdObjectType, ga.b, UnifiedAdRequestParamsType, AdListenerType> {
    protected ViewAd(Context context, AdsType adsType) {
        super(context, adsType);
    }

    void hide() {
        AdObjectType loadedAdObject = getLoadedAdObject();
        if (loadedAdObject == null) {
            return;
        }
        loadedAdObject.hide();
    }

    @Override // io.bidmachine.BidMachineAd
    public boolean isDuplicateShowDisabled() {
        return false;
    }

    void show(ViewGroup viewGroup) {
        AdObjectType adobjecttypePrepareShow = prepareShow();
        if (adobjecttypePrepareShow == null) {
            return;
        }
        try {
            adobjecttypePrepareShow.show(viewGroup, this.rendererConfiguration);
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            processShowFail(oc.a.l(zKUlck.VJfuOrqhEV, th));
        }
    }
}
