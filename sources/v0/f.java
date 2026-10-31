package v0;

import android.database.Cursor;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: TableInfo.java */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, a> f27081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<b> f27082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<d> f27083d;

    /* JADX INFO: compiled from: TableInfo.java */
    /* JADX INFO: loaded from: classes2.dex */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f27085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f27086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f27087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f27088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f27089f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f27090g;

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            this.f27084a = str;
            this.f27085b = str2;
            this.f27087d = z10;
            this.f27088e = i10;
            this.f27086c = a(str2);
            this.f27089f = str3;
            this.f27090g = i11;
        }

        private static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f27088e != aVar.f27088e || !this.f27084a.equals(aVar.f27084a) || this.f27087d != aVar.f27087d) {
                return false;
            }
            if (this.f27090g == 1 && aVar.f27090g == 2 && (str3 = this.f27089f) != null && !str3.equals(aVar.f27089f)) {
                return false;
            }
            if (this.f27090g == 2 && aVar.f27090g == 1 && (str2 = aVar.f27089f) != null && !str2.equals(this.f27089f)) {
                return false;
            }
            int i10 = this.f27090g;
            return (i10 == 0 || i10 != aVar.f27090g || ((str = this.f27089f) == null ? aVar.f27089f == null : str.equals(aVar.f27089f))) && this.f27086c == aVar.f27086c;
        }

        public int hashCode() {
            return (((((this.f27084a.hashCode() * 31) + this.f27086c) * 31) + (this.f27087d ? 1231 : 1237)) * 31) + this.f27088e;
        }

        public String toString() {
            return KBBdKxoAiHo.guSkQ + this.f27084a + "', type='" + this.f27085b + "', affinity='" + this.f27086c + "', notNull=" + this.f27087d + ", primaryKeyPosition=" + this.f27088e + ", defaultValue='" + this.f27089f + "'}";
        }
    }

    /* JADX INFO: compiled from: TableInfo.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f27092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f27093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<String> f27094d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<String> f27095e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f27091a = str;
            this.f27092b = str2;
            this.f27093c = str3;
            this.f27094d = Collections.unmodifiableList(list);
            this.f27095e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f27091a.equals(bVar.f27091a) && this.f27092b.equals(bVar.f27092b) && this.f27093c.equals(bVar.f27093c) && this.f27094d.equals(bVar.f27094d)) {
                return this.f27095e.equals(bVar.f27095e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f27091a.hashCode() * 31) + this.f27092b.hashCode()) * 31) + this.f27093c.hashCode()) * 31) + this.f27094d.hashCode()) * 31) + this.f27095e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f27091a + "', onDelete='" + this.f27092b + "', onUpdate='" + this.f27093c + "', columnNames=" + this.f27094d + ", referenceColumnNames=" + this.f27095e + '}';
        }
    }

    /* JADX INFO: compiled from: TableInfo.java */
    static class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f27096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f27097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f27098c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final String f27099d;

        c(int i10, int i11, String str, String str2) {
            this.f27096a = i10;
            this.f27097b = i11;
            this.f27098c = str;
            this.f27099d = str2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i10 = this.f27096a - cVar.f27096a;
            return i10 == 0 ? this.f27097b - cVar.f27097b : i10;
        }
    }

    /* JADX INFO: compiled from: TableInfo.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f27101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<String> f27102c;

        public d(String str, boolean z10, List<String> list) {
            this.f27100a = str;
            this.f27101b = z10;
            this.f27102c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f27101b == dVar.f27101b && this.f27102c.equals(dVar.f27102c)) {
                return this.f27100a.startsWith("index_") ? dVar.f27100a.startsWith("index_") : this.f27100a.equals(dVar.f27100a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f27100a.startsWith("index_") ? -1184239155 : this.f27100a.hashCode()) * 31) + (this.f27101b ? 1 : 0)) * 31) + this.f27102c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f27100a + "', unique=" + this.f27101b + ", columns=" + this.f27102c + '}';
        }
    }

    public f(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.f27080a = str;
        this.f27081b = Collections.unmodifiableMap(map);
        this.f27082c = Collections.unmodifiableSet(set);
        this.f27083d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static f a(x0.b bVar, String str) {
        return new f(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }

    private static Map<String, a> b(x0.b bVar, String str) {
        Cursor cursorC0 = bVar.c0("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorC0.getColumnCount() > 0) {
                int columnIndex = cursorC0.getColumnIndex("name");
                int columnIndex2 = cursorC0.getColumnIndex("type");
                int columnIndex3 = cursorC0.getColumnIndex("notnull");
                int columnIndex4 = cursorC0.getColumnIndex("pk");
                int columnIndex5 = cursorC0.getColumnIndex("dflt_value");
                while (cursorC0.moveToNext()) {
                    String string = cursorC0.getString(columnIndex);
                    map.put(string, new a(string, cursorC0.getString(columnIndex2), cursorC0.getInt(columnIndex3) != 0, cursorC0.getInt(columnIndex4), cursorC0.getString(columnIndex5), 2));
                }
            }
            return map;
        } finally {
            cursorC0.close();
        }
    }

    private static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set<b> d(x0.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorC0 = bVar.c0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorC0.getColumnIndex("id");
            int columnIndex2 = cursorC0.getColumnIndex("seq");
            int columnIndex3 = cursorC0.getColumnIndex("table");
            int columnIndex4 = cursorC0.getColumnIndex("on_delete");
            int columnIndex5 = cursorC0.getColumnIndex("on_update");
            List<c> listC = c(cursorC0);
            int count = cursorC0.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                cursorC0.moveToPosition(i10);
                if (cursorC0.getInt(columnIndex2) == 0) {
                    int i11 = cursorC0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : listC) {
                        if (cVar.f27096a == i11) {
                            arrayList.add(cVar.f27098c);
                            arrayList2.add(cVar.f27099d);
                        }
                    }
                    hashSet.add(new b(cursorC0.getString(columnIndex3), cursorC0.getString(columnIndex4), cursorC0.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            cursorC0.close();
        }
    }

    private static d e(x0.b bVar, String str, boolean z10) {
        Cursor cursorC0 = bVar.c0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorC0.getColumnIndex("seqno");
            int columnIndex2 = cursorC0.getColumnIndex("cid");
            int columnIndex3 = cursorC0.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorC0.moveToNext()) {
                    if (cursorC0.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorC0.getInt(columnIndex)), cursorC0.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, z10, arrayList);
            }
            return null;
        } finally {
            cursorC0.close();
        }
    }

    private static Set<d> f(x0.b bVar, String str) {
        Cursor cursorC0 = bVar.c0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorC0.getColumnIndex("name");
            int columnIndex2 = cursorC0.getColumnIndex("origin");
            int columnIndex3 = cursorC0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (cursorC0.moveToNext()) {
                    if ("c".equals(cursorC0.getString(columnIndex2))) {
                        String string = cursorC0.getString(columnIndex);
                        boolean z10 = true;
                        if (cursorC0.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        d dVarE = e(bVar, string, z10);
                        if (dVarE == null) {
                            cursorC0.close();
                            return null;
                        }
                        hashSet.add(dVarE);
                    }
                }
                cursorC0.close();
                return hashSet;
            }
            cursorC0.close();
            return null;
        } catch (Throwable th) {
            cursorC0.close();
            throw th;
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f27080a;
        if (str == null ? fVar.f27080a != null : !str.equals(fVar.f27080a)) {
            return false;
        }
        Map<String, a> map = this.f27081b;
        if (map == null ? fVar.f27081b != null : !map.equals(fVar.f27081b)) {
            return false;
        }
        Set<b> set2 = this.f27082c;
        if (set2 == null ? fVar.f27082c != null : !set2.equals(fVar.f27082c)) {
            return false;
        }
        Set<d> set3 = this.f27083d;
        if (set3 == null || (set = fVar.f27083d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f27080a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f27081b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f27082c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f27080a + "', columns=" + this.f27081b + ", foreignKeys=" + this.f27082c + ", indices=" + this.f27083d + '}';
    }
}
