package g7;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class r extends o<View> {
    public r(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // g7.o
    View h(Context context, n nVar) {
        if ("text".equals(nVar.K()) || "text-reverse".equals(nVar.K())) {
            return new m7.e(context);
        }
        return ("circular".equals(nVar.K()) || "circular-reverse".equals(nVar.K())) ? new m7.a(context) : new m7.d(context);
    }

    @Override // g7.o
    protected n j(Context context, n nVar) {
        if (nVar != null) {
            if ("text".equals(nVar.K()) || "text-reverse".equals(nVar.K())) {
                return a.f15401m;
            }
            if ("circular".equals(nVar.K()) || "circular-reverse".equals(nVar.K())) {
                return a.f15403o;
            }
        }
        return a.f15402n;
    }

    public void r(float f10, int i10, int i11) {
        n nVar = this.f15482c;
        if (nVar == null) {
            return;
        }
        boolean z10 = nVar.K() != null && this.f15482c.K().endsWith("reverse");
        View view = this.f15481b;
        if (view instanceof m7.e) {
            m7.e eVar = (m7.e) view;
            if (i11 == 0) {
                eVar.setText("");
                return;
            }
            if (z10) {
                i10 = i11 - i10;
            }
            eVar.setRemaining(Math.max(1, i10));
            return;
        }
        if (view instanceof m7.a) {
            m7.a aVar = (m7.a) view;
            if (z10) {
                aVar.g(f10, i11 != 0 ? Math.max(1, i11 - i10) : 0);
                return;
            } else {
                aVar.g(100.0f - f10, i10);
                return;
            }
        }
        if (view instanceof m7.d) {
            m7.d dVar = (m7.d) view;
            if (z10) {
                f10 = 100.0f - f10;
            }
            dVar.b(f10);
        }
    }
}
