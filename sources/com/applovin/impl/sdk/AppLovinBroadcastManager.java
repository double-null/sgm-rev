package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinBroadcastManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f8203a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f8204b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ArrayList f8205c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Handler f8206d = new a(Looper.getMainLooper());

    public interface Receiver {
        void onReceive(Intent intent, Map<String, Object> map);
    }

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.b();
            } else {
                super.handleMessage(message);
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f8207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f8208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final List f8209c;

        b(Intent intent, Map map, List list) {
            this.f8207a = intent;
            this.f8208b = map;
            this.f8209c = list;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final IntentFilter f8210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Receiver f8211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f8212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f8213d;

        c(IntentFilter intentFilter, Receiver receiver) {
            this.f8210a = intentFilter;
            this.f8211b = receiver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (f8203a) {
                ArrayList arrayList = f8205c;
                size = arrayList.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                arrayList.toArray(bVarArr);
                arrayList.clear();
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                if (bVar != null) {
                    for (c cVar : bVar.f8209c) {
                        if (cVar != null && !cVar.f8213d) {
                            cVar.f8211b.onReceive(bVar.f8207a, bVar.f8208b);
                        }
                    }
                }
            }
        }
    }

    public static void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        Map map = f8203a;
        synchronized (map) {
            c cVar = new c(intentFilter, receiver);
            ArrayList arrayList = (ArrayList) map.get(receiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                map.put(receiver, arrayList);
            }
            arrayList.add(cVar);
            Iterator<String> itActionsIterator = intentFilter.actionsIterator();
            while (itActionsIterator.hasNext()) {
                String next = itActionsIterator.next();
                Map map2 = f8204b;
                ArrayList arrayList2 = (ArrayList) map2.get(next);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    map2.put(next, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public static boolean sendBroadcast(Intent intent, Map<String, Object> map) {
        synchronized (f8203a) {
            List listA = a(intent);
            if (listA == null) {
                return false;
            }
            f8205c.add(new b(intent, map, listA));
            Handler handler = f8206d;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
            return true;
        }
    }

    public static void sendBroadcastSync(Intent intent, Map<String, Object> map) {
        List<c> listA = a(intent);
        if (listA == null) {
            return;
        }
        for (c cVar : listA) {
            if (!cVar.f8213d) {
                cVar.f8211b.onReceive(intent, map);
            }
        }
    }

    public static void sendBroadcastSyncWithPendingBroadcasts(Intent intent, Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            b();
        }
    }

    public static boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap map = new HashMap(1);
        map.put("ad", obj);
        return sendBroadcast(new Intent(str), map);
    }

    public static void unregisterReceiver(Receiver receiver) {
        Map map = f8203a;
        synchronized (map) {
            List<c> list = (List) map.remove(receiver);
            if (list == null) {
                return;
            }
            for (c cVar : list) {
                cVar.f8213d = true;
                Iterator<String> itActionsIterator = cVar.f8210a.actionsIterator();
                while (itActionsIterator.hasNext()) {
                    String next = itActionsIterator.next();
                    List list2 = (List) f8204b.get(next);
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((c) it.next()).f8211b == receiver) {
                                cVar.f8213d = true;
                                it.remove();
                            }
                        }
                        if (list2.size() <= 0) {
                            f8204b.remove(next);
                        }
                    }
                }
            }
        }
    }

    private static List a(Intent intent) {
        synchronized (f8203a) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            List<c> list = (List) f8204b.get(action);
            if (list == null) {
                return null;
            }
            ArrayList arrayList = null;
            for (c cVar : list) {
                if (!cVar.f8212c && cVar.f8210a.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cVar);
                    cVar.f8212c = true;
                }
            }
            if (arrayList == null) {
                return null;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c) it.next()).f8212c = false;
            }
            return arrayList;
        }
    }
}
