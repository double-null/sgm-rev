package oc;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: BluetoothUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f23352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Integer, BluetoothProfile> f23353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BluetoothProfile.ServiceListener f23354c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f23355d = false;

    static {
        int[] iArr = {1};
        f23352a = iArr;
        f23353b = new HashMap(iArr.length);
    }

    private static Set<String> b(Context context, Integer num) {
        HashSet hashSet = null;
        if (!io.bidmachine.core.h.G(context, "android.permission.BLUETOOTH")) {
            return null;
        }
        try {
            if (BluetoothAdapter.getDefaultAdapter() == null) {
                return null;
            }
            HashSet hashSet2 = new HashSet();
            try {
                for (Map.Entry<Integer, BluetoothProfile> entry : f23353b.entrySet()) {
                    if (num == null || entry.getKey().equals(num)) {
                        BluetoothProfile value = entry.getValue();
                        if (value != null) {
                            Iterator<BluetoothDevice> it = value.getConnectedDevices().iterator();
                            while (it.hasNext()) {
                                String name = it.next().getName();
                                if (!TextUtils.isEmpty(name)) {
                                    hashSet2.add(name);
                                }
                            }
                        }
                    }
                }
                return hashSet2;
            } catch (Exception unused) {
                hashSet = hashSet2;
            }
        } catch (Exception unused2) {
        }
        return hashSet;
    }

    public static Set<String> c(Context context) {
        return b(context, 1);
    }

    public static Boolean d(Context context) {
        if (!io.bidmachine.core.h.G(context, "android.permission.BLUETOOTH")) {
            return null;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            boolean z10 = true;
            if ((defaultAdapter != null ? defaultAdapter.getProfileConnectionState(1) : -1) != 2) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void e(Context context) {
        if (context == null || context.getApplicationContext() == null || f23355d || !io.bidmachine.core.h.G(context, "android.permission.BLUETOOTH")) {
            return;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                return;
            }
            for (int i10 : f23352a) {
                defaultAdapter.getProfileProxy(context.getApplicationContext(), f23354c, i10);
            }
        } catch (Exception unused) {
        }
        f23355d = true;
    }

    /* JADX INFO: compiled from: BluetoothUtils.java */
    class a implements BluetoothProfile.ServiceListener {
        a() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i10, BluetoothProfile bluetoothProfile) {
            b.f23353b.put(Integer.valueOf(i10), bluetoothProfile);
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i10) {
        }
    }
}
