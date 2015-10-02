
package ar.gob.ambiente.servicios.clienterest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase que encapsula la información perteneciente a las Empresas de transporte de Residuos Peligrosos
 * @author rincostante
 */
@XmlRootElement(name = "Empresa")
public class Empresa implements Serializable{
    
    private static final long serialVersionUID = 1L;
    /**
     * Cuit de la Empresa no debe repetirse
     */
    private Long cuit;
    
    /**
     * Razón social por la cual es conocida la Empresa
     */
    private String razonSocial;
    
    /**
     * Cadena que especifica tipo de transporte realizado por la empresa
     */
    private String tipoTransportista;
    
    /**
     * Categoría del transporte realizado por la Empresa
     */
    private String categoria;
    
    /**
     * Listado de códigos de tipo String, ej: "CMG" 
     */
    private ArrayList<String> codigosCategorias;
    
    /**
     * Domicilio Postal de la Empresa. Calle y número.
     */
    private String direccion;
    
    /**
     * Nombre de la localidad Postal de donde está afincada la Empresa.
     */
    private String localidad;
    
    /**
     * Nombre de la Provincia donde está afincada la Empresa
     */
    private String provincia;
    
    /**
     * Código del país al que la Empresa pertenece
     */
    private String paisCodigo;
    
    /**
     * Número telefónico de contacto
     */
    private String telefono;
    
    /**
     * correo electrónico del contacto
     */
    private String email;
    
    /**
     * True si esta declarado que realiza cargas peligrosas
     */
    private boolean cargasPeligrosas;
    
    /**
     * Versión del servicio web
     */
    private String versionWS;
    
    /*******************
     * Geters y Seters *
     *******************/
    
    public Long getCuit() {
        return cuit;
    }

    public void setCuit(Long cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTipoTransportista() {
        return tipoTransportista;
    }

    public void setTipoTransportista(String tipoTransportista) {
        this.tipoTransportista = tipoTransportista;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getCodigosCategorias() {
        return codigosCategorias;
    }

    public void setCodigosCategorias(ArrayList<String> codigosCategorias) {
        this.codigosCategorias = codigosCategorias;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPaisCodigo() {
        return paisCodigo;
    }

    public void setPaisCodigo(String paisCodigo) {
        this.paisCodigo = paisCodigo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isCargasPeligrosas() {
        return cargasPeligrosas;
    }

    public void setCargasPeligrosas(boolean cargasPeligrosas) {
        this.cargasPeligrosas = cargasPeligrosas;
    }

    public String getVersionWS() {
        return versionWS;
    }

    public void setVersionWS(String versionWS) {
        this.versionWS = versionWS;
    }
    
    
    /*************************
     * Métodos sobreescritos *
     *************************/    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cuit != null ? cuit.hashCode() : 0);
        return hash;
    }    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.cuit, other.cuit)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "ar.gob.ambiente.servicios.clienteruta.model.Empresa[ cuit=" + cuit + " ]";
    }    
}
