package ke;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonException;

/* JADX INFO: compiled from: JsonNamesMap.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e0.a<Map<String, Integer>> f21380a = new e0.a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e0.a<String[]> f21381b = new e0.a<>();

    private static final Map<String, Integer> b(he.f fVar, kotlinx.serialization.json.b bVar) {
        String lowerCase;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zD = d(bVar, fVar);
        m(fVar, bVar);
        int iE = fVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            List<Annotation> listG = fVar.g(i10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG) {
                if (obj instanceof kotlinx.serialization.json.y) {
                    arrayList.add(obj);
                }
            }
            kotlinx.serialization.json.y yVar = (kotlinx.serialization.json.y) kotlin.collections.b0.g0(arrayList);
            if (yVar != null && (strArrNames = yVar.names()) != null) {
                for (String lowerCase2 : strArrNames) {
                    if (zD) {
                        lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.t.e(lowerCase2, "toLowerCase(...)");
                    }
                    c(linkedHashMap, fVar, lowerCase2, i10);
                }
            }
            if (zD) {
                lowerCase = fVar.f(i10).toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.t.e(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                c(linkedHashMap, fVar, lowerCase, i10);
            }
        }
        return linkedHashMap.isEmpty() ? kotlin.collections.o0.h() : linkedHashMap;
    }

    private static final void c(Map<String, Integer> map, he.f fVar, String str, int i10) {
        String str2 = kotlin.jvm.internal.t.a(fVar.d(), he.m.b.f15863a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i10));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + fVar.f(i10) + " is already one of the names for " + str2 + ' ' + fVar.f(((Number) kotlin.collections.o0.i(map, str)).intValue()) + " in " + fVar);
    }

    private static final boolean d(kotlinx.serialization.json.b bVar, he.f fVar) {
        return bVar.e().h() && kotlin.jvm.internal.t.a(fVar.d(), he.m.b.f15863a);
    }

    public static final Map<String, Integer> e(final kotlinx.serialization.json.b bVar, final he.f descriptor) {
        kotlin.jvm.internal.t.f(bVar, "<this>");
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return (Map) kotlinx.serialization.json.i0.a(bVar).b(descriptor, f21380a, new id.a() { // from class: ke.l0
            @Override // id.a
            public final Object invoke() {
                return m0.f(descriptor, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map f(he.f fVar, kotlinx.serialization.json.b bVar) {
        return b(fVar, bVar);
    }

    public static final e0.a<Map<String, Integer>> g() {
        return f21380a;
    }

    public static final String h(he.f fVar, kotlinx.serialization.json.b json, int i10) {
        kotlin.jvm.internal.t.f(fVar, "<this>");
        kotlin.jvm.internal.t.f(json, "json");
        m(fVar, json);
        return fVar.f(i10);
    }

    public static final int i(he.f fVar, kotlinx.serialization.json.b json, String name) {
        kotlin.jvm.internal.t.f(fVar, "<this>");
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(name, "name");
        if (d(json, fVar)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.t.e(lowerCase, "toLowerCase(...)");
            return l(fVar, json, lowerCase);
        }
        m(fVar, json);
        int iC = fVar.c(name);
        return (iC == -3 && json.e().o()) ? l(fVar, json, name) : iC;
    }

    public static final int j(he.f fVar, kotlinx.serialization.json.b json, String name, String suffix) {
        kotlin.jvm.internal.t.f(fVar, "<this>");
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(name, "name");
        kotlin.jvm.internal.t.f(suffix, "suffix");
        int i10 = i(fVar, json, name);
        if (i10 != -3) {
            return i10;
        }
        throw new SerializationException(fVar.i() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int k(he.f fVar, kotlinx.serialization.json.b bVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        return j(fVar, bVar, str, str2);
    }

    private static final int l(he.f fVar, kotlinx.serialization.json.b bVar, String str) {
        Integer num = e(bVar, fVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final kotlinx.serialization.json.z m(he.f fVar, kotlinx.serialization.json.b json) {
        kotlin.jvm.internal.t.f(fVar, "<this>");
        kotlin.jvm.internal.t.f(json, "json");
        if (!kotlin.jvm.internal.t.a(fVar.d(), he.n.a.f15864a)) {
            return null;
        }
        json.e().l();
        return null;
    }
}
