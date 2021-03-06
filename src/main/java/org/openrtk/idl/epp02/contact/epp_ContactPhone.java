package org.openrtk.idl.epp02.contact;


/**
* org/openrtk/idl/epp/contact/epp_ContactPhone.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from epp_contact.idl
* Thursday, July 26, 2001 6:26:12 PM EDT
*/


// used for both m_voice and m_fax data members
public class epp_ContactPhone implements org.omg.CORBA.portable.IDLEntity
{
  public String m_extension = null;
  public String m_value = null;

  public epp_ContactPhone ()
  {
  } // ctor

  public epp_ContactPhone (String _m_extension, String _m_value)
  {
    m_extension = _m_extension;
    m_value = _m_value;
  } // ctor

  public void setExtension(String value) { m_extension = value; }
  public String getExtension() { return m_extension; }

  public void setValue(String value) { m_value = value; }
  public String getValue() { return m_value; }

  public String toString() { return this.getClass().getName() + ": { m_extension ["+m_extension+"] m_value ["+m_value+"] }"; }

} // class epp_ContactPhone
