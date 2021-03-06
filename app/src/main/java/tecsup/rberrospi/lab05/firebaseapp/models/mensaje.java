package tecsup.rberrospi.lab05.firebaseapp.models;

public class mensaje {

    private String mensaje;
    private String nombre;
    private String urlFoto;
    private String type_mensaje;

    public mensaje() {
    }

    public mensaje(String mensaje, String nombre, String type_mensaje) {
        this.mensaje = mensaje;
        this.nombre = nombre;
        this.type_mensaje = type_mensaje;
    }

    public mensaje(String mensaje, String nombre, String urlFoto, String type_mensaje) {
        this.mensaje = mensaje;
        this.nombre = nombre;
        this.urlFoto = urlFoto;
        this.type_mensaje = type_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getType_mensaje() {
        return type_mensaje;
    }

    public void setType_mensaje(String type_mensaje) {
        this.type_mensaje = type_mensaje;
    }
}
