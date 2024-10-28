package Seguimiento.model;

public class HomeViewModel {
    private String localhost;
    private String APIHost;
    private Integer clienteId;
    private Integer spvNro;

    // Getters y Setters
    public String getLocalhost() {
        return localhost;
    }

    public void setLocalhost(String localhost) {
        this.localhost = localhost;
    }

    public String getAPIHost() {
        return APIHost;
    }

    public void setAPIHost(String APIHost) {
        this.APIHost = APIHost;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getSpvNro() {
        return spvNro;
    }

    public void setSpvNro(Integer spvNro) {
        this.spvNro = spvNro;
    }
}
