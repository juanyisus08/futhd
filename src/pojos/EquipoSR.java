package pojos;
public class EquipoSR {
    
int idEquipoSR;
String marcaSR;
String modeloSR;
int precioSR;

public EquipoSR (int idequipoSR, String marcaSR, String modeloSR, int precioSR) {
        this.idEquipoSR = idEquipoSR;
        this.marcaSR = marcaSR;
        this.modeloSR = modeloSR;
        this.precioSR = precioSR;
    }

    public EquipoSR() {
    }

    public int getIdEquipoSR() {
        return idEquipoSR;
    }

    public void setIdEquipoSR(int idEquipoSR) {
        this.idEquipoSR = idEquipoSR;
    }

    public String getMarcaSR() {
        return marcaSR;
    }

    public void setMarcaSR(String marcaSR) {
        this.marcaSR = marcaSR;
    }

    public String getModeloSR() {
        return modeloSR;
    }

    public void setModeloSR(String modeloSR) {
        this.modeloSR = modeloSR;
    }

    public int getPrecioSR() {
        return precioSR;
    }

    public void setPrecioSR(int precioSR) {
        this.precioSR = precioSR;
    }

  

}
