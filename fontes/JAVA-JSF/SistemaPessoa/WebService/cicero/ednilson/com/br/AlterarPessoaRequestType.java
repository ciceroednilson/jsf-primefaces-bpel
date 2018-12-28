/**
 * AlterarPessoaRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cicero.ednilson.com.br;

public class AlterarPessoaRequestType  implements java.io.Serializable {
    private java.math.BigInteger codigoPessoa;

    private java.lang.String nomePessoa;

    private java.lang.String tipoPessoa;

    public AlterarPessoaRequestType() {
    }

    public AlterarPessoaRequestType(
           java.math.BigInteger codigoPessoa,
           java.lang.String nomePessoa,
           java.lang.String tipoPessoa) {
           this.codigoPessoa = codigoPessoa;
           this.nomePessoa = nomePessoa;
           this.tipoPessoa = tipoPessoa;
    }


    /**
     * Gets the codigoPessoa value for this AlterarPessoaRequestType.
     * 
     * @return codigoPessoa
     */
    public java.math.BigInteger getCodigoPessoa() {
        return codigoPessoa;
    }


    /**
     * Sets the codigoPessoa value for this AlterarPessoaRequestType.
     * 
     * @param codigoPessoa
     */
    public void setCodigoPessoa(java.math.BigInteger codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
    }


    /**
     * Gets the nomePessoa value for this AlterarPessoaRequestType.
     * 
     * @return nomePessoa
     */
    public java.lang.String getNomePessoa() {
        return nomePessoa;
    }


    /**
     * Sets the nomePessoa value for this AlterarPessoaRequestType.
     * 
     * @param nomePessoa
     */
    public void setNomePessoa(java.lang.String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }


    /**
     * Gets the tipoPessoa value for this AlterarPessoaRequestType.
     * 
     * @return tipoPessoa
     */
    public java.lang.String getTipoPessoa() {
        return tipoPessoa;
    }


    /**
     * Sets the tipoPessoa value for this AlterarPessoaRequestType.
     * 
     * @param tipoPessoa
     */
    public void setTipoPessoa(java.lang.String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlterarPessoaRequestType)) return false;
        AlterarPessoaRequestType other = (AlterarPessoaRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoPessoa==null && other.getCodigoPessoa()==null) || 
             (this.codigoPessoa!=null &&
              this.codigoPessoa.equals(other.getCodigoPessoa()))) &&
            ((this.nomePessoa==null && other.getNomePessoa()==null) || 
             (this.nomePessoa!=null &&
              this.nomePessoa.equals(other.getNomePessoa()))) &&
            ((this.tipoPessoa==null && other.getTipoPessoa()==null) || 
             (this.tipoPessoa!=null &&
              this.tipoPessoa.equals(other.getTipoPessoa())));
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
        if (getCodigoPessoa() != null) {
            _hashCode += getCodigoPessoa().hashCode();
        }
        if (getNomePessoa() != null) {
            _hashCode += getNomePessoa().hashCode();
        }
        if (getTipoPessoa() != null) {
            _hashCode += getTipoPessoa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlterarPessoaRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("br.com.ednilson.cicero", ">AlterarPessoaRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPessoa");
        elemField.setXmlName(new javax.xml.namespace.QName("br.com.ednilson.cicero", "codigoPessoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomePessoa");
        elemField.setXmlName(new javax.xml.namespace.QName("br.com.ednilson.cicero", "nomePessoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPessoa");
        elemField.setXmlName(new javax.xml.namespace.QName("br.com.ednilson.cicero", "tipoPessoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
