package io.bidmachine;

import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 io.bidmachine.MediaAssetType, still in use, count: 1, list:
  (r0v0 io.bidmachine.MediaAssetType) from 0x0001: FILLED_NEW_ARRAY (r0v0 io.bidmachine.MediaAssetType), (r1v1 io.bidmachine.MediaAssetType) A[WRAPPED] (LINE:2) elemType: java.lang.Object
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class MediaAssetType {
    Icon,
    Image,
    Video,
    All;

    public static final List<MediaAssetType> DEFAULT = com.google.firebase.crashlytics.internal.common.m.a(new Object[]{new MediaAssetType(), new MediaAssetType()});

    static {
    }

    private MediaAssetType() {
        super(str, i);
    }

    public static boolean isAll(List<MediaAssetType> list) {
        return list.contains(All) || (list.contains(Icon) && list.contains(Image) && list.contains(Video));
    }

    public static MediaAssetType valueOf(String str) {
        return (MediaAssetType) Enum.valueOf(MediaAssetType.class, str);
    }

    public static MediaAssetType[] values() {
        return (MediaAssetType[]) $VALUES.clone();
    }
}
