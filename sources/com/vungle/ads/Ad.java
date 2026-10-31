package com.vungle.ads;

/* JADX INFO: compiled from: BaseAd.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface Ad {

    /* JADX INFO: compiled from: BaseAd.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void load$default(Ad ad2, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
            }
            if ((i10 & 1) != 0) {
                str = null;
            }
            ad2.load(str);
        }
    }

    Boolean canPlayAd();

    void load();

    void load(VungleCSBData vungleCSBData);

    void load(String str);
}
