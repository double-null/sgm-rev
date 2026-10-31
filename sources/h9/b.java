package h9;

import com.google.common.base.c;
import com.google.common.primitives.f;
import u7.u;
import u7.v;

/* JADX INFO: compiled from: VorbisComment.java */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class b implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15756b;

    public b(String str, String str2) {
        this.f15755a = c.f(str);
        this.f15756b = str2;
    }

    @Override // u7.v.a
    public void b(u.b bVar) {
        String str = this.f15755a;
        str.hashCode();
        switch (str) {
            case "TOTALTRACKS":
                Integer numN = f.n(this.f15756b);
                if (numN != null) {
                    bVar.r0(numN);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numN2 = f.n(this.f15756b);
                if (numN2 != null) {
                    bVar.q0(numN2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numN3 = f.n(this.f15756b);
                if (numN3 != null) {
                    bVar.s0(numN3);
                    break;
                }
                break;
            case "ALBUM":
                bVar.P(this.f15756b);
                break;
            case "GENRE":
                bVar.c0(this.f15756b);
                break;
            case "TITLE":
                bVar.p0(this.f15756b);
                break;
            case "DESCRIPTION":
                bVar.W(this.f15756b);
                break;
            case "DISCNUMBER":
                Integer numN4 = f.n(this.f15756b);
                if (numN4 != null) {
                    bVar.X(numN4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                bVar.O(this.f15756b);
                break;
            case "ARTIST":
                bVar.Q(this.f15756b);
                break;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15755a.equals(bVar.f15755a) && this.f15756b.equals(bVar.f15756b);
    }

    public int hashCode() {
        return ((527 + this.f15755a.hashCode()) * 31) + this.f15756b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f15755a + "=" + this.f15756b;
    }
}
