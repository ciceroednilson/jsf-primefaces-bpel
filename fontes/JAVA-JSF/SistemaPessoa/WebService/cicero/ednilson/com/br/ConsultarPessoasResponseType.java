/**
 * ConsultarPessoasResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cicero.ednilson.com.br;

public class ConsultarPessoasResponseType  implements java.io.Serializable {
    private cicero.ednilson.com.br.PessoaType[] listaPessoas;

    public ConsultarPessoasResponseType() {
    }

    public ConsultarPessoasResponseType(
           cicero.ednilson.com.br.PessoaType[] listaPessoas) {
           this.listaPessoas = listaPessoas;
    }


    /**
     * Gets the listaPessoas value for this ConsultarPessoasResponseType.
     * 
     * @return listaPessoas
     */
    public cicero.ednilson.com.br.PessoaType[] getListaPessoas() {
        return listaPessoas;
    }


    /**
     * Sets the listaPessoas value for this ConsultarPessoasResponseType.
     * 
     * @param listaPessoas
     */
    public void setListaPessoas(cicero.ednilson.com.br.PessoaType[] listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarPessoasResponseType)) return false;
        ConsultarPessoasResponseType other = (ConsultarPessoasResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listaPessoas==null && other.getListaPessoas()==null) || 
             (this.listaPessoas!=null &&
              java.util.Arrays.equals(this.listaPessoas, other.getListaPessoas())));
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
        if (getListaPessoas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaPessoas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaPessoas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarPessoasResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("br.com.ednilson.cicero", ">ConsultarPessoasResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaPessoas");
        elemField.setXmlName(new javax.xml.namespace.QName("br.com.ednilson.cicero", "ListaPessoas"));
        elemField.setXmlType(new javax.xml.namespace.QName("br.com.ednilson.cicero", "pessoaType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("br.com.ednilson.cicero", "ItemPessoa"));
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
