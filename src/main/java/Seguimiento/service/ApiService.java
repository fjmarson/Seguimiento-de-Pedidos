package Seguimiento.service;

import Seguimiento.model.Cliente;
import Seguimiento.model.Pedido;
import Seguimiento.repository.ClienteRepository;
import Seguimiento.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    // Metodo para obtener pedidos completados
    public List<Pedido> getCompletedOrders() {
        int estadoPedidoId = 2; // El id correspondiente a "Pedido completado"
        return pedidoRepository.findByEstadoPedidoId(estadoPedidoId);
    }

    // Metodo para obtener todos los clientes
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll(); // Este método debería estar en tu repositorio
    }

    // Metodo para obtener todos los pedidos
    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll(); // Agregado para obtener todos los pedidos
    }

    // Metodo para obtener pedidos por ID de cliente
    public List<Pedido> getPedidosByClienteId(int clienteId) {
        return pedidoRepository.findByClienteId(clienteId); // Este método debe estar en tu repositorio
    }
}
