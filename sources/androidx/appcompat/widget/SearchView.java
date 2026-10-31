package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends q0 implements k.c {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    static final k f1048n0 = new k();
    private Rect A;
    private int[] B;
    private int[] C;
    private final ImageView D;
    private final Drawable E;
    private final int F;
    private final int G;
    private final Intent H;
    private final Intent I;
    private final CharSequence J;
    View.OnFocusChangeListener K;
    private View.OnClickListener L;
    private boolean M;
    private boolean N;
    a0.a O;
    private boolean P;
    private CharSequence Q;
    private boolean R;
    private boolean S;
    private int T;
    private boolean U;
    private CharSequence V;
    private CharSequence W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f1049a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f1050b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    SearchableInfo f1051c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Bundle f1052d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final Runnable f1053e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private Runnable f1054f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1055g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final View.OnClickListener f1056h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    View.OnKeyListener f1057i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f1058j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f1059k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f1060l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private TextWatcher f1061m0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final SearchAutoComplete f1062p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f1063q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final View f1064r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final View f1065s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final ImageView f1066t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final ImageView f1067u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final ImageView f1068v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final ImageView f1069w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final View f1070x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private p f1071y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Rect f1072z;

    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f1073d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private SearchView f1074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1075f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Runnable f1076g;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.b();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, g.a.f14993p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return UserVerificationMethods.USER_VERIFY_HANDPRINT;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        boolean a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void b() {
            if (this.f1075f) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1075f = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1073d <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1075f) {
                removeCallbacks(this.f1076g);
                post(this.f1076g);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f1074e.V();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1074e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1074e.hasFocus() && getVisibility() == 0) {
                this.f1075f = true;
                if (SearchView.I(getContext())) {
                    SearchView.f1048n0.c(this, true);
                }
            }
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f1075f = false;
                removeCallbacks(this.f1076g);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1075f = true;
                    return;
                }
                this.f1075f = false;
                removeCallbacks(this.f1076g);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f1074e = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1073d = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1076g = new a();
            this.f1073d = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.b0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.a aVar = SearchView.this.O;
            if (aVar instanceof b1) {
                aVar.a(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.K;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.x();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1066t) {
                searchView.R();
                return;
            }
            if (view == searchView.f1068v) {
                searchView.N();
                return;
            }
            if (view == searchView.f1067u) {
                searchView.S();
            } else if (view == searchView.f1069w) {
                searchView.W();
            } else if (view == searchView.f1062p) {
                searchView.D();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1051c0 == null) {
                return false;
            }
            if (searchView.f1062p.isPopupShowing() && SearchView.this.f1062p.getListSelection() != -1) {
                return SearchView.this.T(view, i10, keyEvent);
            }
            if (SearchView.this.f1062p.a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.L(0, null, searchView2.f1062p.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.S();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.O(i10, 0, null);
        }
    }

    private static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Method f1088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f1089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f1090c;

        k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1088a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1089b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1090c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1089b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1088a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView, boolean z10) {
            Method method = this.f1090c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.valueOf(z10));
                } catch (Exception unused) {
                }
            }
        }
    }

    public interface l {
    }

    public interface m {
    }

    public interface n {
    }

    static class o extends c0.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f1091c;

        static class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public o[] newArray(int i10) {
                return new o[i10];
            }
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1091c + "}";
        }

        @Override // c0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1091c));
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1091c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    private static class p extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f1092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f1093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rect f1094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f1095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f1096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1097f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1096e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1093b = new Rect();
            this.f1095d = new Rect();
            this.f1094c = new Rect();
            a(rect, rect2);
            this.f1092a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1093b.set(rect);
            this.f1095d.set(rect);
            Rect rect3 = this.f1095d;
            int i10 = this.f1096e;
            rect3.inset(-i10, -i10);
            this.f1094c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003f  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f1097f;
                    if (z11 && !this.f1095d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else if (action != 3) {
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f1097f;
                    this.f1097f = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.f1093b.contains(x10, y10)) {
                this.f1097f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f1094c.contains(x10, y10)) {
                Rect rect = this.f1094c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(this.f1092a.getWidth() / 2, this.f1092a.getHeight() / 2);
            }
            return this.f1092a.dispatchTouchEvent(motionEvent);
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent A(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1052d0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent B(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void C() {
        this.f1062p.dismissDropDown();
    }

    private void E(View view, Rect rect) {
        view.getLocationInWindow(this.B);
        getLocationInWindow(this.C);
        int[] iArr = this.B;
        int i10 = iArr[1];
        int[] iArr2 = this.C;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence F(CharSequence charSequence) {
        if (!this.M || this.E == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1062p.getTextSize()) * 1.25d);
        this.E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean G() {
        Intent intent;
        SearchableInfo searchableInfo = this.f1051c0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        if (this.f1051c0.getVoiceSearchLaunchWebSearch()) {
            intent = this.H;
        } else {
            intent = this.f1051c0.getVoiceSearchLaunchRecognizer() ? this.I : null;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) == null) ? false : true;
    }

    static boolean I(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean J() {
        return (this.P || this.U) && !H();
    }

    private void K(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    private boolean M(int i10, int i11, String str) {
        Cursor cursorC = this.O.c();
        if (cursorC == null || !cursorC.moveToPosition(i10)) {
            return false;
        }
        K(z(cursorC, i11, str));
        return true;
    }

    private void X() {
        post(this.f1053e0);
    }

    private void Y(int i10) {
        Editable text = this.f1062p.getText();
        Cursor cursorC = this.O.c();
        if (cursorC == null) {
            return;
        }
        if (!cursorC.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceConvertToString = this.O.convertToString(cursorC);
        if (charSequenceConvertToString != null) {
            setQuery(charSequenceConvertToString);
        } else {
            setQuery(text);
        }
    }

    private void a0() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1062p.getText());
        if (!z11 && (!this.M || this.f1049a0)) {
            z10 = false;
        }
        this.f1068v.setVisibility(z10 ? 0 : 8);
        Drawable drawable = this.f1068v.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void c0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1062p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(F(queryHint));
    }

    private void d0() {
        this.f1062p.setThreshold(this.f1051c0.getSuggestThreshold());
        this.f1062p.setImeOptions(this.f1051c0.getImeOptions());
        int inputType = this.f1051c0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1051c0.getSuggestAuthority() != null) {
                inputType = inputType | NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST | 524288;
            }
        }
        this.f1062p.setInputType(inputType);
        a0.a aVar = this.O;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f1051c0.getSuggestAuthority() != null) {
            b1 b1Var = new b1(getContext(), this, this.f1051c0, this.f1055g0);
            this.O = b1Var;
            this.f1062p.setAdapter(b1Var);
            ((b1) this.O).w(this.R ? 2 : 1);
        }
    }

    private void e0() {
        this.f1065s.setVisibility((J() && (this.f1067u.getVisibility() == 0 || this.f1069w.getVisibility() == 0)) ? 0 : 8);
    }

    private void f0(boolean z10) {
        this.f1067u.setVisibility((this.P && J() && hasFocus() && (z10 || !this.U)) ? 0 : 8);
    }

    private void g0(boolean z10) {
        this.N = z10;
        int i10 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.f1062p.getText());
        this.f1066t.setVisibility(i10);
        f0(z11);
        this.f1063q.setVisibility(z10 ? 8 : 0);
        this.D.setVisibility((this.D.getDrawable() == null || this.M) ? 8 : 0);
        a0();
        h0(!z11);
        e0();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(g.d.f15018g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(g.d.f15019h);
    }

    private void h0(boolean z10) {
        int i10 = 8;
        if (this.U && !H() && z10) {
            this.f1067u.setVisibility(8);
            i10 = 0;
        }
        this.f1069w.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1062p.setText(charSequence);
        this.f1062p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private Intent y(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.W);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1052d0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1051c0.getSearchActivity());
        return intent;
    }

    private Intent z(Cursor cursor, int i10, String str) {
        int position;
        String strN;
        try {
            String strN2 = b1.n(cursor, "suggest_intent_action");
            if (strN2 == null) {
                strN2 = this.f1051c0.getSuggestIntentAction();
            }
            if (strN2 == null) {
                strN2 = "android.intent.action.SEARCH";
            }
            String str2 = strN2;
            String strN3 = b1.n(cursor, "suggest_intent_data");
            if (strN3 == null) {
                strN3 = this.f1051c0.getSuggestIntentData();
            }
            if (strN3 != null && (strN = b1.n(cursor, "suggest_intent_data_id")) != null) {
                strN3 = strN3 + "/" + Uri.encode(strN);
            }
            return y(str2, strN3 == null ? null : Uri.parse(strN3), b1.n(cursor, "suggest_intent_extra_data"), b1.n(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e10);
            return null;
        }
    }

    void D() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1062p.refreshAutoCompleteResults();
            return;
        }
        k kVar = f1048n0;
        kVar.b(this.f1062p);
        kVar.a(this.f1062p);
    }

    public boolean H() {
        return this.N;
    }

    void L(int i10, String str, String str2) {
        getContext().startActivity(y("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void N() {
        if (!TextUtils.isEmpty(this.f1062p.getText())) {
            this.f1062p.setText("");
            this.f1062p.requestFocus();
            this.f1062p.setImeVisibility(true);
        } else if (this.M) {
            clearFocus();
            g0(true);
        }
    }

    boolean O(int i10, int i11, String str) {
        M(i10, 0, null);
        this.f1062p.setImeVisibility(false);
        C();
        return true;
    }

    boolean P(int i10) {
        Y(i10);
        return true;
    }

    void Q(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void R() {
        g0(false);
        this.f1062p.requestFocus();
        this.f1062p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void S() {
        Editable text = this.f1062p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f1051c0 != null) {
            L(0, null, text.toString());
        }
        this.f1062p.setImeVisibility(false);
        C();
    }

    boolean T(View view, int i10, KeyEvent keyEvent) {
        if (this.f1051c0 != null && this.O != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return O(this.f1062p.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f1062p.setSelection(i10 == 21 ? 0 : this.f1062p.length());
                this.f1062p.setListSelection(0);
                this.f1062p.clearListSelection();
                f1048n0.c(this.f1062p, true);
                return true;
            }
            if (i10 == 19) {
                this.f1062p.getListSelection();
                return false;
            }
        }
        return false;
    }

    void U(CharSequence charSequence) {
        Editable text = this.f1062p.getText();
        this.W = text;
        boolean z10 = !TextUtils.isEmpty(text);
        f0(z10);
        h0(!z10);
        a0();
        e0();
        this.V = charSequence.toString();
    }

    void V() {
        g0(H());
        X();
        if (this.f1062p.hasFocus()) {
            D();
        }
    }

    void W() {
        SearchableInfo searchableInfo = this.f1051c0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(B(this.H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(A(this.I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public void Z(CharSequence charSequence, boolean z10) {
        this.f1062p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1062p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.W = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        S();
    }

    void b0() {
        int[] iArr = this.f1062p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1064r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1065s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.S = true;
        super.clearFocus();
        this.f1062p.clearFocus();
        this.f1062p.setImeVisibility(false);
        this.S = false;
    }

    public int getImeOptions() {
        return this.f1062p.getImeOptions();
    }

    public int getInputType() {
        return this.f1062p.getInputType();
    }

    public int getMaxWidth() {
        return this.T;
    }

    public CharSequence getQuery() {
        return this.f1062p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1051c0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.J : getContext().getText(this.f1051c0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.G;
    }

    int getSuggestionRowLayout() {
        return this.F;
    }

    public a0.a getSuggestionsAdapter() {
        return this.O;
    }

    @Override // k.c
    public void onActionViewCollapsed() {
        Z("", false);
        clearFocus();
        g0(true);
        this.f1062p.setImeOptions(this.f1050b0);
        this.f1049a0 = false;
    }

    @Override // k.c
    public void onActionViewExpanded() {
        if (this.f1049a0) {
            return;
        }
        this.f1049a0 = true;
        int imeOptions = this.f1062p.getImeOptions();
        this.f1050b0 = imeOptions;
        this.f1062p.setImeOptions(imeOptions | 33554432);
        this.f1062p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1053e0);
        post(this.f1054f0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.q0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            E(this.f1062p, this.f1072z);
            Rect rect = this.A;
            Rect rect2 = this.f1072z;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            p pVar = this.f1071y;
            if (pVar != null) {
                pVar.a(this.A, this.f1072z);
                return;
            }
            p pVar2 = new p(this.A, this.f1072z, this.f1062p);
            this.f1071y = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    @Override // androidx.appcompat.widget.q0, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        if (H()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.T;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.T;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.T) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        g0(oVar.f1091c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f1091c = H();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        X();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.S || !isFocusable()) {
            return false;
        }
        if (H()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f1062p.requestFocus(i10, rect);
        if (zRequestFocus) {
            g0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1052d0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            N();
        } else {
            R();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.M == z10) {
            return;
        }
        this.M = z10;
        g0(z10);
        c0();
    }

    public void setImeOptions(int i10) {
        this.f1062p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f1062p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.T = i10;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.K = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.L = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.Q = charSequence;
        c0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.R = z10;
        a0.a aVar = this.O;
        if (aVar instanceof b1) {
            ((b1) aVar).w(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1051c0 = searchableInfo;
        if (searchableInfo != null) {
            d0();
            c0();
        }
        boolean zG = G();
        this.U = zG;
        if (zG) {
            this.f1062p.setPrivateImeOptions("nm");
        }
        g0(H());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.P = z10;
        g0(H());
    }

    public void setSuggestionsAdapter(a0.a aVar) {
        this.O = aVar;
        this.f1062p.setAdapter(aVar);
    }

    void x() {
        if (this.f1070x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1064r.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = o1.b(this);
            int dimensionPixelSize = this.M ? resources.getDimensionPixelSize(g.d.f15016e) + resources.getDimensionPixelSize(g.d.f15017f) : 0;
            this.f1062p.getDropDownBackground().getPadding(rect);
            this.f1062p.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f1062p.setDropDownWidth((((this.f1070x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.G);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1072z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f1053e0 = new b();
        this.f1054f0 = new c();
        this.f1055g0 = new WeakHashMap<>();
        f fVar = new f();
        this.f1056h0 = fVar;
        this.f1057i0 = new g();
        h hVar = new h();
        this.f1058j0 = hVar;
        i iVar = new i();
        this.f1059k0 = iVar;
        j jVar = new j();
        this.f1060l0 = jVar;
        this.f1061m0 = new a();
        h1 h1VarT = h1.t(context, attributeSet, g.j.f15154i2, i10, 0);
        LayoutInflater.from(context).inflate(h1VarT.m(g.j.f15204s2, g.g.f15093r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(g.f.D);
        this.f1062p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1063q = findViewById(g.f.f15075z);
        View viewFindViewById = findViewById(g.f.C);
        this.f1064r = viewFindViewById;
        View viewFindViewById2 = findViewById(g.f.J);
        this.f1065s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(g.f.f15073x);
        this.f1066t = imageView;
        ImageView imageView2 = (ImageView) findViewById(g.f.A);
        this.f1067u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(g.f.f15074y);
        this.f1068v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(g.f.E);
        this.f1069w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(g.f.B);
        this.D = imageView5;
        androidx.core.view.z0.K(viewFindViewById, h1VarT.f(g.j.f15209t2));
        androidx.core.view.z0.K(viewFindViewById2, h1VarT.f(g.j.f15229x2));
        int i11 = g.j.f15224w2;
        imageView.setImageDrawable(h1VarT.f(i11));
        imageView2.setImageDrawable(h1VarT.f(g.j.f15194q2));
        imageView3.setImageDrawable(h1VarT.f(g.j.f15179n2));
        imageView4.setImageDrawable(h1VarT.f(g.j.f15239z2));
        imageView5.setImageDrawable(h1VarT.f(i11));
        this.E = h1VarT.f(g.j.f15219v2);
        k1.a(imageView, getResources().getString(g.h.f15107l));
        this.F = h1VarT.m(g.j.f15234y2, g.g.f15092q);
        this.G = h1VarT.m(g.j.f15184o2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1061m0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1057i0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(h1VarT.a(g.j.f15199r2, true));
        int iE = h1VarT.e(g.j.f15164k2, -1);
        if (iE != -1) {
            setMaxWidth(iE);
        }
        this.J = h1VarT.o(g.j.f15189p2);
        this.Q = h1VarT.o(g.j.f15214u2);
        int iJ = h1VarT.j(g.j.f15174m2, -1);
        if (iJ != -1) {
            setImeOptions(iJ);
        }
        int iJ2 = h1VarT.j(g.j.f15169l2, -1);
        if (iJ2 != -1) {
            setInputType(iJ2);
        }
        setFocusable(h1VarT.a(g.j.f15159j2, true));
        h1VarT.u();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1070x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        g0(this.M);
        c0();
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.U(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.P(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSuggestionListener(n nVar) {
    }
}
