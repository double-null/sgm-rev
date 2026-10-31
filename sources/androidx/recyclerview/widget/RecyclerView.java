package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.g0;
import androidx.core.view.n0;
import androidx.core.view.p2;
import androidx.core.view.z0;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.protos.Sdk;
import d5.LXP.wcAlQCOdREZdI;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class RecyclerView extends ViewGroup implements n0 {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final c0 sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    androidx.recyclerview.widget.j mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    h mAdapter;
    androidx.recyclerview.widget.a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private k mChildDrawingOrderCallback;
    androidx.recyclerview.widget.b mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private l mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.e mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private t mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    m mItemAnimator;
    private m.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<o> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    p mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final y mObserver;
    private List<r> mOnChildAttachStateListeners;
    private s mOnFlingListener;
    private final ArrayList<t> mOnItemTouchListeners;
    final List<f0> mPendingAccessibilityImportanceChange;
    z mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    androidx.recyclerview.widget.e.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final w mRecycler;
    x mRecyclerListener;
    final List<x> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private u mScrollListener;
    private List<u> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private g0 mScrollingChildHelper;
    final b0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final e0 mViewFlinger;
    private final androidx.recyclerview.widget.n.b mViewInfoProcessCallback;
    final androidx.recyclerview.widget.n mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    /* JADX INFO: loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecyclerView f3146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p f3147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f3148d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f3149e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f3150f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f3152h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3145a = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final a f3151g = new a(0, 0);

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f3153a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f3154b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f3155c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f3156d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Interpolator f3157e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f3158f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f3159g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            private void e() {
                if (this.f3157e != null && this.f3155c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f3155c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f3156d >= 0;
            }

            public void b(int i10) {
                this.f3156d = i10;
            }

            void c(RecyclerView recyclerView) {
                int i10 = this.f3156d;
                if (i10 >= 0) {
                    this.f3156d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i10);
                    this.f3158f = false;
                } else {
                    if (!this.f3158f) {
                        this.f3159g = 0;
                        return;
                    }
                    e();
                    recyclerView.mViewFlinger.f(this.f3153a, this.f3154b, this.f3155c, this.f3157e);
                    int i11 = this.f3159g + 1;
                    this.f3159g = i11;
                    if (i11 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3158f = false;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f3153a = i10;
                this.f3154b = i11;
                this.f3155c = i12;
                this.f3157e = interpolator;
                this.f3158f = true;
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f3156d = -1;
                this.f3158f = false;
                this.f3159g = 0;
                this.f3153a = i10;
                this.f3154b = i11;
                this.f3155c = i12;
                this.f3157e = interpolator;
            }
        }

        public interface b {
            PointF a(int i10);
        }

        public PointF a(int i10) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).a(i10);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f3146b.mLayout.C(i10);
        }

        public int c() {
            return this.f3146b.mLayout.J();
        }

        public int d(View view) {
            return this.f3146b.getChildLayoutPosition(view);
        }

        public p e() {
            return this.f3147c;
        }

        public int f() {
            return this.f3145a;
        }

        public boolean g() {
            return this.f3148d;
        }

        public boolean h() {
            return this.f3149e;
        }

        protected void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void j(int i10, int i11) {
            PointF pointFA;
            RecyclerView recyclerView = this.f3146b;
            if (this.f3145a == -1 || recyclerView == null) {
                r();
            }
            if (this.f3148d && this.f3150f == null && this.f3147c != null && (pointFA = a(this.f3145a)) != null) {
                float f10 = pointFA.x;
                if (f10 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f10), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f3148d = false;
            View view = this.f3150f;
            if (view != null) {
                if (d(view) == this.f3145a) {
                    o(this.f3150f, recyclerView.mState, this.f3151g);
                    this.f3151g.c(recyclerView);
                    r();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f3150f = null;
                }
            }
            if (this.f3149e) {
                l(i10, i11, recyclerView.mState, this.f3151g);
                boolean zA = this.f3151g.a();
                this.f3151g.c(recyclerView);
                if (zA && this.f3149e) {
                    this.f3148d = true;
                    recyclerView.mViewFlinger.e();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f3150f = view;
            }
        }

        protected abstract void l(int i10, int i11, b0 b0Var, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, b0 b0Var, a aVar);

        public void p(int i10) {
            this.f3145a = i10;
        }

        void q(RecyclerView recyclerView, p pVar) {
            recyclerView.mViewFlinger.g();
            if (this.f3152h) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f3146b = recyclerView;
            this.f3147c = pVar;
            int i10 = this.f3145a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f3161a = i10;
            this.f3149e = true;
            this.f3148d = true;
            this.f3150f = b(f());
            m();
            this.f3146b.mViewFlinger.e();
            this.f3152h = true;
        }

        protected final void r() {
            if (this.f3149e) {
                this.f3149e = false;
                n();
                this.f3146b.mState.f3161a = -1;
                this.f3150f = null;
                this.f3145a = -1;
                this.f3148d = false;
                this.f3147c.e1(this);
                this.f3147c = null;
                this.f3146b = null;
            }
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.mItemAnimator;
            if (mVar != null) {
                mVar.u();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    public static class b0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray<Object> f3162b;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f3173m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f3174n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f3175o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f3176p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3177q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3161a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3163c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3164d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3165e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f3166f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f3167g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f3168h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f3169i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f3170j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f3171k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f3172l = false;

        void a(int i10) {
            if ((this.f3165e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f3165e));
        }

        public int b() {
            return this.f3168h ? this.f3163c - this.f3164d : this.f3166f;
        }

        public int c() {
            return this.f3161a;
        }

        public boolean d() {
            return this.f3161a != -1;
        }

        public boolean e() {
            return this.f3168h;
        }

        void f(h hVar) {
            this.f3165e = 1;
            this.f3166f = hVar.getItemCount();
            this.f3168h = false;
            this.f3169i = false;
            this.f3170j = false;
        }

        public boolean g() {
            return this.f3172l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3161a + wcAlQCOdREZdI.rxVGL + this.f3162b + ", mItemCount=" + this.f3166f + ", mIsMeasuring=" + this.f3170j + ", mPreviousLayoutItemCount=" + this.f3163c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3164d + ", mStructureChanged=" + this.f3167g + ", mInPreLayout=" + this.f3168h + ", mRunSimpleAnimations=" + this.f3171k + ", mRunPredictiveAnimations=" + this.f3172l + '}';
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    static class c0 extends l {
        c0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    class d implements androidx.recyclerview.widget.n.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.n.b
        public void a(f0 f0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.animateAppearance(f0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.n.b
        public void b(f0 f0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.l1(f0Var.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.n.b
        public void c(f0 f0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.mRecycler.O(f0Var);
            RecyclerView.this.animateDisappearance(f0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.n.b
        public void d(f0 f0Var, m.c cVar, m.c cVar2) {
            f0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.b(f0Var, f0Var, cVar, cVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.d(f0Var, cVar, cVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class d0 {
    }

    /* JADX INFO: loaded from: classes.dex */
    class e implements androidx.recyclerview.widget.b.InterfaceC0064b {
        e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0064b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0064b
        public void addView(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0064b
        public void b(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0064b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0064b
        public f0 d(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0064b
        public void e(int i10) {
            f0 childViewHolderInt;
            View viewA = a(i10);
            if (viewA != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(viewA)) != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.addFlags(UserVerificationMethods.USER_VERIFY_HANDPRINT);
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0064b
        public void f() {
            int iC = c();
            for (int i10 = 0; i10 < iC; i10++) {
                View viewA = a(i10);
                RecyclerView.this.dispatchChildDetached(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0064b
        public int g(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0064b
        public void h(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0064b
        public void i(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0064b
        public void j(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.clearTmpDetachFlag();
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    class e0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        OverScroller f3182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Interpolator f3183d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f3184e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f3185f;

        e0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f3183d = interpolator;
            this.f3184e = false;
            this.f3185f = false;
            this.f3182c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        private void d() {
            RecyclerView.this.removeCallbacks(this);
            z0.E(RecyclerView.this, this);
        }

        public void c(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f3181b = 0;
            this.f3180a = 0;
            Interpolator interpolator = this.f3183d;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f3183d = interpolator2;
                this.f3182c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f3182c.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            e();
        }

        void e() {
            if (this.f3184e) {
                this.f3185f = true;
            } else {
                d();
            }
        }

        public void f(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f3183d != interpolator) {
                this.f3183d = interpolator;
                this.f3182c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3181b = 0;
            this.f3180a = 0;
            RecyclerView.this.setScrollState(2);
            this.f3182c.startScroll(0, 0, i10, i11, i13);
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.f3182c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            int i12;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                g();
                return;
            }
            this.f3185f = false;
            this.f3184e = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f3182c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f3180a;
                int i14 = currY - this.f3181b;
                this.f3180a = currX;
                this.f3181b = currY;
                int iConsumeFlingInHorizontalStretch = RecyclerView.this.consumeFlingInHorizontalStretch(i13);
                int iConsumeFlingInVerticalStretch = RecyclerView.this.consumeFlingInVerticalStretch(i14);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    iConsumeFlingInHorizontalStretch -= iArr2[0];
                    iConsumeFlingInVerticalStretch -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i11 = iArr4[0];
                    i10 = iArr4[1];
                    iConsumeFlingInHorizontalStretch -= i11;
                    iConsumeFlingInVerticalStretch -= i10;
                    a0 a0Var = recyclerView4.mLayout.f3210g;
                    if (a0Var != null && !a0Var.g() && a0Var.h()) {
                        int iB = RecyclerView.this.mState.b();
                        if (iB == 0) {
                            a0Var.r();
                        } else if (a0Var.f() >= iB) {
                            a0Var.p(iB - 1);
                            a0Var.j(i11, i10);
                        } else {
                            a0Var.j(i11, i10);
                        }
                    }
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i11, i10, iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i15 = iConsumeFlingInHorizontalStretch - iArr6[0];
                int i16 = iConsumeFlingInVerticalStretch - iArr6[1];
                if (i11 != 0 || i10 != 0) {
                    recyclerView6.dispatchOnScrolled(i11, i10);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i15 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i16 != 0));
                a0 a0Var2 = RecyclerView.this.mLayout.f3210g;
                if ((a0Var2 != null && a0Var2.g()) || !z10) {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.mGapWorker;
                    if (eVar != null) {
                        eVar.g(recyclerView7, i11, i10);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i15 < 0) {
                            i12 = -currVelocity;
                        } else {
                            i12 = i15 > 0 ? currVelocity : 0;
                        }
                        if (i16 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i16 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i12, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.b();
                    }
                }
            }
            a0 a0Var3 = RecyclerView.this.mLayout.f3210g;
            if (a0Var3 != null && a0Var3.g()) {
                a0Var3.j(0, 0);
            }
            this.f3184e = false;
            if (this.f3185f) {
                d();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    class f implements androidx.recyclerview.widget.a.InterfaceC0063a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0063a
        public void a(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForMove(i10, i11);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0063a
        public void b(androidx.recyclerview.widget.a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0063a
        public void c(androidx.recyclerview.widget.a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0063a
        public void d(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForRemove(i10, i11, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0063a
        public void e(int i10, int i11, Object obj) {
            RecyclerView.this.viewRangeUpdate(i10, i11, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0063a
        public f0 f(int i10) {
            f0 f0VarFindViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i10, true);
            if (f0VarFindViewHolderForPosition == null || RecyclerView.this.mChildHelper.n(f0VarFindViewHolderForPosition.itemView)) {
                return null;
            }
            return f0VarFindViewHolderForPosition;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0063a
        public void g(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForInsert(i10, i11);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0063a
        public void h(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForRemove(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f3164d += i11;
        }

        void i(androidx.recyclerview.widget.a.b bVar) {
            int i10 = bVar.f3297a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.Q0(recyclerView, bVar.f3298b, bVar.f3300d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.T0(recyclerView2, bVar.f3298b, bVar.f3300d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.V0(recyclerView3, bVar.f3298b, bVar.f3300d, bVar.f3299c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.S0(recyclerView4, bVar.f3298b, bVar.f3300d, 1);
            }
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class f0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        h<? extends f0> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        f0 mShadowedHolder = null;
        f0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        w mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public f0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && z0.v(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final h<? extends f0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        boolean hasAnyOfTheFlags(int i10) {
            return (i10 & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !z0.v(this.itemView);
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((q) this.itemView.getLayoutParams()).f3230c = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = z0.l(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10 = this.mIsRecyclableCount;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.mIsRecyclableCount = i11;
            if (i11 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i11 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i11 == 0) {
                this.mFlags &= -17;
            }
        }

        void setScrapContainer(w wVar, boolean z10) {
            this.mScrapContainer = wVar;
            this.mInChangeScrap = z10;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        void unScrap() {
            this.mScrapContainer.O(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3188a;

        static {
            int[] iArr = new int[h.a.values().length];
            f3188a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3188a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class h<VH extends f0> {
        private final i mObservable = new i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(VH vh, int i10) {
            boolean z10 = vh.mBindingAdapter == null;
            if (z10) {
                vh.mPosition = i10;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i10);
                }
                vh.setFlags(1, 519);
                androidx.core.os.l.a(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i10, vh.getUnmodifiedPayloads());
            if (z10) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f3230c = true;
                }
                androidx.core.os.l.b();
            }
        }

        boolean canRestoreState() {
            int i10 = g.f3188a[this.mStateRestorationPolicy.ordinal()];
            if (i10 != 1) {
                return i10 != 2 || getItemCount() > 0;
            }
            return false;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i10) {
            try {
                androidx.core.os.l.a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh = (VH) onCreateViewHolder(viewGroup, i10);
                if (vh.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i10;
                androidx.core.os.l.b();
                return vh;
            } catch (Throwable th) {
                androidx.core.os.l.b();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(h<? extends f0> hVar, f0 f0Var, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1L;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.d(i10, 1);
        }

        public final void notifyItemInserted(int i10) {
            this.mObservable.f(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.c(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.d(i10, i11);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.f(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.g(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.g(i10, 1);
        }

        public abstract void onBindViewHolder(VH vh, int i10);

        public void onBindViewHolder(VH vh, int i10, List<Object> list) {
            onBindViewHolder(vh, i10);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i10);

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void registerAdapterDataObserver(j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z10) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z10;
        }

        public void setStateRestorationPolicy(a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.h();
        }

        public void unregisterAdapterDataObserver(j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i10, Object obj) {
            this.mObservable.e(i10, 1, obj);
        }

        public final void notifyItemRangeChanged(int i10, int i11, Object obj) {
            this.mObservable.e(i10, i11, obj);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    static class i extends Observable<j> {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i10, i11, 1);
            }
        }

        public void d(int i10, int i11) {
            e(i10, i11, null);
        }

        public void e(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i10, i11, obj);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i10, i11);
            }
        }

        public void g(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i10, i11);
            }
        }

        public void h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class j {
        public void onItemRangeChanged(int i10, int i11) {
        }

        public void onItemRangeChanged(int i10, int i11, Object obj) {
            onItemRangeChanged(i10, i11);
        }

        public void onChanged() {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeInserted(int i10, int i11) {
        }

        public void onItemRangeRemoved(int i10, int i11) {
        }

        public void onItemRangeMoved(int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface k {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class l {
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            throw null;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private class n implements m.b {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.b
        public void a(f0 f0Var) {
            f0Var.setIsRecyclable(true);
            if (f0Var.mShadowedHolder != null && f0Var.mShadowingHolder == null) {
                f0Var.mShadowedHolder = null;
            }
            f0Var.mShadowingHolder = null;
            if (f0Var.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(f0Var.itemView) || !f0Var.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(f0Var.itemView, false);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface r {
        void a(View view);

        void b(View view);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class s {
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface t {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SparseArray<a> f3232a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3233b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Set<h<?>> f3234c = Collections.newSetFromMap(new IdentityHashMap());

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ArrayList<f0> f3235a = new ArrayList<>();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f3236b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            long f3237c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f3238d = 0;

            a() {
            }
        }

        private a i(int i10) {
            a aVar = this.f3232a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f3232a.put(i10, aVar2);
            return aVar2;
        }

        void a() {
            this.f3233b++;
        }

        void b(h<?> hVar) {
            this.f3234c.add(hVar);
        }

        public void c() {
            for (int i10 = 0; i10 < this.f3232a.size(); i10++) {
                a aVarValueAt = this.f3232a.valueAt(i10);
                Iterator<f0> it = aVarValueAt.f3235a.iterator();
                while (it.hasNext()) {
                    b0.a.a(it.next().itemView);
                }
                aVarValueAt.f3235a.clear();
            }
        }

        void d() {
            this.f3233b--;
        }

        void e(h<?> hVar, boolean z10) {
            this.f3234c.remove(hVar);
            if (this.f3234c.size() != 0 || z10) {
                return;
            }
            for (int i10 = 0; i10 < this.f3232a.size(); i10++) {
                SparseArray<a> sparseArray = this.f3232a;
                ArrayList<f0> arrayList = sparseArray.get(sparseArray.keyAt(i10)).f3235a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    b0.a.a(arrayList.get(i11).itemView);
                }
            }
        }

        void f(int i10, long j10) {
            a aVarI = i(i10);
            aVarI.f3238d = l(aVarI.f3238d, j10);
        }

        void g(int i10, long j10) {
            a aVarI = i(i10);
            aVarI.f3237c = l(aVarI.f3237c, j10);
        }

        public f0 h(int i10) {
            a aVar = this.f3232a.get(i10);
            if (aVar == null || aVar.f3235a.isEmpty()) {
                return null;
            }
            ArrayList<f0> arrayList = aVar.f3235a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        void j(h<?> hVar, h<?> hVar2, boolean z10) {
            if (hVar != null) {
                d();
            }
            if (!z10 && this.f3233b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void k(f0 f0Var) {
            int itemViewType = f0Var.getItemViewType();
            ArrayList<f0> arrayList = i(itemViewType).f3235a;
            if (this.f3232a.get(itemViewType).f3236b <= arrayList.size()) {
                b0.a.a(f0Var.itemView);
            } else {
                f0Var.resetInternal();
                arrayList.add(f0Var);
            }
        }

        long l(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        boolean m(int i10, long j10, long j11) {
            long j12 = i(i10).f3238d;
            return j12 == 0 || j10 + j12 < j11;
        }

        boolean n(int i10, long j10, long j11) {
            long j12 = i(i10).f3237c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface x {
        void a(f0 f0Var);
    }

    /* JADX INFO: loaded from: classes.dex */
    private class y extends j {
        y() {
        }

        void a() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    z0.E(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f3167g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeChanged(int i10, int i11, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.r(i10, i11, obj)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeInserted(int i10, int i11) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.s(i10, i11)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeMoved(int i10, int i11, int i12) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.t(i10, i11, i12)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeRemoved(int i10, int i11) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.u(i10, i11)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onStateRestorationPolicyChanged() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (hVar = recyclerView.mAdapter) == null || !hVar.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new c();
        sDefaultEdgeEffectFactory = new c0();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(f0 f0Var) {
        View view = f0Var.itemView;
        boolean z10 = view.getParent() == this;
        this.mRecycler.O(getChildViewHolder(view));
        if (f0Var.isTmpDetached()) {
            this.mChildHelper.c(view, -1, view.getLayoutParams(), true);
        } else if (z10) {
            this.mChildHelper.k(view);
        } else {
            this.mChildHelper.b(view, true);
        }
    }

    private void animateChange(f0 f0Var, f0 f0Var2, m.c cVar, m.c cVar2, boolean z10, boolean z11) {
        f0Var.setIsRecyclable(false);
        if (z10) {
            addAnimatingView(f0Var);
        }
        if (f0Var != f0Var2) {
            if (z11) {
                addAnimatingView(f0Var2);
            }
            f0Var.mShadowedHolder = f0Var2;
            addAnimatingView(f0Var);
            this.mRecycler.O(f0Var);
            f0Var2.setIsRecyclable(false);
            f0Var2.mShadowingHolder = f0Var;
        }
        if (this.mItemAnimator.b(f0Var, f0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(f0 f0Var) {
        WeakReference<RecyclerView> weakReference = f0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == f0Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            f0Var.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && androidx.core.widget.d.b(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i11) / FLING_DESTRETCH_FACTOR) * androidx.core.widget.d.d(edgeEffect, ((-i10) * FLING_DESTRETCH_FACTOR) / i11, 0.5f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || androidx.core.widget.d.b(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round((f10 / FLING_DESTRETCH_FACTOR) * androidx.core.widget.d.d(edgeEffect2, (i10 * FLING_DESTRETCH_FACTOR) / f10, 0.5f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e16);
            }
        }
    }

    private boolean didChildRangeChange(int i10, int i11) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i10 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i10 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        x.b.b(accessibilityEventObtain, i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f3170j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        b0 b0Var = this.mState;
        b0Var.f3169i = b0Var.f3171k && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        b0Var.f3168h = b0Var.f3172l;
        b0Var.f3166f = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f3171k) {
            int iG = this.mChildHelper.g();
            for (int i10 = 0; i10 < iG; i10++) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i10));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.e(childViewHolderInt, this.mItemAnimator.t(this.mState, childViewHolderInt, m.e(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f3169i && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f3172l) {
            saveOldPositions();
            b0 b0Var2 = this.mState;
            boolean z10 = b0Var2.f3167g;
            b0Var2.f3167g = false;
            this.mLayout.W0(this.mRecycler, b0Var2);
            this.mState.f3167g = z10;
            for (int i11 = 0; i11 < this.mChildHelper.g(); i11++) {
                f0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.f(i11));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.i(childViewHolderInt2)) {
                    int iE = m.e(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iE |= 4096;
                    }
                    m.c cVarT = this.mItemAnimator.t(this.mState, childViewHolderInt2, iE, childViewHolderInt2.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, cVarT);
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt2, cVarT);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f3165e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.j();
        this.mState.f3166f = this.mAdapter.getItemCount();
        this.mState.f3164d = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f3248c;
            if (parcelable != null) {
                this.mLayout.b1(parcelable);
            }
            this.mPendingSavedState = null;
        }
        b0 b0Var = this.mState;
        b0Var.f3168h = false;
        this.mLayout.W0(this.mRecycler, b0Var);
        b0 b0Var2 = this.mState;
        b0Var2.f3167g = false;
        b0Var2.f3171k = b0Var2.f3171k && this.mItemAnimator != null;
        b0Var2.f3165e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        b0 b0Var = this.mState;
        b0Var.f3165e = 1;
        if (b0Var.f3171k) {
            for (int iG = this.mChildHelper.g() - 1; iG >= 0; iG--) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(iG));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    m.c cVarS = this.mItemAnimator.s(this.mState, childViewHolderInt);
                    f0 f0VarG = this.mViewInfoStore.g(changedHolderKey);
                    if (f0VarG == null || f0VarG.shouldIgnore()) {
                        this.mViewInfoStore.d(childViewHolderInt, cVarS);
                    } else {
                        boolean zH = this.mViewInfoStore.h(f0VarG);
                        boolean zH2 = this.mViewInfoStore.h(childViewHolderInt);
                        if (zH && f0VarG == childViewHolderInt) {
                            this.mViewInfoStore.d(childViewHolderInt, cVarS);
                        } else {
                            m.c cVarN = this.mViewInfoStore.n(f0VarG);
                            this.mViewInfoStore.d(childViewHolderInt, cVarS);
                            m.c cVarM = this.mViewInfoStore.m(childViewHolderInt);
                            if (cVarN == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, f0VarG);
                            } else {
                                animateChange(f0VarG, childViewHolderInt, cVarN, cVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            this.mViewInfoStore.o(this.mViewInfoProcessCallback);
        }
        this.mLayout.k1(this.mRecycler);
        b0 b0Var2 = this.mState;
        b0Var2.f3163c = b0Var2.f3166f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        b0Var2.f3171k = false;
        b0Var2.f3172l = false;
        this.mLayout.f3211h = false;
        ArrayList<f0> arrayList = this.mRecycler.f3240b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = this.mLayout;
        if (pVar.f3217n) {
            pVar.f3216m = 0;
            pVar.f3217n = false;
            this.mRecycler.P();
        }
        this.mLayout.X0(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        t tVar = this.mInterceptingOnItemTouchListener;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        tVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = this.mOnItemTouchListeners.get(i10);
            if (tVar.b(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = tVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iG = this.mChildHelper.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iG; i12++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i12));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i10));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        f0 f0VarFindViewHolderForAdapterPosition;
        b0 b0Var = this.mState;
        int i10 = b0Var.f3173m;
        if (i10 == -1) {
            i10 = 0;
        }
        int iB = b0Var.b();
        for (int i11 = i10; i11 < iB; i11++) {
            f0 f0VarFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i11);
            if (f0VarFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (f0VarFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return f0VarFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iB, i10);
        do {
            iMin--;
            if (iMin < 0 || (f0VarFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!f0VarFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return f0VarFindViewHolderForAdapterPosition.itemView;
    }

    static f0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f3228a;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f3229b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private g0 getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new g0(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i10) {
        double dLog = Math.log((Math.abs(i10) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f10 = DECELERATION_RATE;
        return (float) (((double) (this.mPhysicalCoef * SCROLL_FRICTION)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * dLog));
    }

    private void handleMissingPreInfoForChangeError(long j10, f0 f0Var, f0 f0Var2) {
        int iG = this.mChildHelper.g();
        for (int i10 = 0; i10 < iG; i10++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i10));
            if (childViewHolderInt != f0Var && getChangedHolderKey(childViewHolderInt) == j10) {
                h hVar = this.mAdapter;
                if (hVar == null || !hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + f0Var + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + f0Var + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f0Var2 + " cannot be found but it is necessary for " + f0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int iG = this.mChildHelper.g();
        for (int i10 = 0; i10 < iG; i10++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private void initAutofill() {
        if (z0.m(this) == 0) {
            z0.Q(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.b(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        byte b10 = -1;
        int i12 = this.mLayout.Y() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i13 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            b10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                b10 = 0;
            }
        }
        if (i10 == 1) {
            return b10 < 0 || (b10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return b10 > 0 || (b10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return b10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return b10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + exceptionLabel());
    }

    private void nestedScrollByInternal(int i10, int i11, MotionEvent motionEvent, int i12) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zK = pVar.k();
        boolean zL = this.mLayout.l();
        int i13 = zL ? (zK ? 1 : 0) | 2 : zK ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iReleaseHorizontalGlow = i10 - releaseHorizontalGlow(i10, height);
        int iReleaseVerticalGlow = i11 - releaseVerticalGlow(i11, width);
        startNestedScroll(i13, i12);
        if (dispatchNestedPreScroll(zK ? iReleaseHorizontalGlow : 0, zL ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i12)) {
            int[] iArr2 = this.mReusableIntPair;
            iReleaseHorizontalGlow -= iArr2[0];
            iReleaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(zK ? iReleaseHorizontalGlow : 0, zL ? iReleaseVerticalGlow : 0, motionEvent, i12);
        androidx.recyclerview.widget.e eVar = this.mGapWorker;
        if (eVar != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
            eVar.g(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
        }
        stopNestedScroll(i12);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.K1();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z10;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.y();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.R0(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.w();
        } else {
            this.mAdapterHelper.j();
        }
        boolean z11 = false;
        boolean z12 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f3171k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z10 = this.mDataSetHasChangedAfterLayout) || z12 || this.mLayout.f3211h) && (!z10 || this.mAdapter.hasStableIds());
        b0 b0Var = this.mState;
        if (b0Var.f3171k && z12 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z11 = true;
        }
        b0Var.f3172l = z11;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    private void pullGlows(float f10, float f11, float f12, float f13) {
        boolean z10;
        boolean z11 = true;
        if (f11 >= 0.0f) {
            if (f11 > 0.0f) {
                ensureRightGlow();
                androidx.core.widget.d.d(this.mRightGlow, f11 / getWidth(), f12 / getHeight());
            } else {
                z10 = false;
            }
            if (f13 < 0.0f) {
                ensureTopGlow();
                androidx.core.widget.d.d(this.mTopGlow, (-f13) / getHeight(), f10 / getWidth());
            } else if (f13 > 0.0f) {
                ensureBottomGlow();
                androidx.core.widget.d.d(this.mBottomGlow, f13 / getHeight(), 1.0f - (f10 / getWidth()));
            } else {
                z11 = z10;
            }
            if (z11 && f11 == 0.0f && f13 == 0.0f) {
                return;
            }
            z0.D(this);
        }
        ensureLeftGlow();
        androidx.core.widget.d.d(this.mLeftGlow, (-f11) / getWidth(), 1.0f - (f12 / getHeight()));
        z10 = true;
        if (f13 < 0.0f) {
            ensureTopGlow();
            androidx.core.widget.d.d(this.mTopGlow, (-f13) / getHeight(), f10 / getWidth());
        } else if (f13 > 0.0f) {
            ensureBottomGlow();
            androidx.core.widget.d.d(this.mBottomGlow, f13 / getHeight(), 1.0f - (f10 / getWidth()));
        } else {
            z11 = z10;
        }
        if (z11) {
        }
        z0.D(this);
    }

    private void recoverFocusFromState() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.n(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewFindNextViewToFocus = null;
        f0 f0VarFindViewHolderForItemId = (this.mState.f3174n == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f3174n);
        if (f0VarFindViewHolderForItemId != null && !this.mChildHelper.n(f0VarFindViewHolderForItemId.itemView) && f0VarFindViewHolderForItemId.itemView.hasFocusable()) {
            viewFindNextViewToFocus = f0VarFindViewHolderForItemId.itemView;
        } else if (this.mChildHelper.g() > 0) {
            viewFindNextViewToFocus = findNextViewToFocus();
        }
        if (viewFindNextViewToFocus != null) {
            int i10 = this.mState.f3175o;
            if (i10 != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            z0.D(this);
        }
    }

    private int releaseHorizontalGlow(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fD = androidx.core.widget.d.d(this.mRightGlow, width, height);
                    if (androidx.core.widget.d.b(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f11 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f12 = -androidx.core.widget.d.d(this.mLeftGlow, -width, 1.0f - height);
                if (androidx.core.widget.d.b(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    private int releaseVerticalGlow(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fD = androidx.core.widget.d.d(this.mBottomGlow, height, 1.0f - width);
                    if (androidx.core.widget.d.b(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f11 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f12 = -androidx.core.widget.d.d(this.mTopGlow, -height, width);
                if (androidx.core.widget.d.b(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f3230c) {
                Rect rect = qVar.f3229b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.r1(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        b0 b0Var = this.mState;
        b0Var.f3174n = -1L;
        b0Var.f3173m = -1;
        b0Var.f3175o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int absoluteAdapterPosition;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        f0 f0VarFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (f0VarFindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f3174n = this.mAdapter.hasStableIds() ? f0VarFindContainingViewHolder.getItemId() : -1L;
        b0 b0Var = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = f0VarFindContainingViewHolder.isRemoved() ? f0VarFindContainingViewHolder.mOldPosition : f0VarFindContainingViewHolder.getAbsoluteAdapterPosition();
        }
        b0Var.f3173m = absoluteAdapterPosition;
        this.mState.f3175o = getDeepestFocusedViewWithId(f0VarFindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(h<?> hVar, boolean z10, boolean z11) {
        h hVar2 = this.mAdapter;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.y();
        h<?> hVar3 = this.mAdapter;
        this.mAdapter = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.mObserver);
            hVar.onAttachedToRecyclerView(this);
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.D0(hVar3, this.mAdapter);
        }
        this.mRecycler.y(hVar3, this.mAdapter, z10);
        this.mState.f3167g = true;
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        return getSplineFlingDistance(-i10) < androidx.core.widget.d.b(edgeEffect) * ((float) i11);
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            androidx.core.widget.d.d(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            androidx.core.widget.d.d(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && androidx.core.widget.d.b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            androidx.core.widget.d.d(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || androidx.core.widget.d.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z10;
        }
        androidx.core.widget.d.d(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.g();
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.J1();
        }
    }

    void absorbGlows(int i10, int i11) {
        if (i10 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        z0.D(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.E0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public void addItemDecoration(o oVar, int i10) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.mItemDecorations.add(oVar);
        } else {
            this.mItemDecorations.add(i10, oVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(r rVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(rVar);
    }

    public void addOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.add(tVar);
    }

    public void addOnScrollListener(u uVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(uVar);
    }

    public void addRecyclerListener(x xVar) {
        w.h.a(xVar != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(xVar);
    }

    void animateAppearance(f0 f0Var, m.c cVar, m.c cVar2) {
        f0Var.setIsRecyclable(false);
        if (this.mItemAnimator.a(f0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(f0 f0Var, m.c cVar, m.c cVar2) {
        addAnimatingView(f0Var);
        f0Var.setIsRecyclable(false);
        if (this.mItemAnimator.c(f0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    boolean canReuseUpdatedViewHolder(f0 f0Var) {
        m mVar = this.mItemAnimator;
        return mVar == null || mVar.g(f0Var, f0Var.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.mLayout.m((q) layoutParams);
    }

    void clearOldPositions() {
        int iJ = this.mChildHelper.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.k()) {
            return this.mLayout.q(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.k()) {
            return this.mLayout.r(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.k()) {
            return this.mLayout.s(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.l()) {
            return this.mLayout.t(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.l()) {
            return this.mLayout.u(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.l()) {
            return this.mLayout.v(this.mState);
        }
        return 0;
    }

    void considerReleasingGlowsOnScroll(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            z0.D(this);
        }
    }

    int consumeFlingInHorizontalStretch(int i10) {
        return consumeFlingInStretch(i10, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    int consumeFlingInVerticalStretch(int i10) {
        return consumeFlingInStretch(i10, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            androidx.core.os.l.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            androidx.core.os.l.b();
            return;
        }
        if (this.mAdapterHelper.p()) {
            if (!this.mAdapterHelper.o(4) || this.mAdapterHelper.o(11)) {
                if (this.mAdapterHelper.p()) {
                    androidx.core.os.l.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    androidx.core.os.l.b();
                    return;
                }
                return;
            }
            androidx.core.os.l.a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.w();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.i();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            androidx.core.os.l.b();
        }
    }

    void defaultOnMeasure(int i10, int i11) {
        setMeasuredDimension(p.n(i10, getPaddingLeft() + getPaddingRight(), z0.p(this)), p.n(i11, getPaddingTop() + getPaddingBottom(), z0.o(this)));
    }

    void dispatchChildAttached(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).a(view);
            }
        }
    }

    void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.f3170j = false;
        boolean z10 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f3165e == 1) {
            dispatchLayoutStep1();
            this.mLayout.y1(this);
            dispatchLayoutStep2();
        } else if (this.mAdapterHelper.q() || z10 || this.mLayout.n0() != getWidth() || this.mLayout.W() != getHeight()) {
            this.mLayout.y1(this);
            dispatchLayoutStep2();
        } else {
            this.mLayout.y1(this);
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    void dispatchOnScrollStateChanged(int i10) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.d1(i10);
        }
        onScrollStateChanged(i10);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.a(this, i10);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i10);
            }
        }
    }

    void dispatchOnScrolled(int i10, int i11) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        onScrolled(i10, i11);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.b(this, i10, i11);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).b(this, i10, i11);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i10;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            f0 f0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (f0Var.itemView.getParent() == this && !f0Var.shouldIgnore() && (i10 = f0Var.mPendingAccessibilityState) != -1) {
                z0.O(f0Var.itemView, i10);
                f0Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).i(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.p()) ? z10 : true) {
            z0.D(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this, 3);
        this.mBottomGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this, 0);
        this.mLeftGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this, 2);
        this.mRightGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this, 1);
        this.mTopGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    final void fillRemainingScrollValues(b0 b0Var) {
        if (getScrollState() != 2) {
            b0Var.f3176p = 0;
            b0Var.f3177q = 0;
        } else {
            OverScroller overScroller = this.mViewFlinger.f3182c;
            b0Var.f3176p = overScroller.getFinalX() - overScroller.getCurrX();
            b0Var.f3177q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public View findChildViewUnder(float f10, float f11) {
        for (int iG = this.mChildHelper.g() - 1; iG >= 0; iG--) {
            View viewF = this.mChildHelper.f(iG);
            float translationX = viewF.getTranslationX();
            float translationY = viewF.getTranslationY();
            if (f10 >= viewF.getLeft() + translationX && f10 <= viewF.getRight() + translationX && f11 >= viewF.getTop() + translationY && f11 <= viewF.getBottom() + translationY) {
                return viewF;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public f0 findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public f0 findViewHolderForAdapterPosition(int i10) {
        f0 f0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iJ = this.mChildHelper.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i11));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i10) {
                if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                f0Var = childViewHolderInt;
            }
        }
        return f0Var;
    }

    public f0 findViewHolderForItemId(long j10) {
        h hVar = this.mAdapter;
        f0 f0Var = null;
        if (hVar != null && hVar.hasStableIds()) {
            int iJ = this.mChildHelper.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j10) {
                    if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    f0Var = childViewHolderInt;
                }
            }
        }
        return f0Var;
    }

    public f0 findViewHolderForLayoutPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    @Deprecated
    public f0 findViewHolderForPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean fling(int i10, int i11) {
        int iMax;
        int i12;
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        boolean zK = pVar.k();
        boolean zL = this.mLayout.l();
        if (!zK || Math.abs(i10) < this.mMinFlingVelocity) {
            i10 = 0;
        }
        if (!zL || Math.abs(i11) < this.mMinFlingVelocity) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        if (i10 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 == null || androidx.core.widget.d.b(edgeEffect2) == 0.0f) {
                    iMax = 0;
                } else if (shouldAbsorb(this.mRightGlow, i10, getWidth())) {
                    this.mRightGlow.onAbsorb(i10);
                    i10 = 0;
                }
            } else {
                int i13 = -i10;
                if (shouldAbsorb(this.mLeftGlow, i13, getWidth())) {
                    this.mLeftGlow.onAbsorb(i13);
                    i10 = 0;
                }
            }
            iMax = i10;
            i10 = 0;
        }
        if (i11 == 0) {
            i12 = i11;
            i11 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 == null || androidx.core.widget.d.b(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 == null || androidx.core.widget.d.b(edgeEffect4) == 0.0f) {
                    i12 = i11;
                    i11 = 0;
                } else if (shouldAbsorb(this.mBottomGlow, i11, getHeight())) {
                    this.mBottomGlow.onAbsorb(i11);
                    i11 = 0;
                }
            } else {
                int i14 = -i11;
                if (shouldAbsorb(this.mTopGlow, i14, getHeight())) {
                    this.mTopGlow.onAbsorb(i14);
                    i11 = 0;
                }
            }
            i12 = 0;
        }
        if (iMax != 0 || i11 != 0) {
            int i15 = this.mMaxFlingVelocity;
            iMax = Math.max(-i15, Math.min(iMax, i15));
            int i16 = this.mMaxFlingVelocity;
            i11 = Math.max(-i16, Math.min(i11, i16));
            this.mViewFlinger.c(iMax, i11);
        }
        if (i10 == 0 && i12 == 0) {
            return (iMax == 0 && i11 == 0) ? false : true;
        }
        float f10 = i10;
        float f11 = i12;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = zK || zL;
            dispatchNestedFling(f10, f11, z10);
            int i17 = zK;
            if (z10) {
                if (zL) {
                    i17 = (zK ? 1 : 0) | 2;
                }
                startNestedScroll(i17, 1);
                int i18 = this.mMaxFlingVelocity;
                int iMax2 = Math.max(-i18, Math.min(i10, i18));
                int i19 = this.mMaxFlingVelocity;
                this.mViewFlinger.c(iMax2, Math.max(-i19, Math.min(i12, i19)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewI0;
        boolean z10;
        View viewP0 = this.mLayout.P0(view, i10);
        if (viewP0 != null) {
            return viewP0;
        }
        boolean z11 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.mLayout.l()) {
                int i11 = i10 == 2 ? Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE : 33;
                z10 = focusFinder.findNextFocus(this, view, i11) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i10 = i11;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.mLayout.k()) {
                int i12 = (this.mLayout.Y() == 1) ^ (i10 == 2) ? 66 : 17;
                boolean z12 = focusFinder.findNextFocus(this, view, i12) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i10 = i12;
                }
                z10 = z12;
            }
            if (z10) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.I0(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewI0 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z11) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewI0 = this.mLayout.I0(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewI0 = viewFindNextFocus;
            }
        }
        if (viewI0 == null || viewI0.hasFocusable()) {
            return isPreferredNextFocus(view, viewI0, i10) ? viewI0 : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        requestChildOnScreen(viewI0, null);
        return view;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public h getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionInRecyclerView(f0 f0Var) {
        if (f0Var.hasAnyOfTheFlags(524) || !f0Var.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.e(f0Var.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.mLayout;
        return pVar != null ? pVar.G() : super.getBaseline();
    }

    long getChangedHolderKey(f0 f0Var) {
        return this.mAdapter.hasStableIds() ? f0Var.getItemId() : f0Var.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    public long getChildItemId(View view) {
        f0 childViewHolderInt;
        h hVar = this.mAdapter;
        if (hVar == null || !hVar.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public f0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public androidx.recyclerview.widget.j getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public l getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public m getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f3230c) {
            return qVar.f3229b;
        }
        if (this.mState.e() && (qVar.b() || qVar.d())) {
            return qVar.f3229b;
        }
        Rect rect = qVar.f3229b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i10).e(this.mTempRect, view, this, this.mState);
            int i11 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f3230c = false;
        return rect;
    }

    public o getItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            return this.mItemDecorations.get(i10);
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public p getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public v getRecycledViewPool() {
        return this.mRecycler.i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.p();
    }

    void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.a(new f());
    }

    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(s0.b.f25173a), resources.getDimensionPixelSize(s0.b.f25175c), resources.getDimensionPixelOffset(s0.b.f25174b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.g("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        m mVar = this.mItemAnimator;
        return mVar != null && mVar.p();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    void jumpToPositionForSmoothScroller(int i10) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.w1(i10);
        awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int iJ = this.mChildHelper.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            ((q) this.mChildHelper.i(i10).getLayoutParams()).f3230c = true;
        }
        this.mRecycler.s();
    }

    void markKnownViewsInvalid() {
        int iJ = this.mChildHelper.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.t();
    }

    public void nestedScrollBy(int i10, int i11) {
        nestedScrollByInternal(i10, i11, null, 1);
    }

    public void offsetChildrenHorizontal(int i10) {
        int iG = this.mChildHelper.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.mChildHelper.f(i11).offsetLeftAndRight(i10);
        }
    }

    public void offsetChildrenVertical(int i10) {
        int iG = this.mChildHelper.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.mChildHelper.f(i11).offsetTopAndBottom(i10);
        }
    }

    void offsetPositionRecordsForInsert(int i10, int i11) {
        int iJ = this.mChildHelper.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i10) {
                childViewHolderInt.offsetPosition(i11, false);
                this.mState.f3167g = true;
            }
        }
        this.mRecycler.v(i10, i11);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iJ = this.mChildHelper.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < iJ; i16++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i16));
            if (childViewHolderInt != null && (i15 = childViewHolderInt.mPosition) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    childViewHolderInt.offsetPosition(i11 - i10, false);
                } else {
                    childViewHolderInt.offsetPosition(i14, false);
                }
                this.mState.f3167g = true;
            }
        }
        this.mRecycler.w(i10, i11);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iJ = this.mChildHelper.j();
        for (int i13 = 0; i13 < iJ; i13++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i13));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i14 = childViewHolderInt.mPosition;
                if (i14 >= i12) {
                    childViewHolderInt.offsetPosition(-i11, z10);
                    this.mState.f3167g = true;
                } else if (i14 >= i10) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.mState.f3167g = true;
                }
            }
        }
        this.mRecycler.x(i10, i11, z10);
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.z();
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.z(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<androidx.recyclerview.widget.e> threadLocal = androidx.recyclerview.widget.e.f3388e;
            androidx.recyclerview.widget.e eVar = threadLocal.get();
            this.mGapWorker = eVar;
            if (eVar == null) {
                this.mGapWorker = new androidx.recyclerview.widget.e();
                Display displayK = z0.k(this);
                if (isInEditMode() || displayK == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = displayK.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                androidx.recyclerview.widget.e eVar2 = this.mGapWorker;
                eVar2.f3392c = (long) (1.0E9f / refreshRate);
                threadLocal.set(eVar2);
            }
            this.mGapWorker.a(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.k();
        }
        stopScroll();
        this.mIsAttached = false;
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.A(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.j();
        this.mRecycler.A();
        b0.a.b(this);
        if (!ALLOW_THREAD_GAP_WORK || (eVar = this.mGapWorker) == null) {
            return;
        }
        eVar.k(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).g(canvas, this, this.mState);
        }
    }

    void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.mLayout.l() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.mLayout.k() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.mLayout.l()) {
                    f10 = -axisValue2;
                } else if (this.mLayout.k()) {
                    axisValue = axisValue2;
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f10 = 0.0f;
                axisValue = 0.0f;
            }
            if (f10 != 0.0f || axisValue != 0.0f) {
                nestedScrollByInternal((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f10 * this.mScaledVerticalScrollFactor), motionEvent, 1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            return false;
        }
        boolean zK = pVar.k();
        boolean zL = this.mLayout.l();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = zK;
            if (zL) {
                i10 = (zK ? 1 : 0) | 2;
            }
            startNestedScroll(i10, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i11 = x11 - this.mInitialTouchX;
                int i12 = y11 - this.mInitialTouchY;
                if (!zK || Math.abs(i11) <= this.mTouchSlop) {
                    z10 = false;
                } else {
                    this.mLastTouchX = x11;
                    z10 = true;
                }
                if (zL && Math.abs(i12) > this.mTouchSlop) {
                    this.mLastTouchY = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x12;
            this.mInitialTouchX = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y12;
            this.mInitialTouchY = y12;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        androidx.core.os.l.a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        androidx.core.os.l.b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        p pVar = this.mLayout;
        if (pVar == null) {
            defaultOnMeasure(i10, i11);
            return;
        }
        boolean z10 = false;
        if (pVar.r0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.mLayout.Y0(this.mRecycler, this.mState, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z10;
            if (z10 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f3165e == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.z1(i10, i11);
            this.mState.f3170j = true;
            dispatchLayoutStep2();
            this.mLayout.C1(i10, i11);
            if (this.mLayout.F1()) {
                this.mLayout.z1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f3170j = true;
                dispatchLayoutStep2();
                this.mLayout.C1(i10, i11);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.Y0(this.mRecycler, this.mState, i10, i11);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            b0 b0Var = this.mState;
            if (b0Var.f3172l) {
                b0Var.f3168h = true;
            } else {
                this.mAdapterHelper.j();
                this.mState.f3168h = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f3172l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.mAdapter;
        if (hVar != null) {
            this.mState.f3166f = hVar.getItemCount();
        } else {
            this.mState.f3166f = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.Y0(this.mRecycler, this.mState, i10, i11);
        stopInterceptRequestLayout(false);
        this.mState.f3168h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.mPendingSavedState = zVar;
        super.onRestoreInstanceState(zVar.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.mPendingSavedState;
        if (zVar2 != null) {
            zVar.b(zVar2);
        } else {
            p pVar = this.mLayout;
            if (pVar != null) {
                zVar.f3248c = pVar.c1();
            } else {
                zVar.f3248c = null;
            }
        }
        return zVar;
    }

    public void onScrollStateChanged(int i10) {
    }

    public void onScrolled(int i10, int i11) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00df A[PHI: r0
      0x00df: PHI (r0v37 int) = (r0v26 int), (r0v41 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        boolean z11 = false;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            return false;
        }
        boolean zK = pVar.k();
        boolean zL = this.mLayout.l();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
            if (zL) {
                i10 = zK;
                i10 = (zK ? 1 : 0) | 2;
            }
            i10 = zK;
            startNestedScroll(i10, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.addMovement(motionEventObtain);
            this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
            float f10 = zK ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
            float f11 = zL ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
            if ((f10 == 0.0f && f11 == 0.0f) || !fling((int) f10, (int) f11)) {
                setScrollState(0);
            }
            resetScroll();
            z11 = true;
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            int iMax = this.mLastTouchX - x11;
            int iMax2 = this.mLastTouchY - y11;
            if (this.mScrollState != 1) {
                if (zK) {
                    iMax = iMax > 0 ? Math.max(0, iMax - this.mTouchSlop) : Math.min(0, iMax + this.mTouchSlop);
                    if (iMax != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (zL) {
                    iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.mTouchSlop) : Math.min(0, iMax2 + this.mTouchSlop);
                    if (iMax2 != 0) {
                        z10 = true;
                    }
                }
                if (z10) {
                    setScrollState(1);
                }
            }
            if (this.mScrollState == 1) {
                int[] iArr3 = this.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int iReleaseHorizontalGlow = iMax - releaseHorizontalGlow(iMax, motionEvent.getY());
                int iReleaseVerticalGlow = iMax2 - releaseVerticalGlow(iMax2, motionEvent.getX());
                if (dispatchNestedPreScroll(zK ? iReleaseHorizontalGlow : 0, zL ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                    int[] iArr4 = this.mReusableIntPair;
                    iReleaseHorizontalGlow -= iArr4[0];
                    iReleaseVerticalGlow -= iArr4[1];
                    int[] iArr5 = this.mNestedOffsets;
                    int i11 = iArr5[0];
                    int[] iArr6 = this.mScrollOffset;
                    iArr5[0] = i11 + iArr6[0];
                    iArr5[1] = iArr5[1] + iArr6[1];
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int i12 = iReleaseVerticalGlow;
                int[] iArr7 = this.mScrollOffset;
                this.mLastTouchX = x11 - iArr7[0];
                this.mLastTouchY = y11 - iArr7[1];
                if (scrollByInternal(zK ? iReleaseHorizontalGlow : 0, zL ? i12 : 0, motionEvent, 0)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                androidx.recyclerview.widget.e eVar = this.mGapWorker;
                if (eVar != null && (iReleaseHorizontalGlow != 0 || i12 != 0)) {
                    eVar.g(this, iReleaseHorizontalGlow, i12);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x12;
            this.mInitialTouchX = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y12;
            this.mInitialTouchY = y12;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (!z11) {
            this.mVelocityTracker.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        z0.E(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    void processDataSetCompletelyChanged(boolean z10) {
        this.mDispatchItemsChangedEvent = z10 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void recordAnimationInfoIfBouncedHiddenView(f0 f0Var, m.c cVar) {
        f0Var.setFlags(0, 8192);
        if (this.mState.f3169i && f0Var.isUpdated() && !f0Var.isRemoved() && !f0Var.shouldIgnore()) {
            this.mViewInfoStore.c(getChangedHolderKey(f0Var), f0Var);
        }
        this.mViewInfoStore.e(f0Var, cVar);
    }

    void removeAndRecycleViews() {
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.j1(this.mRecycler);
            this.mLayout.k1(this.mRecycler);
        }
        this.mRecycler.c();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean zR = this.mChildHelper.r(view);
        if (zR) {
            f0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.O(childViewHolderInt);
            this.mRecycler.H(childViewHolderInt);
        }
        stopInterceptRequestLayout(!zR);
        return zR;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z10);
    }

    public void removeItemDecoration(o oVar) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.g("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(oVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i10));
            return;
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(r rVar) {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(rVar);
    }

    public void removeOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.remove(tVar);
        if (this.mInterceptingOnItemTouchListener == tVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(u uVar) {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public void removeRecyclerListener(x xVar) {
        this.mRecyclerListeners.remove(xVar);
    }

    void repositionShadowingViews() {
        f0 f0Var;
        int iG = this.mChildHelper.g();
        for (int i10 = 0; i10 < iG; i10++) {
            View viewF = this.mChildHelper.f(i10);
            f0 childViewHolder = getChildViewHolder(viewF);
            if (childViewHolder != null && (f0Var = childViewHolder.mShadowingHolder) != null) {
                View view = f0Var.itemView;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.a1(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.mLayout.q1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mOnItemTouchListeners.get(i10).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    void saveOldPositions() {
        int iJ = this.mChildHelper.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zK = pVar.k();
        boolean zL = this.mLayout.l();
        if (zK || zL) {
            if (!zK) {
                i10 = 0;
            }
            if (!zL) {
                i11 = 0;
            }
            scrollByInternal(i10, i11, null, 0);
        }
    }

    boolean scrollByInternal(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i10, i11, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i13 = i18;
            i14 = i17;
            i15 = i10 - i17;
            i16 = i11 - i18;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i14, i13, i15, i16, this.mScrollOffset, i12, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        boolean z10 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i24 = iArr5[0];
        this.mLastTouchX = i23 - i24;
        int i25 = this.mLastTouchY;
        int i26 = iArr5[1];
        this.mLastTouchY = i25 - i26;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.f0.a(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i20, motionEvent.getY(), i22);
            }
            considerReleasingGlowsOnScroll(i10, i11);
        }
        if (i14 != 0 || i13 != 0) {
            dispatchOnScrolled(i14, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i14 == 0 && i13 == 0) ? false : true;
    }

    void scrollStep(int i10, int i11, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        androidx.core.os.l.a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iV1 = i10 != 0 ? this.mLayout.v1(i10, this.mRecycler, this.mState) : 0;
        int iX1 = i11 != 0 ? this.mLayout.x1(i11, this.mRecycler, this.mState) : 0;
        androidx.core.os.l.b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iV1;
            iArr[1] = iX1;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.w1(i10);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.j jVar) {
        this.mAccessibilityDelegate = jVar;
        z0.J(this, jVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    boolean setChildImportantForAccessibilityInternal(f0 f0Var, int i10) {
        if (!isComputingLayout()) {
            z0.O(f0Var.itemView, i10);
            return true;
        }
        f0Var.mPendingAccessibilityState = i10;
        this.mPendingAccessibilityImportanceChange.add(f0Var);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z10;
        super.setClipToPadding(z10);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        w.h.c(lVar);
        this.mEdgeEffectFactory = lVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z10) {
        this.mHasFixedSize = z10;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.mItemAnimator;
        if (mVar2 != null) {
            mVar2.k();
            this.mItemAnimator.v(null);
        }
        this.mItemAnimator = mVar;
        if (mVar != null) {
            mVar.v(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.mRecycler.L(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            m mVar = this.mItemAnimator;
            if (mVar != null) {
                mVar.k();
            }
            this.mLayout.j1(this.mRecycler);
            this.mLayout.k1(this.mRecycler);
            this.mRecycler.c();
            if (this.mIsAttached) {
                this.mLayout.A(this, this.mRecycler);
            }
            this.mLayout.D1(null);
            this.mLayout = null;
        } else {
            this.mRecycler.c();
        }
        this.mChildHelper.o();
        this.mLayout = pVar;
        if (pVar != null) {
            if (pVar.f3205b != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f3205b.exceptionLabel());
            }
            pVar.D1(this);
            if (this.mIsAttached) {
                this.mLayout.z(this);
            }
        }
        this.mRecycler.P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().n(z10);
    }

    public void setOnFlingListener(s sVar) {
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.mScrollListener = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.mPreserveFocusAfterLayout = z10;
    }

    public void setRecycledViewPool(v vVar) {
        this.mRecycler.J(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
        this.mRecyclerListener = xVar;
    }

    void setScrollState(int i10) {
        if (i10 == this.mScrollState) {
            return;
        }
        this.mScrollState = i10;
        if (i10 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(d0 d0Var) {
        this.mRecycler.K(d0Var);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int iA = accessibilityEvent != null ? x.b.a(accessibilityEvent) : 0;
        this.mEatenAccessibilityChangeFlags |= iA != 0 ? iA : 0;
        return true;
    }

    public void smoothScrollBy(int i10, int i11) {
        smoothScrollBy(i10, i11, null);
    }

    public void smoothScrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.H1(this, this.mState, i10);
        }
    }

    void startInterceptRequestLayout() {
        int i10 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i10;
        if (i10 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().p(i10);
    }

    void stopInterceptRequestLayout(boolean z10) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z10 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z10 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(h hVar, boolean z10) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, true, z10);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    void viewRangeUpdate(int i10, int i11, Object obj) {
        int i12;
        int iJ = this.mChildHelper.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < iJ; i14++) {
            View viewI = this.mChildHelper.i(i14);
            f0 childViewHolderInt = getChildViewHolderInt(viewI);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i12 = childViewHolderInt.mPosition) >= i10 && i12 < i13) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((q) viewI.getLayoutParams()).f3230c = true;
            }
        }
        this.mRecycler.R(i10, i11);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s0.a.f25172a);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().g(i10, i11, i12, i13, iArr, i14);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    f0 findViewHolderForPosition(int i10, boolean z10) {
        int iJ = this.mChildHelper.j();
        f0 f0Var = null;
        for (int i11 = 0; i11 < iJ; i11++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i11));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z10) {
                    if (childViewHolderInt.mPosition != i10) {
                        continue;
                    } else {
                        if (this.mChildHelper.n(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        f0Var = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i10) {
                    continue;
                } else {
                    if (this.mChildHelper.n(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    f0Var = childViewHolderInt;
                }
            }
        }
        return f0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return wHzciBnJlYkdX.QhrKiWxOWuKn;
    }

    public boolean hasNestedScrollingParent(int i10) {
        return getScrollingChildHelper().l(i10);
    }

    void onExitLayoutOrScroll(boolean z10) {
        int i10 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i10;
        if (i10 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z10) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator) {
        smoothScrollBy(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    public boolean startNestedScroll(int i10, int i11) {
        return getScrollingChildHelper().q(i10, i11);
    }

    public void stopNestedScroll(int i10) {
        getScrollingChildHelper().s(i10);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class z extends c0.a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Parcelable f3248c;

        class a implements Parcelable.ClassLoaderCreator<z> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public z[] newArray(int i10) {
                return new z[i10];
            }
        }

        z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3248c = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        void b(z zVar) {
            this.f3248c = zVar.f3248c;
        }

        @Override // c0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f3248c, 0);
        }

        z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mObserver = new y();
        this.mRecycler = new w();
        this.mViewInfoStore = new androidx.recyclerview.widget.n();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new androidx.recyclerview.widget.c();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new e0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new androidx.recyclerview.widget.e.b() : null;
        this.mState = new b0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new n();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = p2.f(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = p2.j(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.v(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (z0.l(this) == 0) {
            z0.O(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.j(this));
        int[] iArr = s0.c.f25176a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        z0.H(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(s0.c.f25185j);
        if (typedArrayObtainStyledAttributes.getInt(s0.c.f25179d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(s0.c.f25178c, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(s0.c.f25180e, false);
        this.mEnableFastScroller = z10;
        if (z10) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(s0.c.f25183h), typedArrayObtainStyledAttributes.getDrawable(s0.c.f25184i), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(s0.c.f25181f), typedArrayObtainStyledAttributes.getDrawable(s0.c.f25182g));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i10, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        z0.H(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        b0.a.d(this, true);
    }

    public final void dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12) {
        smoothScrollBy(i10, i11, interpolator, i12, false);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class q extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        f0 f3228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Rect f3229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f3230c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3231d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3229b = new Rect();
            this.f3230c = true;
            this.f3231d = false;
        }

        public int a() {
            return this.f3228a.getLayoutPosition();
        }

        public boolean b() {
            return this.f3228a.isUpdated();
        }

        public boolean c() {
            return this.f3228a.isRemoved();
        }

        public boolean d() {
            return this.f3228a.isInvalid();
        }

        public q(int i10, int i11) {
            super(i10, i11);
            this.f3229b = new Rect();
            this.f3230c = true;
            this.f3231d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3229b = new Rect();
            this.f3230c = true;
            this.f3231d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3229b = new Rect();
            this.f3230c = true;
            this.f3231d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f3229b = new Rect();
            this.f3230c = true;
            this.f3231d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!pVar.k()) {
            i10 = 0;
        }
        if (!this.mLayout.l()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 == Integer.MIN_VALUE || i12 > 0) {
            if (z10) {
                int i13 = i10 != 0 ? 1 : 0;
                if (i11 != 0) {
                    i13 |= 2;
                }
                startNestedScroll(i13, 1);
            }
            this.mViewFlinger.f(i10, i11, i12, interpolator);
            return;
        }
        scrollBy(i10, i11);
    }

    public void addItemDecoration(o oVar) {
        addItemDecoration(oVar, -1);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f3193a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList<a> f3194b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f3195c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f3196d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f3197e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f3198f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(f0 f0Var);
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f3199a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f3200b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f3201c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f3202d;

            public c a(f0 f0Var) {
                return b(f0Var, 0);
            }

            public c b(f0 f0Var, int i10) {
                View view = f0Var.itemView;
                this.f3199a = view.getLeft();
                this.f3200b = view.getTop();
                this.f3201c = view.getRight();
                this.f3202d = view.getBottom();
                return this;
            }
        }

        static int e(f0 f0Var) {
            int i10 = f0Var.mFlags & 14;
            if (f0Var.isInvalid()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i10;
            }
            int oldPosition = f0Var.getOldPosition();
            int absoluteAdapterPosition = f0Var.getAbsoluteAdapterPosition();
            return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i10 : i10 | 2048;
        }

        public abstract boolean a(f0 f0Var, c cVar, c cVar2);

        public abstract boolean b(f0 f0Var, f0 f0Var2, c cVar, c cVar2);

        public abstract boolean c(f0 f0Var, c cVar, c cVar2);

        public abstract boolean d(f0 f0Var, c cVar, c cVar2);

        public abstract boolean f(f0 f0Var);

        public boolean g(f0 f0Var, List<Object> list) {
            return f(f0Var);
        }

        public final void h(f0 f0Var) {
            r(f0Var);
            b bVar = this.f3193a;
            if (bVar != null) {
                bVar.a(f0Var);
            }
        }

        public final void i() {
            int size = this.f3194b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f3194b.get(i10).a();
            }
            this.f3194b.clear();
        }

        public abstract void j(f0 f0Var);

        public abstract void k();

        public long l() {
            return this.f3195c;
        }

        public long m() {
            return this.f3198f;
        }

        public long n() {
            return this.f3197e;
        }

        public long o() {
            return this.f3196d;
        }

        public abstract boolean p();

        public c q() {
            return new c();
        }

        public c s(b0 b0Var, f0 f0Var) {
            return q().a(f0Var);
        }

        public c t(b0 b0Var, f0 f0Var, int i10, List<Object> list) {
            return q().a(f0Var);
        }

        public abstract void u();

        void v(b bVar) {
            this.f3193a = bVar;
        }

        public void r(f0 f0Var) {
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.b f3204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView f3205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.recyclerview.widget.m.b f3206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.recyclerview.widget.m.b f3207d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.m f3208e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        androidx.recyclerview.widget.m f3209f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        a0 f3210g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f3211h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f3212i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f3213j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f3214k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f3215l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f3216m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f3217n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f3218o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f3219p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f3220q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f3221r;

        class a implements androidx.recyclerview.widget.m.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.m.b
            public View a(int i10) {
                return p.this.I(i10);
            }

            @Override // androidx.recyclerview.widget.m.b
            public int b(View view) {
                return p.this.Q(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.m.b
            public int c() {
                return p.this.d0();
            }

            @Override // androidx.recyclerview.widget.m.b
            public int d() {
                return p.this.n0() - p.this.e0();
            }

            @Override // androidx.recyclerview.widget.m.b
            public int e(View view) {
                return p.this.T(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements androidx.recyclerview.widget.m.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.m.b
            public View a(int i10) {
                return p.this.I(i10);
            }

            @Override // androidx.recyclerview.widget.m.b
            public int b(View view) {
                return p.this.U(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.m.b
            public int c() {
                return p.this.f0();
            }

            @Override // androidx.recyclerview.widget.m.b
            public int d() {
                return p.this.W() - p.this.c0();
            }

            @Override // androidx.recyclerview.widget.m.b
            public int e(View view) {
                return p.this.O(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f3224a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f3225b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f3226c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f3227d;
        }

        public p() {
            a aVar = new a();
            this.f3206c = aVar;
            b bVar = new b();
            this.f3207d = bVar;
            this.f3208e = new androidx.recyclerview.widget.m(aVar);
            this.f3209f = new androidx.recyclerview.widget.m(bVar);
            this.f3211h = false;
            this.f3212i = false;
            this.f3213j = false;
            this.f3214k = true;
            this.f3215l = true;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001c  */
        /* JADX WARN: Code duplicated, block: B:14:0x0020  */
        /* JADX WARN: Code duplicated, block: B:21:0x002f  */
        public static int K(int i10, int i11, int i12, int i13, boolean z10) {
            int iMax = Math.max(0, i10 - i12);
            if (z10) {
                if (i13 >= 0) {
                    i11 = 1073741824;
                } else if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                    i11 = 0;
                    i13 = 0;
                } else {
                    i13 = iMax;
                }
            } else if (i13 >= 0) {
                i11 = 1073741824;
            } else if (i13 == -1) {
                i13 = iMax;
            } else if (i13 != -2) {
                i11 = 0;
                i13 = 0;
            } else if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
                i13 = iMax;
                i11 = Integer.MIN_VALUE;
            } else {
                i13 = iMax;
                i11 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i13, i11);
        }

        private int[] L(View view, Rect rect) {
            int[] iArr = new int[2];
            int iD0 = d0();
            int iF0 = f0();
            int iN0 = n0() - e0();
            int iW = W() - c0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - iD0;
            int iMin = Math.min(0, i10);
            int i11 = top - iF0;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - iN0;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - iW);
            if (Y() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            iArr[0] = iMax;
            iArr[1] = iMin2;
            return iArr;
        }

        private void f(View view, int i10, boolean z10) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z10 || childViewHolderInt.isRemoved()) {
                this.f3205b.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.f3205b.mViewInfoStore.p(childViewHolderInt);
            }
            q qVar = (q) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.f3204a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3205b) {
                int iM = this.f3204a.m(view);
                if (i10 == -1) {
                    i10 = this.f3204a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3205b.indexOfChild(view) + this.f3205b.exceptionLabel());
                }
                if (iM != i10) {
                    this.f3205b.mLayout.A0(iM, i10);
                }
            } else {
                this.f3204a.a(view, i10, false);
                qVar.f3230c = true;
                a0 a0Var = this.f3210g;
                if (a0Var != null && a0Var.h()) {
                    this.f3210g.k(view);
                }
            }
            if (qVar.f3231d) {
                childViewHolderInt.itemView.invalidate();
                qVar.f3231d = false;
            }
        }

        public static d h0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s0.c.f25176a, i10, i11);
            dVar.f3224a = typedArrayObtainStyledAttributes.getInt(s0.c.f25177b, 1);
            dVar.f3225b = typedArrayObtainStyledAttributes.getInt(s0.c.f25187l, 1);
            dVar.f3226c = typedArrayObtainStyledAttributes.getBoolean(s0.c.f25186k, false);
            dVar.f3227d = typedArrayObtainStyledAttributes.getBoolean(s0.c.f25188m, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int n(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        private boolean s0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iD0 = d0();
            int iF0 = f0();
            int iN0 = n0() - e0();
            int iW = W() - c0();
            Rect rect = this.f3205b.mTempRect;
            P(focusedChild, rect);
            return rect.left - i10 < iN0 && rect.right - i10 > iD0 && rect.top - i11 < iW && rect.bottom - i11 > iF0;
        }

        private void u1(w wVar, int i10, View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.f3205b.mAdapter.hasStableIds()) {
                p1(i10);
                wVar.H(childViewHolderInt);
            } else {
                x(i10);
                wVar.I(view);
                this.f3205b.mViewInfoStore.k(childViewHolderInt);
            }
        }

        private static boolean v0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        private void y(int i10, View view) {
            this.f3204a.d(i10);
        }

        void A(RecyclerView recyclerView, w wVar) {
            this.f3212i = false;
            H0(recyclerView, wVar);
        }

        public void A0(int i10, int i11) {
            View viewI = I(i10);
            if (viewI != null) {
                x(i10);
                h(viewI, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f3205b.toString());
            }
        }

        public void A1(int i10, int i11) {
            this.f3205b.setMeasuredDimension(i10, i11);
        }

        public View B(View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.f3205b;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f3204a.n(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        public void B0(int i10) {
            RecyclerView recyclerView = this.f3205b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i10);
            }
        }

        public void B1(Rect rect, int i10, int i11) {
            A1(n(i10, rect.width() + d0() + e0(), b0()), n(i11, rect.height() + f0() + c0(), a0()));
        }

        public View C(int i10) {
            int iJ = J();
            for (int i11 = 0; i11 < iJ; i11++) {
                View viewI = I(i11);
                f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(viewI);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i10 && !childViewHolderInt.shouldIgnore() && (this.f3205b.mState.e() || !childViewHolderInt.isRemoved())) {
                    return viewI;
                }
            }
            return null;
        }

        public void C0(int i10) {
            RecyclerView recyclerView = this.f3205b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i10);
            }
        }

        void C1(int i10, int i11) {
            int iJ = J();
            if (iJ == 0) {
                this.f3205b.defaultOnMeasure(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < iJ; i16++) {
                View viewI = I(i16);
                Rect rect = this.f3205b.mTempRect;
                P(viewI, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f3205b.mTempRect.set(i15, i13, i12, i14);
            B1(this.f3205b.mTempRect, i10, i11);
        }

        public abstract q D();

        void D1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f3205b = null;
                this.f3204a = null;
                this.f3220q = 0;
                this.f3221r = 0;
            } else {
                this.f3205b = recyclerView;
                this.f3204a = recyclerView.mChildHelper;
                this.f3220q = recyclerView.getWidth();
                this.f3221r = recyclerView.getHeight();
            }
            this.f3218o = 1073741824;
            this.f3219p = 1073741824;
        }

        public q E(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public boolean E0(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        boolean E1(View view, int i10, int i11, q qVar) {
            return (!view.isLayoutRequested() && this.f3214k && v0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && v0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public q F(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof q) {
                return new q((q) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        boolean F1() {
            return false;
        }

        public int G() {
            return -1;
        }

        boolean G1(View view, int i10, int i11, q qVar) {
            return (this.f3214k && v0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && v0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public int H(View view) {
            return ((q) view.getLayoutParams()).f3229b.bottom;
        }

        public void H0(RecyclerView recyclerView, w wVar) {
            G0(recyclerView);
        }

        public void H1(RecyclerView recyclerView, b0 b0Var, int i10) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public View I(int i10) {
            androidx.recyclerview.widget.b bVar = this.f3204a;
            if (bVar != null) {
                return bVar.f(i10);
            }
            return null;
        }

        public View I0(View view, int i10, w wVar, b0 b0Var) {
            return null;
        }

        public void I1(a0 a0Var) {
            a0 a0Var2 = this.f3210g;
            if (a0Var2 != null && a0Var != a0Var2 && a0Var2.h()) {
                this.f3210g.r();
            }
            this.f3210g = a0Var;
            a0Var.q(this.f3205b, this);
        }

        public int J() {
            androidx.recyclerview.widget.b bVar = this.f3204a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public void J0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3205b;
            K0(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        void J1() {
            a0 a0Var = this.f3210g;
            if (a0Var != null) {
                a0Var.r();
            }
        }

        public void K0(w wVar, b0 b0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3205b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f3205b.canScrollVertically(-1) && !this.f3205b.canScrollHorizontally(-1) && !this.f3205b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            h hVar = this.f3205b.mAdapter;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.getItemCount());
            }
        }

        public boolean K1() {
            return false;
        }

        public void L0(w wVar, b0 b0Var, x.p pVar) {
            if (this.f3205b.canScrollVertically(-1) || this.f3205b.canScrollHorizontally(-1)) {
                pVar.a(8192);
                pVar.c0(true);
            }
            if (this.f3205b.canScrollVertically(1) || this.f3205b.canScrollHorizontally(1)) {
                pVar.a(4096);
                pVar.c0(true);
            }
            pVar.X(x.p.e.a(j0(wVar, b0Var), N(wVar, b0Var), u0(wVar, b0Var), k0(wVar, b0Var)));
        }

        public boolean M() {
            RecyclerView recyclerView = this.f3205b;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        void M0(x.p pVar) {
            RecyclerView recyclerView = this.f3205b;
            L0(recyclerView.mRecycler, recyclerView.mState, pVar);
        }

        public int N(w wVar, b0 b0Var) {
            return -1;
        }

        void N0(View view, x.p pVar) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.f3204a.n(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.f3205b;
            O0(recyclerView.mRecycler, recyclerView.mState, view, pVar);
        }

        public int O(View view) {
            return view.getBottom() + H(view);
        }

        public void P(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public View P0(View view, int i10) {
            return null;
        }

        public int Q(View view) {
            return view.getLeft() - Z(view);
        }

        public int R(View view) {
            Rect rect = ((q) view.getLayoutParams()).f3229b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int S(View view) {
            Rect rect = ((q) view.getLayoutParams()).f3229b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int T(View view) {
            return view.getRight() + i0(view);
        }

        public int U(View view) {
            return view.getTop() - l0(view);
        }

        public View V() {
            View focusedChild;
            RecyclerView recyclerView = this.f3205b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f3204a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void V0(RecyclerView recyclerView, int i10, int i11, Object obj) {
            U0(recyclerView, i10, i11);
        }

        public int W() {
            return this.f3221r;
        }

        public void W0(w wVar, b0 b0Var) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int X() {
            return this.f3219p;
        }

        public int Y() {
            return z0.n(this.f3205b);
        }

        public void Y0(w wVar, b0 b0Var, int i10, int i11) {
            this.f3205b.defaultOnMeasure(i10, i11);
        }

        public int Z(View view) {
            return ((q) view.getLayoutParams()).f3229b.left;
        }

        @Deprecated
        public boolean Z0(RecyclerView recyclerView, View view, View view2) {
            return w0() || recyclerView.isComputingLayout();
        }

        public int a0() {
            return z0.o(this.f3205b);
        }

        public boolean a1(RecyclerView recyclerView, b0 b0Var, View view, View view2) {
            return Z0(recyclerView, view, view2);
        }

        public void b(View view) {
            c(view, -1);
        }

        public int b0() {
            return z0.p(this.f3205b);
        }

        public void c(View view, int i10) {
            f(view, i10, true);
        }

        public int c0() {
            RecyclerView recyclerView = this.f3205b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable c1() {
            return null;
        }

        public void d(View view) {
            e(view, -1);
        }

        public int d0() {
            RecyclerView recyclerView = this.f3205b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void e(View view, int i10) {
            f(view, i10, false);
        }

        public int e0() {
            RecyclerView recyclerView = this.f3205b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void e1(a0 a0Var) {
            if (this.f3210g == a0Var) {
                this.f3210g = null;
            }
        }

        public int f0() {
            RecyclerView recyclerView = this.f3205b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        boolean f1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f3205b;
            return g1(recyclerView.mRecycler, recyclerView.mState, i10, bundle);
        }

        public void g(String str) {
            RecyclerView recyclerView = this.f3205b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public int g0(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        /* JADX WARN: Code duplicated, block: B:30:0x008f A[PHI: r9
          0x008f: PHI (r9v8 int) = (r9v5 int), (r9v11 int) binds: [B:27:0x007f, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean g1(w wVar, b0 b0Var, int i10, Bundle bundle) {
            int iF0;
            int iD0;
            int i11;
            int i12;
            if (this.f3205b == null) {
                return false;
            }
            int iW = W();
            int iN0 = n0();
            Rect rect = new Rect();
            if (this.f3205b.getMatrix().isIdentity() && this.f3205b.getGlobalVisibleRect(rect)) {
                iW = rect.height();
                iN0 = rect.width();
            }
            if (i10 == 4096) {
                iF0 = this.f3205b.canScrollVertically(1) ? (iW - f0()) - c0() : 0;
                if (this.f3205b.canScrollHorizontally(1)) {
                    iD0 = (iN0 - d0()) - e0();
                    i11 = iF0;
                    i12 = iD0;
                } else {
                    i11 = iF0;
                    i12 = 0;
                }
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                iF0 = this.f3205b.canScrollVertically(-1) ? -((iW - f0()) - c0()) : 0;
                if (this.f3205b.canScrollHorizontally(-1)) {
                    iD0 = -((iN0 - d0()) - e0());
                    i11 = iF0;
                    i12 = iD0;
                } else {
                    i11 = iF0;
                    i12 = 0;
                }
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.f3205b.smoothScrollBy(i12, i11, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void h(View view, int i10) {
            i(view, i10, (q) view.getLayoutParams());
        }

        boolean h1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f3205b;
            return i1(recyclerView.mRecycler, recyclerView.mState, view, i10, bundle);
        }

        public void i(View view, int i10, q qVar) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.f3205b.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.f3205b.mViewInfoStore.p(childViewHolderInt);
            }
            this.f3204a.c(view, i10, qVar, childViewHolderInt.isRemoved());
        }

        public int i0(View view) {
            return ((q) view.getLayoutParams()).f3229b.right;
        }

        public boolean i1(w wVar, b0 b0Var, View view, int i10, Bundle bundle) {
            return false;
        }

        public void j(View view, Rect rect) {
            RecyclerView recyclerView = this.f3205b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public int j0(w wVar, b0 b0Var) {
            return -1;
        }

        public void j1(w wVar) {
            for (int iJ = J() - 1; iJ >= 0; iJ--) {
                if (!RecyclerView.getChildViewHolderInt(I(iJ)).shouldIgnore()) {
                    m1(iJ, wVar);
                }
            }
        }

        public boolean k() {
            return false;
        }

        public int k0(w wVar, b0 b0Var) {
            return 0;
        }

        void k1(w wVar) {
            int iJ = wVar.j();
            for (int i10 = iJ - 1; i10 >= 0; i10--) {
                View viewN = wVar.n(i10);
                f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(viewN);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.f3205b.removeDetachedView(viewN, false);
                    }
                    m mVar = this.f3205b.mItemAnimator;
                    if (mVar != null) {
                        mVar.j(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    wVar.D(viewN);
                }
            }
            wVar.e();
            if (iJ > 0) {
                this.f3205b.invalidate();
            }
        }

        public boolean l() {
            return false;
        }

        public int l0(View view) {
            return ((q) view.getLayoutParams()).f3229b.top;
        }

        public void l1(View view, w wVar) {
            o1(view);
            wVar.G(view);
        }

        public boolean m(q qVar) {
            return qVar != null;
        }

        public void m0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((q) view.getLayoutParams()).f3229b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f3205b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f3205b.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void m1(int i10, w wVar) {
            View viewI = I(i10);
            p1(i10);
            wVar.G(viewI);
        }

        public int n0() {
            return this.f3220q;
        }

        public boolean n1(Runnable runnable) {
            RecyclerView recyclerView = this.f3205b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public int o0() {
            return this.f3218o;
        }

        public void o1(View view) {
            this.f3204a.p(view);
        }

        boolean p0() {
            int iJ = J();
            for (int i10 = 0; i10 < iJ; i10++) {
                ViewGroup.LayoutParams layoutParams = I(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void p1(int i10) {
            if (I(i10) != null) {
                this.f3204a.q(i10);
            }
        }

        public int q(b0 b0Var) {
            return 0;
        }

        public boolean q0() {
            return this.f3212i;
        }

        public boolean q1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return r1(recyclerView, view, rect, z10, false);
        }

        public int r(b0 b0Var) {
            return 0;
        }

        public boolean r0() {
            return this.f3213j;
        }

        public boolean r1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] iArrL = L(view, rect);
            int i10 = iArrL[0];
            int i11 = iArrL[1];
            if ((z11 && !s0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.smoothScrollBy(i10, i11);
            }
            return true;
        }

        public int s(b0 b0Var) {
            return 0;
        }

        public void s1() {
            RecyclerView recyclerView = this.f3205b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int t(b0 b0Var) {
            return 0;
        }

        public final boolean t0() {
            return this.f3215l;
        }

        public void t1() {
            this.f3211h = true;
        }

        public int u(b0 b0Var) {
            return 0;
        }

        public boolean u0(w wVar, b0 b0Var) {
            return false;
        }

        public int v(b0 b0Var) {
            return 0;
        }

        public int v1(int i10, w wVar, b0 b0Var) {
            return 0;
        }

        public void w(w wVar) {
            for (int iJ = J() - 1; iJ >= 0; iJ--) {
                u1(wVar, iJ, I(iJ));
            }
        }

        public boolean w0() {
            a0 a0Var = this.f3210g;
            return a0Var != null && a0Var.h();
        }

        public void x(int i10) {
            y(i10, I(i10));
        }

        public boolean x0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f3208e.b(view, 24579) && this.f3209f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public int x1(int i10, w wVar, b0 b0Var) {
            return 0;
        }

        public void y0(View view, int i10, int i11, int i12, int i13) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f3229b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        void y1(RecyclerView recyclerView) {
            z1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        void z(RecyclerView recyclerView) {
            this.f3212i = true;
            F0(recyclerView);
        }

        public void z0(View view, int i10, int i11) {
            q qVar = (q) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f3205b.getItemDecorInsetsForChild(view);
            int i12 = i10 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i13 = i11 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int iK = K(n0(), o0(), d0() + e0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) qVar).width, k());
            int iK2 = K(W(), X(), f0() + c0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) qVar).height, l());
            if (E1(view, iK, iK2, qVar)) {
                view.measure(iK, iK2);
            }
        }

        void z1(int i10, int i11) {
            this.f3220q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f3218o = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f3220q = 0;
            }
            this.f3221r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f3219p = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.f3221r = 0;
        }

        public void F0(RecyclerView recyclerView) {
        }

        @Deprecated
        public void G0(RecyclerView recyclerView) {
        }

        public void R0(RecyclerView recyclerView) {
        }

        public void X0(b0 b0Var) {
        }

        public void b1(Parcelable parcelable) {
        }

        public void d1(int i10) {
        }

        public void w1(int i10) {
        }

        public void D0(h hVar, h hVar2) {
        }

        public void p(int i10, c cVar) {
        }

        public void Q0(RecyclerView recyclerView, int i10, int i11) {
        }

        public void T0(RecyclerView recyclerView, int i10, int i11) {
        }

        public void U0(RecyclerView recyclerView, int i10, int i11) {
        }

        public void O0(w wVar, b0 b0Var, View view, x.p pVar) {
        }

        public void S0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public void o(int i10, int i11, b0 b0Var, c cVar) {
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ArrayList<f0> f3239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<f0> f3240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList<f0> f3241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<f0> f3242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f3243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f3244f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        v f3245g;

        public w() {
            ArrayList<f0> arrayList = new ArrayList<>();
            this.f3239a = arrayList;
            this.f3240b = null;
            this.f3241c = new ArrayList<>();
            this.f3242d = Collections.unmodifiableList(arrayList);
            this.f3243e = 2;
            this.f3244f = 2;
        }

        private void B(h<?> hVar) {
            C(hVar, false);
        }

        private void C(h<?> hVar, boolean z10) {
            v vVar = this.f3245g;
            if (vVar != null) {
                vVar.e(hVar, z10);
            }
        }

        private boolean M(f0 f0Var, int i10, int i11, long j10) {
            f0Var.mBindingAdapter = null;
            f0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = f0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j10 != RecyclerView.FOREVER_NS && !this.f3245g.m(itemViewType, nanoTime, j10)) {
                return false;
            }
            RecyclerView.this.mAdapter.bindViewHolder(f0Var, i10);
            this.f3245g.f(f0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(f0Var);
            if (!RecyclerView.this.mState.e()) {
                return true;
            }
            f0Var.mPreLayoutPosition = i11;
            return true;
        }

        private void b(f0 f0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = f0Var.itemView;
                if (z0.l(view) == 0) {
                    z0.O(view, 1);
                }
                androidx.recyclerview.widget.j jVar = RecyclerView.this.mAccessibilityDelegate;
                if (jVar == null) {
                    return;
                }
                androidx.core.view.a aVarN = jVar.n();
                if (aVarN instanceof androidx.recyclerview.widget.j.a) {
                    ((androidx.recyclerview.widget.j.a) aVarN).o(view);
                }
                z0.J(view, aVarN);
            }
        }

        private void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(f0 f0Var) {
            View view = f0Var.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        private void u() {
            if (this.f3245g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f3245g.b(RecyclerView.this.mAdapter);
            }
        }

        void A() {
            for (int i10 = 0; i10 < this.f3241c.size(); i10++) {
                b0.a.a(this.f3241c.get(i10).itemView);
            }
            B(RecyclerView.this.mAdapter);
        }

        void D(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            H(childViewHolderInt);
        }

        void E() {
            for (int size = this.f3241c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f3241c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.b();
            }
        }

        void F(int i10) {
            a(this.f3241c.get(i10), true);
            this.f3241c.remove(i10);
        }

        public void G(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            H(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            RecyclerView.this.mItemAnimator.j(childViewHolderInt);
        }

        void H(f0 f0Var) {
            boolean z10;
            boolean z11 = false;
            boolean z12 = true;
            if (f0Var.isScrap() || f0Var.itemView.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(f0Var.isScrap());
                sb2.append(" isAttached:");
                sb2.append(f0Var.itemView.getParent() != null);
                sb2.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (f0Var.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f0Var + RecyclerView.this.exceptionLabel());
            }
            if (f0Var.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            }
            boolean zDoesTransientStatePreventRecycling = f0Var.doesTransientStatePreventRecycling();
            h hVar = RecyclerView.this.mAdapter;
            if ((hVar != null && zDoesTransientStatePreventRecycling && hVar.onFailedToRecycleView(f0Var)) || f0Var.isRecyclable()) {
                if (this.f3244f <= 0 || f0Var.hasAnyOfTheFlags(526)) {
                    z10 = false;
                } else {
                    int size = this.f3241c.size();
                    if (size >= this.f3244f && size > 0) {
                        F(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.d(f0Var.mPosition)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.mPrefetchRegistry.d(this.f3241c.get(i10).mPosition)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f3241c.add(size, f0Var);
                    z10 = true;
                }
                if (z10) {
                    z12 = false;
                } else {
                    a(f0Var, true);
                }
                z11 = z10;
            } else {
                z12 = false;
            }
            RecyclerView.this.mViewInfoStore.q(f0Var);
            if (z11 || z12 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            b0.a.a(f0Var.itemView);
            f0Var.mBindingAdapter = null;
            f0Var.mOwnerRecyclerView = null;
        }

        void I(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f3240b == null) {
                    this.f3240b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f3240b.add(childViewHolderInt);
                return;
            }
            if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || RecyclerView.this.mAdapter.hasStableIds()) {
                childViewHolderInt.setScrapContainer(this, false);
                this.f3239a.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
        }

        void J(v vVar) {
            B(RecyclerView.this.mAdapter);
            v vVar2 = this.f3245g;
            if (vVar2 != null) {
                vVar2.d();
            }
            this.f3245g = vVar;
            if (vVar != null && RecyclerView.this.getAdapter() != null) {
                this.f3245g.a();
            }
            u();
        }

        public void L(int i10) {
            this.f3243e = i10;
            P();
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0037 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:19:0x0039  */
        /* JADX WARN: Code duplicated, block: B:21:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0054  */
        /* JADX WARN: Code duplicated, block: B:27:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x005f  */
        /* JADX WARN: Code duplicated, block: B:59:0x012c A[PHI: r1 r4
          0x012c: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$f0) = (r1v11 androidx.recyclerview.widget.RecyclerView$f0), (r1v30 androidx.recyclerview.widget.RecyclerView$f0) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]
          0x012c: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:68:0x014d  */
        /* JADX WARN: Code duplicated, block: B:74:0x0179  */
        /* JADX WARN: Code duplicated, block: B:76:0x017f  */
        /* JADX WARN: Code duplicated, block: B:85:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:86:0x01b7  */
        /* JADX WARN: Code duplicated, block: B:88:0x01bf  */
        /* JADX WARN: Code duplicated, block: B:89:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:92:0x01d3 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:94:0x01d6  */
        f0 N(int i10, boolean z10, long j10) {
            f0 f0VarL;
            boolean z11;
            f0 f0Var;
            boolean z12;
            boolean zM;
            ViewGroup.LayoutParams layoutParams;
            q qVar;
            int iM;
            RecyclerView recyclerViewFindNestedRecyclerView;
            if (i10 < 0 || i10 >= RecyclerView.this.mState.b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i10 + "(" + i10 + "). Item count:" + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
            }
            if (RecyclerView.this.mState.e()) {
                f0VarL = h(i10);
                if (f0VarL != null) {
                    z11 = true;
                }
                if (f0VarL == null && (f0VarL = m(i10, z10)) != null) {
                    if (Q(f0VarL)) {
                        z11 = true;
                    } else {
                        if (!z10) {
                            f0VarL.addFlags(4);
                            if (f0VarL.isScrap()) {
                                RecyclerView.this.removeDetachedView(f0VarL.itemView, false);
                                f0VarL.unScrap();
                            } else if (f0VarL.wasReturnedFromScrap()) {
                                f0VarL.clearReturnedFromScrapFlag();
                            }
                            H(f0VarL);
                        }
                        f0VarL = null;
                    }
                }
                if (f0VarL == null) {
                    f0Var = f0VarL;
                } else {
                    iM = RecyclerView.this.mAdapterHelper.m(i10);
                    if (iM >= 0 || iM >= RecyclerView.this.mAdapter.getItemCount()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iM + ").state:" + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
                    }
                    int itemViewType = RecyclerView.this.mAdapter.getItemViewType(iM);
                    if (RecyclerView.this.mAdapter.hasStableIds() && (f0VarL = l(RecyclerView.this.mAdapter.getItemId(iM), itemViewType, z10)) != null) {
                        f0VarL.mPosition = iM;
                        z11 = true;
                    }
                    if (f0VarL == null) {
                        f0 f0VarH = i().h(itemViewType);
                        if (f0VarH != null) {
                            f0VarH.resetInternal();
                            if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                r(f0VarH);
                            }
                        }
                        f0VarL = f0VarH;
                    }
                    if (f0VarL == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j10 != RecyclerView.FOREVER_NS && !this.f3245g.n(itemViewType, nanoTime, j10)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        f0 f0VarCreateViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType);
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(f0VarCreateViewHolder.itemView)) != null) {
                            f0VarCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                        }
                        this.f3245g.g(itemViewType, RecyclerView.this.getNanoTime() - nanoTime);
                        f0Var = f0VarCreateViewHolder;
                    } else {
                        f0Var = f0VarL;
                    }
                }
                z12 = z11;
                if (z12 && !RecyclerView.this.mState.e() && f0Var.hasAnyOfTheFlags(8192)) {
                    f0Var.setFlags(0, 8192);
                    if (RecyclerView.this.mState.f3171k) {
                        int iE = m.e(f0Var) | 4096;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(f0Var, recyclerView2.mItemAnimator.t(recyclerView2.mState, f0Var, iE, f0Var.getUnmodifiedPayloads()));
                    }
                }
                if (RecyclerView.this.mState.e() || !f0Var.isBound()) {
                    if (f0Var.isBound() || f0Var.needsUpdate() || f0Var.isInvalid()) {
                        zM = M(f0Var, RecyclerView.this.mAdapterHelper.m(i10), i10, j10);
                    }
                    layoutParams = f0Var.itemView.getLayoutParams();
                    if (layoutParams == null) {
                        qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                        f0Var.itemView.setLayoutParams(qVar);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        qVar = (q) layoutParams;
                    } else {
                        qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                        f0Var.itemView.setLayoutParams(qVar);
                    }
                    qVar.f3228a = f0Var;
                    qVar.f3231d = !z12 && zM;
                    return f0Var;
                }
                f0Var.mPreLayoutPosition = i10;
                zM = false;
                layoutParams = f0Var.itemView.getLayoutParams();
                if (layoutParams == null) {
                    qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                    f0Var.itemView.setLayoutParams(qVar);
                } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                    qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                    f0Var.itemView.setLayoutParams(qVar);
                } else {
                    qVar = (q) layoutParams;
                }
                qVar.f3228a = f0Var;
                qVar.f3231d = !z12 && zM;
                return f0Var;
            }
            f0VarL = null;
            z11 = false;
            if (f0VarL == null) {
                if (Q(f0VarL)) {
                    if (!z10) {
                        f0VarL.addFlags(4);
                        if (f0VarL.isScrap()) {
                            RecyclerView.this.removeDetachedView(f0VarL.itemView, false);
                            f0VarL.unScrap();
                        } else if (f0VarL.wasReturnedFromScrap()) {
                            f0VarL.clearReturnedFromScrapFlag();
                        }
                        H(f0VarL);
                    }
                    f0VarL = null;
                } else {
                    z11 = true;
                }
            }
            if (f0VarL == null) {
                iM = RecyclerView.this.mAdapterHelper.m(i10);
                if (iM >= 0) {
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iM + ").state:" + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
            }
            f0Var = f0VarL;
            z12 = z11;
            if (z12) {
                f0Var.setFlags(0, 8192);
                if (RecyclerView.this.mState.f3171k) {
                    int iE2 = m.e(f0Var) | 4096;
                    RecyclerView recyclerView3 = RecyclerView.this;
                    RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(f0Var, recyclerView3.mItemAnimator.t(recyclerView3.mState, f0Var, iE2, f0Var.getUnmodifiedPayloads()));
                }
            }
            if (RecyclerView.this.mState.e()) {
                if (f0Var.isBound()) {
                }
                zM = M(f0Var, RecyclerView.this.mAdapterHelper.m(i10), i10, j10);
            } else {
                if (f0Var.isBound()) {
                }
                zM = M(f0Var, RecyclerView.this.mAdapterHelper.m(i10), i10, j10);
            }
            layoutParams = f0Var.itemView.getLayoutParams();
            if (layoutParams == null) {
                qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                f0Var.itemView.setLayoutParams(qVar);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                f0Var.itemView.setLayoutParams(qVar);
            } else {
                qVar = (q) layoutParams;
            }
            qVar.f3228a = f0Var;
            qVar.f3231d = !z12 && zM;
            return f0Var;
        }

        void O(f0 f0Var) {
            if (f0Var.mInChangeScrap) {
                this.f3240b.remove(f0Var);
            } else {
                this.f3239a.remove(f0Var);
            }
            f0Var.mScrapContainer = null;
            f0Var.mInChangeScrap = false;
            f0Var.clearReturnedFromScrapFlag();
        }

        void P() {
            p pVar = RecyclerView.this.mLayout;
            this.f3244f = this.f3243e + (pVar != null ? pVar.f3216m : 0);
            for (int size = this.f3241c.size() - 1; size >= 0 && this.f3241c.size() > this.f3244f; size--) {
                F(size);
            }
        }

        boolean Q(f0 f0Var) {
            if (f0Var.isRemoved()) {
                return RecyclerView.this.mState.e();
            }
            int i10 = f0Var.mPosition;
            if (i10 >= 0 && i10 < RecyclerView.this.mAdapter.getItemCount()) {
                if (RecyclerView.this.mState.e() || RecyclerView.this.mAdapter.getItemViewType(f0Var.mPosition) == f0Var.getItemViewType()) {
                    return !RecyclerView.this.mAdapter.hasStableIds() || f0Var.getItemId() == RecyclerView.this.mAdapter.getItemId(f0Var.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f0Var + RecyclerView.this.exceptionLabel());
        }

        void R(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f3241c.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f3241c.get(size);
                if (f0Var != null && (i12 = f0Var.mPosition) >= i10 && i12 < i13) {
                    f0Var.addFlags(2);
                    F(size);
                }
            }
        }

        void a(f0 f0Var, boolean z10) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(f0Var);
            View view = f0Var.itemView;
            androidx.recyclerview.widget.j jVar = RecyclerView.this.mAccessibilityDelegate;
            if (jVar != null) {
                androidx.core.view.a aVarN = jVar.n();
                z0.J(view, aVarN instanceof androidx.recyclerview.widget.j.a ? ((androidx.recyclerview.widget.j.a) aVarN).n(view) : null);
            }
            if (z10) {
                g(f0Var);
            }
            f0Var.mBindingAdapter = null;
            f0Var.mOwnerRecyclerView = null;
            i().k(f0Var);
        }

        public void c() {
            this.f3239a.clear();
            E();
        }

        void d() {
            int size = this.f3241c.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f3241c.get(i10).clearOldPosition();
            }
            int size2 = this.f3239a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f3239a.get(i11).clearOldPosition();
            }
            ArrayList<f0> arrayList = this.f3240b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    this.f3240b.get(i12).clearOldPosition();
                }
            }
        }

        void e() {
            this.f3239a.clear();
            ArrayList<f0> arrayList = this.f3240b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.mState.b()) {
                return !RecyclerView.this.mState.e() ? i10 : RecyclerView.this.mAdapterHelper.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
        }

        void g(f0 f0Var) {
            x xVar = RecyclerView.this.mRecyclerListener;
            if (xVar != null) {
                xVar.a(f0Var);
            }
            int size = RecyclerView.this.mRecyclerListeners.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView.this.mRecyclerListeners.get(i10).a(f0Var);
            }
            h hVar = RecyclerView.this.mAdapter;
            if (hVar != null) {
                hVar.onViewRecycled(f0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.q(f0Var);
            }
        }

        f0 h(int i10) {
            int size;
            int iM;
            ArrayList<f0> arrayList = this.f3240b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    f0 f0Var = this.f3240b.get(i11);
                    if (!f0Var.wasReturnedFromScrap() && f0Var.getLayoutPosition() == i10) {
                        f0Var.addFlags(32);
                        return f0Var;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (iM = RecyclerView.this.mAdapterHelper.m(i10)) > 0 && iM < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(iM);
                    for (int i12 = 0; i12 < size; i12++) {
                        f0 f0Var2 = this.f3240b.get(i12);
                        if (!f0Var2.wasReturnedFromScrap() && f0Var2.getItemId() == itemId) {
                            f0Var2.addFlags(32);
                            return f0Var2;
                        }
                    }
                }
            }
            return null;
        }

        v i() {
            if (this.f3245g == null) {
                this.f3245g = new v();
                u();
            }
            return this.f3245g;
        }

        int j() {
            return this.f3239a.size();
        }

        public List<f0> k() {
            return this.f3242d;
        }

        f0 l(long j10, int i10, boolean z10) {
            for (int size = this.f3239a.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f3239a.get(size);
                if (f0Var.getItemId() == j10 && !f0Var.wasReturnedFromScrap()) {
                    if (i10 == f0Var.getItemViewType()) {
                        f0Var.addFlags(32);
                        if (f0Var.isRemoved() && !RecyclerView.this.mState.e()) {
                            f0Var.setFlags(2, 14);
                        }
                        return f0Var;
                    }
                    if (!z10) {
                        this.f3239a.remove(size);
                        RecyclerView.this.removeDetachedView(f0Var.itemView, false);
                        D(f0Var.itemView);
                    }
                }
            }
            int size2 = this.f3241c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                f0 f0Var2 = this.f3241c.get(size2);
                if (f0Var2.getItemId() == j10 && !f0Var2.isAttachedToTransitionOverlay()) {
                    if (i10 == f0Var2.getItemViewType()) {
                        if (!z10) {
                            this.f3241c.remove(size2);
                        }
                        return f0Var2;
                    }
                    if (!z10) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        f0 m(int i10, boolean z10) {
            View viewE;
            int size = this.f3239a.size();
            for (int i11 = 0; i11 < size; i11++) {
                f0 f0Var = this.f3239a.get(i11);
                if (!f0Var.wasReturnedFromScrap() && f0Var.getLayoutPosition() == i10 && !f0Var.isInvalid() && (RecyclerView.this.mState.f3168h || !f0Var.isRemoved())) {
                    f0Var.addFlags(32);
                    return f0Var;
                }
            }
            if (z10 || (viewE = RecyclerView.this.mChildHelper.e(i10)) == null) {
                int size2 = this.f3241c.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    f0 f0Var2 = this.f3241c.get(i12);
                    if (!f0Var2.isInvalid() && f0Var2.getLayoutPosition() == i10 && !f0Var2.isAttachedToTransitionOverlay()) {
                        if (!z10) {
                            this.f3241c.remove(i12);
                        }
                        return f0Var2;
                    }
                }
                return null;
            }
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(viewE);
            RecyclerView.this.mChildHelper.s(viewE);
            int iM = RecyclerView.this.mChildHelper.m(viewE);
            if (iM != -1) {
                RecyclerView.this.mChildHelper.d(iM);
                I(viewE);
                childViewHolderInt.addFlags(8224);
                return childViewHolderInt;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
        }

        View n(int i10) {
            return this.f3239a.get(i10).itemView;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        View p(int i10, boolean z10) {
            return N(i10, z10, RecyclerView.FOREVER_NS).itemView;
        }

        void s() {
            int size = this.f3241c.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) this.f3241c.get(i10).itemView.getLayoutParams();
                if (qVar != null) {
                    qVar.f3230c = true;
                }
            }
        }

        void t() {
            int size = this.f3241c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f0 f0Var = this.f3241c.get(i10);
                if (f0Var != null) {
                    f0Var.addFlags(6);
                    f0Var.addChangePayload(null);
                }
            }
            h hVar = RecyclerView.this.mAdapter;
            if (hVar == null || !hVar.hasStableIds()) {
                E();
            }
        }

        void v(int i10, int i11) {
            int size = this.f3241c.size();
            for (int i12 = 0; i12 < size; i12++) {
                f0 f0Var = this.f3241c.get(i12);
                if (f0Var != null && f0Var.mPosition >= i10) {
                    f0Var.offsetPosition(i11, false);
                }
            }
        }

        void w(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f3241c.size();
            for (int i16 = 0; i16 < size; i16++) {
                f0 f0Var = this.f3241c.get(i16);
                if (f0Var != null && (i15 = f0Var.mPosition) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        f0Var.offsetPosition(i11 - i10, false);
                    } else {
                        f0Var.offsetPosition(i12, false);
                    }
                }
            }
        }

        void x(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f3241c.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f3241c.get(size);
                if (f0Var != null) {
                    int i13 = f0Var.mPosition;
                    if (i13 >= i12) {
                        f0Var.offsetPosition(-i11, z10);
                    } else if (i13 >= i10) {
                        f0Var.addFlags(8);
                        F(size);
                    }
                }
            }
        }

        void y(h<?> hVar, h<?> hVar2, boolean z10) {
            c();
            C(hVar, true);
            i().j(hVar, hVar2, z10);
            u();
        }

        void z() {
            u();
        }

        void K(d0 d0Var) {
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class o {
        @Deprecated
        public void d(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, b0 b0Var) {
            d(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        public void g(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            f(canvas, recyclerView);
        }

        public void i(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            h(canvas, recyclerView);
        }

        @Deprecated
        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class u {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
        }
    }
}
