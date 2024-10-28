package Seguimiento.repository;

import Seguimiento.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    List<Pedido> findByEstadoPedidoId(int estadoPedidoId);

    // Metodo para buscar pedidos por cliente
    List<Pedido> findByClienteId(int clienteId);
}
