package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.z0;
import androidx.lifecycle.g0;
import com.facebook.internal.AnalyticsEvents;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;

/* JADX INFO: compiled from: FragmentStateManager.java */
/* JADX INFO: loaded from: classes2.dex */
class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f2731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f2732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Fragment f2733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2734d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2735e = -1;

    /* JADX INFO: compiled from: FragmentStateManager.java */
    /* JADX INFO: loaded from: classes.dex */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2738a;

        static {
            int[] iArr = new int[androidx.lifecycle.f.b.values().length];
            f2738a = iArr;
            try {
                iArr[androidx.lifecycle.f.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2738a[androidx.lifecycle.f.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2738a[androidx.lifecycle.f.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2738a[androidx.lifecycle.f.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    t(m mVar, u uVar, Fragment fragment) {
        this.f2731a = mVar;
        this.f2732b = uVar;
        this.f2733c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f2733c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f2733c.mView) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f2733c.performSaveInstanceState(bundle);
        this.f2731a.j(this.f2733c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f2733c.mView != null) {
            s();
        }
        if (this.f2733c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f2733c.mSavedViewState);
        }
        if (this.f2733c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f2733c.mSavedViewRegistryState);
        }
        if (!this.f2733c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f2733c.mUserVisibleHint);
        }
        return bundle;
    }

    void a() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f2733c);
        }
        Fragment fragment = this.f2733c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        m mVar = this.f2731a;
        Fragment fragment2 = this.f2733c;
        mVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    void b() {
        int iJ = this.f2732b.j(this.f2733c);
        Fragment fragment = this.f2733c;
        fragment.mContainer.addView(fragment.mView, iJ);
    }

    void c() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f2733c);
        }
        Fragment fragment = this.f2733c;
        Fragment fragment2 = fragment.mTarget;
        t tVarM = null;
        if (fragment2 != null) {
            t tVarM2 = this.f2732b.m(fragment2.mWho);
            if (tVarM2 == null) {
                throw new IllegalStateException("Fragment " + this.f2733c + " declared target fragment " + this.f2733c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f2733c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            tVarM = tVarM2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (tVarM = this.f2732b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f2733c + " declared target fragment " + this.f2733c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (tVarM != null && (n.P || tVarM.k().mState < 1)) {
            tVarM.m();
        }
        Fragment fragment4 = this.f2733c;
        fragment4.mHost = fragment4.mFragmentManager.s0();
        Fragment fragment5 = this.f2733c;
        fragment5.mParentFragment = fragment5.mFragmentManager.v0();
        this.f2731a.g(this.f2733c, false);
        this.f2733c.performAttach();
        this.f2731a.b(this.f2733c, false);
    }

    int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f2733c;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int iMin = this.f2735e;
        int i10 = b.f2738a[fragment2.mMaxState.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i10 != 3) {
                iMin = i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        Fragment fragment3 = this.f2733c;
        if (fragment3.mFromLayout) {
            if (fragment3.mInLayout) {
                iMin = Math.max(this.f2735e, 2);
                View view = this.f2733c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f2735e < 4 ? Math.min(iMin, fragment3.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.f2733c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        b0.e.b bVarL = (!n.P || (viewGroup = (fragment = this.f2733c).mContainer) == null) ? null : b0.n(viewGroup, fragment.getParentFragmentManager()).l(this);
        if (bVarL == b0.e.b.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (bVarL == b0.e.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f2733c;
            if (fragment4.mRemoving) {
                iMin = fragment4.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f2733c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (n.D0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f2733c);
        }
        return iMin;
    }

    void e() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f2733c);
        }
        Fragment fragment = this.f2733c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f2733c.mState = 1;
            return;
        }
        this.f2731a.h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f2733c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        m mVar = this.f2731a;
        Fragment fragment3 = this.f2733c;
        mVar.c(fragment3, fragment3.mSavedFragmentState, false);
    }

    void f() {
        String resourceName;
        if (this.f2733c.mFromLayout) {
            return;
        }
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2733c);
        }
        Fragment fragment = this.f2733c;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        Fragment fragment2 = this.f2733c;
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup == null) {
            int i10 = fragment2.mContainerId;
            if (i10 == 0) {
                viewGroup = null;
            } else {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f2733c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.n0().c(this.f2733c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f2733c;
                    if (!fragment3.mRestored) {
                        try {
                            resourceName = fragment3.getResources().getResourceName(this.f2733c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f2733c.mContainerId) + " (" + resourceName + ") for fragment " + this.f2733c);
                    }
                }
            }
        }
        Fragment fragment4 = this.f2733c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f2733c.mView;
        if (view != null) {
            boolean z10 = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f2733c;
            fragment5.mView.setTag(j0.b.f20524a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f2733c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (z0.x(this.f2733c.mView)) {
                z0.G(this.f2733c.mView);
            } else {
                View view2 = this.f2733c.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f2733c.performViewCreated();
            m mVar = this.f2731a;
            Fragment fragment7 = this.f2733c;
            mVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f2733c.mView.getVisibility();
            float alpha = this.f2733c.mView.getAlpha();
            if (n.P) {
                this.f2733c.setPostOnViewCreatedAlpha(alpha);
                Fragment fragment8 = this.f2733c;
                if (fragment8.mContainer != null && visibility == 0) {
                    View viewFindFocus = fragment8.mView.findFocus();
                    if (viewFindFocus != null) {
                        this.f2733c.setFocusedView(viewFindFocus);
                        if (n.D0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f2733c);
                        }
                    }
                    this.f2733c.mView.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f2733c;
                if (visibility == 0 && fragment9.mContainer != null) {
                    z10 = true;
                }
                fragment9.mIsNewlyAdded = z10;
            }
        }
        this.f2733c.mState = 2;
    }

    void g() {
        Fragment fragmentF;
        if (n.D0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f2733c);
        }
        Fragment fragment = this.f2733c;
        boolean zIsChangingConfigurations = true;
        boolean z10 = fragment.mRemoving && !fragment.isInBackStack();
        if (!(z10 || this.f2732b.o().p(this.f2733c))) {
            String str = this.f2733c.mTargetWho;
            if (str != null && (fragmentF = this.f2732b.f(str)) != null && fragmentF.mRetainInstance) {
                this.f2733c.mTarget = fragmentF;
            }
            this.f2733c.mState = 0;
            return;
        }
        k<?> kVar = this.f2733c.mHost;
        if (kVar instanceof g0) {
            zIsChangingConfigurations = this.f2732b.o().m();
        } else if (kVar.f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) kVar.f()).isChangingConfigurations();
        }
        if (z10 || zIsChangingConfigurations) {
            this.f2732b.o().g(this.f2733c);
        }
        this.f2733c.performDestroy();
        this.f2731a.d(this.f2733c, false);
        for (t tVar : this.f2732b.k()) {
            if (tVar != null) {
                Fragment fragmentK = tVar.k();
                if (this.f2733c.mWho.equals(fragmentK.mTargetWho)) {
                    fragmentK.mTarget = this.f2733c;
                    fragmentK.mTargetWho = null;
                }
            }
        }
        Fragment fragment2 = this.f2733c;
        String str2 = fragment2.mTargetWho;
        if (str2 != null) {
            fragment2.mTarget = this.f2732b.f(str2);
        }
        this.f2732b.q(this);
    }

    void h() {
        View view;
        if (n.D0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f2733c);
        }
        Fragment fragment = this.f2733c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f2733c.performDestroyView();
        this.f2731a.n(this.f2733c, false);
        Fragment fragment2 = this.f2733c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.n(null);
        this.f2733c.mInLayout = false;
    }

    void i() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f2733c);
        }
        this.f2733c.performDetach();
        boolean z10 = false;
        this.f2731a.e(this.f2733c, false);
        Fragment fragment = this.f2733c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z10 = true;
        }
        if (z10 || this.f2732b.o().p(this.f2733c)) {
            if (n.D0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f2733c);
            }
            this.f2733c.initState();
        }
    }

    void j() {
        Fragment fragment = this.f2733c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (n.D0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2733c);
            }
            Fragment fragment2 = this.f2733c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f2733c.mSavedFragmentState);
            View view = this.f2733c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2733c;
                fragment3.mView.setTag(j0.b.f20524a, fragment3);
                Fragment fragment4 = this.f2733c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f2733c.performViewCreated();
                m mVar = this.f2731a;
                Fragment fragment5 = this.f2733c;
                mVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f2733c.mState = 2;
            }
        }
    }

    Fragment k() {
        return this.f2733c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f2734d) {
            if (n.D0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f2734d = true;
            while (true) {
                int iD = d();
                Fragment fragment = this.f2733c;
                int i10 = fragment.mState;
                if (iD == i10) {
                    if (n.P && fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            b0 b0VarN = b0.n(viewGroup, fragment.getParentFragmentManager());
                            if (this.f2733c.mHidden) {
                                b0VarN.c(this);
                            } else {
                                b0VarN.e(this);
                            }
                        }
                        Fragment fragment2 = this.f2733c;
                        fragment2.mHiddenChanged = false;
                        fragment2.onHiddenChanged(fragment2.mHidden);
                    }
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            this.f2733c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (n.D0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f2733c);
                            }
                            Fragment fragment3 = this.f2733c;
                            if (fragment3.mView != null && fragment3.mSavedViewState == null) {
                                s();
                            }
                            Fragment fragment4 = this.f2733c;
                            if (fragment4.mView != null && (viewGroup3 = fragment4.mContainer) != null) {
                                b0.n(viewGroup3, fragment4.getParentFragmentManager()).d(this);
                            }
                            this.f2733c.mState = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                b0.n(viewGroup2, fragment.getParentFragmentManager()).b(b0.e.c.c(this.f2733c.mView.getVisibility()), this);
                            }
                            this.f2733c.mState = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
            }
        } finally {
            this.f2734d = false;
        }
    }

    void n() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f2733c);
        }
        this.f2733c.performPause();
        this.f2731a.f(this.f2733c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f2733c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f2733c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f2733c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f2733c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f2733c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f2733c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f2733c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f2733c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    void p() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f2733c);
        }
        View focusedView = this.f2733c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (n.D0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(zRequestFocus ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f2733c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f2733c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f2733c.setFocusedView(null);
        this.f2733c.performResume();
        this.f2731a.i(this.f2733c, false);
        Fragment fragment = this.f2733c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    void s() {
        if (this.f2733c.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f2733c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f2733c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f2733c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f2733c.mSavedViewRegistryState = bundle;
    }

    void t(int i10) {
        this.f2735e = i10;
    }

    void u() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f2733c);
        }
        this.f2733c.performStart();
        this.f2731a.k(this.f2733c, false);
    }

    void v() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f2733c);
        }
        this.f2733c.performStop();
        this.f2731a.l(this.f2733c, false);
    }

    s r() {
        s sVar = new s(this.f2733c);
        Fragment fragment = this.f2733c;
        if (fragment.mState <= -1 || sVar.f2730m != null) {
            sVar.f2730m = fragment.mSavedFragmentState;
        } else {
            Bundle bundleQ = q();
            sVar.f2730m = bundleQ;
            if (this.f2733c.mTargetWho != null) {
                if (bundleQ == null) {
                    sVar.f2730m = new Bundle();
                }
                sVar.f2730m.putString(UyXgnuLGEkgnZE.nZaBxdgtBa, this.f2733c.mTargetWho);
                int i10 = this.f2733c.mTargetRequestCode;
                if (i10 != 0) {
                    sVar.f2730m.putInt("android:target_req_state", i10);
                }
            }
        }
        return sVar;
    }

    t(m mVar, u uVar, ClassLoader classLoader, j jVar, s sVar) {
        this.f2731a = mVar;
        this.f2732b = uVar;
        Fragment fragmentA = jVar.a(classLoader, sVar.f2718a);
        this.f2733c = fragmentA;
        Bundle bundle = sVar.f2727j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentA.setArguments(sVar.f2727j);
        fragmentA.mWho = sVar.f2719b;
        fragmentA.mFromLayout = sVar.f2720c;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = sVar.f2721d;
        fragmentA.mContainerId = sVar.f2722e;
        fragmentA.mTag = sVar.f2723f;
        fragmentA.mRetainInstance = sVar.f2724g;
        fragmentA.mRemoving = sVar.f2725h;
        fragmentA.mDetached = sVar.f2726i;
        fragmentA.mHidden = sVar.f2728k;
        fragmentA.mMaxState = androidx.lifecycle.f.b.values()[sVar.f2729l];
        Bundle bundle2 = sVar.f2730m;
        if (bundle2 != null) {
            fragmentA.mSavedFragmentState = bundle2;
        } else {
            fragmentA.mSavedFragmentState = new Bundle();
        }
        if (n.D0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    /* JADX INFO: compiled from: FragmentStateManager.java */
    /* JADX INFO: loaded from: classes.dex */
    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f2736a;

        a(View view) {
            this.f2736a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f2736a.removeOnAttachStateChangeListener(this);
            z0.G(this.f2736a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    t(m mVar, u uVar, Fragment fragment, s sVar) {
        this.f2731a = mVar;
        this.f2732b = uVar;
        this.f2733c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = sVar.f2730m;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
