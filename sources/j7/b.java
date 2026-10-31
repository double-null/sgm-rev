package j7;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import g7.y;
import h7.g;
import h7.j;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l7.m;
import l7.n;
import l7.w;

/* JADX INFO: loaded from: classes4.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f20653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f20654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f20655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f20656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f20657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f20658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f20659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f20660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EnumMap f20661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private l7.e f20662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f20663k = new ArrayList();

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    b(m mVar, n nVar) {
        this.f20653a = mVar;
        this.f20654b = nVar;
    }

    void a(j jVar) {
        g gVar = this.f20655c;
        if (gVar != null) {
            gVar.X(jVar);
        }
    }

    void b(ArrayList arrayList) {
        this.f20659g = arrayList;
    }

    void c(EnumMap enumMap) {
        this.f20661i = enumMap;
    }

    void d(l7.e eVar) {
        this.f20662j = eVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    void e(ArrayList arrayList) {
        this.f20656d = arrayList;
    }

    void f(ArrayList arrayList) {
        this.f20658f = arrayList;
    }

    void g(ArrayList arrayList) {
        this.f20657e = arrayList;
    }

    public List<l7.d> h() {
        return this.f20663k;
    }

    public l7.e i() {
        return this.f20662j;
    }

    public l7.g j(Context context) {
        ArrayList arrayList = this.f20656d;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (l7.g gVar : this.f20656d) {
                int iA0 = gVar.A0();
                int iW0 = gVar.w0();
                if (iA0 > -1 && iW0 > -1) {
                    if (y.m(context) && iA0 == 728 && iW0 == 90) {
                        return gVar;
                    }
                    if (!y.m(context) && iA0 == 320 && iW0 == 50) {
                        return gVar;
                    }
                }
            }
        }
        return null;
    }

    public String k() {
        w wVarB0 = this.f20653a.B0();
        if (wVarB0 != null) {
            return wVarB0.t0();
        }
        return null;
    }

    public List<String> l() {
        return this.f20659g;
    }

    public l7.g m(int i10, int i11) {
        ArrayList arrayList = this.f20656d;
        if (arrayList != null && !arrayList.isEmpty()) {
            HashMap map = new HashMap();
            for (l7.g gVar : this.f20656d) {
                int iA0 = gVar.A0();
                int iW0 = gVar.w0();
                if (iA0 > -1 && iW0 > -1) {
                    float fMax = Math.max(iA0, iW0) / Math.min(iA0, iW0);
                    if (Math.min(iA0, iW0) >= 250 && fMax <= 2.5d && gVar.B0()) {
                        map.put(Float.valueOf(iA0 / iW0), gVar);
                    }
                }
            }
            if (!map.isEmpty()) {
                float f10 = i10 / i11;
                Set setKeySet = map.keySet();
                float fFloatValue = ((Float) setKeySet.iterator().next()).floatValue();
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    float fFloatValue2 = ((Float) it.next()).floatValue();
                    if (Math.abs(fFloatValue - f10) > Math.abs(fFloatValue2 - f10)) {
                        fFloatValue = fFloatValue2;
                    }
                }
                return (l7.g) map.get(Float.valueOf(fFloatValue));
            }
            a(j.f15705m);
        }
        return null;
    }

    public Float n() {
        return this.f20653a.y0();
    }

    public List<String> o() {
        return this.f20658f;
    }

    public List<String> p() {
        return this.f20657e;
    }

    public n q() {
        return this.f20654b;
    }

    public Map<h7.a, List<String>> r() {
        return this.f20661i;
    }

    public ArrayList<String> s() {
        return this.f20660h;
    }

    public void t(List<l7.d> list) {
        this.f20663k = list;
    }

    public void u(g gVar) {
        this.f20655c = gVar;
    }

    public void v(ArrayList<String> arrayList) {
        this.f20660h = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeSerializable(this.f20653a);
        parcel.writeSerializable(this.f20654b);
        parcel.writeSerializable(this.f20656d);
        parcel.writeStringList(this.f20657e);
        parcel.writeStringList(this.f20658f);
        parcel.writeStringList(this.f20659g);
        parcel.writeStringList(this.f20660h);
        parcel.writeSerializable(this.f20661i);
        parcel.writeSerializable(this.f20662j);
        parcel.writeList(this.f20663k);
    }

    protected b(Parcel parcel) {
        this.f20653a = (m) parcel.readSerializable();
        this.f20654b = (n) parcel.readSerializable();
        this.f20656d = (ArrayList) parcel.readSerializable();
        this.f20657e = parcel.createStringArrayList();
        this.f20658f = parcel.createStringArrayList();
        this.f20659g = parcel.createStringArrayList();
        this.f20660h = parcel.createStringArrayList();
        this.f20661i = (EnumMap) parcel.readSerializable();
        this.f20662j = (l7.e) parcel.readSerializable();
        parcel.readList(this.f20663k, l7.d.class.getClassLoader());
    }
}
