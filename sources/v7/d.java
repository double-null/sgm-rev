package v7;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import x7.k;
import x7.l0;
import x7.r;

/* JADX INFO: compiled from: AudioManagerCompat.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AudioManager f27220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f27221b;

    public static int b(AudioManager audioManager, a aVar) {
        return l0.f28136a >= 26 ? audioManager.abandonAudioFocusRequest(aVar.c()) : audioManager.abandonAudioFocus(aVar.f());
    }

    public static synchronized AudioManager c(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (f27221b != applicationContext) {
            f27220a = null;
        }
        AudioManager audioManager = f27220a;
        if (audioManager != null) {
            return audioManager;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
            final k kVar = new k();
            x7.b.a().execute(new Runnable() { // from class: v7.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.h(applicationContext, kVar);
                }
            });
            kVar.b();
            return (AudioManager) x7.a.e(f27220a);
        }
        AudioManager audioManager2 = (AudioManager) applicationContext.getSystemService("audio");
        f27220a = audioManager2;
        return (AudioManager) x7.a.e(audioManager2);
    }

    public static int d(AudioManager audioManager, int i10) {
        return audioManager.getStreamMaxVolume(i10);
    }

    public static int e(AudioManager audioManager, int i10) {
        if (l0.f28136a >= 28) {
            return audioManager.getStreamMinVolume(i10);
        }
        return 0;
    }

    public static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            r.i("AudioManagerCompat", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public static boolean g(AudioManager audioManager, int i10) {
        if (l0.f28136a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return f(audioManager, i10) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Context context, k kVar) {
        f27220a = (AudioManager) context.getSystemService("audio");
        kVar.e();
    }

    public static int i(AudioManager audioManager, a aVar) {
        return l0.f28136a >= 26 ? audioManager.requestAudioFocus(aVar.c()) : audioManager.requestAudioFocus(aVar.f(), aVar.b().b(), aVar.e());
    }
}
