package ta;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import fb.b;
import kotlin.jvm.internal.t;
import la.g;
import pb.b0;
import pb.b1;
import pb.c1;
import pb.k1;
import pb.n;
import pb.r0;
import qa.c;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends qa.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ImageView f25785s;

    /* JADX INFO: renamed from: ta.a$a, reason: collision with other inner class name */
    private final class C0431a implements g.a {
        public C0431a() {
        }

        @Override // la.g.a
        public void a(b0 error) {
            t.f(error, "error");
        }

        @Override // la.g.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bitmap bitmap) {
            t.f(bitmap, "bitmap");
            a.this.f25785s.setImageBitmap(bitmap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Object assetsHolder, g repository, pb.a adElementParams, c adFormListener, b eventCallback, db.a aVar) {
        super(context, assetsHolder, repository, adElementParams, adFormListener, eventCallback, aVar);
        t.f(context, "context");
        t.f(assetsHolder, "assetsHolder");
        t.f(repository, "repository");
        t.f(adElementParams, "adElementParams");
        t.f(adFormListener, "adFormListener");
        t.f(eventCallback, "eventCallback");
        this.f25785s = new ImageView(context);
    }

    private final void O(r0 r0Var) {
        if (r0Var != null) {
            I().d(r0Var, H(), new C0431a());
        }
    }

    @Override // qa.a
    public View J() {
        return this.f25785s;
    }

    @Override // pa.d
    public void b() {
        r0.a aVar = r0.f24202b;
        O(aVar.c(g().k()));
        E().e(this);
        b1 b1VarL = g().l();
        c1 c1VarA = b1VarL != null ? b1VarL.a() : null;
        if (c1VarA == null) {
            O(aVar.a(g().n()));
            return;
        }
        if (c1VarA instanceof n) {
            O(aVar.b(((n) c1VarA).a()));
            return;
        }
        if (c1VarA instanceof k1) {
            O(aVar.e(((k1) c1VarA).a()));
            return;
        }
        C("Invalid resource type (" + c1VarA.getClass().getSimpleName() + "), it should be Base64ResourceSource or UrlResourceSource");
    }
}
