package io.bidmachine;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.TextFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProtoLogger.java */
/* JADX INFO: loaded from: classes4.dex */
class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f20469a = {BuildConfig.LIBRARY_PACKAGE_NAME, "com.explorestack"};

    /* JADX INFO: compiled from: ProtoLogger.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20470a;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.JavaType.values().length];
            f20470a = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20470a[Descriptors.FieldDescriptor.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20470a[Descriptors.FieldDescriptor.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20470a[Descriptors.FieldDescriptor.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20470a[Descriptors.FieldDescriptor.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20470a[Descriptors.FieldDescriptor.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20470a[Descriptors.FieldDescriptor.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20470a[Descriptors.FieldDescriptor.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20470a[Descriptors.FieldDescriptor.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private static void b(JSONArray jSONArray, Object obj) {
        jSONArray.put(obj);
    }

    private static void c(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
    }

    private static String d(Object obj) {
        return obj instanceof ByteString ? TextFormat.escapeBytes((ByteString) obj) : TextFormat.escapeBytes((byte[]) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(String str, MessageOrBuilder messageOrBuilder) {
        return String.format("[%s] %s", str, k(messageOrBuilder));
    }

    static void f(final String str, final MessageOrBuilder messageOrBuilder) {
        if (messageOrBuilder != null) {
            io.bidmachine.core.a.d(new qc.b() { // from class: io.bidmachine.v4
                @Override // qc.b
                public final Object get() {
                    return w4.e(str, messageOrBuilder);
                }
            });
        }
    }

    private static Object g(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        try {
            if (fieldDescriptor.isRepeated() && (obj instanceof List)) {
                return j(fieldDescriptor, (List) obj);
            }
            switch (a.f20470a[fieldDescriptor.getJavaType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return obj;
                case 7:
                    return d(obj);
                case 8:
                    return ((Descriptors.GenericDescriptor) obj).getName();
                case 9:
                    return k((MessageOrBuilder) obj);
                default:
                    return "Unsupported type";
            }
        } catch (Throwable unused) {
            return "Parsing error";
        }
    }

    private static JSONObject h(Any any) {
        String[] strArrSplit = any.getTypeUrl().split("/");
        String str = strArrSplit[strArrSplit.length - 1];
        for (String str2 : f20469a) {
            try {
                return k(any.unpack(Class.forName(str2 + str.substring(str.indexOf(".")))));
            } catch (Exception unused) {
            }
        }
        return new JSONObject();
    }

    private static JSONObject i(Map<Descriptors.FieldDescriptor, Object> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : map.entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            c(jSONObject, key.getName(), g(key, entry.getValue()));
        }
        return jSONObject;
    }

    private static JSONArray j(Descriptors.FieldDescriptor fieldDescriptor, List<?> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            b(jSONArray, g(fieldDescriptor, it.next()));
        }
        return jSONArray;
    }

    private static JSONObject k(MessageOrBuilder messageOrBuilder) {
        return messageOrBuilder instanceof Any ? h((Any) messageOrBuilder) : i(messageOrBuilder.getAllFields());
    }
}
