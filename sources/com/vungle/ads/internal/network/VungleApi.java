package com.vungle.ads.internal.network;

import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.ConfigPayload;
import java.util.Map;
import me.a0;

/* JADX INFO: compiled from: VungleApi.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface VungleApi {

    /* JADX INFO: compiled from: VungleApi.kt */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Call pingTPAT$default(VungleApi vungleApi, String str, String str2, HttpMethod httpMethod, Map map, a0 a0Var, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pingTPAT");
            }
            if ((i10 & 4) != 0) {
                httpMethod = HttpMethod.GET;
            }
            return vungleApi.pingTPAT(str, str2, httpMethod, (i10 & 8) != 0 ? null : map, (i10 & 16) != 0 ? null : a0Var);
        }
    }

    Call<AdPayload> ads(String str, String str2, CommonRequestBody commonRequestBody);

    Call<ConfigPayload> config(String str, String str2, CommonRequestBody commonRequestBody);

    Call<Void> pingTPAT(String str, String str2, HttpMethod httpMethod, Map<String, String> map, a0 a0Var);

    Call<Void> ri(String str, String str2, CommonRequestBody commonRequestBody);

    Call<Void> sendAdMarkup(String str, a0 a0Var);

    Call<Void> sendErrors(String str, String str2, a0 a0Var);

    Call<Void> sendMetrics(String str, String str2, a0 a0Var);
}
