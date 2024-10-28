package Seguimiento.controller;

import Seguimiento.model.Pedido;
import Seguimiento.model.Cliente; // Asegúrate de importar el modelo Cliente
import Seguimiento.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private ApiService apiService;

    // Metodo para manejar la vista de pedidos listos
    @GetMapping("/pedidosListos")
    public String getCompletedOrders(Model model) {
        List<Pedido> completedOrders = apiService.getCompletedOrders();
        model.addAttribute("completedOrders", completedOrders);
        return "pedidosListos";
    }

    // Metodo para manejar la vista de clientes
    @GetMapping("/clientes")
    public String getClientes(Model model) {
        List<Cliente> clientes = apiService.getAllClientes();
        model.addAttribute("clientes", clientes);
        return "clientes";
    }

    // Metodo para manejar la vista de pedidos por cliente
    @GetMapping("/pedidosPorCliente")
    public String getPedidosPorCliente(@RequestParam("clienteId") int clienteId, Model model) {
        List<Pedido> pedidosPorCliente = apiService.getPedidosByClienteId(clienteId);
        model.addAttribute("pedidos", pedidosPorCliente);
        return "pedidosPorCliente";
    }

    // Metodo para la página de inicio
    @GetMapping
    public String home(Model model) {
        List<Pedido> allPedidos = apiService.getAllPedidos(); // Obtener todos los pedidos si es necesario
        List<Cliente> allClientes = apiService.getAllClientes(); // Obtener todos los clientes si es necesario
        model.addAttribute("pedidos", allPedidos);
        model.addAttribute("clientes", allClientes);
        return "index";
    }
}
