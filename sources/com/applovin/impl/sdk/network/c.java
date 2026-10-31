package com.applovin.impl.sdk.network;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.applovin.impl.k5;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.p;
import com.applovin.impl.z4;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f8613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p f8614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AtomicBoolean f8615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8616j;

    c(b bVar, l lVar) {
        super("PersistentPostbackQueueSaveTask", lVar);
        this.f8615i = new AtomicBoolean();
        this.f8616j = false;
        this.f8613g = bVar;
        this.f8614h = lVar.Q();
    }

    public List a(int i10) throws Throwable {
        ArrayList arrayList = new ArrayList();
        n nVarI = this.f6990a.I();
        if (!nVarI.b("persistent_postback_cache.json", l.p())) {
            p.h("PersistentPostbackQueueSaveTask", "Postbacks queue file does not exist.");
            return arrayList;
        }
        File fileA = nVarI.a("persistent_postback_cache.json", l.p());
        String strF = nVarI.f(fileA);
        if (TextUtils.isEmpty(strF)) {
            p.h("PersistentPostbackQueueSaveTask", "Postbacks queue file has no content.");
            return arrayList;
        }
        boolean z10 = false;
        try {
            JSONArray jSONArray = new JSONObject(strF).getJSONArray("pb");
            if (p.a()) {
                this.f8614h.a("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.f6990a.a(z4.M2);
            for (int i11 = 0; i11 < jSONArray.length() && arrayList.size() < i10; i11++) {
                try {
                    d dVar = new d(jSONArray.getJSONObject(i11), this.f6990a);
                    if (dVar.c() < num.intValue()) {
                        arrayList.add(dVar);
                    } else {
                        p.h("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + dVar);
                    }
                } catch (Throwable th) {
                    p.c("PersistentPostbackQueueSaveTask", "Unable to deserialize postback from json", th);
                    this.f6990a.E().a("PersistentPostbackQueueSaveTask", "deserializePostback", th);
                }
            }
            if (p.a()) {
                this.f8614h.a("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th2) {
            try {
                p.c("PersistentPostbackQueueSaveTask", "Failed to load postback queue", th2);
                try {
                    this.f6990a.E().a("PersistentPostbackQueueSaveTask", "deserializePostbackQueue", th2);
                    if (((Boolean) this.f6990a.a(z4.O0)).booleanValue()) {
                        nVarI.a(fileA, "removeAfterDeserializationFail");
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z10 = true;
                    if (z10 && ((Boolean) this.f6990a.a(z4.O0)).booleanValue()) {
                        nVarI.a(fileA, "removeAfterDeserializationFail");
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        this.f8616j = arrayList.isEmpty();
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        a(this.f8613g.d());
    }

    private void a(List list) {
        if (!(this.f8616j && list.isEmpty()) && this.f8615i.compareAndSet(false, true)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                try {
                    jSONArray.put(dVar.q());
                } catch (Throwable th) {
                    p.c("PersistentPostbackQueueSaveTask", "Unable to serialize postback to JSON: " + dVar, th);
                    this.f6990a.E().a("PersistentPostbackQueueSaveTask", "serializePostback", th);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pb", jSONArray);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes(Constants.ENCODING));
                n nVarI = this.f6990a.I();
                if (nVarI.a((InputStream) byteArrayInputStream, nVarI.a("persistent_postback_cache.json", l.p()), true)) {
                    if (p.a()) {
                        this.f8614h.a("PersistentPostbackQueueSaveTask", "Exported postback queue to disk.");
                    }
                } else if (p.a()) {
                    this.f8614h.b("PersistentPostbackQueueSaveTask", "Unable to export postback queue to disk.");
                }
            } catch (Throwable th2) {
                p.c("PersistentPostbackQueueSaveTask", "Unable to export postbacks to disk: " + jSONArray, th2);
                this.f6990a.E().a("PersistentPostbackQueueSaveTask", "serializePostbackQueue", th2);
            }
            this.f8615i.set(false);
        }
    }
}
