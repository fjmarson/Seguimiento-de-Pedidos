package Seguimiento.repository;

import Seguimiento.model.EstadoPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoPedidoRepository extends JpaRepository<EstadoPedido, Integer> {
    // Metodo para encontrar un EstadoPedido por su nombre
    EstadoPedido findByNombreEstado(String nombreEstado);
}
