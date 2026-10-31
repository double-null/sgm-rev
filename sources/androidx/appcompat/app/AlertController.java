package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.q0;
import androidx.core.view.z0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final g f550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Window f551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ListView f555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f561m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Button f563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Message f565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Button f567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f568t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Message f569u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f570v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Button f571w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f572x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Message f573y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f574z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f562n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f576b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f15139f2);
            this.f576b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(g.j.f15144g2, -1);
            this.f575a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(g.j.f15149h2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f575a, getPaddingRight(), z11 ? getPaddingBottom() : this.f576b);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f563o && (message3 = alertController.f565q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f567s || (message2 = alertController.f569u) == null) {
                messageObtain = (view != alertController.f571w || (message = alertController.f573y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f550b).sendToTarget();
        }
    }

    public static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f579b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f581d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f584g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f585h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f586i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f587j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f588k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f589l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f590m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f591n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f592o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f593p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f594q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f596s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f597t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f598u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f599v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f600w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f601x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f602y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f603z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f580c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f582e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean O = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f595r = true;

        class a extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f604a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f604a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f604a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0013b extends CursorAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f606a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f607b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecycleListView f608c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AlertController f609d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0013b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f608c = recycleListView;
                this.f609d = alertController;
                Cursor cursor2 = getCursor();
                this.f606a = cursor2.getColumnIndexOrThrow(b.this.L);
                this.f607b = cursor2.getColumnIndexOrThrow(b.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f606a));
                this.f608c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f607b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f579b.inflate(this.f609d.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AlertController f611a;

            c(AlertController alertController) {
                this.f611a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                b.this.f601x.onClick(this.f611a.f550b, i10);
                if (b.this.H) {
                    return;
                }
                this.f611a.f550b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f613a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f614b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f613a = recycleListView;
                this.f614b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f613a.isItemChecked(i10);
                }
                b.this.J.onClick(this.f614b.f550b, i10, this.f613a.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f578a = context;
            this.f579b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.f579b.inflate(alertController.L, (ViewGroup) null);
            if (this.G) {
                dVar = this.K == null ? new a(this.f578a, alertController.M, R.id.text1, this.f599v, recycleListView) : new C0013b(this.f578a, this.K, false, recycleListView, alertController);
            } else {
                int i10 = this.H ? alertController.N : alertController.O;
                if (this.K != null) {
                    dVar = new SimpleCursorAdapter(this.f578a, i10, this.K, new String[]{this.L}, new int[]{R.id.text1});
                } else {
                    dVar = this.f600w;
                    if (dVar == null) {
                        dVar = new d(this.f578a, i10, R.id.text1, this.f599v);
                    }
                }
            }
            alertController.H = dVar;
            alertController.I = this.I;
            if (this.f601x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.H) {
                recycleListView.setChoiceMode(1);
            } else if (this.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f555g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.f584g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f583f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f581d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i10 = this.f580c;
                if (i10 != 0) {
                    alertController.l(i10);
                }
                int i11 = this.f582e;
                if (i11 != 0) {
                    alertController.l(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f585h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f586i;
            if (charSequence3 != null || this.f587j != null) {
                alertController.j(-1, charSequence3, this.f588k, null, this.f587j);
            }
            CharSequence charSequence4 = this.f589l;
            if (charSequence4 != null || this.f590m != null) {
                alertController.j(-2, charSequence4, this.f591n, null, this.f590m);
            }
            CharSequence charSequence5 = this.f592o;
            if (charSequence5 != null || this.f593p != null) {
                alertController.j(-3, charSequence5, this.f594q, null, this.f593p);
            }
            if (this.f599v != null || this.K != null || this.f600w != null) {
                b(alertController);
            }
            View view2 = this.f603z;
            if (view2 != null) {
                if (this.E) {
                    alertController.s(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.r(view2);
                    return;
                }
            }
            int i12 = this.f602y;
            if (i12 != 0) {
                alertController.q(i12);
            }
        }
    }

    private static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f616a;

        public c(DialogInterface dialogInterface) {
            this.f616a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f616a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, g gVar, Window window) {
        this.f549a = context;
        this.f550b = gVar;
        this.f551c = window;
        this.R = new c(gVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, g.j.F, g.a.f14991n, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(g.j.G, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(g.j.I, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(g.j.K, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(g.j.L, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(g.j.N, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(g.j.J, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(g.j.M, true);
        this.f552d = typedArrayObtainStyledAttributes.getDimensionPixelSize(g.j.H, 0);
        typedArrayObtainStyledAttributes.recycle();
        gVar.d(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i10 = this.K;
        if (i10 == 0) {
            return this.J;
        }
        return this.Q == 1 ? i10 : this.J;
    }

    private void o(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f551c.findViewById(g.f.f15071v);
        View viewFindViewById2 = this.f551c.findViewById(g.f.f15070u);
        z0.S(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void t(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f563o = button;
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f564p) && this.f566r == null) {
            this.f563o.setVisibility(8);
            i10 = 0;
        } else {
            this.f563o.setText(this.f564p);
            Drawable drawable = this.f566r;
            if (drawable != null) {
                int i11 = this.f552d;
                drawable.setBounds(0, 0, i11, i11);
                this.f563o.setCompoundDrawables(this.f566r, null, null, null);
            }
            this.f563o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f567s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f568t) && this.f570v == null) {
            this.f567s.setVisibility(8);
        } else {
            this.f567s.setText(this.f568t);
            Drawable drawable2 = this.f570v;
            if (drawable2 != null) {
                int i12 = this.f552d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f567s.setCompoundDrawables(this.f570v, null, null, null);
            }
            this.f567s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f571w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f572x) && this.f574z == null) {
            this.f571w.setVisibility(8);
        } else {
            this.f571w.setText(this.f572x);
            Drawable drawable3 = this.f566r;
            if (drawable3 != null) {
                int i13 = this.f552d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f563o.setCompoundDrawables(this.f566r, null, null, null);
            }
            this.f571w.setVisibility(0);
            i10 |= 4;
        }
        if (y(this.f549a)) {
            if (i10 == 1) {
                b(this.f563o);
            } else if (i10 == 2) {
                b(this.f567s);
            } else if (i10 == 4) {
                b(this.f571w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f551c.findViewById(g.f.f15072w);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f554f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f555g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f555g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void v(ViewGroup viewGroup) {
        View viewInflate = this.f556h;
        if (viewInflate == null) {
            viewInflate = this.f557i != 0 ? LayoutInflater.from(this.f549a).inflate(this.f557i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f551c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f551c.findViewById(g.f.f15063n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f562n) {
            frameLayout.setPadding(this.f558j, this.f559k, this.f560l, this.f561m);
        }
        if (this.f555g != null) {
            ((q0.a) viewGroup.getLayoutParams()).f1413a = 0.0f;
        }
    }

    private void w(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f551c.findViewById(g.f.O).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f551c.findViewById(R.id.icon);
        if (!(!TextUtils.isEmpty(this.f553e)) || !this.P) {
            this.f551c.findViewById(g.f.O).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f551c.findViewById(g.f.f15059j);
        this.E = textView;
        textView.setText(this.f553e);
        int i10 = this.B;
        if (i10 != 0) {
            this.D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
        } else {
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f551c.findViewById(g.f.f15069t);
        int i10 = g.f.P;
        View viewFindViewById4 = viewFindViewById3.findViewById(i10);
        int i11 = g.f.f15062m;
        View viewFindViewById5 = viewFindViewById3.findViewById(i11);
        int i12 = g.f.f15060k;
        View viewFindViewById6 = viewFindViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(g.f.f15064o);
        v(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i10);
        View viewFindViewById8 = viewGroup.findViewById(i11);
        View viewFindViewById9 = viewGroup.findViewById(i12);
        ViewGroup viewGroupH = h(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupH2 = h(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupH3 = h(viewFindViewById9, viewFindViewById6);
        u(viewGroupH2);
        t(viewGroupH3);
        w(viewGroupH);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupH == null || viewGroupH.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (viewGroupH3 == null || viewGroupH3.getVisibility() == 8) ? false : true;
        if (!z12 && viewGroupH2 != null && (viewFindViewById2 = viewGroupH2.findViewById(g.f.K)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f554f == null && this.f555g == null) ? null : viewGroupH.findViewById(g.f.N);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupH2 != null && (viewFindViewById = viewGroupH2.findViewById(g.f.L)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f555g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f555g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                o(viewGroupH2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f555g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i13 = this.I;
        if (i13 > -1) {
            listView2.setItemChecked(i13, true);
            listView2.setSelection(i13);
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(g.a.f14990m, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f549a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f555g;
    }

    public void e() {
        this.f550b.setContentView(i());
        x();
    }

    public boolean f(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public void j(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f572x = charSequence;
            this.f573y = message;
            this.f574z = drawable;
        } else if (i10 == -2) {
            this.f568t = charSequence;
            this.f569u = message;
            this.f570v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f564p = charSequence;
            this.f565q = message;
            this.f566r = drawable;
        }
    }

    public void k(View view) {
        this.G = view;
    }

    public void l(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f554f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f553e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i10) {
        this.f556h = null;
        this.f557i = i10;
        this.f562n = false;
    }

    public void r(View view) {
        this.f556h = view;
        this.f557i = 0;
        this.f562n = false;
    }

    public void s(View view, int i10, int i11, int i12, int i13) {
        this.f556h = view;
        this.f557i = 0;
        this.f562n = true;
        this.f558j = i10;
        this.f559k = i11;
        this.f560l = i12;
        this.f561m = i13;
    }
}
