package pc;

/* JADX INFO: compiled from: CastDataConverter.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements b {
    @Override // pc.b
    public String a(Object obj, String str) {
        return obj instanceof String ? (String) obj : str;
    }

    @Override // pc.b
    public Boolean d(Object obj, Boolean bool) {
        return obj instanceof Boolean ? (Boolean) obj : bool;
    }

    @Override // pc.b
    public Integer i(Object obj, Integer num) {
        return obj instanceof Integer ? (Integer) obj : num;
    }

    @Override // pc.b
    public Float j(Object obj, Float f10) {
        return obj instanceof Float ? (Float) obj : f10;
    }

    @Override // pc.b
    public Double l(Object obj, Double d10) {
        return obj instanceof Double ? (Double) obj : d10;
    }
}
