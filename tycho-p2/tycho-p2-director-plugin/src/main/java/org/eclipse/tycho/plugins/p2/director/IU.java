package org.eclipse.tycho.plugins.p2.director;

/*******************************************************************************
 * Copyright (c) 2010, 2011 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SAP AG - initial API and implementation
 *     Sonatype Inc. - ongoing development
 *******************************************************************************/
public class IU
{
    private String id;

    private String version;

    IU(String id, String version) {
        this.id = id;
        this.version = version;
    }

    public String getVersion()
    {
        return version;
    }

    public String getId()
    {
        return id;
    }
}
