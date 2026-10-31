package d3;

import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rd.PSo.cNMUz;

/* JADX INFO: compiled from: MetaDataStore.java */
/* JADX INFO: loaded from: classes4.dex */
class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f13268b = Charset.forName(cNMUz.SeqPgLHncIrJKq);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileStore f13269a;

    /* JADX INFO: compiled from: MetaDataStore.java */
    class a extends JSONObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13270a;

        a(String str) throws JSONException {
            this.f13270a = str;
            put("userId", str);
        }
    }

    public g(FileStore fileStore) {
        this.f13269a = fileStore;
    }

    private static Map<String, String> e(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, p(jSONObject, next));
        }
        return map;
    }

    private static List<j> f(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                arrayList.add(j.a(string));
            } catch (Exception e10) {
                z2.f.f().l("Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    private String g(String str) throws JSONException {
        return p(new JSONObject(str), "userId");
    }

    private static String h(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String l(List<j> list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(j.f13296a.b(list.get(i10))));
            } catch (JSONException e10) {
                z2.f.f().l("Exception parsing rollout assignment!", e10);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    private static void m(File file) {
        if (file.exists() && file.delete()) {
            z2.f.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static void n(File file, String str) {
        if (file.exists() && file.delete()) {
            z2.f.f().g(String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }

    private static String o(String str) throws JSONException {
        return new a(str).toString();
    }

    private static String p(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.f13269a.q(str, "internal-keys");
    }

    public File b(String str) {
        return this.f13269a.q(str, "keys");
    }

    public File c(String str) {
        return this.f13269a.q(str, "rollouts-state");
    }

    public File d(String str) {
        return this.f13269a.q(str, "user-data");
    }

    Map<String, String> i(String str, boolean z10) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        Exception e10;
        File fileA = z10 ? a(str) : b(str);
        if (!fileA.exists() || fileA.length() == 0) {
            n(fileA, "The file has a length of zero for session: " + str);
            return Collections.emptyMap();
        }
        try {
            fileInputStream = new FileInputStream(fileA);
            try {
                try {
                    Map<String, String> mapE = e(com.google.firebase.crashlytics.internal.common.h.B(fileInputStream));
                    com.google.firebase.crashlytics.internal.common.h.f(fileInputStream, "Failed to close user metadata file.");
                    return mapE;
                } catch (Exception e11) {
                    e10 = e11;
                    z2.f.f().l("Error deserializing user metadata.", e10);
                    m(fileA);
                    com.google.firebase.crashlytics.internal.common.h.f(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                }
            } catch (Throwable th2) {
                th = th2;
                com.google.firebase.crashlytics.internal.common.h.f(fileInputStream, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e12) {
            fileInputStream = null;
            e10 = e12;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
            com.google.firebase.crashlytics.internal.common.h.f(fileInputStream, "Failed to close user metadata file.");
            throw th;
        }
    }

    public List<j> j(String str) throws Throwable {
        File fileC = c(str);
        if (!fileC.exists() || fileC.length() == 0) {
            n(fileC, "The file has a length of zero for session: " + str);
            return Collections.emptyList();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileC);
                try {
                    List<j> listF = f(com.google.firebase.crashlytics.internal.common.h.B(fileInputStream2));
                    z2.f.f().b("Loaded rollouts state:\n" + listF + "\nfor session " + str);
                    com.google.firebase.crashlytics.internal.common.h.f(fileInputStream2, "Failed to close rollouts state file.");
                    return listF;
                } catch (Exception e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    z2.f.f().l("Error deserializing rollouts state.", e);
                    m(fileC);
                    com.google.firebase.crashlytics.internal.common.h.f(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.emptyList();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    com.google.firebase.crashlytics.internal.common.h.f(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public String k(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileD = d(str);
        FileInputStream fileInputStream2 = null;
        if (!fileD.exists() || fileD.length() == 0) {
            z2.f.f().b("No userId set for session " + str);
            m(fileD);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileD);
            try {
                try {
                    String strG = g(com.google.firebase.crashlytics.internal.common.h.B(fileInputStream));
                    z2.f.f().b("Loaded userId " + strG + " for session " + str);
                    com.google.firebase.crashlytics.internal.common.h.f(fileInputStream, "Failed to close user metadata file.");
                    return strG;
                } catch (Exception e10) {
                    e = e10;
                    z2.f.f().l("Error deserializing user metadata.", e);
                    m(fileD);
                    com.google.firebase.crashlytics.internal.common.h.f(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                com.google.firebase.crashlytics.internal.common.h.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            com.google.firebase.crashlytics.internal.common.h.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void q(String str, Map<String, String> map) throws Throwable {
        r(str, map, false);
    }

    public void r(String str, Map<String, String> map, boolean z10) throws Throwable {
        File fileA = z10 ? a(str) : b(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strH = h(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileA), f13268b));
                try {
                    bufferedWriter2.write(strH);
                    bufferedWriter2.flush();
                    com.google.firebase.crashlytics.internal.common.h.f(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    z2.f.f().l("Error serializing key/value metadata.", e);
                    m(fileA);
                    com.google.firebase.crashlytics.internal.common.h.f(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    com.google.firebase.crashlytics.internal.common.h.f(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void s(String str, List<j> list) throws Throwable {
        BufferedWriter bufferedWriter;
        Throwable th;
        Exception e10;
        File fileC = c(str);
        if (list.isEmpty()) {
            n(fileC, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            String strL = l(list);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileC), f13268b));
            try {
                try {
                    bufferedWriter.write(strL);
                    bufferedWriter.flush();
                } catch (Exception e11) {
                    e10 = e11;
                    z2.f.f().l("Error serializing rollouts state.", e10);
                    m(fileC);
                }
            } catch (Throwable th2) {
                th = th2;
                com.google.firebase.crashlytics.internal.common.h.f(bufferedWriter, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e12) {
            bufferedWriter = null;
            e10 = e12;
        } catch (Throwable th3) {
            bufferedWriter = null;
            th = th3;
            com.google.firebase.crashlytics.internal.common.h.f(bufferedWriter, "Failed to close rollouts state file.");
            throw th;
        }
        com.google.firebase.crashlytics.internal.common.h.f(bufferedWriter, "Failed to close rollouts state file.");
    }

    public void t(String str, String str2) throws Throwable {
        File fileD = d(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strO = o(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileD), f13268b));
                try {
                    bufferedWriter2.write(strO);
                    bufferedWriter2.flush();
                    com.google.firebase.crashlytics.internal.common.h.f(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    z2.f.f().l("Error serializing user metadata.", e);
                    com.google.firebase.crashlytics.internal.common.h.f(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    com.google.firebase.crashlytics.internal.common.h.f(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
