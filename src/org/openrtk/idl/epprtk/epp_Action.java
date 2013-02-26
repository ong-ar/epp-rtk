/*
**
** EPP RTK Java
** Copyright (C) 2001-2002, Tucows, Inc.
** Copyright (C) 2003, Liberty RMS
**
**
** This library is free software; you can redistribute it and/or
** modify it under the terms of the GNU Lesser General Public
** License as published by the Free Software Foundation; either
** version 2.1 of the License, or (at your option) any later version.
**
** This library is distributed in the hope that it will be useful,
** but WITHOUT ANY WARRANTY; without even the implied warranty of
** MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
** Lesser General Public License for more details.
**
** You should have received a copy of the GNU Lesser General Public
** License along with this library; if not, write to the Free Software
** Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
**
*/

package org.openrtk.idl.epprtk;


/**
 * Internal IDL interface which is never referenced externally.</p>
 * The interface is extended by all the master external interfaces
 * for the EPP commands, and implemented by all the implementors of the
 * EPP commands.</p>
 * $Header: /cvsroot/epp-rtk/epp-rtk/java/src/org/openrtk/idl/epprtk/epp_Action.java,v 1.1 2004/12/07 15:27:49 ewang2004 Exp $<br>
 * $Revision: 1.1 $<br>
 * $Date: 2004/12/07 15:27:49 $<br>
 * @see org.openrtk.idl.epprtk.epp_Login
 */
public interface epp_Action extends epp_ActionOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
} // interface epp_Action
