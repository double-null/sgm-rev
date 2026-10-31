package com.facebook.login;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import wc.g0;

/* JADX INFO: compiled from: FBLoginSSONoAppDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FBLoginSSONoAppDialog extends androidx.fragment.app.d {
    private static final String ARG_FB4A_OUTDATED = "fb4a_outdated";
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "FBLoginSSONoAppDialog";
    private boolean continueClicked;
    private id.a<g0> onContinueListener;
    private id.a<g0> onDismissListener;

    /* JADX INFO: compiled from: FBLoginSSONoAppDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ FBLoginSSONoAppDialog newInstance$default(Companion companion, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.newInstance(z10);
        }

        public final FBLoginSSONoAppDialog newInstance(boolean z10) {
            FBLoginSSONoAppDialog fBLoginSSONoAppDialog = new FBLoginSSONoAppDialog();
            Bundle bundle = new Bundle();
            bundle.putBoolean(FBLoginSSONoAppDialog.ARG_FB4A_OUTDATED, z10);
            fBLoginSSONoAppDialog.setArguments(bundle);
            return fBLoginSSONoAppDialog;
        }
    }

    public static final FBLoginSSONoAppDialog newInstance(boolean z10) {
        return Companion.newInstance(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$0(FBLoginSSONoAppDialog this$0, View view) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$1(FBLoginSSONoAppDialog this$0, View view) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$2(FBLoginSSONoAppDialog this$0, View view) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        this$0.continueClicked = true;
        id.a<g0> aVar = this$0.onContinueListener;
        if (aVar != null) {
            aVar.invoke();
        }
        this$0.dismiss();
    }

    @Override // androidx.lifecycle.e
    public /* bridge */ /* synthetic */ m0.a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    public final id.a<g0> getOnContinueListener() {
        return this.onContinueListener;
    }

    public final id.a<g0> getOnDismissListener() {
        return this.onDismissListener;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, com.facebook.common.R.style.com_facebook_sso_noapp_dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.t.f(inflater, "inflater");
        View view = inflater.inflate(com.facebook.common.R.layout.com_facebook_sso_noapp_dialog, viewGroup, false);
        Bundle arguments = getArguments();
        if (arguments != null ? arguments.getBoolean(ARG_FB4A_OUTDATED, false) : false) {
            ((TextView) view.findViewById(com.facebook.common.R.id.com_facebook_sso_noapp_title)).setText(com.facebook.common.R.string.com_facebook_sso_outdated_title);
            ((TextView) view.findViewById(com.facebook.common.R.id.com_facebook_sso_noapp_body)).setText(com.facebook.common.R.string.com_facebook_sso_outdated_body);
        }
        view.findViewById(com.facebook.common.R.id.com_facebook_sso_noapp_close).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FBLoginSSONoAppDialog.onCreateView$lambda$0(this.f11141a, view2);
            }
        });
        view.findViewById(com.facebook.common.R.id.com_facebook_sso_noapp_not_now).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FBLoginSSONoAppDialog.onCreateView$lambda$1(this.f11142a, view2);
            }
        });
        view.findViewById(com.facebook.common.R.id.com_facebook_sso_noapp_continue).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FBLoginSSONoAppDialog.onCreateView$lambda$2(this.f11143a, view2);
            }
        });
        kotlin.jvm.internal.t.e(view, "view");
        return view;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.onContinueListener = null;
        this.onDismissListener = null;
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        id.a<g0> aVar;
        kotlin.jvm.internal.t.f(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.continueClicked || (aVar = this.onDismissListener) == null) {
            return;
        }
        aVar.invoke();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        boolean z10 = getResources().getConfiguration().orientation == 2;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawableResource(android.R.color.transparent);
        if (z10) {
            window.setLayout((int) (((double) getResources().getDisplayMetrics().widthPixels) * 0.6d), -2);
            window.setGravity(17);
        } else {
            window.setLayout(-1, -2);
            window.setGravity(80);
        }
    }

    public final void setOnContinueListener(id.a<g0> aVar) {
        this.onContinueListener = aVar;
    }

    public final void setOnDismissListener(id.a<g0> aVar) {
        this.onDismissListener = aVar;
    }
}
