
package co.gov.colpensiones.schemas.consultaestadotramite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Estado" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tramite" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CodSubtramite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NomSubtramite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FechaEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroRadicado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaRadicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoEstadoEspecifico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreEstadoEspecifico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstadoHomologado" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tiempos" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TiempoLimiteRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TipoTiempoLimite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FechaLimiteRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Error" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "estado",
    "tramite",
    "fechaEstado",
    "numeroRadicado",
    "fechaRadicacion",
    "codigoEstadoEspecifico",
    "nombreEstadoEspecifico",
    "estadoHomologado",
    "tiempos",
    "error"
})
@XmlRootElement(name = "ConsultaEstadoTramiteResponse")
public class ConsultaEstadoTramiteResponse {

    @XmlElement(name = "Estado")
    protected ConsultaEstadoTramiteResponse.Estado estado;
    @XmlElement(name = "Tramite")
    protected ConsultaEstadoTramiteResponse.Tramite tramite;
    @XmlElement(name = "FechaEstado")
    protected String fechaEstado;
    @XmlElement(name = "NumeroRadicado")
    protected String numeroRadicado;
    @XmlElement(name = "FechaRadicacion")
    protected String fechaRadicacion;
    @XmlElement(name = "CodigoEstadoEspecifico")
    protected String codigoEstadoEspecifico;
    @XmlElement(name = "NombreEstadoEspecifico")
    protected String nombreEstadoEspecifico;
    @XmlElement(name = "EstadoHomologado")
    protected ConsultaEstadoTramiteResponse.EstadoHomologado estadoHomologado;
    @XmlElement(name = "Tiempos")
    protected ConsultaEstadoTramiteResponse.Tiempos tiempos;
    @XmlElement(name = "Error")
    protected ConsultaEstadoTramiteResponse.Error error;

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaEstadoTramiteResponse.Estado }
     *     
     */
    public ConsultaEstadoTramiteResponse.Estado getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaEstadoTramiteResponse.Estado }
     *     
     */
    public void setEstado(ConsultaEstadoTramiteResponse.Estado value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad tramite.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaEstadoTramiteResponse.Tramite }
     *     
     */
    public ConsultaEstadoTramiteResponse.Tramite getTramite() {
        return tramite;
    }

    /**
     * Define el valor de la propiedad tramite.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaEstadoTramiteResponse.Tramite }
     *     
     */
    public void setTramite(ConsultaEstadoTramiteResponse.Tramite value) {
        this.tramite = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEstado() {
        return fechaEstado;
    }

    /**
     * Define el valor de la propiedad fechaEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEstado(String value) {
        this.fechaEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroRadicado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRadicado() {
        return numeroRadicado;
    }

    /**
     * Define el valor de la propiedad numeroRadicado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRadicado(String value) {
        this.numeroRadicado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRadicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRadicacion() {
        return fechaRadicacion;
    }

    /**
     * Define el valor de la propiedad fechaRadicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRadicacion(String value) {
        this.fechaRadicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEstadoEspecifico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstadoEspecifico() {
        return codigoEstadoEspecifico;
    }

    /**
     * Define el valor de la propiedad codigoEstadoEspecifico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstadoEspecifico(String value) {
        this.codigoEstadoEspecifico = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEstadoEspecifico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEstadoEspecifico() {
        return nombreEstadoEspecifico;
    }

    /**
     * Define el valor de la propiedad nombreEstadoEspecifico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEstadoEspecifico(String value) {
        this.nombreEstadoEspecifico = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoHomologado.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaEstadoTramiteResponse.EstadoHomologado }
     *     
     */
    public ConsultaEstadoTramiteResponse.EstadoHomologado getEstadoHomologado() {
        return estadoHomologado;
    }

    /**
     * Define el valor de la propiedad estadoHomologado.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaEstadoTramiteResponse.EstadoHomologado }
     *     
     */
    public void setEstadoHomologado(ConsultaEstadoTramiteResponse.EstadoHomologado value) {
        this.estadoHomologado = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempos.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaEstadoTramiteResponse.Tiempos }
     *     
     */
    public ConsultaEstadoTramiteResponse.Tiempos getTiempos() {
        return tiempos;
    }

    /**
     * Define el valor de la propiedad tiempos.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaEstadoTramiteResponse.Tiempos }
     *     
     */
    public void setTiempos(ConsultaEstadoTramiteResponse.Tiempos value) {
        this.tiempos = value;
    }

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaEstadoTramiteResponse.Error }
     *     
     */
    public ConsultaEstadoTramiteResponse.Error getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaEstadoTramiteResponse.Error }
     *     
     */
    public void setError(ConsultaEstadoTramiteResponse.Error value) {
        this.error = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codigo",
        "descripcion"
    })
    public static class Error {

        @XmlElement(name = "Codigo")
        protected String codigo;
        @XmlElement(name = "Descripcion")
        protected String descripcion;

        /**
         * Obtiene el valor de la propiedad codigo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigo() {
            return codigo;
        }

        /**
         * Define el valor de la propiedad codigo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigo(String value) {
            this.codigo = value;
        }

        /**
         * Obtiene el valor de la propiedad descripcion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescripcion() {
            return descripcion;
        }

        /**
         * Define el valor de la propiedad descripcion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescripcion(String value) {
            this.descripcion = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codigo",
        "descripcion"
    })
    public static class Estado {

        @XmlElement(name = "Codigo", required = true)
        protected String codigo;
        @XmlElement(name = "Descripcion", required = true)
        protected String descripcion;

        /**
         * Obtiene el valor de la propiedad codigo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigo() {
            return codigo;
        }

        /**
         * Define el valor de la propiedad codigo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigo(String value) {
            this.codigo = value;
        }

        /**
         * Obtiene el valor de la propiedad descripcion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescripcion() {
            return descripcion;
        }

        /**
         * Define el valor de la propiedad descripcion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescripcion(String value) {
            this.descripcion = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nombre",
        "descripcion",
        "codigo"
    })
    public static class EstadoHomologado {

        @XmlElement(name = "Nombre")
        protected String nombre;
        @XmlElement(name = "Descripcion")
        protected String descripcion;
        @XmlElement(name = "Codigo")
        protected String codigo;

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad descripcion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescripcion() {
            return descripcion;
        }

        /**
         * Define el valor de la propiedad descripcion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescripcion(String value) {
            this.descripcion = value;
        }

        /**
         * Obtiene el valor de la propiedad codigo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigo() {
            return codigo;
        }

        /**
         * Define el valor de la propiedad codigo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigo(String value) {
            this.codigo = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TiempoLimiteRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TipoTiempoLimite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FechaLimiteRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tiempoLimiteRespuesta",
        "tipoTiempoLimite",
        "fechaLimiteRespuesta"
    })
    public static class Tiempos {

        @XmlElement(name = "TiempoLimiteRespuesta")
        protected String tiempoLimiteRespuesta;
        @XmlElement(name = "TipoTiempoLimite")
        protected String tipoTiempoLimite;
        @XmlElement(name = "FechaLimiteRespuesta")
        protected String fechaLimiteRespuesta;

        /**
         * Obtiene el valor de la propiedad tiempoLimiteRespuesta.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTiempoLimiteRespuesta() {
            return tiempoLimiteRespuesta;
        }

        /**
         * Define el valor de la propiedad tiempoLimiteRespuesta.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTiempoLimiteRespuesta(String value) {
            this.tiempoLimiteRespuesta = value;
        }

        /**
         * Obtiene el valor de la propiedad tipoTiempoLimite.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoTiempoLimite() {
            return tipoTiempoLimite;
        }

        /**
         * Define el valor de la propiedad tipoTiempoLimite.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoTiempoLimite(String value) {
            this.tipoTiempoLimite = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaLimiteRespuesta.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaLimiteRespuesta() {
            return fechaLimiteRespuesta;
        }

        /**
         * Define el valor de la propiedad fechaLimiteRespuesta.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaLimiteRespuesta(String value) {
            this.fechaLimiteRespuesta = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CodSubtramite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NomSubtramite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codigo",
        "nombre",
        "codSubtramite",
        "nomSubtramite"
    })
    public static class Tramite {

        @XmlElement(name = "Codigo")
        protected String codigo;
        @XmlElement(name = "Nombre")
        protected String nombre;
        @XmlElement(name = "CodSubtramite")
        protected String codSubtramite;
        @XmlElement(name = "NomSubtramite")
        protected String nomSubtramite;

        /**
         * Obtiene el valor de la propiedad codigo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigo() {
            return codigo;
        }

        /**
         * Define el valor de la propiedad codigo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigo(String value) {
            this.codigo = value;
        }

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad codSubtramite.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodSubtramite() {
            return codSubtramite;
        }

        /**
         * Define el valor de la propiedad codSubtramite.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodSubtramite(String value) {
            this.codSubtramite = value;
        }

        /**
         * Obtiene el valor de la propiedad nomSubtramite.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomSubtramite() {
            return nomSubtramite;
        }

        /**
         * Define el valor de la propiedad nomSubtramite.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomSubtramite(String value) {
            this.nomSubtramite = value;
        }

		
		public String metodo() {
			return "Tramite [codigo=" + codigo + ", nombre=" + nombre + ", codSubtramite=" + codSubtramite
					+ ", nomSubtramite=" + nomSubtramite + "]";
		}
        
        
    }

}
