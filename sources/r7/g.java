package r7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: VersionMilestoneSerializer.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f24926a = new a(null);

    /* JADX INFO: compiled from: VersionMilestoneSerializer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    public final List<f> a(JSONArray jsonArray) {
        f fVarB;
        t.f(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jsonArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null && (fVarB = b(jSONObjectOptJSONObject)) != null) {
                arrayList.add(fVarB);
            }
        }
        return b0.p0(arrayList);
    }

    public final f b(JSONObject jsonObject) {
        t.f(jsonObject, "jsonObject");
        try {
            hc.a aVarA = hc.a.f15817d.a(jsonObject.getString("ver"));
            if (aVarA != null) {
                return new f(aVarA, jsonObject.getInt("scn"), jsonObject.getLong("fst"), jsonObject.getLong("lst"), jsonObject.getLong("csd"), jsonObject.getLong("lsd"));
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (Throwable unused) {
            return null;
        }
    }

    public final JSONArray c(List<f> versionMilestoneList) {
        t.f(versionMilestoneList, "versionMilestoneList");
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = versionMilestoneList.iterator();
        while (it.hasNext()) {
            jSONArray.put(d((f) it.next()));
        }
        return jSONArray;
    }

    public final JSONObject d(f versionMilestone) throws JSONException {
        t.f(versionMilestone, "versionMilestone");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ver", versionMilestone.h().toString());
        jSONObject.put("scn", versionMilestone.g());
        jSONObject.put("fst", versionMilestone.d());
        jSONObject.put("lst", versionMilestone.f());
        jSONObject.put("csd", versionMilestone.c());
        jSONObject.put("lsd", versionMilestone.e());
        return jSONObject;
    }
}
