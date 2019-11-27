package GenericsSiniflar3;
public interface Islemler<T> {

public boolean kaydet(T t);
public boolean sil(T t);
public void listele();
}
