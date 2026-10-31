package io.bidmachine;

import com.explorestack.protobuf.Struct;
import java.util.LinkedHashMap;
import java.util.Map;
import rd.PSo.cNMUz;

/* JADX INFO: compiled from: CustomParams.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CustomParams {
    private final Map<String, Object> customMap = new LinkedHashMap();

    /* JADX INFO: renamed from: addParams, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m330addParams(Map map) {
        return addParams((Map<String, String>) map);
    }

    public final void fillStructBuilder(Struct.Builder builder) {
        kotlin.jvm.internal.t.f(builder, "builder");
        oc.h.f(builder, this.customMap);
    }

    public CustomParams addParams(Map<String, String> params) {
        kotlin.jvm.internal.t.f(params, "params");
        this.customMap.putAll(params);
        return this;
    }

    /* JADX INFO: renamed from: addParam, reason: merged with bridge method [inline-methods] */
    public CustomParams m328addParam(String key, String value) {
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(value, "value");
        this.customMap.put(key, value);
        return this;
    }

    /* JADX INFO: renamed from: addParam, reason: merged with bridge method [inline-methods] */
    public CustomParams m327addParam(String key, int i10) {
        kotlin.jvm.internal.t.f(key, "key");
        this.customMap.put(key, Integer.valueOf(i10));
        return this;
    }

    /* JADX INFO: renamed from: addParam, reason: merged with bridge method [inline-methods] */
    public CustomParams m326addParam(String key, float f10) {
        kotlin.jvm.internal.t.f(key, "key");
        this.customMap.put(key, Float.valueOf(f10));
        return this;
    }

    /* JADX INFO: renamed from: addParam, reason: merged with bridge method [inline-methods] */
    public CustomParams m325addParam(String key, double d10) {
        kotlin.jvm.internal.t.f(key, "key");
        this.customMap.put(key, Double.valueOf(d10));
        return this;
    }

    /* JADX INFO: renamed from: addParam, reason: merged with bridge method [inline-methods] */
    public CustomParams m329addParam(String str, boolean z10) {
        kotlin.jvm.internal.t.f(str, cNMUz.HDhxE);
        this.customMap.put(str, Boolean.valueOf(z10));
        return this;
    }
}
