package org.openrtk.idl.epp02;


/**
* org/openrtk/idl/epp/epp_LogoutReq.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from epp.idl
* Thursday, July 26, 2001 6:26:04 PM EDT
*/


//////////////
public class epp_LogoutReq implements org.omg.CORBA.portable.IDLEntity
{
  public org.openrtk.idl.epp02.epp_Unspec m_unspec = null;
  public String m_client_trid = null;

  public epp_LogoutReq ()
  {
  } // ctor

  public epp_LogoutReq (org.openrtk.idl.epp02.epp_Unspec _m_unspec, String _m_client_trid)
  {
    m_unspec = _m_unspec;
    m_client_trid = _m_client_trid;
  } // ctor

  public void setUnspec(org.openrtk.idl.epp02.epp_Unspec value) { m_unspec = value; }
  public org.openrtk.idl.epp02.epp_Unspec getUnspec() { return m_unspec; }

  public void setClientTrid(String value) { m_client_trid = value; }
  public String getClientTrid() { return m_client_trid; }

  public String toString() { return this.getClass().getName() + ": { m_unspec ["+m_unspec+"] m_client_trid ["+m_client_trid+"] }"; }

} // class epp_LogoutReq