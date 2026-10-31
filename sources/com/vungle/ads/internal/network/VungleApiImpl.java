package com.vungle.ads.internal.network;

import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.network.converters.EmptyResponseConverter;
import com.vungle.ads.internal.network.converters.JsonConverter;
import fe.d;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b0;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.v;
import me.a0;
import me.e;
import me.u;
import me.z;

/* JADX INFO: compiled from: VungleApiImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VungleApiImpl implements VungleApi {
    private static final String VUNGLE_VERSION = "7.1.0";
    private final EmptyResponseConverter emptyResponseConverter;
    private final e.a okHttpClient;
    public static final Companion Companion = new Companion(null);
    private static final kotlinx.serialization.json.b json = v.b(null, VungleApiImpl$Companion$json$1.INSTANCE, 1, null);

    /* JADX INFO: compiled from: VungleApiImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: VungleApiImpl.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            iArr[HttpMethod.GET.ordinal()] = 1;
            iArr[HttpMethod.POST.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VungleApiImpl(e.a okHttpClient) {
        t.f(okHttpClient, "okHttpClient");
        this.okHttpClient = okHttpClient;
        this.emptyResponseConverter = new EmptyResponseConverter();
    }

    private final z.a defaultBuilder(String str, String str2, String str3, Map<String, String> map) {
        z.a aVarA = new z.a().n(str2).a("User-Agent", str).a("Vungle-Version", VUNGLE_VERSION).a("Content-Type", "application/json");
        if (map != null) {
            aVarA.f(me.t.f22535b.g(map));
        }
        if (str3 != null) {
            aVarA.a("X-Vungle-Placement-Ref-Id", str3);
        }
        VungleHeader vungleHeader = VungleHeader.INSTANCE;
        String appVersion = vungleHeader.getAppVersion();
        if (appVersion != null) {
            aVarA.a("X-VUNGLE-APP-VERSION", appVersion);
        }
        String appId = vungleHeader.getAppId();
        if (appId != null) {
            aVarA.a("X-Vungle-App-Id", appId);
        }
        return aVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ z.a defaultBuilder$default(VungleApiImpl vungleApiImpl, String str, String str2, String str3, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            map = null;
        }
        return vungleApiImpl.defaultBuilder(str, str2, str3, map);
    }

    private final z.a defaultProtoBufBuilder(String str, u uVar) {
        z.a aVarA = new z.a().o(uVar).a("User-Agent", str).a("Vungle-Version", VUNGLE_VERSION).a("Content-Type", "application/x-protobuf");
        VungleHeader vungleHeader = VungleHeader.INSTANCE;
        String appId = vungleHeader.getAppId();
        if (appId != null) {
            aVarA.a("X-Vungle-App-Id", appId);
        }
        String appVersion = vungleHeader.getAppVersion();
        if (appVersion != null) {
            aVarA.a("X-VUNGLE-APP-VERSION", appVersion);
        }
        return aVarA;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<AdPayload> ads(String ua2, String path, CommonRequestBody body) {
        List<String> placements;
        t.f(ua2, "ua");
        t.f(path, "path");
        t.f(body, "body");
        try {
            kotlinx.serialization.json.b bVar = json;
            d<Object> dVarB = fe.u.b(bVar.a(), i0.j(CommonRequestBody.class));
            t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            String strB = bVar.b(dVarB, body);
            CommonRequestBody.RequestParam request = body.getRequest();
            return new OkHttpCall(this.okHttpClient.a(defaultBuilder$default(this, ua2, path, (request == null || (placements = request.getPlacements()) == null) ? null : (String) b0.P(placements), null, 8, null).h(a0.Companion.c(strB, null)).b()), new JsonConverter(i0.j(AdPayload.class)));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<ConfigPayload> config(String ua2, String path, CommonRequestBody body) {
        t.f(ua2, "ua");
        t.f(path, "path");
        t.f(body, "body");
        try {
            kotlinx.serialization.json.b bVar = json;
            d<Object> dVarB = fe.u.b(bVar.a(), i0.j(CommonRequestBody.class));
            t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return new OkHttpCall(this.okHttpClient.a(defaultBuilder$default(this, ua2, path, null, null, 12, null).h(a0.Companion.c(bVar.b(dVarB, body), null)).b()), new JsonConverter(i0.j(ConfigPayload.class)));
        } catch (Exception unused) {
            return null;
        }
    }

    public final e.a getOkHttpClient$vungle_ads_release() {
        return this.okHttpClient;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> pingTPAT(String ua2, String url, HttpMethod requestType, Map<String, String> map, a0 a0Var) {
        z zVarB;
        t.f(ua2, "ua");
        t.f(url, "url");
        t.f(requestType, "requestType");
        z.a aVarDefaultBuilder$default = defaultBuilder$default(this, ua2, url, null, map, 4, null);
        int i10 = WhenMappings.$EnumSwitchMapping$0[requestType.ordinal()];
        if (i10 == 1) {
            zVarB = aVarDefaultBuilder$default.c().b();
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (a0Var == null) {
                a0Var = a0.a.o(a0.Companion, new byte[0], null, 0, 0, 6, null);
            }
            zVarB = aVarDefaultBuilder$default.h(a0Var).b();
        }
        return new OkHttpCall(this.okHttpClient.a(zVarB), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> ri(String ua2, String path, CommonRequestBody body) {
        t.f(ua2, "ua");
        t.f(path, "path");
        t.f(body, "body");
        try {
            kotlinx.serialization.json.b bVar = json;
            d<Object> dVarB = fe.u.b(bVar.a(), i0.j(CommonRequestBody.class));
            t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return new OkHttpCall(this.okHttpClient.a(defaultBuilder$default(this, ua2, path, null, null, 12, null).h(a0.Companion.c(bVar.b(dVarB, body), null)).b()), this.emptyResponseConverter);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> sendAdMarkup(String path, a0 requestBody) {
        t.f(path, "path");
        t.f(requestBody, "requestBody");
        return new OkHttpCall(this.okHttpClient.a(defaultBuilder$default(this, "debug", u.f22538k.d(path).j().a().toString(), null, null, 12, null).h(requestBody).b()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> sendErrors(String ua2, String path, a0 requestBody) {
        t.f(ua2, "ua");
        t.f(path, "path");
        t.f(requestBody, "requestBody");
        return new OkHttpCall(this.okHttpClient.a(defaultProtoBufBuilder(ua2, u.f22538k.d(path).j().a()).h(requestBody).b()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> sendMetrics(String ua2, String path, a0 requestBody) {
        t.f(ua2, "ua");
        t.f(path, "path");
        t.f(requestBody, "requestBody");
        return new OkHttpCall(this.okHttpClient.a(defaultProtoBufBuilder(ua2, u.f22538k.d(path).j().a()).h(requestBody).b()), this.emptyResponseConverter);
    }
}
