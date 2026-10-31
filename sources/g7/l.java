package g7;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class l extends o<m7.b> {
    public l(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // g7.o
    protected n j(Context context, n nVar) {
        return a.f15398j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g7.o
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void c(Context context, m7.b bVar, n nVar) {
        super.c(context, bVar, nVar);
        bVar.setText(!TextUtils.isEmpty(nVar.h()) ? nVar.h() : "Learn more");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g7.o
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public m7.b h(Context context, n nVar) {
        return new m7.b(context);
    }
}
