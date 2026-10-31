package g7;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class k extends o<View> {
    public k(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // g7.o
    View h(Context context, n nVar) {
        return "text".equals(nVar.K()) ? new m7.e(context) : new m7.a(context);
    }

    @Override // g7.o
    protected n j(Context context, n nVar) {
        return (nVar == null || !"text".equals(nVar.K())) ? a.f15396h : a.f15397i;
    }

    public void r(int i10, int i11) {
        View view = this.f15481b;
        if (!(view instanceof m7.e)) {
            if (view instanceof m7.a) {
                ((m7.a) view).g(i10, i11);
            }
        } else {
            m7.e eVar = (m7.e) view;
            if (i11 == 0) {
                eVar.setText("");
            } else {
                eVar.setRemaining(i11);
            }
        }
    }
}
