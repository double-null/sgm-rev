package g7;

import android.graphics.PointF;
import java.util.Map;
import org.json.JSONObject;
import wb.e0;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f15447d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final od.e f15448e = od.j.b(0.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f15450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f15451c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PointF a(Map map) {
            Float fN = e0.N(map != null ? map.get("x") : null, null, 1, null);
            Float fN2 = e0.N(map != null ? map.get("y") : null, null, 1, null);
            if (fN == null || !e.f15448e.a(fN) || fN2 == null || !e.f15448e.a(fN2)) {
                return null;
            }
            return new PointF(fN.floatValue(), fN2.floatValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Long d(Map map) {
            Object obj;
            if (map == null || (obj = map.get("seed")) == null) {
                return null;
            }
            return e0.U(obj, null, 1, null);
        }

        private a() {
        }
    }

    private e(String str, Integer num, Integer num2) {
        this.f15449a = str;
        this.f15450b = num;
        this.f15451c = num2;
    }

    private final pb.v a(int i10, int i11) {
        float f10 = 1.0f;
        float f11 = (i10 == 1 || (i10 != 5 && i10 == 17)) ? 0.5f : 1.0f;
        if (i11 == 16 || i11 == 17) {
            f10 = 0.5f;
        } else if (i11 != 80) {
            f10 = 0.0f;
        }
        return new pb.v(new PointF(f11, f10), pb.v.f24230d.b(), null);
    }

    private final pb.v b(String str) {
        try {
            Map<String, Object> mapV = e0.V(new JSONObject(str));
            Object obj = mapV.get("spread");
            Map map = obj instanceof Map ? (Map) obj : null;
            a aVar = f15447d;
            Object obj2 = mapV.get("center");
            PointF pointFA = aVar.a(obj2 instanceof Map ? (Map) obj2 : null);
            if (pointFA == null) {
                pointFA = pb.v.f24230d.a();
            }
            PointF pointFA2 = aVar.a(map);
            if (pointFA2 == null) {
                pointFA2 = pb.v.f24230d.b();
            }
            return new pb.v(pointFA, pointFA2, aVar.d(map));
        } catch (Exception unused) {
            return new pb.v(null, null, null, 7, null);
        }
    }

    public final pb.v d() {
        String str = this.f15449a;
        if (str != null) {
            return b(str);
        }
        Integer num = this.f15450b;
        if (num == null) {
            return new pb.v(null, null, null, 7, null);
        }
        int iIntValue = num.intValue();
        Integer num2 = this.f15451c;
        kotlin.jvm.internal.t.c(num2);
        return a(iIntValue, num2.intValue());
    }

    public e(String str) {
        this(str, null, null);
    }

    public e(int i10, int i11) {
        this(null, Integer.valueOf(i10), Integer.valueOf(i11));
    }
}
