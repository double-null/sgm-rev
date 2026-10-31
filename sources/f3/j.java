package f3;

import android.util.Base64;
import android.util.JsonReader;
import c0.IbU.elEbP;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import e3.h0;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: CrashlyticsReportJsonTransform.java */
/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o3.a f14617a = new q3.d().j(e3.a.f13953a).k(true).i();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: CrashlyticsReportJsonTransform.java */
    interface a<T> {
        T a(JsonReader jsonReader) throws IOException;
    }

    private static h0.f.d.AbstractC0212f A(JsonReader jsonReader) throws IOException {
        h0.f.d.AbstractC0212f.a aVarA = h0.f.d.AbstractC0212f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("assignments")) {
                aVarA.b(n(jsonReader, new a() { // from class: f3.c
                    @Override // f3.j.a
                    public final Object a(JsonReader jsonReader2) {
                        return j.z(jsonReader2);
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static h0.f.d.a.b.AbstractC0205d B(JsonReader jsonReader) throws IOException {
        h0.f.d.a.b.AbstractC0205d.AbstractC0206a abstractC0206aA = h0.f.d.a.b.AbstractC0205d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "address":
                    abstractC0206aA.b(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC0206aA.c(jsonReader.nextString());
                    break;
                case "name":
                    abstractC0206aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0206aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0.f.d.a.b.e C(JsonReader jsonReader) throws IOException {
        h0.f.d.a.b.e.AbstractC0207a abstractC0207aA = h0.f.d.a.b.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    abstractC0207aA.b(n(jsonReader, new i()));
                    break;
                case "name":
                    abstractC0207aA.d(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0207aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0207aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0.d.b D(JsonReader jsonReader) throws IOException {
        h0.d.b.a aVarA = h0.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("filename")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                aVarA.b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static h0.d E(JsonReader jsonReader) throws IOException {
        h0.d.a aVarA = h0.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("files")) {
                aVarA.b(n(jsonReader, new a() { // from class: f3.b
                    @Override // f3.j.a
                    public final Object a(JsonReader jsonReader2) {
                        return j.D(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0.f.d.a.c G(JsonReader jsonReader) throws IOException {
        h0.f.d.a.c.AbstractC0210a abstractC0210aA = h0.f.d.a.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "pid":
                    abstractC0210aA.d(jsonReader.nextInt());
                    break;
                case "processName":
                    abstractC0210aA.e(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    abstractC0210aA.b(jsonReader.nextBoolean());
                    break;
                case "importance":
                    abstractC0210aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0210aA.a();
    }

    private static h0.e H(JsonReader jsonReader) throws IOException {
        h0.e.a aVarA = h0.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("profilingTrigger")) {
                aVarA.b(I(jsonReader));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static h0.e.b I(JsonReader jsonReader) throws IOException {
        h0.e.b.a aVarA = h0.e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("trigger")) {
                aVarA.b(jsonReader.nextInt());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static h0 J(JsonReader jsonReader) throws IOException {
        h0.b bVarB = h0.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "ndkPayload":
                    bVarB.j(E(jsonReader));
                    break;
                case "sdkVersion":
                    bVarB.l(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    bVarB.c(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    bVarB.b(m(jsonReader));
                    break;
                case "buildVersion":
                    bVarB.d(jsonReader.nextString());
                    break;
                case "firebaseAuthenticationToken":
                    bVarB.f(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    bVarB.h(jsonReader.nextString());
                    break;
                case "installationUuid":
                    bVarB.i(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    bVarB.g(jsonReader.nextString());
                    break;
                case "platform":
                    bVarB.k(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    bVarB.e(jsonReader.nextString());
                    break;
                case "session":
                    bVarB.m(L(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarB.a();
    }

    private static h0.f.d.e.b K(JsonReader jsonReader) throws IOException {
        h0.f.d.e.b.a aVarA = h0.f.d.e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("variantId")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("rolloutId")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static h0.f L(JsonReader jsonReader) throws IOException {
        h0.f.b bVarA = h0.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "startedAt":
                    bVarA.m(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    bVarA.c(jsonReader.nextString());
                    break;
                case "identifier":
                    bVarA.k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    bVarA.f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    bVarA.e(q(jsonReader));
                    break;
                case "events":
                    bVarA.g(n(jsonReader, new a() { // from class: f3.a
                        @Override // f3.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.r(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    bVarA.l(F(jsonReader));
                    break;
                case "app":
                    bVarA.b(l(jsonReader));
                    break;
                case "user":
                    bVarA.n(M(jsonReader));
                    break;
                case "generator":
                    bVarA.h(jsonReader.nextString());
                    break;
                case "crashed":
                    bVarA.d(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    bVarA.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    private static h0.f.AbstractC0213f M(JsonReader jsonReader) throws IOException {
        h0.f.AbstractC0213f.a aVarA = h0.f.AbstractC0213f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static h0.f.a l(JsonReader jsonReader) throws IOException {
        h0.f.a.AbstractC0199a abstractC0199aA = h0.f.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "identifier":
                    abstractC0199aA.e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC0199aA.b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC0199aA.c(jsonReader.nextString());
                    break;
                case "version":
                    abstractC0199aA.g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC0199aA.f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC0199aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0199aA.a();
    }

    private static h0.a m(JsonReader jsonReader) throws IOException {
        h0.a.b bVarA = h0.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    bVarA.b(n(jsonReader, new a() { // from class: f3.f
                        @Override // f3.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.o(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    bVarA.d(jsonReader.nextInt());
                    break;
                case "pss":
                    bVarA.f(jsonReader.nextLong());
                    break;
                case "rss":
                    bVarA.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    bVarA.i(jsonReader.nextLong());
                    break;
                case "processName":
                    bVarA.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    bVarA.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    bVarA.j(jsonReader.nextString());
                    break;
                case "importance":
                    bVarA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    private static <T> List<T> n(JsonReader jsonReader, a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0.a.AbstractC0197a o(JsonReader jsonReader) throws IOException {
        h0.a.AbstractC0197a.AbstractC0198a abstractC0198aA = h0.a.AbstractC0197a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "libraryName":
                    abstractC0198aA.d(jsonReader.nextString());
                    break;
                case "arch":
                    abstractC0198aA.b(jsonReader.nextString());
                    break;
                case "buildId":
                    abstractC0198aA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0198aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0.c p(JsonReader jsonReader) throws IOException {
        h0.c.a aVarA = h0.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals(SDKConstants.PARAM_KEY)) {
                aVarA.b(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static h0.f.c q(JsonReader jsonReader) throws IOException {
        h0.f.c.a aVarA = h0.f.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "simulator":
                    aVarA.i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "ram":
                    aVarA.h(jsonReader.nextLong());
                    break;
                case "arch":
                    aVarA.b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "cores":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "model":
                    aVarA.f(jsonReader.nextString());
                    break;
                case "state":
                    aVarA.j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    aVarA.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0.f.d r(JsonReader jsonReader) throws IOException {
        h0.f.d.b bVarA = h0.f.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "device":
                    bVarA.c(u(jsonReader));
                    break;
                case "rollouts":
                    bVarA.e(A(jsonReader));
                    break;
                case "app":
                    bVarA.b(s(jsonReader));
                    break;
                case "log":
                    bVarA.d(y(jsonReader));
                    break;
                case "type":
                    bVarA.g(jsonReader.nextString());
                    break;
                case "timestamp":
                    bVarA.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    private static h0.f.d.a s(JsonReader jsonReader) throws IOException {
        h0.f.d.a.AbstractC0200a abstractC0200aA = h0.f.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "appProcessDetails":
                    abstractC0200aA.b(n(jsonReader, new a() { // from class: f3.e
                        @Override // f3.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.G(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    abstractC0200aA.c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC0200aA.f(v(jsonReader));
                    break;
                case "internalKeys":
                    abstractC0200aA.g(n(jsonReader, new a() { // from class: f3.d
                        @Override // f3.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.p(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    abstractC0200aA.e(n(jsonReader, new a() { // from class: f3.d
                        @Override // f3.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.p(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC0200aA.h(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    abstractC0200aA.d(G(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0200aA.a();
    }

    private static h0.f.d.c u(JsonReader jsonReader) throws IOException {
        h0.f.d.c.a aVarA = h0.f.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "batteryLevel":
                    aVarA.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "orientation":
                    aVarA.e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    aVarA.g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    aVarA.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static h0.f.d.a.b v(JsonReader jsonReader) throws IOException {
        h0.f.d.a.b.AbstractC0203b abstractC0203bA = h0.f.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "appExitInfo":
                    abstractC0203bA.b(m(jsonReader));
                    break;
                case "threads":
                    abstractC0203bA.g(n(jsonReader, new a() { // from class: f3.g
                        @Override // f3.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.C(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC0203bA.f(B(jsonReader));
                    break;
                case "binaries":
                    abstractC0203bA.c(n(jsonReader, new a() { // from class: f3.h
                        @Override // f3.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.t(jsonReader2);
                        }
                    }));
                    break;
                case "profilingManagerInfo":
                    abstractC0203bA.e(H(jsonReader));
                    break;
                case "exception":
                    abstractC0203bA.d(w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0203bA.a();
    }

    private static h0.f.d.a.b.c w(JsonReader jsonReader) throws IOException {
        h0.f.d.a.b.c.AbstractC0204a abstractC0204aA = h0.f.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    abstractC0204aA.c(n(jsonReader, new i()));
                    break;
                case "reason":
                    abstractC0204aA.e(jsonReader.nextString());
                    break;
                case "type":
                    abstractC0204aA.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC0204aA.b(w(jsonReader));
                    break;
                case "overflowCount":
                    abstractC0204aA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0204aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0.f.d.a.b.e.AbstractC0208b x(JsonReader jsonReader) throws IOException {
        h0.f.d.a.b.e.AbstractC0208b.AbstractC0209a abstractC0209aA = h0.f.d.a.b.e.AbstractC0208b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "offset":
                    abstractC0209aA.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC0209aA.f(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC0209aA.e(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC0209aA.b(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0209aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0209aA.a();
    }

    private static h0.f.d.AbstractC0211d y(JsonReader jsonReader) throws IOException {
        h0.f.d.AbstractC0211d.a aVarA = h0.f.d.AbstractC0211d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals(AppLovinEventTypes.USER_VIEWED_CONTENT)) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0.f.d.e z(JsonReader jsonReader) throws IOException {
        h0.f.d.e.a aVarA = h0.f.d.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "parameterKey":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "templateVersion":
                    aVarA.e(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    aVarA.d(K(jsonReader));
                    break;
                case "parameterValue":
                    aVarA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public h0.e N(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                h0.e eVarH = H(jsonReader);
                jsonReader.close();
                return eVarH;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String O(h0.e eVar) {
        return f14617a.b(eVar);
    }

    public h0 P(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                h0 h0VarJ = J(jsonReader);
                jsonReader.close();
                return h0VarJ;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String Q(h0 h0Var) {
        return f14617a.b(h0Var);
    }

    public h0.f.d j(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                h0.f.d dVarR = r(jsonReader);
                jsonReader.close();
                return dVarR;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String k(h0.f.d dVar) {
        return f14617a.b(dVar);
    }

    private static h0.f.e F(JsonReader jsonReader) throws IOException {
        h0.f.e.a aVarA = h0.f.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            byte b10 = -1;
            switch (strNextName.hashCode()) {
                case -911706486:
                    if (strNextName.equals("buildVersion")) {
                        b10 = 0;
                    }
                    break;
                case -293026577:
                    if (strNextName.equals("jailbroken")) {
                        b10 = 1;
                    }
                    break;
                case 351608024:
                    if (strNextName.equals(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION)) {
                        b10 = 2;
                    }
                    break;
                case 1874684019:
                    if (strNextName.equals(elEbP.qFbmMvtxowzPnzf)) {
                        b10 = 3;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    aVarA.b(jsonReader.nextString());
                    break;
                case 1:
                    aVarA.c(jsonReader.nextBoolean());
                    break;
                case 2:
                    aVarA.e(jsonReader.nextString());
                    break;
                case 3:
                    aVarA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0.f.d.a.b.AbstractC0201a t(JsonReader jsonReader) throws IOException {
        h0.f.d.a.b.AbstractC0201a.AbstractC0202a abstractC0202aA = h0.f.d.a.b.AbstractC0201a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            byte b10 = -1;
            switch (strNextName.hashCode()) {
                case 3373707:
                    if (strNextName.equals("name")) {
                        b10 = 0;
                    }
                    break;
                case 3530753:
                    if (strNextName.equals(EFLCCdIRcb.XGobwwyP)) {
                        b10 = 1;
                    }
                    break;
                case 3601339:
                    if (strNextName.equals("uuid")) {
                        b10 = 2;
                    }
                    break;
                case 1153765347:
                    if (strNextName.equals("baseAddress")) {
                        b10 = 3;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    abstractC0202aA.c(jsonReader.nextString());
                    break;
                case 1:
                    abstractC0202aA.d(jsonReader.nextLong());
                    break;
                case 2:
                    abstractC0202aA.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    abstractC0202aA.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0202aA.a();
    }
}
