package org.openrtk.idl.epp02;


/**
* org/openrtk/idl/epp/epp_TransferOpType.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from epp.idl
* Thursday, July 26, 2001 6:26:03 PM EDT
*/


//
public class epp_TransferOpType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 5;
  private static org.openrtk.idl.epp02.epp_TransferOpType[] __array = new org.openrtk.idl.epp02.epp_TransferOpType [__size];

  public static final int _APPROVE = 0;
  public static final org.openrtk.idl.epp02.epp_TransferOpType APPROVE = new org.openrtk.idl.epp02.epp_TransferOpType(_APPROVE);
  public static final int _CANCEL = 1;
  public static final org.openrtk.idl.epp02.epp_TransferOpType CANCEL = new org.openrtk.idl.epp02.epp_TransferOpType(_CANCEL);
  public static final int _QUERY = 2;
  public static final org.openrtk.idl.epp02.epp_TransferOpType QUERY = new org.openrtk.idl.epp02.epp_TransferOpType(_QUERY);
  public static final int _REJECT = 3;
  public static final org.openrtk.idl.epp02.epp_TransferOpType REJECT = new org.openrtk.idl.epp02.epp_TransferOpType(_REJECT);
  public static final int _REQUEST = 4;
  public static final org.openrtk.idl.epp02.epp_TransferOpType REQUEST = new org.openrtk.idl.epp02.epp_TransferOpType(_REQUEST);

  public int value ()
  {
    return __value;
  }

  public static org.openrtk.idl.epp02.epp_TransferOpType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected epp_TransferOpType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class epp_TransferOpType
