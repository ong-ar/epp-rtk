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
 * Sub-interface epp_Session is implemented by EPPClient.
 * $Header: /cvsroot/epp-rtk/epp-rtk/java/src/org/openrtk/idl/epprtk/epp_SessionOperations.java,v 1.1 2004/12/07 15:27:49 ewang2004 Exp $<br>
 * $Revision: 1.1 $<br>
 * $Date: 2004/12/07 15:27:49 $<br>
 * @see org.openrtk.idl.epprtk.epp_Session
 */
public interface epp_SessionOperations 
{

  /**
   * Sends EPP command request to the server and retrieves the response.
   * Require some casting on the RTK user's part.
   * @param request The action to send to the registry
   * @return The EPP command response data
   * @throws epp_XMLException if any request data or response data is missing
   * @throws epp_Exception if a communication error occurs or if the server returns an error code
   * @see com.tucows.oxrs.epprtk.rtk.EPPClient
   */
  org.openrtk.idl.epprtk.epp_Action processAction (org.openrtk.idl.epprtk.epp_Action request) throws org.openrtk.idl.epprtk.epp_Exception, org.openrtk.idl.epprtk.epp_XMLException;

  /**
   * Sends raw XML to the server and returns the XML response.
   * This method is required by processAction().
   * @param request_xml The XML request String to send to the server.
   * @return The raw XML String response from the server.
   * @throws epp_XMLException if any request data or response data is missing
   * @throws epp_Exception if a communication error occurs
   * @see com.tucows.oxrs.epprtk.rtk.EPPClient
   */
  String processXML (String request_xml) throws org.openrtk.idl.epprtk.epp_Exception, org.openrtk.idl.epprtk.epp_XMLException;
} // interface epp_SessionOperations
