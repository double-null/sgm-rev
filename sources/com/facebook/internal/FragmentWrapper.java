package com.facebook.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import be.LNO.fzLzfW;

/* JADX INFO: compiled from: FragmentWrapper.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FragmentWrapper {
    private Fragment nativeFragment;
    private androidx.fragment.app.Fragment supportFragment;

    public FragmentWrapper(androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        this.supportFragment = fragment;
    }

    public final Activity getActivity() {
        androidx.fragment.app.Fragment fragment = this.supportFragment;
        if (fragment != null) {
            if (fragment != null) {
                return fragment.getActivity();
            }
            return null;
        }
        Fragment fragment2 = this.nativeFragment;
        if (fragment2 != null) {
            return fragment2.getActivity();
        }
        return null;
    }

    public final Fragment getNativeFragment() {
        return this.nativeFragment;
    }

    public final androidx.fragment.app.Fragment getSupportFragment() {
        return this.supportFragment;
    }

    public final void startActivityForResult(Intent intent, int i10) {
        androidx.fragment.app.Fragment fragment = this.supportFragment;
        if (fragment != null) {
            if (fragment != null) {
                fragment.startActivityForResult(intent, i10);
            }
        } else {
            Fragment fragment2 = this.nativeFragment;
            if (fragment2 != null) {
                fragment2.startActivityForResult(intent, i10);
            }
        }
    }

    public FragmentWrapper(Fragment fragment) {
        kotlin.jvm.internal.t.f(fragment, fzLzfW.CTacDJh);
        this.nativeFragment = fragment;
    }
}
