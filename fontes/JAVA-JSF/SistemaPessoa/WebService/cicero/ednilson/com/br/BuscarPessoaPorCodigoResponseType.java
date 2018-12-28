/**
 * BuscarPessoaPorCodigoResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cicero.ednilson.com.br;

public class BuscarPessoaPorCodigoResponseType  implements java.io.Serializable {
    private java.math.BigInteger codigo;

    private java.lang.String nome;

    private java.lang.String tipoPessoa;

    private java.util.Calendar dataCadasto;

    public BuscarPessoaPorCodigoResponseType() {
    }

    public BuscarPessoaPorCodigoResponseType(
           java.math.BigInteger codigo,
           java.lang.String nome,
           java.lang.String tipoPessoa,
           java.util.Calendar dataCadasto) {
           this.codigo = codigo;
           this.nome = nome;
           this.tipoPessoa = tipoPessoa;
           this.dataCadasto = dataCadasto;
    }


    /**
     * Gets the codigo value for this BuscarPessoaPorCodigoResponseType.
     * 
     * @return codigo
     */
    public java.math.BigInteger getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this BuscarPessoaPorCodigoResponseType.
     * 
     * @param codigo
     */
    public void setCodigo(java.math.BigInteger codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the nome value for this BuscarPessoaPorCodigoResponseType.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this BuscarPessoaPorCodigoResponseType.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the tipoPessoa value for this BuscarPessoaPorCodigoResponseType.
     * 
     * @return tipoPessoa
     */
    public java.lang.String getTipoPessoa() {
        return tipoPessoa;
    }


    /**
     * Sets the tipoPessoa value for this BuscarPessoaPorCodigoResponseType.
     * 
     * @param tipoPessoa
     */
    public void setTipoPessoa(java.lang.String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }


    /**
     * Gets the dataCadasto value for this BuscarPessoaPorCodigoResponseType.
     * 
     * @return dataCadasto
     */
    public java.util.Calendar getDataCadasto() {
        return dataCadasto;
    }


    /**
     * Sets the dataCadasto value for this BuscarPessoaPorCodigoResponseType.
     * 
     * @param dataCadasto
     */
    public void setDataCadasto(java.util.Calendar dataCadasto) {
        this.dataCadasto = dataCadasto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BuscarPessoaPorCodigoResponseType)) return false;
        BuscarPessoaPorCodigoResponseType other = (BuscarPessoaPorCodigoResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.tipoPessoa==null && other.getTipoPessoa()==null) || 
             (this.tipoPessoa!=null &&
              this.tipoPessoa.equals(other.getTipoPessoa()))) &&
            ((this.dataCadasto==null && other.getDataCadasto()==null) || 
             (this.dataCadasto!=null &&
              this.dataCadasto.equals(other.getDataCadasto())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getTipoPessoa() != null) {
            _hashCode += getTipoPessoa().hashCode();
        }
        if (getDataCadasto() != null) {
            _hashCode += getDataCadasto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BuscarPessoaPorCodigoResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("br.com.ednilson.cicero", ">BuscarPessoaPorCodigoResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("br.com.ednilson.cicero", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("br.com.ednilson.cicero", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPessoa");
        elemField.setXmlName(new javax.xml.namespace.QName("br.com.ednilson.cicero", "tipoPessoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCadasto");
        elemField.setXmlName(new javax.xml.namespace.QName("br.com.ednilson.cicero", "dataCadasto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
