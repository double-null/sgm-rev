package j9;

import com.google.common.collect.u;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import x7.l0;

/* JADX INFO: compiled from: TextInformationFrame.java */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final String f20737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u<String> f20738d;

    public n(String str, String str2, List<String> list) {
        super(str);
        x7.a.a(!list.isEmpty());
        this.f20736b = str2;
        u<String> uVarB = u.B(list);
        this.f20738d = uVarB;
        this.f20737c = uVarB.get(0);
    }

    private static List<Integer> d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // u7.v.a
    public void b(u7.u.b bVar) {
        String str = this.f20724a;
        str.hashCode();
        byte b10 = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b10 = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b10 = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b10 = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b10 = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b10 = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b10 = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b10 = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b10 = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b10 = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b10 = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b10 = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b10 = 11;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    b10 = 12;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b10 = 13;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b10 = 14;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b10 = 15;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b10 = 16;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b10 = 17;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b10 = 18;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b10 = 19;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b10 = 20;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b10 = 21;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b10 = 22;
                }
                break;
        }
        try {
            switch (b10) {
                case 0:
                case 10:
                    bVar.P(this.f20738d.get(0));
                    break;
                case 1:
                case 11:
                    bVar.U(this.f20738d.get(0));
                    break;
                case 2:
                case 13:
                    String str2 = this.f20738d.get(0);
                    bVar.h0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).g0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    bVar.Q(this.f20738d.get(0));
                    break;
                case 4:
                case 19:
                    bVar.O(this.f20738d.get(0));
                    break;
                case 5:
                case 20:
                    bVar.V(this.f20738d.get(0));
                    break;
                case 6:
                case 21:
                    String[] strArrM1 = l0.m1(this.f20738d.get(0), "/");
                    bVar.s0(Integer.valueOf(Integer.parseInt(strArrM1[0]))).r0(strArrM1.length > 1 ? Integer.valueOf(Integer.parseInt(strArrM1[1])) : null);
                    break;
                case 7:
                case 17:
                    bVar.p0(this.f20738d.get(0));
                    break;
                case 8:
                case 16:
                    bVar.t0(this.f20738d.get(0));
                    break;
                case 9:
                case 22:
                    bVar.i0(Integer.valueOf(Integer.parseInt(this.f20738d.get(0))));
                    break;
                case 12:
                    Integer numN = com.google.common.primitives.f.n(this.f20738d.get(0));
                    if (numN != null) {
                        String strA = j.a(numN.intValue());
                        if (strA != null) {
                            bVar.c0(strA);
                        }
                    } else {
                        bVar.c0(this.f20738d.get(0));
                    }
                    break;
                case 14:
                    List<Integer> listD = d(this.f20738d.get(0));
                    int size = listD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.g0(listD.get(2));
                            }
                        }
                        bVar.h0(listD.get(1));
                    }
                    bVar.i0(listD.get(0));
                    break;
                case 15:
                    List<Integer> listD2 = d(this.f20738d.get(0));
                    int size2 = listD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.j0(listD2.get(2));
                            }
                        }
                        bVar.k0(listD2.get(1));
                    }
                    bVar.l0(listD2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return Objects.equals(this.f20724a, nVar.f20724a) && Objects.equals(this.f20736b, nVar.f20736b) && this.f20738d.equals(nVar.f20738d);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f20724a.hashCode()) * 31;
        String str = this.f20736b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f20738d.hashCode();
    }

    @Override // j9.i
    public String toString() {
        return this.f20724a + ": description=" + this.f20736b + ": values=" + this.f20738d;
    }
}
