package com.prime31;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public class FacebookLoginProxyActivity extends Activity {
    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (FacebookPluginBase.getActivity().getResources().getConfiguration().orientation == 2) {
            setTheme(R.style.Theme.NoTitleBar.Fullscreen);
        }
    }
}
