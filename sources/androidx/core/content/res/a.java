package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r.g;

/* JADX INFO: compiled from: FontResourcesParserCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: androidx.core.content.res.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    static class C0033a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    public interface b {
    }

    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d[] f1818a;

        public c(d[] dVarArr) {
            this.f1818a = dVarArr;
        }

        public d[] a() {
            return this.f1818a;
        }
    }

    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f1821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f1822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f1823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f1824f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f1819a = str;
            this.f1820b = i10;
            this.f1821c = z10;
            this.f1822d = str2;
            this.f1823e = i11;
            this.f1824f = i12;
        }

        public String a() {
            return this.f1819a;
        }

        public int b() {
            return this.f1824f;
        }

        public int c() {
            return this.f1823e;
        }

        public String d() {
            return this.f1822d;
        }

        public int e() {
            return this.f1820b;
        }

        public boolean f() {
            return this.f1821c;
        }
    }

    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    public static final class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u.e f1825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1827c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f1828d;

        public e(u.e eVar, int i10, int i11, String str) {
            this.f1825a = eVar;
            this.f1827c = i10;
            this.f1826b = i11;
            this.f1828d = str;
        }

        public int a() {
            return this.f1827c;
        }

        public u.e b() {
            return this.f1825a;
        }

        public String c() {
            return this.f1828d;
        }

        public int d() {
            return this.f1826b;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return C0033a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), g.f24839c);
        String string = typedArrayObtainAttributes.getString(g.f24840d);
        String string2 = typedArrayObtainAttributes.getString(g.f24844h);
        String string3 = typedArrayObtainAttributes.getString(g.f24845i);
        int resourceId = typedArrayObtainAttributes.getResourceId(g.f24841e, 0);
        int integer = typedArrayObtainAttributes.getInteger(g.f24842f, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(g.f24843g, 500);
        String string4 = typedArrayObtainAttributes.getString(g.f24846j);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new e(new u.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), g.f24847k);
        int i10 = g.f24856t;
        if (!typedArrayObtainAttributes.hasValue(i10)) {
            i10 = g.f24849m;
        }
        int i11 = typedArrayObtainAttributes.getInt(i10, 400);
        int i12 = g.f24854r;
        if (!typedArrayObtainAttributes.hasValue(i12)) {
            i12 = g.f24850n;
        }
        boolean z10 = 1 == typedArrayObtainAttributes.getInt(i12, 0);
        int i13 = g.f24857u;
        if (!typedArrayObtainAttributes.hasValue(i13)) {
            i13 = g.f24851o;
        }
        int i14 = g.f24855s;
        if (!typedArrayObtainAttributes.hasValue(i14)) {
            i14 = g.f24852p;
        }
        String string = typedArrayObtainAttributes.getString(i14);
        int i15 = typedArrayObtainAttributes.getInt(i13, 0);
        int i16 = g.f24853q;
        if (!typedArrayObtainAttributes.hasValue(i16)) {
            i16 = g.f24848l;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i16, 0);
        String string2 = typedArrayObtainAttributes.getString(i16);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i11, z10, string, i15, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
