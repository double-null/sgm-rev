package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f3442a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final HashMap<Integer, String> f3443b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final RemoteCallbackList<androidx.room.b> f3444c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c.a f3445d = new b();

    class a extends RemoteCallbackList<androidx.room.b> {
        a() {
        }

        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(androidx.room.b bVar, Object obj) {
            MultiInstanceInvalidationService.this.f3443b.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    class b extends c.a {
        b() {
        }

        @Override // androidx.room.c
        public void K(androidx.room.b bVar, int i10) {
            synchronized (MultiInstanceInvalidationService.this.f3444c) {
                MultiInstanceInvalidationService.this.f3444c.unregister(bVar);
                MultiInstanceInvalidationService.this.f3443b.remove(Integer.valueOf(i10));
            }
        }

        @Override // androidx.room.c
        public void l(int i10, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f3444c) {
                String str = MultiInstanceInvalidationService.this.f3443b.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = MultiInstanceInvalidationService.this.f3444c.beginBroadcast();
                for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                    try {
                        int iIntValue = ((Integer) MultiInstanceInvalidationService.this.f3444c.getBroadcastCookie(i11)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f3443b.get(Integer.valueOf(iIntValue));
                        if (i10 != iIntValue && str.equals(str2)) {
                            try {
                                ((androidx.room.b) MultiInstanceInvalidationService.this.f3444c.getBroadcastItem(i11)).e(strArr);
                            } catch (RemoteException e10) {
                                Log.w("ROOM", "Error invoking a remote callback", e10);
                            }
                        }
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.f3444c.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.f3444c.finishBroadcast();
            }
        }

        @Override // androidx.room.c
        public int p(androidx.room.b bVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f3444c) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i10 = multiInstanceInvalidationService.f3442a + 1;
                multiInstanceInvalidationService.f3442a = i10;
                if (multiInstanceInvalidationService.f3444c.register(bVar, Integer.valueOf(i10))) {
                    MultiInstanceInvalidationService.this.f3443b.put(Integer.valueOf(i10), str);
                    return i10;
                }
                MultiInstanceInvalidationService.this.f3442a--;
                return 0;
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f3445d;
    }
}
