package edu.eci.cosw.jpa.sample.model;
// Generated Mar 9, 2016 7:01:57 AM by Hibernate Tools 4.3.1



/**
 * PolizasAprobadasId generated by hbm2java
 */
public class PolizasAprobadasId  implements java.io.Serializable {


     private int clientesId;
     private String clientesTipoId;
     private int polizasCodigoPoliza;

    public PolizasAprobadasId() {
    }

    public PolizasAprobadasId(int clientesId, String clientesTipoId, int polizasCodigoPoliza) {
       this.clientesId = clientesId;
       this.clientesTipoId = clientesTipoId;
       this.polizasCodigoPoliza = polizasCodigoPoliza;
    }
   
    public int getClientesId() {
        return this.clientesId;
    }
    
    public void setClientesId(int clientesId) {
        this.clientesId = clientesId;
    }
    public String getClientesTipoId() {
        return this.clientesTipoId;
    }
    
    public void setClientesTipoId(String clientesTipoId) {
        this.clientesTipoId = clientesTipoId;
    }
    public int getPolizasCodigoPoliza() {
        return this.polizasCodigoPoliza;
    }
    
    public void setPolizasCodigoPoliza(int polizasCodigoPoliza) {
        this.polizasCodigoPoliza = polizasCodigoPoliza;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PolizasAprobadasId) ) return false;
		 PolizasAprobadasId castOther = ( PolizasAprobadasId ) other; 
         
		 return (this.getClientesId()==castOther.getClientesId())
 && ( (this.getClientesTipoId()==castOther.getClientesTipoId()) || ( this.getClientesTipoId()!=null && castOther.getClientesTipoId()!=null && this.getClientesTipoId().equals(castOther.getClientesTipoId()) ) )
 && (this.getPolizasCodigoPoliza()==castOther.getPolizasCodigoPoliza());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getClientesId();
         result = 37 * result + ( getClientesTipoId() == null ? 0 : this.getClientesTipoId().hashCode() );
         result = 37 * result + this.getPolizasCodigoPoliza();
         return result;
   }   


}

