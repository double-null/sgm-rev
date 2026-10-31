package com.linecorp.linesdk.auth.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import c6.g;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class LineAuthenticationActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f12664a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f12665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f12666c;

    public static Intent a(Context context, i6.a aVar, List<String> list) {
        Intent intent = new Intent(context, (Class<?>) LineAuthenticationActivity.class);
        intent.putExtra("authentication_config", aVar);
        intent.putExtra("permissions", (String[]) list.toArray(new String[list.size()]));
        return intent;
    }

    public static i6.c b(Intent intent) {
        i6.c cVar = (i6.c) intent.getParcelableExtra("authentication_result");
        return cVar == null ? new i6.c(c6.d.INTERNAL_ERROR, new c6.b("Authentication result is not found.")) : cVar;
    }

    final void c(i6.c cVar) {
        d dVar = this.f12665b;
        if (dVar == null) {
            finish();
            return;
        }
        int i10 = dVar.f12697d;
        if ((i10 != d.b.f12699b || this.f12664a) && i10 != d.b.f12701d) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("authentication_result", cVar);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (this.f12665b.f12697d == d.b.f12699b) {
            c cVar = this.f12666c;
            if (i10 != 3 || cVar.f12690h.f12697d == d.b.f12700c) {
                return;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new c.b(cVar, (byte) 0), 1000L);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        d dVar;
        super.onCreate(bundle);
        setContentView(g.f4777a);
        Intent intent = getIntent();
        i6.a aVar = (i6.a) intent.getParcelableExtra("authentication_config");
        if (aVar == null) {
            c(new i6.c(c6.d.INTERNAL_ERROR, new c6.b("The requested parameter is illegal.")));
            return;
        }
        if (bundle == null || (dVar = (d) bundle.getParcelable("authenticationStatus")) == null) {
            dVar = new d();
        }
        this.f12665b = dVar;
        this.f12666c = new c(this, aVar, dVar, intent.getStringArrayExtra("permissions"));
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        a.c cVarA;
        super.onNewIntent(intent);
        if (this.f12665b.f12697d == d.b.f12699b) {
            c cVar = this.f12666c;
            cVar.f12690h.f12697d = d.b.f12700c;
            a aVar = cVar.f12687e;
            Uri data = intent.getData();
            if (data == null) {
                cVarA = a.c.a("Illegal redirection from external application.");
            } else {
                String str = aVar.f12668a.f12696c;
                String queryParameter = data.getQueryParameter(ServerProtocol.DIALOG_PARAM_STATE);
                if (str == null || !str.equals(queryParameter)) {
                    cVarA = a.c.a("Illegal parameter value of 'state'.");
                } else {
                    String queryParameter2 = data.getQueryParameter("code");
                    cVarA = !TextUtils.isEmpty(queryParameter2) ? new a.c(queryParameter2, null, null, null) : new a.c(null, data.getQueryParameter("error"), data.getQueryParameter(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION), null);
                }
            }
            if (!cVarA.b()) {
                cVar.f12690h.f12697d = d.b.f12701d;
                cVar.f12683a.c(new i6.c(cVarA.c() ? c6.d.AUTHENTICATION_AGENT_ERROR : c6.d.INTERNAL_ERROR, cVarA.d()));
                return;
            }
            c.a aVar2 = new c.a(cVar, (byte) 0);
            String[] strArr = new String[1];
            if (TextUtils.isEmpty(cVarA.f12676a)) {
                throw new UnsupportedOperationException("requestToken is null. Please check result by isSuccess before.");
            }
            strArr[0] = cVarA.f12676a;
            aVar2.execute(strArr);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("authenticationStatus", this.f12665b);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        int i10 = this.f12665b.f12697d;
        byte b10 = 0;
        if (i10 == d.b.f12698a) {
            c cVar = this.f12666c;
            cVar.f12690h.f12697d = d.b.f12699b;
            new c.AsyncTaskC0167c(cVar, b10).execute(new Void[0]);
        } else if (i10 != d.b.f12700c) {
            new Handler(Looper.getMainLooper()).postDelayed(new c.b(this.f12666c, b10), 1000L);
        }
        this.f12664a = false;
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f12664a = true;
    }
}
