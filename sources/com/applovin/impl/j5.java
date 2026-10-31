package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f6902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f6903b = new Object();

    public j5(JSONObject jSONObject) {
        this.f6902a = jSONObject;
    }

    public JSONObject a() {
        JSONObject jSONObjectDeepCopy;
        synchronized (this.f6903b) {
            jSONObjectDeepCopy = JsonUtils.deepCopy(this.f6902a);
        }
        return jSONObjectDeepCopy;
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.f6903b) {
            stringList = JsonUtils.getStringList(this.f6902a, str, list);
        }
        return stringList;
    }

    public void c(String str) {
        synchronized (this.f6903b) {
            this.f6902a.remove(str);
        }
    }

    public String toString() {
        String string;
        synchronized (this.f6903b) {
            string = this.f6902a.toString();
        }
        return string;
    }

    public boolean a(String str) {
        boolean zHas;
        synchronized (this.f6903b) {
            zHas = this.f6902a.has(str);
        }
        return zHas;
    }

    public Object b(String str) {
        Object objOpt;
        synchronized (this.f6903b) {
            objOpt = this.f6902a.opt(str);
        }
        return objOpt;
    }

    public void a(w.b bVar) {
        synchronized (this.f6903b) {
            bVar.accept(this);
        }
    }

    public void b(String str, int i10) {
        synchronized (this.f6903b) {
            JsonUtils.putInt(this.f6902a, str, i10);
        }
    }

    public Object a(o.a aVar) {
        Object objApply;
        synchronized (this.f6903b) {
            objApply = aVar.apply(this);
        }
        return objApply;
    }

    public void b(String str, long j10) {
        synchronized (this.f6903b) {
            JsonUtils.putLong(this.f6902a, str, j10);
        }
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f6903b) {
            bool2 = JsonUtils.getBoolean(this.f6902a, str, bool);
        }
        return bool2;
    }

    public void b(String str, String str2) {
        synchronized (this.f6903b) {
            JsonUtils.putString(this.f6902a, str, str2);
        }
    }

    public float a(String str, float f10) {
        float f11;
        synchronized (this.f6903b) {
            f11 = JsonUtils.getFloat(this.f6902a, str, f10);
        }
        return f11;
    }

    public double a(String str, double d10) {
        double d11;
        synchronized (this.f6903b) {
            d11 = JsonUtils.getDouble(this.f6902a, str, d10);
        }
        return d11;
    }

    public int a(String str, int i10) {
        int i11;
        synchronized (this.f6903b) {
            i11 = JsonUtils.getInt(this.f6902a, str, i10);
        }
        return i11;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f6903b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f6902a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f6903b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f6902a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(String str, long j10) {
        long j11;
        synchronized (this.f6903b) {
            j11 = JsonUtils.getLong(this.f6902a, str, j10);
        }
        return j11;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f6903b) {
            string = JsonUtils.getString(this.f6902a, str, str2);
        }
        return string;
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f6903b) {
            integerList = JsonUtils.getIntegerList(this.f6902a, str, list);
        }
        return integerList;
    }

    public void a(String str, boolean z10) {
        synchronized (this.f6903b) {
            JsonUtils.putBoolean(this.f6902a, str, z10);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.f6903b) {
            JsonUtils.putObject(this.f6902a, str, obj);
        }
    }
}
