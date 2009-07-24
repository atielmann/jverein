/**********************************************************************
 * $Source$
 * $Revision$
 * $Date$
 * $Author$
 *
 * Copyright (c) by Heiner Jostkleigrewe
 * All rights reserved
 * heiner@jverein.de
 * www.jverein.de
 * $Log$
 **********************************************************************/
package de.jost_net.JVerein.gui.boxes;

import java.rmi.RemoteException;

import org.eclipse.swt.widgets.Composite;

import de.jost_net.JVerein.JVereinPlugin;
import de.jost_net.JVerein.gui.parts.AktuelleGeburtstageList;
import de.willuhn.jameica.gui.boxes.AbstractBox;
import de.willuhn.jameica.gui.boxes.Box;

public class AktuelleGeburtstage extends AbstractBox implements Box
{
  public AktuelleGeburtstage()
  {
    super();
  }

  public String getName()
  {
    return JVereinPlugin.getI18n().tr("JVerein: Aktuelle Geburtstage");
  }

  public int getDefaultIndex()
  {
    return 3;
  }

  public boolean getDefaultEnabled()
  {
    return false;
  }

  public void paint(Composite parent) throws RemoteException
  {
    new AktuelleGeburtstageList()
        .getAktuelleGeburtstageList().paint(parent);
  }

  public boolean isActive()
  {
    return super.isActive();
  }

  public int getHeight()
  {
    return 180;
  }

}