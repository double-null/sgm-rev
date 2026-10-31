package ha;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachineAd;
import io.bidmachine.ContextProvider;
import io.bidmachine.ImageData;
import io.bidmachine.NetworkAdapter;
import java.util.Set;
import ka.o;

/* JADX INFO: compiled from: NativeAd.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends BidMachineAd<b, n, f, ga.b, vb.n, Object> implements m {
    public b(Context context) {
        super(context, AdsType.Native);
    }

    private boolean i() {
        if (getLoadedAdObject() != null) {
            return true;
        }
        log("not loaded, please load ads first");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.BidMachineAd
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public f createAdObject(ContextProvider contextProvider, n nVar, NetworkAdapter networkAdapter, ga.b bVar, AdProcessCallback adProcessCallback) {
        vb.l lVarCreateNativeAd = networkAdapter.createNativeAd();
        if (lVarCreateNativeAd == null) {
            return null;
        }
        return new f(contextProvider, adProcessCallback, nVar, bVar, lVarCreateNativeAd);
    }

    public String e() {
        if (i()) {
            return getLoadedAdObject().C();
        }
        return null;
    }

    public String f() {
        if (i()) {
            return getLoadedAdObject().E();
        }
        return null;
    }

    public View g(Context context) {
        if (i()) {
            return getLoadedAdObject().F(context);
        }
        return null;
    }

    @Override // ha.m
    public ImageData getIcon() {
        if (i()) {
            return getLoadedAdObject().getIcon();
        }
        return null;
    }

    @Override // ha.m
    public ImageData getMainImage() {
        if (i()) {
            return getLoadedAdObject().getMainImage();
        }
        return null;
    }

    public String h() {
        if (i()) {
            return getLoadedAdObject().H();
        }
        return null;
    }

    @Override // io.bidmachine.BidMachineAd
    public boolean isDuplicateShowDisabled() {
        return false;
    }

    public void j(ViewGroup viewGroup, View view, o oVar, Set<View> set) {
        f fVarPrepareShow = prepareShow();
        if (fVarPrepareShow == null) {
            return;
        }
        fVarPrepareShow.N(viewGroup, view, oVar, set, this.rendererConfiguration);
    }

    public void l() {
        if (i()) {
            getLoadedAdObject().S();
        }
    }
}
