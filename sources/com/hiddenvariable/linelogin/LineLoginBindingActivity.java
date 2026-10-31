package com.hiddenvariable.linelogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import c6.d;
import i6.b;
import i6.c;

/* JADX INFO: loaded from: classes4.dex */
public class LineLoginBindingActivity extends Activity {
    private static final int kLoginRequestCode = 1;
    public static LineLoginCallback lineLoginCallback;
    private d responseCode = d.CANCEL;
    private String message = "";

    /* JADX INFO: renamed from: com.hiddenvariable.linelogin.LineLoginBindingActivity$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$linecorp$linesdk$LineApiResponseCode;

        static {
            int[] iArr = new int[d.values().length];
            $SwitchMap$com$linecorp$linesdk$LineApiResponseCode = iArr;
            try {
                iArr[d.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$linecorp$linesdk$LineApiResponseCode[d.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 != 1) {
            Log.e("LINE", "Invalid request code: " + i10);
            LineLoginCallback lineLoginCallback2 = lineLoginCallback;
            if (lineLoginCallback2 != null) {
                lineLoginCallback2.onResult(d.INTERNAL_ERROR.ordinal(), "Invalid request code: " + i10);
            }
            finish();
            return;
        }
        c cVarC = b.c(intent);
        this.responseCode = cVarC.c();
        this.message = "";
        int i12 = AnonymousClass1.$SwitchMap$com$linecorp$linesdk$LineApiResponseCode[cVarC.c().ordinal()];
        if (i12 == 1) {
            Log.i("LINE", "Login success!");
            LineLoginBinding.lineAccessToken = cVarC.b().a();
        } else if (i12 != 2) {
            Log.e("LINE", "Login failed due to " + cVarC.c());
            Log.e("LINE", cVarC.a().toString());
            this.message = cVarC.a().toString();
        } else {
            Log.i("LINE", "User canceled login.");
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.responseCode = d.CANCEL;
        this.message = "";
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        LineLoginCallback lineLoginCallback2 = lineLoginCallback;
        if (lineLoginCallback2 != null) {
            lineLoginCallback2.onResult(this.responseCode.ordinal(), this.message);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        startActivityForResult(b.b(getApplicationContext(), getIntent().getStringExtra("channelId")), 1);
    }
}
