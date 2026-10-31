package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbya extends zzbyg {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcku zzj;
    private final Activity zzk;
    private zzcne zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbyh zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public zzbya(zzcku zzckuVar, zzbyh zzbyhVar) {
        super(zzckuVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzckuVar;
        this.zzk = zzckuVar.zzj();
        this.zzo = zzbyhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzml)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmm)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmn)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcku zzckuVar = this.zzj;
                    viewGroup2.addView((View) zzckuVar);
                    zzckuVar.zzaf(this.zzl);
                } catch (IllegalStateException e10) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to add webview back to view hierarchy.", e10);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "MraidCallResizeHandler.collapseInternal");
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcku zzckuVar2 = this.zzj;
                viewGroup3.addView((View) zzckuVar2);
                zzckuVar2.zzaf(this.zzl);
            }
        }
        if (z10) {
            zzk("default");
            zzbyh zzbyhVar = this.zzo;
            if (zzbyhVar != null) {
                zzbyhVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    public final void zzb(final boolean z10) {
        synchronized (this.zzi) {
            if (this.zzp != null) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmk)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    zzf(z10);
                } else {
                    zzcfr.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxz
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzf(z10);
                        }
                    });
                }
            }
        }
    }

    public final void zzc(int i10, int i11, boolean z10) {
        synchronized (this.zzi) {
            this.zzc = i10;
            this.zzd = i11;
        }
    }

    public final boolean zzd() {
        boolean z10;
        synchronized (this.zzi) {
            z10 = this.zzp != null;
        }
        return z10;
    }

    public final void zze(int i10, int i11) {
        this.zzc = i10;
        this.zzd = i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:113:0x01ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0201 A[Catch: all -> 0x0479, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:9:0x0014, B:11:0x001c, B:12:0x0021, B:14:0x0023, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003a, B:22:0x003f, B:24:0x0041, B:26:0x004f, B:27:0x0060, B:29:0x006e, B:30:0x007f, B:32:0x008d, B:33:0x009e, B:35:0x00ad, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00ef, B:46:0x00f3, B:48:0x00f9, B:51:0x0101, B:55:0x0123, B:61:0x012f, B:133:0x026a, B:134:0x026f, B:136:0x0271, B:138:0x028e, B:140:0x029a, B:142:0x02d2, B:174:0x0385, B:181:0x03b4, B:182:0x03cc, B:183:0x03e9, B:185:0x03f1, B:186:0x03f8, B:187:0x041f, B:190:0x0422, B:192:0x0450, B:193:0x0462, B:175:0x038c, B:176:0x0393, B:177:0x039a, B:178:0x03a1, B:179:0x03a7, B:180:0x03ae, B:141:0x02cf, B:195:0x0464, B:196:0x0469, B:62:0x0138, B:64:0x013c, B:94:0x0191, B:102:0x01e0, B:104:0x01eb, B:106:0x01ee, B:108:0x01f3, B:110:0x01f8, B:95:0x019c, B:97:0x01b2, B:99:0x01bd, B:96:0x01a7, B:98:0x01b5, B:100:0x01c2, B:101:0x01d5, B:103:0x01e3, B:114:0x0201, B:115:0x0215, B:123:0x023f, B:129:0x024f, B:126:0x0245, B:128:0x024d, B:119:0x0235, B:121:0x023b, B:130:0x0259, B:131:0x0261, B:198:0x046b, B:199:0x0470, B:201:0x0472, B:202:0x0477), top: B:209:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0215 A[Catch: all -> 0x0479, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:9:0x0014, B:11:0x001c, B:12:0x0021, B:14:0x0023, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003a, B:22:0x003f, B:24:0x0041, B:26:0x004f, B:27:0x0060, B:29:0x006e, B:30:0x007f, B:32:0x008d, B:33:0x009e, B:35:0x00ad, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00ef, B:46:0x00f3, B:48:0x00f9, B:51:0x0101, B:55:0x0123, B:61:0x012f, B:133:0x026a, B:134:0x026f, B:136:0x0271, B:138:0x028e, B:140:0x029a, B:142:0x02d2, B:174:0x0385, B:181:0x03b4, B:182:0x03cc, B:183:0x03e9, B:185:0x03f1, B:186:0x03f8, B:187:0x041f, B:190:0x0422, B:192:0x0450, B:193:0x0462, B:175:0x038c, B:176:0x0393, B:177:0x039a, B:178:0x03a1, B:179:0x03a7, B:180:0x03ae, B:141:0x02cf, B:195:0x0464, B:196:0x0469, B:62:0x0138, B:64:0x013c, B:94:0x0191, B:102:0x01e0, B:104:0x01eb, B:106:0x01ee, B:108:0x01f3, B:110:0x01f8, B:95:0x019c, B:97:0x01b2, B:99:0x01bd, B:96:0x01a7, B:98:0x01b5, B:100:0x01c2, B:101:0x01d5, B:103:0x01e3, B:114:0x0201, B:115:0x0215, B:123:0x023f, B:129:0x024f, B:126:0x0245, B:128:0x024d, B:119:0x0235, B:121:0x023b, B:130:0x0259, B:131:0x0261, B:198:0x046b, B:199:0x0470, B:201:0x0472, B:202:0x0477), top: B:209:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0232  */
    /* JADX WARN: Code duplicated, block: B:119:0x0235 A[Catch: all -> 0x0479, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:9:0x0014, B:11:0x001c, B:12:0x0021, B:14:0x0023, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003a, B:22:0x003f, B:24:0x0041, B:26:0x004f, B:27:0x0060, B:29:0x006e, B:30:0x007f, B:32:0x008d, B:33:0x009e, B:35:0x00ad, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00ef, B:46:0x00f3, B:48:0x00f9, B:51:0x0101, B:55:0x0123, B:61:0x012f, B:133:0x026a, B:134:0x026f, B:136:0x0271, B:138:0x028e, B:140:0x029a, B:142:0x02d2, B:174:0x0385, B:181:0x03b4, B:182:0x03cc, B:183:0x03e9, B:185:0x03f1, B:186:0x03f8, B:187:0x041f, B:190:0x0422, B:192:0x0450, B:193:0x0462, B:175:0x038c, B:176:0x0393, B:177:0x039a, B:178:0x03a1, B:179:0x03a7, B:180:0x03ae, B:141:0x02cf, B:195:0x0464, B:196:0x0469, B:62:0x0138, B:64:0x013c, B:94:0x0191, B:102:0x01e0, B:104:0x01eb, B:106:0x01ee, B:108:0x01f3, B:110:0x01f8, B:95:0x019c, B:97:0x01b2, B:99:0x01bd, B:96:0x01a7, B:98:0x01b5, B:100:0x01c2, B:101:0x01d5, B:103:0x01e3, B:114:0x0201, B:115:0x0215, B:123:0x023f, B:129:0x024f, B:126:0x0245, B:128:0x024d, B:119:0x0235, B:121:0x023b, B:130:0x0259, B:131:0x0261, B:198:0x046b, B:199:0x0470, B:201:0x0472, B:202:0x0477), top: B:209:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x023b A[Catch: all -> 0x0479, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:9:0x0014, B:11:0x001c, B:12:0x0021, B:14:0x0023, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003a, B:22:0x003f, B:24:0x0041, B:26:0x004f, B:27:0x0060, B:29:0x006e, B:30:0x007f, B:32:0x008d, B:33:0x009e, B:35:0x00ad, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00ef, B:46:0x00f3, B:48:0x00f9, B:51:0x0101, B:55:0x0123, B:61:0x012f, B:133:0x026a, B:134:0x026f, B:136:0x0271, B:138:0x028e, B:140:0x029a, B:142:0x02d2, B:174:0x0385, B:181:0x03b4, B:182:0x03cc, B:183:0x03e9, B:185:0x03f1, B:186:0x03f8, B:187:0x041f, B:190:0x0422, B:192:0x0450, B:193:0x0462, B:175:0x038c, B:176:0x0393, B:177:0x039a, B:178:0x03a1, B:179:0x03a7, B:180:0x03ae, B:141:0x02cf, B:195:0x0464, B:196:0x0469, B:62:0x0138, B:64:0x013c, B:94:0x0191, B:102:0x01e0, B:104:0x01eb, B:106:0x01ee, B:108:0x01f3, B:110:0x01f8, B:95:0x019c, B:97:0x01b2, B:99:0x01bd, B:96:0x01a7, B:98:0x01b5, B:100:0x01c2, B:101:0x01d5, B:103:0x01e3, B:114:0x0201, B:115:0x0215, B:123:0x023f, B:129:0x024f, B:126:0x0245, B:128:0x024d, B:119:0x0235, B:121:0x023b, B:130:0x0259, B:131:0x0261, B:198:0x046b, B:199:0x0470, B:201:0x0472, B:202:0x0477), top: B:209:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x023d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0243  */
    /* JADX WARN: Code duplicated, block: B:126:0x0245 A[Catch: all -> 0x0479, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:9:0x0014, B:11:0x001c, B:12:0x0021, B:14:0x0023, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003a, B:22:0x003f, B:24:0x0041, B:26:0x004f, B:27:0x0060, B:29:0x006e, B:30:0x007f, B:32:0x008d, B:33:0x009e, B:35:0x00ad, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00ef, B:46:0x00f3, B:48:0x00f9, B:51:0x0101, B:55:0x0123, B:61:0x012f, B:133:0x026a, B:134:0x026f, B:136:0x0271, B:138:0x028e, B:140:0x029a, B:142:0x02d2, B:174:0x0385, B:181:0x03b4, B:182:0x03cc, B:183:0x03e9, B:185:0x03f1, B:186:0x03f8, B:187:0x041f, B:190:0x0422, B:192:0x0450, B:193:0x0462, B:175:0x038c, B:176:0x0393, B:177:0x039a, B:178:0x03a1, B:179:0x03a7, B:180:0x03ae, B:141:0x02cf, B:195:0x0464, B:196:0x0469, B:62:0x0138, B:64:0x013c, B:94:0x0191, B:102:0x01e0, B:104:0x01eb, B:106:0x01ee, B:108:0x01f3, B:110:0x01f8, B:95:0x019c, B:97:0x01b2, B:99:0x01bd, B:96:0x01a7, B:98:0x01b5, B:100:0x01c2, B:101:0x01d5, B:103:0x01e3, B:114:0x0201, B:115:0x0215, B:123:0x023f, B:129:0x024f, B:126:0x0245, B:128:0x024d, B:119:0x0235, B:121:0x023b, B:130:0x0259, B:131:0x0261, B:198:0x046b, B:199:0x0470, B:201:0x0472, B:202:0x0477), top: B:209:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x024d A[Catch: all -> 0x0479, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:9:0x0014, B:11:0x001c, B:12:0x0021, B:14:0x0023, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003a, B:22:0x003f, B:24:0x0041, B:26:0x004f, B:27:0x0060, B:29:0x006e, B:30:0x007f, B:32:0x008d, B:33:0x009e, B:35:0x00ad, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00ef, B:46:0x00f3, B:48:0x00f9, B:51:0x0101, B:55:0x0123, B:61:0x012f, B:133:0x026a, B:134:0x026f, B:136:0x0271, B:138:0x028e, B:140:0x029a, B:142:0x02d2, B:174:0x0385, B:181:0x03b4, B:182:0x03cc, B:183:0x03e9, B:185:0x03f1, B:186:0x03f8, B:187:0x041f, B:190:0x0422, B:192:0x0450, B:193:0x0462, B:175:0x038c, B:176:0x0393, B:177:0x039a, B:178:0x03a1, B:179:0x03a7, B:180:0x03ae, B:141:0x02cf, B:195:0x0464, B:196:0x0469, B:62:0x0138, B:64:0x013c, B:94:0x0191, B:102:0x01e0, B:104:0x01eb, B:106:0x01ee, B:108:0x01f3, B:110:0x01f8, B:95:0x019c, B:97:0x01b2, B:99:0x01bd, B:96:0x01a7, B:98:0x01b5, B:100:0x01c2, B:101:0x01d5, B:103:0x01e3, B:114:0x0201, B:115:0x0215, B:123:0x023f, B:129:0x024f, B:126:0x0245, B:128:0x024d, B:119:0x0235, B:121:0x023b, B:130:0x0259, B:131:0x0261, B:198:0x046b, B:199:0x0470, B:201:0x0472, B:202:0x0477), top: B:209:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0182  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zza(Map map) {
        int[] iArrZzW;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        byte b10;
        int i19;
        int i20;
        int i21;
        int i22;
        synchronized (this.zzi) {
            Activity activity = this.zzk;
            if (activity == null) {
                zzg("Not an activity context. Cannot resize.");
                return;
            }
            zzcku zzckuVar = this.zzj;
            if (zzckuVar.zzN() == null) {
                zzg("Webview is not yet available, size is not set.");
                return;
            }
            if (zzckuVar.zzN().zzg()) {
                zzg("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (zzckuVar.zzW()) {
                zzg("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty((CharSequence) map.get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzh = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zze = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzf = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("offsetX"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get(ljglrLUdGZhMhQ.qkGNiuZKRcg))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzg = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get(ljglrLUdGZhMhQ.qkGNiuZKRcg));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                this.zzb = Boolean.parseBoolean((String) map.get("allowOffscreen"));
            }
            String str = (String) map.get("customClosePosition");
            if (!TextUtils.isEmpty(str)) {
                this.zza = str;
            }
            if (this.zzh < 0 || this.zze < 0) {
                zzg("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window = activity.getWindow();
            if (window != null && window.getDecorView() != null) {
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] iArrZzaa = com.google.android.gms.ads.internal.util.zzs.zzaa(activity);
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] iArrZzW2 = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                int i23 = iArrZzaa[0];
                int i24 = iArrZzaa[1];
                int i25 = this.zzh;
                int[] iArr = null;
                if (i25 < 50 || i25 > i23) {
                    int i26 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Width is too small or too large.");
                } else {
                    int i27 = this.zze;
                    if (i27 < 50 || i27 > i24) {
                        int i28 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Height is too small or too large.");
                    } else if (i27 == i24 && i25 == i23) {
                        int i29 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot resize to a full-screen ad.");
                    } else {
                        boolean z10 = this.zzb;
                        if (z10) {
                            switch (this.zza) {
                                case "center":
                                    b10 = 2;
                                    break;
                                case "top-left":
                                    b10 = 0;
                                    break;
                                case "bottom-left":
                                    b10 = 3;
                                    break;
                                case "bottom-right":
                                    b10 = 5;
                                    break;
                                case "bottom-center":
                                    b10 = 4;
                                    break;
                                case "top-center":
                                    b10 = 1;
                                    break;
                                default:
                                    b10 = -1;
                                    break;
                            }
                            if (b10 == 0) {
                                i19 = this.zzc + this.zzf;
                                i20 = this.zzd;
                            } else if (b10 != 1) {
                                if (b10 != 2) {
                                    if (b10 == 3) {
                                        i19 = this.zzc + this.zzf;
                                        i22 = this.zzd;
                                    } else if (b10 == 4) {
                                        i19 = ((this.zzc + this.zzf) + (i25 >> 1)) - 25;
                                        i22 = this.zzd;
                                    } else if (b10 != 5) {
                                        i19 = ((this.zzc + this.zzf) + i25) - 50;
                                        i20 = this.zzd;
                                    } else {
                                        i19 = ((this.zzc + this.zzf) + i25) - 50;
                                        i22 = this.zzd;
                                    }
                                    i21 = ((i22 + this.zzg) + i27) - 50;
                                } else {
                                    i19 = ((this.zzc + this.zzf) + (i25 >> 1)) - 25;
                                    i21 = ((this.zzd + this.zzg) + (i27 >> 1)) - 25;
                                }
                                if (i19 >= 0 && i19 + 50 <= i23 && i21 >= iArrZzW2[0] && i21 + 50 <= iArrZzW2[1]) {
                                    if (z10) {
                                        iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                                    } else {
                                        com.google.android.gms.ads.internal.zzt.zzc();
                                        int[] iArrZzaa2 = com.google.android.gms.ads.internal.util.zzs.zzaa(activity);
                                        com.google.android.gms.ads.internal.zzt.zzc();
                                        iArrZzW = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                                        i10 = iArrZzaa2[0];
                                        i11 = this.zzc + this.zzf;
                                        i12 = this.zzd + this.zzg;
                                        if (i11 < 0) {
                                            i14 = 0;
                                        } else {
                                            i13 = this.zzh;
                                            if (i11 + i13 > i10) {
                                                i14 = i10 - i13;
                                            } else {
                                                i14 = i11;
                                            }
                                        }
                                        i15 = iArrZzW[0];
                                        if (i12 < i15) {
                                            i12 = i15;
                                        } else {
                                            i16 = this.zze;
                                            i17 = i12 + i16;
                                            i18 = iArrZzW[1];
                                            if (i17 > i18) {
                                                i12 = i18 - i16;
                                            }
                                        }
                                        iArr = new int[]{i14, i12};
                                    }
                                }
                            } else {
                                i19 = ((this.zzc + this.zzf) + (i25 >> 1)) - 25;
                                i20 = this.zzd;
                            }
                            i21 = i20 + this.zzg;
                            if (i19 >= 0) {
                                if (z10) {
                                    iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                                } else {
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    int[] iArrZzaa3 = com.google.android.gms.ads.internal.util.zzs.zzaa(activity);
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    iArrZzW = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                                    i10 = iArrZzaa3[0];
                                    i11 = this.zzc + this.zzf;
                                    i12 = this.zzd + this.zzg;
                                    if (i11 < 0) {
                                        i14 = 0;
                                    } else {
                                        i13 = this.zzh;
                                        if (i11 + i13 > i10) {
                                            i14 = i10 - i13;
                                        } else {
                                            i14 = i11;
                                        }
                                    }
                                    i15 = iArrZzW[0];
                                    if (i12 < i15) {
                                        i12 = i15;
                                    } else {
                                        i16 = this.zze;
                                        i17 = i12 + i16;
                                        i18 = iArrZzW[1];
                                        if (i17 > i18) {
                                            i12 = i18 - i16;
                                        }
                                    }
                                    iArr = new int[]{i14, i12};
                                }
                            }
                        } else if (z10) {
                            iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                        } else {
                            com.google.android.gms.ads.internal.zzt.zzc();
                            int[] iArrZzaa4 = com.google.android.gms.ads.internal.util.zzs.zzaa(activity);
                            com.google.android.gms.ads.internal.zzt.zzc();
                            iArrZzW = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                            i10 = iArrZzaa4[0];
                            i11 = this.zzc + this.zzf;
                            i12 = this.zzd + this.zzg;
                            if (i11 < 0) {
                                i14 = 0;
                            } else {
                                i13 = this.zzh;
                                if (i11 + i13 > i10) {
                                    i14 = i10 - i13;
                                } else {
                                    i14 = i11;
                                }
                            }
                            i15 = iArrZzW[0];
                            if (i12 < i15) {
                                i12 = i15;
                            } else {
                                i16 = this.zze;
                                i17 = i12 + i16;
                                i18 = iArrZzW[1];
                                if (i17 > i18) {
                                    i12 = i18 - i16;
                                }
                            }
                            iArr = new int[]{i14, i12};
                        }
                    }
                }
                if (iArr == null) {
                    zzg("Resize location out of screen or close button is not visible.");
                    return;
                }
                com.google.android.gms.ads.internal.client.zzay.zza();
                int iZzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, this.zzh);
                com.google.android.gms.ads.internal.client.zzay.zza();
                int iZzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, this.zze);
                ViewParent parent = ((View) zzckuVar).getParent();
                if (!(parent instanceof ViewGroup)) {
                    zzg("Webview is detached, probably in the middle of a resize or expand.");
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.removeView((View) zzckuVar);
                PopupWindow popupWindow = this.zzp;
                if (popupWindow == null) {
                    this.zzr = viewGroup;
                    com.google.android.gms.ads.internal.zzt.zzc();
                    ((View) zzckuVar).setDrawingCacheEnabled(true);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) zzckuVar).getDrawingCache());
                    ((View) zzckuVar).setDrawingCacheEnabled(false);
                    ImageView imageView = new ImageView(activity);
                    this.zzm = imageView;
                    imageView.setImageBitmap(bitmapCreateBitmap);
                    this.zzl = zzckuVar.zzN();
                    this.zzr.addView(this.zzm);
                } else {
                    popupWindow.dismiss();
                }
                RelativeLayout relativeLayout = new RelativeLayout(activity);
                this.zzq = relativeLayout;
                relativeLayout.setBackgroundColor(0);
                this.zzq.setLayoutParams(new ViewGroup.LayoutParams(iZzE, iZzE2));
                com.google.android.gms.ads.internal.zzt.zzc();
                PopupWindow popupWindow2 = new PopupWindow((View) this.zzq, iZzE, iZzE2, false);
                this.zzp = popupWindow2;
                popupWindow2.setOutsideTouchable(false);
                this.zzp.setTouchable(true);
                this.zzp.setClippingEnabled(!this.zzb);
                byte b11 = -1;
                this.zzq.addView((View) zzckuVar, -1, -1);
                this.zzn = new LinearLayout(activity);
                com.google.android.gms.ads.internal.client.zzay.zza();
                int iZzE3 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, 50);
                com.google.android.gms.ads.internal.client.zzay.zza();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iZzE3, com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, 50));
                String str2 = this.zza;
                switch (str2.hashCode()) {
                    case -1364013995:
                        if (str2.equals("center")) {
                            b11 = 2;
                        }
                        break;
                    case -1012429441:
                        if (str2.equals("top-left")) {
                            b11 = 0;
                        }
                        break;
                    case -655373719:
                        if (str2.equals("bottom-left")) {
                            b11 = 3;
                        }
                        break;
                    case 1163912186:
                        if (str2.equals("bottom-right")) {
                            b11 = 5;
                        }
                        break;
                    case 1288627767:
                        if (str2.equals("bottom-center")) {
                            b11 = 4;
                        }
                        break;
                    case 1755462605:
                        if (str2.equals("top-center")) {
                            b11 = 1;
                        }
                        break;
                }
                if (b11 == 0) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(9);
                } else if (b11 == 1) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(14);
                } else if (b11 == 2) {
                    layoutParams.addRule(13);
                } else if (b11 == 3) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(9);
                } else if (b11 == 4) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(14);
                } else if (b11 != 5) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                } else {
                    layoutParams.addRule(12);
                    layoutParams.addRule(11);
                }
                this.zzn.setOnClickListener(new zzbxy(this));
                this.zzn.setContentDescription("Close button");
                this.zzq.addView(this.zzn, layoutParams);
                try {
                    PopupWindow popupWindow3 = this.zzp;
                    View decorView = window.getDecorView();
                    com.google.android.gms.ads.internal.client.zzay.zza();
                    int iZzE4 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, iArr[0]);
                    com.google.android.gms.ads.internal.client.zzay.zza();
                    popupWindow3.showAtLocation(decorView, 0, iZzE4, com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, iArr[1]));
                    int i30 = iArr[0];
                    int i31 = iArr[1];
                    zzbyh zzbyhVar = this.zzo;
                    if (zzbyhVar != null) {
                        zzbyhVar.zza(i30, i31, this.zzh, this.zze);
                    }
                    this.zzj.zzaf(zzcne.zzc(iZzE, iZzE2));
                    int i32 = iArr[0];
                    int i33 = iArr[1];
                    com.google.android.gms.ads.internal.zzt.zzc();
                    zzi(i32, i33 - com.google.android.gms.ads.internal.util.zzs.zzW(this.zzk)[0], this.zzh, this.zze);
                    zzk("resized");
                    return;
                } catch (RuntimeException e10) {
                    String message = e10.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 26);
                    sb2.append("Cannot show popup window: ");
                    sb2.append(message);
                    zzg(sb2.toString());
                    RelativeLayout relativeLayout2 = this.zzq;
                    zzcku zzckuVar2 = this.zzj;
                    relativeLayout2.removeView((View) zzckuVar2);
                    ViewGroup viewGroup2 = this.zzr;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(this.zzm);
                        this.zzr.addView((View) zzckuVar2);
                        zzckuVar2.zzaf(this.zzl);
                    }
                    return;
                }
            }
            zzg("Activity context is not ready, cannot get window or decor view.");
        }
    }
}
