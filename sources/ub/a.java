package ub;

import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import java.util.Map;
import kotlin.jvm.internal.t;
import oc.m;

/* JADX INFO: compiled from: EventData.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Double f26693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Struct.Builder f26694d;

    private final Struct.Builder g() {
        Struct.Builder builder = this.f26694d;
        if (builder != null) {
            return builder;
        }
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        this.f26694d = builderNewBuilder;
        t.e(builderNewBuilder, "newBuilder().also {\n    …amsBuilder = it\n        }");
        return builderNewBuilder;
    }

    public final a a(String key, Object obj) {
        t.f(key, "key");
        Struct.Builder builderG = g();
        Value valueH = m.H(obj);
        if (valueH != null) {
            builderG.putFields(key, valueH);
        }
        return this;
    }

    public final a b(Map<String, ? extends Object> map) {
        Struct.Builder builderG = g();
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                Value valueH = m.H(entry.getValue());
                if (valueH != null) {
                    builderG.putFields(entry.getKey(), valueH);
                }
            }
        }
        return this;
    }

    public final Struct c() {
        Struct.Builder builder = this.f26694d;
        if (builder != null) {
            return builder.build();
        }
        return null;
    }

    public final String d() {
        return this.f26692b;
    }

    public final Double e() {
        return this.f26693c;
    }

    public final boolean f() {
        return this.f26691a;
    }

    public final a h(String key, String value) {
        t.f(key, "key");
        t.f(value, "value");
        g().putFields(key, m.x(value));
        return this;
    }

    public final a i(Map<String, ? extends Object> map) {
        this.f26694d = m.F(map);
        return this;
    }

    public final a j(boolean z10) {
        this.f26691a = z10;
        return this;
    }

    public final a k(String str) {
        this.f26692b = str;
        return this;
    }

    public final a l(Double d10) {
        this.f26693c = d10;
        return this;
    }
}
