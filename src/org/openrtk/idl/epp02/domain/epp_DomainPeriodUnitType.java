package org.openrtk.idl.epp02.domain;


/**
* org/openrtk/idl/epp/domain/epp_DomainPeriodUnitType.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from epp_domain.idl
* Thursday, July 26, 2001 6:26:07 PM EDT
*/

public class epp_DomainPeriodUnitType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static org.openrtk.idl.epp02.domain.epp_DomainPeriodUnitType[] __array = new org.openrtk.idl.epp02.domain.epp_DomainPeriodUnitType [__size];

  public static final int _YEAR = 0;
  public static final org.openrtk.idl.epp02.domain.epp_DomainPeriodUnitType YEAR = new org.openrtk.idl.epp02.domain.epp_DomainPeriodUnitType(_YEAR);
  public static final int _MONTH = 1;
  public static final org.openrtk.idl.epp02.domain.epp_DomainPeriodUnitType MONTH = new org.openrtk.idl.epp02.domain.epp_DomainPeriodUnitType(_MONTH);

  public int value ()
  {
    return __value;
  }

  public static org.openrtk.idl.epp02.domain.epp_DomainPeriodUnitType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected epp_DomainPeriodUnitType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class epp_DomainPeriodUnitType