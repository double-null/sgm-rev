package io.bidmachine.analytics.internal.E;

import com.explorestack.protobuf.BoolValue;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.BytesValue;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.Value;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Map;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final Timestamp a(long j10) {
        long j11 = 1000;
        return Timestamp.newBuilder().setSeconds(j10 / j11).setNanos((int) ((j10 % j11) * ((long) 1000000))).build();
    }

    public static final BytesValue b(String str) {
        return a(a(str));
    }

    public static final StringValue c(String str) {
        return StringValue.newBuilder().setValue(str).build();
    }

    public static final BoolValue a(boolean z10) {
        return BoolValue.newBuilder().setValue(z10).build();
    }

    public static final Struct a(Map map) {
        Value.Builder numberValue;
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            try {
                r.a aVar = r.f27774b;
                String strValueOf = String.valueOf(key);
                if (value instanceof List) {
                    numberValue = Value.newBuilder().setListValue(a((List) value));
                } else if (value instanceof Map) {
                    numberValue = Value.newBuilder().setStructValue(a((Map) value));
                } else if (value instanceof Boolean) {
                    numberValue = Value.newBuilder().setBoolValue(((Boolean) value).booleanValue());
                } else {
                    numberValue = value instanceof Number ? Value.newBuilder().setNumberValue(((Number) value).doubleValue()) : Value.newBuilder().setStringValue(String.valueOf(value));
                }
                r.c(builderNewBuilder.putFields(strValueOf, numberValue.build()));
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                r.c(s.a(th));
            }
        }
        return builderNewBuilder.build();
    }

    public static final ListValue a(List list) {
        Value.Builder numberValue;
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        for (Object obj : list) {
            try {
                r.a aVar = r.f27774b;
                if (obj instanceof List) {
                    numberValue = Value.newBuilder().setListValue(a((List) obj));
                } else if (obj instanceof Map) {
                    numberValue = Value.newBuilder().setStructValue(a((Map) obj));
                } else if (obj instanceof Boolean) {
                    numberValue = Value.newBuilder().setBoolValue(((Boolean) obj).booleanValue());
                } else {
                    numberValue = obj instanceof Number ? Value.newBuilder().setNumberValue(((Number) obj).doubleValue()) : Value.newBuilder().setStringValue(String.valueOf(obj));
                }
                r.c(builderNewBuilder.addValues(numberValue.build()));
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                r.c(s.a(th));
            }
        }
        return builderNewBuilder.build();
    }

    public static final ByteString a(String str) {
        return ByteString.readFrom(new ByteArrayInputStream(str.getBytes(rd.d.f24999b)));
    }

    public static final BytesValue a(ByteString byteString) {
        return BytesValue.newBuilder().setValue(byteString).build();
    }
}
