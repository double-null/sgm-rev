package a7;

import android.text.TextUtils;
import com.explorestack.protobuf.adcom.Ad;

/* JADX INFO: compiled from: IabAdObjectParams.java */
/* JADX INFO: loaded from: classes4.dex */
class h extends ga.b {
    h(Ad ad2) {
        super(ad2);
    }

    @Override // ga.b
    public boolean g() {
        Object obj = b().get("creativeAdm");
        return (obj instanceof CharSequence) && !TextUtils.isEmpty((CharSequence) obj);
    }

    void m(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b().put("creativeAdm", str);
    }
}
