package n0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: LocalBroadcastManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f22652f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static a f22653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f22654h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f22656b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f22657c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<b> f22658d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f22659e;

    /* JADX INFO: renamed from: n0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LocalBroadcastManager.java */
    class HandlerC0375a extends Handler {
        HandlerC0375a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    /* JADX INFO: compiled from: LocalBroadcastManager.java */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f22661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList<c> f22662b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f22661a = intent;
            this.f22662b = arrayList;
        }
    }

    /* JADX INFO: compiled from: LocalBroadcastManager.java */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final IntentFilter f22663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f22664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f22665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f22666d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f22663a = intentFilter;
            this.f22664b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f22664b);
            sb2.append(" filter=");
            sb2.append(this.f22663a);
            if (this.f22666d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    private a(Context context) {
        this.f22655a = context;
        this.f22659e = new HandlerC0375a(context.getMainLooper());
    }

    public static a b(Context context) {
        a aVar;
        synchronized (f22652f) {
            if (f22653g == null) {
                f22653g = new a(context.getApplicationContext());
            }
            aVar = f22653g;
        }
        return aVar;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f22656b) {
                size = this.f22658d.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                this.f22658d.toArray(bVarArr);
                this.f22658d.clear();
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                int size2 = bVar.f22662b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar = bVar.f22662b.get(i11);
                    if (!cVar.f22666d) {
                        cVar.f22664b.onReceive(this.f22655a, bVar.f22661a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f22656b) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList<c> arrayList = this.f22656b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f22656b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<c> arrayList2 = this.f22657c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f22657c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public boolean d(Intent intent) {
        int i10;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        String str3;
        synchronized (this.f22656b) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f22655a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z10 = (intent.getFlags() & 8) != 0;
            if (z10) {
                Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList3 = this.f22657c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z10) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i11 = 0;
                while (i11 < arrayList3.size()) {
                    c cVar = arrayList3.get(i11);
                    if (z10) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f22663a);
                    }
                    if (cVar.f22665c) {
                        if (z10) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i10 = i11;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = strResolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i10 = i11;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = strResolveTypeIfNeeded;
                        int iMatch = cVar.f22663a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z10) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f22665c = true;
                        } else if (z10) {
                            if (iMatch == -4) {
                                str3 = "category";
                            } else if (iMatch == -3) {
                                str3 = "action";
                            } else if (iMatch != -2) {
                                str3 = iMatch != -1 ? "unknown reason" : "type";
                            } else {
                                str3 = "data";
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + str3);
                        }
                        i11 = i10 + 1;
                        action = str;
                        arrayList3 = arrayList2;
                        strResolveTypeIfNeeded = str2;
                    }
                    arrayList4 = arrayList;
                    i11 = i10 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    strResolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                        ((c) arrayList5.get(i12)).f22665c = false;
                    }
                    this.f22658d.add(new b(intent, arrayList5));
                    if (!this.f22659e.hasMessages(1)) {
                        this.f22659e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public void e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f22656b) {
            ArrayList<c> arrayListRemove = this.f22656b.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                c cVar = arrayListRemove.get(size);
                cVar.f22666d = true;
                for (int i10 = 0; i10 < cVar.f22663a.countActions(); i10++) {
                    String action = cVar.f22663a.getAction(i10);
                    ArrayList<c> arrayList = this.f22657c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f22664b == broadcastReceiver) {
                                cVar2.f22666d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f22657c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
