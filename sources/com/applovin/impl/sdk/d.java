package com.applovin.impl.sdk;

import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.h2;
import com.applovin.impl.k5;
import com.applovin.impl.r7;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u6;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAdType;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final File f8353b = new File(l.p().getFilesDir(), "al/persisted-ads");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8354a;

    public static class a implements s4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AppLovinAdType f8356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f8357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f8358d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f8359e;

        public a(String str, AppLovinAdType appLovinAdType, boolean z10, long j10, long j11) {
            this.f8355a = str;
            this.f8356b = appLovinAdType;
            this.f8357c = z10;
            this.f8358d = j10;
            this.f8359e = j11;
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f8359e;
        }

        public long c() {
            return this.f8358d;
        }

        public String d() {
            return this.f8355a + "_" + this.f8356b;
        }

        public String e() {
            return this.f8355a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String strE = e();
            String strE2 = aVar.e();
            if (strE != null ? !strE.equals(strE2) : strE2 != null) {
                return false;
            }
            AppLovinAdType appLovinAdTypeF = f();
            AppLovinAdType appLovinAdTypeF2 = aVar.f();
            return appLovinAdTypeF != null ? appLovinAdTypeF.equals(appLovinAdTypeF2) : appLovinAdTypeF2 == null;
        }

        public AppLovinAdType f() {
            return this.f8356b;
        }

        public boolean g() {
            return this.f8357c;
        }

        public int hashCode() {
            String strE = e();
            int iHashCode = strE == null ? 43 : strE.hashCode();
            AppLovinAdType appLovinAdTypeF = f();
            return ((iHashCode + 59) * 59) + (appLovinAdTypeF != null ? appLovinAdTypeF.hashCode() : 43);
        }

        public String toString() {
            return "AdPersistenceFileService.PersistedAdFilePath(id=" + e() + ", type=" + f() + ", isAdServerAd=" + g() + ", expiryTimeMillis=" + c() + ", appLaunchTimestamp=" + b() + ")";
        }

        public static a a(com.applovin.impl.sdk.ad.b bVar) {
            return a(bVar, 0L, 0L);
        }

        public static a a(com.applovin.impl.sdk.ad.b bVar, long j10, long j11) {
            if (bVar == null) {
                return null;
            }
            return new a(StringUtils.isValidString(bVar.getMediationServeId()) ? bVar.getMediationServeId() : UUID.randomUUID().toString(), bVar.getType(), bVar instanceof com.applovin.impl.sdk.ad.a, SystemClock.elapsedRealtime() + j10, j11);
        }

        public static a a(JSONObject jSONObject, l lVar) {
            String string = JsonUtils.getString(jSONObject, "id", "");
            String string2 = JsonUtils.getString(jSONObject, "type", "");
            Boolean bool = JsonUtils.getBoolean(jSONObject, "is_ad_server_ad", null);
            long j10 = JsonUtils.getLong(jSONObject, "expiry_time_millis", 0L);
            long j11 = JsonUtils.getLong(jSONObject, "app_launch_timestamp", 0L);
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || bool == null) {
                return null;
            }
            return new a(string, AppLovinAdType.fromString(string2), bool.booleanValue(), j10, j11);
        }

        @Override // com.applovin.impl.s4
        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "id", this.f8355a);
            JsonUtils.putString(jSONObject, "type", this.f8356b.toString());
            JsonUtils.putBoolean(jSONObject, "is_ad_server_ad", this.f8357c);
            JsonUtils.putLong(jSONObject, "expiry_time_millis", this.f8358d);
            JsonUtils.putLong(jSONObject, "app_launch_timestamp", this.f8359e);
            return jSONObject;
        }
    }

    public interface b {
        void a(a aVar);
    }

    public interface c {
        void a(com.applovin.impl.sdk.ad.b bVar, String str);
    }

    public d(l lVar) {
        this.f8354a = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        a aVarA = a.a(bVar, ((Long) this.f8354a.a(z4.f9207d1)).longValue(), l.o());
        File fileA = a(aVarA);
        if (fileA == null) {
            a("Could not persist incompatible ad", bVar, bVar2);
            return;
        }
        try {
            JSONObject jSONObjectA = bVar.a();
            if (jSONObjectA == null) {
                a("Could not serialize ad for persistence", bVar, bVar2);
                return;
            }
            if (this.f8354a.I().a((InputStream) new ByteArrayInputStream(jSONObjectA.toString().getBytes(Constants.ENCODING)), fileA, true)) {
                a(aVarA, bVar, bVar2);
            } else {
                a("Failed to write persisted ad to disk", bVar, bVar2);
            }
        } catch (Throwable th) {
            a("Ad could not be persisted", bVar, bVar2);
            this.f8354a.E().a("AdPersistenceFileService", th, CollectionUtils.map("error_message", "Ad could not be persisted"));
        }
    }

    public void b(final com.applovin.impl.sdk.ad.b bVar, final b bVar2) {
        if (b()) {
            this.f8354a.s0().a((k5) new u6(this.f8354a, "persistAd", new Runnable() { // from class: com.applovin.impl.sdk.c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8350a.a(bVar, bVar2);
                }
            }), f6.b.CACHING);
        } else {
            a("Ad Persistence directory could not be created", bVar, bVar2);
        }
    }

    private boolean b() {
        File file = f8353b;
        if (file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    public void b(a aVar) {
        File fileA = a(aVar);
        if (fileA != null) {
            fileA.delete();
        }
    }

    public void a(final a aVar, final c cVar) {
        final File fileA = a(aVar);
        if (fileA != null && fileA.exists()) {
            this.f8354a.s0().a((k5) new u6(this.f8354a, "retrievePersistedAd", new Runnable() { // from class: com.applovin.impl.sdk.b0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f8338a.a(fileA, cVar, aVar);
                }
            }), f6.b.OTHER);
        } else {
            cVar.a(null, "Persisted ad could not be retrieved: Retrieval failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(File file, c cVar, a aVar) throws Throwable {
        com.applovin.impl.sdk.ad.b bVarA;
        String strF = this.f8354a.I().f(file);
        if (strF == null) {
            cVar.a(null, "Persisted ad could not be retrieved: Read failed");
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(strF, new JSONObject());
            JsonUtils.putBoolean(JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "full_response", new JSONObject()), "is_persisted_ad", true);
            if (aVar.g()) {
                bVarA = com.applovin.impl.sdk.ad.a.a(jSONObjectJsonObjectFromJsonString, this.f8354a);
            } else {
                bVarA = r7.a(jSONObjectJsonObjectFromJsonString, this.f8354a);
            }
            if (bVarA == null) {
                cVar.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            } else {
                cVar.a(bVarA, null);
            }
        } catch (Throwable th) {
            cVar.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            this.f8354a.E().a("AdPersistenceFileService", th, CollectionUtils.map("error_message", "Persisted ad could not be retrieved: Deserialization failed"));
        }
    }

    private File a(a aVar) {
        if (aVar == null) {
            return null;
        }
        return new File(f8353b.getAbsolutePath() + "/" + aVar.d());
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.f8354a.Q();
        if (p.a()) {
            this.f8354a.Q().a("AdPersistenceFileService", "Ad was persisted successfully");
        }
        bVar2.a(aVar);
        this.f8354a.g().a(f2.V, bVar);
    }

    private void a(String str, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.f8354a.Q();
        if (p.a()) {
            this.f8354a.Q().a("AdPersistenceFileService", str);
        }
        bVar2.a(null);
        Map mapA = h2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        this.f8354a.g().d(f2.W, mapA);
    }

    public void a(List list) {
        File[] fileArrListFiles = f8353b.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        boolean z10 = false;
        for (File file : fileArrListFiles) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((a) it.next()).d().equals(file.getName())) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                file.delete();
            }
        }
    }

    public void a() {
        File[] fileArrListFiles;
        File file = f8353b;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
    }
}
