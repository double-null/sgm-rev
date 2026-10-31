package q8;

import b8.y;
import java.util.Objects;
import u7.h0;

/* JADX INFO: compiled from: TrackSelectorResult.java */
/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y[] f24612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q[] f24613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0 f24614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f24615e;

    public w(y[] yVarArr, q[] qVarArr, h0 h0Var, Object obj) {
        x7.a.a(yVarArr.length == qVarArr.length);
        this.f24612b = yVarArr;
        this.f24613c = (q[]) qVarArr.clone();
        this.f24614d = h0Var;
        this.f24615e = obj;
        this.f24611a = yVarArr.length;
    }

    public boolean a(w wVar) {
        if (wVar == null || wVar.f24613c.length != this.f24613c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f24613c.length; i10++) {
            if (!b(wVar, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(w wVar, int i10) {
        return wVar != null && Objects.equals(this.f24612b[i10], wVar.f24612b[i10]) && Objects.equals(this.f24613c[i10], wVar.f24613c[i10]);
    }

    public boolean c(int i10) {
        return this.f24612b[i10] != null;
    }
}
