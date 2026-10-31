package ob;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ob.f;
import pb.b0;
import wb.d0;

/* JADX INFO: loaded from: classes5.dex */
public class b<MeasurerType extends f<ViewType>, ViewType extends View> implements f<ViewType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<MeasurerType> f23332a;

    public b(List<MeasurerType> list) {
        this.f23332a = new CopyOnWriteArrayList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Handler handler, Runnable runnable) {
        this.f23332a.clear();
        handler.post(runnable);
    }

    @Override // ob.f
    public void R(ViewType viewtype, ViewGroup viewGroup) {
        Iterator<MeasurerType> it = this.f23332a.iterator();
        while (it.hasNext()) {
            it.next().R(viewtype, viewGroup);
        }
    }

    @Override // ob.f
    public void T(ViewType viewtype) {
        Iterator<MeasurerType> it = this.f23332a.iterator();
        while (it.hasNext()) {
            it.next().T(viewtype);
        }
    }

    @Override // ob.f
    public void a(b0 b0Var) {
        Iterator<MeasurerType> it = this.f23332a.iterator();
        while (it.hasNext()) {
            it.next().a(b0Var);
        }
    }

    @Override // ob.f
    public void i(final Runnable runnable) {
        final Handler handlerC = d0.c();
        qb.b bVar = runnable != null ? new qb.b(this.f23332a.size(), new Runnable() { // from class: ob.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f23329a.c(handlerC, runnable);
            }
        }) : null;
        Iterator<MeasurerType> it = this.f23332a.iterator();
        while (it.hasNext()) {
            it.next().i(bVar);
        }
    }

    @Override // ob.f
    public void onClicked() {
        Iterator<MeasurerType> it = this.f23332a.iterator();
        while (it.hasNext()) {
            it.next().onClicked();
        }
    }

    @Override // ob.f
    public void onShown() {
        Iterator<MeasurerType> it = this.f23332a.iterator();
        while (it.hasNext()) {
            it.next().onShown();
        }
    }

    @Override // ob.f
    public void u(ViewType viewtype) {
        Iterator<MeasurerType> it = this.f23332a.iterator();
        while (it.hasNext()) {
            it.next().u(viewtype);
        }
    }
}
