/*******************************************************************************
 * Copyright (c) 2011 Sonatype Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sonatype Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.tycho.test.bug361722_rootLevelFeatures;

import java.util.Arrays;

import org.apache.maven.it.Verifier;
import org.eclipse.tycho.test.AbstractTychoIntegrationTest;
import org.eclipse.tycho.test.util.ResourceUtil;
import org.junit.Test;

public class RootLevelFeaturesTest extends AbstractTychoIntegrationTest {

    @Test
    public void test() throws Exception {
        Verifier verifier = getVerifier("/361722_root_level_features", false);
        verifier.getCliOptions().add("-De342-repo=" + ResourceUtil.P2Repositories.ECLIPSE_342.toString());
        verifier.executeGoals(Arrays.asList("clean", "install"));
        verifier.verifyErrorFreeLog();

        // assert repository contains corss-platform IUs defined in p2.inf files
//        Document doc;
//        ZipFile zip = new ZipFile(new File(verifier.getBasedir(), "product/target/repository/content.jar"));
//        try {
//            InputStream is = zip.getInputStream(zip.getEntry("content.xml"));
//            doc = new XMLParser().parse(new XMLIOSource(is));
//        } finally {
//            zip.close();
//        }
//
//        List<String> ids = new ArrayList<String>();
//        Element units = doc.getChild("repository/units");
//        for (Element unit : units.getChildren("unit")) {
//            ids.add(unit.getAttributeValue("id"));
//        }

        //disabled due to a limitation of BundlesAction
        //Assert.assertTrue(ids.contains("tychotest.bundle.macosx"));

        // disabled due to apparent bug in MirrorApplication or publisher
        // TODO requires further investigation
        //Assert.assertTrue(ids.contains("tychotest.feature.macosx"));
        //Assert.assertTrue(ids.contains("tychotest.product.macosx"));
    }
}
