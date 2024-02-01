package com.djl.springeccomerce.service;
import com.djl.springeccomerce.model.Producto;
import java.util.Optional;

public interface ProductoService  {
    public Producto save(Producto producto);
    //Verificar si el objeto  que vayamos a llamar de la BB_DD exite o no
    public Optional<Producto> get(Integer id);
    public void update(Producto producto);
    public void delete (Integer id);


}
